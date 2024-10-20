package defpackage;

import android.text.TextUtils;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agyu {
    public static final agyb a;
    static final agyb b;

    static {
        String str;
        agyd.d("haptic_improvement_long_press_effect");
        a = agyd.a("vibration_effect_min_sdk", 1024L);
        agyb a2 = agyd.a("config_haptic_cutoff", 200L);
        ahbc ahbcVar = ahbc.b;
        synchronized (ahbcVar) {
            if (ahbcVar.c.containsKey("ro.com.google.ime.haptic.cutoff")) {
                str = (String) ahbcVar.c.get("ro.com.google.ime.haptic.cutoff");
            } else {
                Method method = ahbcVar.d;
                String str2 = null;
                if (method != null) {
                    try {
                        String str3 = (String) method.invoke(null, "ro.com.google.ime.haptic.cutoff");
                        if (!TextUtils.isEmpty(str3)) {
                            str2 = str3;
                        }
                    } catch (Exception e) {
                        ((alvg) ((alvg) ((alvg) ahbc.a.i()).g(e)).h("com/google/android/libraries/inputmethod/systemproperty/SystemProperties", "readSystemProperty", 126, "SystemProperties.java")).t("Fail to invoke SystemProperties.get(%s)", "ro.com.google.ime.haptic.cutoff");
                    }
                }
                ahbcVar.c.put("ro.com.google.ime.haptic.cutoff", str2);
                str = str2;
            }
        }
        if (!TextUtils.isEmpty(str) && a2.a(agyi.OEM, false) == null) {
            try {
                ((agye) a2).h(agyi.OEM, Long.valueOf(Long.parseLong(str)));
            } catch (NumberFormatException e2) {
                ((alvg) ((alvg) ((alvg) agyd.a.i()).g(e2)).h("com/google/android/libraries/inputmethod/flag/FlagFactory", "createLongFlagWithSystemProperty", 228, "FlagFactory.java")).D("Fail to parse long for %s: %s", "ro.com.google.ime.haptic.cutoff", str);
            }
        }
        b = a2;
    }
}
