package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahbm {
    public static final Map b;
    public static final String c;
    public static final alwo a = agyj.a;
    private static final anna d = anna.e(':');

    static {
        tm tmVar = new tm();
        b = tmVar;
        tmVar.put("HARDWARE", Build.HARDWARE);
        tmVar.put("MODEL", Build.MODEL);
        tmVar.put("BRAND", Build.BRAND);
        tmVar.put("MANUFACTURER", Build.MANUFACTURER);
        StringBuilder sb = new StringBuilder();
        for (String str : tmVar.keySet()) {
            if (sb.length() == 0) {
                sb.append("[");
            } else {
                sb.append(" ");
            }
            sb.append(str);
            sb.append(" = ");
            sb.append((String) b.get(str));
        }
        sb.append("]");
        c = sb.toString();
    }

    public static String a(Context context, int i) {
        if (ahbb.a) {
            return "#0x".concat(String.valueOf(Integer.toHexString(i)));
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Resources.NotFoundException unused) {
            return "#0x".concat(String.valueOf(Integer.toHexString(i)));
        }
    }

    public static boolean b(Map map, String str) {
        boolean z = true;
        for (String str2 : d.a(str)) {
            int indexOf = str2.indexOf(61);
            if (indexOf >= 0) {
                String str3 = (String) map.get(str2.substring(0, indexOf));
                if (str3 != null) {
                    try {
                        if (!str3.matches(str2.substring(indexOf + 1))) {
                            if (!ahaw.a) {
                                return false;
                            }
                            z = false;
                        }
                    } catch (PatternSyntaxException e) {
                        throw new ahbl("Syntax error", str, e);
                    }
                } else {
                    throw new ahbl("Unknown key", str);
                }
            } else {
                throw new ahbl("Pattern has no '='", str);
            }
        }
        return z;
    }
}
