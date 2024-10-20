package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pun implements puu {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CapabilitiesLoggingInterceptor");
    private final puu b;
    private final anen c;

    public pun(puu puuVar, anen anenVar) {
        this.b = puuVar;
        this.c = anenVar;
    }

    @Override // defpackage.puu
    public final akul a(Iterable iterable) {
        akul a2 = this.b.a(iterable);
        a2.k(new pum(0), this.c);
        return a2;
    }

    @Override // defpackage.puu
    public final akul b(qei qeiVar) {
        akul b = this.b.b(qeiVar);
        b.k(new pvf(qeiVar, 1), this.c);
        return b;
    }
}
