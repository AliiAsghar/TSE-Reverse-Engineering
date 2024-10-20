package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ako implements akn {
    public static final ako a = new ako();

    private ako() {
    }

    @Override // defpackage.akn
    public final cga a(cga cgaVar, cfq.b bVar) {
        return cgaVar.a(new HorizontalAlignElement(bVar));
    }

    @Override // defpackage.akn
    public final cga b(cga cgaVar, float f, boolean z) {
        if (f <= 0.0d) {
            ann.a("invalid weight; must be greater than zero");
        }
        return cgaVar.a(new LayoutWeightElement(arrn.p(f, Float.MAX_VALUE), z));
    }
}
