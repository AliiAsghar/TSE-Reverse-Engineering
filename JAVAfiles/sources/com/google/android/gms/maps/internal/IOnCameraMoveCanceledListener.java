package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOnCameraMoveCanceledListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOnCameraMoveCanceledListener {
        static final int TRANSACTION_onCameraMoveCanceled = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOnCameraMoveCanceledListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener
            public void onCameraMoveCanceled() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
        }

        public static IOnCameraMoveCanceledListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
            if (queryLocalInterface instanceof IOnCameraMoveCanceledListener) {
                return (IOnCameraMoveCanceledListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                onCameraMoveCanceled();
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void onCameraMoveCanceled();
}
