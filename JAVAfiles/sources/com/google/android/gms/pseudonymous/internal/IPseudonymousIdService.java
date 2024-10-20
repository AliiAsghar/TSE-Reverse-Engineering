package com.google.android.gms.pseudonymous.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.android.gms.pseudonymous.SessionZwiebackToken;
import com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IPseudonymousIdService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IPseudonymousIdService {
        static final int TRANSACTION_getLastResetWallTimeMs = 3;
        static final int TRANSACTION_getSessionZwiebackTokens = 4;
        static final int TRANSACTION_getToken = 1;
        static final int TRANSACTION_setSessionZwiebackTokens = 5;
        static final int TRANSACTION_setToken = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IPseudonymousIdService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdService
            public void getLastResetWallTimeMs(IPseudonymousIdCallbacks iPseudonymousIdCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPseudonymousIdCallbacks);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdService
            public void getSessionZwiebackTokens(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, List<String> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPseudonymousIdCallbacks);
                obtainAndWriteInterfaceToken.writeStringList(list);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdService
            public void getToken(IPseudonymousIdCallbacks iPseudonymousIdCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPseudonymousIdCallbacks);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdService
            public void setSessionZwiebackTokens(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, List<SessionZwiebackToken> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPseudonymousIdCallbacks);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdService
            public void setToken(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, PseudonymousIdToken pseudonymousIdToken) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPseudonymousIdCallbacks);
                iax.d(obtainAndWriteInterfaceToken, pseudonymousIdToken);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
        }

        public static IPseudonymousIdService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
            if (queryLocalInterface instanceof IPseudonymousIdService) {
                return (IPseudonymousIdService) queryLocalInterface;
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
                            IPseudonymousIdCallbacks asInterface = IPseudonymousIdCallbacks.Stub.asInterface(parcel.readStrongBinder());
                            ArrayList createTypedArrayList = parcel.createTypedArrayList(SessionZwiebackToken.CREATOR);
                            enforceNoDataAvail(parcel);
                            setSessionZwiebackTokens(asInterface, createTypedArrayList);
                        } else {
                            IPseudonymousIdCallbacks asInterface2 = IPseudonymousIdCallbacks.Stub.asInterface(parcel.readStrongBinder());
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            enforceNoDataAvail(parcel);
                            getSessionZwiebackTokens(asInterface2, createStringArrayList);
                        }
                    } else {
                        IPseudonymousIdCallbacks asInterface3 = IPseudonymousIdCallbacks.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        getLastResetWallTimeMs(asInterface3);
                    }
                } else {
                    IPseudonymousIdCallbacks asInterface4 = IPseudonymousIdCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    PseudonymousIdToken pseudonymousIdToken = (PseudonymousIdToken) iax.a(parcel, PseudonymousIdToken.CREATOR);
                    enforceNoDataAvail(parcel);
                    setToken(asInterface4, pseudonymousIdToken);
                }
            } else {
                IPseudonymousIdCallbacks asInterface5 = IPseudonymousIdCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getToken(asInterface5);
            }
            return true;
        }
    }

    @Deprecated
    void getLastResetWallTimeMs(IPseudonymousIdCallbacks iPseudonymousIdCallbacks);

    void getSessionZwiebackTokens(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, List<String> list);

    void getToken(IPseudonymousIdCallbacks iPseudonymousIdCallbacks);

    void setSessionZwiebackTokens(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, List<SessionZwiebackToken> list);

    void setToken(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, PseudonymousIdToken pseudonymousIdToken);
}
