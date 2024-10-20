package androidx.compose.ui.semantics;

import defpackage.a;
import defpackage.arqr;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;
import defpackage.dgq;
import defpackage.dgy;
import defpackage.dha;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends cyg<dgq> implements dha {
    private final boolean a;
    private final arqr b;

    public AppendedSemanticsElement(boolean z, arqr arqrVar) {
        this.a = z;
        this.b = arqrVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new dgq(this.a, false, this.b);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        dgq dgqVar = (dgq) cVar;
        dgqVar.a = this.a;
        dgqVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        if (this.a == appendedSemanticsElement.a && d.F(this.b, appendedSemanticsElement.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dha
    public final dgy f() {
        dgy dgyVar = new dgy();
        dgyVar.a = this.a;
        this.b.a(dgyVar);
        return dgyVar;
    }

    public final int hashCode() {
        return (a.v(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.a + ", properties=" + this.b + ')';
    }
}
