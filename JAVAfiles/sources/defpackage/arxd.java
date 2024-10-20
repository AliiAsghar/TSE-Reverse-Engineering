package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arxd {
    public static final asfn a = new asfn("REMOVED_TASK");
    public static final asfn b = new asfn("CLOSED_EMPTY");

    public static final long a(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }
}
