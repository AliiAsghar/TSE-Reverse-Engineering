package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.ims.provisioning.config.Configuration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aduw extends aduy {
    public aduw(Context context, acob acobVar) {
        super(context, context.getContentResolver(), uhy.a, acobVar);
    }

    public static final String e(String str, apjo apjoVar) {
        return h("phone_number_record_by_sim_and_msisdn_source_", str + "_" + apjoVar.d);
    }

    public final Configuration a(String str) {
        String i = i("provisioning_engine_rcs_configuration_".concat(String.valueOf(str)), "", "bugle");
        try {
            try {
                return (Configuration) new aonx().i(albo.ag(i), Configuration.class);
            } catch (Throwable th) {
                advr.i(th, "Error while parsing RCS Configuration from JSON", new Object[0]);
                return null;
            }
        } catch (Exception e) {
            advr.i(e, "Error while creating Gson object", new Object[0]);
            return null;
        }
    }

    public final String b(String str) {
        return i("rcs_user_id_".concat(String.valueOf(str)), str, "bugle");
    }

    public final UUID c() {
        try {
            return UUID.fromString(i("rcs_provisioning_rcs_default_on_server_update_time_key", "", "bugle"));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Deprecated
    public final boolean d() {
        try {
            return l("enable_simplified_messaging_api", false, "BuglePhenotypeFlagsRelay");
        } catch (adux unused) {
            return false;
        }
    }

    public final void f(String str) {
        Bundle m = aduy.m("is_fi_device_".concat(str), "bugle");
        m.putBoolean("preference_value", true);
        super.g("PUT", "BOOLEAN", m);
    }
}
