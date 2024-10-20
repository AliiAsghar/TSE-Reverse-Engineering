package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfh implements yfa {
    public final wfh a;
    private final armf b;
    private final arwe c;
    private final armf d;
    private final zas e;

    public yfh(zas zasVar, wfh wfhVar, armf armfVar, arwe arweVar, arpi arpiVar, armf armfVar2) {
        zasVar.getClass();
        wfhVar.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        this.e = zasVar;
        this.a = wfhVar;
        this.b = armfVar;
        this.c = arweVar;
        this.d = armfVar2;
    }

    @Override // defpackage.yfa
    public final double a() {
        Object e = yfe.w.e();
        e.getClass();
        return ((Number) e).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.yfa
    public final akul b() {
        akul c;
        if (!((ora) this.b.b()).a()) {
            akul ag = aktp.ag(false);
            ag.getClass();
            return ag;
        }
        byte[] bArr = null;
        if (((pod) this.d.b()).a()) {
            zas zasVar = this.e;
            akul M = this.a.M();
            Object e = yfe.x.e();
            e.getClass();
            return M.h(new xpm(zasVar, Duration.ofDays(((Number) e).longValue()), 10, bArr), zasVar.a);
        }
        zas zasVar2 = this.e;
        c = qjh.c(this.c, arpj.a, arwf.a, new xjs(this, (arpe) null, 11));
        return zasVar2.b(c);
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
