package com.google.android.gms.auth.frp.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.frp.FrpUnlockRequest;
import com.google.android.gms.auth.frp.UnlockForWearRequest;
import com.google.android.gms.auth.frp.internal.IFrpCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IFactoryResetProtectionService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IFactoryResetProtectionService {
        static final int TRANSACTION_getSnapshot = 1;
        static final int TRANSACTION_isChallengeRequired = 3;
        static final int TRANSACTION_isChallengeSupported = 2;
        static final int TRANSACTION_unlock = 5;
        static final int TRANSACTION_unlockForWear = 4;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IFactoryResetProtectionService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.frp.internal.IFactoryResetProtectionService");
            }

            @Override // com.google.android.gms.auth.frp.internal.IFactoryResetProtectionService
            public void getSnapshot(IFrpCallbacks iFrpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFrpCallbacks);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFactoryResetProtectionService
            public void isChallengeRequired(IFrpCallbacks iFrpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFrpCallbacks);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFactoryResetProtectionService
            public void isChallengeSupported(IFrpCallbacks iFrpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFrpCallbacks);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFactoryResetProtectionService
            public void unlock(IFrpCallbacks iFrpCallbacks, FrpUnlockRequest frpUnlockRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFrpCallbacks);
                iax.d(obtainAndWriteInterfaceToken, frpUnlockRequest);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFactoryResetProtectionService
            public void unlockForWear(IFrpCallbacks iFrpCallbacks, UnlockForWearRequest unlockForWearRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFrpCallbacks);
                iax.d(obtainAndWriteInterfaceToken, unlockForWearRequest);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.frp.internal.IFactoryResetProtectionService");
        }

        public static IFactoryResetProtectionService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.frp.internal.IFactoryResetProtectionService");
            if (queryLocalInterface instanceof IFactoryResetProtectionService) {
                return (IFactoryResetProtectionService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return false;
                            }
                            IFrpCallbacks asInterface = IFrpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                            FrpUnlockRequest frpUnlockRequest = (FrpUnlockRequest) iax.a(parcel, FrpUnlockRequest.CREATOR);
                            enforceNoDataAvail(parcel);
                            unlock(asInterface, frpUnlockRequest);
                        } else {
                            IFrpCallbacks asInterface2 = IFrpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                            UnlockForWearRequest unlockForWearRequest = (UnlockForWearRequest) iax.a(parcel, UnlockForWearRequest.CREATOR);
                            enforceNoDataAvail(parcel);
                            unlockForWear(asInterface2, unlockForWearRequest);
                        }
                    } else {
                        IFrpCallbacks asInterface3 = IFrpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        isChallengeRequired(asInterface3);
                    }
                } else {
                    IFrpCallbacks asInterface4 = IFrpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    isChallengeSupported(asInterface4);
                }
            } else {
                IFrpCallbacks asInterface5 = IFrpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getSnapshot(asInterface5);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getSnapshot(IFrpCallbacks iFrpCallbacks);

    void isChallengeRequired(IFrpCallbacks iFrpCallbacks);

    void isChallengeSupported(IFrpCallbacks iFrpCallbacks);

    void unlock(IFrpCallbacks iFrpCallbacks, FrpUnlockRequest frpUnlockRequest);

    void unlockForWear(IFrpCallbacks iFrpCallbacks, UnlockForWearRequest unlockForWearRequest);
}
