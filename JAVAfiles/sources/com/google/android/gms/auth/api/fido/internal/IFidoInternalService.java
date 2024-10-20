package com.google.android.gms.auth.api.fido.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.common.IStatusAndBooleanCallback;
import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.auth.api.fido.RegisteredCredentialData;
import com.google.android.gms.auth.api.fido.RegistrationOptions;
import com.google.android.gms.auth.api.fido.internal.IIncrementAndGetCounterCallback;
import com.google.android.gms.auth.api.fido.internal.IListRegisteredCredentialsCallback;
import com.google.android.gms.auth.api.fido.internal.IPendingIntentCallback;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IFidoInternalService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IFidoInternalService {
        static final int TRANSACTION_deleteRegisteredCredential = 5;
        static final int TRANSACTION_getAuthenticationIntent = 7;
        static final int TRANSACTION_getCryptauthKeyAndPendingIntentForAuthentication = 10;
        static final int TRANSACTION_getRegistrationIntent = 6;
        static final int TRANSACTION_hasDiscoverableKey = 9;
        static final int TRANSACTION_hasKey = 8;
        static final int TRANSACTION_incrementAndGetCounter = 4;
        static final int TRANSACTION_listRegisteredCredentials = 3;
        static final int TRANSACTION_saveRegisteredCredential = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IFidoInternalService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.fido.internal.IFidoInternalService");
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void deleteRegisteredCredential(IStatusCallback iStatusCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void getAuthenticationIntent(IPendingIntentCallback iPendingIntentCallback, AuthenticationOptions authenticationOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPendingIntentCallback);
                iax.d(obtainAndWriteInterfaceToken, authenticationOptions);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void getCryptauthKeyAndPendingIntentForAuthentication(IPendingIntentCallback iPendingIntentCallback, String str, Account account, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPendingIntentCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void getRegistrationIntent(IPendingIntentCallback iPendingIntentCallback, RegistrationOptions registrationOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPendingIntentCallback);
                iax.d(obtainAndWriteInterfaceToken, registrationOptions);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void hasDiscoverableKey(IStatusAndBooleanCallback iStatusAndBooleanCallback, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusAndBooleanCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void hasKey(IStatusAndBooleanCallback iStatusAndBooleanCallback, List<PublicKeyCredentialDescriptor> list, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusAndBooleanCallback);
                obtainAndWriteInterfaceToken.writeList(list);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void incrementAndGetCounter(IIncrementAndGetCounterCallback iIncrementAndGetCounterCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iIncrementAndGetCounterCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void listRegisteredCredentials(IListRegisteredCredentialsCallback iListRegisteredCredentialsCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iListRegisteredCredentialsCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void saveRegisteredCredential(IStatusCallback iStatusCallback, RegisteredCredentialData registeredCredentialData) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, registeredCredentialData);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.fido.internal.IFidoInternalService");
        }

        public static IFidoInternalService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IFidoInternalService");
            if (queryLocalInterface instanceof IFidoInternalService) {
                return (IFidoInternalService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    RegisteredCredentialData registeredCredentialData = (RegisteredCredentialData) iax.a(parcel, RegisteredCredentialData.CREATOR);
                    enforceNoDataAvail(parcel);
                    saveRegisteredCredential(asInterface, registeredCredentialData);
                    break;
                case 3:
                    IListRegisteredCredentialsCallback asInterface2 = IListRegisteredCredentialsCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    listRegisteredCredentials(asInterface2, readString);
                    break;
                case 4:
                    IIncrementAndGetCounterCallback asInterface3 = IIncrementAndGetCounterCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    incrementAndGetCounter(asInterface3, readString2);
                    break;
                case 5:
                    IStatusCallback asInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    deleteRegisteredCredential(asInterface4, readString3);
                    break;
                case 6:
                    IPendingIntentCallback asInterface5 = IPendingIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                    RegistrationOptions registrationOptions = (RegistrationOptions) iax.a(parcel, RegistrationOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    getRegistrationIntent(asInterface5, registrationOptions);
                    break;
                case 7:
                    IPendingIntentCallback asInterface6 = IPendingIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                    AuthenticationOptions authenticationOptions = (AuthenticationOptions) iax.a(parcel, AuthenticationOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAuthenticationIntent(asInterface6, authenticationOptions);
                    break;
                case 8:
                    IStatusAndBooleanCallback asInterface7 = IStatusAndBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList b = iax.b(parcel);
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    hasKey(asInterface7, b, readString4, readString5);
                    break;
                case 9:
                    IStatusAndBooleanCallback asInterface8 = IStatusAndBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    hasDiscoverableKey(asInterface8, readString6, readString7);
                    break;
                case 10:
                    IPendingIntentCallback asInterface9 = IPendingIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString8 = parcel.readString();
                    Account account = (Account) iax.a(parcel, Account.CREATOR);
                    boolean g = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    getCryptauthKeyAndPendingIntentForAuthentication(asInterface9, readString8, account, g);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void deleteRegisteredCredential(IStatusCallback iStatusCallback, String str);

    void getAuthenticationIntent(IPendingIntentCallback iPendingIntentCallback, AuthenticationOptions authenticationOptions);

    void getCryptauthKeyAndPendingIntentForAuthentication(IPendingIntentCallback iPendingIntentCallback, String str, Account account, boolean z);

    void getRegistrationIntent(IPendingIntentCallback iPendingIntentCallback, RegistrationOptions registrationOptions);

    void hasDiscoverableKey(IStatusAndBooleanCallback iStatusAndBooleanCallback, String str, String str2);

    void hasKey(IStatusAndBooleanCallback iStatusAndBooleanCallback, List<PublicKeyCredentialDescriptor> list, String str, String str2);

    void incrementAndGetCounter(IIncrementAndGetCounterCallback iIncrementAndGetCounterCallback, String str);

    void listRegisteredCredentials(IListRegisteredCredentialsCallback iListRegisteredCredentialsCallback, String str);

    void saveRegisteredCredential(IStatusCallback iStatusCallback, RegisteredCredentialData registeredCredentialData);
}
