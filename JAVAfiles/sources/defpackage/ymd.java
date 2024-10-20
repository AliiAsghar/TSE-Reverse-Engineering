package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ymd {
    public static final utz a = uuh.e(uuh.b, "cs_user_replies_threshold", 5);
    public static final alhr b = uuh.x(191513431, "moirai_enable_spam_reporting");
    public static final utz c = uuh.i(uuh.b, "disable_logging_spam_consent", false);
    public static final utz d = uuh.i(uuh.b, "enable_on_device_stranger_danger", false);
    public static final uuf e;
    public static final uuf f;
    public static final alhr g;
    public static final alhr h;
    public static final utz i;
    public static final alhr j;
    public static final alhr k;
    public static final alhr l;
    public static final alhr m;
    public static final alhr n;
    public static final alhr o;
    public static final alhr p;
    public static final alhr q;
    public static final utz r;
    private static final alhr s;

    static {
        uuh.w("spam_send_server_info_to_hades");
        uuh.w("spam_run_moirai_precheck_before_odsd");
        uuh.i(uuh.b, "enable_moirai_spam_protection", false);
        e = uuh.e(uuh.b, "tachyon_max_number_of_messages_to_send", 10);
        f = uuh.e(uuh.b, "spam_max_number_of_messages_to_send_to_carrier", 10);
        g = uuh.w("add_block_and_spam_action_for_one_on_one_conversations");
        h = uuh.y("enable_tartarus_v2");
        uuh.y("enable_tartarus_v2_text_classification");
        uuh.h(uuh.b, "moirai_text_classification_blob_id", "");
        uuh.h(uuh.b, "moirai_destination_classification_blob_id", "");
        uuh.f(uuh.b, "moirai_destination_classification_update_frequency_hours", 24L);
        uuh.h(uuh.b, "moirai_region", "");
        i = uuh.f(uuh.b, "spam_notification_delay_timeout_ms", 4000L);
        j = uuh.w("enable_safe_url_on_click_check");
        k = uuh.y("enable_show_dialog_on_stranger_link_click");
        l = uuh.y("exempt_otp_from_spam_notification_delay");
        m = uuh.y("enable_delay_eligibility_check_all_participants_contact");
        n = uuh.y("enable_delay_eligibility_check_first_message_convo");
        o = uuh.y("spam_ignore_actions_from_short_codes");
        s = uuh.y("spam_expand_policy_config_destination_type_country_protocol");
        uuh.y("spam_hades_enable_westworld_logging");
        uuh.y("spam_hades_disable_migration_clearcut_logging");
        uuh.y("spam_use_message_wrapper_5");
        p = uuh.y("enable_spatula_classification");
        q = uuh.y("ondevice_content_early_rejection_enabled");
        r = uuh.i(uuh.b, "enable_spam_rcs_location_text_killswitch", true);
    }

    public static final boolean a() {
        if (!((Boolean) c.e()).booleanValue()) {
            return true;
        }
        return false;
    }

    public static final boolean b() {
        Object e2 = ((utz) p.get()).e();
        e2.getClass();
        return ((Boolean) e2).booleanValue();
    }

    public static final boolean c() {
        Object e2 = ((utz) q.get()).e();
        e2.getClass();
        return ((Boolean) e2).booleanValue();
    }

    public static final Boolean d() {
        return (Boolean) ((utz) s.get()).e();
    }
}
