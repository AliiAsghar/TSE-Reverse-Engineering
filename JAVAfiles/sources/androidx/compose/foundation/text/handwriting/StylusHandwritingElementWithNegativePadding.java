package androidx.compose.foundation.text.handwriting;

import defpackage.arqg;
import defpackage.baq;
import defpackage.bar;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class StylusHandwritingElementWithNegativePadding extends cyg<bar> {
    private final arqg a;

    public StylusHandwritingElementWithNegativePadding(arqg arqgVar) {
        this.a = arqgVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new bar(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ((baq) ((bar) cVar)).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof StylusHandwritingElementWithNegativePadding) && d.F(this.a, ((StylusHandwritingElementWithNegativePadding) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.a + ')';
    }
}
