package androidx.compose.animation;

import defpackage.abt;
import defpackage.arqg;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;
import defpackage.xk;
import defpackage.xl;
import defpackage.xn;
import defpackage.xs;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EnterExitTransitionElement extends cyg<xk> {
    private final abt a;
    private final abt.a b;
    private final abt.a c;
    private final abt.a d;
    private final xl f;
    private final xn g;
    private final arqg h;
    private final xs i;

    public EnterExitTransitionElement(abt abtVar, abt.a aVar, abt.a aVar2, abt.a aVar3, xl xlVar, xn xnVar, arqg arqgVar, xs xsVar) {
        this.a = abtVar;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.f = xlVar;
        this.g = xnVar;
        this.h = arqgVar;
        this.i = xsVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new xk(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        xk xkVar = (xk) cVar;
        xkVar.a = this.a;
        xkVar.b = this.b;
        xkVar.c = this.c;
        xkVar.d = this.d;
        xkVar.e = this.f;
        xkVar.f = this.g;
        xkVar.g = this.h;
        xkVar.h = this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        if (d.F(this.a, enterExitTransitionElement.a) && d.F(this.b, enterExitTransitionElement.b) && d.F(this.c, enterExitTransitionElement.c) && d.F(this.d, enterExitTransitionElement.d) && d.F(this.f, enterExitTransitionElement.f) && d.F(this.g, enterExitTransitionElement.g) && d.F(this.h, enterExitTransitionElement.h) && d.F(this.i, enterExitTransitionElement.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        abt.a aVar = this.b;
        int i = 0;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        abt.a aVar2 = this.c;
        if (aVar2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aVar2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        abt.a aVar3 = this.d;
        if (aVar3 != null) {
            i = aVar3.hashCode();
        }
        return ((((((((i3 + i) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.a + ", sizeAnimation=" + this.b + ", offsetAnimation=" + this.c + ", slideAnimation=" + this.d + ", enter=" + this.f + ", exit=" + this.g + ", isEnabled=" + this.h + ", graphicsLayerBlock=" + this.i + ')';
    }
}
