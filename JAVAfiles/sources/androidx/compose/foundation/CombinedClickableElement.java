package androidx.compose.foundation;

import defpackage.a;
import defpackage.ada;
import defpackage.aee;
import defpackage.afa;
import defpackage.ajr;
import defpackage.arqg;
import defpackage.cga;
import defpackage.crw;
import defpackage.cyg;
import defpackage.czl;
import defpackage.d;
import defpackage.dgv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CombinedClickableElement extends cyg<aee> {
    private final ajr a;
    private final afa b;
    private final boolean c;
    private final dgv d;
    private final arqg f;
    private final arqg g;
    private final arqg h;

    public /* synthetic */ CombinedClickableElement(ajr ajrVar, afa afaVar, boolean z, dgv dgvVar, arqg arqgVar, arqg arqgVar2, arqg arqgVar3) {
        this.a = ajrVar;
        this.b = afaVar;
        this.c = z;
        this.d = dgvVar;
        this.f = arqgVar;
        this.g = arqgVar2;
        this.h = arqgVar3;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new aee(this.f, this.g, this.h, this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        crw crwVar;
        aee aeeVar = (aee) cVar;
        aeeVar.k = true;
        if (!d.F(null, null)) {
            czl.a(aeeVar);
        }
        arqg arqgVar = this.g;
        boolean z7 = false;
        if (aeeVar.i != null) {
            z = false;
        } else {
            z = true;
        }
        if (arqgVar != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            aeeVar.g();
            czl.a(aeeVar);
            z3 = true;
        } else {
            z3 = false;
        }
        dgv dgvVar = this.d;
        boolean z8 = this.c;
        afa afaVar = this.b;
        ajr ajrVar = this.a;
        arqg arqgVar2 = this.h;
        arqg arqgVar3 = this.f;
        aeeVar.i = arqgVar;
        if (aeeVar.j != null) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (arqgVar2 != null) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z4 != z5) {
            z6 = false;
        } else {
            z6 = true;
        }
        boolean z9 = !z6;
        aeeVar.j = arqgVar2;
        if (((ada) aeeVar).c == z8) {
            z7 = true;
        }
        aeeVar.n(ajrVar, afaVar, z8, null, dgvVar, arqgVar3);
        if ((z9 | z3 | (!z7)) && (crwVar = aeeVar.e) != null) {
            crwVar.p();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        if (d.F(this.a, combinedClickableElement.a) && d.F(this.b, combinedClickableElement.b) && this.c == combinedClickableElement.c && d.F(null, null) && d.F(this.d, combinedClickableElement.d) && this.f == combinedClickableElement.f && d.F(null, null) && this.g == combinedClickableElement.g && this.h == combinedClickableElement.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        ajr ajrVar = this.a;
        int i5 = 0;
        if (ajrVar != null) {
            i = ajrVar.hashCode();
        } else {
            i = 0;
        }
        afa afaVar = this.b;
        if (afaVar != null) {
            i2 = afaVar.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = i * 31;
        boolean z = this.c;
        dgv dgvVar = this.d;
        if (dgvVar != null) {
            i3 = dgvVar.a;
        } else {
            i3 = 0;
        }
        int v = ((((((i6 + i2) * 31) + a.v(z)) * 961) + i3) * 31) + this.f.hashCode();
        arqg arqgVar = this.g;
        if (arqgVar != null) {
            i4 = arqgVar.hashCode();
        } else {
            i4 = 0;
        }
        int i7 = ((v * 961) + i4) * 31;
        arqg arqgVar2 = this.h;
        if (arqgVar2 != null) {
            i5 = arqgVar2.hashCode();
        }
        return ((i7 + i5) * 31) + a.v(true);
    }
}
