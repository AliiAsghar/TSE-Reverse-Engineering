package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uyh {
    public static final alhr a = uuh.y("lighter_enable_lighter");
    public static final alhr b = uuh.y("lighter_enable_component_check");
    public static final alhr c = uuh.y("lighter_trigger_intent_filter_on_account_change");
    public static final utz d = uuh.h(uuh.b, "lighter_learn_more_url", "https://support.google.com/messages/answer/9836003?ref_topic=7501205");
    public static final alhr e = uuh.y("lighter_enable_clear_lighter_notifications_on_home_screen_seen");
    public static final alhr f;
    public static final utz g;

    static {
        uuh.y("enable_lighter_clean_up_handler");
        uuh.y("enable_info_icon_tooltip_auto_popup");
        uuh.f(uuh.b, "lighter_photos_images_ttl_millis", 2592000000L);
        f = uuh.y("enable_lighter_logging");
        g = uuh.f(uuh.b, "lighter_home_action_timeout_millis", 30000L);
    }

    public static final boolean a() {
        if (!kpt.a()) {
            return false;
        }
        if (!((Boolean) ((utz) a.get()).e()).booleanValue() && !oie.a()) {
            return false;
        }
        return true;
    }
}
