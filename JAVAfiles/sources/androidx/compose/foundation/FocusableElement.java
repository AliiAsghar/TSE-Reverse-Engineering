package androidx.compose.foundation;

import defpackage.aen;
import defpackage.ajr;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusableElement extends cyg<aen> {
    private final ajr a;

    public FocusableElement(ajr ajrVar) {
        this.a = ajrVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new aen(this.a, 1, null);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ((aen) cVar).j(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusableElement) && d.F(this.a, ((FocusableElement) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        ajr ajrVar = this.a;
        if (ajrVar != null) {
            return ajrVar.hashCode();
        }
        return 0;
    }
}
