package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amu implements amt {
    public static final amu a = new amu();

    private amu() {
    }

    @Override // defpackage.amt
    public final cga a(cga cgaVar, cfq.c cVar) {
        return cgaVar.a(new VerticalAlignElement(cVar));
    }

    @Override // defpackage.amt
    public final cga b(cga cgaVar, float f, boolean z) {
        if (f <= 0.0d) {
            ann.a("invalid weight; must be greater than zero");
        }
        return cgaVar.a(new LayoutWeightElement(arrn.p(f, Float.MAX_VALUE), z));
    }
}
