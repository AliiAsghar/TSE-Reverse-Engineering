package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class utw {
    public static final utz A;
    public static final utz B;
    public static final utz C;
    public static final utz D;
    public static final utz E;
    public static final utz F;
    public static final utz G;
    public static final uue H;
    public static final utz I;
    public static final utz J;
    public static final utz K;
    public static final utz L;
    public static final utz M;
    public static final utz N;
    public static final utz O;
    public static final utz P;
    public static final utz Q;
    public static final utz R;
    public static final utz S;
    public static final utz T;
    public static final utz U;
    public static final utz V;
    public static final utz W;
    public static final utz X;
    public static final utz Y;
    public static final utz Z;
    public static final utz aa;
    public static final uuf ab;
    public static final utz ac;
    public static final utz ad;
    public static final utz ae;
    public static final uuf af;
    public static final uuf ag;
    public static final utz i;
    public static final utz j;
    public static final utz k;
    public static final utz l;
    public static final utz m;
    public static final utz n;
    public static final utz o;
    public static final utz p;
    public static final utz q;
    public static final utz r;
    public static final utz s;
    public static final utz t;
    public static final utz u;
    public static final utz v;
    public static final utz w;
    public static final utz x;
    public static final utz y;
    public static final utz z;
    public static final utz a = uuh.i(uuh.b, "enable_c2o_device_camera", false);
    public static final utz b = uuh.i(uuh.b, "enable_c2o_customization", false);
    public static final utz c = uuh.i(uuh.b, "enable_c2o_gif_search", false);
    public static final utz d = uuh.i(uuh.b, "enable_c2o_gif_search_recents", false);
    public static final utz e = uuh.e(uuh.b, "c2o_gif_search_thumbnail_size", 100000);
    public static final utz f = uuh.i(uuh.b, "enable_c2o_expressive_stickers", false);
    public static final utz g = uuh.i(uuh.b, "enable_emoji_button_uplevel", false);
    public static final utz h = uuh.i(uuh.b, "enable_grpc_compression", true);

    static {
        uuh.i(uuh.b, "enable_smart_linkify_flag", false);
        uuh.i(uuh.b, "enable_tclib_smart_linkify", false);
        i = uuh.i(uuh.b, "enable_multi_device", true);
        j = uuh.i(uuh.b, "enable_rbm_sort_messages_by_sent_timestamp", false);
        k = uuh.i(uuh.b, "enable_rbm_trigger_missing_rich_card_thumbnail_download_from_ui", false);
        l = uuh.i(uuh.b, "enable_rbm_generalized_verifier_ui", false);
        m = uuh.h(uuh.b, "listnr_feedback_category", "");
        n = uuh.h(uuh.b, "jibe_global_term_of_service", "https://jibe.google.com/policies/terms/");
        o = uuh.n(uuh.b, "enable_attachment_content_refactor", false);
        p = uuh.n(uuh.b, "enable_draft_ui_decouple", false);
        q = uuh.i(uuh.b, "enable_send_conversation_id_to_gboard", false);
        r = uuh.c(uuh.b, "report_slow_code_ratio", 1.0d);
        s = uuh.e(uuh.b, "minimum_conversation_number", 3);
        t = uuh.h(uuh.b, "rcs_help_url_pattern", "https://support.google.com/messages/?p=eligible&hl=%s");
        u = uuh.c(uuh.b, "async_minimum_timeout_reporting_ratio", 0.0d);
        v = uuh.h(uuh.b, "uma_upload_ratio_map", "");
        w = uuh.i(uuh.b, "enable_link_preview_untrusted_senders", false);
        x = uuh.e(uuh.b, "link_preview_manual_preview_trust_threshold", 3);
        uuh.h(uuh.b, "link_preview_help_center_link", "https://support.google.com/messages/?p=link_previews");
        y = uuh.h(uuh.b, "rich_cards_help_center_link", "https://support.google.com/messages/?p=rich_cards");
        uuh.h(uuh.b, "rich_cards_opt_in_consent_banner_learn_more_link", "");
        uuh.h(uuh.b, "rich_cards_opt_in_consent_banner_help_center_topic", "privacy_tour");
        z = uuh.i(uuh.b, "defer_background_from_broadcast", true);
        A = uuh.i(uuh.b, "actions_use_work_manager", false);
        B = uuh.i(uuh.b, "enable_verbose_bug_reports", false);
        C = uuh.i(uuh.b, "enable_clearcut_throttled_logging", true);
        D = uuh.i(uuh.b, "enable_new_image_compression", false);
        E = uuh.i(uuh.b, "skip_signature_check_for_g1_restore", false);
        F = uuh.f(uuh.b, "orphan_raw_sms_expiration_age_ms", 0L);
        uuh.i(uuh.b, "enable_annotations_indexing", true);
        uuh.i(uuh.b, "enable_non_contact_participant_indexing", true);
        uuh.e(uuh.b, "icing_indexing_batch_size", 20);
        uuh.f(uuh.b, "icing_indexing_all_messages_window_size", 5000L);
        uuh.c(uuh.b, "icing_clearcut_log_sampling_rate", 0.01d);
        G = uuh.h(uuh.b, "expressive_stickers_metadata_version", "1000001");
        H = uuh.s(uuh.b, "expressive_stickers_market_config", new ubz(10));
        I = uuh.e(uuh.b, "recent_expressive_stickers_limit", 12);
        uuh.e(uuh.b, "expressive_stickers_c2o_toggle_button_landing_page", 1);
        uuh.e(uuh.b, "expressive_stickers_c2o_overflow_button_landing_page", 1);
        uuh.i(uuh.b, "enable_expressive_stickers_c2o_my_stickers_button", true);
        J = uuh.e(uuh.b, "generic_worker_action_max_retries", 10);
        K = uuh.i(uuh.b, "enable_lg_default_sim_switch", false);
        L = uuh.i(uuh.b, "enable_non_dds_mms_popup", false);
        M = uuh.i(uuh.b, "enable_camera_gallery_roll", true);
        N = uuh.e(uuh.b, "compose_entry_point_icons_version", 0);
        O = uuh.i(uuh.b, "enable_draft_visual_state", false);
        P = uuh.f(uuh.b, "remote_instance_refresh_interval_ms", TimeUnit.HOURS.toMillis(24L));
        Q = uuh.i(uuh.b, "huawei_mate20_upgrade_cleardata", true);
        R = uuh.i(uuh.b, "enable_self_exclusive_worker", true);
        uuh.i(uuh.b, "enable_gif_staggered_grid_layout", false);
        S = uuh.i(uuh.b, "enabled_verified_sms", false);
        uuh.i(uuh.b, "enable_inbox_archive_animation", false);
        T = uuh.h(uuh.b, "verified_sms_privacy_tour_topic", "verified_sms_pt");
        U = uuh.h(uuh.b, "verified_sms_host_and_port", "verifiedsms-pa.googleapis.com:443");
        uuh.f(uuh.b, "verified_sms_verify_message_timeout_ms", TimeUnit.SECONDS.toMillis(10L));
        V = uuh.f(uuh.b, "verified_sms_key_rotation_frequency_ms", TimeUnit.DAYS.toMillis(14L));
        W = uuh.i(uuh.b, "enable_verified_sms_key_rotation", false);
        X = uuh.i(uuh.b, "force_show_rcs_upsell", false);
        Y = uuh.i(uuh.b, "enable_message_status_logging", false);
        Z = uuh.e(uuh.b, "message_status_logging_cleanup_for_messages_in_final_state_in_days", 2);
        aa = uuh.e(uuh.b, "message_status_logging_cleanup_for_messages_in_non_final_state_in_days", 14);
        uuh.i(uuh.b, "enable_d26r_query_logger", true);
        uuh.c(uuh.b, "d26r_query_logger_uma_upload_ratio", 0.01d);
        uuh.c(uuh.b, "d26r_query_logger_unknown_query_uma_upload_ratio", 0.0d);
        ab = uuh.i(uuh.b, "custom_conversation_scroll_animation", true);
        ac = uuh.i(uuh.b, "debug_menu_default_available", false);
        ad = uuh.i(uuh.b, "force_check_rcs_session_id", true);
        ae = uuh.i(uuh.b, "enable_overlapping_rendering_overriding_in_conversation_message_view", false);
        uuh.i(uuh.b, "enable_logging_send_failure_country_code", false);
        uuh.i(uuh.b, "enable_contact_picker_refactor_logging", false);
        uuh.e(uuh.b, "contact_picker_max_journey_history", -1);
        uuh.i(uuh.b, "enable_sent_timestamp_for_rcs_reports", false);
        af = uuh.n(uuh.b, "use_system_font", false);
        ag = uuh.n(uuh.b, "enable_input_manager_refactor", false);
    }

    public static boolean a(Random random, uuf uufVar) {
        double doubleValue = ((Double) uufVar.e()).doubleValue();
        if (doubleValue <= 0.0d) {
            return false;
        }
        if (doubleValue < 1.0d && random.nextDouble() >= doubleValue) {
            return false;
        }
        return true;
    }
}
