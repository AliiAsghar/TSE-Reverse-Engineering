package androidx.compose.ui.focus;

import defpackage.arqr;
import defpackage.cga;
import defpackage.cia;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusChangedElement extends cyg<cia> {
    private final arqr a;

    public FocusChangedElement(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new cia(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ((cia) cVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusChangedElement) && d.F(this.a, ((FocusChangedElement) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.a + ')';
    }
}
