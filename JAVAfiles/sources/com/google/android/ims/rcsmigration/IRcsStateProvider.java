package com.google.android.ims.rcsmigration;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IRcsStateProvider extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements IRcsStateProvider {
        static final int TRANSACTION_getRcsState = 1;
        static final int TRANSACTION_onMigrationComplete = 2;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements IRcsStateProvider {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsmigration.IRcsStateProvider");
            }

            @Override // com.google.android.ims.rcsmigration.IRcsStateProvider
            public RcsState getRcsState() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                RcsState rcsState = (RcsState) iax.a(transactAndReadException, RcsState.CREATOR);
                transactAndReadException.recycle();
                return rcsState;
            }

            @Override // com.google.android.ims.rcsmigration.IRcsStateProvider
            public void onMigrationComplete() {
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsmigration.IRcsStateProvider");
        }

        public static IRcsStateProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsmigration.IRcsStateProvider");
            if (queryLocalInterface instanceof IRcsStateProvider) {
                return (IRcsStateProvider) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                onMigrationComplete();
                parcel2.writeNoException();
            } else {
                RcsState rcsState = getRcsState();
                parcel2.writeNoException();
                iax.e(parcel2, rcsState);
            }
            return true;
        }
    }

    RcsState getRcsState();

    void onMigrationComplete();
}
