package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xtj implements utv, adiu, acmr {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl");
    public final Map b;
    public final armf c;
    public final armf d;
    public final ahlp e;
    private final armf f;
    private final armf g;
    private final arwe h;
    private final AtomicBoolean i;
    private final adae j;

    public xtj(Map map, armf armfVar, armf armfVar2, adae adaeVar, armf armfVar3, armf armfVar4, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        adaeVar.getClass();
        arweVar.getClass();
        this.b = map;
        this.f = armfVar;
        this.g = armfVar2;
        this.j = adaeVar;
        this.c = armfVar3;
        this.d = armfVar4;
        this.h = arweVar;
        this.e = new ahlp(null, null, null, null);
        this.i = new AtomicBoolean(false);
    }

    private final Set h(Iterable iterable) {
        adji adjiVar = (adji) this.f.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            adiv adivVar = (adiv) it.next();
            adivVar.getClass();
            adit aditVar = (adit) arsd.k(adjiVar.d(adivVar));
            if (aditVar != null) {
                arrayList.add(aditVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((psq) this.g.b()).c(((adit) it2.next()).a));
        }
        return aqjn.aE(arrayList2);
    }

    private final void i() {
        if (!this.i.get()) {
            alvw g = a.g();
            g.X(alwp.a, "BugleTransport");
            ((alvg) g.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl", "kickOffUpdateTransportRegistration", 153, "ChatTransportControllerImpl.kt")).q("Not kicking off update transport registration because RCS provisioning change has not been received.");
        } else {
            alvw d = a.d();
            d.X(alwp.a, "BugleTransport");
            ((alvg) d.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl", "kickOffUpdateTransportRegistration", 158, "ChatTransportControllerImpl.kt")).q("Kicking off update transport registration.");
            qjh.l(this.h, null, new lfn(this, (arpe) null, 12), 3);
        }
    }

    @Override // defpackage.utv
    public final void a() {
        alvw d = a.d();
        d.X(alwp.a, "BugleTransport");
        ((alvg) d.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl", "onBuglePhenotypeFlagChanged", 64, "ChatTransportControllerImpl.kt")).q("onBuglePhenotypeFlagChanged event received. Kicking off transport registration update.");
        i();
    }

    @Override // defpackage.adiu
    public final void b() {
        alvw d = a.d();
        d.X(alwp.a, "BugleTransport");
        ((alvg) d.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl", "onRcsProvisioningChange", 76, "ChatTransportControllerImpl.kt")).q("onRcsProvisioningChange event received. Kicking off transport registration update.");
        this.i.set(true);
        i();
    }

    public final xtg c(qei qeiVar) {
        qeiVar.getClass();
        akrh e = aktp.e("ChatTransportControllerImpl#getChatTransport");
        try {
            adji adjiVar = (adji) this.f.b();
            adae adaeVar = this.j;
            String str = qeiVar.d;
            str.getClass();
            adiv adivVar = (adiv) arsd.k(adjiVar.f(adaeVar.d(str)));
            if (adivVar == null) {
                xtg xtgVar = xtg.a;
                armd.i(e, null);
                return xtgVar;
            }
            xtg xtgVar2 = (xtg) ((xtr) this.d.b()).a().get(adom.n(adivVar));
            if (xtgVar2 == null) {
                xtgVar2 = xtg.a;
            }
            armd.i(e, null);
            return xtgVar2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(e, th);
                throw th2;
            }
        }
    }

    @armg
    public final amuk d() {
        akrh e = aktp.e("ChatTransportControllerImpl#enabledTransport");
        try {
            xtg xtgVar = (xtg) aqjn.Y(g());
            if (xtgVar == null) {
                xtgVar = xtg.a;
            }
            amuk amukVar = xtgVar.f;
            armd.i(e, null);
            return amukVar;
        } finally {
        }
    }

    public final Set e() {
        akrh e = aktp.e("ChatTransportControllerImpl#getChatEndpoints");
        try {
            alor a2 = ((xtr) this.d.b()).a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = a2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((xtg) entry.getValue()) != xtg.a) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set h = h(linkedHashMap.keySet());
            armd.i(e, null);
            return h;
        } finally {
        }
    }

    public final Set f(xtg xtgVar) {
        xtgVar.getClass();
        akrh e = aktp.e("ChatTransportControllerImpl#getChatEndpoints_forChatTransport");
        try {
            Set h = h(((xtr) this.d.b()).a().s().p().b(xtgVar));
            armd.i(e, null);
            return h;
        } finally {
        }
    }

    @Override // defpackage.utv
    public final boolean fN() {
        return true;
    }

    public final Set g() {
        akrh e = aktp.e("ChatTransportControllerImpl#getChatTransports");
        try {
            Collection values = ((xtr) this.d.b()).a().values();
            values.getClass();
            Set aE = aqjn.aE(values);
            armd.i(e, null);
            return aE;
        } finally {
        }
    }

    @Override // defpackage.acmr
    public final void s() {
        alvw d = a.d();
        d.X(alwp.a, "BugleTransport");
        ((alvg) d.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl", "onSystemBound", 69, "ChatTransportControllerImpl.kt")).q("onSystemBound event received. Kicking off transport registration update.");
        i();
    }
}
