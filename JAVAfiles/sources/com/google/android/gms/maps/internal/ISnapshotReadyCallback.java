package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISnapshotReadyCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISnapshotReadyCallback {
        static final int TRANSACTION_onSnapshotReady = 1;
        static final int TRANSACTION_onSnapshotReady2 = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISnapshotReadyCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            }

            @Override // com.google.android.gms.maps.internal.ISnapshotReadyCallback
            public void onSnapshotReady(Bitmap bitmap) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bitmap);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.ISnapshotReadyCallback
            public void onSnapshotReady2(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
        }

        public static ISnapshotReadyCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            if (queryLocalInterface instanceof ISnapshotReadyCallback) {
                return (ISnapshotReadyCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onSnapshotReady2(asInterface);
            } else {
                Bitmap bitmap = (Bitmap) iax.a(parcel, Bitmap.CREATOR);
                enforceNoDataAvail(parcel);
                onSnapshotReady(bitmap);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onSnapshotReady(Bitmap bitmap);

    void onSnapshotReady2(IObjectWrapper iObjectWrapper);
}
