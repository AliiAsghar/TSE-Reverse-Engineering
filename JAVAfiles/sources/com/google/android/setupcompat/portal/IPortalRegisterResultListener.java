package com.google.android.setupcompat.portal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IPortalRegisterResultListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements IPortalRegisterResultListener {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements IPortalRegisterResultListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.setupcompat.portal.IPortalRegisterResultListener");
            }

            @Override // com.google.android.setupcompat.portal.IPortalRegisterResultListener
            public void onResult(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.setupcompat.portal.IPortalRegisterResultListener");
        }

        public static IPortalRegisterResultListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.portal.IPortalRegisterResultListener");
            if (queryLocalInterface instanceof IPortalRegisterResultListener) {
                return (IPortalRegisterResultListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onResult(bundle);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void onResult(Bundle bundle);
}
