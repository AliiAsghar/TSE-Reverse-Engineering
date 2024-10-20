package com.google.android.gms.phenotype.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.GenericDimension;
import com.google.android.gms.phenotype.RegistrationInfo;
import com.google.android.gms.phenotype.internal.IFlagUpdateListener;
import com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks;
import com.google.android.gms.phenotype.internal.IPhenotypeCallbacks;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IPhenotypeService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IPhenotypeService {
        static final int TRANSACTION_bulkRegister = 19;
        static final int TRANSACTION_commitToConfiguration = 5;
        static final int TRANSACTION_commitToConfigurationV2 = 31;
        static final int TRANSACTION_deleteFlagOverrides = 15;
        static final int TRANSACTION_getAlternateConfigurationSnapshot = 17;
        static final int TRANSACTION_getCommittedConfiguration = 10;
        static final int TRANSACTION_getConfigurationSnapshot = 4;
        static final int TRANSACTION_getConfigurationSnapshotWithToken = 11;
        static final int TRANSACTION_getDogfoodsToken = 7;
        static final int TRANSACTION_getExperimentTokens = 23;
        static final int TRANSACTION_getExperimentsForLogging = 6;
        static final int TRANSACTION_getFlag = 9;
        static final int TRANSACTION_getServingVersion = 22;
        static final int TRANSACTION_getStorageInfo = 27;
        static final int TRANSACTION_listFlagOverrides = 16;
        static final int TRANSACTION_register = 1;
        static final int TRANSACTION_registerFlagUpdateListener = 28;
        static final int TRANSACTION_registerSync = 13;
        static final int TRANSACTION_setAppSpecificProperties = 20;
        static final int TRANSACTION_setAppWideProperties = 29;
        static final int TRANSACTION_setDimensions = 21;
        static final int TRANSACTION_setDogfoodsToken = 8;
        static final int TRANSACTION_setExternalExperimentTokens = 26;
        static final int TRANSACTION_setFlagOverride = 14;
        static final int TRANSACTION_setFlagOverrides = 18;
        static final int TRANSACTION_setRuntimeProperties = 25;
        static final int TRANSACTION_syncAfter = 12;
        static final int TRANSACTION_syncAfterForApplication = 24;
        static final int TRANSACTION_unRegister = 3;
        static final int TRANSACTION_weakRegister = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IPhenotypeService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void bulkRegister(IPhenotypeCallbacks iPhenotypeCallbacks, RegistrationInfo[] registrationInfoArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeTypedArray(registrationInfoArr, 0);
                transactAndReadExceptionReturnVoid(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void commitToConfiguration(IPhenotypeCallbacks iPhenotypeCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void commitToConfigurationV2(IPhenotypeCallbacks iPhenotypeCallbacks, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(31, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void deleteFlagOverrides(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getAlternateConfigurationSnapshot(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3, String str4) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeString(str4);
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getCommittedConfiguration(IPhenotypeCallbacks iPhenotypeCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getConfigurationSnapshot(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getConfigurationSnapshotWithToken(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getDogfoodsToken(IPhenotypeCallbacks iPhenotypeCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getExperimentTokens(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3, String str4) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeString(str4);
                transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getExperimentsForLogging(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getFlag(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getServingVersion(IPhenotypeCallbacks iPhenotypeCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                transactAndReadExceptionReturnVoid(22, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getStorageInfo(IGetStorageInfoCallbacks iGetStorageInfoCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetStorageInfoCallbacks);
                transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void listFlagOverrides(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void register(IPhenotypeCallbacks iPhenotypeCallbacks, String str, int i, String[] strArr, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void registerFlagUpdateListener(String str, IFlagUpdateListener iFlagUpdateListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.f(obtainAndWriteInterfaceToken, iFlagUpdateListener);
                transactAndReadExceptionReturnVoid(28, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void registerSync(IPhenotypeCallbacks iPhenotypeCallbacks, String str, int i, String[] strArr, byte[] bArr, String str2, String str3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void setAppSpecificProperties(IPhenotypeCallbacks iPhenotypeCallbacks, String str, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void setAppWideProperties(IStatusCallback iStatusCallback, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(29, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void setDimensions(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, GenericDimension[] genericDimensionArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeTypedArray(genericDimensionArr, 0);
                transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void setDogfoodsToken(IPhenotypeCallbacks iPhenotypeCallbacks, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void setExternalExperimentTokens(IStatusCallback iStatusCallback, String str, List<byte[]> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeList(list);
                transactAndReadExceptionReturnVoid(26, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void setFlagOverride(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3, int i, int i2, String str4) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeString(str4);
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void setFlagOverrides(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, Flag[] flagArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeTypedArray(flagArr, 0);
                transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void setRuntimeProperties(IStatusCallback iStatusCallback, String str, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(25, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void syncAfter(IPhenotypeCallbacks iPhenotypeCallbacks, String str, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void syncAfterForApplication(IPhenotypeCallbacks iPhenotypeCallbacks, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactAndReadExceptionReturnVoid(24, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void unRegister(IPhenotypeCallbacks iPhenotypeCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void weakRegister(IPhenotypeCallbacks iPhenotypeCallbacks, String str, int i, String[] strArr, int[] iArr, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                obtainAndWriteInterfaceToken.writeIntArray(iArr);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.phenotype.internal.IPhenotypeService");
        }

        public static IPhenotypeService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
            if (queryLocalInterface instanceof IPhenotypeService) {
                return (IPhenotypeService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IPhenotypeCallbacks asInterface = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    String[] createStringArray = parcel.createStringArray();
                    byte[] createByteArray = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    register(asInterface, readString, readInt, createStringArray, createByteArray);
                    break;
                case 2:
                    IPhenotypeCallbacks asInterface2 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    String[] createStringArray2 = parcel.createStringArray();
                    int[] createIntArray = parcel.createIntArray();
                    byte[] createByteArray2 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    weakRegister(asInterface2, readString2, readInt2, createStringArray2, createIntArray, createByteArray2);
                    break;
                case 3:
                    IPhenotypeCallbacks asInterface3 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    unRegister(asInterface3, readString3);
                    break;
                case 4:
                    IPhenotypeCallbacks asInterface4 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getConfigurationSnapshot(asInterface4, readString4, readString5);
                    break;
                case 5:
                    IPhenotypeCallbacks asInterface5 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString6 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    commitToConfiguration(asInterface5, readString6);
                    break;
                case 6:
                    IPhenotypeCallbacks asInterface6 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getExperimentsForLogging(asInterface6, readString7, readString8);
                    break;
                case 7:
                    IPhenotypeCallbacks asInterface7 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getDogfoodsToken(asInterface7);
                    break;
                case 8:
                    IPhenotypeCallbacks asInterface8 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    byte[] createByteArray3 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    setDogfoodsToken(asInterface8, createByteArray3);
                    break;
                case 9:
                    IPhenotypeCallbacks asInterface9 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    int readInt3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    getFlag(asInterface9, readString9, readString10, readInt3);
                    break;
                case 10:
                    IPhenotypeCallbacks asInterface10 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString11 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getCommittedConfiguration(asInterface10, readString11);
                    break;
                case 11:
                    IPhenotypeCallbacks asInterface11 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString12 = parcel.readString();
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getConfigurationSnapshotWithToken(asInterface11, readString12, readString13, readString14);
                    break;
                case 12:
                    IPhenotypeCallbacks asInterface12 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString15 = parcel.readString();
                    long readLong = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    syncAfter(asInterface12, readString15, readLong);
                    break;
                case 13:
                    IPhenotypeCallbacks asInterface13 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString16 = parcel.readString();
                    int readInt4 = parcel.readInt();
                    String[] createStringArray3 = parcel.createStringArray();
                    byte[] createByteArray4 = parcel.createByteArray();
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    registerSync(asInterface13, readString16, readInt4, createStringArray3, createByteArray4, readString17, readString18);
                    break;
                case 14:
                    IPhenotypeCallbacks asInterface14 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString19 = parcel.readString();
                    String readString20 = parcel.readString();
                    String readString21 = parcel.readString();
                    int readInt5 = parcel.readInt();
                    int readInt6 = parcel.readInt();
                    String readString22 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    setFlagOverride(asInterface14, readString19, readString20, readString21, readInt5, readInt6, readString22);
                    break;
                case 15:
                    IPhenotypeCallbacks asInterface15 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString23 = parcel.readString();
                    String readString24 = parcel.readString();
                    String readString25 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    deleteFlagOverrides(asInterface15, readString23, readString24, readString25);
                    break;
                case 16:
                    IPhenotypeCallbacks asInterface16 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString26 = parcel.readString();
                    String readString27 = parcel.readString();
                    String readString28 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    listFlagOverrides(asInterface16, readString26, readString27, readString28);
                    break;
                case 17:
                    IPhenotypeCallbacks asInterface17 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString29 = parcel.readString();
                    String readString30 = parcel.readString();
                    String readString31 = parcel.readString();
                    String readString32 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getAlternateConfigurationSnapshot(asInterface17, readString29, readString30, readString31, readString32);
                    break;
                case 18:
                    IPhenotypeCallbacks asInterface18 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString33 = parcel.readString();
                    String readString34 = parcel.readString();
                    Flag[] flagArr = (Flag[]) parcel.createTypedArray(Flag.CREATOR);
                    enforceNoDataAvail(parcel);
                    setFlagOverrides(asInterface18, readString33, readString34, flagArr);
                    break;
                case 19:
                    IPhenotypeCallbacks asInterface19 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    RegistrationInfo[] registrationInfoArr = (RegistrationInfo[]) parcel.createTypedArray(RegistrationInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    bulkRegister(asInterface19, registrationInfoArr);
                    break;
                case 20:
                    IPhenotypeCallbacks asInterface20 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString35 = parcel.readString();
                    byte[] createByteArray5 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    setAppSpecificProperties(asInterface20, readString35, createByteArray5);
                    break;
                case 21:
                    IPhenotypeCallbacks asInterface21 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString36 = parcel.readString();
                    String readString37 = parcel.readString();
                    GenericDimension[] genericDimensionArr = (GenericDimension[]) parcel.createTypedArray(GenericDimension.CREATOR);
                    enforceNoDataAvail(parcel);
                    setDimensions(asInterface21, readString36, readString37, genericDimensionArr);
                    break;
                case 22:
                    IPhenotypeCallbacks asInterface22 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getServingVersion(asInterface22);
                    break;
                case 23:
                    IPhenotypeCallbacks asInterface23 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString38 = parcel.readString();
                    String readString39 = parcel.readString();
                    String readString40 = parcel.readString();
                    String readString41 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getExperimentTokens(asInterface23, readString38, readString39, readString40, readString41);
                    break;
                case 24:
                    IPhenotypeCallbacks asInterface24 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    long readLong2 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    syncAfterForApplication(asInterface24, readLong2);
                    break;
                case 25:
                    IStatusCallback asInterface25 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString42 = parcel.readString();
                    byte[] createByteArray6 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    setRuntimeProperties(asInterface25, readString42, createByteArray6);
                    break;
                case 26:
                    IStatusCallback asInterface26 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString43 = parcel.readString();
                    ArrayList b = iax.b(parcel);
                    enforceNoDataAvail(parcel);
                    setExternalExperimentTokens(asInterface26, readString43, b);
                    break;
                case 27:
                    IGetStorageInfoCallbacks asInterface27 = IGetStorageInfoCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getStorageInfo(asInterface27);
                    break;
                case 28:
                    String readString44 = parcel.readString();
                    IFlagUpdateListener asInterface28 = IFlagUpdateListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerFlagUpdateListener(readString44, asInterface28);
                    break;
                case 29:
                    IStatusCallback asInterface29 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    byte[] createByteArray7 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    setAppWideProperties(asInterface29, createByteArray7);
                    break;
                case 30:
                default:
                    return false;
                case 31:
                    IPhenotypeCallbacks asInterface30 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    byte[] createByteArray8 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    commitToConfigurationV2(asInterface30, createByteArray8);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void bulkRegister(IPhenotypeCallbacks iPhenotypeCallbacks, RegistrationInfo[] registrationInfoArr);

    void commitToConfiguration(IPhenotypeCallbacks iPhenotypeCallbacks, String str);

    void commitToConfigurationV2(IPhenotypeCallbacks iPhenotypeCallbacks, byte[] bArr);

    void deleteFlagOverrides(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3);

    void getAlternateConfigurationSnapshot(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3, String str4);

    void getCommittedConfiguration(IPhenotypeCallbacks iPhenotypeCallbacks, String str);

    void getConfigurationSnapshot(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2);

    void getConfigurationSnapshotWithToken(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3);

    void getDogfoodsToken(IPhenotypeCallbacks iPhenotypeCallbacks);

    void getExperimentTokens(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3, String str4);

    void getExperimentsForLogging(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2);

    void getFlag(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, int i);

    void getServingVersion(IPhenotypeCallbacks iPhenotypeCallbacks);

    void getStorageInfo(IGetStorageInfoCallbacks iGetStorageInfoCallbacks);

    void listFlagOverrides(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3);

    void register(IPhenotypeCallbacks iPhenotypeCallbacks, String str, int i, String[] strArr, byte[] bArr);

    void registerFlagUpdateListener(String str, IFlagUpdateListener iFlagUpdateListener);

    void registerSync(IPhenotypeCallbacks iPhenotypeCallbacks, String str, int i, String[] strArr, byte[] bArr, String str2, String str3);

    void setAppSpecificProperties(IPhenotypeCallbacks iPhenotypeCallbacks, String str, byte[] bArr);

    void setAppWideProperties(IStatusCallback iStatusCallback, byte[] bArr);

    void setDimensions(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, GenericDimension[] genericDimensionArr);

    void setDogfoodsToken(IPhenotypeCallbacks iPhenotypeCallbacks, byte[] bArr);

    void setExternalExperimentTokens(IStatusCallback iStatusCallback, String str, List<byte[]> list);

    void setFlagOverride(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3, int i, int i2, String str4);

    void setFlagOverrides(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, Flag[] flagArr);

    void setRuntimeProperties(IStatusCallback iStatusCallback, String str, byte[] bArr);

    void syncAfter(IPhenotypeCallbacks iPhenotypeCallbacks, String str, long j);

    void syncAfterForApplication(IPhenotypeCallbacks iPhenotypeCallbacks, long j);

    void unRegister(IPhenotypeCallbacks iPhenotypeCallbacks, String str);

    void weakRegister(IPhenotypeCallbacks iPhenotypeCallbacks, String str, int i, String[] strArr, int[] iArr, byte[] bArr);
}
