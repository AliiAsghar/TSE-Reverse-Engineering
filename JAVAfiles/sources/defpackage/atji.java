package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atji extends atgc {
    private static final int e;
    private static final long serialVersionUID = 5472298452022250685L;
    private final atgc f;
    private final transient atjh[] g;

    static {
        Integer num;
        int i;
        try {
            num = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            num = null;
        }
        if (num == null) {
            i = 512;
        } else {
            int intValue = num.intValue() - 1;
            int i2 = 0;
            while (intValue > 0) {
                intValue >>= 1;
                i2++;
            }
            i = 1 << i2;
        }
        e = i - 1;
    }

    public atji(atgc atgcVar) {
        super(atgcVar.c);
        this.g = new atjh[e + 1];
        this.f = atgcVar;
    }

    private final atjh n(long j) {
        int i = (int) (j >> 32);
        int i2 = e & i;
        atjh[] atjhVarArr = this.g;
        atjh atjhVar = atjhVarArr[i2];
        if (atjhVar != null && ((int) (atjhVar.a >> 32)) == i) {
            return atjhVar;
        }
        long j2 = j & (-4294967296L);
        atjh atjhVar2 = new atjh(this.f, j2);
        long j3 = j2;
        atjh atjhVar3 = atjhVar2;
        while (true) {
            long e2 = this.f.e(j3);
            if (e2 == j3 || e2 > (4294967295L | j2)) {
                break;
            }
            atjh atjhVar4 = new atjh(this.f, e2);
            atjhVar3.c = atjhVar4;
            atjhVar3 = atjhVar4;
            j3 = e2;
        }
        atjhVarArr[i2] = atjhVar2;
        return atjhVar2;
    }

    @Override // defpackage.atgc
    public final int a(long j) {
        return n(j).a(j);
    }

    @Override // defpackage.atgc
    public final int c(long j) {
        return n(j).b(j);
    }

    @Override // defpackage.atgc
    public final long e(long j) {
        return this.f.e(j);
    }

    @Override // defpackage.atgc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof atji) {
            return this.f.equals(((atji) obj).f);
        }
        return false;
    }

    @Override // defpackage.atgc
    public final long f(long j) {
        return this.f.f(j);
    }

    @Override // defpackage.atgc
    public final String g(long j) {
        return n(j).c(j);
    }

    @Override // defpackage.atgc
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.atgc
    public final boolean k() {
        return false;
    }
}
