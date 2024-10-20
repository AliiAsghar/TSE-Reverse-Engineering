package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahqq {
    public final ahmy b;
    public ahqp c;
    boolean d;
    private static final aegu e = new aegx();
    public static final ahqq a = new ahqq();

    public ahqq(ahmz ahmzVar) {
        this.c = ahqp.UNKNOWN;
        this.d = false;
        this.b = new ahmy(ahmzVar);
    }

    public static boolean e(ahqq ahqqVar) {
        if (ahqqVar != null && ahqqVar != a) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a() {
        ahmy ahmyVar = this.b;
        return ahmyVar.b.a - ahmyVar.a.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long b() {
        ahmy ahmyVar = this.b;
        return ahmyVar.b.b - ahmyVar.a.b;
    }

    public final void c() {
        this.b.b = ahmz.a(e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(ahqp ahqpVar) {
        if (ahqpVar == null) {
            ahqpVar = ahqp.UNKNOWN;
        }
        this.c = ahqpVar;
    }

    public ahqq() {
        this.c = ahqp.UNKNOWN;
        this.d = false;
        this.b = new ahmy(e);
    }

    public ahqq(long j, long j2, ahqp ahqpVar) {
        this.c = ahqp.UNKNOWN;
        this.d = false;
        if (j2 < j) {
            throw new IllegalArgumentException(albo.F("End time %s is before start time %s.", Long.valueOf(j2), Long.valueOf(j)));
        }
        this.b = new ahmy(new ahmz(j, j), new ahmz(j2, j2));
        this.c = ahqpVar;
    }
}
