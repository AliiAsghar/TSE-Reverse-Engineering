package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qhr implements qhs {
    private final armf a;
    private final armf b;
    private final armf c;
    private final qhh d;
    private final psw e;

    public qhr(armf armfVar, armf armfVar2, armf armfVar3, qhh qhhVar, psw pswVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        pswVar.getClass();
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = qhhVar;
        this.e = pswVar;
    }

    @Override // defpackage.qhs
    public final qhj a(qfu qfuVar) {
        qfuVar.getClass();
        if (qfuVar == qfu.RECOVERY_STRATEGY_REFRESH_REGISTRATION) {
            Object b = this.a.b();
            b.getClass();
            return (qhj) b;
        }
        if (qfuVar == qfu.RECOVERY_STRATEGY_RECREATE_GROUP) {
            Object b2 = this.b.b();
            b2.getClass();
            return (qhj) b2;
        }
        if (this.e.a() && qfuVar == qfu.RECOVERY_STRATEGY_INVALIDATE_CAPABILITIES_CACHE) {
            Object b3 = this.c.b();
            b3.getClass();
            return (qhj) b3;
        }
        return this.d;
    }
}
