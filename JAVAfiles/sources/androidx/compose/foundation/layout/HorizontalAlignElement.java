package androidx.compose.foundation.layout;

import defpackage.alq;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class HorizontalAlignElement extends cyg<alq> {
    private final cfq.b a;

    public HorizontalAlignElement(cfq.b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new alq(this.a);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ((alq) cVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        HorizontalAlignElement horizontalAlignElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof HorizontalAlignElement) {
            horizontalAlignElement = (HorizontalAlignElement) obj;
        } else {
            horizontalAlignElement = null;
        }
        if (horizontalAlignElement == null) {
            return false;
        }
        return d.F(this.a, horizontalAlignElement.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
