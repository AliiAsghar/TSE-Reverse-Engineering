package androidx.compose.animation;

import defpackage.cga;
import defpackage.cvx;
import defpackage.cyg;
import defpackage.d;
import defpackage.xy;
import defpackage.yb;
import defpackage.yc;
import defpackage.ye;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SharedBoundsNodeElement extends cyg<xy> {
    private final ye a;

    public SharedBoundsNodeElement(ye yeVar) {
        this.a = yeVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new xy(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        xy xyVar = (xy) cVar;
        ye yeVar = xyVar.a;
        ye yeVar2 = this.a;
        if (!d.F(yeVar2, yeVar)) {
            xyVar.a = yeVar2;
            if (xyVar.z) {
                cvx.b(xyVar, yc.a, yeVar2);
                xyVar.a.k = (ye) cvx.a(xyVar, yc.a);
                xyVar.a.j(xyVar.b);
                xyVar.a.j = new yb(xyVar);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SharedBoundsNodeElement) && d.F(this.a, ((SharedBoundsNodeElement) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.a + ')';
    }
}
