package androidx.compose.foundation.selection;

import defpackage.a;
import defpackage.afa;
import defpackage.ajr;
import defpackage.arqg;
import defpackage.avz;
import defpackage.cga;
import defpackage.cyg;
import defpackage.czl;
import defpackage.d;
import defpackage.dgv;
import defpackage.dhs;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TriStateToggleableElement extends cyg<avz> {
    private final dhs a;
    private final ajr b;
    private final afa c;
    private final boolean d;
    private final dgv f;
    private final arqg g;

    public TriStateToggleableElement(dhs dhsVar, ajr ajrVar, afa afaVar, boolean z, dgv dgvVar, arqg arqgVar) {
        this.a = dhsVar;
        this.b = ajrVar;
        this.c = afaVar;
        this.d = z;
        this.f = dgvVar;
        this.g = arqgVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new avz(this.a, this.b, this.c, this.d, this.f, this.g);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        avz avzVar = (avz) cVar;
        dhs dhsVar = avzVar.i;
        dhs dhsVar2 = this.a;
        if (dhsVar != dhsVar2) {
            avzVar.i = dhsVar2;
            czl.a(avzVar);
        }
        arqg arqgVar = this.g;
        dgv dgvVar = this.f;
        boolean z = this.d;
        avzVar.n(this.b, this.c, z, null, dgvVar, arqgVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        if (this.a == triStateToggleableElement.a && d.F(this.b, triStateToggleableElement.b) && d.F(this.c, triStateToggleableElement.c) && this.d == triStateToggleableElement.d && d.F(this.f, triStateToggleableElement.f) && this.g == triStateToggleableElement.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        ajr ajrVar = this.b;
        int i2 = 0;
        if (ajrVar != null) {
            i = ajrVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        afa afaVar = this.c;
        if (afaVar != null) {
            i2 = afaVar.hashCode();
        }
        return ((((((i3 + i2) * 31) + a.v(this.d)) * 31) + this.f.a) * 31) + this.g.hashCode();
    }
}
