package com.google.android.gms.fido.fido2.internal.zeroparty;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.fido.fido2.api.IAuthStatusCallback;
import com.google.android.gms.fido.fido2.api.ICredentialListCallback;
import com.google.android.gms.fido.fido2.api.IResponseHandler;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IFido2ZeroPartyService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IFido2ZeroPartyService {
        static final int TRANSACTION_authenticatePasskey = 6;
        static final int TRANSACTION_getBrowserHybridClientRegistrationPendingIntent = 10;
        static final int TRANSACTION_getFidoSecurityKeyOnlyRegistrationPendingIntent = 18;
        static final int TRANSACTION_getFidoSecurityKeyOnlySignPendingIntent = 17;
        static final int TRANSACTION_getHybridClientRegistrationPendingIntent = 8;
        static final int TRANSACTION_getHybridClientSignPendingIntent = 9;
        static final int TRANSACTION_getPrivilegedFidoSecurityKeyOnlyRegistrationPendingIntent = 20;
        static final int TRANSACTION_getPrivilegedFidoSecurityKeyOnlySignPendingIntent = 19;
        static final int TRANSACTION_getPrivilegedHybridClientRegistrationPendingIntent = 15;
        static final int TRANSACTION_getPrivilegedHybridClientSignPendingIntent = 16;
        static final int TRANSACTION_headlessHandleStateUpdate = 4;
        static final int TRANSACTION_headlessRegister = 3;
        static final int TRANSACTION_headlessSign = 2;
        static final int TRANSACTION_listDiscoverableCredentials = 5;
        static final int TRANSACTION_privilegedAuthenticatePasskey = 12;
        static final int TRANSACTION_privilegedRegisterPasskeyWithSyncAccount = 13;
        static final int TRANSACTION_registerPasskey = 7;
        static final int TRANSACTION_registerPasskeyWithSyncAccount = 11;
        static final int TRANSACTION_startCableAuthenticator = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IFido2ZeroPartyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService");
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void authenticatePasskey(String str, String str2, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                iax.d(obtainAndWriteInterfaceToken, publicKeyCredentialRequestOptions);
                iax.f(obtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getBrowserHybridClientRegistrationPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                iax.d(obtainAndWriteInterfaceToken, browserPublicKeyCredentialCreationOptions);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getFidoSecurityKeyOnlyRegistrationPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, String str, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                iax.d(obtainAndWriteInterfaceToken, publicKeyCredentialCreationOptions);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getFidoSecurityKeyOnlySignPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, String str, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                iax.d(obtainAndWriteInterfaceToken, publicKeyCredentialRequestOptions);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getHybridClientRegistrationPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                iax.d(obtainAndWriteInterfaceToken, publicKeyCredentialCreationOptions);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getHybridClientSignPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                iax.d(obtainAndWriteInterfaceToken, publicKeyCredentialRequestOptions);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getPrivilegedFidoSecurityKeyOnlyRegistrationPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions, String str, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                iax.d(obtainAndWriteInterfaceToken, browserPublicKeyCredentialCreationOptions);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getPrivilegedFidoSecurityKeyOnlySignPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, String str, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                iax.d(obtainAndWriteInterfaceToken, browserPublicKeyCredentialRequestOptions);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getPrivilegedHybridClientRegistrationPendingIntent(BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, browserPublicKeyCredentialCreationOptions);
                iax.f(obtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getPrivilegedHybridClientSignPendingIntent(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, browserPublicKeyCredentialRequestOptions);
                iax.f(obtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void headlessHandleStateUpdate(String str, IStatusCallback iStatusCallback, StateUpdate stateUpdate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, stateUpdate);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void headlessRegister(String str, IStatusCallback iStatusCallback, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, IResponseHandler iResponseHandler) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, publicKeyCredentialCreationOptions);
                iax.f(obtainAndWriteInterfaceToken, iResponseHandler);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void headlessSign(String str, IStatusCallback iStatusCallback, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, IResponseHandler iResponseHandler) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, publicKeyCredentialRequestOptions);
                iax.f(obtainAndWriteInterfaceToken, iResponseHandler);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void listDiscoverableCredentials(String str, String str2, String str3, ICredentialListCallback iCredentialListCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                iax.f(obtainAndWriteInterfaceToken, iCredentialListCallback);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void privilegedAuthenticatePasskey(String str, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, boolean z, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, browserPublicKeyCredentialRequestOptions);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                iax.f(obtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void privilegedRegisterPasskeyWithSyncAccount(String str, String str2, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                iax.d(obtainAndWriteInterfaceToken, browserPublicKeyCredentialCreationOptions);
                iax.f(obtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void registerPasskey(String str, String str2, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                iax.d(obtainAndWriteInterfaceToken, publicKeyCredentialCreationOptions);
                iax.f(obtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void registerPasskeyWithSyncAccount(String str, String str2, String str3, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                iax.d(obtainAndWriteInterfaceToken, publicKeyCredentialCreationOptions);
                iax.f(obtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void startCableAuthenticator(IStatusCallback iStatusCallback, int i, byte[] bArr, byte[] bArr2, IAuthStatusCallback iAuthStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                obtainAndWriteInterfaceToken.writeByteArray(bArr2);
                iax.f(obtainAndWriteInterfaceToken, iAuthStatusCallback);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService");
        }

        public static IFido2ZeroPartyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService");
            if (queryLocalInterface instanceof IFido2ZeroPartyService) {
                return (IFido2ZeroPartyService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    int readInt = parcel.readInt();
                    byte[] createByteArray = parcel.createByteArray();
                    byte[] createByteArray2 = parcel.createByteArray();
                    IAuthStatusCallback asInterface2 = IAuthStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    startCableAuthenticator(asInterface, readInt, createByteArray, createByteArray2, asInterface2);
                    break;
                case 2:
                    String readString = parcel.readString();
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) iax.a(parcel, PublicKeyCredentialRequestOptions.CREATOR);
                    IResponseHandler asInterface4 = IResponseHandler.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    headlessSign(readString, asInterface3, publicKeyCredentialRequestOptions, asInterface4);
                    break;
                case 3:
                    String readString2 = parcel.readString();
                    IStatusCallback asInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) iax.a(parcel, PublicKeyCredentialCreationOptions.CREATOR);
                    IResponseHandler asInterface6 = IResponseHandler.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    headlessRegister(readString2, asInterface5, publicKeyCredentialCreationOptions, asInterface6);
                    break;
                case 4:
                    String readString3 = parcel.readString();
                    IStatusCallback asInterface7 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    StateUpdate stateUpdate = (StateUpdate) iax.a(parcel, StateUpdate.CREATOR);
                    enforceNoDataAvail(parcel);
                    headlessHandleStateUpdate(readString3, asInterface7, stateUpdate);
                    break;
                case 5:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    ICredentialListCallback asInterface8 = ICredentialListCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    listDiscoverableCredentials(readString4, readString5, readString6, asInterface8);
                    break;
                case 6:
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions2 = (PublicKeyCredentialRequestOptions) iax.a(parcel, PublicKeyCredentialRequestOptions.CREATOR);
                    IFido2ZeroPartyCallbacks asInterface9 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    authenticatePasskey(readString7, readString8, publicKeyCredentialRequestOptions2, asInterface9);
                    break;
                case 7:
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions2 = (PublicKeyCredentialCreationOptions) iax.a(parcel, PublicKeyCredentialCreationOptions.CREATOR);
                    IFido2ZeroPartyCallbacks asInterface10 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerPasskey(readString9, readString10, publicKeyCredentialCreationOptions2, asInterface10);
                    break;
                case 8:
                    IFido2ZeroPartyCallbacks asInterface11 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions3 = (PublicKeyCredentialCreationOptions) iax.a(parcel, PublicKeyCredentialCreationOptions.CREATOR);
                    String readString11 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getHybridClientRegistrationPendingIntent(asInterface11, publicKeyCredentialCreationOptions3, readString11);
                    break;
                case 9:
                    IFido2ZeroPartyCallbacks asInterface12 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions3 = (PublicKeyCredentialRequestOptions) iax.a(parcel, PublicKeyCredentialRequestOptions.CREATOR);
                    String readString12 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getHybridClientSignPendingIntent(asInterface12, publicKeyCredentialRequestOptions3, readString12);
                    break;
                case 10:
                    IFido2ZeroPartyCallbacks asInterface13 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) iax.a(parcel, BrowserPublicKeyCredentialCreationOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    getBrowserHybridClientRegistrationPendingIntent(asInterface13, browserPublicKeyCredentialCreationOptions);
                    break;
                case 11:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    String readString15 = parcel.readString();
                    PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions4 = (PublicKeyCredentialCreationOptions) iax.a(parcel, PublicKeyCredentialCreationOptions.CREATOR);
                    IFido2ZeroPartyCallbacks asInterface14 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerPasskeyWithSyncAccount(readString13, readString14, readString15, publicKeyCredentialCreationOptions4, asInterface14);
                    break;
                case 12:
                    String readString16 = parcel.readString();
                    BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) iax.a(parcel, BrowserPublicKeyCredentialRequestOptions.CREATOR);
                    boolean g = iax.g(parcel);
                    IFido2ZeroPartyCallbacks asInterface15 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    privilegedAuthenticatePasskey(readString16, browserPublicKeyCredentialRequestOptions, g, asInterface15);
                    break;
                case 13:
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions2 = (BrowserPublicKeyCredentialCreationOptions) iax.a(parcel, BrowserPublicKeyCredentialCreationOptions.CREATOR);
                    IFido2ZeroPartyCallbacks asInterface16 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    privilegedRegisterPasskeyWithSyncAccount(readString17, readString18, browserPublicKeyCredentialCreationOptions2, asInterface16);
                    break;
                case 14:
                default:
                    return false;
                case 15:
                    BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions3 = (BrowserPublicKeyCredentialCreationOptions) iax.a(parcel, BrowserPublicKeyCredentialCreationOptions.CREATOR);
                    IFido2ZeroPartyCallbacks asInterface17 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getPrivilegedHybridClientRegistrationPendingIntent(browserPublicKeyCredentialCreationOptions3, asInterface17);
                    break;
                case 16:
                    BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions2 = (BrowserPublicKeyCredentialRequestOptions) iax.a(parcel, BrowserPublicKeyCredentialRequestOptions.CREATOR);
                    IFido2ZeroPartyCallbacks asInterface18 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getPrivilegedHybridClientSignPendingIntent(browserPublicKeyCredentialRequestOptions2, asInterface18);
                    break;
                case 17:
                    IFido2ZeroPartyCallbacks asInterface19 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions4 = (PublicKeyCredentialRequestOptions) iax.a(parcel, PublicKeyCredentialRequestOptions.CREATOR);
                    String readString19 = parcel.readString();
                    boolean g2 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    getFidoSecurityKeyOnlySignPendingIntent(asInterface19, publicKeyCredentialRequestOptions4, readString19, g2);
                    break;
                case 18:
                    IFido2ZeroPartyCallbacks asInterface20 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions5 = (PublicKeyCredentialCreationOptions) iax.a(parcel, PublicKeyCredentialCreationOptions.CREATOR);
                    String readString20 = parcel.readString();
                    boolean g3 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    getFidoSecurityKeyOnlyRegistrationPendingIntent(asInterface20, publicKeyCredentialCreationOptions5, readString20, g3);
                    break;
                case 19:
                    IFido2ZeroPartyCallbacks asInterface21 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions3 = (BrowserPublicKeyCredentialRequestOptions) iax.a(parcel, BrowserPublicKeyCredentialRequestOptions.CREATOR);
                    String readString21 = parcel.readString();
                    boolean g4 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    getPrivilegedFidoSecurityKeyOnlySignPendingIntent(asInterface21, browserPublicKeyCredentialRequestOptions3, readString21, g4);
                    break;
                case 20:
                    IFido2ZeroPartyCallbacks asInterface22 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions4 = (BrowserPublicKeyCredentialCreationOptions) iax.a(parcel, BrowserPublicKeyCredentialCreationOptions.CREATOR);
                    String readString22 = parcel.readString();
                    boolean g5 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    getPrivilegedFidoSecurityKeyOnlyRegistrationPendingIntent(asInterface22, browserPublicKeyCredentialCreationOptions4, readString22, g5);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void authenticatePasskey(String str, String str2, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks);

    void getBrowserHybridClientRegistrationPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions);

    void getFidoSecurityKeyOnlyRegistrationPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, String str, boolean z);

    void getFidoSecurityKeyOnlySignPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, String str, boolean z);

    void getHybridClientRegistrationPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, String str);

    void getHybridClientSignPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, String str);

    void getPrivilegedFidoSecurityKeyOnlyRegistrationPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions, String str, boolean z);

    void getPrivilegedFidoSecurityKeyOnlySignPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, String str, boolean z);

    void getPrivilegedHybridClientRegistrationPendingIntent(BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks);

    void getPrivilegedHybridClientSignPendingIntent(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks);

    void headlessHandleStateUpdate(String str, IStatusCallback iStatusCallback, StateUpdate stateUpdate);

    void headlessRegister(String str, IStatusCallback iStatusCallback, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, IResponseHandler iResponseHandler);

    void headlessSign(String str, IStatusCallback iStatusCallback, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, IResponseHandler iResponseHandler);

    void listDiscoverableCredentials(String str, String str2, String str3, ICredentialListCallback iCredentialListCallback);

    void privilegedAuthenticatePasskey(String str, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, boolean z, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks);

    void privilegedRegisterPasskeyWithSyncAccount(String str, String str2, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks);

    void registerPasskey(String str, String str2, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks);

    void registerPasskeyWithSyncAccount(String str, String str2, String str3, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks);

    void startCableAuthenticator(IStatusCallback iStatusCallback, int i, byte[] bArr, byte[] bArr2, IAuthStatusCallback iAuthStatusCallback);
}
