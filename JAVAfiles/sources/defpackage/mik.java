package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mik {
    public static final alhr a = uuh.y("cobalt_logger_enabled");
    public static final alhr b = uuh.y("app_install_action_metric_enabled");
    public static final alhr c = uuh.y("active_user_action_metric_enabled");
    public static final utz d;
    public static final alhr e;
    public static final alhr f;
    public static final uuf g;
    public static final uuf h;

    static {
        uuh.e(uuh.b, "cobalt_logger_uploading_interval_in_hours", 1);
        d = uuh.e(uuh.b, "cobalt_init_sync_interval_in_hours", 8);
        e = uuh.y("use_blocking_executor");
        f = uuh.y("use_background_executor");
        ahtn ahtnVar = uuh.b;
        aozy createBuilder = aplg.a.createBuilder();
        createBuilder.by(alog.C("US", "GB", "DE", "FR", "IN", "ES", "IT", "ZA", "BR", "MX", "CA", "AU", new String[0]));
        g = uuh.u(ahtnVar, "am_top_slice_country_codes", (aplg) createBuilder.s(), new mdd(3));
        ahtn ahtnVar2 = uuh.b;
        aozy createBuilder2 = aplg.a.createBuilder();
        createBuilder2.by(alog.A("LG", "SAMSUNG", "GOOGLE", "XIAOMI", "OPPO", "VIVO", "MOTOROLA", "TECNOMOBILELIMITED", "ONEPLUS", "HMDGLOBAL"));
        h = uuh.u(ahtnVar2, "am_top_slice_manufacturers", (aplg) createBuilder2.s(), new mdd(3));
    }
}
