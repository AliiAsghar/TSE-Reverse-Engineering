package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atjh {
    public final long a;
    public final atgc b;
    atjh c;
    private String d;
    private int e = Integer.MIN_VALUE;
    private int f = Integer.MIN_VALUE;

    public atjh(atgc atgcVar, long j) {
        this.a = j;
        this.b = atgcVar;
    }

    public final int a(long j) {
        atjh atjhVar = this.c;
        if (atjhVar != null && j >= atjhVar.a) {
            return atjhVar.a(j);
        }
        int i = this.e;
        if (i == Integer.MIN_VALUE) {
            int a = this.b.a(this.a);
            this.e = a;
            return a;
        }
        return i;
    }

    public final int b(long j) {
        atjh atjhVar = this.c;
        if (atjhVar != null && j >= atjhVar.a) {
            return atjhVar.b(j);
        }
        int i = this.f;
        if (i == Integer.MIN_VALUE) {
            int c = this.b.c(this.a);
            this.f = c;
            return c;
        }
        return i;
    }

    public final String c(long j) {
        atjh atjhVar = this.c;
        if (atjhVar != null && j >= atjhVar.a) {
            return atjhVar.c(j);
        }
        if (this.d == null) {
            this.d = this.b.g(this.a);
        }
        return this.d;
    }
}
