package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rzp extends RuntimeException {
    public final long a;
    public final long b;
    private final long c;

    public rzp(long j, long j2, long j3, String str, Throwable th) {
        super(str, th);
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "DatabaseUpgradeException from: " + this.a + " to " + this.b + "; was at: " + this.c + "; " + super.getMessage();
    }

    public rzp(String str, Throwable th) {
        this(-1L, -1L, -1L, str, th);
    }
}
