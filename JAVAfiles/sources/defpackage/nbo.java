package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbo extends agmc {
    public static final /* synthetic */ int c = 0;
    public final arqr a;
    public final List b = new ArrayList();
    private final agnq f;

    public nbo(agnq agnqVar, arqr arqrVar) {
        this.f = agnqVar;
        this.a = arqrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agmc
    public final /* synthetic */ void b(agoz agozVar, aglo agloVar) {
        Collection aA;
        Iterable arrayList;
        Iterable aA2;
        tes tesVar = (tes) agloVar.p();
        int i = 13;
        if (tesVar == null) {
            aA = new ArrayList();
        } else if (tesVar.n().isEmpty() && tesVar.k() == 0) {
            aA = new ArrayList();
        } else {
            sxy d = MessagesTable.d();
            d.w("ReadReportChangeQueryListener#onChangeInTransaction#insert");
            d.d(new nas(15));
            d.g(new mvp(tesVar, i));
            aA = d.aA(miq.INSERT, (sxt) d.b().n());
        }
        aglz[] t = agloVar.t();
        if (t != null) {
            ArrayList arrayList2 = new ArrayList();
            for (aglz aglzVar : t) {
                if (aglzVar instanceof tes) {
                    arrayList2.add(aglzVar);
                }
            }
            sxy d2 = MessagesTable.d();
            d2.w("ReadReportChangeQueryListener#onChangeInTransaction#bulkInsert");
            d2.d(new nas(10));
            d2.g(new mvp(arrayList2, 12));
            arrayList = d.aA(miq.INSERT, (sxt) d2.b().n());
        } else {
            arrayList = new ArrayList();
        }
        List aq = aqjn.aq(aA, arrayList);
        agpr r = agloVar.r();
        if (r == null) {
            aA2 = new ArrayList();
        } else if (!r.l("read_time") && !r.l("ftd_time")) {
            aA2 = new ArrayList();
        } else {
            tex b = tfa.b();
            b.w("ReadReportChangeQueryListener#onChangeInTransaction#update");
            b.c(new nas(13));
            alur it = r.e.iterator();
            while (it.hasNext()) {
                agpw agpwVar = (agpw) it.next();
                agpwVar.getClass();
                b.k(agpwVar);
            }
            sxy d3 = MessagesTable.d();
            d3.w("ReadReportChangeQueryListener#onChangeInTransaction#update2");
            d3.d(new nas(14));
            d3.C(agoh.b(b.b(), (agmh) tfa.d.a, MessagesTable.c.a));
            aA2 = d.aA(miq.UPDATE, (sxt) d3.b().n());
        }
        aqjn.S(this.b, aqjn.aq(aq, aA2));
        if (!this.b.isEmpty()) {
            this.f.h(new mla(6), String.valueOf(this.b.hashCode()), new nau(this, 2));
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
            tex b = tfa.b();
            b.w("ReadReportChangeQueryListener#onChangeInTransaction#delete");
            b.c(new nas(11));
            b.k(s);
            sxy d = MessagesTable.d();
            d.w("ReadReportChangeQueryListener#onChangeInTransaction#delete2");
            d.d(new nas(12));
            d.C(agoh.b(b.b(), (agmh) tfa.d.a, MessagesTable.c.a));
            aA = d.aA(miq.DELETE, (sxt) d.b().n());
        }
        aqjn.S(this.b, aA);
    }
}
