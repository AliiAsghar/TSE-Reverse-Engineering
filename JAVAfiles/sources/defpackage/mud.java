package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mud implements yga {
    final /* synthetic */ mui a;
    private final yga b;

    public mud(mui muiVar, yga ygaVar) {
        this.a = muiVar;
        this.b = ygaVar;
    }

    @Override // defpackage.yga
    public final void a() {
        this.b.a();
        alvw g = mui.a.g();
        g.X(alwp.a, "BugleMapi");
        alvg alvgVar = (alvg) g;
        alvgVar.X(ydl.q, this.a.j);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$LogOnUnsubscribeToken", "unsubscribe", 1806, "CoreBugleMessageRepository.java")).q("Unsubscribed from message callbacks.");
    }

    @Override // defpackage.yga, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        yyb.aJ(this);
    }
}
