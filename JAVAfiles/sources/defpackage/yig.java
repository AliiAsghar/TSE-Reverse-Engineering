package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yig {
    public static final utz A;
    public static final utz B;
    public static final utz C;
    public static final alhr D;
    public static final utz E;
    public static final utz F;
    public static final utz G;
    public static final utz H;
    public static final alhr I;
    public static final utz J;
    public static final utz K;
    public static final alhr L;
    public static final alhr M;
    public static final alhr N;
    public static final alhr O;
    public static final utz P;
    public static final alhr Q;
    public static final alhr R;
    public static final alhr S;
    public static final alhr T;
    public static final alhr U;
    public static final utz V;
    public static final alhr W;
    public static final alhr X;
    public static final alhr Y;
    public static final alhr Z;
    public static final alhr aa;
    public static final alhr ab;
    public static final utz ac;
    public static final utz ad;
    public static final utz ae;
    public static final utz af;
    public static final uuf ag;
    public static final utz ah;
    public static final alhr ai;
    public static final utz aj;
    public static final alhr ak;
    public static final alhr al;
    public static final utz am;
    public static final utz an;
    public static final utz ao;
    public static final utz ap;
    public static final utz aq;
    public static final utz ar;
    public static final alhr as;
    public static final alhr at;
    private static final alcq au;
    private static final alcq av;
    public static final uuf d;
    public static final utz e;
    public static final utz f;
    public static final utz g;
    public static final utz h;
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
    public static final utz a = uuh.e(uuh.b, "p2p_conversation_suggestions_limit", 3);
    public static final utz b = uuh.e(uuh.b, "p2p_conversation_suggestions_limit_per_type", 3);
    public static final utz c = uuh.e(uuh.b, "p2p_conversation_suggestions_context_messages_count", 10);

    static {
        int i2 = 10;
        uuh.i(uuh.b, "enable_p2p_conversation_suggestions_in_notifications", false);
        d = uuh.i(uuh.b, "enable_smart_actions_in_notifications", false);
        e = uuh.i(uuh.b, "p2p_conversation_suggestions_fail_fast", false);
        f = uuh.h(uuh.b, "p2p_conversation_suggestions_blacklist", "");
        g = uuh.h(uuh.b, "p2p_conversation_suggestions_input_blacklist", "");
        h = uuh.h(uuh.b, "p2p_conversation_suggestions_context_blacklist", "");
        i = uuh.h(uuh.b, "p2p_conversation_suggestions_assistant_blacklist", "");
        j = uuh.i(uuh.b, "p2p_conversation_suggestions_disable_apk_model", false);
        k = uuh.c(uuh.b, "p2p_conversations_lang_detector_min_prob_threshold", 0.4d);
        l = uuh.h(uuh.b, "p2p_conversation_suggestion_types_reply", "");
        m = uuh.h(uuh.b, "p2p_conversation_suggestion_types_continuation", "");
        n = uuh.h(uuh.b, "p2p_conversation_suggestions_hobbes_mdd_file_id", "");
        o = uuh.h(uuh.b, "p2p_conversation_suggestions_hobbes_mdd_group_name", "");
        p = uuh.i(uuh.b, "sticker_suggestions_setting_enabled", false);
        q = uuh.i(uuh.b, "sticker_suggestions_debug_enabled", false);
        r = uuh.h(uuh.b, "p2p_conversation_suggestions_accepted_languages", "");
        s = uuh.h(uuh.b, "p2p_conversation_suggestions_help_center_link", "https://support.google.com/messages/?p=smart_reply");
        t = uuh.h(uuh.b, "nudge_help_center_link", "https://support.google.com/messages/?p=nudge");
        u = uuh.e(uuh.b, "p2p_conversation_suggestions_num_messages_to_stick", 0);
        uuh.h(uuh.b, "assistant_help_center_question_mark_link", "https://support.google.com/messages/answer/9265111#assistant_help");
        v = uuh.h(uuh.b, "assistant_privacy_tour_context_string", "use_assistant");
        w = uuh.h(uuh.b, "assistant_privacy_tour_learn_more_link", "https://support.google.com/messages/answer/9053541#assistant");
        x = uuh.e(uuh.b, "p2p_conversation_suggestions_num_predictions_multiplier", 2);
        y = uuh.h(uuh.b, "p2p_suggestion_rewriter_mdd_file_spec", "");
        uuh.h(uuh.b, "p2p_suggestion_expressive_content_pack_file_spec", "");
        uuh.h(uuh.b, "p2p_sticker_suggestion_blacklist", "");
        uuh.i(uuh.b, "enable_p2p_conversation_training", false);
        z = uuh.i(uuh.b, "enable_p2p_conversation_training_simple_setting", false);
        A = uuh.h(uuh.b, "federated_learning_promo_popup_learn_more_url", "https://support.google.com/messages?p=federated_learning");
        B = uuh.h(uuh.b, "federated_learning_promo_popup_learn_more_help_and_feedback_topic", "federated_learning");
        C = uuh.n(uuh.b, "enable_smart_compose", false);
        D = uuh.v(173025790);
        uuh.p(173025790, "score");
        uuh.p(173025790, "prefix_length");
        uuh.p(173025790, "suggestion_length");
        uuh.p(173025790, "matched_count");
        uuh.p(173025790, "was_suggestion");
        uuh.p(173025790, "exact_match");
        uuh.i(uuh.b, "mdd_lib_enable_load_from_local", true);
        uuh.u(uuh.b, "suggestion_file_configs_list", aqdi.a, new mdd(9));
        uuh.e(uuh.b, "recent_emotive_content_message_limit", 1000);
        uuh.e(uuh.b, "p2p_contact_share_suggestion_limit", 4);
        uuh.i(uuh.b, "enable_maestro_demo", false);
        E = uuh.h(uuh.b, "assistant_message_base_url", "messages.google.com/, assistant.google.com/");
        uuh.h(uuh.b, "assistant_card_entity_collection_patterns", ".*restaurants.*:restaurant,.*films.*:movie");
        F = uuh.i(uuh.b, "p2p_enable_entity_telemetry", false);
        G = uuh.h(uuh.b, "p2p_suggestion_template_file_spec", "");
        H = uuh.h(uuh.b, "p2p_suggestion_model_based_providers_config_file_specs", "");
        uuh.h(uuh.b, "text_classifier_mdd_webref_model_group", "");
        uuh.h(uuh.b, "mdd_owner_package", "com.google.android.apps.messaging");
        uuh.e(uuh.b, "mdd_task_timeout_milliseconds", 1000);
        uuh.i(uuh.b, "mdd_lib_use_for_file_access", false);
        uuh.i(uuh.b, "mdd_lib_enable_downloads_only", false);
        uuh.i(uuh.b, "mdd_lib_use_webref_populator", false);
        uuh.h(uuh.b, "mdd_lib_slicing_webref_populator_index_group", "");
        uuh.i(uuh.b, "mdd_lib_use_phfilegroup_populator", false);
        uuh.s(uuh.b, "mdd_download_config", new xyn(6));
        uuh.i(uuh.b, "text_classifier_use_mddlib_core_model", false);
        uuh.i(uuh.b, "text_classifier_use_mddlib_actions_model", false);
        uuh.i(uuh.b, "text_classifier_use_mddlib_webref_model", false);
        I = uuh.w("enable_nudge");
        J = uuh.f(uuh.b, "nudge_timestamp_adjustment_millis", 79200000L);
        K = uuh.f(uuh.b, "nudge_expiration_millis", 172800000L);
        aozy createBuilder = alcq.a.createBuilder();
        aozy createBuilder2 = alcr.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        ((alcr) apagVar).b = "(?s)^(Loved|Liked|Disliked|Laughed\\sat|Emphasi[zs]ed|Questioned)\\s\\“(.*)\\”\\Z";
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        ((alcr) createBuilder2.b).c = a.an(3);
        createBuilder.bo(createBuilder2);
        aozy createBuilder3 = alcr.a.createBuilder();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apag apagVar2 = createBuilder3.b;
        ((alcr) apagVar2).b = "(?s)^Removed\\s(?:a|an)\\s(heart|like|dislike|laugh|exclamation|exclamation\\smark|question\\smark)\\sfrom\\s\\“(.*)\\”\\Z";
        if (!apagVar2.isMutable()) {
            createBuilder3.u();
        }
        ((alcr) createBuilder3.b).c = a.an(4);
        createBuilder.bo(createBuilder3);
        alcq alcqVar = (alcq) createBuilder.s();
        au = alcqVar;
        uuh.u(uuh.b, "ios_reaction_message_grammar", alcqVar, new mdd(i2));
        aozy createBuilder4 = alcq.a.createBuilder();
        aozy createBuilder5 = alcr.a.createBuilder();
        if (!createBuilder5.b.isMutable()) {
            createBuilder5.u();
        }
        apag apagVar3 = createBuilder5.b;
        ((alcr) apagVar3).b = "(?s)^\\\u200a[^\\\u200b\\\u200a]*\\\u200b([^\\\u200b]*)\\\u200b[^\\\u200b\\\u200a]*\\\u200a(.*)\\\u200a[^\\\u200b\\\u200a]*\\\u200a\\Z";
        if (!apagVar3.isMutable()) {
            createBuilder5.u();
        }
        ((alcr) createBuilder5.b).c = a.an(3);
        createBuilder4.bo(createBuilder5);
        aozy createBuilder6 = alcr.a.createBuilder();
        if (!createBuilder6.b.isMutable()) {
            createBuilder6.u();
        }
        apag apagVar4 = createBuilder6.b;
        ((alcr) apagVar4).b = "(?s)^\\\u200a[^\\\u200c\\\u200a]*\\\u200c([^\\\u200c]*)\\\u200c[^\\\u200c\\\u200a]*\\\u200a(.*)\\\u200a[^\\\u200c\\\u200a]*\\\u200a\\Z";
        if (!apagVar4.isMutable()) {
            createBuilder6.u();
        }
        ((alcr) createBuilder6.b).c = a.an(4);
        createBuilder4.bo(createBuilder6);
        alcq alcqVar2 = (alcq) createBuilder4.s();
        av = alcqVar2;
        uuh.u(uuh.b, "xms_reaction_message_grammar", alcqVar2, new mdd(i2));
        uuh.w("enable_suggestion_request_type_filtering");
        L = uuh.v(198797510);
        uuh.w("enable_suggestion_persistence_fix");
        M = uuh.w("enable_composable_suggestions_in_conv_1");
        N = uuh.y("enable_penpal_photo_booth");
        O = uuh.y("enable_penpal_emotify");
        P = uuh.b("enable_emotify_reaction_v2", false);
        Q = uuh.y("enable_penpal_conversation");
        uuh.n(uuh.b, "enable_penpal_welcome_2", false);
        uuh.y("enable_penpal_retrigger_suggestions");
        uuh.y("enable_penpal_notification_account_check");
        uuh.y("enable_penpal_nudge");
        R = uuh.y("enable_penpal_delayed_account_listener");
        uuh.p(339454527, "enable_penpal_advanced_feedback");
        uuh.p(366046599, "enable_penpal_conv_latency_fix");
        uuh.p(369701729, "enable_update_login_state_in_tos_confirm_button");
        uuh.p(369551046, "enable_penpal_unavailability_uma");
        uuh.y("enable_penpal_suggestions_june_2024");
        S = uuh.y("enable_penpal_suggestions_sept_2024");
        T = uuh.y("enable_penpal_two_row_suggestions");
        uuh.y("enable_penpal_conversation_emojis");
        uuh.b("force_gaia_for_outgoing_v2", false);
        uuh.y("enable_penpal_message_ttl");
        uuh.y("enable_penpal_location");
        U = uuh.y("laxqkzc");
        uuh.y("enforce_capability_laxqkzc");
        uuh.y("enable_gemini_zippy_tos_eea");
        uuh.y("enable_gemini_zippy_tos_non_eea");
        uuh.y("enable_gemini_tos_zippies");
        V = uuh.a("penpal_maximum_supported_attachments", 1L);
        uuh.a("penpal_message_expiration_ms", 28800000L);
        uuh.a("penpal_reauthenticate_timeout_seconds", 30L);
        uuh.h(uuh.b, "penpal_avatar_url", "https://www.gstatic.com/lamda/images/gemini_logo_d18782fc75dd18853ff70.png");
        W = uuh.y("support_markdown_parsing_in_text_bubbles");
        X = uuh.y("support_images_by_url_in_mediaviewer");
        Y = uuh.y("support_markdown_tables");
        Z = uuh.y("enable_penpal_2");
        uuh.y("enable_penpal_toggle");
        aa = uuh.y("enable_penpal_toggle_121");
        uuh.y("enable_penpal_conversation_feedback_flow");
        uuh.y("enable_penpal_conversation_promotion");
        uuh.y("enable_penpal_conversation_cleanup");
        uuh.p(325090692, "enable_penpal_dasher_check");
        uuh.p(357054531, "enable_penpal_account_changed_fix");
        uuh.a("penpal_conversation_l7_for_hats", 2L);
        ab = uuh.y("enable_receiving_emotify_reaction");
        ac = uuh.d(uuh.b, "emotify_small_segment_ratio", 0.2f);
        ad = uuh.n(uuh.b, "enable_combined_magic_compose", false);
        ae = uuh.n(uuh.b, "enable_magic_compose_conv_2", false);
        af = uuh.n(uuh.b, "enable_magic_compose_view", false);
        uuh.n(uuh.b, "magic_compose_enabled_in_xms", false);
        uuh.n(uuh.b, "enforce_tier_check", true);
        uuh.n(uuh.b, "enable_additional_functionalities_for_magic_compose", false);
        uuh.h(uuh.b, "magic_compose_styles", "TONE_REPHRASE,TONE_SHAKESPEARE,TONE_CHILL,TONE_EXCITED,TONE_RHYMES,TONE_FORMAL,TONE_CONCISE");
        uuh.h(uuh.b, "magic_compose_model_config", "MODEL_PENPAL_PROD");
        ag = uuh.d(uuh.b, "hide_magic_compose_scale_threshold", 230.0f);
        uuh.y("update_conversation_context_query_for_suggested_texts");
        ah = uuh.p(285932916, "always_use_magic_compose_transitions");
        ai = uuh.y("add_shimmer_highlight_to_magic_compose_button");
        aj = uuh.n(uuh.b, "magic_compose_enable_growth_kit_tooltip", false);
        uuh.e(uuh.b, "magic_compose_highlight_impression_limit", 10);
        ak = uuh.y("disable_smarts_tooltips");
        uuh.i(uuh.b, "hide_emotify_reaction_in_conv1", true);
        al = uuh.y("enable_image_captions_with_penpal_conversation");
        am = uuh.n(uuh.b, "enable_magic_rewrite_next", false);
        an = uuh.l(uuh.b, "magic_rewrite_next_id", 1008L);
        ao = uuh.n(uuh.b, "enable_suggested_text_next", false);
        ap = uuh.l(uuh.b, "suggested_text_next_id", 1009L);
        uuh.l(uuh.b, "suggested_text_context_message_count", 10L);
        uuh.n(uuh.b, "mdd_require_device_charging_on_charging_tasks", false);
        uuh.f(uuh.b, "magic_compose_send_logging_delay_ms", 0L);
        aq = uuh.j(uuh.b, "screen_effect_suggestion_latency_threshold", 1000.0f);
        ar = uuh.n(uuh.b, "enable_satellite_esp_approximate_input_format", true);
        uuh.n(uuh.b, "show_photomoji_smart_action", false);
        uuh.y("enable_rpcs_for_gemini_proactive");
        as = uuh.y("enable_probe_message_for_gemini_proactive");
        uuh.y("enable_gemini_proactive_toggle");
        uuh.e(uuh.b, "gemini_show_proactive_toggle_limit", 5);
        at = uuh.y("enable_penpal_spam_enforcement");
        uuh.y("enable_suggestion_shortcuts_conv_2");
    }

    public static boolean a() {
        if (((Boolean) ((utz) ab.get()).e()).booleanValue() && obg.a()) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        return ((Boolean) ad.e()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) ((utz) O.get()).e()).booleanValue();
    }

    public static boolean d() {
        if (!e() && !ier.a() && !abal.c()) {
            return false;
        }
        return true;
    }

    public static boolean e() {
        return ((Boolean) ((utz) I.get()).e()).booleanValue();
    }
}
