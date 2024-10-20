package com.google.android.gms.auth.firstparty.devicesignals;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IDeviceSignalsService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IDeviceSignalsService {
        static final int TRANSACTION_getLastSecureUnlockTime = 1;
        static final int TRANSACTION_getLockScreenSecureDuration = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IDeviceSignalsService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
            }

            @Override // com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService
            public long getLastSecureUnlockTime() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                long readLong = transactAndReadException.readLong();
                transactAndReadException.recycle();
                return readLong;
            }

            @Override // com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService
            public long getLockScreenSecureDuration() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                long readLong = transactAndReadException.readLong();
                transactAndReadException.recycle();
                return readLong;
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
        }

        public static IDeviceSignalsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
            if (queryLocalInterface instanceof IDeviceSignalsService) {
                return (IDeviceSignalsService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                long lockScreenSecureDuration = getLockScreenSecureDuration();
                parcel2.writeNoException();
                parcel2.writeLong(lockScreenSecureDuration);
            } else {
                long lastSecureUnlockTime = getLastSecureUnlockTime();
                parcel2.writeNoException();
                parcel2.writeLong(lastSecureUnlockTime);
            }
            return true;
        }
    }

    long getLastSecureUnlockTime();

    long getLockScreenSecureDuration();
}
