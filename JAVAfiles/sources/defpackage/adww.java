package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adww {
    private static final Pattern a = Pattern.compile("^(messages\\.android_(\\d{8})_(\\d+)_rc(\\d+)).*$");
    private static final Pattern b = Pattern.compile("^.*(carrierservices_\\d{8}(_\\d+)?).*$");
    private static final Pattern c = Pattern.compile("^(carrierservices\\.android_(\\d{8}(_\\d+)?(_rc\\d+)?))(\\..*)?$");

    public static int a(Context context) {
        try {
            return f(context, context.getPackageName()).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public static String b(Context context) {
        String c2 = c(context, "com.google.android.apps.messaging");
        if (c2 == null) {
            return "unknown";
        }
        String lowerCase = c2.toLowerCase(Locale.US);
        String str = "phone";
        if (!lowerCase.contains("phone")) {
            str = "wear";
            if (!lowerCase.contains("wear")) {
                return "unknown";
            }
        }
        return str;
    }

    public static String c(Context context, String str) {
        try {
            return f(context, str).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean d(Context context) {
        return b(context).equals("wear");
    }

    public static String e(Context context, int i, int i2) {
        if ("com.google.android.apps.messaging".equals(context.getPackageName())) {
            String c2 = c(context, "com.google.android.apps.messaging");
            if (c2 == null) {
                advr.q("Null version name extracted for Bugle.", new Object[0]);
                return "";
            }
            Pattern pattern = a;
            Matcher matcher = pattern.matcher(c2.toLowerCase(Locale.US));
            if (!matcher.matches()) {
                advr.q("Bugle's version name [%s] doesn't match the expected format [%s].", c2, pattern);
                int i3 = i / 1000;
                Locale locale = Locale.US;
                Integer valueOf = Integer.valueOf(i3 / 10000);
                Integer valueOf2 = Integer.valueOf((i3 / 1000) % 10);
                return String.format(locale, "b%dv%dv%03d-%d.%d", valueOf, valueOf2, Integer.valueOf(i3 % 1000), valueOf, valueOf2);
            }
            if (i2 == 1) {
                return String.format("%s-%s.%s", albo.ag(matcher.group(2)), albo.ag(matcher.group(3)), albo.ag(matcher.group(4)));
            }
            return albo.ag(matcher.group(1));
        }
        String c3 = c(context, "com.google.android.ims");
        if (c3 == null) {
            advr.q("Null version name extracted for cs apk", new Object[0]);
            return "";
        }
        Pattern pattern2 = b;
        Matcher matcher2 = pattern2.matcher(c3.toLowerCase(Locale.US));
        Matcher matcher3 = c.matcher(c3.toLowerCase(Locale.US));
        if (matcher3.matches()) {
            if (i2 == 1) {
                return albo.ag(matcher3.group(2));
            }
            return albo.ag(matcher3.group(1));
        }
        if (!matcher2.find()) {
            advr.q("CS.apk's version name [%s] doesn't match the expected format [%s].", c3, pattern2);
            return g(c3);
        }
        if (i2 == 1) {
            return g(c3);
        }
        return albo.ag(matcher2.group(1));
    }

    private static PackageInfo f(Context context, String str) {
        return context.getPackageManager().getPackageInfo(str, 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(9:29|30|4|5|6|(6:8|(4:11|(2:15|16)|17|9)|20|21|22|23)|26|22|23)|3|4|5|6|(0)|26|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        defpackage.advr.i(r7, "Error getting the build version name from package info", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042 A[Catch: NumberFormatException -> 0x0069, TryCatch #2 {NumberFormatException -> 0x0069, blocks: (B:6:0x003c, B:8:0x0042, B:9:0x0048, B:11:0x004e, B:15:0x005a, B:17:0x005d, B:21:0x0060), top: B:5:0x003c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String g(java.lang.String r7) {
        /*
            r0 = 46
            int r1 = r7.indexOf(r0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L31
            int r1 = r7.indexOf(r0)     // Catch: java.lang.StringIndexOutOfBoundsException -> L25 java.lang.NumberFormatException -> L27
            int r1 = r1 + r3
            int r0 = r7.indexOf(r0, r1)     // Catch: java.lang.StringIndexOutOfBoundsException -> L25 java.lang.NumberFormatException -> L27
            java.lang.String r0 = r7.substring(r4, r0)     // Catch: java.lang.StringIndexOutOfBoundsException -> L25 java.lang.NumberFormatException -> L27
            java.lang.String r1 = "."
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.StringIndexOutOfBoundsException -> L25 java.lang.NumberFormatException -> L27
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.StringIndexOutOfBoundsException -> L25 java.lang.NumberFormatException -> L27
            goto L32
        L25:
            r0 = move-exception
            goto L28
        L27:
            r0 = move-exception
        L28:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r7
            java.lang.String r2 = "Exception while parsing the CS apk version (%s) "
            defpackage.advr.i(r0, r2, r1)
        L31:
            r0 = r4
        L32:
            int r1 = r7.length()
            int r1 = r1 + (-3)
            java.lang.String r7 = r7.substring(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.NumberFormatException -> L69
            if (r1 != 0) goto L71
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L69
            r1.<init>()     // Catch: java.lang.NumberFormatException -> L69
            r2 = r4
        L48:
            int r5 = r7.length()     // Catch: java.lang.NumberFormatException -> L69
            if (r2 >= r5) goto L60
            char r5 = r7.charAt(r2)     // Catch: java.lang.NumberFormatException -> L69
            r6 = 48
            if (r5 < r6) goto L5d
            r6 = 57
            if (r5 > r6) goto L5d
            r1.append(r5)     // Catch: java.lang.NumberFormatException -> L69
        L5d:
            int r2 = r2 + 1
            goto L48
        L60:
            java.lang.String r7 = r1.toString()     // Catch: java.lang.NumberFormatException -> L69
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L69
            goto L72
        L69:
            r7 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "Error getting the build version name from package info"
            defpackage.advr.i(r7, r2, r1)
        L71:
            r7 = r4
        L72:
            int r1 = r0 / 10
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r0 = r0 % 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r1
            r5[r3] = r0
            r3 = 2
            r5[r3] = r7
            r7 = 3
            r5[r7] = r1
            r7 = 4
            r5[r7] = r0
            java.lang.String r7 = "c%dv%dv%03d-%d.%d"
            java.lang.String r7 = java.lang.String.format(r2, r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adww.g(java.lang.String):java.lang.String");
    }
}
