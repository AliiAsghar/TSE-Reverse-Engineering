package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyo implements gyk {
    public final gid a;
    public final gil b;
    private final gil c;

    public gyo(gid gidVar) {
        this.a = gidVar;
        new gyl(gidVar);
        this.c = new gym(gidVar);
        this.b = new gyn(gidVar);
    }

    @Override // defpackage.gyk
    public final void a(String str) {
        this.a.k();
        gkp d = this.c.d();
        d.g(1, str);
        try {
            this.a.l();
            try {
                d.a();
                this.a.o();
            } finally {
                this.a.m();
            }
        } finally {
            this.c.f(d);
        }
    }
}
