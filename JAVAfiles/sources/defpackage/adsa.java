package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsa implements adfk, adig {
    private final apfw a;
    private final adet b;
    private final adeq c;
    private final adif d;

    public adsa(apfw apfwVar, adet adetVar, adeq adeqVar, adif adifVar) {
        this.a = apfwVar;
        this.b = adetVar;
        this.c = adeqVar;
        this.d = adifVar;
    }

    private final void d(int i) {
        this.b.t.remove(this);
        aozy builder = this.a.toBuilder();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        ((apfw) builder.b).d = a.am(i);
        apfw apfwVar = (apfw) builder.s();
        adeq adeqVar = this.c;
        advr.o("FCM tickle processed. Reporting uptime", new Object[0]);
        adeqVar.d.g(adeqVar.c, apfwVar, (apfy) adeqVar.q().s());
        this.d.g(this);
    }

    @Override // defpackage.adig
    public final void a() {
        advr.c("Keep alive response received after processing FCM tickle. Logging client state and cleaning up listeners", new Object[0]);
        d(6);
    }

    @Override // defpackage.adig
    public final void b() {
        advr.c("Keep alive response timeout after processing FCM tickle. Cleaning up FcmTickleKeepAliveListener.", new Object[0]);
        this.d.g(this);
    }

    @Override // defpackage.adig
    public final void c() {
        advr.c("Failed to send keep alive after processing FCM tickle. Cleaning up FcmTickleKeepAliveListener", new Object[0]);
        this.d.g(this);
    }

    @Override // defpackage.adfk
    public final void f(acok acokVar) {
        advr.c("Registration failed after processing FCM tickle. Logging client state and cleaning up listeners", new Object[0]);
        d(5);
    }

    @Override // defpackage.adfk
    public final void g() {
        advr.c("Registration successful after processing FCM tickle. Logging client state and cleaning up listeners", new Object[0]);
        d(4);
    }

    @Override // defpackage.adfk
    public final void h(acok acokVar) {
        advr.c("Registration terminated after processing FCM tickle", new Object[0]);
    }
}
