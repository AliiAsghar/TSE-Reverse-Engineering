package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atjo extends atgc {
    private static final long serialVersionUID = -3513011772763289092L;
    private final String e;
    private final int f;
    private final int g;

    public atjo(String str, String str2, int i, int i2) {
        super(str);
        this.e = str2;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.atgc
    public final int a(long j) {
        return this.f;
    }

    @Override // defpackage.atgc
    public final int b(long j) {
        return this.f;
    }

    @Override // defpackage.atgc
    public final int c(long j) {
        return this.g;
    }

    @Override // defpackage.atgc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof atjo) {
            atjo atjoVar = (atjo) obj;
            if (this.c.equals(atjoVar.c) && this.g == atjoVar.g && this.f == atjoVar.f) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.atgc
    public final String g(long j) {
        return this.e;
    }

    @Override // defpackage.atgc
    public final int hashCode() {
        return this.c.hashCode() + (this.g * 37) + (this.f * 31);
    }

    @Override // defpackage.atgc
    public final boolean k() {
        return true;
    }

    @Override // defpackage.atgc
    public final long e(long j) {
        return j;
    }

    @Override // defpackage.atgc
    public final long f(long j) {
        return j;
    }
}
