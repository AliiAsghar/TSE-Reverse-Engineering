package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akvi {
    private static final alvi a;
    private final aksr b;

    static {
        algs.c('.');
        a = alvi.m("com/google/apps/tiktok/tracing/contrib/xuikit/TikTokXUiKitTracer");
    }

    public akvi(aksr aksrVar) {
        this.b = aksrVar;
    }

    private final void b(Runnable runnable, String str) {
        if (akqj.u()) {
            runnable.run();
            return;
        }
        akrc d = this.b.d(str);
        try {
            runnable.run();
            d.close();
        } catch (Throwable th) {
            try {
                d.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void a(Runnable runnable, String str) {
        akrc akrcVar = null;
        if (akqj.c() instanceof akqc) {
            ((alvg) ((alvg) a.i()).h("com/google/apps/tiktok/tracing/contrib/xuikit/TikTokXUiKitTracer", "maybeCleanUpErrorTrace", 68, "TikTokXUiKitTracer.java")).q("Temporarily overriding an ErrorTrace");
        }
        if (akrcVar != null) {
            try {
                b(runnable, str);
                return;
            } finally {
                akqj.a(akrcVar);
            }
        }
        b(runnable, str);
    }
}
