package defpackage;

import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xdq {
    public final ConcurrentHashMap e;
    public final aneo f;
    public final xnv g;
    public final vcy h;
    public final armf i;
    public final armf j;
    public final xdt k;
    public final znj l;
    public static final alwo a = alwo.o("BugleTachygram");
    static final utz b = uuh.f(uuh.b, "capabilities_retry_delay_millis", 10000);
    private static final utz m = uuh.c(uuh.b, "capabilities_retry_multiplier", 2.0d);
    static final utz c = uuh.e(uuh.b, "capabilities_retry_attempts_num", 4);
    public static final utz d = uuh.i(uuh.b, "enable_bugle_internet_connectivity_check_for_caps", false);

    public xdq(znj znjVar, ConcurrentHashMap concurrentHashMap, aneo aneoVar, xnv xnvVar, vcy vcyVar, armf armfVar, armf armfVar2, xdt xdtVar) {
        this.l = znjVar;
        this.e = concurrentHashMap;
        this.f = aneoVar;
        this.g = xnvVar;
        this.i = armfVar;
        this.h = vcyVar;
        this.j = armfVar2;
        this.k = xdtVar;
    }

    public static aqfn a(msh mshVar) {
        if (((Boolean) new mst(20).get()).booleanValue()) {
            albo.U(mshVar.e().isPresent(), "Rcs identifier doesn't exist.");
            return (aqfn) new xei().fu((qei) mshVar.e().get());
        }
        String g = mshVar.g();
        g.getClass();
        aozy cJ = yyb.cJ();
        if (!cJ.b.isMutable()) {
            cJ.u();
        }
        aqfn aqfnVar = (aqfn) cJ.b;
        aqfn aqfnVar2 = aqfn.a;
        aqfnVar.c = g;
        asku askuVar = asku.PHONE_NUMBER;
        if (!cJ.b.isMutable()) {
            cJ.u();
        }
        ((aqfn) cJ.b).b = askuVar.a();
        return (aqfn) cJ.s();
    }

    public final akul b(ancr ancrVar, String str, int i, msh mshVar) {
        xdp xdpVar = new xdp(0);
        ubu ubuVar = new ubu(this, akto.c(ancrVar), 17);
        amdr d2 = amdr.d(Duration.ofMillis(((Long) b.e()).longValue()), ((Double) m.e()).doubleValue(), ((Integer) c.e()).intValue());
        evp evpVar = new evp(5);
        amdt amdtVar = new amdt();
        amdtVar.b(this.f);
        amdtVar.a = xdpVar;
        return akul.g(amdtVar.a(ubuVar, d2, evpVar)).f(amdk.class, new tuy(this, i, mshVar, str, 3), this.f);
    }
}
