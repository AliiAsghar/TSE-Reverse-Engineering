package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahpo {
    private final armf i;
    private static final alpt d = alpt.t("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
    private static final Pattern e = Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
    public static final Pattern a = Pattern.compile("([^\\?]+)(\\?+)");
    private static final Pattern f = Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
    public static final Pattern b = Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+$)");
    public static final Pattern c = Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+\\.[\\w]*$)");
    private static final Pattern g = Pattern.compile("([a-zA-Z0-9-_]+)");
    private static final Pattern h = Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");

    public ahpo(armf armfVar) {
        this.i = armfVar;
    }

    static String a(String str) {
        Matcher matcher = f.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    static String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = h.matcher(str);
        if (matcher.find()) {
            return matcher.replaceFirst("<ip>");
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.String d(java.lang.String r4, boolean r5) {
        /*
            boolean r0 = defpackage.albo.ah(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 1
            if (r5 == 0) goto Ld
        Lb:
            r5 = r0
            goto L16
        Ld:
            java.lang.String r5 = a(r4)
            if (r5 == 0) goto L15
            r4 = r5
            goto Lb
        L15:
            r5 = 0
        L16:
            java.util.regex.Pattern r2 = defpackage.ahpo.a
            java.util.regex.Matcher r2 = r2.matcher(r4)
            boolean r3 = r2.find()
            if (r3 == 0) goto L27
            java.lang.String r4 = r2.group(r0)
            r5 = r0
        L27:
            java.lang.String r2 = b(r4)
            if (r2 == 0) goto L34
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L34
            r5 = r0
        L34:
            if (r2 == 0) goto L49
            java.util.regex.Pattern r4 = defpackage.ahpo.h
            java.util.regex.Matcher r4 = r4.matcher(r2)
            boolean r3 = r4.find()
            if (r3 == 0) goto L49
            java.lang.String r5 = "<ip>"
            java.lang.String r2 = r4.replaceFirst(r5)
            r5 = r0
        L49:
            if (r2 == 0) goto L5f
            if (r5 != 0) goto L5f
            java.util.regex.Pattern r4 = defpackage.ahpo.g
            java.util.regex.Matcher r4 = r4.matcher(r2)
            boolean r5 = r4.find()
            if (r5 != 0) goto L5a
            goto L60
        L5a:
            java.lang.String r4 = r4.group(r0)
            return r4
        L5f:
            r1 = r2
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahpo.d(java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x020a, code lost:
    
        if (r12 != 2) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x045b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x030a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.asjt c(java.lang.Iterable r17) {
        /*
            Method dump skipped, instructions count: 1161
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahpo.c(java.lang.Iterable):asjt");
    }
}
