package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pvg implements pvk {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/onlinestatus/OnlineStatusLoggingInterceptor");
    private final pvk b;
    private final anen c;

    public pvg(pvk pvkVar, anen anenVar) {
        this.b = pvkVar;
        this.c = anenVar;
    }

    @Override // defpackage.pvk
    public final akul c(qei qeiVar) {
        akul c = this.b.c(qeiVar);
        c.k(new pvf(qeiVar, 0), this.c);
        return c;
    }
}
