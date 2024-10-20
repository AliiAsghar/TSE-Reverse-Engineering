package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uks implements ukn {
    private static final xze a = xze.g("BugleCms", "CmsBackupWorker");
    private final xnv b;
    private final armf c;

    public uks(xnv xnvVar, armf armfVar) {
        this.b = xnvVar;
        this.c = armfVar;
    }

    @Override // defpackage.ukn
    public final akul a(srd srdVar) {
        boolean z;
        d.s(b(srdVar));
        if (srdVar.p() == null) {
            xyo c = a.c();
            c.H("Null work item id");
            c.x("workType", srdVar.m());
            c.x("itemType", srdVar.k());
            c.x("flags", srdVar.h());
            c.q();
            return aktp.ag(true);
        }
        if (srdVar.m() == 64) {
            z = true;
        } else {
            z = false;
        }
        aozy createBuilder = ukr.a.createBuilder();
        srdVar.ao(4, "account_id");
        int i = srdVar.e;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ukr ukrVar = (ukr) createBuilder.b;
        ukrVar.b = 1 | ukrVar.b;
        ukrVar.c = i;
        int k = srdVar.k();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ukr ukrVar2 = (ukr) createBuilder.b;
        ukrVar2.b |= 2;
        ukrVar2.d = k;
        String p = srdVar.p();
        p.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ukr ukrVar3 = (ukr) createBuilder.b;
        ukrVar3.b = 4 | ukrVar3.b;
        ukrVar3.e = p;
        int h = srdVar.h();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ukr ukrVar4 = (ukr) apagVar;
        ukrVar4.b |= 8;
        ukrVar4.f = h;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ukr ukrVar5 = (ukr) createBuilder.b;
        ukrVar5.b |= 16;
        ukrVar5.g = z;
        long epochMilli = this.b.f().toEpochMilli();
        if (srdVar.n() > 0) {
            ((mbl) this.c.b()).g("Bugle.Cms.IncrementalBackup.SchedulingDelay", this.b.f().toEpochMilli() - srdVar.n());
        }
        apct b = apds.b(epochMilli);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ukr ukrVar6 = (ukr) createBuilder.b;
        b.getClass();
        ukrVar6.h = b;
        ukrVar6.b |= 64;
        if (!albo.ah(srdVar.q())) {
            String q = srdVar.q();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ukr ukrVar7 = (ukr) createBuilder.b;
            q.getClass();
            ukrVar7.b |= 128;
            ukrVar7.i = q;
        }
        return aktp.ag(true);
    }

    @Override // defpackage.ukn
    public final boolean b(srd srdVar) {
        if (srdVar.m() != 32 && srdVar.m() != 64) {
            return false;
        }
        return true;
    }
}
