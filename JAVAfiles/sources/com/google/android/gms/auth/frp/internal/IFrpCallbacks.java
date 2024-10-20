package com.google.android.gms.auth.frp.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.auth.frp.FrpUnlockResponse;
import com.google.android.gms.auth.frp.UnlockForWearResponse;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IFrpCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IFrpCallbacks {
        static final int TRANSACTION_onGetSnapshot = 1;
        static final int TRANSACTION_onIsChallengeRequired = 3;
        static final int TRANSACTION_onIsChallengeSupported = 2;
        static final int TRANSACTION_onUnlock = 5;
        static final int TRANSACTION_onUnlockedForWear = 4;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IFrpCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.frp.internal.IFrpCallbacks");
            }

            @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
            public void onGetSnapshot(Status status, FrpSnapshot frpSnapshot) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, frpSnapshot);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
            public void onIsChallengeRequired(Status status, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
            public void onIsChallengeSupported(Status status, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
            public void onUnlock(Status status, FrpUnlockResponse frpUnlockResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, frpUnlockResponse);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
            public void onUnlockedForWear(Status status, UnlockForWearResponse unlockForWearResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, unlockForWearResponse);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.frp.internal.IFrpCallbacks");
        }

        public static IFrpCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.frp.internal.IFrpCallbacks");
            if (queryLocalInterface instanceof IFrpCallbacks) {
                return (IFrpCallbacks) queryLocalInterface;
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
                            Status status = (Status) iax.a(parcel, Status.CREATOR);
                            FrpUnlockResponse frpUnlockResponse = (FrpUnlockResponse) iax.a(parcel, FrpUnlockResponse.CREATOR);
                            enforceNoDataAvail(parcel);
                            onUnlock(status, frpUnlockResponse);
                        } else {
                            Status status2 = (Status) iax.a(parcel, Status.CREATOR);
                            UnlockForWearResponse unlockForWearResponse = (UnlockForWearResponse) iax.a(parcel, UnlockForWearResponse.CREATOR);
                            enforceNoDataAvail(parcel);
                            onUnlockedForWear(status2, unlockForWearResponse);
                        }
                    } else {
                        Status status3 = (Status) iax.a(parcel, Status.CREATOR);
                        boolean g = iax.g(parcel);
                        enforceNoDataAvail(parcel);
                        onIsChallengeRequired(status3, g);
                    }
                } else {
                    Status status4 = (Status) iax.a(parcel, Status.CREATOR);
                    boolean g2 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    onIsChallengeSupported(status4, g2);
                }
            } else {
                Status status5 = (Status) iax.a(parcel, Status.CREATOR);
                FrpSnapshot frpSnapshot = (FrpSnapshot) iax.a(parcel, FrpSnapshot.CREATOR);
                enforceNoDataAvail(parcel);
                onGetSnapshot(status5, frpSnapshot);
            }
            return true;
        }
    }

    void onGetSnapshot(Status status, FrpSnapshot frpSnapshot);

    void onIsChallengeRequired(Status status, boolean z);

    void onIsChallengeSupported(Status status, boolean z);

    void onUnlock(Status status, FrpUnlockResponse frpUnlockResponse);

    void onUnlockedForWear(Status status, UnlockForWearResponse unlockForWearResponse);
}
