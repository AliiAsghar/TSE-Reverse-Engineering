package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ndx extends agmc {
    public static final /* synthetic */ int a = 0;
    private final arqv b;

    public ndx(arqv arqvVar) {
        this.b = arqvVar;
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ Object d(agoz agozVar, aglo agloVar) {
        ndw ndwVar = new ndw(null);
        agpw s = agloVar.s();
        if (s != null) {
            smm smmVar = new smm(smp.a);
            smmVar.w("ConversationToParticipantsQueryListener#preChangeInTransaction");
            smmVar.d(new ncy(16));
            smmVar.k(s);
            smmVar.u(10);
            agmq n = smmVar.b().n();
            try {
                smj smjVar = (smj) n;
                if (smjVar.moveToNext()) {
                    ndwVar.a.add(new BugleConversationId(smjVar.f()));
                }
                armd.i(n, null);
            } finally {
            }
        }
        return ndwVar;
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ void e(agoz agozVar, aglo agloVar, Object obj) {
        ConversationIdType l;
        obj.getClass();
        ndw ndwVar = (ndw) obj;
        aglz p = agloVar.p();
        if (p != null && (l = ((smh) p).l()) != null) {
            ndwVar.a.add(new BugleConversationId(l));
        }
        aglz[] t = agloVar.t();
        if (t != null) {
            ArrayList arrayList = new ArrayList();
            for (aglz aglzVar : t) {
                aglzVar.getClass();
                ConversationIdType l2 = ((smh) aglzVar).l();
                if (l2 != null) {
                    arrayList.add(l2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ndwVar.a.add(new BugleConversationId((ConversationIdType) it.next()));
            }
        }
        if (!ndwVar.a.isEmpty()) {
            this.b.a(alzz.bd(ndwVar.a), false);
        }
    }
}
