package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xoo {
    private static final utz b = uuh.e(uuh.b, "file_transfer_progress_threshold_bytes", 512);
    public static final utz a = uuh.f(uuh.b, "file_transfer_progress_notifications_after_milliseconds", 0);
    private static final utz c = uuh.e(uuh.b, "file_transfer_idle_timeout_seconds", 5);
    private static final utz d = uuh.e(uuh.b, "file_transfer_max_retries_for_download", 7);

    public static int a() {
        return ((Integer) d.e()).intValue();
    }

    public static int b() {
        return ((Integer) b.e()).intValue();
    }

    public static aozn c() {
        return apdp.e(((Integer) c.e()).intValue(), 0);
    }
}
