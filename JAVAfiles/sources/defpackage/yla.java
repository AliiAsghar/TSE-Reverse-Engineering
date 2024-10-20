package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yla {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/prefs/common/BuglePrefsPrinter");
    private static final alpt g = alpt.v("assistant_request_id", "ditto_active_desktop_id", "ditto_active_desktop_request_id", "firebase_instance_id", "rcs_msisdn", "tachyon_registration_id", "tachyon_private_key", "tachyon_public_key", "tachyon_registration_token", "usage_stats_hash_salt", "UPSELL_PROMPT_SIM_ID");
    private static final alpt h = alpt.s("is_fi_device_", "msisdn_for_iccid_", "rcs_user_id_");
    public final Context b;
    public final yjr c;
    public final yjy d;
    public final ykw e;
    public final zxy f;

    public yla(Context context, yjr yjrVar, yjy yjyVar, ykw ykwVar, zxy zxyVar) {
        this.b = context;
        this.c = yjrVar;
        this.d = yjyVar;
        this.e = ykwVar;
        this.f = zxyVar;
    }

    public static void a(String str, Context context, StringBuilder sb) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        sb.append(a.bW(str, "Prefs for \"", "\":\n"));
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            aluq listIterator = h.listIterator();
            while (true) {
                if (!listIterator.hasNext()) {
                    break;
                }
                String str2 = (String) listIterator.next();
                if (key.startsWith(str2)) {
                    key = String.valueOf(str2).concat("[Redacted]");
                    break;
                }
            }
            sb.append(String.valueOf(key).concat(": "));
            if (value == null) {
                sb.append("null");
            } else if (value instanceof Set) {
                sb.append("is a Set");
            } else if (g.contains(key)) {
                sb.append("Redacted");
            } else if ((value instanceof String) && key.contains("phone_number")) {
                sb.append(yyb.bh(value.toString()));
            } else {
                sb.append(value);
            }
            sb.append("\n");
        }
    }
}
