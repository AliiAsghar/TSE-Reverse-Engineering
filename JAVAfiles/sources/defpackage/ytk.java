package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ytk {
    public static final uuf a = uuh.f(uuh.b, "verified_sms_c11n_check_interval", TimeUnit.DAYS.toMillis(7));
    public static final uuf b = uuh.f(uuh.b, "verified_sms_valid_key_duration_ms", 1382400000);
    public static final uuf c = uuh.n(uuh.b, "vsms_suppress_unverified_ui", false);
    public static final uuf d = uuh.i(uuh.b, "enable_vsms_diagnostic_rpc", false);
    public static final uuf e = uuh.h(uuh.b, "allowed_senders_diagnostic_rpc_regex", ".^");
    public static final uuf f = uuh.h(uuh.b, "verified_sms_report_diagnostic_link", "https://goto.corp.google.com/vsms-diagnostic-information");

    akul a(String str);

    akul b();

    boolean c();

    boolean d();

    boolean e();
}
