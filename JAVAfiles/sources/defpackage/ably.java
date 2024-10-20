package defpackage;

import com.google.android.gms.auth.api.signin.internal.AbstractSignInCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ably extends AbstractSignInCallbacks {
    final /* synthetic */ ablz a;

    public ably(ablz ablzVar) {
        this.a = ablzVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.AbstractSignInCallbacks, com.google.android.gms.auth.api.signin.internal.ISignInCallbacks
    public final void onSignedOutFromGoogle(Status status) {
        this.a.j(status);
    }
}
