package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvx extends agmc {
    public static final /* synthetic */ int c = 0;
    public final arqr a;
    public final List b = new ArrayList();
    private final agnq f;

    public mvx(agnq agnqVar, arqr arqrVar) {
        this.f = agnqVar;
        this.a = arqrVar;
    }

    private static final List f(miq miqVar, sxt sxtVar) {
        ArrayList arrayList = new ArrayList();
        while (sxtVar.moveToNext()) {
            try {
                MessagesTable.BindData bindData = (MessagesTable.BindData) sxtVar.cK();
                CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bindData.A(), -1L);
                ConversationIdType z = bindData.z();
                if (z != null) {
                    arrayList.add(new mzi(miqVar, coreBugleMessageId, new BugleConversationId(z), Instant.ofEpochMilli(bindData.t()), 0));
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } finally {
            }
        }
        armd.i(sxtVar, null);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agmc
    public final /* synthetic */ void b(agoz agozVar, aglo agloVar) {
        Iterable f;
        Iterable arrayList;
        Iterable f2;
        stc stcVar = (stc) agloVar.p();
        int i = 3;
        if (stcVar == null) {
            f = new ArrayList();
        } else {
            sxy d = MessagesTable.d();
            d.w("MessageAnnotationChangeQueryListener#onChangeInTransaction#insert");
            d.d(new mva(14));
            d.g(new mvp(stcVar, i));
            f = f(miq.INSERT, (sxt) d.b().n());
        }
        aqjn.S(this.b, f);
        List list = this.b;
        aglz[] t = agloVar.t();
        if (t != null) {
            ArrayList arrayList2 = new ArrayList();
            for (aglz aglzVar : t) {
                if (aglzVar instanceof stc) {
                    arrayList2.add(aglzVar);
                }
            }
            sxy d2 = MessagesTable.d();
            d2.w("MessageAnnotationChangeQueryListener#onChangeInTransaction#bulkInsert");
            d2.d(new mva(9));
            d2.g(new mvp(arrayList2, 2));
            arrayList = f(miq.INSERT, (sxt) d2.b().n());
        } else {
            arrayList = new ArrayList();
        }
        aqjn.S(list, arrayList);
        List list2 = this.b;
        agpr r = agloVar.r();
        if (r == null) {
            f2 = new ArrayList();
        } else {
            stj a = stl.a();
            a.w("MessageAnnotationChangeQueryListener#onChangeInTransaction#update");
            a.c(new mva(12));
            alur it = r.e.iterator();
            while (it.hasNext()) {
                agpw agpwVar = (agpw) it.next();
                agpwVar.getClass();
                a.k(agpwVar);
            }
            sxy d3 = MessagesTable.d();
            d3.w("MessageAnnotationChangeQueryListener#onChangeInTransaction#update2");
            d3.d(new mva(13));
            sti b = a.b();
            Object obj = stl.e.f;
            sxp sxpVar = MessagesTable.c.a;
            stk stkVar = new stk();
            stkVar.b();
            d3.C(b.q((agmh) obj, sxpVar, new agpw(stkVar)));
            f2 = f(miq.UPDATE, (sxt) d3.b().n());
        }
        aqjn.S(list2, f2);
        if (!this.b.isEmpty()) {
            this.f.h(new mla(i), String.valueOf(this.b.hashCode()), new kut(this, 18));
        }
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ void c(agoz agozVar, aglo agloVar) {
        Iterable f;
        this.b.clear();
        agpw s = agloVar.s();
        if (s == null) {
            f = new ArrayList();
        } else {
            stj a = stl.a();
            a.w("MessageAnnotationChangeQueryListener#onChangeInTransaction#delete");
            a.c(new mva(10));
            a.k(s);
            sxy d = MessagesTable.d();
            d.w("MessageAnnotationChangeQueryListener#onChangeInTransaction#delete2");
            d.d(new mva(11));
            d.C(agoh.b(a.b(), (agmh) stl.e.f, MessagesTable.c.a));
            f = f(miq.DELETE, (sxt) d.b().n());
        }
        aqjn.S(this.b, f);
    }
}
