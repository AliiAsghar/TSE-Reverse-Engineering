package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xfq implements xfe {
    public final xgj a;
    public final anen b;
    public final armf c;
    private final armf d;
    private final armf e;

    public xfq(xgj xgjVar, armf armfVar, armf armfVar2, anen anenVar, armf armfVar3) {
        this.a = xgjVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.b = anenVar;
        this.c = armfVar3;
    }

    public static final qei c(qgw qgwVar) {
        boolean z;
        if ((qgwVar.b & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Self identity is missing in UpdateGroupChatRequest");
        qei qeiVar = qgwVar.f;
        if (qeiVar == null) {
            return qei.a;
        }
        return qeiVar;
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ qei a(Object obj) {
        qfb qfbVar = ((qgw) obj).c;
        if (qfbVar == null) {
            qfbVar = qfb.a;
        }
        qei qeiVar = qfbVar.d;
        if (qeiVar == null) {
            return qei.a;
        }
        return qeiVar;
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ qei b(Object obj) {
        return c((qgw) obj);
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ akul d(Object obj) {
        qgw qgwVar = (qgw) obj;
        if (((ppa) this.c.b()).a()) {
            int i = qgwVar.b;
            if ((i & 2) == 0 && (i & 32) == 0) {
                return aktp.ag(null);
            }
        }
        if ((qgwVar.b & 2) != 0) {
            znj znjVar = (znj) this.e.b();
            qfb qfbVar = qgwVar.c;
            if (qfbVar == null) {
                qfbVar = qfb.a;
            }
            return znjVar.V(qfbVar).i(new xfv(this, qgwVar, 1, null), this.b);
        }
        return aktp.ag(null);
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ akul e(Object obj, qeg qegVar) {
        qco qcoVar = (qco) this.d.b();
        aozb aozbVar = ((qgw) obj).e;
        aozy createBuilder = qgx.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qgx qgxVar = (qgx) apagVar;
        aozbVar.getClass();
        qgxVar.b |= 2;
        qgxVar.d = aozbVar;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qgx qgxVar2 = (qgx) createBuilder.b;
        qegVar.getClass();
        qgxVar2.c = qegVar;
        qgxVar2.b |= 1;
        return qcoVar.k((qgx) createBuilder.s());
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ akul f(Object obj, Object obj2) {
        qco qcoVar = (qco) this.d.b();
        aozb aozbVar = ((qgw) obj).e;
        qef qefVar = qef.OK;
        aozy createBuilder = qgx.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgx qgxVar = (qgx) createBuilder.b;
        aozbVar.getClass();
        qgxVar.b |= 2;
        qgxVar.d = aozbVar;
        aozy createBuilder2 = qeg.a.createBuilder();
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
        qgx qgxVar2 = (qgx) createBuilder.b;
        qegVar2.getClass();
        qgxVar2.c = qegVar2;
        qgxVar2.b |= 1;
        return qcoVar.k((qgx) createBuilder.s());
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ String g(Object obj) {
        qfb qfbVar = ((qgw) obj).c;
        if (qfbVar == null) {
            qfbVar = qfb.a;
        }
        return qfbVar.c;
    }

    @Override // defpackage.xfe
    public final String h() {
        return "TachygramUpdateGroupOperation";
    }

    @Override // defpackage.xfe
    public final boolean i() {
        return false;
    }
}
