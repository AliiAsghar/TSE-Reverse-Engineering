package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.android.gms.pseudonymous.SessionZwiebackToken;
import com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acgv extends IPseudonymousIdCallbacks.Stub {
    @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
    public final void onGetLastResetWallTimeMs(Status status, long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
    public final void onSessionZwiebackTokensRetrieved(Status status, List<SessionZwiebackToken> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
    public final void onSetSessionZwiebackTokens(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
    public final void onSetToken(Status status) {
        throw new UnsupportedOperationException();
    }

    public void onTokenRetrieved(Status status, PseudonymousIdToken pseudonymousIdToken) {
        throw new UnsupportedOperationException();
    }
}
