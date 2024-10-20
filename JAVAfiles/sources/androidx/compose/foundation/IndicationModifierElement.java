package androidx.compose.foundation;

import defpackage.aez;
import defpackage.afa;
import defpackage.ajq;
import defpackage.cga;
import defpackage.cwo;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class IndicationModifierElement extends cyg<aez> {
    private final ajq a;
    private final afa b;

    public IndicationModifierElement(ajq ajqVar, afa afaVar) {
        this.a = ajqVar;
        this.b = afaVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new aez(this.b.a(this.a));
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        aez aezVar = (aez) cVar;
        cwo a = this.b.a(this.a);
        aezVar.J(aezVar.a);
        aezVar.a = a;
        aezVar.K(a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        if (d.F(this.a, indicationModifierElement.a) && d.F(this.b, indicationModifierElement.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
