package com.google.android.gms.pseudonymous.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.android.gms.pseudonymous.SessionZwiebackToken;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IPseudonymousIdCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IPseudonymousIdCallbacks {
        static final int TRANSACTION_onGetLastResetWallTimeMs = 3;
        static final int TRANSACTION_onSessionZwiebackTokensRetrieved = 4;
        static final int TRANSACTION_onSetSessionZwiebackTokens = 5;
        static final int TRANSACTION_onSetToken = 2;
        static final int TRANSACTION_onTokenRetrieved = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IPseudonymousIdCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
            public void onGetLastResetWallTimeMs(Status status, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
            public void onSessionZwiebackTokensRetrieved(Status status, List<SessionZwiebackToken> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
            public void onSetSessionZwiebackTokens(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
            public void onSetToken(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
            public void onTokenRetrieved(Status status, PseudonymousIdToken pseudonymousIdToken) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, pseudonymousIdToken);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
        }

        public static IPseudonymousIdCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
            if (queryLocalInterface instanceof IPseudonymousIdCallbacks) {
                return (IPseudonymousIdCallbacks) queryLocalInterface;
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
                            enforceNoDataAvail(parcel);
                            onSetSessionZwiebackTokens(status);
                        } else {
                            Status status2 = (Status) iax.a(parcel, Status.CREATOR);
                            ArrayList createTypedArrayList = parcel.createTypedArrayList(SessionZwiebackToken.CREATOR);
                            enforceNoDataAvail(parcel);
                            onSessionZwiebackTokensRetrieved(status2, createTypedArrayList);
                        }
                    } else {
                        Status status3 = (Status) iax.a(parcel, Status.CREATOR);
                        long readLong = parcel.readLong();
                        enforceNoDataAvail(parcel);
                        onGetLastResetWallTimeMs(status3, readLong);
                    }
                } else {
                    Status status4 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSetToken(status4);
                }
            } else {
                Status status5 = (Status) iax.a(parcel, Status.CREATOR);
                PseudonymousIdToken pseudonymousIdToken = (PseudonymousIdToken) iax.a(parcel, PseudonymousIdToken.CREATOR);
                enforceNoDataAvail(parcel);
                onTokenRetrieved(status5, pseudonymousIdToken);
            }
            return true;
        }
    }

    void onGetLastResetWallTimeMs(Status status, long j);

    void onSessionZwiebackTokensRetrieved(Status status, List<SessionZwiebackToken> list);

    void onSetSessionZwiebackTokens(Status status);

    void onSetToken(Status status);

    void onTokenRetrieved(Status status, PseudonymousIdToken pseudonymousIdToken);
}
