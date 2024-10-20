package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface uvi {
    public static final utz a = uuh.i(uuh.b, "enable_silent_assert_feedback", false);
    public static final utz b = uuh.i(uuh.b, "enable_silent_crash_issue_notification", false);
    public static final utz c = uuh.f(uuh.b, "user_report_notification_backoff_ms", 2592000000L);

    akul a(Throwable th);

    akul b(Throwable th);

    void c(Throwable th);
}
