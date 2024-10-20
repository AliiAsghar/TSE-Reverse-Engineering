package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class atht extends athr {
    private static final long serialVersionUID = 8019982251647420015L;
    public final atgd a;

    public atht(atgd atgdVar, atgf atgfVar) {
        super(atgfVar);
        if (atgdVar.f()) {
            this.a = atgdVar;
            return;
        }
        throw new IllegalArgumentException("The field must be supported");
    }

    @Override // defpackage.atgd
    public long a(long j, int i) {
        return this.a.a(j, i);
    }

    @Override // defpackage.atgd
    public long b(long j, long j2) {
        return this.a.b(j, j2);
    }

    @Override // defpackage.atgd
    public long c() {
        return this.a.c();
    }

    @Override // defpackage.atgd
    public final boolean e() {
        return this.a.e();
    }
}
