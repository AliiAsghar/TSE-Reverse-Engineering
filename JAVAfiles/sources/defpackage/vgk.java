package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vgk {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl");
    public final Object b = new Object();
    public final anen c;
    public final armf d;
    public final vba e;
    public final String f;
    public akul g;
    public boolean h;
    public final vgt i;
    private final vcy j;
    private final boolean k;
    private final wpp l;

    public vgk(wpp wppVar, anen anenVar, armf armfVar, vgt vgtVar, vcy vcyVar, vba vbaVar, boolean z, String str) {
        this.j = vcyVar;
        this.l = wppVar;
        this.d = armfVar;
        this.c = anenVar;
        this.i = vgtVar;
        this.e = vbaVar;
        this.k = z;
        this.f = str;
    }

    public final akul a() {
        akrh e = aktp.e("PullHandlerImpl::pullMessages");
        try {
            akul i = this.e.k().i(new vek(this, 6), this.c);
            e.b(i);
            e.close();
            return i;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final akul b(aqfg aqfgVar) {
        aozy S;
        synchronized (this.b) {
            if (this.g != null) {
                alvw g = a.g();
                g.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl", "pullMessagesInternal", 111, "PullHandlerImpl.java")).q("Pull in progress. Will issue another PullMessages when the current one completes");
                this.h = true;
                return aktp.ag(null);
            }
            alvw g2 = a.g();
            g2.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl", "pullMessagesInternal", 116, "PullHandlerImpl.java")).q("Issuing a new PullMessages RPC");
            this.h = false;
            String j = this.e.j();
            if (this.k) {
                S = this.l.T(j);
            } else {
                S = this.l.S(j);
            }
            aozb aozbVar = aqfgVar.b;
            if (!S.b.isMutable()) {
                S.u();
            }
            aqgb aqgbVar = (aqgb) S.b;
            aqgb aqgbVar2 = aqgb.a;
            aozbVar.getClass();
            aqgbVar.e = aozbVar;
            aozy createBuilder = aqea.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aqea aqeaVar = (aqea) createBuilder.b;
            aqgb aqgbVar3 = (aqgb) S.s();
            aqgbVar3.getClass();
            aqeaVar.c = aqgbVar3;
            aqeaVar.b |= 1;
            return akuk.c(new izd(this, this.j.c((aqea) createBuilder.s()).i(new vek(this, 3), this.c).f(Throwable.class, new uva(13), this.c), 8), andi.a).f().i(new vek(this, 4), this.c);
        }
    }
}
