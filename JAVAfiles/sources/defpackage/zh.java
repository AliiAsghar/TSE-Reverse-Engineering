package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zh {
    public final xp a;
    public final zd b;
    public final wn c;
    public final xw d;
    public final boolean e;
    public final Map f;

    public zh() {
        this(null, null, null, null, false, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh)) {
            return false;
        }
        zh zhVar = (zh) obj;
        if (d.F(this.a, zhVar.a) && d.F(this.b, zhVar.b) && d.F(this.c, zhVar.c) && d.F(this.d, zhVar.d) && this.e == zhVar.e && d.F(this.f, zhVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        xp xpVar = this.a;
        int i = 0;
        if (xpVar == null) {
            hashCode = 0;
        } else {
            hashCode = xpVar.hashCode();
        }
        zd zdVar = this.b;
        if (zdVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = zdVar.hashCode();
        }
        int i2 = hashCode * 31;
        wn wnVar = this.c;
        if (wnVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = wnVar.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + hashCode3) * 31;
        xw xwVar = this.d;
        if (xwVar != null) {
            i = xwVar.hashCode();
        }
        return ((((i3 + i) * 31) + a.v(this.e)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", hold=" + this.e + ", effectsMap=" + this.f + ')';
    }

    public zh(xp xpVar, zd zdVar, wn wnVar, xw xwVar, boolean z, Map map) {
        this.a = xpVar;
        this.b = zdVar;
        this.c = wnVar;
        this.d = xwVar;
        this.e = z;
        this.f = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ zh(defpackage.xp r8, defpackage.zd r9, defpackage.wn r10, defpackage.xw r11, boolean r12, java.util.Map r13, int r14) {
        /*
            r7 = this;
            r0 = r14 & 32
            if (r0 == 0) goto L6
            arnw r13 = defpackage.arnw.a
        L6:
            r6 = r13
            r13 = r14 & 16
            r0 = r14 & 8
            r1 = r14 & 4
            r2 = r14 & 2
            r3 = 1
            if (r13 == 0) goto L14
            r13 = 0
            goto L15
        L14:
            r13 = r3
        L15:
            r14 = r14 & r3
            r5 = r13 & r12
            r12 = 0
            if (r0 == 0) goto L1d
            r4 = r12
            goto L1e
        L1d:
            r4 = r11
        L1e:
            if (r1 == 0) goto L21
            r10 = r12
        L21:
            if (r2 == 0) goto L25
            r2 = r12
            goto L26
        L25:
            r2 = r9
        L26:
            if (r3 != r14) goto L2a
            r1 = r12
            goto L2b
        L2a:
            r1 = r8
        L2b:
            r0 = r7
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh.<init>(xp, zd, wn, xw, boolean, java.util.Map, int):void");
    }
}
