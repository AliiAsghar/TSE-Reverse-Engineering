package androidx.compose.ui.graphics;

import defpackage.arqr;
import defpackage.cga;
import defpackage.ckm;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BlockGraphicsLayerElement extends cyg<ckm> {
    private final arqr a;

    public BlockGraphicsLayerElement(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new ckm(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ckm ckmVar = (ckm) cVar;
        ckmVar.a = this.a;
        ckmVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BlockGraphicsLayerElement) && d.F(this.a, ((BlockGraphicsLayerElement) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.a + ')';
    }
}
