package androidx.compose.ui.input.rotary;

import defpackage.arqr;
import defpackage.cga;
import defpackage.cse;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RotaryInputElement extends cyg<cse> {
    private final arqr a;
    private final arqr b = null;

    public RotaryInputElement(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new cse(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ((cse) cVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        if (!d.F(this.a, rotaryInputElement.a)) {
            return false;
        }
        arqr arqrVar = rotaryInputElement.b;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.a + ", onPreRotaryScrollEvent=null)";
    }
}
