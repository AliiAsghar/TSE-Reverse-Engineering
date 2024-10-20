package com.google.android.gms.auth.frp;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IFrpService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IFrpService {
        static final int TRANSACTION_getSnapshot = 5;
        static final int TRANSACTION_isChallengeRequired = 1;
        static final int TRANSACTION_isChallengeSupported = 2;
        static final int TRANSACTION_unlockFactoryResetProtection = 3;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IFrpService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.frp.IFrpService");
            }

            @Override // com.google.android.gms.auth.frp.IFrpService
            public FrpSnapshot getSnapshot() {
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                FrpSnapshot frpSnapshot = (FrpSnapshot) iax.a(transactAndReadException, FrpSnapshot.CREATOR);
                transactAndReadException.recycle();
                return frpSnapshot;
            }

            @Override // com.google.android.gms.auth.frp.IFrpService
            public boolean isChallengeRequired() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.auth.frp.IFrpService
            public boolean isChallengeSupported() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.auth.frp.IFrpService
            public UnlockFactoryResetProtectionResponse unlockFactoryResetProtection(UnlockFactoryResetProtectionRequest unlockFactoryResetProtectionRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, unlockFactoryResetProtectionRequest);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                UnlockFactoryResetProtectionResponse unlockFactoryResetProtectionResponse = (UnlockFactoryResetProtectionResponse) iax.a(transactAndReadException, UnlockFactoryResetProtectionResponse.CREATOR);
                transactAndReadException.recycle();
                return unlockFactoryResetProtectionResponse;
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.frp.IFrpService");
        }

        public static IFrpService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.frp.IFrpService");
            if (queryLocalInterface instanceof IFrpService) {
                return (IFrpService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            return false;
                        }
                        FrpSnapshot snapshot = getSnapshot();
                        parcel2.writeNoException();
                        iax.e(parcel2, snapshot);
                    } else {
                        UnlockFactoryResetProtectionRequest unlockFactoryResetProtectionRequest = (UnlockFactoryResetProtectionRequest) iax.a(parcel, UnlockFactoryResetProtectionRequest.CREATOR);
                        enforceNoDataAvail(parcel);
                        UnlockFactoryResetProtectionResponse unlockFactoryResetProtection = unlockFactoryResetProtection(unlockFactoryResetProtectionRequest);
                        parcel2.writeNoException();
                        iax.e(parcel2, unlockFactoryResetProtection);
                    }
                } else {
                    boolean isChallengeSupported = isChallengeSupported();
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(isChallengeSupported ? 1 : 0);
                }
            } else {
                boolean isChallengeRequired = isChallengeRequired();
                parcel2.writeNoException();
                int i4 = iax.a;
                parcel2.writeInt(isChallengeRequired ? 1 : 0);
            }
            return true;
        }
    }

    FrpSnapshot getSnapshot();

    boolean isChallengeRequired();

    boolean isChallengeSupported();

    UnlockFactoryResetProtectionResponse unlockFactoryResetProtection(UnlockFactoryResetProtectionRequest unlockFactoryResetProtectionRequest);
}
