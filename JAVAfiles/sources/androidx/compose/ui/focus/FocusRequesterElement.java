package androidx.compose.ui.focus;

import defpackage.cga;
import defpackage.cit;
import defpackage.cix;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusRequesterElement extends cyg<cix> {
    private final cit a;

    public FocusRequesterElement(cit citVar) {
        this.a = citVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new cix(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        cix cixVar = (cix) cVar;
        cixVar.a.c.m(cixVar);
        cixVar.a = this.a;
        cixVar.a.c.n(cixVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusRequesterElement) && d.F(this.a, ((FocusRequesterElement) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}
