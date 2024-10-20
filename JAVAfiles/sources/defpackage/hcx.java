package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcx extends hdd {
    public hcx(List list) {
        super(list);
    }

    @Override // defpackage.hcw
    public final /* bridge */ /* synthetic */ Object f(hie hieVar, float f) {
        return Integer.valueOf(l(hieVar, f));
    }

    public final int k() {
        return l(d(), b());
    }

    public final int l(hie hieVar, float f) {
        Integer num;
        if (hieVar.b != null && hieVar.c != null) {
            hig higVar = this.d;
            if (higVar != null && (num = (Integer) higVar.b(hieVar.g, hieVar.h.floatValue(), (Integer) hieVar.b, (Integer) hieVar.c, f, c(), this.c)) != null) {
                return num.intValue();
            }
            return gvf.S(hhy.a(f, brg.a, 1.0f), ((Integer) hieVar.b).intValue(), ((Integer) hieVar.c).intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
