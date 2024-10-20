package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfi implements yfa {
    public final armf a;
    private final armf b;
    private final arwe c;

    public yfi(armf armfVar, arwe arweVar, armf armfVar2) {
        arweVar.getClass();
        armfVar2.getClass();
        this.b = armfVar;
        this.c = arweVar;
        this.a = armfVar2;
    }

    @Override // defpackage.yfa
    public final double a() {
        Object e = yfe.y.e();
        e.getClass();
        return ((Number) e).doubleValue();
    }

    @Override // defpackage.yfa
    public final akul b() {
        akul c;
        if (((poc) this.b.b()).a()) {
            c = qjh.c(this.c, arpj.a, arwf.a, new xjs(this, (arpe) null, 12));
            return c;
        }
        akul ag = aktp.ag(false);
        ag.getClass();
        return ag;
    }

    @Override // defpackage.yfa
    public final String c() {
        Object e = yfe.v.e();
        e.getClass();
        return (String) e;
    }

    @Override // defpackage.yfb
    public final amip d() {
        return amip.HAPPINESS_TRACKING_MODE_SURVEY;
    }
}
