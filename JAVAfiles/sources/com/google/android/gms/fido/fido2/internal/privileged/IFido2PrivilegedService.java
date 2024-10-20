package com.google.android.gms.fido.fido2.internal.privileged;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.fido.fido2.api.IBooleanCallback;
import com.google.android.gms.fido.fido2.api.ICredentialListCallback;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IFido2PrivilegedService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IFido2PrivilegedService {
        static final int TRANSACTION_getCredentialList = 4;
        static final int TRANSACTION_getHybridSignPendingIntent = 5;
        static final int TRANSACTION_getRegisterIntent = 1;
        static final int TRANSACTION_getSignIntent = 2;
        static final int TRANSACTION_isUserVerifyingPlatformAuthenticatorAvailable = 3;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IFido2PrivilegedService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
            }

            @Override // com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService
            public void getCredentialList(ICredentialListCallback iCredentialListCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iCredentialListCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService
            public void getHybridSignPendingIntent(IFido2PrivilegedCallbacks iFido2PrivilegedCallbacks, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFido2PrivilegedCallbacks);
                iax.d(obtainAndWriteInterfaceToken, browserPublicKeyCredentialRequestOptions);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService
            public void getRegisterIntent(IFido2PrivilegedCallbacks iFido2PrivilegedCallbacks, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFido2PrivilegedCallbacks);
                iax.d(obtainAndWriteInterfaceToken, browserPublicKeyCredentialCreationOptions);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService
            public void getSignIntent(IFido2PrivilegedCallbacks iFido2PrivilegedCallbacks, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFido2PrivilegedCallbacks);
                iax.d(obtainAndWriteInterfaceToken, browserPublicKeyCredentialRequestOptions);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService
            public void isUserVerifyingPlatformAuthenticatorAvailable(IBooleanCallback iBooleanCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iBooleanCallback);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
        }

        public static IFido2PrivilegedService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
            if (queryLocalInterface instanceof IFido2PrivilegedService) {
                return (IFido2PrivilegedService) queryLocalInterface;
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
                            IFido2PrivilegedCallbacks asInterface = IFido2PrivilegedCallbacks.Stub.asInterface(parcel.readStrongBinder());
                            BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) iax.a(parcel, BrowserPublicKeyCredentialRequestOptions.CREATOR);
                            enforceNoDataAvail(parcel);
                            getHybridSignPendingIntent(asInterface, browserPublicKeyCredentialRequestOptions);
                        } else {
                            ICredentialListCallback asInterface2 = ICredentialListCallback.Stub.asInterface(parcel.readStrongBinder());
                            String readString = parcel.readString();
                            enforceNoDataAvail(parcel);
                            getCredentialList(asInterface2, readString);
                        }
                    } else {
                        IBooleanCallback asInterface3 = IBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        isUserVerifyingPlatformAuthenticatorAvailable(asInterface3);
                    }
                } else {
                    IFido2PrivilegedCallbacks asInterface4 = IFido2PrivilegedCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions2 = (BrowserPublicKeyCredentialRequestOptions) iax.a(parcel, BrowserPublicKeyCredentialRequestOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    getSignIntent(asInterface4, browserPublicKeyCredentialRequestOptions2);
                }
            } else {
                IFido2PrivilegedCallbacks asInterface5 = IFido2PrivilegedCallbacks.Stub.asInterface(parcel.readStrongBinder());
                BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) iax.a(parcel, BrowserPublicKeyCredentialCreationOptions.CREATOR);
                enforceNoDataAvail(parcel);
                getRegisterIntent(asInterface5, browserPublicKeyCredentialCreationOptions);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getCredentialList(ICredentialListCallback iCredentialListCallback, String str);

    void getHybridSignPendingIntent(IFido2PrivilegedCallbacks iFido2PrivilegedCallbacks, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions);

    void getRegisterIntent(IFido2PrivilegedCallbacks iFido2PrivilegedCallbacks, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions);

    void getSignIntent(IFido2PrivilegedCallbacks iFido2PrivilegedCallbacks, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions);

    void isUserVerifyingPlatformAuthenticatorAvailable(IBooleanCallback iBooleanCallback);
}
