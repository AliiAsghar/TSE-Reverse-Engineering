package androidx.compose.foundation.layout;

import defpackage.ame;
import defpackage.cga;
import defpackage.cxl;
import defpackage.cyg;
import defpackage.dqy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OffsetElement extends cyg<ame> {
    private final float a;
    private final float b;

    public OffsetElement(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new ame(this.a, this.b);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ame ameVar = (ame) cVar;
        float f = ameVar.a;
        float f2 = this.a;
        boolean b = dqy.b(f, f2);
        float f3 = this.b;
        if (!b || !dqy.b(ameVar.b, f3) || !ameVar.c) {
            cxl.c(ameVar);
        }
        ameVar.a = f2;
        ameVar.b = f3;
        ameVar.c = true;
    }

    public final boolean equals(Object obj) {
        OffsetElement offsetElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetElement) {
            offsetElement = (OffsetElement) obj;
        } else {
            offsetElement = null;
        }
        if (offsetElement != null && dqy.b(this.a, offsetElement.a) && dqy.b(this.b, offsetElement.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + 1231;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) dqy.a(this.a)) + ", y=" + ((Object) dqy.a(this.b)) + ", rtlAware=true)";
    }
}
