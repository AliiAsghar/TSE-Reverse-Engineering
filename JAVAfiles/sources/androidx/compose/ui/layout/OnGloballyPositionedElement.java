package androidx.compose.ui.layout;

import defpackage.arqr;
import defpackage.cga;
import defpackage.cus;
import defpackage.cyg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OnGloballyPositionedElement extends cyg<cus> {
    private final arqr a;

    public OnGloballyPositionedElement(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new cus(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ((cus) cVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OnGloballyPositionedElement) && this.a == ((OnGloballyPositionedElement) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
