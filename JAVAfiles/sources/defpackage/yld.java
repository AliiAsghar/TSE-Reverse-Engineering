package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yld {
    public static final xze a = xze.g("BugleRcs", "BasePhenotypeHelper");
    static final String[] b = {"ANDROID_MESSAGING", "ANDROID_MESSAGING_PRIMES", "BUGLE_COUNTERS", "CARRIER_SERVICES", "EXPRESSION", "EXPRESSION_COUNTERS", "BUGLE_SPAM", "MESSAGES"};
    public final xyt c;
    private final Executor d;

    public yld(uub uubVar, xyt xytVar, Executor executor) {
        this.c = xytVar;
        this.d = executor;
        uubVar.a();
    }

    public final void a(String str, acgo acgoVar) {
        xyo a2 = a.a();
        a2.z("Committing for package", str);
        a2.q();
        new ylc((acgl) this.c.a(), str).c(this.d, acgoVar);
    }
}
