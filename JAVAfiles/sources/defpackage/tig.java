package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tig extends agmb {
    public long a;
    public Optional b;
    public lwz c;
    public lwr d;
    public Instant e;
    public Instant f;
    public lwp g;
    public long h;
    public Instant i;
    public Instant j;

    public tig() {
        super(a.bp());
        this.b = rvg.a;
        this.c = lwz.b(0);
        this.d = lwr.b(0);
        this.e = Instant.EPOCH;
        this.f = Instant.EPOCH;
        this.i = Instant.EPOCH;
        this.j = Instant.EPOCH;
    }

    public final tie a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        tie tieVar = (tie) obj;
        tieVar.ar(az());
        tieVar.a = this.a;
        tieVar.b = this.b;
        tieVar.c = this.c;
        tieVar.d = this.d;
        tieVar.e = this.e;
        tieVar.f = this.f;
        tieVar.g = this.g;
        tieVar.h = this.h;
        tieVar.i = this.i;
        tieVar.j = this.j;
        tieVar.cF = aA();
        return tieVar;
    }

    public final void b(lwz lwzVar) {
        aC(2);
        this.c = lwzVar;
    }

    public final void c(long j) {
        int i = this.az;
        if (i < 60110) {
            agnc.t("initial_messages_version", i);
        }
        aC(7);
        this.h = j;
    }

    public final void d(Optional optional) {
        aC(1);
        this.b = optional;
    }

    public final void e(Instant instant) {
        aC(4);
        this.e = instant;
    }

    public final void f(lwr lwrVar) {
        aC(3);
        this.d = lwrVar;
    }

    public final void g(Instant instant) {
        int i = this.az;
        if (i < 60220) {
            agnc.t("status_timestamp", i);
        }
        aC(8);
        this.i = instant;
    }
}
