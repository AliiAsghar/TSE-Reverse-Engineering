package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wes {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcs/performance/ChannelBasedAwakeSender");
    public final armf b;
    public final nfw c;
    private final anen d;

    public wes(armf armfVar, anen anenVar, nfw nfwVar) {
        this.b = armfVar;
        this.d = anenVar;
        this.c = nfwVar;
    }

    public final void a(String str, int i) {
        akrh e = aktp.e("ChannelBasedAwakeSender::prewarm");
        try {
            ((alvg) ((alvg) a.g()).h("com/google/android/apps/messaging/shared/rcs/performance/ChannelBasedAwakeSender", "prewarm", 56, "ChannelBasedAwakeSender.java")).t("Attempting to send prewarm by %s", this.c);
            aozy createBuilder = aqfn.a.createBuilder();
            asku askuVar = asku.PHONE_NUMBER;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aqfn) createBuilder.b).b = askuVar.a();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            ((aqfn) apagVar).d = "RCS";
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            ((aqfn) createBuilder.b).c = str;
            akul e2 = aktp.aj(new ahno(this, (aqfn) createBuilder.s(), i, 1), this.d).e(Throwable.class, new wax(12), andi.a);
            e.b(e2);
            qiu.h(e2);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
