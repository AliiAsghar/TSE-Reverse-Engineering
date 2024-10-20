package com.google.android.gms.auth.folsom.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.folsom.RecoveryRequest;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.auth.folsom.internal.IBooleanCallback;
import com.google.android.gms.auth.folsom.internal.IByteArrayCallback;
import com.google.android.gms.auth.folsom.internal.IByteArrayListCallback;
import com.google.android.gms.auth.folsom.internal.IKeyRetrievalCallback;
import com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback;
import com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback;
import com.google.android.gms.auth.folsom.internal.IRecoveryResultCallback;
import com.google.android.gms.auth.folsom.internal.ISecurityDomainMembersCallback;
import com.google.android.gms.auth.folsom.internal.ISharedKeyCallback;
import com.google.android.gms.auth.folsom.internal.IStringListCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IKeyRetrievalService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IKeyRetrievalService {
        static final int TRANSACTION_addGaiaPasswordMember = 18;
        static final int TRANSACTION_canSilentlyAddGaiaPassword = 17;
        static final int TRANSACTION_generateOpenVaultRequest = 16;
        static final int TRANSACTION_getConsent = 2;
        static final int TRANSACTION_getKeyMaterial = 5;
        static final int TRANSACTION_getProductDetails = 10;
        static final int TRANSACTION_getSyncStatus = 3;
        static final int TRANSACTION_joinSecurityDomain = 11;
        static final int TRANSACTION_listRecoveredSecurityDomains = 7;
        static final int TRANSACTION_listSecurityDomainMembers = 15;
        static final int TRANSACTION_listVaults = 9;
        static final int TRANSACTION_markLocalKeysAsStale = 4;
        static final int TRANSACTION_promptForLskfConsent = 13;
        static final int TRANSACTION_resetSecurityDomain = 14;
        static final int TRANSACTION_setConsent = 1;
        static final int TRANSACTION_setKeyMaterial = 6;
        static final int TRANSACTION_startRecovery = 8;
        static final int TRANSACTION_startUxFlow = 12;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IKeyRetrievalService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.folsom.internal.IKeyRetrievalService");
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void addGaiaPasswordMember(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void canSilentlyAddGaiaPassword(IBooleanCallback iBooleanCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iBooleanCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void generateOpenVaultRequest(IByteArrayCallback iByteArrayCallback, RecoveryRequest recoveryRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iByteArrayCallback);
                iax.d(obtainAndWriteInterfaceToken, recoveryRequest);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void getConsent(IKeyRetrievalConsentCallback iKeyRetrievalConsentCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iKeyRetrievalConsentCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void getKeyMaterial(ISharedKeyCallback iSharedKeyCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iSharedKeyCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void getProductDetails(IByteArrayCallback iByteArrayCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iByteArrayCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void getSyncStatus(IKeyRetrievalSyncStatusCallback iKeyRetrievalSyncStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iKeyRetrievalSyncStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void joinSecurityDomain(IStatusCallback iStatusCallback, String str, byte[] bArr, int i, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void listRecoveredSecurityDomains(IStringListCallback iStringListCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStringListCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void listSecurityDomainMembers(ISecurityDomainMembersCallback iSecurityDomainMembersCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iSecurityDomainMembersCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void listVaults(IByteArrayListCallback iByteArrayListCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iByteArrayListCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void markLocalKeysAsStale(IKeyRetrievalCallback iKeyRetrievalCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iKeyRetrievalCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void promptForLskfConsent(IKeyRetrievalCallback iKeyRetrievalCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iKeyRetrievalCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void resetSecurityDomain(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void setConsent(IKeyRetrievalConsentCallback iKeyRetrievalConsentCallback, String str, boolean z, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iKeyRetrievalConsentCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void setKeyMaterial(IKeyRetrievalCallback iKeyRetrievalCallback, String str, SharedKey[] sharedKeyArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iKeyRetrievalCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeTypedArray(sharedKeyArr, 0);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void startRecovery(IRecoveryResultCallback iRecoveryResultCallback, RecoveryRequest recoveryRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iRecoveryResultCallback);
                iax.d(obtainAndWriteInterfaceToken, recoveryRequest);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void startUxFlow(IKeyRetrievalCallback iKeyRetrievalCallback, String str, int i, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iKeyRetrievalCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalService");
        }

        public static IKeyRetrievalService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalService");
            if (queryLocalInterface instanceof IKeyRetrievalService) {
                return (IKeyRetrievalService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IKeyRetrievalConsentCallback asInterface = IKeyRetrievalConsentCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    boolean g = iax.g(parcel);
                    ApiMetadata apiMetadata = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setConsent(asInterface, readString, g, apiMetadata);
                    break;
                case 2:
                    IKeyRetrievalConsentCallback asInterface2 = IKeyRetrievalConsentCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    ApiMetadata apiMetadata2 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getConsent(asInterface2, readString2, apiMetadata2);
                    break;
                case 3:
                    IKeyRetrievalSyncStatusCallback asInterface3 = IKeyRetrievalSyncStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString3 = parcel.readString();
                    ApiMetadata apiMetadata3 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getSyncStatus(asInterface3, readString3, apiMetadata3);
                    break;
                case 4:
                    IKeyRetrievalCallback asInterface4 = IKeyRetrievalCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString4 = parcel.readString();
                    ApiMetadata apiMetadata4 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    markLocalKeysAsStale(asInterface4, readString4, apiMetadata4);
                    break;
                case 5:
                    ISharedKeyCallback asInterface5 = ISharedKeyCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString5 = parcel.readString();
                    ApiMetadata apiMetadata5 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getKeyMaterial(asInterface5, readString5, apiMetadata5);
                    break;
                case 6:
                    IKeyRetrievalCallback asInterface6 = IKeyRetrievalCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString6 = parcel.readString();
                    SharedKey[] sharedKeyArr = (SharedKey[]) parcel.createTypedArray(SharedKey.CREATOR);
                    ApiMetadata apiMetadata6 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setKeyMaterial(asInterface6, readString6, sharedKeyArr, apiMetadata6);
                    break;
                case 7:
                    IStringListCallback asInterface7 = IStringListCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString7 = parcel.readString();
                    ApiMetadata apiMetadata7 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    listRecoveredSecurityDomains(asInterface7, readString7, apiMetadata7);
                    break;
                case 8:
                    IRecoveryResultCallback asInterface8 = IRecoveryResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    RecoveryRequest recoveryRequest = (RecoveryRequest) iax.a(parcel, RecoveryRequest.CREATOR);
                    ApiMetadata apiMetadata8 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    startRecovery(asInterface8, recoveryRequest, apiMetadata8);
                    break;
                case 9:
                    IByteArrayListCallback asInterface9 = IByteArrayListCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString8 = parcel.readString();
                    ApiMetadata apiMetadata9 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    listVaults(asInterface9, readString8, apiMetadata9);
                    break;
                case 10:
                    IByteArrayCallback asInterface10 = IByteArrayCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString9 = parcel.readString();
                    ApiMetadata apiMetadata10 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getProductDetails(asInterface10, readString9, apiMetadata10);
                    break;
                case 11:
                    IStatusCallback asInterface11 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString10 = parcel.readString();
                    byte[] createByteArray = parcel.createByteArray();
                    int readInt = parcel.readInt();
                    ApiMetadata apiMetadata11 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    joinSecurityDomain(asInterface11, readString10, createByteArray, readInt, apiMetadata11);
                    break;
                case 12:
                    IKeyRetrievalCallback asInterface12 = IKeyRetrievalCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString11 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    ApiMetadata apiMetadata12 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    startUxFlow(asInterface12, readString11, readInt2, apiMetadata12);
                    break;
                case 13:
                    IKeyRetrievalCallback asInterface13 = IKeyRetrievalCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString12 = parcel.readString();
                    ApiMetadata apiMetadata13 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    promptForLskfConsent(asInterface13, readString12, apiMetadata13);
                    break;
                case 14:
                    IStatusCallback asInterface14 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString13 = parcel.readString();
                    ApiMetadata apiMetadata14 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    resetSecurityDomain(asInterface14, readString13, apiMetadata14);
                    break;
                case 15:
                    ISecurityDomainMembersCallback asInterface15 = ISecurityDomainMembersCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString14 = parcel.readString();
                    ApiMetadata apiMetadata15 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    listSecurityDomainMembers(asInterface15, readString14, apiMetadata15);
                    break;
                case 16:
                    IByteArrayCallback asInterface16 = IByteArrayCallback.Stub.asInterface(parcel.readStrongBinder());
                    RecoveryRequest recoveryRequest2 = (RecoveryRequest) iax.a(parcel, RecoveryRequest.CREATOR);
                    ApiMetadata apiMetadata16 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    generateOpenVaultRequest(asInterface16, recoveryRequest2, apiMetadata16);
                    break;
                case 17:
                    IBooleanCallback asInterface17 = IBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString15 = parcel.readString();
                    ApiMetadata apiMetadata17 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    canSilentlyAddGaiaPassword(asInterface17, readString15, apiMetadata17);
                    break;
                case 18:
                    IStatusCallback asInterface18 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString16 = parcel.readString();
                    ApiMetadata apiMetadata18 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    addGaiaPasswordMember(asInterface18, readString16, apiMetadata18);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addGaiaPasswordMember(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void canSilentlyAddGaiaPassword(IBooleanCallback iBooleanCallback, String str, ApiMetadata apiMetadata);

    void generateOpenVaultRequest(IByteArrayCallback iByteArrayCallback, RecoveryRequest recoveryRequest, ApiMetadata apiMetadata);

    void getConsent(IKeyRetrievalConsentCallback iKeyRetrievalConsentCallback, String str, ApiMetadata apiMetadata);

    void getKeyMaterial(ISharedKeyCallback iSharedKeyCallback, String str, ApiMetadata apiMetadata);

    void getProductDetails(IByteArrayCallback iByteArrayCallback, String str, ApiMetadata apiMetadata);

    void getSyncStatus(IKeyRetrievalSyncStatusCallback iKeyRetrievalSyncStatusCallback, String str, ApiMetadata apiMetadata);

    void joinSecurityDomain(IStatusCallback iStatusCallback, String str, byte[] bArr, int i, ApiMetadata apiMetadata);

    void listRecoveredSecurityDomains(IStringListCallback iStringListCallback, String str, ApiMetadata apiMetadata);

    void listSecurityDomainMembers(ISecurityDomainMembersCallback iSecurityDomainMembersCallback, String str, ApiMetadata apiMetadata);

    void listVaults(IByteArrayListCallback iByteArrayListCallback, String str, ApiMetadata apiMetadata);

    void markLocalKeysAsStale(IKeyRetrievalCallback iKeyRetrievalCallback, String str, ApiMetadata apiMetadata);

    void promptForLskfConsent(IKeyRetrievalCallback iKeyRetrievalCallback, String str, ApiMetadata apiMetadata);

    void resetSecurityDomain(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void setConsent(IKeyRetrievalConsentCallback iKeyRetrievalConsentCallback, String str, boolean z, ApiMetadata apiMetadata);

    void setKeyMaterial(IKeyRetrievalCallback iKeyRetrievalCallback, String str, SharedKey[] sharedKeyArr, ApiMetadata apiMetadata);

    void startRecovery(IRecoveryResultCallback iRecoveryResultCallback, RecoveryRequest recoveryRequest, ApiMetadata apiMetadata);

    void startUxFlow(IKeyRetrievalCallback iKeyRetrievalCallback, String str, int i, ApiMetadata apiMetadata);
}
