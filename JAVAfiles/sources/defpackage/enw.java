package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enw implements enz {
    final env a;
    public final enz b;
    int c = -1;

    public enw(env envVar, enz enzVar) {
        this.a = envVar;
        this.b = enzVar;
    }

    @Override // defpackage.enz
    public final void a(Object obj) {
        int i = this.c;
        int i2 = this.a.f;
        if (i != i2) {
            this.c = i2;
            this.b.a(obj);
        }
    }

    public final void b() {
        this.a.e(this);
    }
}
