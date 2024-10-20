package androidx.compose.foundation;

import defpackage.a;
import defpackage.aeb;
import defpackage.afa;
import defpackage.ajr;
import defpackage.arqg;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;
import defpackage.dgv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ClickableElement extends cyg<aeb> {
    private final ajr a;
    private final afa b;
    private final boolean c;
    private final String d;
    private final dgv f;
    private final arqg g;

    public ClickableElement(ajr ajrVar, afa afaVar, boolean z, String str, dgv dgvVar, arqg arqgVar) {
        this.a = ajrVar;
        this.b = afaVar;
        this.c = z;
        this.d = str;
        this.f = dgvVar;
        this.g = arqgVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new aeb(this.a, this.b, this.c, this.d, this.f, this.g);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ((aeb) cVar).n(this.a, this.b, this.c, this.d, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        if (d.F(this.a, clickableElement.a) && d.F(this.b, clickableElement.b) && this.c == clickableElement.c && d.F(this.d, clickableElement.d) && d.F(this.f, clickableElement.f) && this.g == clickableElement.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        ajr ajrVar = this.a;
        int i4 = 0;
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
        int i5 = i * 31;
        boolean z = this.c;
        String str = this.d;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int v = (((((i5 + i2) * 31) + a.v(z)) * 31) + i3) * 31;
        dgv dgvVar = this.f;
        if (dgvVar != null) {
            i4 = dgvVar.a;
        }
        return ((v + i4) * 31) + this.g.hashCode();
    }
}
