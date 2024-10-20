package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atkn {
    public final boolean a;
    public final Object b;

    public atkn(agmh agmhVar) {
        this((Object) agmhVar, false);
    }

    public final ListenableFuture a(Callable callable, Executor executor) {
        return new andh((alnu) this.b, this.a, executor, callable);
    }

    public final ListenableFuture b(ancr ancrVar, Executor executor) {
        return new andh((alnu) this.b, this.a, executor, ancrVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        int i = 0;
        while (true) {
            Object obj = this.b;
            if (i >= ((alsx) obj).c) {
                return false;
            }
            if (((fvz) ((alog) obj).get(i)).b()) {
                return true;
            }
            i++;
        }
    }

    public final boolean d(CharSequence charSequence, int i) {
        if (charSequence != null && i >= 0 && charSequence.length() - i >= 0) {
            if (this.b != null) {
                char c = 2;
                for (int i2 = 0; i2 < i && c == 2; i2++) {
                    byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                    if (directionality != 0) {
                        if (directionality != 1 && directionality != 2) {
                            switch (directionality) {
                                case 14:
                                case 15:
                                    break;
                                case 16:
                                case 17:
                                    break;
                                default:
                                    c = 2;
                                    break;
                            }
                        }
                        c = 0;
                    }
                    c = 1;
                }
                if (c == 0) {
                    return true;
                }
                if (c == 1) {
                    return false;
                }
            }
            return this.a;
        }
        throw new IllegalArgumentException();
    }

    public atkn(hc hcVar, boolean z) {
        this.b = hcVar;
        this.a = z;
    }

    public atkn(Object obj) {
        this.b = obj;
        this.a = false;
    }

    public atkn(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    public atkn(boolean z, ResolvedRecipient resolvedRecipient) {
        this.a = z;
        this.b = resolvedRecipient;
    }

    public atkn(boolean z, Object obj) {
        this.a = z;
        this.b = obj;
    }

    public atkn() {
        this.a = atmp.a("verbosecompression");
        this.b = new atkm[17];
    }

    public atkn(arwe arweVar, atsg atsgVar, okr okrVar) {
        arweVar.getClass();
        atsgVar.getClass();
        okrVar.getClass();
        this.b = atsgVar;
        aqjn.B("bugle.dsdr_fix_top_app_bar_middle_ui_adapter_impl", "bugle.enable_bugle_sim_info_availability_logging", "bugle.fix_sender_msisdn_on_resend", "bugle.disable_dsdr_crash_on_non_tachygram_sim", "bugle.dsdr_query_group_participants_in_transaction", "cslib.enable_full_stacktrace_logging_in_rcs_mapping_accessor", "bugle.enable_extra_logging_in_rcs_configuration_provider", "bugle.use_new_availability_api_in_chat_readiness_manager", "bugle.use_nna_in_etouffee_encryption_state_supplier", "bugle.use_blocking_executor_in_tachyon_receiver_manager", "bugle.use_new_availability_api_in_convo1", "bugle.use_system_default_sub_id_in_convo1", "bugle.use_cached_conversation_type_in_insert_new_message_action", "bugle.use_new_availability_api_in_rcs_msisdn_accessor", "bugle.use_new_availability_api_in_cms_conversation_builder", "bugle.enable_debug_menu_for_show_sim_status", "bugle.enable_multi_sim_rcs", "bugle.multi_sim_enable_e2ee", "cslib.handle_sim_loaded_in_phone_sims_state_updater", "bugle.use_sim_subscription_info_retriever_for_rcs_availability_log_worker", "bugle.use_cancel_provisioning_for_sim", "bugle.remove_usage_of_default_sim_rcs_apis", "bugle.log_subscription_role", "bugle.log_subscription_id_from_sources", "bugle.enable_dual_sim_support_in_rcs_groups", "bugle.update_conversation_self_id_when_sending_rcs_messages", "bugle.enable_sim_prefs_migration_is_fi_check_on_sim_removal", "bugle.enable_tachygram_reprovision_error_for_multi_sim", "cslib.enable_schedule_provisioning_using_sim_id", "bugle.fallback_if_no_valid_conversation_self_id_in_e2ee_setup", "cslib.enable_rcs_provisioning_manager_logging", "bugle.add_sim_carrier_id_name_to_sim_subscription_info", "cslib.log_event_sim_subscription_provisioning_metadata", "bugle.enable_rcs_success_popup_by_sim_id", "bugle.use_new_rcs_availability_in_subscription_rcs_availability_supplier", "cslib.enable_recurring_metrics_availability_update_for_eligible_sims", "bugle.use_chat_readiness_to_determine_whether_to_send_read_report", "cslib.use_phone_sims_state_cache_for_sim_loaded", "bugle.enable_rcs_local_identity_provider_logging", "bugle.enable_phone_number_length_logging", "cslib.check_phone_number_validity_in_configuration_utils", "bugle.use_chat_readiness_to_determine_whether_to_send_reports", "bugle.enable_active_subscription_fix", "cslib.enable_sim_subscription_comparison_logging", "bugle.remove_rcs_msisdn_accessor_from_rcs_group_telephony_recipients_manager", "bugle.enable_get_max_rcs_file_size_by_sub_id", "bugle.use_chat_readiness_to_determine_whether_to_process_pending_messages", "bugle.enable_provisioning_engine_initialization_in_rcs_limbo_resolver", "bugle.enable_log_availability_comparison_by_sub_id", "cslib.use_sim_subscription_info_retriever_bugle_comparison_logging", "bugle.enable_phone_number_input_by_sim_id", "bugle.enable_log_missing_identity_mapping_event", "bugle.enable_compute_availability_if_not_backfilled", "bugle.enable_empty_sim_id_as_sim_absent", "bugle.get_config_by_sim_in_rcs_utils_get_max_remote_participants", "bugle.create_group_method_participants_limit_by_msisdn", "bugle.enable_phone_number_backfill_in_identity_mapping", "cslib.use_new_apis_notify_rcs_unavailable_worker", "bugle.enable_logging_caller_of_rcs_preferences_sub_id", "bugle.enable_provisioning_state_updater_in_availability_updater_local", "cslib.use_phone_sims_state_cache_for_sims_state_update", "cslib.enable_all_subscriptions_as_verified", "cslib.disable_pesm_for_non_default_call_sim", "cslib.disable_null_sim_subscription_infos_as_defaults", "bugle.enable_get_phone_number_from_message_core_data", "cslib.use_sim_subscription_info_for_iccid_binding", "bugle.enable_sim_subscription_info_lookup_for_sim_id", "cslib.enable_rcs_not_enabled_if_no_sim_subscription_info", "cslib.enable_is_sim_loaded_comparison_event", "bugle.remove_default_sub_id_in_process_file_transfer_action", "bugle.enable_counters_phone_sims_state_update", "bugle.get_rcs_config_by_sub_id_in_usage_statististics", "bugle.enable_get_phone_number_from_saved_message_core_data", "bugle.enable_get_sub_phone_number_from_saved_message_core_data", "bugle.persist_rcs_enabled_when_sim_is_enabled_by_default", "bugle.enable_compute_availability_from_availability_util", "bugle.enable_register_sms_port_per_sim", "bugle.enable_multi_sim_logging_rcs_availability_log_worker", "bugle.process_default_sms_changed_intent_for_dsdr", "bugle.enable_unified_self_chat_endpoint_mapping_in_incoming_path", "bugle.assert_self_identity_on_remote_registrations_download", "cslib.enable_lookup_by_sim_subscription_info_retriever", "cslib.deprecate_sim_state_tracker", "bugle.enable_mobile_configuration_retriever_for_provisioning_request_builder", "bugle.passing_self_to_get_rcs_readiness_conditions", "bugle.update_conversation_self_id_on_message_received_even_if_null_or_empty", "bugle.enable_relaxed_provisioning_rules", "bugle.enable_sub_id_from_sim_id_mapping_from_disk", "bugle.remove_ready_to_send_and_receive_rcs_on_any_sub", "bugle.show_active_sim_module", "bugle.use_sim_slot_from_send_or_view_intent_to_pass_self_identity_to_conversation_creation", "bugle.enable_home_screen_queries_from_conversation_to_participants", "bugle.unify_common_logic_for_getting_sub_ids_flag", "bugle.copy_sender_messaging_identity_for_rcs_to_mms_fallback", "bugle.enable_context_registered_receiver", "bugle.enable_multi_sim_explicit_carrier_tos", "bugle.use_cached_conversation_type_in_send_message_queuer", "bugle.mark_other_self_sim_in_conversation_details_page", "bugle.always_pass_self_identity_to_start_chat_if_available", "bugle.fix_race_condition_in_sim_chat_transport_manager", "bugle.enable_active_self_filtering_in_draft_editor", "bugle.assert_self_for_e2ee_in_ditto_response_builder", "bugle.update_active_self_in_group", "bugle.disable_kick_off_update_active_transport_in_ctc_migration", "bugle.enable_provisioning_rule_provider", "bugle.enable_rbm_sim_picker", "bugle.enable_transport_name_for_logging_ctc_migration", "bugle.enable_e2ee_downgrade_when_no_subscription_from_ditto", "bugle.dsdr_restore_current_self_id_during_d2d_restore", "bugle.enable_async_identity_provider", "bugle.show_sim_name_for_one_self_identity_group", "bugle.assert_self_in_e2ee_info_data_source", "bugle.enable_relaxed_provisioning_rules", "bugle.enable_rcs_provisioning_manager_identity_mapping_removal_logging", "bugle.show_sim_name_for_self_reaction", "bugle.enable_rcs_availability_provider_in_fi_account_data_service", "bugle.revamp_chat_identity_settings_selection_screen", "bugle.pass_self_identity_via_leave_rcs_group_params_proto_flag", "bugle.disable_phone_number_backfill_on_empty_configuration");
        atsgVar.g();
        this.a = false;
    }

    public atkn(ghw ghwVar) {
        this.b = ((alob) ghwVar.a).g();
        d.t(!r2.isEmpty(), "The sequence must contain at least one EditedMediaItem.");
        this.a = false;
    }

    public atkn(boolean z) {
        this(z, arnx.a);
    }

    public atkn(agmh agmhVar, byte[] bArr) {
        this((Object) agmhVar, true);
    }
}
