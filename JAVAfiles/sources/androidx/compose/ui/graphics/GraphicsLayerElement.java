package androidx.compose.ui.graphics;

import defpackage.a;
import defpackage.brg;
import defpackage.cga;
import defpackage.cku;
import defpackage.cla;
import defpackage.clx;
import defpackage.cmb;
import defpackage.cmc;
import defpackage.cmg;
import defpackage.cwp;
import defpackage.cyg;
import defpackage.cyn;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GraphicsLayerElement extends cyg<cmc> {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float f;
    private final float g;
    private final float j;
    private final float k;
    private final long l;
    private final cmb m;
    private final boolean n;
    private final long p;
    private final long q;
    private final int r;
    private final float h = brg.a;
    private final float i = brg.a;
    private final clx o = null;

    public GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, long j, cmb cmbVar, boolean z, long j2, long j3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.f = f5;
        this.g = f6;
        this.j = f7;
        this.k = f8;
        this.l = j;
        this.m = cmbVar;
        this.n = z;
        this.p = j2;
        this.q = j3;
        this.r = i;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new cmc(this.a, this.b, this.c, this.d, this.f, this.g, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        cmc cmcVar = (cmc) cVar;
        cmcVar.a = this.a;
        cmcVar.b = this.b;
        cmcVar.c = this.c;
        cmcVar.d = this.d;
        cmcVar.e = this.f;
        cmcVar.f = this.g;
        cmcVar.g = this.j;
        cmcVar.h = this.k;
        cmcVar.i = this.l;
        cmcVar.j = this.m;
        cmcVar.k = this.n;
        cmcVar.l = this.p;
        cmcVar.m = this.q;
        cmcVar.n = this.r;
        cyn cynVar = cwp.f(cmcVar, 2).u;
        if (cynVar != null) {
            cynVar.ap(cmcVar.o, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        if (Float.compare(this.a, graphicsLayerElement.a) != 0 || Float.compare(this.b, graphicsLayerElement.b) != 0 || Float.compare(this.c, graphicsLayerElement.c) != 0 || Float.compare(this.d, graphicsLayerElement.d) != 0 || Float.compare(this.f, graphicsLayerElement.f) != 0 || Float.compare(this.g, graphicsLayerElement.g) != 0) {
            return false;
        }
        float f = graphicsLayerElement.h;
        if (Float.compare(brg.a, brg.a) != 0) {
            return false;
        }
        float f2 = graphicsLayerElement.i;
        if (Float.compare(brg.a, brg.a) != 0 || Float.compare(this.j, graphicsLayerElement.j) != 0 || Float.compare(this.k, graphicsLayerElement.k) != 0 || !a.bB(this.l, graphicsLayerElement.l) || !d.F(this.m, graphicsLayerElement.m) || this.n != graphicsLayerElement.n) {
            return false;
        }
        clx clxVar = graphicsLayerElement.o;
        if (d.F(null, null) && a.bB(this.p, graphicsLayerElement.p) && a.bB(this.q, graphicsLayerElement.q) && a.bA(this.r, graphicsLayerElement.r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(brg.a)) * 31) + Float.floatToIntBits(brg.a)) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k)) * 31) + a.A(this.l)) * 31) + this.m.hashCode()) * 31) + a.v(this.n)) * 961) + a.A(this.p)) * 31) + a.A(this.q)) * 31) + this.r;
    }

    public final String toString() {
        return "GraphicsLayerElement(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha=" + this.c + ", translationX=" + this.d + ", translationY=" + this.f + ", shadowElevation=" + this.g + ", rotationX=0.0, rotationY=0.0, rotationZ=" + this.j + ", cameraDistance=" + this.k + ", transformOrigin=" + ((Object) cmg.c(this.l)) + ", shape=" + this.m + ", clip=" + this.n + ", renderEffect=null, ambientShadowColor=" + ((Object) cku.g(this.p)) + ", spotShadowColor=" + ((Object) cku.g(this.q)) + ", compositingStrategy=" + ((Object) cla.a(this.r)) + ')';
    }
}
