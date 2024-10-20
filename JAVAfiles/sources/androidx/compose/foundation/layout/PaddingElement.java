package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.ami;
import defpackage.ann;
import defpackage.brg;
import defpackage.cga;
import defpackage.cyg;
import defpackage.dqy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PaddingElement extends cyg<ami> {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public /* synthetic */ PaddingElement(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if ((f < brg.a && !dqy.b(f, Float.NaN)) || ((f2 < brg.a && !dqy.b(f2, Float.NaN)) || ((f3 < brg.a && !dqy.b(f3, Float.NaN)) || (f4 < brg.a && !dqy.b(f4, Float.NaN))))) {
            ann.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new ami(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ami amiVar = (ami) cVar;
        amiVar.a = this.a;
        amiVar.b = this.b;
        amiVar.c = this.c;
        amiVar.d = this.d;
        amiVar.e = true;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement;
        if (obj instanceof PaddingElement) {
            paddingElement = (PaddingElement) obj;
        } else {
            paddingElement = null;
        }
        if (paddingElement == null || !dqy.b(this.a, paddingElement.a) || !dqy.b(this.b, paddingElement.b) || !dqy.b(this.c, paddingElement.c) || !dqy.b(this.d, paddingElement.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + a.v(true);
    }
}
