package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xem implements xfe {
    public final ojs a;
    public final poy b;
    private final xgj c;
    private final armf d;
    private final armf e;
    private final xep f;
    private final anen g;

    public xem(xgj xgjVar, armf armfVar, armf armfVar2, xep xepVar, anen anenVar, ojs ojsVar, poy poyVar) {
        this.c = xgjVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = xepVar;
        this.g = anenVar;
        this.a = ojsVar;
        this.b = poyVar;
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ qei a(Object obj) {
        throw new IllegalStateException("Cannot get remote user for create group request");
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ qei b(Object obj) {
        boolean z;
        qen qenVar = (qen) obj;
        if ((qenVar.b & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Self identity is missing in CreateGroupChatRequest");
        qei qeiVar = qenVar.f;
        if (qeiVar == null) {
            return qei.a;
        }
        return qeiVar;
    }

    public final akul c(qen qenVar, anjj anjjVar) {
        qco qcoVar = (qco) this.d.b();
        aozy createBuilder = qeo.a.createBuilder();
        aozb aozbVar = qenVar.h;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qeo qeoVar = (qeo) createBuilder.b;
        aozbVar.getClass();
        qeoVar.b |= 4;
        qeoVar.e = aozbVar;
        qei d = ((psq) this.e.b()).d(((URI) anjjVar.a.b.get()).toString());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qeo qeoVar2 = (qeo) createBuilder.b;
        d.getClass();
        qeoVar2.d = d;
        qeoVar2.b |= 2;
        aozy createBuilder2 = qeg.a.createBuilder();
        qef qefVar = qef.OK;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        qeg qegVar = (qeg) createBuilder2.b;
        qegVar.c = qefVar.f;
        qegVar.b |= 1;
        qeg qegVar2 = (qeg) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qeo qeoVar3 = (qeo) apagVar;
        qegVar2.getClass();
        qeoVar3.c = qegVar2;
        qeoVar3.b |= 1;
        amxo amxoVar = amxo.RCS_TACHYGRAM;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qeo qeoVar4 = (qeo) createBuilder.b;
        qeoVar4.f = amxoVar.h;
        qeoVar4.b |= 8;
        return qcoVar.c((qeo) createBuilder.s());
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ akul d(Object obj) {
        qen qenVar = (qen) obj;
        qei qeiVar = qenVar.f;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        return this.c.a(qeiVar).i(new wkh(this, qenVar, 11, null), this.g);
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ akul e(Object obj, qeg qegVar) {
        qco qcoVar = (qco) this.d.b();
        aozy createBuilder = qeo.a.createBuilder();
        aozb aozbVar = ((qen) obj).h;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qeo qeoVar = (qeo) apagVar;
        aozbVar.getClass();
        qeoVar.b |= 4;
        qeoVar.e = aozbVar;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qeo qeoVar2 = (qeo) createBuilder.b;
        qegVar.getClass();
        qeoVar2.c = qegVar;
        qeoVar2.b |= 1;
        return qcoVar.c((qeo) createBuilder.s());
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ akul f(Object obj, Object obj2) {
        qen qenVar = (qen) obj;
        anjj anjjVar = (anjj) obj2;
        albo.U(anjjVar.a.b.isPresent(), "Expect conference URI in create group response.");
        aozb aozbVar = anjjVar.a.a.e;
        if (aozb.b.equals(aozbVar)) {
            alwl alwlVar = (alwl) xen.a.g();
            alwlVar.X(ydl.I, anjjVar.a.a.c);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramCreateGroupWorkHandler$TachygramCreateGroupOperation", "onSuccess", 161, "TachygramCreateGroupWorkHandler.java")).q("Created a tachygram group with a missing routing info token.");
            return c(qenVar, anjjVar);
        }
        return this.f.c(anjjVar.a.a.c, aozbVar).i(new vwx(this, qenVar, anjjVar, 9), this.g);
    }

    @Override // defpackage.xfe
    public final /* synthetic */ String g(Object obj) {
        return ((qen) obj).c;
    }

    @Override // defpackage.xfe
    public final String h() {
        return "TachygramCreateGroupOperation";
    }

    @Override // defpackage.xfe
    public final boolean i() {
        return false;
    }
}
