package androidx.compose.ui.input.pointer;

import defpackage.cga;
import defpackage.cqe;
import defpackage.cqv;
import defpackage.cqx;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends cyg<cqv> {
    private final cqx a;
    private final boolean b = false;

    public PointerHoverIconModifierElement(cqx cqxVar) {
        this.a = cqxVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new cqv(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        cqv cqvVar = (cqv) cVar;
        cqx cqxVar = cqvVar.b;
        cqx cqxVar2 = this.a;
        if (!d.F(cqxVar, cqxVar2)) {
            cqvVar.b = cqxVar2;
            if (cqvVar.c) {
                cqvVar.a();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        if (!d.F(this.a, pointerHoverIconModifierElement.a)) {
            return false;
        }
        boolean z = pointerHoverIconModifierElement.b;
        return true;
    }

    public final int hashCode() {
        return (((cqe) this.a).a * 31) + 1237;
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}
