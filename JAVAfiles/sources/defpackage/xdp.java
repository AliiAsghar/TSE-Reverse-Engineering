package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xdp implements amdv {
    private final /* synthetic */ int a;

    public xdp(int i) {
        this.a = i;
    }

    @Override // defpackage.amdv
    public final void b() {
        if (this.a != 0) {
            return;
        }
        ((alwl) ((alwl) xdq.a.g()).h("com/google/android/apps/messaging/shared/tachygram/capabilities/TachygramUserTransportAdapter$1", "newTrial", 205, "TachygramUserTransportAdapter.java")).q("Kicking off a new attempt");
    }

    @Override // defpackage.amdv
    public final void c(Exception exc, long j) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                amdw.a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "retryableExceptionCaught", "RetryingFuture caught exception; retrying", (Throwable) exc);
                return;
            } else {
                ((alwl) ((alwl) ((alwl) puo.a.i()).g(exc)).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CapabilitiesProviderTransportSwitch$CapabilitiesFetchInterceptor", "retryableExceptionCaught", 133, "CapabilitiesProviderTransportSwitch.java")).s("Retryable RcsCapabilityException caught. Retrying in %dms", j);
                return;
            }
        }
        ((alwl) ((alwl) ((alwl) xdq.a.g()).g(exc)).h("com/google/android/apps/messaging/shared/tachygram/capabilities/TachygramUserTransportAdapter$1", "retryableExceptionCaught", 211, "TachygramUserTransportAdapter.java")).t("Retryable TachygramException caught; retrying %s", exc);
    }

    @Override // defpackage.amdv
    public final void d(Exception exc) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                amdw.a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "terminalExceptionCaught", "RetryingFuture caught terminal exception", (Throwable) exc);
                return;
            }
            return;
        }
        ((alwl) ((alwl) ((alwl) xdq.a.g()).g(exc)).h("com/google/android/apps/messaging/shared/tachygram/capabilities/TachygramUserTransportAdapter$1", "terminalExceptionCaught", 216, "TachygramUserTransportAdapter.java")).t("Not retryable exception caught; stop retrying %s", exc);
    }

    @Override // defpackage.amdv
    public final void a() {
    }
}
