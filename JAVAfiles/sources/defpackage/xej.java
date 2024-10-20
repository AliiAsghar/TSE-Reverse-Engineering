package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xej {
    private static final alwo a = alwo.o("BugleTachygram");
    private final xep b;

    public xej(xep xepVar) {
        this.b = xepVar;
    }

    public final akul a(anjj anjjVar) {
        aozb aozbVar = anjjVar.a.a.e;
        if (aozb.b.equals(aozbVar)) {
            alwl alwlVar = (alwl) a.i();
            alwlVar.X(ydl.I, anjjVar.a.a.c);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/tachygram/chat/RoutingInfoTokenForwarder", "storeRoutingInfoToken", 32, "RoutingInfoTokenForwarder.java")).q("GroupInfo missing routing info token.");
            return aktp.ag(null);
        }
        return this.b.c(anjjVar.a.a.c, aozbVar);
    }
}
