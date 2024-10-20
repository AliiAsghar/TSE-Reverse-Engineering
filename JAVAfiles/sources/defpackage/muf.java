package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class muf implements mjf {
    final /* synthetic */ mui a;
    private final String b;
    private final mjf c;

    public muf(mui muiVar, String str, mjf mjfVar) {
        this.a = muiVar;
        this.b = str;
        this.c = mjfVar;
    }

    @Override // defpackage.yfv
    public final /* synthetic */ akul a(Object obj) {
        mzi mziVar = (mzi) obj;
        alvw g = mui.a.g();
        g.X(alwp.a, "BugleMapi");
        alvg alvgVar = (alvg) g;
        alvgVar.X(ydl.q, this.a.j);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$MessagesChangedCallbackWithLogs", "onChange", 1841, "CoreBugleMessageRepository.java")).J("firing onChange, msg: %s %s, source: %s.", mziVar.b.a(), mziVar.a, this.b);
        return this.c.a(mziVar);
    }

    @Override // defpackage.mjf
    public final akul b() {
        alvw g = mui.a.g();
        g.X(alwp.a, "BugleMapi");
        alvg alvgVar = (alvg) g;
        alvgVar.X(ydl.q, this.a.j);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$MessagesChangedCallbackWithLogs", "onAllMessagesChanged", 1833, "CoreBugleMessageRepository.java")).t("firing onAllMessagesChanged, source: %s.", this.b);
        return this.c.b();
    }

    public muf(mui muiVar, mzl mzlVar, mjf mjfVar) {
        this.a = muiVar;
        this.b = mzlVar.a;
        this.c = mjfVar;
    }
}
