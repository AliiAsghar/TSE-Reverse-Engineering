package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ndv extends agmc {
    public static final /* synthetic */ int a = 0;
    private final arqv b;

    public ndv(arqv arqvVar) {
        this.b = arqvVar;
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ Object d(agoz agozVar, aglo agloVar) {
        ndu nduVar = new ndu(null);
        agpw s = agloVar.s();
        if (s != null) {
            sla a2 = sld.a();
            a2.w("ConversationParticipantsQueryListener#preChangeInTransaction");
            a2.d(new ncy(15));
            a2.k(s);
            a2.u(10);
            agmq n = a2.b().n();
            try {
                skx skxVar = (skx) n;
                if (skxVar.moveToNext()) {
                    nduVar.a.add(new BugleConversationId(skxVar.f()));
                }
                armd.i(n, null);
            } finally {
            }
        }
        return nduVar;
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ void e(agoz agozVar, aglo agloVar, Object obj) {
        ConversationIdType l;
        obj.getClass();
        ndu nduVar = (ndu) obj;
        aglz p = agloVar.p();
        if (p != null && (l = ((sku) p).l()) != null) {
            nduVar.a.add(new BugleConversationId(l));
        }
        aglz[] t = agloVar.t();
        if (t != null) {
            ArrayList arrayList = new ArrayList();
            for (aglz aglzVar : t) {
                aglzVar.getClass();
                ConversationIdType l2 = ((sku) aglzVar).l();
                if (l2 != null) {
                    arrayList.add(l2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                nduVar.a.add(new BugleConversationId((ConversationIdType) it.next()));
            }
        }
        if (!nduVar.a.isEmpty()) {
            this.b.a(alzz.bd(nduVar.a), false);
        }
    }
}
