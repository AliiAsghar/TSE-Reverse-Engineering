package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgu extends acgv {
    final /* synthetic */ acit a;

    public acgu(acit acitVar) {
        this.a = acitVar;
    }

    @Override // defpackage.acgv, com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
    public final void onTokenRetrieved(Status status, PseudonymousIdToken pseudonymousIdToken) {
        abhb.d(status, pseudonymousIdToken, this.a);
    }
}
