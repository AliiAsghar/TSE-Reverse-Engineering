package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.rbk;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qap implements qaq {
    public final armf a;
    public final Optional b;
    public final Object c;
    public final Object d;
    private final anen e;
    private final armf f;
    private final /* synthetic */ int g;
    private final Object h;

    public qap(anen anenVar, anen anenVar2, armf armfVar, Optional optional, Optional optional2, xnv xnvVar, armf armfVar2, int i) {
        this.g = i;
        this.e = anenVar;
        this.h = anenVar2;
        this.a = armfVar;
        this.c = optional;
        this.b = optional2;
        this.d = xnvVar;
        this.f = armfVar2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.qaq
    public final akul a(final MessageCoreData messageCoreData) {
        long epochMilli;
        long epochMilli2;
        if (this.g != 0) {
            if (messageCoreData.cw()) {
                epochMilli2 = messageCoreData.n();
            } else {
                epochMilli2 = ((xnv) this.h).f().toEpochMilli();
            }
            messageCoreData.aO(Instant.ofEpochMilli(epochMilli2), ((piy) this.f.b()).a());
            this.b.ifPresent(new ptf(messageCoreData, 8));
            return aktp.ai(new mzn(this, messageCoreData, 17, null), this.e).h(new algk() { // from class: qao
                /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, unx] */
                @Override // defpackage.algk
                public final Object apply(Object obj) {
                    int u = uvl.u(messageCoreData);
                    d.t(true, "ProcessPendingMessagesAction: empty processing work item handler");
                    rbk.a aVar = (rbk.a) yyb.aL(rbk.a.class);
                    if (!aVar.gk().y()) {
                        alvw i = rbk.a.i();
                        i.X(alwp.a, "BugleDataModel");
                        ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "processPendingMessagesFromWorkItemHandler", 291, "PendingMessagesProcessor.java")).q("PendingMessagesProcessor: skipped - not default SMS app");
                        return null;
                    }
                    long epochMilli3 = aVar.fN().f().toEpochMilli();
                    if (aVar.cB().d(u, epochMilli3)) {
                        alvw g = rbk.a.g();
                        g.X(alwp.a, "BugleDataModel");
                        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "processPendingMessagesFromWorkItemHandler", 296, "PendingMessagesProcessor.java")).q("PendingMessagesProcessor: skipped - too frequent");
                        return null;
                    }
                    rbm cy = aVar.cy();
                    rjk rjkVar = (rjk) cy.a.b();
                    rjkVar.getClass();
                    xnv xnvVar = (xnv) cy.b.b();
                    xnvVar.getClass();
                    armf armfVar = cy.c;
                    xyt xytVar = (xyt) cy.d.b();
                    xytVar.getClass();
                    armf armfVar2 = cy.e;
                    vqu vquVar = (vqu) cy.f.b();
                    vquVar.getClass();
                    mho mhoVar = (mho) cy.g.b();
                    mhoVar.getClass();
                    rcz rczVar = (rcz) cy.h.b();
                    rczVar.getClass();
                    rji rjiVar = (rji) cy.i.b();
                    rjiVar.getClass();
                    rjp rjpVar = (rjp) cy.j.b();
                    rjpVar.getClass();
                    rbd rbdVar = (rbd) cy.k.b();
                    rbdVar.getClass();
                    tqx tqxVar = (tqx) cy.l.b();
                    tqxVar.getClass();
                    ((rje) cy.m.b()).getClass();
                    rjq rjqVar = (rjq) cy.n.b();
                    rjqVar.getClass();
                    Optional optional = (Optional) cy.o.b();
                    optional.getClass();
                    wfe wfeVar = (wfe) cy.p.b();
                    wfeVar.getClass();
                    tzn tznVar = (tzn) cy.q.b();
                    tznVar.getClass();
                    ((xot) cy.r.b()).getClass();
                    armf armfVar3 = cy.s;
                    armf armfVar4 = cy.t;
                    rdc rdcVar = (rdc) cy.u.b();
                    rdcVar.getClass();
                    armf armfVar5 = cy.v;
                    xcu xcuVar = (xcu) cy.w.b();
                    xcuVar.getClass();
                    anen anenVar = (anen) cy.x.b();
                    anenVar.getClass();
                    armf armfVar6 = cy.y;
                    qap qapVar = qap.this;
                    armf armfVar7 = cy.z;
                    wjk wjkVar = (wjk) cy.A.b();
                    wjkVar.getClass();
                    Map map = (Map) cy.B.b();
                    map.getClass();
                    qhv qhvVar = (qhv) cy.C.b();
                    qhvVar.getClass();
                    rdc rdcVar2 = (rdc) cy.D.b();
                    rdcVar2.getClass();
                    armf armfVar8 = cy.E;
                    armf armfVar9 = cy.F;
                    armf armfVar10 = cy.G;
                    armf armfVar11 = cy.H;
                    ?? r0 = qapVar.d;
                    new rbk(rjkVar, xnvVar, armfVar, xytVar, armfVar2, vquVar, mhoVar, rczVar, rjiVar, rjpVar, rbdVar, tqxVar, rjqVar, optional, wfeVar, tznVar, armfVar3, armfVar4, rdcVar, armfVar5, xcuVar, anenVar, u, (Duration) qapVar.c, null, null, r0, r0.getClass().getSimpleName(), armfVar6, armfVar7, wjkVar, map, qhvVar, rdcVar2, armfVar8, armfVar9, armfVar10, armfVar11).c();
                    rcz.d = epochMilli3;
                    return null;
                }
            }, this.e);
        }
        if (messageCoreData.cw()) {
            epochMilli = messageCoreData.n();
        } else {
            epochMilli = ((xnv) this.d).f().toEpochMilli();
        }
        messageCoreData.aO(Instant.ofEpochMilli(epochMilli), ((piy) this.f.b()).a());
        return aktp.ah(new nan(this, messageCoreData, 7), this.h).h(new puy(this, 4), this.e);
    }

    public qap(anen anenVar, armf armfVar, Optional optional, xnv xnvVar, armf armfVar2, Duration duration, unx unxVar, int i) {
        this.g = i;
        this.e = anenVar;
        this.a = armfVar;
        this.b = optional;
        this.f = armfVar2;
        this.h = xnvVar;
        this.c = duration;
        this.d = unxVar;
    }
}
