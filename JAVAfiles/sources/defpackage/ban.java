package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ban implements dob {
    private final dob b;
    private final int c;
    private final int d;

    public ban(dob dobVar, int i, int i2) {
        this.b = dobVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.dob
    public final int a(int i) {
        int a = this.b.a(i);
        if (i >= 0 && i <= this.c) {
            bao.b(a, this.d, i);
        }
        return a;
    }

    @Override // defpackage.dob
    public final int b(int i) {
        int b = this.b.b(i);
        if (i >= 0 && i <= this.d) {
            bao.c(b, this.c, i);
        }
        return b;
    }
}
