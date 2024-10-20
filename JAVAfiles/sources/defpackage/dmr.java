package defpackage;

import defpackage.dmq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmr extends dkx {
    public final String b;
    public final dmq.a c;
    public final dlx d;
    public final int e;
    private final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dmr(java.lang.String r5, dmq.a r6, defpackage.dlx r7) {
        /*
            r4 = this;
            dmu r0 = defpackage.dmu.a
            dlw r1 = new dlw
            r2 = 0
            dlv[] r3 = new defpackage.dlv[r2]
            r1.<init>(r3)
            r4.<init>(r0)
            r4.b = r5
            r4.c = r6
            r4.d = r7
            r4.e = r2
            r5 = 1
            r4.f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmr.<init>(java.lang.String, dmq$a, dlx):void");
    }

    @Override // defpackage.dlh
    public final dlx b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmr)) {
            return false;
        }
        dmr dmrVar = (dmr) obj;
        if (!d.F(this.b, dmrVar.b) || !d.F(this.c, dmrVar.c) || !d.F(this.d, dmrVar.d)) {
            return false;
        }
        int i = dmrVar.e;
        if (!a.bA(0, 0)) {
            return false;
        }
        boolean z = dmrVar.f;
        return true;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.h) * 961) + 1231;
    }

    public final String toString() {
        return "Font(GoogleFont(\"" + this.b + "\", bestEffort=true), weight=" + this.d + ", style=" + ((Object) dls.a(0)) + ')';
    }

    @Override // defpackage.dlh
    public final void c() {
    }
}
