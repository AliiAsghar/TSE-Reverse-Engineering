package androidx.compose.foundation.layout;

import defpackage.alv;
import defpackage.alx;
import defpackage.cga;
import defpackage.cyg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class IntrinsicHeightElement extends cyg<alv> {
    private final alx a;

    public IntrinsicHeightElement(alx alxVar) {
        this.a = alxVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new alv(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        alv alvVar = (alv) cVar;
        alvVar.a = this.a;
        alvVar.b = true;
    }

    public final boolean equals(Object obj) {
        IntrinsicHeightElement intrinsicHeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntrinsicHeightElement) {
            intrinsicHeightElement = (IntrinsicHeightElement) obj;
        } else {
            intrinsicHeightElement = null;
        }
        if (intrinsicHeightElement != null && this.a == intrinsicHeightElement.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1231;
    }
}
