package androidx.compose.ui.draw;

import defpackage.a;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cht;
import defpackage.ckv;
import defpackage.cor;
import defpackage.csv;
import defpackage.cwy;
import defpackage.cxl;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PainterElement extends cyg<cht> {
    private final cor a;
    private final boolean b;
    private final cfq c;
    private final csv d;
    private final float f;
    private final ckv g;

    public PainterElement(cor corVar, boolean z, cfq cfqVar, csv csvVar, float f, ckv ckvVar) {
        this.a = corVar;
        this.b = z;
        this.c = cfqVar;
        this.d = csvVar;
        this.f = f;
        this.g = ckvVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new cht(this.a, this.b, this.c, this.d, this.f, this.g);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        cht chtVar = (cht) cVar;
        boolean z = chtVar.b;
        boolean z2 = this.b;
        boolean z3 = true;
        if (z == z2 && (!z2 || a.bB(chtVar.a.a(), this.a.a()))) {
            z3 = false;
        }
        chtVar.a = this.a;
        chtVar.b = this.b;
        chtVar.c = this.c;
        chtVar.d = this.d;
        chtVar.e = this.f;
        chtVar.f = this.g;
        if (z3) {
            cxl.b(chtVar);
        }
        cwy.a(chtVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        if (d.F(this.a, painterElement.a) && this.b == painterElement.b && d.F(this.c, painterElement.c) && d.F(this.d, painterElement.d) && Float.compare(this.f, painterElement.f) == 0 && d.F(this.g, painterElement.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.a.hashCode() * 31) + a.v(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.f);
        ckv ckvVar = this.g;
        if (ckvVar == null) {
            hashCode = 0;
        } else {
            hashCode = ckvVar.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", contentScale=" + this.d + ", alpha=" + this.f + ", colorFilter=" + this.g + ')';
    }
}
