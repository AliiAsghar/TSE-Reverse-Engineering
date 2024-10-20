package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqmy implements aqmx {
    public static final ahtp a;

    static {
        ahtn a2 = new ahtn(ahsy.a("com.google.android.gms.fido")).b().a();
        a2.i("Passkeys__always_hide_consent_page_in_registration", true);
        a2.i("Passkeys__check_all_keys", false);
        a2.i("45640311", false);
        a2.i("Passkeys__check_sync_status", true);
        a2.i("Passkeys__client_data_hash_override_for_security_keys", false);
        a2.i("Passkeys__direct_assetlinks", false);
        a2.h("Passkeys__direct_assetlinks_cache_seconds", 604800L);
        new ahti(a2, "Passkeys__direct_assetlinks_rpids", "*", true);
        a2.i("Passkeys__dispatch_prf_via_credman", true);
        a2.i("Passkeys__enable_account_sort_by_last_used_for_create_password_passkey", true);
        a2.i("Passkeys__enable_use_another_device_button_when_no_lskf", true);
        new ahti(a2, "Passkeys__help_center_url", "https://support.google.com/accounts/answer/6208650", true);
        a2.i("Passkeys__hide_consent_page_in_registration_enabled", true);
        a2.i("Passkeys__ignore_stop_during_hybrid_request", true);
        a = a2.i("Passkeys__json_for_parcelables", false);
        a2.i("Passkeys__log_domain_recoverability", true);
        a2.i("Passkeys__passkey_entries_use_gpm_icon", false);
        a2.i("Passkeys__reencrypt_passkey", false);
        a2.i("Passkeys__register_intent_launcher_early", false);
        a2.i("Passkeys__set_key_version", true);
        a2.i("Passkeys__set_should_offer_reset", false);
        a2.h("Passkeys__should_show_welcome_fragment", -1L);
        a2.i("Passkeys__skip_consent_after_retrieval", false);
        a2.i("Passkeys__skip_consent_screen", false);
        a2.i("45653715", false);
        a2.i("Passkeys__use_result_receiver", false);
    }

    @Override // defpackage.aqmx
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }
}
