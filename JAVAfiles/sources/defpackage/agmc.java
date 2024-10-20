package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class agmc {
    private static final AtomicInteger a = new AtomicInteger();
    public final int d;
    public final Consumer e;

    public agmc() {
        this.d = a.getAndIncrement();
        this.e = null;
    }

    public Object d(agoz agozVar, aglo agloVar) {
        c(agozVar, agloVar);
        return null;
    }

    public void e(agoz agozVar, aglo agloVar, Object obj) {
        b(agozVar, agloVar);
    }

    public final int hashCode() {
        return this.d;
    }

    public agmc(Consumer consumer) {
        this.d = a.getAndIncrement();
        this.e = consumer;
    }

    public void a(agoz agozVar) {
    }

    public void b(agoz agozVar, aglo agloVar) {
    }

    public void c(agoz agozVar, aglo agloVar) {
    }
}
