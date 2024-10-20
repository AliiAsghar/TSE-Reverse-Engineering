package com.google.android.gms.phenotype.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;
import com.google.android.gms.phenotype.internal.IPhenotypeCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PhenotypeApiImpl$AbstractPhenotypeCallbacks extends IPhenotypeCallbacks.Stub {
    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public void onCommitToConfiguration(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public void onDogfoodsTokenRetrieved(Status status, DogfoodsToken dogfoodsToken) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public void onDogfoodsTokenSet(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public void onExperimentTokensRetrieved(Status status, ExperimentTokens experimentTokens) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public void onGetCommittedConfiguration(Status status, Configurations configurations) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public void onGetConfigurationSnapshot(Status status, Configurations configurations) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public void onGetFlag(Status status, Flag flag) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public void onGetServingVersion(Status status, long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public void onListOrDeleteFlagOverrides(Status status, FlagOverrides flagOverrides) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public void onRegistered(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public void onSetAppSpecificProperties(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public void onSetDimensions(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public void onSetFlagOverride(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public void onSyncAfter(Status status, long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public void onUnregistered(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public void onWeakRegistered(Status status) {
        throw new UnsupportedOperationException();
    }
}
