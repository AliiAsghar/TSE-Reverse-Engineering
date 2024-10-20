package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdw extends nq {
    private final agdz a;
    private final alms b = new alms(5);

    public agdw(agdz agdzVar) {
        this.a = agdzVar;
    }

    @Override // defpackage.nq
    public final void dG(RecyclerView recyclerView, int i, int i2) {
        this.b.add(new agdv(System.currentTimeMillis(), i2));
        this.a.d(i2);
    }

    @Override // defpackage.nq
    public final void t(RecyclerView recyclerView, int i) {
        float f;
        double d;
        alms almsVar = this.b;
        if (almsVar.size() <= 1) {
            almsVar = null;
        }
        if (almsVar != null) {
            int i2 = 0;
            Iterator it = aqjn.aM(almsVar, 1, false, agdl.c).iterator();
            double d2 = 0.0d;
            while (it.hasNext()) {
                d2 += ((Number) it.next()).floatValue();
                i2++;
                if (i2 < 0) {
                    aqjn.F();
                }
            }
            if (i2 == 0) {
                d = Double.NaN;
            } else {
                d = d2 / i2;
            }
            f = (float) d;
        } else {
            f = brg.a;
        }
        this.a.c(i, f);
        if (i == 0) {
            this.b.clear();
        }
    }
}
