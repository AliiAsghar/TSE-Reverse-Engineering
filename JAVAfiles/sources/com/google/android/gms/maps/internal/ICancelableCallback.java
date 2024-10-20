package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ICancelableCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ICancelableCallback {
        static final int TRANSACTION_onCancel = 2;
        static final int TRANSACTION_onFinish = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ICancelableCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.ICancelableCallback");
            }

            @Override // com.google.android.gms.maps.internal.ICancelableCallback
            public void onCancel() {
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.ICancelableCallback
            public void onFinish() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.ICancelableCallback");
        }

        public static ICancelableCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICancelableCallback");
            if (queryLocalInterface instanceof ICancelableCallback) {
                return (ICancelableCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                onCancel();
            } else {
                onFinish();
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onCancel();

    void onFinish();
}
