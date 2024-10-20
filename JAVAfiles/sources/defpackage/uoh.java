package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uoh {
    public static final xze a = xze.g("BugleWorkQueue", "WorkQueueCancellationController");
    public final uop b;
    public final arwe c;
    public final ahlp d;
    public final aogy e;
    private final agnq f;
    private final uqg g;
    private final usk h;
    private final urr i;

    public uoh(agnq agnqVar, uro uroVar, uqg uqgVar, usk uskVar, aogy aogyVar, urr urrVar, uop uopVar, arwe arweVar, arwe arweVar2) {
        agnqVar.getClass();
        uroVar.getClass();
        uqgVar.getClass();
        uskVar.getClass();
        aogyVar.getClass();
        urrVar.getClass();
        uopVar.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        this.f = agnqVar;
        this.g = uqgVar;
        this.h = uskVar;
        this.e = aogyVar;
        this.i = urrVar;
        this.b = uopVar;
        this.c = arweVar2;
        this.d = new ahlp(null, null, null, null);
    }

    public final int a(String str, String str2) {
        return ((List) this.f.c("cancelPendingByHandlerKeyAndTag", new tdw(this, str, str2, 7))).size();
    }

    public final alog b(String str, boolean z) {
        List list = (List) this.f.c("cancelAllPendingByHandlerKey", new ubu(this, str, 9));
        list.getClass();
        d(list);
        if (z) {
            return alzz.aZ(list);
        }
        int i = alog.d;
        alog alogVar = alsx.a;
        alogVar.getClass();
        return alogVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ascd] */
    public final List c(arqr arqrVar) {
        agnw d;
        Collection values = ((Map) this.h.d.c()).values();
        ArrayList arrayList = new ArrayList(aqjn.J(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((use) it.next()).a().b);
        }
        Iterable iterable = arnv.a;
        if (!arrayList.isEmpty()) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                iterable = aqjn.aq((List) listIterator.previous(), iterable);
            }
        }
        upw upwVar = new upw();
        upwVar.f("cancelPending");
        upwVar.b(new uol(arqrVar, 1));
        Object obj = upwVar.a().b;
        d = agnc.d("$primary");
        alog alogVar = (alog) d.s("work_queue-deleteAndReturnDeletedRows-txn", new udn(obj, 8));
        alogVar.getClass();
        return alogVar;
    }

    public final void d(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            upr uprVar = (upr) it.next();
            this.g.a(uprVar.k());
            unj unjVar = this.i.n;
            unjVar.c(new ung(unjVar, uprVar, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Iterable iterable) {
        agnw d;
        if (this.f.j()) {
            upy a2 = uqb.a();
            a2.w("cancelScheduledWorkForEmptyQueues remaining items");
            a2.d(new uje(iterable, 19));
            int i = 1;
            a2.t(uqb.c.f);
            a2.c((upu) uqb.c.f);
            alog t = a2.b().t();
            t.getClass();
            ArrayList arrayList = new ArrayList(aqjn.J(t, 10));
            alur it = t.iterator();
            while (it.hasNext()) {
                arrayList.add(((upr) it.next()).o());
            }
            Set g = aqjn.g(aqjn.aE(iterable), aqjn.aE(arrayList));
            if (g.isEmpty()) {
                return;
            }
            xyo c = a.c();
            c.H("Cancelling WorkManager associations");
            c.z("queues", g);
            c.q();
            uqy uqyVar = new uqy();
            uqyVar.f("cancelScheduledWorkForEmptyQueues");
            uqyVar.b(new uje(g, 20));
            Object obj = uqyVar.a().b;
            d = agnc.d("$primary");
            alog alogVar = (alog) d.s("work_queue_work_manager_ids-deleteAndReturnDeletedRows-txn", new uqw(obj, i));
            alogVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator<E> it2 = alogVar.iterator();
            while (it2.hasNext()) {
                Optional h = ((uqs) it2.next()).h();
                h.getClass();
                UUID uuid = (UUID) arsd.k(h);
                if (uuid != null) {
                    arrayList2.add(uuid);
                }
            }
            qjh.l(this.c, null, new tyi(arrayList2, this, (arpe) null, 7), 3);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
