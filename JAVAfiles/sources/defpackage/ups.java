package defpackage;

import j$.util.Optional;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ups extends agmb {
    public long a;
    public String b;
    public byte[] c;
    public int d;
    public long e;
    public String f;
    public String g;
    public boolean h;
    public Optional i;
    public Date j;
    public String k;

    public ups() {
        super(a.bp());
        this.i = rvg.a;
        this.j = rva.a;
    }

    public final upr a() {
        int i = tyr.a;
        upr uprVar = new upr();
        uprVar.ar(az());
        String str = this.f;
        if (str != null) {
            uprVar.a = this.a;
            uprVar.b = this.b;
            uprVar.c = this.c;
            uprVar.d = this.d;
            uprVar.e = this.e;
            uprVar.f = str;
            uprVar.g = this.g;
            uprVar.h = this.h;
            uprVar.i = this.i;
            uprVar.j = this.j;
            uprVar.k = this.k;
            uprVar.cF = aA();
            return uprVar;
        }
        throw new IllegalStateException("field queue cannot be null");
    }

    public final void b(String str) {
        int i = this.az;
        if (i < 48020) {
            agnc.t("cancellation_tag", i);
        }
        aC(10);
        this.k = str;
    }

    public final void c(String str) {
        int i = this.az;
        if (i < 42050) {
            agnc.t("deduplication_tag", i);
        }
        aC(6);
        this.g = str;
    }

    public final void d(Date date) {
        int i = this.az;
        if (i < 46070) {
            agnc.t("minimum_start_time", i);
        }
        aC(9);
        this.j = date;
    }

    public final void e(String str) {
        int i = this.az;
        if (i < 41030) {
            agnc.t("queue", i);
        }
        aC(5);
        this.f = str;
    }

    public final void f(byte[] bArr) {
        aC(2);
        this.c = bArr;
    }

    public final void g(long j) {
        aC(4);
        this.e = j;
    }

    public final void h(String str) {
        aC(1);
        this.b = str;
    }
}
