package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISignInCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISignInCallbacks {
        static final int TRANSACTION_onAccessRevokedFromGoogle = 103;
        static final int TRANSACTION_onSignedOutFromGoogle = 102;
        static final int TRANSACTION_onSilentSignedInToGoogle = 101;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISignInCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
            }

            @Override // com.google.android.gms.auth.api.signin.internal.ISignInCallbacks
            public void onAccessRevokedFromGoogle(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onAccessRevokedFromGoogle, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.signin.internal.ISignInCallbacks
            public void onSignedOutFromGoogle(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onSignedOutFromGoogle, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.signin.internal.ISignInCallbacks
            public void onSilentSignedInToGoogle(GoogleSignInAccount googleSignInAccount, Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, googleSignInAccount);
                iax.d(obtainAndWriteInterfaceToken, status);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onSilentSignedInToGoogle, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        }

        public static ISignInCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
            if (queryLocalInterface instanceof ISignInCallbacks) {
                return (ISignInCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case TRANSACTION_onSilentSignedInToGoogle /* 101 */:
                    GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) iax.a(parcel, GoogleSignInAccount.CREATOR);
                    Status status = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSilentSignedInToGoogle(googleSignInAccount, status);
                    break;
                case TRANSACTION_onSignedOutFromGoogle /* 102 */:
                    Status status2 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSignedOutFromGoogle(status2);
                    break;
                case TRANSACTION_onAccessRevokedFromGoogle /* 103 */:
                    Status status3 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onAccessRevokedFromGoogle(status3);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onAccessRevokedFromGoogle(Status status);

    void onSignedOutFromGoogle(Status status);

    void onSilentSignedInToGoogle(GoogleSignInAccount googleSignInAccount, Status status);
}
