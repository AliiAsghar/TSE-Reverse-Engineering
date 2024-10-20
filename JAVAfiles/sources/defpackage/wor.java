package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wor {
    public static final utz a = uuh.f(uuh.b, "report_issue_global_backoff_time_ms", 604800000);
    public final xnv b;
    public final anen c;
    public final wfh d;

    public wor(xnv xnvVar, wfh wfhVar, anen anenVar) {
        this.b = xnvVar;
        this.d = wfhVar;
        this.c = anenVar;
    }

    public final boolean a(Long l, long j) {
        long j2;
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        if (j + j2 <= this.b.f().toEpochMilli()) {
            return true;
        }
        return false;
    }
}
