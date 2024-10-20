package androidx.compose.ui.semantics;

import defpackage.arqr;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;
import defpackage.dgq;
import defpackage.dgy;
import defpackage.dha;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends cyg<dgq> implements dha {
    private final arqr a;

    public ClearAndSetSemanticsElement(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new dgq(false, true, this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ((dgq) cVar).b = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ClearAndSetSemanticsElement) && d.F(this.a, ((ClearAndSetSemanticsElement) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dha
    public final dgy f() {
        dgy dgyVar = new dgy();
        dgyVar.a = false;
        dgyVar.b = true;
        this.a.a(dgyVar);
        return dgyVar;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.a + ')';
    }
}
