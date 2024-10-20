package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xfs {
    private static final utz a = uuh.e(uuh.b, "tachygram_work_handler_retries", 6);
    private static final utz b = uuh.f(uuh.b, "tachygram_work_handler_retry_delay_milliseconds", 10000);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static une a() {
        une a2 = unf.a();
        a2.d(((Integer) a.e()).intValue());
        a2.g(gry.EXPONENTIAL);
        a2.h(((Long) b.e()).longValue());
        a2.c(unv.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE);
        return a2;
    }
}
