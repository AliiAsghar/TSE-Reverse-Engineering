package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vbh {
    public static final utz a;
    public static final utz b;

    @Deprecated
    public static final utz c;
    public static final utz d;
    public static final utz e;
    public static final utz f;
    public static final utz g;
    public static final utz h;
    public static final utz i;
    public static final utz j;
    public static final utz k;
    public static final utz l;

    static {
        uuh.h(uuh.b, "tachyon_media_path", "https://instantmessaging-pa.googleapis.com/upload");
        a = uuh.f(uuh.b, "tachyon_registration_timeout_slop_ms", TimeUnit.MINUTES.toMillis(10L));
        b = uuh.h(uuh.b, "tachyon_registration_pin", "");
        c = uuh.i(uuh.b, "tachyon_phone_registration", true);
        d = uuh.h(uuh.b, "jibe_pcscf_regex", ".*telephony.goog$");
        e = uuh.e(uuh.b, "bind_retry_delay_scale_factor", 1);
        f = uuh.e(uuh.b, "phone_pong_watchdog_seconds", 15);
        g = uuh.e(uuh.b, "phone_idle_timeout_seconds", 65);
        h = uuh.e(uuh.b, "phone_bind_retry_times", 2);
        i = uuh.e(uuh.b, "ditto_pong_watchdog_seconds", 15);
        j = uuh.e(uuh.b, "ditto_idle_timeout_seconds", 65);
        k = uuh.e(uuh.b, "ditto_bind_retry_times", 3);
        uuh.e(uuh.b, "gditto_pong_watchdog_seconds", 15);
        uuh.e(uuh.b, "gditto_idle_timeout_seconds", 65);
        uuh.e(uuh.b, "gditto_bind_retry_times", 2);
        uuh.e(uuh.b, "cms_pong_watchdog_seconds", 15);
        uuh.e(uuh.b, "cms_idle_timeout_seconds", 65);
        uuh.e(uuh.b, "cms_bind_retry_times", 2);
        l = uuh.e(uuh.b, "bind_handler_pull_delay_seconds", 2);
    }
}
