package androidx.compose.foundation.selection;

import defpackage.a;
import defpackage.afa;
import defpackage.ajr;
import defpackage.arqg;
import defpackage.avu;
import defpackage.cga;
import defpackage.cyg;
import defpackage.czl;
import defpackage.d;
import defpackage.dgv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SelectableElement extends cyg<avu> {
    private final boolean a;
    private final ajr b;
    private final afa c;
    private final boolean d;
    private final dgv f;
    private final arqg g;

    public SelectableElement(boolean z, ajr ajrVar, afa afaVar, boolean z2, dgv dgvVar, arqg arqgVar) {
        this.a = z;
        this.b = ajrVar;
        this.c = afaVar;
        this.d = z2;
        this.f = dgvVar;
        this.g = arqgVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new avu(this.a, this.b, this.c, this.d, this.f, this.g);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        avu avuVar = (avu) cVar;
        boolean z = avuVar.i;
        boolean z2 = this.a;
        if (z != z2) {
            avuVar.i = z2;
            czl.a(avuVar);
        }
        arqg arqgVar = this.g;
        dgv dgvVar = this.f;
        boolean z3 = this.d;
        avuVar.n(this.b, this.c, z3, null, dgvVar, arqgVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        if (this.a == selectableElement.a && d.F(this.b, selectableElement.b) && d.F(this.c, selectableElement.c) && this.d == selectableElement.d && d.F(this.f, selectableElement.f) && this.g == selectableElement.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        ajr ajrVar = this.b;
        int i3 = 0;
        if (ajrVar != null) {
            i = ajrVar.hashCode();
        } else {
            i = 0;
        }
        boolean z = this.a;
        afa afaVar = this.c;
        if (afaVar != null) {
            i2 = afaVar.hashCode();
        } else {
            i2 = 0;
        }
        int v = (a.v(z) * 31) + i;
        boolean z2 = this.d;
        dgv dgvVar = this.f;
        if (dgvVar != null) {
            i3 = dgvVar.a;
        }
        return (((((((v * 31) + i2) * 31) + a.v(z2)) * 31) + i3) * 31) + this.g.hashCode();
    }
}
