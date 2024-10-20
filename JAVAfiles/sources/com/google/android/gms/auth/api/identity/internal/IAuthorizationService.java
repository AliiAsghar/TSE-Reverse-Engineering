package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.VerifyWithGoogleRequest;
import com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback;
import com.google.android.gms.auth.api.identity.internal.IVerifyWithGoogleCallback;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IAuthorizationService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IAuthorizationService {
        static final int TRANSACTION_authorize = 1;
        static final int TRANSACTION_verifyWithGoogle = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IAuthorizationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IAuthorizationService
            public void authorize(IAuthorizationCallback iAuthorizationCallback, AuthorizationRequest authorizationRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iAuthorizationCallback);
                iax.d(obtainAndWriteInterfaceToken, authorizationRequest);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IAuthorizationService
            public void verifyWithGoogle(IVerifyWithGoogleCallback iVerifyWithGoogleCallback, VerifyWithGoogleRequest verifyWithGoogleRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iVerifyWithGoogleCallback);
                iax.d(obtainAndWriteInterfaceToken, verifyWithGoogleRequest);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        }

        public static IAuthorizationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
            if (queryLocalInterface instanceof IAuthorizationService) {
                return (IAuthorizationService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                IVerifyWithGoogleCallback asInterface = IVerifyWithGoogleCallback.Stub.asInterface(parcel.readStrongBinder());
                VerifyWithGoogleRequest verifyWithGoogleRequest = (VerifyWithGoogleRequest) iax.a(parcel, VerifyWithGoogleRequest.CREATOR);
                enforceNoDataAvail(parcel);
                verifyWithGoogle(asInterface, verifyWithGoogleRequest);
            } else {
                IAuthorizationCallback asInterface2 = IAuthorizationCallback.Stub.asInterface(parcel.readStrongBinder());
                AuthorizationRequest authorizationRequest = (AuthorizationRequest) iax.a(parcel, AuthorizationRequest.CREATOR);
                enforceNoDataAvail(parcel);
                authorize(asInterface2, authorizationRequest);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void authorize(IAuthorizationCallback iAuthorizationCallback, AuthorizationRequest authorizationRequest);

    void verifyWithGoogle(IVerifyWithGoogleCallback iVerifyWithGoogleCallback, VerifyWithGoogleRequest verifyWithGoogleRequest);
}
