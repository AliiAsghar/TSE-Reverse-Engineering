package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpy {
    public static final abis a = a("enable_log_saver", true);
    public static final abis b = a("enable_persistent_logging", true);
    public static final abis c = b("default_persistent_log_saver_rotation_set_size", 4);
    public static final abis d;
    public static final abis e;
    public static final abis f;
    public static final abis g;
    public static final abis h;
    public static final abis i;
    public static final abis j;

    static {
        a("enable_realtime_exceptional_logging", false);
        d = b("default_persistent_log_saver_file_limit_bytes", 262144);
        e = a("save_all_logs", false);
        f = c("log_level", "INFO");
        g = a("enable_sensitive_logging", false);
        a("enable_dtmf_tone_logging", false);
        a("should_crash_on_wtf", false);
        h = a("enable_debug_mode", false);
        i = c("tycho_package", "com.google.android.apps.tycho");
        a("enable_woodpecker_persistent_logging", false);
        j = c("bugle_testing_simulation_session_id", "");
    }

    private static abis a(String str, Boolean bool) {
        return acpz.e("carrier_services_".concat(str), bool.booleanValue());
    }

    private static abis b(String str, Integer num) {
        return acpz.c("carrier_services_".concat(str), num);
    }

    private static abis c(String str, String str2) {
        return acpz.d("carrier_services_".concat(str), str2);
    }
}
