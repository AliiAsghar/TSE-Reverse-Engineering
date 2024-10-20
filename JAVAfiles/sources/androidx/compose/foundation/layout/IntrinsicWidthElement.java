package androidx.compose.foundation.layout;

import defpackage.alx;
import defpackage.alz;
import defpackage.cga;
import defpackage.cyg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class IntrinsicWidthElement extends cyg<alz> {
    private final alx a;

    public IntrinsicWidthElement(alx alxVar) {
        this.a = alxVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new alz(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        alz alzVar = (alz) cVar;
        alzVar.a = this.a;
        alzVar.b = true;
    }

    public final boolean equals(Object obj) {
        IntrinsicWidthElement intrinsicWidthElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntrinsicWidthElement) {
            intrinsicWidthElement = (IntrinsicWidthElement) obj;
        } else {
            intrinsicWidthElement = null;
        }
        if (intrinsicWidthElement != null && this.a == intrinsicWidthElement.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1231;
    }
}
