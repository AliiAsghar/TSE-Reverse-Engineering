package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mra implements nbr {
    public static final long a;
    public static final Duration b;
    public final armf c;
    private final arwe d;
    private final armf e;
    private final xny f;

    static {
        long j = arut.a;
        a = arsd.o(2, aruv.d);
        b = Duration.ofSeconds(8L);
    }

    public mra(arwe arweVar, armf armfVar, armf armfVar2) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.d = arweVar;
        this.e = armfVar;
        this.c = armfVar2;
        this.f = new xnx("SuggestionBugleSendMessageListener::onMessageSent");
    }

    @Override // defpackage.nbr
    public final akrh a() {
        return this.f.a();
    }

    @Override // defpackage.nbr
    public final akul b(mzc mzcVar) {
        mzcVar.getClass();
        if (((oix) this.e.b()).a() && mzcVar.f == null) {
            qjh.l(this.d, null, new mlg(this, mzcVar, (arpe) null, 4), 3);
            akul ag = aktp.ag(null);
            ag.getClass();
            return ag;
        }
        akul ag2 = aktp.ag(null);
        ag2.getClass();
        return ag2;
    }
}
