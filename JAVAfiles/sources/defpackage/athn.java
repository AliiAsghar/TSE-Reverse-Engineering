package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class athn extends athr {
    private static final long serialVersionUID = -485345310999208286L;
    final atgd a;
    final boolean b;
    final atgc c;

    public athn(atgd atgdVar, atgc atgcVar) {
        super(atgdVar.d());
        if (atgdVar.f()) {
            this.a = atgdVar;
            this.b = atho.O(atgdVar);
            this.c = atgcVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    private final int g(long j) {
        int b = this.c.b(j);
        long j2 = b;
        if (((j - j2) ^ j) < 0 && (j ^ j2) < 0) {
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }
        return b;
    }

    private final int h(long j) {
        int a = this.c.a(j);
        long j2 = a;
        if (((j + j2) ^ j) < 0 && (j ^ j2) >= 0) {
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }
        return a;
    }

    @Override // defpackage.atgd
    public final long a(long j, int i) {
        int h = h(j);
        boolean z = this.b;
        long a = this.a.a(j + h, i);
        if (!z) {
            h = g(a);
        }
        return a - h;
    }

    @Override // defpackage.atgd
    public final long b(long j, long j2) {
        int h = h(j);
        boolean z = this.b;
        long b = this.a.b(j + h, j2);
        if (!z) {
            h = g(b);
        }
        return b - h;
    }

    @Override // defpackage.atgd
    public final long c() {
        return this.a.c();
    }

    @Override // defpackage.atgd
    public final boolean e() {
        if (this.b) {
            return this.a.e();
        }
        if (!this.a.e() || !this.c.k()) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof athn) {
            athn athnVar = (athn) obj;
            if (this.a.equals(athnVar.a) && this.c.equals(athnVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        atgc atgcVar = this.c;
        return atgcVar.hashCode() ^ this.a.hashCode();
    }
}
