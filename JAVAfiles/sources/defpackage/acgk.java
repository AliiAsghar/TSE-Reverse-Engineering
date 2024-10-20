package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;
import com.google.android.gms.phenotype.internal.IPhenotypeCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgk extends IPhenotypeCallbacks.Stub {
    private final acit a;

    public acgk(acit acitVar) {
        this.a = acitVar;
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onCommitToConfiguration(Status status) {
        abhb.c(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onDogfoodsTokenRetrieved(Status status, DogfoodsToken dogfoodsToken) {
        abhb.d(status, dogfoodsToken, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onDogfoodsTokenSet(Status status) {
        abhb.c(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onExperimentTokensRetrieved(Status status, ExperimentTokens experimentTokens) {
        abhb.d(status, experimentTokens, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onGetCommittedConfiguration(Status status, Configurations configurations) {
        abhb.d(status, configurations, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onGetConfigurationSnapshot(Status status, Configurations configurations) {
        abhb.d(status, configurations, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onGetFlag(Status status, Flag flag) {
        abhb.d(status, flag, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onGetServingVersion(Status status, long j) {
        abhb.d(status, Long.valueOf(j), this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onListOrDeleteFlagOverrides(Status status, FlagOverrides flagOverrides) {
        abhb.d(status, flagOverrides, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onRegistered(Status status) {
        abhb.c(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onSetAppSpecificProperties(Status status) {
        abhb.c(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onSetDimensions(Status status) {
        abhb.c(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onSetFlagOverride(Status status) {
        abhb.c(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onSyncAfter(Status status, long j) {
        abhb.d(status, null, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onUnregistered(Status status) {
        abhb.c(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onWeakRegistered(Status status) {
        abhb.c(status, this.a);
    }
}
