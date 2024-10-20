package androidx.compose.foundation.layout;

import defpackage.amf;
import defpackage.arqr;
import defpackage.cga;
import defpackage.cxl;
import defpackage.cyg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OffsetPxElement extends cyg<amf> {
    private final arqr a;

    public OffsetPxElement(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new amf(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        amf amfVar = (amf) cVar;
        arqr arqrVar = amfVar.a;
        arqr arqrVar2 = this.a;
        if (arqrVar != arqrVar2 || !amfVar.b) {
            cxl.c(amfVar);
        }
        amfVar.a = arqrVar2;
        amfVar.b = true;
    }

    public final boolean equals(Object obj) {
        OffsetPxElement offsetPxElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetPxElement) {
            offsetPxElement = (OffsetPxElement) obj;
        } else {
            offsetPxElement = null;
        }
        if (offsetPxElement != null && this.a == offsetPxElement.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.a + ", rtlAware=true)";
    }
}
