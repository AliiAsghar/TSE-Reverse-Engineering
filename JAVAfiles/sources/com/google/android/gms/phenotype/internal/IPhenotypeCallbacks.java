package com.google.android.gms.phenotype.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IPhenotypeCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IPhenotypeCallbacks {
        static final int TRANSACTION_onCommitToConfiguration = 5;
        static final int TRANSACTION_onDogfoodsTokenRetrieved = 7;
        static final int TRANSACTION_onDogfoodsTokenSet = 8;
        static final int TRANSACTION_onExperimentTokensRetrieved = 6;
        static final int TRANSACTION_onGetCommittedConfiguration = 10;
        static final int TRANSACTION_onGetConfigurationSnapshot = 4;
        static final int TRANSACTION_onGetFlag = 9;
        static final int TRANSACTION_onGetServingVersion = 16;
        static final int TRANSACTION_onListOrDeleteFlagOverrides = 13;
        static final int TRANSACTION_onRegistered = 1;
        static final int TRANSACTION_onSetAppSpecificProperties = 14;
        static final int TRANSACTION_onSetDimensions = 15;
        static final int TRANSACTION_onSetFlagOverride = 12;
        static final int TRANSACTION_onSyncAfter = 11;
        static final int TRANSACTION_onUnregistered = 3;
        static final int TRANSACTION_onWeakRegistered = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IPhenotypeCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
            public void onCommitToConfiguration(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
            public void onDogfoodsTokenRetrieved(Status status, DogfoodsToken dogfoodsToken) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, dogfoodsToken);
                transactOneway(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
            public void onDogfoodsTokenSet(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
            public void onExperimentTokensRetrieved(Status status, ExperimentTokens experimentTokens) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, experimentTokens);
                transactOneway(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
            public void onGetCommittedConfiguration(Status status, Configurations configurations) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, configurations);
                transactOneway(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
            public void onGetConfigurationSnapshot(Status status, Configurations configurations) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, configurations);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
            public void onGetFlag(Status status, Flag flag) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, flag);
                transactOneway(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
            public void onGetServingVersion(Status status, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
            public void onListOrDeleteFlagOverrides(Status status, FlagOverrides flagOverrides) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, flagOverrides);
                transactOneway(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
            public void onRegistered(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
            public void onSetAppSpecificProperties(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
            public void onSetDimensions(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
            public void onSetFlagOverride(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
            public void onSyncAfter(Status status, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
            public void onUnregistered(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
            public void onWeakRegistered(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        }

        public static IPhenotypeCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
            if (queryLocalInterface instanceof IPhenotypeCallbacks) {
                return (IPhenotypeCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    Status status = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRegistered(status);
                    return true;
                case 2:
                    Status status2 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onWeakRegistered(status2);
                    return true;
                case 3:
                    Status status3 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onUnregistered(status3);
                    return true;
                case 4:
                    Status status4 = (Status) iax.a(parcel, Status.CREATOR);
                    Configurations configurations = (Configurations) iax.a(parcel, Configurations.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetConfigurationSnapshot(status4, configurations);
                    return true;
                case 5:
                    Status status5 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCommitToConfiguration(status5);
                    return true;
                case 6:
                    Status status6 = (Status) iax.a(parcel, Status.CREATOR);
                    ExperimentTokens experimentTokens = (ExperimentTokens) iax.a(parcel, ExperimentTokens.CREATOR);
                    enforceNoDataAvail(parcel);
                    onExperimentTokensRetrieved(status6, experimentTokens);
                    return true;
                case 7:
                    Status status7 = (Status) iax.a(parcel, Status.CREATOR);
                    DogfoodsToken dogfoodsToken = (DogfoodsToken) iax.a(parcel, DogfoodsToken.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDogfoodsTokenRetrieved(status7, dogfoodsToken);
                    return true;
                case 8:
                    Status status8 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDogfoodsTokenSet(status8);
                    return true;
                case 9:
                    Status status9 = (Status) iax.a(parcel, Status.CREATOR);
                    Flag flag = (Flag) iax.a(parcel, Flag.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetFlag(status9, flag);
                    return true;
                case 10:
                    Status status10 = (Status) iax.a(parcel, Status.CREATOR);
                    Configurations configurations2 = (Configurations) iax.a(parcel, Configurations.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCommittedConfiguration(status10, configurations2);
                    return true;
                case 11:
                    Status status11 = (Status) iax.a(parcel, Status.CREATOR);
                    long readLong = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    onSyncAfter(status11, readLong);
                    return true;
                case 12:
                    Status status12 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSetFlagOverride(status12);
                    return true;
                case 13:
                    Status status13 = (Status) iax.a(parcel, Status.CREATOR);
                    FlagOverrides flagOverrides = (FlagOverrides) iax.a(parcel, FlagOverrides.CREATOR);
                    enforceNoDataAvail(parcel);
                    onListOrDeleteFlagOverrides(status13, flagOverrides);
                    return true;
                case 14:
                    Status status14 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSetAppSpecificProperties(status14);
                    return true;
                case 15:
                    Status status15 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSetDimensions(status15);
                    return true;
                case 16:
                    Status status16 = (Status) iax.a(parcel, Status.CREATOR);
                    long readLong2 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    onGetServingVersion(status16, readLong2);
                    return true;
                default:
                    return false;
            }
        }
    }

    void onCommitToConfiguration(Status status);

    void onDogfoodsTokenRetrieved(Status status, DogfoodsToken dogfoodsToken);

    void onDogfoodsTokenSet(Status status);

    void onExperimentTokensRetrieved(Status status, ExperimentTokens experimentTokens);

    void onGetCommittedConfiguration(Status status, Configurations configurations);

    void onGetConfigurationSnapshot(Status status, Configurations configurations);

    void onGetFlag(Status status, Flag flag);

    void onGetServingVersion(Status status, long j);

    void onListOrDeleteFlagOverrides(Status status, FlagOverrides flagOverrides);

    void onRegistered(Status status);

    void onSetAppSpecificProperties(Status status);

    void onSetDimensions(Status status);

    void onSetFlagOverride(Status status);

    void onSyncAfter(Status status, long j);

    void onUnregistered(Status status);

    void onWeakRegistered(Status status);
}
