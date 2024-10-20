package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfj implements yfa {
    private final /* synthetic */ int a;
    private final zas b;
    private final wfh c;

    public yfj(zas zasVar, wfh wfhVar, int i) {
        this.a = i;
        this.b = zasVar;
        this.c = wfhVar;
    }

    @Override // defpackage.yfa
    public final double a() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return ((Double) yfe.j.e()).doubleValue();
                }
                return ((Double) yfe.u.e()).doubleValue();
            }
            return ((Double) yfe.h.e()).doubleValue();
        }
        return ((Double) yfe.l.e()).doubleValue();
    }

    @Override // defpackage.yfa
    public final akul b() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return this.b.b(this.c.Q(new yeb(8)));
                }
                return this.b.b(this.c.Q(new yeb(10)));
            }
            return this.b.b(this.c.Q(new yeb(6)));
        }
        return this.b.b(this.c.Q(new yeb(9)));
    }

    @Override // defpackage.yfa
    public final String c() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return (String) yfe.i.e();
                }
                return (String) yfe.t.e();
            }
            return (String) yfe.g.e();
        }
        return (String) yfe.k.e();
    }

    @Override // defpackage.yfb
    public final amip d() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return amip.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY;
                }
                return amip.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY;
            }
            return amip.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY;
        }
        return amip.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY;
    }
}
