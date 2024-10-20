package androidx.compose.ui.layout;

import defpackage.arqr;
import defpackage.cga;
import defpackage.cuu;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OnPlacedElement extends cyg<cuu> {
    private final arqr a;

    public OnPlacedElement(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new cuu(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ((cuu) cVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OnPlacedElement) && d.F(this.a, ((OnPlacedElement) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPlacedElement(onPlaced=" + this.a + ')';
    }
}
