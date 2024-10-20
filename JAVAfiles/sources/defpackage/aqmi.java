package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqmi implements aqmh {
    public static final ahtp a;
    public static final ahtp b;

    static {
        ahtn a2 = new ahtn(ahsy.a("com.google.android.gms.auth_account")).b().a();
        a2.k("getTokenRefactor__account_data_service_sample_percentage");
        a2.i("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        a2.h("getTokenRefactor__account_manager_timeout_seconds", 20L);
        a2.h("getTokenRefactor__android_id_shift", 0L);
        a = new ahtl(a2);
        a2.i("getTokenRefactor__chimera_get_token_evolved", true);
        a2.h("getTokenRefactor__clear_token_timeout_seconds", 20L);
        a2.h("getTokenRefactor__default_task_timeout_seconds", 20L);
        a2.i("getTokenRefactor__gaul_accounts_api_evolved", false);
        b = a2.i("getTokenRefactor__gaul_token_api_evolved", false);
        a2.h("getTokenRefactor__get_token_timeout_seconds", 120L);
        a2.i("getTokenRefactor__gms_account_authenticator_evolved", true);
        a2.k("getTokenRefactor__gms_account_authenticator_sample_percentage");
    }

    @Override // defpackage.aqmh
    public final aplg a() {
        return (aplg) a.b();
    }

    @Override // defpackage.aqmh
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}
