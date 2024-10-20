package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arzh {
    public static final arzo a = new arzo(-1, null, null, 0);
    public static final int b = arro.y("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
    public static final int c = arro.y("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
    public static final asfn d = new asfn("BUFFERED");
    public static final asfn e = new asfn("SHOULD_BUFFER");
    public static final asfn f = new asfn("S_RESUMING_BY_RCV");
    public static final asfn g = new asfn("RESUMING_BY_EB");
    public static final asfn h = new asfn("POISONED");
    public static final asfn i = new asfn("DONE_RCV");
    public static final asfn j = new asfn("INTERRUPTED_SEND");
    public static final asfn k = new asfn("INTERRUPTED_RCV");
    public static final asfn l = new asfn("CHANNEL_CLOSED");
    public static final asfn m = new asfn("SUSPEND");
    public static final asfn n = new asfn("SUSPEND_NO_WAITER");
    public static final asfn o = new asfn("FAILED");
    public static final asfn p = new asfn("NO_RECEIVE_RESULT");
    public static final asfn q = new asfn("CLOSE_HANDLER_CLOSED");
    public static final asfn r = new asfn("CLOSE_HANDLER_INVOKED");
    public static final asfn s = new asfn("NO_CLOSE_CAUSE");

    public static final long a(long j2, boolean z) {
        long j3;
        if (true != z) {
            j3 = 0;
        } else {
            j3 = 4611686018427387904L;
        }
        return j3 + j2;
    }

    public static final long b(long j2, int i2) {
        return (i2 << 60) + j2;
    }

    public static final boolean c(arvo arvoVar, Object obj) {
        Object k2 = arvoVar.k(obj, null);
        if (k2 != null) {
            arvoVar.a(k2);
            return true;
        }
        return false;
    }
}
