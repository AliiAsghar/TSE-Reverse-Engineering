package defpackage;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmf implements epi {
    final /* synthetic */ SignInHubActivity a;

    public abmf(SignInHubActivity signInHubActivity) {
        this.a = signInHubActivity;
    }

    @Override // defpackage.epi
    public final epr a(int i, Bundle bundle) {
        return new ablw(this.a, abrg.a());
    }

    @Override // defpackage.epi
    public final /* bridge */ /* synthetic */ void b(epr eprVar, Object obj) {
        SignInHubActivity signInHubActivity = this.a;
        signInHubActivity.setResult(signInHubActivity.n, signInHubActivity.o);
        this.a.finish();
    }

    @Override // defpackage.epi
    public final void c(epr eprVar) {
    }
}
