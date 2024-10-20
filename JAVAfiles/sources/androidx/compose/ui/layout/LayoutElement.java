package androidx.compose.ui.layout;

import defpackage.arqw;
import defpackage.cga;
import defpackage.ctr;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LayoutElement extends cyg<ctr> {
    private final arqw a;

    public LayoutElement(arqw arqwVar) {
        this.a = arqwVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new ctr(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ((ctr) cVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LayoutElement) && d.F(this.a, ((LayoutElement) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.a + ')';
    }
}
