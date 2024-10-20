package androidx.compose.foundation.layout;

import defpackage.anc;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class VerticalAlignElement extends cyg<anc> {
    private final cfq.c a;

    public VerticalAlignElement(cfq.c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new anc(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ((anc) cVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        VerticalAlignElement verticalAlignElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerticalAlignElement) {
            verticalAlignElement = (VerticalAlignElement) obj;
        } else {
            verticalAlignElement = null;
        }
        if (verticalAlignElement == null) {
            return false;
        }
        return d.F(this.a, verticalAlignElement.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
