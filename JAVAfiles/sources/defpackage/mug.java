package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mug implements ncp {
    final /* synthetic */ mui a;
    private final String b;
    private final mjf c;

    public mug(mui muiVar, String str, mjf mjfVar) {
        this.a = muiVar;
        this.b = str;
        this.c = mjfVar;
    }

    @Override // defpackage.ncp
    public final akul a() {
        alvw g = mui.a.g();
        g.X(alwp.a, "BugleMapi");
        alvg alvgVar = (alvg) g;
        alvgVar.X(ydl.q, this.a.j);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$OnDataChangedHandlerWithLogs", "onChanged", 1866, "CoreBugleMessageRepository.java")).t("firing onAllMessagesChanged, source: %s.", this.b);
        return this.c.b();
    }
}
