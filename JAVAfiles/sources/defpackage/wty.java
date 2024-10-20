package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wty {
    private static final xze b = xze.g("Bugle", "MessageSendingMetadata");
    public final wul a;

    public wty(wul wulVar) {
        this.a = wulVar;
    }

    public final wtx a() {
        try {
            return (wtx) this.a.l();
        } catch (apba e) {
            xyo b2 = b.b();
            b2.H("Couldn't load MessageSendingMetadata from store");
            b2.r(e);
            return wtx.a;
        }
    }
}
