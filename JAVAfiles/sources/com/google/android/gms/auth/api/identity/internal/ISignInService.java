package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback;
import com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback;
import com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISignInService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISignInService {
        static final int TRANSACTION_beginSignIn = 1;
        static final int TRANSACTION_getPhoneNumberHintIntent = 4;
        static final int TRANSACTION_getSignInIntent = 3;
        static final int TRANSACTION_signOut = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISignInService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ISignInService
            public void beginSignIn(IBeginSignInCallback iBeginSignInCallback, BeginSignInRequest beginSignInRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iBeginSignInCallback);
                iax.d(obtainAndWriteInterfaceToken, beginSignInRequest);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ISignInService
            public void getPhoneNumberHintIntent(IGetPhoneNumberHintIntentCallback iGetPhoneNumberHintIntentCallback, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetPhoneNumberHintIntentCallback);
                iax.d(obtainAndWriteInterfaceToken, getPhoneNumberHintIntentRequest);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ISignInService
            public void getSignInIntent(IGetSignInIntentCallback iGetSignInIntentCallback, GetSignInIntentRequest getSignInIntentRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetSignInIntentCallback);
                iax.d(obtainAndWriteInterfaceToken, getSignInIntentRequest);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ISignInService
            public void signOut(IStatusCallback iStatusCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.ISignInService");
        }

        public static ISignInService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
            if (queryLocalInterface instanceof ISignInService) {
                return (ISignInService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return false;
                        }
                        IGetPhoneNumberHintIntentCallback asInterface = IGetPhoneNumberHintIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                        GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest = (GetPhoneNumberHintIntentRequest) iax.a(parcel, GetPhoneNumberHintIntentRequest.CREATOR);
                        String readString = parcel.readString();
                        enforceNoDataAvail(parcel);
                        getPhoneNumberHintIntent(asInterface, getPhoneNumberHintIntentRequest, readString);
                    } else {
                        IGetSignInIntentCallback asInterface2 = IGetSignInIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) iax.a(parcel, GetSignInIntentRequest.CREATOR);
                        enforceNoDataAvail(parcel);
                        getSignInIntent(asInterface2, getSignInIntentRequest);
                    }
                } else {
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    signOut(asInterface3, readString2);
                }
            } else {
                IBeginSignInCallback asInterface4 = IBeginSignInCallback.Stub.asInterface(parcel.readStrongBinder());
                BeginSignInRequest beginSignInRequest = (BeginSignInRequest) iax.a(parcel, BeginSignInRequest.CREATOR);
                enforceNoDataAvail(parcel);
                beginSignIn(asInterface4, beginSignInRequest);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void beginSignIn(IBeginSignInCallback iBeginSignInCallback, BeginSignInRequest beginSignInRequest);

    void getPhoneNumberHintIntent(IGetPhoneNumberHintIntentCallback iGetPhoneNumberHintIntentCallback, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str);

    void getSignInIntent(IGetSignInIntentCallback iGetSignInIntentCallback, GetSignInIntentRequest getSignInIntentRequest);

    void signOut(IStatusCallback iStatusCallback, String str);
}
