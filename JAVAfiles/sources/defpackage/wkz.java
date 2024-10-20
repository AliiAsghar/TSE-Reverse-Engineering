package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wkz {
    public static final utz a;

    static {
        uuh.w("enable_xms_reactions_sending");
        uuh.i(uuh.b, "show_notifications_for_all_incoming_reactions", false);
        uuh.i(uuh.b, "enable_reactions_configurable_logging", false);
        uuh.h(uuh.b, "reactions_configurable_log_level", "FINEST");
        uuh.e(uuh.b, "reactions_xms_search_message_limit", 50);
        uuh.e(uuh.b, "reactions_xms_matched_result_limit", 2);
        uuh.e(uuh.b, "reactions_matcher_duplicate_distance_limit", 30);
        a = uuh.i(uuh.b, "disable_reactions_promo_for_hawkeye", false);
    }
}
