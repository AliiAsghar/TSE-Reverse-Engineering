package androidx.compose.material3.internal;

import defpackage.arqr;
import defpackage.bsu;
import defpackage.cga;
import defpackage.cyg;
import defpackage.czl;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ChildSemanticsNodeElement extends cyg<bsu> {
    private final arqr a;

    public ChildSemanticsNodeElement(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new bsu(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        bsu bsuVar = (bsu) cVar;
        bsuVar.a = this.a;
        czl.a(bsuVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ChildSemanticsNodeElement) && d.F(this.a, ((ChildSemanticsNodeElement) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChildSemanticsNodeElement(properties=" + this.a + ')';
    }
}
