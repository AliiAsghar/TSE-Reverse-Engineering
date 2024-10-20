package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.ISignInCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISignInService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISignInService {
        static final int TRANSACTION_revokeAccessFromGoogle = 103;
        static final int TRANSACTION_signOutFromGoogle = 102;
        static final int TRANSACTION_silentSignInToGoogle = 101;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISignInService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
            }

            @Override // com.google.android.gms.auth.api.signin.internal.ISignInService
            public void revokeAccessFromGoogle(ISignInCallbacks iSignInCallbacks, GoogleSignInOptions googleSignInOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iSignInCallbacks);
                iax.d(obtainAndWriteInterfaceToken, googleSignInOptions);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_revokeAccessFromGoogle, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.signin.internal.ISignInService
            public void signOutFromGoogle(ISignInCallbacks iSignInCallbacks, GoogleSignInOptions googleSignInOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iSignInCallbacks);
                iax.d(obtainAndWriteInterfaceToken, googleSignInOptions);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_signOutFromGoogle, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.signin.internal.ISignInService
            public void silentSignInToGoogle(ISignInCallbacks iSignInCallbacks, GoogleSignInOptions googleSignInOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iSignInCallbacks);
                iax.d(obtainAndWriteInterfaceToken, googleSignInOptions);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_silentSignInToGoogle, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.signin.internal.ISignInService");
        }

        public static ISignInService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
            if (queryLocalInterface instanceof ISignInService) {
                return (ISignInService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case TRANSACTION_silentSignInToGoogle /* 101 */:
                    ISignInCallbacks asInterface = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) iax.a(parcel, GoogleSignInOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    silentSignInToGoogle(asInterface, googleSignInOptions);
                    break;
                case TRANSACTION_signOutFromGoogle /* 102 */:
                    ISignInCallbacks asInterface2 = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GoogleSignInOptions googleSignInOptions2 = (GoogleSignInOptions) iax.a(parcel, GoogleSignInOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    signOutFromGoogle(asInterface2, googleSignInOptions2);
                    break;
                case TRANSACTION_revokeAccessFromGoogle /* 103 */:
                    ISignInCallbacks asInterface3 = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GoogleSignInOptions googleSignInOptions3 = (GoogleSignInOptions) iax.a(parcel, GoogleSignInOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    revokeAccessFromGoogle(asInterface3, googleSignInOptions3);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void revokeAccessFromGoogle(ISignInCallbacks iSignInCallbacks, GoogleSignInOptions googleSignInOptions);

    void signOutFromGoogle(ISignInCallbacks iSignInCallbacks, GoogleSignInOptions googleSignInOptions);

    void silentSignInToGoogle(ISignInCallbacks iSignInCallbacks, GoogleSignInOptions googleSignInOptions);
}
