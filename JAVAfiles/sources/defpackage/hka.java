package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hka {
    public final int a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r6.equals("cenc") != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hka(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            if (r11 != 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = r0
        Lf:
            r2 = r2 ^ r3
            defpackage.d.s(r2)
            r4.b = r5
            r4.e = r6
            r4.a = r7
            r4.d = r11
            fmp r5 = new fmp
            if (r6 != 0) goto L20
            goto L69
        L20:
            int r7 = r6.hashCode()
            r11 = 3
            r2 = 2
            switch(r7) {
                case 3046605: goto L47;
                case 3046671: goto L3d;
                case 3049879: goto L34;
                case 3049895: goto L2a;
                default: goto L29;
            }
        L29:
            goto L51
        L2a:
            java.lang.String r7 = "cens"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            r0 = r1
            goto L52
        L34:
            java.lang.String r7 = "cenc"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            goto L52
        L3d:
            java.lang.String r7 = "cbcs"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            r0 = r11
            goto L52
        L47:
            java.lang.String r7 = "cbc1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            r0 = r2
            goto L52
        L51:
            r0 = -1
        L52:
            if (r0 == 0) goto L69
            if (r0 == r1) goto L69
            if (r0 == r2) goto L68
            if (r0 == r11) goto L68
            java.lang.String r7 = "Unsupported protection scheme type '"
            java.lang.String r11 = "'. Assuming AES-CTR crypto mode."
            java.lang.String r6 = defpackage.a.bW(r6, r7, r11)
            java.lang.String r7 = "TrackEncryptionBox"
            defpackage.eub.f(r7, r6)
            goto L69
        L68:
            r1 = r2
        L69:
            r5.<init>(r1, r8, r9, r10)
            r4.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hka.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        for (int i = 0; i < ((alog) this.d).size(); i++) {
            if (((atkn) ((alog) this.d).get(i)).c()) {
                return true;
            }
        }
        return false;
    }

    public hka(List list, eyy eyyVar, fwa fwaVar, int i, boolean z) {
        d.t(true, "Audio transmuxing and audio track forcing are not allowed together.");
        this.d = alog.n(list);
        this.c = eyyVar;
        this.e = fwaVar;
        this.a = i;
        this.b = z;
    }

    public hka(int i, byte[] bArr, Map map, List list, boolean z) {
        this.a = i;
        this.c = bArr;
        this.d = map;
        this.e = list == null ? null : DesugarCollections.unmodifiableList(list);
        this.b = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hka(int r11, byte[] r12, boolean r13, java.util.List r14) {
        /*
            r10 = this;
            if (r14 != 0) goto L5
            r0 = 0
        L3:
            r7 = r0
            goto L2f
        L5:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L10
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L3
        L10:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            java.util.Iterator r1 = r14.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3
            java.lang.Object r2 = r1.next()
            hjx r2 = (defpackage.hjx) r2
            java.lang.String r3 = r2.a
            java.lang.String r2 = r2.b
            r0.put(r3, r2)
            goto L1b
        L2f:
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r14
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hka.<init>(int, byte[], boolean, java.util.List):void");
    }
}
