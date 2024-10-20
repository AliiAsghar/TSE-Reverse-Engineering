package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddv {
    public final dgy a;
    public final tz b;

    public ddv(dhe dheVar, tx txVar) {
        this.a = dheVar.c;
        if (dheVar.g() != null) {
            dheVar.j();
        }
        this.b = new tz(dheVar.i().size());
        List i = dheVar.i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            dhe dheVar2 = (dhe) i.get(i2);
            if (txVar.b(dheVar2.e)) {
                this.b.d(dheVar2.e);
            }
        }
    }
}
