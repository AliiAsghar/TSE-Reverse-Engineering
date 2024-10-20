package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pvf implements andy {
    private final qei a;
    private final /* synthetic */ int b;

    public pvf(qei qeiVar, int i) {
        this.b = i;
        this.a = qeiVar;
    }

    @Override // defpackage.andy
    public final /* synthetic */ void b(Object obj) {
        if (this.b != 0) {
            pto ptoVar = (pto) obj;
            alvw g = pun.a.g();
            g.X(alwp.a, "BugleRcsCapabilities");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CapabilitiesLoggingInterceptor$LoggingCallback", "onSuccess", 73, "CapabilitiesLoggingInterceptor.java")).J("Returned %d capabilities for endpoint %s with timestamp %d", Integer.valueOf(ptoVar.a().b.size()), yyb.bh(this.a.d), Long.valueOf(ptoVar.b().toEpochMilli()));
            return;
        }
        String bh = yyb.bh(this.a.d);
        alvw g2 = pvg.a.g();
        g2.X(alwp.a, "BugleRcsCapabilities");
        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/onlinestatus/OnlineStatusLoggingInterceptor$LoggingCallback", "onSuccess", 58, "OnlineStatusLoggingInterceptor.java")).D("OnlineStatus %s returned for endpoint %s", ((pvj) obj).name(), bh);
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
    }
}
