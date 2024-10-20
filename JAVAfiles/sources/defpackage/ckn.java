package defpackage;

import android.graphics.RenderEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckn extends clx {
    private final float b;
    private final float c;
    private final clx a = null;
    private final int d = 0;

    public ckn(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.clx
    protected final RenderEffect a() {
        RenderEffect createBlurEffect;
        RenderEffect createOffsetEffect;
        float f = this.b;
        float f2 = this.c;
        if (f == brg.a && f2 == brg.a) {
            createOffsetEffect = RenderEffect.createOffsetEffect(brg.a, brg.a);
            return createOffsetEffect;
        }
        createBlurEffect = RenderEffect.createBlurEffect(f, f2, ckj.a());
        return createBlurEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckn)) {
            return false;
        }
        ckn cknVar = (ckn) obj;
        if (this.b != cknVar.b || this.c != cknVar.c) {
            return false;
        }
        int i = cknVar.d;
        if (!a.bA(0, 0)) {
            return false;
        }
        clx clxVar = cknVar.a;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c)) * 31;
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.b + ", radiusY=" + this.c + ", edgeTreatment=" + ((Object) cmf.a()) + ')';
    }
}
