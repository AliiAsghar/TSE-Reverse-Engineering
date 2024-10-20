package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpg {
    public static final uuf a;
    public static final uuf b;
    public static final uuf c;

    static {
        alor.o("prod", "https://messages.google.com/web/", "preprod", "https://messages-web-preprod.sandbox.google.com/web/", "staging", "https://messages-web-staging.sandbox.google.com/web/", "autopush", "https://messages-web-autopush.sandbox.google.com/web/");
        uuh.m(uuh.b, "ditto_satellite_env", "prod");
        uuh.m(uuh.b, "ditto_sandbox_test_key", "");
        a = uuh.n(uuh.b, "ditto_satellite_enabled", false);
        b = uuh.n(uuh.b, "ditto_satellite_force_disabled", false);
        c = uuh.n(uuh.b, "ditto_satellite_force_wifi_only_mode", false);
        uuh.n(uuh.b, "ditto_satellite_chrome_debugging_enabled", false);
        uuh.f(uuh.b, "fail_to_load_timeout_millis", TimeUnit.SECONDS.toMillis(5L));
        uuh.f(uuh.b, "js_bridge_default_timeout_millis", 500L);
        uuh.f(uuh.b, "js_bridge_long_timeout_millis", TimeUnit.SECONDS.toMillis(5L));
        uuh.n(uuh.b, "is_tablet_form_factor", false);
        uuh.n(uuh.b, "is_phone_form_factor", false);
        uuh.f(uuh.b, "ditto_satellite_attachments_size_limit", 5242880L);
    }
}
