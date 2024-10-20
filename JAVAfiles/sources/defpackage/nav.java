package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nav extends agmc {
    public static final /* synthetic */ int c = 0;
    public final arqr a;
    public final List b = new ArrayList();
    private final agnq f;

    public nav(agnq agnqVar, arqr arqrVar) {
        this.f = agnqVar;
        this.a = arqrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agmc
    public final /* synthetic */ void b(agoz agozVar, aglo agloVar) {
        Collection aA;
        Iterable arrayList;
        Iterable aA2;
        ssi ssiVar = (ssi) agloVar.p();
        if (ssiVar == null) {
            aA = new ArrayList();
        } else {
            sxy d = MessagesTable.d();
            d.w("PreviewMessageChangeQueryListener#onChangeInTransaction#insert");
            d.d(new nas(4));
            d.g(new mvp(ssiVar, 9));
            aA = d.aA(miq.INSERT, (sxt) d.b().n());
        }
        aglz[] t = agloVar.t();
        int i = 5;
        int i2 = 0;
        if (t != null) {
            ArrayList arrayList2 = new ArrayList();
            for (aglz aglzVar : t) {
                if (aglzVar instanceof ssi) {
                    arrayList2.add(aglzVar);
                }
            }
            sxy d2 = MessagesTable.d();
            d2.w("PreviewMessageChangeQueryListener#onChangeInTransaction#bulkInsert");
            d2.d(new nas(5));
            d2.g(new mvp(arrayList2, 10));
            arrayList = d.aA(miq.INSERT, (sxt) d2.b().n());
        } else {
            arrayList = new ArrayList();
        }
        List aq = aqjn.aq(aA, arrayList);
        agpr r = agloVar.r();
        if (r == null) {
            aA2 = new ArrayList();
        } else {
            ssp c2 = sss.c();
            c2.w("PreviewMessageChangeQueryListener#onChangeInTransaction#update");
            c2.d(new nas(6));
            alur it = r.e.iterator();
            while (it.hasNext()) {
                agpw agpwVar = (agpw) it.next();
                agpwVar.getClass();
                c2.k(agpwVar);
            }
            sxy d3 = MessagesTable.d();
            d3.w("PreviewMessageChangeQueryListener#onChangeInTransaction#update2");
            d3.d(new nas(7));
            d3.C(agoh.b(c2.b(), sss.d.b, MessagesTable.c.a));
            aA2 = d.aA(miq.UPDATE, (sxt) d3.b().n());
        }
        aqjn.S(this.b, aqjn.aq(aq, aA2));
        if (!this.b.isEmpty()) {
            this.f.h(new mla(i), String.valueOf(this.b.hashCode()), new nau(this, i2));
        }
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ void c(agoz agozVar, aglo agloVar) {
        Iterable aA;
        this.b.clear();
        agpw s = agloVar.s();
        if (s == null) {
            aA = new ArrayList();
        } else {
            ssp c2 = sss.c();
            c2.w("PreviewMessageChangeQueryListener#onChangeInTransaction#delete");
            c2.d(new nas(2));
            c2.k(s);
            sxy d = MessagesTable.d();
            d.w("PreviewMessageChangeQueryListener#onChangeInTransaction#delete2");
            d.d(new nas(3));
            d.C(agoh.b(c2.b(), sss.d.b, MessagesTable.c.a));
            aA = d.aA(miq.DELETE, (sxt) d.b().n());
        }
        aqjn.S(this.b, aA);
    }
}
