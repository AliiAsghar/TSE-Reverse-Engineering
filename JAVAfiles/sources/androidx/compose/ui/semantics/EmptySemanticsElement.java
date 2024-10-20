package androidx.compose.ui.semantics;

import defpackage.cga;
import defpackage.cyg;
import defpackage.dgs;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EmptySemanticsElement extends cyg<dgs> {
    private final dgs a;

    public EmptySemanticsElement(dgs dgsVar) {
        this.a = dgsVar;
    }

    @Override // defpackage.cyg
    public final /* synthetic */ cga.c d() {
        return this.a;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }
}
