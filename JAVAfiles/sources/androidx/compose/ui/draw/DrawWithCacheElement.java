package androidx.compose.ui.draw;

import defpackage.arqr;
import defpackage.cga;
import defpackage.chh;
import defpackage.chj;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DrawWithCacheElement extends cyg<chh> {
    private final arqr a;

    public DrawWithCacheElement(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new chh(new chj(), this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        chh chhVar = (chh) cVar;
        chhVar.a = this.a;
        chhVar.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DrawWithCacheElement) && d.F(this.a, ((DrawWithCacheElement) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.a + ')';
    }
}
