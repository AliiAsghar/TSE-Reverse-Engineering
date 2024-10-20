package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgy implements afa {
    public final long a;
    private final boolean b;
    private final float c;
    private final ckx d = null;

    public bgy(boolean z, float f, long j) {
        this.b = z;
        this.c = f;
        this.a = j;
    }

    @Override // defpackage.afa
    public final cwo a(ajq ajqVar) {
        return new bgd(ajqVar, this.b, this.c, new ckx() { // from class: bgy.1
            @Override // defpackage.ckx
            public final long a() {
                return bgy.this.a;
            }
        });
    }

    @Override // defpackage.aev
    public final /* synthetic */ aew b(ajq ajqVar, bwj bwjVar) {
        return aeu.a(bwjVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgy)) {
            return false;
        }
        bgy bgyVar = (bgy) obj;
        if (this.b != bgyVar.b || !dqy.b(this.c, bgyVar.c)) {
            return false;
        }
        ckx ckxVar = bgyVar.d;
        if (!d.F(null, null)) {
            return false;
        }
        return a.bB(this.a, bgyVar.a);
    }

    @Override // defpackage.afa
    public final int hashCode() {
        return (((a.v(this.b) * 31) + Float.floatToIntBits(this.c)) * 961) + a.A(this.a);
    }
}
