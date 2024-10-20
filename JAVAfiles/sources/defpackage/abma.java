package defpackage;

import com.google.android.gms.auth.api.signin.internal.AbstractSignInCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abma extends AbstractSignInCallbacks {
    final /* synthetic */ abmb a;

    public abma(abmb abmbVar) {
        this.a = abmbVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.AbstractSignInCallbacks, com.google.android.gms.auth.api.signin.internal.ISignInCallbacks
    public final void onAccessRevokedFromGoogle(Status status) {
        this.a.j(status);
    }
}
