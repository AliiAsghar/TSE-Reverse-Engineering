package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ysv {
    private static final algc b = algc.l(" \t\n\r\f\u000b\u0085\u2028\u2029\u200d\uffef�\ufffe\uffff");
    private static final algc c = new alfx(new alga(new alga(new alfr(0, 31), new alfs(127)), algc.l(" @,:<>")));
    public boolean a;
    private String d;
    private String e;

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0114, code lost:
    
        if (defpackage.alfn.a.h(r8.d) == false) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ysv(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysv.<init>(java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ysv) {
            return toString().equals(((ysv) obj).toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        return this.d + "@" + this.e;
    }
}
