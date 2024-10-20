package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgx {
    public static final uuf a = uuh.n(uuh.b, "enable_prime_jank_metrics", false);
    public static final uuf b = uuh.n(uuh.b, "primes_jank_monitor_all_activities", false);
    public static final uuf c = uuh.n(uuh.b, "enable_stall_metrics", false);
    public static final uuf d = uuh.k(uuh.b, "stalls_initial_monitoring_delay_ms", 250);
    public static final uuf e = uuh.k(uuh.b, "stalls_check_for_response_interval_ms", 250);
    public static final uuf f = uuh.k(uuh.b, "stalls_mid_stall_interval_ms", 250);
    public static final uuf g;
    public static final uuf h;
    public static final uuf i;
    public static final uuf j;
    static final uuf k;
    static final uuf l;
    public static final uuf m;
    public static final uuf n;
    public static final uuf o;
    public static final uuf p;
    public static final uuf q;

    static {
        ahtn ahtnVar = uuh.b;
        aozy createBuilder = aplf.a.createBuilder();
        createBuilder.bf(1000);
        createBuilder.bf(2500);
        createBuilder.bf(5000);
        g = uuh.u(ahtnVar, "stalls_threshold_list_ms", (aplf) createBuilder.s(), new mdd(2));
        h = uuh.k(uuh.b, "stalls_post_to_main_interval_ms", 250);
        i = uuh.n(uuh.b, "enable_cpu_profiling_v2", false);
        j = uuh.n(uuh.b, "enable_native_crash_reporting", false);
        k = uuh.n(uuh.b, "enable_memory_monitoring", false);
        l = uuh.n(uuh.b, "enable_network_monitoring", false);
        m = uuh.n(uuh.b, "enable_auto_url_sanitization_for_network_monitoring", false);
        n = uuh.n(uuh.b, "enable_metric_extension_for_network_monitoring", false);
        o = uuh.n(uuh.b, "enable_latency_monitoring", false);
        p = uuh.n(uuh.b, "enable_package_monitoring", false);
        q = uuh.n(uuh.b, "enable_battery_monitoring", false);
    }

    public final boolean a() {
        return ((Boolean) k.e()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) l.e()).booleanValue();
    }
}
