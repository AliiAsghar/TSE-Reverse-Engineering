package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOnCameraMoveStartedListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOnCameraMoveStartedListener {
        static final int TRANSACTION_onCameraMoveStarted = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOnCameraMoveStartedListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnCameraMoveStartedListener
            public void onCameraMoveStarted(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
        }

        public static IOnCameraMoveStartedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
            if (queryLocalInterface instanceof IOnCameraMoveStartedListener) {
                return (IOnCameraMoveStartedListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                onCameraMoveStarted(readInt);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void onCameraMoveStarted(int i);
}
