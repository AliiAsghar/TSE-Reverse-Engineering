package com.google.android.gms.fido.targetdevice.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.fido.targetdevice.TargetDirectTransferResult;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IStartDirectTransferCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IStartDirectTransferCallbacks {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IStartDirectTransferCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.targetdevice.internal.IStartDirectTransferCallbacks");
            }

            @Override // com.google.android.gms.fido.targetdevice.internal.IStartDirectTransferCallbacks
            public void onResult(TargetDirectTransferResult targetDirectTransferResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, targetDirectTransferResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.targetdevice.internal.IStartDirectTransferCallbacks");
        }

        public static IStartDirectTransferCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.targetdevice.internal.IStartDirectTransferCallbacks");
            if (queryLocalInterface instanceof IStartDirectTransferCallbacks) {
                return (IStartDirectTransferCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                TargetDirectTransferResult targetDirectTransferResult = (TargetDirectTransferResult) iax.a(parcel, TargetDirectTransferResult.CREATOR);
                enforceNoDataAvail(parcel);
                onResult(targetDirectTransferResult);
                return true;
            }
            return false;
        }
    }

    void onResult(TargetDirectTransferResult targetDirectTransferResult);
}
