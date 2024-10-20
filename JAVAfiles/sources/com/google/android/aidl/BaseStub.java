package com.google.android.aidl;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.iax;
import defpackage.iay;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class BaseStub extends Binder implements IInterface {
    private static iay globalInterceptor;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseStub(String str) {
        attachInterface(this, str);
    }

    static synchronized void installTransactionInterceptorPackagePrivate(iay iayVar) {
        synchronized (BaseStub.class) {
            try {
                if (iayVar != null) {
                    if (globalInterceptor == null) {
                        globalInterceptor = iayVar;
                    } else {
                        throw new IllegalStateException("Duplicate TransactionInterceptor installation.");
                    }
                } else {
                    throw new IllegalArgumentException("null interceptor");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean routeToSuperOrEnforceInterface(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void enforceNoDataAvail(Parcel parcel) {
        iay iayVar = globalInterceptor;
        if (iayVar != null) {
            iayVar.a();
            return;
        }
        int i = iax.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        iay iayVar = globalInterceptor;
        if (iayVar == null) {
            return dispatchTransaction(i, parcel, parcel2, i2);
        }
        return iayVar.b();
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
