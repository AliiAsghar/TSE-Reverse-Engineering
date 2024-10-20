package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agxl {
    private static volatile agxl b;
    static final alog a = alog.w("⚕️", "♀️", "♂️", "♟️", "♾️", "⚧️");
    private static final ThreadLocal c = new agxk();

    private agxl() {
    }

    public static agxl a() {
        agxl agxlVar = b;
        if (agxlVar == null) {
            synchronized (agxl.class) {
                agxlVar = b;
                if (agxlVar == null) {
                    agxlVar = new agxl();
                    b = agxlVar;
                }
            }
        }
        return agxlVar;
    }

    public static final boolean b(String str) {
        return ((agxj) c.get()).a(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        if (b(r6) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(java.lang.String r6, defpackage.agxe r7) {
        /*
            boolean r0 = r7.a()
            r1 = 0
            if (r0 == 0) goto L87
            boolean r0 = r7.a()
            if (r0 != 0) goto L13
            boolean r1 = b(r6)
            goto L86
        L13:
            java.lang.ThreadLocal r0 = defpackage.agxl.c
            java.lang.Object r0 = r0.get()
            agxj r0 = (defpackage.agxj) r0
            agxg r2 = defpackage.agxg.instance
            ejx r2 = r2.a()
            if (r2 != 0) goto L28
            boolean r1 = r0.a(r6)
            goto L86
        L28:
            java.lang.Integer r7 = r7.c
            if (r7 != 0) goto L4a
            alvi r7 = defpackage.agxg.a
            agyk r0 = defpackage.agyk.a
            alvg r7 = r7.a(r0)
            java.lang.String r0 = "getMetaVersion"
            r3 = 134(0x86, float:1.88E-43)
            java.lang.String r4 = "com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager$CompatMetaData"
            java.lang.String r5 = "EmojiCompatManager.java"
            alvw r7 = r7.h(r4, r0, r3, r5)
            alvg r7 = (defpackage.alvg) r7
            java.lang.String r0 = "meta version is not set but getMetaVersion() is called."
            r7.q(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L50
        L4a:
            r7.intValue()
            r7 = 2147483647(0x7fffffff, float:NaN)
        L50:
            boolean r0 = r2.f()
            java.lang.String r3 = "Not initialized yet"
            defpackage.dye.f(r0, r3)
            java.lang.String r0 = "sequence cannot be null"
            defpackage.d.aC(r6, r0)
            ekq r0 = r2.j
            java.lang.Object r0 = r0.a
            ahuq r0 = (defpackage.ahuq) r0
            ejy r6 = r0.d(r6)
            if (r6 == 0) goto L86
            gku r6 = r6.e()
            r0 = 10
            int r0 = r6.a(r0)
            if (r0 == 0) goto L82
            java.lang.Object r2 = r6.b
            int r6 = r6.a
            int r0 = r0 + r6
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            short r6 = r2.getShort(r0)
            goto L83
        L82:
            r6 = r1
        L83:
            if (r6 > r7) goto L86
            r1 = 1
        L86:
            return r1
        L87:
            boolean r7 = b(r6)
            if (r7 != 0) goto La5
            alog r7 = defpackage.agxl.a
            boolean r7 = r7.contains(r6)
            r0 = 0
            if (r7 == 0) goto La4
            java.lang.String r7 = "️"
            java.lang.String r2 = ""
            java.lang.String r6 = r6.replace(r7, r2)
            boolean r7 = b(r6)
            if (r7 != 0) goto La5
        La4:
            r6 = r0
        La5:
            if (r6 != 0) goto La8
            return r1
        La8:
            boolean r6 = b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agxl.c(java.lang.String, agxe):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final alog d(alog alogVar, agxe agxeVar) {
        alob alobVar = new alob();
        int size = alogVar.size();
        for (int i = 0; i < size; i++) {
            String str = (String) alogVar.get(i);
            if (c(str, agxeVar)) {
                alobVar.h(str);
            }
        }
        return alobVar.g();
    }
}
