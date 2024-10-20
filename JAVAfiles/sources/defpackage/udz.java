package defpackage;

import j$.util.Optional;
import java.util.function.Supplier;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class udz implements Supplier {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ udz(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [agmo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v98, types: [java.lang.Object, java.util.function.Supplier] */
    @Override // java.util.function.Supplier
    public final Object get() {
        akul c;
        Object obj;
        int i = 6;
        int i2 = 8;
        switch (this.c) {
            case 0:
                return ((ueb) this.a).q((String) this.b);
            case 1:
                return ((ueb) this.a).r((String) this.b);
            case 2:
                try {
                    return ((vsj) this.b).j.map(new viu(this.a, 17));
                } catch (psr e) {
                    ((alwl) ((alwl) ((alwl) vsg.a.i()).g(e)).h("com/google/android/apps/messaging/shared/rcs/conversation/RcsConversationAndThreadIdCreatorLegacy", "getSelfEndpoint", (char) 204, "RcsConversationAndThreadIdCreatorLegacy.java")).q("Invalid rcsGroupSelfMsisdn.");
                    return Optional.empty();
                }
            case 3:
                yyt yytVar = (yyt) ((vyu) this.a).j.b();
                Object obj2 = this.b;
                akrh e2 = aktp.e("SendSlmFileMethod#processNotificationRequest");
                try {
                    Object obj3 = yytVar.c;
                    wxm a = ((wao) yytVar.d).apply((wdl) obj2);
                    wdu wduVar = ((wdl) obj2).d;
                    if (wduVar == null) {
                        wduVar = wdu.a;
                    }
                    wdu wduVar2 = wduVar;
                    wda wdaVar = ((wdl) obj2).f;
                    if (wdaVar == null) {
                        wdaVar = wda.a;
                    }
                    wda wdaVar2 = wdaVar;
                    wxf wxfVar = ((wel) obj3).d;
                    a.getClass();
                    c = qjh.c(wxfVar.b, arpj.a, arwf.a, new whw(a, wxfVar, (arpe) null, 6));
                    akul h = c.h(new way(obj3, (Object) wduVar2, (Object) wdaVar2, 3, (byte[]) null), ((wel) obj3).b).h(new wax(9), andi.a);
                    e2.b(h);
                    e2.close();
                    return h;
                } catch (Throwable th) {
                    try {
                        e2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 4:
                wct wctVar = (wct) this.b;
                int i3 = wctVar.c;
                Object obj4 = this.a;
                if (i3 == 4) {
                    vyu vyuVar = (vyu) obj4;
                    akul e3 = ((qco) vyuVar.i.b()).e(((wal) vyuVar.l.b()).apply(wctVar));
                    ((vzo) vyuVar.n.b()).getClass();
                    return e3.h(new vsw(18), vyuVar.k);
                }
                if (i3 == 3) {
                    vyu vyuVar2 = (vyu) obj4;
                    akul d = ((qco) vyuVar2.i.b()).d(((wak) vyuVar2.m.b()).apply(wctVar));
                    ((vzo) vyuVar2.n.b()).getClass();
                    return d.h(new vsw(19), vyuVar2.k);
                }
                return aktp.ag(wcu.a);
            case 5:
                znj znjVar = (znj) ((vyu) this.a).c.b();
                return ((wej) znjVar.b).b(this.b).h(new wax(i2), znjVar.a);
            case 6:
                wpp wppVar = (wpp) ((vyu) this.a).b.b();
                Object obj5 = wppVar.b;
                Object obj6 = this.b;
                return ((wej) obj5).b(obj6).h(new vqv(wppVar, obj6, 12), wppVar.c);
            case 7:
                znj znjVar2 = (znj) ((vyu) this.a).e.b();
                return ((wej) znjVar2.a).b(this.b).h(new wax(5), znjVar2.b);
            case 8:
                znj znjVar3 = (znj) ((vyu) this.a).h.b();
                return ((wej) znjVar3.b).b(this.b).h(new wax(10), znjVar3.a);
            case 9:
                znj znjVar4 = (znj) ((vyu) this.a).d.b();
                return ((wej) znjVar4.a).b(this.b).h(new wax(i), znjVar4.b);
            case 10:
                znj znjVar5 = (znj) ((vyu) this.a).f.b();
                return ((wej) znjVar5.b).b(this.b).h(new wax(7), znjVar5.a);
            case 11:
                znj znjVar6 = (znj) ((vyu) this.a).g.b();
                return ((wej) znjVar6.b).b(this.b).h(new wax(11), znjVar6.a);
            case 12:
                vyu vyuVar3 = (vyu) this.a;
                return ((qco) vyuVar3.i.b()).f(vyuVar3.o.apply((wcv) this.b)).h(new vsw(20), vyuVar3.k);
            case 13:
                Integer num = (Integer) znj.q(((yhf) this.b).l, ((yhd) this.a).a, new yeb(13), 0);
                num.intValue();
                return num;
            case 14:
                amgl amglVar = (amgl) amgu.a.createBuilder();
                amglVar.getClass();
                akec.aR(((rvf) this.a).f(), amglVar);
                akec.aS(((yra) this.b).a.n(), amglVar);
                akec.aU(14, amglVar);
                akec.aT(8, amglVar);
                return akec.aN(amglVar);
            case 15:
                amgl amglVar2 = (amgl) amgu.a.createBuilder();
                amglVar2.getClass();
                akec.aR(((rvf) this.a).f(), amglVar2);
                akec.aS(((yra) this.b).a.n(), amglVar2);
                akec.aU(14, amglVar2);
                akec.aT(2, amglVar2);
                return akec.aN(amglVar2);
            case 16:
                obj = this.b.get();
                aglz aglzVar = (aglz) obj;
                Object obj7 = this.a;
                aglzVar.c((agmq) obj7);
                agmp agmpVar = (agmp) obj7;
                akkw akkwVar = agmpVar.i;
                aglzVar.cI = akkwVar.b;
                if (akkwVar != null) {
                    agmpVar.cZ(akkwVar.i(), aglzVar);
                }
                return aglzVar;
            case 17:
                Object obj8 = this.b;
                agmp agmpVar2 = (agmp) obj8;
                aglz b = agmpVar2.b();
                b.c((agmq) obj8);
                akkw akkwVar2 = agmpVar2.i;
                b.cI = akkwVar2.b;
                if (akkwVar2 != null) {
                    agmpVar2.cZ(akkwVar2.i(), b);
                }
                return this.a.a(b);
            case 18:
                alvg alvgVar = (alvg) agoz.c.a(agoz.d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "invokeInTransactionAndPostTransaction", 994, "QueryBase.java");
                Object obj9 = this.b;
                agpf agpfVar = ((agoz) obj9).e;
                Object obj10 = this.a;
                alvgVar.B("onChangeAfterTransactionWithObject: table: %s; cl: %s", agoz.R(agpfVar.a), ((agmc) obj10).d);
                try {
                    ((agmc) obj10).a((agoz) obj9);
                } catch (Throwable th3) {
                    ((alvg) ((alvg) agoz.c.a(Level.SEVERE).g(th3)).h("com/google/android/libraries/databaseannotations/support/QueryBase", "invokeInTransactionAndPostTransaction", 1001, "QueryBase.java")).t("got exception invoking onChangeAfterTransactionWithObject on %s", obj10);
                }
                return null;
            default:
                ailn ailnVar = (ailn) this.a;
                albo.U(ailnVar.c.d.f(), "failed to set log prefix for LegacyDiscoveryStrategy");
                advr.r((advp) ailnVar.c.d.b(), "Unable to find proxy for protocol %s. Returning first found proxy to attempt fallback.", ailnVar.b);
                return (ailp) this.b.get(0);
        }
    }

    public /* synthetic */ udz(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
