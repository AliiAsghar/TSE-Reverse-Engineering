package defpackage;

import android.text.TextUtils;
import j$.net.URLDecoder;
import j$.net.URLEncoder;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vqr implements vqq {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcs/RcsTelephonyStringsImpl");
    private static final Pattern b = Pattern.compile("^(.*)_;_(.*)_;_#(?:[0-9a-fA-F]){6}@bot.rcs.google.com$");
    private final armf c;

    public vqr(armf armfVar) {
        this.c = armfVar;
    }

    @Override // defpackage.vqq
    public final String a(String str, String str2, String str3) {
        String str4;
        if (str != null) {
            str4 = URLEncoder.encode(str.replace("@", "__AT__"));
        } else {
            str4 = "";
        }
        String format = String.format("%s_;_%s_;_%s@bot.rcs.google.com", str4, str2, str3.toUpperCase(Locale.US));
        alvw g = a.g();
        g.X(alwp.a, "Bugle");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyStringsImpl", "buildRbmBotBackupContactName", 153, "RcsTelephonyStringsImpl.java")).t("Created contact name %s", format);
        return ((yst) this.c.b()).d(format);
    }

    @Override // defpackage.vqq
    public final String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        if (str2 != null) {
            String encode = URLEncoder.encode(str2);
            sb.replace(0, encode.length(), encode);
        }
        return sb.toString();
    }

    @Override // defpackage.vqq
    public final boolean c(String str) {
        return g(str, b);
    }

    @Override // defpackage.vqq
    public final boolean d(String str) {
        if (!g(str, vxl.b) && !g(str, vxl.a)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.vqq
    public final wyj e(String str) {
        if (c(str)) {
            String c = ((yst) this.c.b()).c(str);
            if (c == null) {
                alvw d = a.d();
                d.X(alwp.a, "Bugle");
                ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyStringsImpl", "getDecodedRbmBotThreadInfo", 184, "RcsTelephonyStringsImpl.java")).q("decodedBackupContactName is null");
                return null;
            }
            List c2 = anna.g("_;_").c(c.substring(0, c.length() - 19));
            if (c2.size() == 3 && !TextUtils.isEmpty((CharSequence) c2.get(0))) {
                return new wyj(((String) c2.get(0)).replace("__AT__", "@"), (String) c2.get(1), (String) c2.get(2));
            }
        }
        return null;
    }

    @Override // defpackage.vqq
    public final String f(wyj wyjVar) {
        return a((String) wyjVar.b, (String) wyjVar.a, (String) wyjVar.c);
    }

    final boolean g(String str, Pattern pattern) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String c = ((yst) this.c.b()).c(str);
        if (c == null) {
            alvw d = a.d();
            d.X(alwp.a, "Bugle");
            ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyStringsImpl", "isBackupContact", 112, "RcsTelephonyStringsImpl.java")).q("isBackupContact() returning false because decodedAddress is null");
            return false;
        }
        Matcher matcher = pattern.matcher(c);
        if (!matcher.matches()) {
            return false;
        }
        try {
            URLDecoder.decode(albo.ag(matcher.group(1)));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
