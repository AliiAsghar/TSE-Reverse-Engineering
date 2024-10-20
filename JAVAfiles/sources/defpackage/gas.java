package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gas implements fzy, arrk {
    final /* synthetic */ gat a;
    private final /* synthetic */ int b;

    public gas(gat gatVar, int i) {
        this.b = i;
        this.a = gatVar;
    }

    @Override // defpackage.fzy
    public final void a() {
        if (this.b != 0) {
            this.a.e();
        } else {
            this.a.e();
        }
    }

    @Override // defpackage.arrk
    public final armh b() {
        if (this.b != 0) {
            return new arrm(0, this.a, gat.class, "invalidate", "invalidate()V", 0);
        }
        return new arrm(0, this.a, gat.class, "invalidate", "invalidate()V", 0);
    }

    public final boolean equals(Object obj) {
        if (this.b != 0) {
            if (!(obj instanceof fzy) || !(obj instanceof arrk)) {
                return false;
            }
            return d.F(b(), ((arrk) obj).b());
        }
        if (!(obj instanceof fzy) || !(obj instanceof arrk)) {
            return false;
        }
        return d.F(b(), ((arrk) obj).b());
    }

    public final int hashCode() {
        if (this.b != 0) {
            return b().hashCode();
        }
        return b().hashCode();
    }
}
