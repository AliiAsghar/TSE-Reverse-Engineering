package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class adnu {
    private static adnu d;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final AtomicReference b = new AtomicReference();
    public final aonx c;

    protected adnu() {
        new AtomicReference();
        this.c = new aonx();
    }

    public static adnu a() {
        if (d == null) {
            d = new adnu();
        }
        return d;
    }

    public static final SharedPreferences d(Context context) {
        return context.getSharedPreferences("provisioning_engine_state_cache_common.pref", 0);
    }

    public static final SharedPreferences e(Context context, String str) {
        return context.getSharedPreferences(String.format("provisioning_engine_state_cache_%s.pref", str), 0);
    }

    public static final void f(Context context, String str) {
        e(context, str).edit().putInt("provisioning_engine_replay_count_key", 0).commit();
    }

    @Deprecated
    public static final boolean g(Context context) {
        return d(context).getBoolean("provisioning_engine_google_tos_consent_key", false);
    }

    public static final boolean h(Context context, String str) {
        return e(context, str).getBoolean("provisioning_engine_finished_provisioning_attempt_key", false);
    }

    public static final boolean i(Context context, String str) {
        return e(context, str).getBoolean("provisioning_engine_has_provisioned_once_key_v2", false);
    }

    public static final String j(Context context, String str) {
        return e(context, str).getString("provisioning_engine_provisioning_session_id_key", null);
    }

    public static final String k(Context context, String str) {
        return e(context, str).getString("provisioning_engine_msisdn_key", null);
    }

    public static final String l(Context context, String str) {
        return e(context, str).getString("provisioning_engine_state_key", null);
    }

    public static final int m(Context context, String str) {
        return e(context, str).getInt("provisioning_engine_replay_count_key", 0);
    }

    public static final int n(Context context, String str) {
        return e(context, str).getInt("provisioning_engine_retry_count_key", 0);
    }

    public static final void o(Context context, String str, boolean z) {
        e(context, str).edit().putBoolean("provisioning_engine_finished_provisioning_attempt_key", z).commit();
    }

    public static final void p(Context context, String str, String str2) {
        e(context, str).edit().putString("provisioning_engine_msisdn_key", str2).commit();
    }

    public static final void q(Context context, String str, String str2) {
        e(context, str).edit().putString("provisioning_engine_state_key", str2).commit();
    }

    public static final String r(Context context, String str) {
        if (h(context, str)) {
            advr.c("Already finished a provisioning attempt so no session ID available.", new Object[0]);
            return null;
        }
        return e(context, str).getString("provisioning_engine_provisioning_session_id_key", null);
    }

    @Deprecated
    public final Optional b(Context context, String str) {
        Configuration configuration = null;
        String string = e(context, str).getString("provisioning_engine_rcs_configuration", null);
        if (string != null && !string.equals("null")) {
            try {
                configuration = (Configuration) this.c.i(string, Configuration.class);
            } catch (aook e) {
                advr.i(e, "Failed to parse json.", new Object[0]);
            }
        }
        return Optional.ofNullable(configuration);
    }

    public final Optional c(String str) {
        return Optional.ofNullable((adjl) this.a.get(str));
    }
}
