package androidx.compose.foundation.selection;

import defpackage.a;
import defpackage.afa;
import defpackage.ajr;
import defpackage.arqr;
import defpackage.avy;
import defpackage.cga;
import defpackage.cyg;
import defpackage.czl;
import defpackage.d;
import defpackage.dgv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ToggleableElement extends cyg<avy> {
    private final boolean a;
    private final ajr b;
    private final afa c;
    private final dgv d;
    private final arqr f;

    public ToggleableElement(boolean z, ajr ajrVar, afa afaVar, dgv dgvVar, arqr arqrVar) {
        this.a = z;
        this.b = ajrVar;
        this.c = afaVar;
        this.d = dgvVar;
        this.f = arqrVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new avy(this.a, this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        avy avyVar = (avy) cVar;
        boolean z = avyVar.i;
        boolean z2 = this.a;
        if (z != z2) {
            avyVar.i = z2;
            czl.a(avyVar);
        }
        arqr arqrVar = this.f;
        dgv dgvVar = this.d;
        afa afaVar = this.c;
        ajr ajrVar = this.b;
        avyVar.j = arqrVar;
        avyVar.n(ajrVar, afaVar, true, null, dgvVar, avyVar.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        if (this.a == toggleableElement.a && d.F(this.b, toggleableElement.b) && d.F(this.c, toggleableElement.c) && d.F(this.d, toggleableElement.d) && this.f == toggleableElement.f) {
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
        dgv dgvVar = this.d;
        if (dgvVar != null) {
            i3 = dgvVar.a;
        }
        return (((((((v * 31) + i2) * 31) + a.v(true)) * 31) + i3) * 31) + this.f.hashCode();
    }
}
