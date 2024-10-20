package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqmp implements aqmo {
    public static final ahtp a;

    static {
        ahtn a2 = new ahtn(ahsy.a("com.google.android.gms.constellation")).b().a();
        a2.h("VerificationSettings__a2p_hours_before_time_window_end", 0L);
        a2.h("VerificationSettings__a2p_sms_signal_granularity_hrs", 1L);
        a2.h("VerificationSettings__a2p_upload_message_count", 5L);
        new ahti(a2, "VerificationSettings__a2p_url_pattern_matcher", "(?:(?:https?|ftp)://)?[w/-?=%]+\\\\.[w/-?=%]+", true);
        a2.i("VerificationSettings__a2p_use_week_time_window", true);
        a2.h("VerificationSettings__carrier_id_max_verification_attempt_count", 2L);
        a = new ahti(a2, "VerificationSettings__default_policy_id", "", true);
        a2.h("VerificationSettings__expired_gaia_tokens_threshold_seconds", 1800L);
        a2.h("VerificationSettings__flash_call_expect_call_timeout_millis", 60000L);
        a2.h("VerificationSettings__flash_call_expect_fail_timeout_millis", 200L);
        a2.h("VerificationSettings__flash_call_millis_between_interceptions", 10000L);
        a2.i("VerificationSettings__is_1tv_param_in_verify_phone_number_api_allowed", true);
        a2.i("VerificationSettings__is_a2p_enabled", true);
        a2.i("VerificationSettings__is_carrier_id_enabled_for_multi_sim", false);
        a2.i("VerificationSettings__is_dual_sim_parallel_verification_enabled", false);
        a2.i("VerificationSettings__is_eligible_phone_range", false);
        a2.i("VerificationSettings__is_flash_call_enabled", true);
        a2.i("VerificationSettings__is_multi_challenge_verification", false);
        a2.i("VerificationSettings__is_non_persistent_mo_enabled", false);
        a2.i("VerificationSettings__is_one_time_verification_enabled", true);
        a2.i("VerificationSettings__is_required_consent_param_enabled", true);
        a2.i("VerificationSettings__is_silent_mt_enabled", false);
        a2.i("VerificationSettings__is_silent_mt_enabled_for_multi_sim", false);
        a2.i("VerificationSettings__is_verify_phone_number_api_v2_enabled", true);
        a2.h("VerificationSettings__max_task_count", 3L);
        a2.h("VerificationSettings__max_verification_attempt_count", 3L);
        new ahti(a2, "VerificationSettings__mo_ping_intervals_millis", "4000,1000,1000,3000,5000,5000,5000,5000,30000,30000,30000,240000,600000,300000", true);
        a2.h("VerificationSettings__mt_verification_timeout_secs", 1800L);
        a2.h("VerificationSettings__preferred_verification_method", 0L);
        a2.i("VerificationSettings__refresh_expired_gaia_tokens", true);
        a2.i("VerificationSettings__skip_mo_if_no_sms_manager", false);
        a2.h("VerificationSettings__tasks_execution_timeout", 100L);
        a2.i("VerificationSettings__use_package_manager_for_mo_permissions", true);
    }

    @Override // defpackage.aqmo
    public final String a() {
        return (String) a.b();
    }
}
