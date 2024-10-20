package androidx.compose.ui.draw;

import defpackage.a;
import defpackage.cga;
import defpackage.chv;
import defpackage.ckm;
import defpackage.cku;
import defpackage.cmb;
import defpackage.cyg;
import defpackage.d;
import defpackage.dqy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends cyg<ckm> {
    public final float a;
    public final cmb b;
    public final boolean c;
    public final long d;
    public final long f;

    public ShadowGraphicsLayerElement(float f, cmb cmbVar, boolean z, long j, long j2) {
        this.a = f;
        this.b = cmbVar;
        this.c = z;
        this.d = j;
        this.f = j2;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new ckm(new chv(this));
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ckm ckmVar = (ckm) cVar;
        ckmVar.a = new chv(this);
        ckmVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        if (dqy.b(this.a, shadowGraphicsLayerElement.a) && d.F(this.b, shadowGraphicsLayerElement.b) && this.c == shadowGraphicsLayerElement.c && a.bB(this.d, shadowGraphicsLayerElement.d) && a.bB(this.f, shadowGraphicsLayerElement.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + a.v(this.c)) * 31) + a.A(this.d)) * 31) + a.A(this.f);
    }

    public final String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) dqy.a(this.a)) + ", shape=" + this.b + ", clip=" + this.c + ", ambientColor=" + ((Object) cku.g(this.d)) + ", spotColor=" + ((Object) cku.g(this.f)) + ')';
    }
}
