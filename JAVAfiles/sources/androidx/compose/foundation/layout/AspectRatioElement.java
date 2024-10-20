package androidx.compose.foundation.layout;

import defpackage.aka;
import defpackage.cga;
import defpackage.cyg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AspectRatioElement extends cyg<aka> {
    private final boolean a = false;

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new aka();
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ((aka) cVar).a = 1.0f;
    }

    public final boolean equals(Object obj) {
        AspectRatioElement aspectRatioElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AspectRatioElement) {
            aspectRatioElement = (AspectRatioElement) obj;
        } else {
            aspectRatioElement = null;
        }
        if (aspectRatioElement == null) {
            return false;
        }
        boolean z = ((AspectRatioElement) obj).a;
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(1.0f) * 31) + 1237;
    }
}
