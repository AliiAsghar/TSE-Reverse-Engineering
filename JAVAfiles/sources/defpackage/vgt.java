package defpackage;

import j$.util.Map;
import j$.util.concurrent.ConcurrentMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vgt {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl");
    public final vcy b;
    public final vba c;
    public final Map d;
    public final mbl e;
    public final ul f;
    public final anen g;
    public final xnv h;
    public final wpp i;
    private final Map j;
    private final armf k;
    private final arwe l;

    public vgt(Map map, Map map2, wpp wppVar, aneo aneoVar, arwe arweVar, xnv xnvVar, mbl mblVar, armf armfVar, vcy vcyVar, vba vbaVar) {
        new AtomicReference();
        this.f = new ul(100);
        this.b = vcyVar;
        this.c = vbaVar;
        this.d = map;
        this.j = map2;
        this.i = wppVar;
        this.g = aneoVar;
        this.l = arweVar;
        this.h = xnvVar;
        this.e = mblVar;
        this.k = armfVar;
        for (aqdr aqdrVar : map.keySet()) {
            alvw f = a.f();
            f.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl", "<init>", 116, "InboxMessageDispatcherImpl.java")).r("InboxMessageDispatcherImpl: Registered InboxMessageHandler type: %d", aqdrVar.a());
        }
    }

    public final akul a(String str, aqfn aqfnVar, aqdq aqdqVar) {
        return this.c.k().i(new mmc((Object) this, str, (Object) aqfnVar, (Object) aqdqVar, 18), this.g).e(Throwable.class, new uvz(str, aqdqVar, 13, null), andi.a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final akul b(final aqds aqdsVar) {
        arwl ax;
        akrh e = aktp.e("InboxMessageDispatcherImpl::handleInboxMessage");
        try {
            rdc rdcVar = (rdc) this.k.b();
            Map map = this.j;
            aqdr b = aqdr.b(aqdsVar.d);
            if (b == null) {
                b = aqdr.UNRECOGNIZED;
            }
            String a2 = ((qrn) Map.EL.getOrDefault(map, b, new qrn() { // from class: vgr
                @Override // defpackage.qrn
                public final String a(Object obj) {
                    return "default key for parallel execution";
                }
            })).a(aqdsVar);
            arwe arweVar = this.l;
            byte[] bArr = null;
            qrr qrrVar = new qrr(new ancr() { // from class: vgs
                /* JADX WARN: Removed duplicated region for block: B:40:0x0176  */
                @Override // defpackage.ancr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final com.google.common.util.concurrent.ListenableFuture a() {
                    /*
                        Method dump skipped, instructions count: 447
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.vgs.a():com.google.common.util.concurrent.ListenableFuture");
                }
            }, (arpe) null, 0);
            int i = 3;
            if (d.F(a2, "default key for parallel execution")) {
                ax = arrn.I(arweVar, null, null, qrrVar, 3);
            } else {
                Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(rdcVar.a, a2, new qcr(qnc.c, 20));
                computeIfAbsent.getClass();
                ax = albo.ax(arweVar, (ahlp) computeIfAbsent, qrrVar);
            }
            akul i2 = qjh.a(ax).i(new vfj(this, aqdsVar, i, bArr), this.g);
            e.b(i2);
            e.close();
            return i2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
