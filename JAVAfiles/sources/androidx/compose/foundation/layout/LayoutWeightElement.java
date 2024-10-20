package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.amb;
import defpackage.cga;
import defpackage.cyg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LayoutWeightElement extends cyg<amb> {
    private final float a;
    private final boolean b;

    public LayoutWeightElement(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new amb(this.a, this.b);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        amb ambVar = (amb) cVar;
        ambVar.a = this.a;
        ambVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        LayoutWeightElement layoutWeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutWeightElement) {
            layoutWeightElement = (LayoutWeightElement) obj;
        } else {
            layoutWeightElement = null;
        }
        if (layoutWeightElement != null && this.a == layoutWeightElement.a && this.b == layoutWeightElement.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + a.v(this.b);
    }
}
