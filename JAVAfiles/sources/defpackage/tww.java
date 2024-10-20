package defpackage;

import com.google.communication.synapse.security.scytale.Scope;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tww extends unp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;

    public tww(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.e = armfVar5;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("FtdCleanUpWorkHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        Instant minus = ((xnv) this.d.b()).f().minus(Duration.ofDays(((Integer) tte.l.e()).intValue()));
        minus.getClass();
        xyo a = txn.a.a();
        a.H("delete");
        a.z("cutoff", minus);
        a.q();
        tcb tcbVar = new tcb();
        tcbVar.f("deleteSavedDecryptResultOlderThan");
        tcbVar.b(new ttr(minus, 17));
        int d = tcbVar.d();
        if (d > 0) {
            xyo c = D.c();
            c.H("Deleted pending decrypted message.");
            c.x("count", d);
            c.q();
        }
        if (!tte.f() && !tte.g()) {
            return aktp.ag(upm.b());
        }
        Optional e = ((vbu) this.a.b()).e();
        if (e.isEmpty()) {
            D.q("Failed to get local MSISDN.");
            return aktp.ag(upm.e());
        }
        Instant f = ((xnv) this.d.b()).f();
        long epochMilli = f.minus(Duration.ofDays(((Integer) tte.j.e()).intValue())).toEpochMilli();
        ttj ttjVar = (ttj) this.b.b();
        String str = ((qei) e.get()).d;
        ttj.a.o("Deleting old data if any.");
        ttjVar.n.b();
        akul e2 = ((ttb) ttjVar.d.b()).a(str).h(new tti(Scope.create(((uac) ttjVar.h.b()).b()), epochMilli, 0), ttjVar.m).h(new ttg(ttjVar, 3), andi.a).h(new tvd(15), andi.a).e(aqwb.class, new tvd(16), andi.a);
        long epochMilli2 = f.minus(Duration.ofDays(((Integer) tte.k.e()).intValue())).toEpochMilli();
        tcb tcbVar2 = new tcb();
        tcbVar2.f("removeOldPendingFtdMessages");
        tcbVar2.b(new rum(epochMilli2, 4));
        int d2 = tcbVar2.d();
        xyo c2 = twy.a.c();
        c2.H("Removed old pending messages.");
        c2.x("count", d2);
        c2.q();
        if (d2 <= 0) {
            return e2;
        }
        ((mbl) this.e.b()).e("Bugle.Etouffee.OutdatedPendingMessages.Removed.Count", d2);
        return e2;
    }

    @Override // defpackage.unx
    public final apca e() {
        return und.a.getParserForType();
    }
}
