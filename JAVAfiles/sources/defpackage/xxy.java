package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xxy {
    public static final utz a;
    public static final utz b;
    public static final alhr c;
    public static final alhr d;
    public static final utz e;
    public static final alhr f;
    public static final utz g;
    public static final utz h;
    public static final alhr i;
    public static final utz j;
    public static final utz k;
    public static final alhr l;

    static {
        uuh.h(uuh.b, "fi_transfer_to_messages_learn_more_url", "https://support.google.com/fi/?p=transfertomessages");
        uuh.i(uuh.b, "enable_growthkit_flow", false);
        uuh.e(uuh.b, "max_page_restore_attempts", 13);
        uuh.e(uuh.b, "cms_backup_network_failure_max_retries", 26);
        uuh.e(uuh.b, "cms_backup_max_retries", 22);
        uuh.e(uuh.b, "cms_media_sync_max_retries", 3);
        uuh.e(uuh.b, "cms_media_backup_max_attempts_in_pwq", 7);
        a = uuh.i(uuh.b, "enable_cms_bnr_settings", false);
        uuh.h(uuh.b, "fi_transfer_to_messages_non_hangouts_learn_more_url", "https://support.google.com/fi/?p=transfertomessages");
        b = uuh.h(uuh.b, "fi_stop_syncing_learn_more_url", "https://support.google.com/fi/?p=stopsyncing");
        uuh.h(uuh.b, "fi_turn_off_chat_features_learn_more_url", "https://support.google.com/fi/?p=turnoffchatfeatures");
        uuh.w("cms_enable_key_retrieval_client_in_debug_menu");
        c = uuh.w("cms_enable_requires_battery_not_low");
        uuh.w("cms_fi_delete_button");
        uuh.w("cms_check_for_missing_restore_work");
        uuh.w("mark_backup_scheduled_life_cycle");
        uuh.w("record_initial_sync_progress");
        d = uuh.w("enable_bnr_storage_card");
        e = uuh.i(uuh.b, "redirect_user_to_new_backup_settings_screen", false);
        uuh.w("cms_prompt_fi_sign_in");
        uuh.f(uuh.b, "fi_account_status_tracker_synclet_run_interval_ms", 86400000L);
        uuh.w("cms_include_message_metadata_fields");
        f = uuh.w("show_backup_promo_popup");
        uuh.w("enable_suppressing_cms_box_events");
        uuh.w("cms_backup_rcs_conference_uri");
        uuh.w("cms_copy_multi_device_and_initial_sync_status");
        uuh.w("enable_calling_get_user_storage_info");
        uuh.w("enable_pausing_backup_for_storage_info");
        uuh.w("bnr_initial_sync_media_uses_battery_charging_constraints");
        uuh.i(uuh.b, "enable_exposed_apis_for_bbg1", false);
        uuh.i(uuh.b, "enable_bnr_auto_enablement", false);
        uuh.f(uuh.b, "notification_received_timestamp_threshold", 86400000L);
        uuh.c(uuh.b, "user_cloud_storage_usage_threshold", 0.99d);
        uuh.e(uuh.b, "cms_backfill_missing_field_query_page_size", 50);
        g = uuh.e(uuh.b, "max_cms_deleted_messages_buffer_size", 50);
        h = uuh.f(uuh.b, "cms_deleted_messages_buffer_expiration_duration_in_days", 7L);
        uuh.f(uuh.b, "cms_dependency_cache_expiration_duration_in_days", 7L);
        i = uuh.w("enable_conversation_completeness");
        uuh.i(uuh.b, "locally_restored_media_deletion_kill_switch", false);
        uuh.w("upload_media_in_backup_delegate_for_incremental_backup");
        uuh.w("enable_user_reference_bnr");
        uuh.e(uuh.b, "cms_restore_top_conversations_limit", 15);
        j = uuh.e(uuh.b, "linked_account_async_get_timeout", 500);
        k = uuh.e(uuh.b, "linked_account_async_get_timeout", 30000);
        uuh.f(uuh.b, "cms_d2d_feature_manager_stale_timestamp_threshold_in_days", 24L);
        uuh.f(uuh.b, "cms_delta_sync_manager_stale_timestamp_threshold_in_days", 24L);
        uuh.w("use_foreground_service_during_restore");
        uuh.f(uuh.b, "max_restore_foreground_service_duration_ms", 900000L);
        uuh.f(uuh.b, "max_media_backup_foreground_service_duration_ms", 900000L);
        uuh.f(uuh.b, "slow_restore_page_threshold_ms", 300000L);
        uuh.i(uuh.b, "enable_report_issue_notification_for_restore_failures", false);
        uuh.e(uuh.b, "report_issue_notification_dlq_count_threshold", 5);
        uuh.f(uuh.b, "report_issue_notification_cooldown_ms", 3600000L);
        l = uuh.w("enable_keep_alive_strategy_pwq_v2");
        uuh.w("enable_restore_top_conversations_and_messages");
        uuh.w("fi_normalize_phone_number");
        uuh.w("enable_bnr_from_esi_entitlement_flag");
    }

    public static boolean a() {
        if (((Boolean) a.e()).booleanValue() && anfi.a("bugle.enable_backup_and_restore_autoramp", "bugle") && xyp.a != 108) {
            return true;
        }
        return false;
    }
}
