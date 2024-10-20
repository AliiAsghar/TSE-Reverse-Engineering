package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nao extends agmc {
    public static final /* synthetic */ int b = 0;
    public final arqr a;
    private final agnq c;

    public nao(agnq agnqVar, arqr arqrVar) {
        this.c = agnqVar;
        this.a = arqrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agmc
    public final /* synthetic */ void b(agoz agozVar, aglo agloVar) {
        List list;
        agpr r = agloVar.r();
        if (r == null) {
            list = new ArrayList();
        } else {
            tbs d = PartsTable.d();
            d.w("MPSCQL::onChangeInTransaction::update");
            d.d(new mva(18));
            alur it = r.e.iterator();
            while (it.hasNext()) {
                agpw agpwVar = (agpw) it.next();
                agpwVar.getClass();
                d.k(agpwVar);
            }
            sxy d2 = MessagesTable.d();
            d2.w("MPSCQL::onChangeInTransaction::update2");
            d2.d(new mva(19));
            d2.C(agoh.b(d.b(), PartsTable.d.b, MessagesTable.c.a));
            agmq n = d2.b().n();
            try {
                List aA = d.aA(miq.UPDATE, (sxt) n);
                armd.i(n, null);
                list = aA;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    armd.i(n, th);
                    throw th2;
                }
            }
        }
        if (!list.isEmpty()) {
            this.c.h(new mla(4), String.valueOf(list.hashCode()), new nan(this, list, 0));
        }
    }
}
