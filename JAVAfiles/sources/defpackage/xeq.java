package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xeq implements xfe {
    public final armf a;
    public final anen b;
    public final armf c;
    public final yyt d;
    private final armf e;
    private final xej f;

    public xeq(armf armfVar, armf armfVar2, anen anenVar, xej xejVar, yyt yytVar, armf armfVar3) {
        this.a = armfVar;
        this.e = armfVar2;
        this.b = anenVar;
        this.f = xejVar;
        this.d = yytVar;
        this.c = armfVar3;
    }

    public static qgu c(aozb aozbVar, qef qefVar) {
        aozy createBuilder = qgu.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgu qguVar = (qgu) createBuilder.b;
        aozbVar.getClass();
        qguVar.b |= 2;
        qguVar.d = aozbVar;
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
        qgu qguVar2 = (qgu) createBuilder.b;
        qegVar2.getClass();
        qguVar2.c = qegVar2;
        qguVar2.b |= 1;
        return (qgu) createBuilder.s();
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ qei a(Object obj) {
        qfb qfbVar = ((qgt) obj).c;
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
        boolean z;
        qgt qgtVar = (qgt) obj;
        if ((qgtVar.b & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Self identity is missing in TriggerChatGroupFullStateUpdateRequest");
        qei qeiVar = qgtVar.e;
        if (qeiVar == null) {
            return qei.a;
        }
        return qeiVar;
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ akul d(Object obj) {
        boolean z;
        qgt qgtVar = (qgt) obj;
        if ((qgtVar.b & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        znj znjVar = (znj) this.e.b();
        qfb qfbVar = qgtVar.c;
        if (qfbVar == null) {
            qfbVar = qfb.a;
        }
        return znjVar.V(qfbVar).i(new wkh(this, qgtVar, 12, null), this.b);
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ akul e(Object obj, qeg qegVar) {
        qco qcoVar = (qco) this.a.b();
        aozb aozbVar = ((qgt) obj).d;
        aozy createBuilder = qgu.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qgu qguVar = (qgu) apagVar;
        aozbVar.getClass();
        qguVar.b |= 2;
        qguVar.d = aozbVar;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qgu qguVar2 = (qgu) createBuilder.b;
        qegVar.getClass();
        qguVar2.c = qegVar;
        qguVar2.b |= 1;
        return qcoVar.j((qgu) createBuilder.s());
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ akul f(Object obj, Object obj2) {
        qgt qgtVar = (qgt) obj;
        anjj anjjVar = (anjj) obj2;
        if (anjjVar.a.b.isEmpty()) {
            ((alwl) ((alwl) xer.a.g()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGetGroupInfoWorkHandler$TachygramGetGroupInfoOperation", "onSuccess", 158, "TachygramGetGroupInfoWorkHandler.java")).q("Tachygram fetched group information missing the conference URI.");
            return ((qco) this.a.b()).j(c(qgtVar.d, qef.FAILED_PERMANENTLY));
        }
        return this.f.a(anjjVar).i(new vwx(this, qgtVar, anjjVar, 10), this.b);
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ String g(Object obj) {
        qfb qfbVar = ((qgt) obj).c;
        if (qfbVar == null) {
            qfbVar = qfb.a;
        }
        return qfbVar.c;
    }

    @Override // defpackage.xfe
    public final String h() {
        return "TachygramGetGroupInfoOperation";
    }

    @Override // defpackage.xfe
    public final boolean i() {
        return false;
    }
}
