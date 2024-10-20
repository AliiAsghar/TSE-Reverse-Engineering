package com.google.android.gms.fido.fido2.internal.regular;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.fido.fido2.api.IBooleanCallback;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IFido2AppService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IFido2AppService {
        static final int TRANSACTION_getRegisterIntent = 1;
        static final int TRANSACTION_getSignIntent = 2;
        static final int TRANSACTION_isUserVerifyingPlatformAuthenticatorAvailable = 3;
        static final int TRANSACTION_isUserVerifyingPlatformAuthenticatorAvailableForCredential = 4;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IFido2AppService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
            }

            @Override // com.google.android.gms.fido.fido2.internal.regular.IFido2AppService
            public void getRegisterIntent(IFido2AppCallbacks iFido2AppCallbacks, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFido2AppCallbacks);
                iax.d(obtainAndWriteInterfaceToken, publicKeyCredentialCreationOptions);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.regular.IFido2AppService
            public void getSignIntent(IFido2AppCallbacks iFido2AppCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFido2AppCallbacks);
                iax.d(obtainAndWriteInterfaceToken, publicKeyCredentialRequestOptions);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.regular.IFido2AppService
            public void isUserVerifyingPlatformAuthenticatorAvailable(IBooleanCallback iBooleanCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iBooleanCallback);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.regular.IFido2AppService
            public void isUserVerifyingPlatformAuthenticatorAvailableForCredential(IBooleanCallback iBooleanCallback, String str, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iBooleanCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        }

        public static IFido2AppService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
            if (queryLocalInterface instanceof IFido2AppService) {
                return (IFido2AppService) queryLocalInterface;
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
                        IBooleanCallback asInterface = IBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                        String readString = parcel.readString();
                        byte[] createByteArray = parcel.createByteArray();
                        enforceNoDataAvail(parcel);
                        isUserVerifyingPlatformAuthenticatorAvailableForCredential(asInterface, readString, createByteArray);
                    } else {
                        IBooleanCallback asInterface2 = IBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        isUserVerifyingPlatformAuthenticatorAvailable(asInterface2);
                    }
                } else {
                    IFido2AppCallbacks asInterface3 = IFido2AppCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) iax.a(parcel, PublicKeyCredentialRequestOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    getSignIntent(asInterface3, publicKeyCredentialRequestOptions);
                }
            } else {
                IFido2AppCallbacks asInterface4 = IFido2AppCallbacks.Stub.asInterface(parcel.readStrongBinder());
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) iax.a(parcel, PublicKeyCredentialCreationOptions.CREATOR);
                enforceNoDataAvail(parcel);
                getRegisterIntent(asInterface4, publicKeyCredentialCreationOptions);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getRegisterIntent(IFido2AppCallbacks iFido2AppCallbacks, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions);

    void getSignIntent(IFido2AppCallbacks iFido2AppCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions);

    void isUserVerifyingPlatformAuthenticatorAvailable(IBooleanCallback iBooleanCallback);

    void isUserVerifyingPlatformAuthenticatorAvailableForCredential(IBooleanCallback iBooleanCallback, String str, byte[] bArr);
}
