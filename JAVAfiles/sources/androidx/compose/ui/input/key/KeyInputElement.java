package androidx.compose.ui.input.key;

import defpackage.arqr;
import defpackage.cga;
import defpackage.cpw;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class KeyInputElement extends cyg<cpw> {
    private final arqr a;
    private final arqr b;

    public KeyInputElement(arqr arqrVar, arqr arqrVar2) {
        this.a = arqrVar;
        this.b = arqrVar2;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new cpw(this.a, this.b);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        cpw cpwVar = (cpw) cVar;
        cpwVar.a = this.a;
        cpwVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        if (d.F(this.a, keyInputElement.a) && d.F(this.b, keyInputElement.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        arqr arqrVar = this.a;
        int i = 0;
        if (arqrVar == null) {
            hashCode = 0;
        } else {
            hashCode = arqrVar.hashCode();
        }
        arqr arqrVar2 = this.b;
        if (arqrVar2 != null) {
            i = arqrVar2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.a + ", onPreKeyEvent=" + this.b + ')';
    }
}
