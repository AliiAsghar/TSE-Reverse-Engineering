package androidx.compose.foundation.gestures;

import defpackage.a;
import defpackage.ais;
import defpackage.ait;
import defpackage.arqr;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TransformableElement extends cyg<ais> {
    private final ait a;
    private final arqr b;

    public TransformableElement(ait aitVar, arqr arqrVar) {
        this.a = aitVar;
        this.b = arqrVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new ais(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ais aisVar = (ais) cVar;
        ait aitVar = aisVar.a;
        ait aitVar2 = this.a;
        if (d.F(aitVar, aitVar2)) {
            return;
        }
        aisVar.a = aitVar2;
        aisVar.b.p();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransformableElement transformableElement = (TransformableElement) obj;
        if (d.F(this.a, transformableElement.a) && this.b == transformableElement.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.v(false)) * 31) + a.v(false);
    }
}
