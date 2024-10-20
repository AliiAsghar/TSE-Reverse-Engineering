package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyf implements gyb {
    public final gid a;
    public final gil b;
    public final gil c;
    private final ghp d;

    public gyf(gid gidVar) {
        this.a = gidVar;
        this.d = new gyc(gidVar);
        this.b = new gyd(gidVar);
        this.c = new gye(gidVar);
    }

    @Override // defpackage.gyb
    public final void a(gya gyaVar) {
        this.a.k();
        this.a.l();
        try {
            this.d.a(gyaVar);
            this.a.o();
        } finally {
            this.a.m();
        }
    }
}
