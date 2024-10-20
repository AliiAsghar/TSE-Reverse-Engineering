package androidx.compose.foundation;

import defpackage.adq;
import defpackage.cga;
import defpackage.cko;
import defpackage.cmb;
import defpackage.cyg;
import defpackage.d;
import defpackage.dqy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends cyg<adq> {
    private final float a;
    private final cko b;
    private final cmb c;

    public BorderModifierNodeElement(float f, cko ckoVar, cmb cmbVar) {
        this.a = f;
        this.b = ckoVar;
        this.c = cmbVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new adq(this.a, this.b, this.c);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        adq adqVar = (adq) cVar;
        float f = adqVar.b;
        float f2 = this.a;
        if (!dqy.b(f, f2)) {
            adqVar.b = f2;
            adqVar.e.b();
        }
        cko ckoVar = this.b;
        if (!d.F(adqVar.c, ckoVar)) {
            adqVar.c = ckoVar;
            adqVar.e.b();
        }
        cmb cmbVar = this.c;
        if (!d.F(adqVar.d, cmbVar)) {
            adqVar.d = cmbVar;
            adqVar.e.b();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        if (dqy.b(this.a, borderModifierNodeElement.a) && d.F(this.b, borderModifierNodeElement.b) && d.F(this.c, borderModifierNodeElement.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) dqy.a(this.a)) + ", brush=" + this.b + ", shape=" + this.c + ')';
    }
}
