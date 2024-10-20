package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xha extends unp {
    public static final alwo a = alwo.o("BugleTelephony");
    public final xgw b;
    public final armf c;
    private final xnv d;
    private final via e;
    private final aneo f;

    public xha(xnv xnvVar, xgw xgwVar, via viaVar, aneo aneoVar, armf armfVar) {
        this.d = xnvVar;
        this.b = xgwVar;
        this.e = viaVar;
        this.f = aneoVar;
        this.c = armfVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.d(Integer.MAX_VALUE);
        a2.c(unv.FOREGROUND_SERVICE);
        a2.b = this.e.a();
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("ReverseTelephonySyncWorkItemHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul ag;
        xhb xhbVar = (xhb) apbtVar;
        aozn aoznVar = xhbVar.d;
        if (aoznVar == null) {
            aoznVar = aozn.a;
        }
        long a2 = apdp.a(aoznVar);
        apct apctVar = xhbVar.c;
        if (apctVar == null) {
            apctVar = apct.a;
        }
        long a3 = apds.a(apctVar) + a2;
        long epochMilli = this.d.f().toEpochMilli();
        if (a3 > epochMilli) {
            ag = akul.g(this.f.schedule(akto.k(new vcr(14)), a3 - epochMilli, TimeUnit.MILLISECONDS));
        } else {
            ag = aktp.ag(null);
        }
        return ag.i(new xfn(this, 2), this.f).h(new xgu(3), andi.a).f(Throwable.class, new xfn(this, 3), andi.a);
    }

    @Override // defpackage.unx
    public final apca e() {
        return xhb.a.getParserForType();
    }
}
