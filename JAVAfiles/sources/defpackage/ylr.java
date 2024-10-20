package defpackage;

import j$.time.Duration;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ylr {
    public final anen c;
    private final aneo e;
    public static final utz a = uuh.f(uuh.b, "rcs_service_retry_delay_millis", 500);
    private static final utz d = uuh.c(uuh.b, "rcs_service_retry_multiplier", 2.0d);
    public static final utz b = uuh.e(uuh.b, "rcs_service_retry_total_attempts_num", 4);

    public ylr(anen anenVar, aneo aneoVar) {
        this.c = anenVar;
        this.e = aneoVar;
    }

    public final akul a(Callable callable) {
        amdt amdtVar = new amdt();
        amdtVar.b(this.e);
        return akul.g(amdtVar.a(akto.b(new ylq(this, callable, 0)), amdr.d(Duration.ofMillis(((Long) a.e()).longValue()), ((Double) d.e()).doubleValue(), ((Integer) b.e()).intValue()), new evp(6))).f(amdk.class, new xdg(14), this.e);
    }
}
