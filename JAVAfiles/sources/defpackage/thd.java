package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class thd extends agmb {
    public String a;
    public boolean b;
    public boolean c;
    public rvd d;
    public Instant e;
    public byte[] f;
    public long g;
    public Instant h;
    public boolean i;

    public thd() {
        super(a.bp());
        this.b = false;
        this.c = false;
        this.d = new rvd(0L);
        this.e = uzz.l(0L);
        this.g = 0L;
        this.h = uzz.l(0L);
        this.i = false;
    }

    public final thc a() {
        int i = tfq.a;
        thc thcVar = new thc();
        thcVar.ar(az());
        thcVar.a = this.a;
        thcVar.b = this.b;
        thcVar.c = this.c;
        thcVar.d = this.d;
        thcVar.e = this.e;
        thcVar.f = this.f;
        thcVar.g = this.g;
        thcVar.h = this.h;
        thcVar.i = this.i;
        thcVar.cF = aA();
        return thcVar;
    }

    public final void b(Instant instant) {
        aC(7);
        this.h = instant;
    }

    public final void c(boolean z) {
        aC(1);
        this.b = z;
    }

    public final void d(boolean z) {
        int i = this.az;
        if (i < 46000) {
            agnc.t("better_etouffee", i);
        }
        aC(2);
        this.c = z;
    }

    public final void e(byte[] bArr) {
        aC(5);
        this.f = bArr;
    }

    public final void f(boolean z) {
        aC(8);
        this.i = z;
    }

    public final void g(Instant instant) {
        aC(4);
        this.e = instant;
    }

    public final void h(rvd rvdVar) {
        int i = this.az;
        if (i < 58800) {
            agnc.t("messages_feature_hash", i);
        }
        aC(3);
        this.d = rvdVar;
    }

    public final void i(String str) {
        aC(0);
        this.a = str;
    }

    public final void j(long j) {
        aC(6);
        this.g = j;
    }
}
