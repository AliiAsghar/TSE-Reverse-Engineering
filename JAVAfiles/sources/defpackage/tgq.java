package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tgq extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(agpj agpjVar) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 35070) {
            agnc.t("conversation_id", intValue);
        }
        U(new agme("reminders.conversation_id", 1, agpjVar));
    }

    public final void c(long j) {
        U(new agoi("reminders.trigger_time", 8, Long.valueOf(j)));
    }
}
