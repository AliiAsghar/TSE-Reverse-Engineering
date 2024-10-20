package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxf implements aemc {
    public final ascv a;
    public final List b;
    public final jxd c;
    private final boolean d;
    private final arqg e;

    public jxf() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
    }

    @Override // defpackage.aemc
    public final aemc a(arqg arqgVar) {
        return new jxf(this.a, this.b, this.c, this.d, arqgVar);
    }

    @Override // defpackage.aemc
    public final arqg b() {
        return this.e;
    }

    @Override // defpackage.aemc
    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxf)) {
            return false;
        }
        jxf jxfVar = (jxf) obj;
        if (d.F(this.a, jxfVar.a) && d.F(this.b, jxfVar.b) && d.F(this.c, jxfVar.c) && this.d == jxfVar.d && d.F(this.e, jxfVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        jxd jxdVar = this.c;
        if (jxdVar == null) {
            hashCode = 0;
        } else {
            hashCode = jxdVar.hashCode();
        }
        return (((((hashCode2 * 31) + hashCode) * 31) + a.v(this.d)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "ThemeSelectionUiData(currentThemeStateFlow=" + this.a + ", themes=" + this.b + ", menuButtonUiData=" + this.c + ", includeScrim=" + this.d + ", onDismiss=" + this.e + ")";
    }

    public jxf(ascv ascvVar, List list, jxd jxdVar, boolean z, arqg arqgVar) {
        ascvVar.getClass();
        list.getClass();
        arqgVar.getClass();
        this.a = ascvVar;
        this.b = list;
        this.c = jxdVar;
        this.d = z;
        this.e = arqgVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ jxf(defpackage.ascv r9, defpackage.jxd r10, defpackage.arqg r11, int r12) {
        /*
            r8 = this;
            r0 = r12 & 1
            r1 = 0
            if (r0 == 0) goto L9
            ascd r9 = defpackage.ascy.a(r1)
        L9:
            r3 = r9
            r9 = r12 & 2
            if (r9 == 0) goto L16
            int r9 = defpackage.jxc.a
            java.util.List r9 = defpackage.jxc.a()
            r4 = r9
            goto L17
        L16:
            r4 = r1
        L17:
            r9 = r12 & 4
            if (r9 == 0) goto L1d
            r5 = r1
            goto L1e
        L1d:
            r5 = r10
        L1e:
            r9 = r12 & 8
            if (r9 == 0) goto L24
            r9 = 1
            goto L25
        L24:
            r9 = 0
        L25:
            r6 = r9
            r9 = r12 & 16
            if (r9 == 0) goto L2c
            jlc r11 = defpackage.jlc.s
        L2c:
            r7 = r11
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxf.<init>(ascv, jxd, arqg, int):void");
    }
}
