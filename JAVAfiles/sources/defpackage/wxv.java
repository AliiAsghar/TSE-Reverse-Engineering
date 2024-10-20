package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import java.net.URI;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wxv implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wxv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, arqr] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        int i = 8;
        int i2 = 7;
        int i3 = 0;
        switch (this.b) {
            case 0:
                return wxz.d((IllegalArgumentException) obj, (rve) this.a, 3);
            case 1:
                return wxz.d((IllegalArgumentException) obj, (rve) this.a, 2);
            case 2:
                return wxz.n((IllegalArgumentException) obj, (rve) this.a, 4);
            case 3:
                return ((wxz) this.a).o((qgg) obj, 5);
            case 4:
                return wxz.n((IllegalArgumentException) obj, (rve) this.a, 5);
            case 5:
                return ((wxz) this.a).b((qgg) obj);
            case 6:
                return wxz.d((IllegalArgumentException) obj, (rve) this.a, 7);
            case 7:
                return this.a.a(obj);
            case 8:
                xze xzeVar = xac.c;
                return this.a;
            case 9:
                Optional optional = (Optional) obj;
                xac xacVar = (xac) this.a;
                long size = xacVar.j.size();
                if (!xacVar.j.isEmpty()) {
                    xab xabVar = (xab) xacVar.j.remove(0);
                    xacVar.y(xabVar.a, xabVar.b, xabVar.c, amvm.QUEUED_SYNC, (UUID) xabVar.d);
                    Iterator it = ((CopyOnWriteArraySet) xacVar.e.get()).iterator();
                    while (it.hasNext()) {
                        ((wzq) it.next()).a(false);
                    }
                } else {
                    xacVar.p(false);
                    Iterator it2 = ((CopyOnWriteArraySet) xacVar.e.get()).iterator();
                    while (it2.hasNext()) {
                        ((wzq) it2.next()).a(true);
                    }
                }
                if (optional.isPresent()) {
                    vyv vyvVar = (vyv) xacVar.h.b();
                    xbv xbvVar = (xbv) optional.get();
                    Instant f = xacVar.d.f();
                    int i4 = alog.d;
                    vyvVar.N(xbvVar.a, xbvVar.b, (Instant) xbvVar.c.orElse(Instant.EPOCH), f, size, alsx.a);
                } else {
                    vyv vyvVar2 = (vyv) xacVar.h.b();
                    int i5 = alog.d;
                    alog alogVar = alsx.a;
                    aozy createBuilder = amvf.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amvf amvfVar = (amvf) createBuilder.b;
                    amvfVar.b |= 1;
                    amvfVar.c = size;
                    ((xjc) vyvVar2.a).c(alogVar, (amvf) createBuilder.s());
                }
                return true;
            case 10:
                xcj.a.l("Starting timer for onAppInteractive tasks");
                Object obj2 = this.a;
                return ((xcj) obj2).e.schedule(new wkf(obj2, i), ((Integer) obj).intValue(), TimeUnit.SECONDS);
            case 11:
                alwo alwoVar = xdl.a;
                return this.a;
            case 12:
                alwo alwoVar2 = xdl.a;
                return this.a;
            case 13:
                alwo alwoVar3 = xdl.a;
                return this.a;
            case 14:
                alwo alwoVar4 = xdn.a;
                return this.a;
            case 15:
                return (pvj) ((algf) this.a).fu((anlt) obj);
            case 16:
                anlu anluVar = (anlu) obj;
                ((alwl) ((alwl) xdn.a.g()).h("com/google/android/apps/messaging/shared/tachygram/capabilities/TachygramNetworkCapabilitiesProvider", "getCapabilities", 105, "TachygramNetworkCapabilitiesProvider.java")).r("[Tachygram] Capabilities are fetched from the network. Size: %d", anluVar.a().size());
                return ((xdn) this.a).d(anluVar);
            case 17:
                anlu anluVar2 = (anlu) obj;
                ((alwl) ((alwl) xdq.a.g()).h("com/google/android/apps/messaging/shared/tachygram/capabilities/TachygramUserTransportAdapter", "fetchCapabilitiesInternal", 169, "TachygramUserTransportAdapter.java")).r("Capabilities are fetched from the network. Size: %d", anluVar2.a().size());
                Instant f2 = ((xdq) this.a).g.f();
                aozy createBuilder2 = ptz.a.createBuilder();
                for (anlr anlrVar : anluVar2.a()) {
                    aozy createBuilder3 = pua.a.createBuilder();
                    String str = anlrVar.a;
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    pua puaVar = (pua) createBuilder3.b;
                    puaVar.b |= 1;
                    puaVar.c = str;
                    Optional a = anlrVar.a();
                    createBuilder3.getClass();
                    a.ifPresent(new wqw(createBuilder3, i2));
                    createBuilder2.z((pua) createBuilder3.s());
                }
                alpr alprVar = new alpr();
                Iterator it3 = anluVar2.b.iterator();
                while (it3.hasNext()) {
                    alprVar.j(((anls) it3.next()).b);
                }
                aluq listIterator = alprVar.g().listIterator();
                while (listIterator.hasNext()) {
                    Optional map = vbe.b(((Integer) listIterator.next()).intValue()).c().map(new xdo(i3));
                    createBuilder2.getClass();
                    map.ifPresent(new wqw(createBuilder2, i));
                }
                pvm pvmVar = new pvm();
                pvmVar.i((ptz) createBuilder2.s());
                pvmVar.h(f2);
                return pvmVar.g();
            case 18:
                aqfn aqfnVar = (aqfn) obj;
                anjh anjhVar = new anjh(null);
                qei qeiVar = ((qfb) this.a).d;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                anjhVar.c(URI.create(qeiVar.d));
                anjhVar.b(aqfnVar);
                return anjhVar.a();
            case 19:
                return ((Optional) obj).flatMap(new xeo(this.a, i2));
            default:
                qeg qegVar = (qeg) obj;
                Object obj3 = this.a;
                qef qefVar = qef.OK;
                qeg qegVar2 = (qeg) obj3;
                qef b = qef.b(qegVar2.c);
                if (b == null) {
                    b = qef.UNKNOWN_STATUS;
                }
                if (qefVar.equals(b)) {
                    qef qefVar2 = qef.OK;
                    qef b2 = qef.b(qegVar.c);
                    if (b2 == null) {
                        b2 = qef.UNKNOWN_STATUS;
                    }
                    if (qefVar2.equals(b2)) {
                        aozy createBuilder4 = qeg.a.createBuilder();
                        qef qefVar3 = qef.OK;
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        qeg qegVar3 = (qeg) createBuilder4.b;
                        qegVar3.c = qefVar3.f;
                        qegVar3.b |= 1;
                        return (qeg) createBuilder4.s();
                    }
                }
                alwl alwlVar = (alwl) ((alwl) xer.a.g()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGetGroupInfoWorkHandler$TachygramGetGroupInfoOperation", "mergeChatApiResults", 239, "TachygramGetGroupInfoWorkHandler.java");
                qef b3 = qef.b(qegVar2.c);
                if (b3 == null) {
                    b3 = qef.UNKNOWN_STATUS;
                }
                qef b4 = qef.b(qegVar.c);
                if (b4 == null) {
                    b4 = qef.UNKNOWN_STATUS;
                }
                alwlVar.u("IncomingChatApi did not succeed in processing a group trigger. \n onTriggerCompleteResult: %d, onGroupNotificationCompleteResult: %d", b3.f, b4.f);
                aozy createBuilder5 = qeg.a.createBuilder();
                qef qefVar4 = qef.FAILED_PERMANENTLY;
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                qeg qegVar4 = (qeg) createBuilder5.b;
                qegVar4.c = qefVar4.f;
                qegVar4.b |= 1;
                return (qeg) createBuilder5.s();
        }
    }
}
