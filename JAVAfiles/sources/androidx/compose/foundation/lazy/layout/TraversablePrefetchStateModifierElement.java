package androidx.compose.foundation.lazy.layout;

import defpackage.asm;
import defpackage.atn;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TraversablePrefetchStateModifierElement extends cyg<atn> {
    private final asm a;

    public TraversablePrefetchStateModifierElement(asm asmVar) {
        this.a = asmVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new atn(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ((atn) cVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TraversablePrefetchStateModifierElement) && d.F(this.a, ((TraversablePrefetchStateModifierElement) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ')';
    }
}
