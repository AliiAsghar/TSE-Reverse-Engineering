package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class w implements Serializable {
    public static final w a;
    static final Pattern b;
    static final Pattern c;
    static final Pattern d;
    static final Pattern e;
    static final Pattern f;
    static final Pattern g;
    private static final n i;
    private static final u j;
    private static final long serialVersionUID = 1;
    public final v h;

    static {
        k kVar = new k();
        i = kVar;
        u uVar = new u("other", kVar, null, null);
        j = uVar;
        v vVar = new v();
        vVar.a(uVar);
        a = new w(vVar);
        b = Pattern.compile("\\s*\\Q\\E@\\s*");
        c = Pattern.compile("\\s*or\\s*");
        d = Pattern.compile("\\s*and\\s*");
        e = Pattern.compile("\\s*,\\s*");
        Pattern.compile("\\s*\\Q..\\E\\s*");
        f = Pattern.compile("\\s*~\\s*");
        g = Pattern.compile("\\s*;\\s*");
    }

    public w(v vVar) {
        this.h = vVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = vVar.b.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((u) it.next()).a);
        }
        DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:107:0x01d5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.u a(java.lang.String r38) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w.a(java.lang.String):u");
    }

    public static void b(StringBuilder sb, double d2, double d3, boolean z) {
        if (z) {
            sb.append(",");
        }
        if (d2 == d3) {
            sb.append(c(d2));
            return;
        }
        sb.append(c(d2) + ".." + c(d3));
    }

    private static String c(double d2) {
        long j2 = (long) d2;
        if (d2 == j2) {
            return String.valueOf(j2);
        }
        return String.valueOf(d2);
    }

    private static String d(String[] strArr, int i2, String str) {
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        throw new ParseException(a.bW(str, "missing token at end of '", "'"), -1);
    }

    private static ParseException e(String str, String str2) {
        return new ParseException(a.bZ(str2, str, "unexpected token '", "' in '", "'"), -1);
    }

    public final boolean equals(Object obj) {
        w wVar;
        if ((obj instanceof w) && (wVar = (w) obj) != null && toString().equals(wVar.toString())) {
            return true;
        }
        return false;
    }

    @Deprecated
    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h.toString();
    }
}
