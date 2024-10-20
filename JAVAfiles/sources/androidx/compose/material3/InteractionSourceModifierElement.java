package androidx.compose.material3;

import defpackage.ajr;
import defpackage.bmf;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class InteractionSourceModifierElement extends cyg<bmf> {
    private final ajr a;

    public InteractionSourceModifierElement(ajr ajrVar) {
        this.a = ajrVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new bmf();
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InteractionSourceModifierElement) && d.F(this.a, ((InteractionSourceModifierElement) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InteractionSourceModifierElement(interactionSource=" + this.a + ')';
    }
}
