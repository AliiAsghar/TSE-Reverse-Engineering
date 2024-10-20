package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ager implements hh {
    final /* synthetic */ List a;
    final /* synthetic */ ageu b;
    final /* synthetic */ RecyclerView c;
    final /* synthetic */ arqg d;
    final /* synthetic */ no e;

    public ager(List list, ageu ageuVar, RecyclerView recyclerView, arqg arqgVar, no noVar) {
        this.a = list;
        this.b = ageuVar;
        this.c = recyclerView;
        this.d = arqgVar;
        this.e = noVar;
    }

    private final void e(List list) {
        Object obj;
        if (!this.b.b || !this.c.az()) {
            arqg arqgVar = this.d;
            no noVar = this.e;
            arng arngVar = new arng((arnj) arqgVar.a());
            int i = 0;
            while (arngVar.hasNext()) {
                Object next = arngVar.next();
                int i2 = i + 1;
                if (i < 0) {
                    aqjn.G();
                }
                afcs afcsVar = (afcs) next;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (aeke.cj((afcs) obj, afcsVar)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj != null) {
                    noVar.q(i);
                }
                i = i2;
            }
        }
    }

    @Override // defpackage.hh
    public final void a(int i, int i2, Object obj) {
        List list = this.a;
        e(list.subList(i, list.size()));
    }

    @Override // defpackage.hh
    public final void b(int i, int i2) {
        List list = this.a;
        e(list.subList(i, list.size()));
    }

    @Override // defpackage.hh
    public final void c(int i, int i2) {
        e(this.a.subList(i, i2));
    }

    @Override // defpackage.hh
    public final void d(int i, int i2) {
        List list = this.b.d;
        e(list.subList(i, list.size()));
    }
}
