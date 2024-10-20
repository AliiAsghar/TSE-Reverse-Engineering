package defpackage;

import android.net.Uri;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sje extends agmb {
    public long a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public Uri h;
    public Uri i;
    public String j;
    public String k;
    public Instant l;
    public String m;
    public String n;
    public long o;
    public long p;
    public String q;
    public String r;

    public sje() {
        super(a.bp());
        this.l = Instant.EPOCH;
    }

    public final sjd a() {
        int i = shg.a;
        sjd sjdVar = new sjd();
        sjdVar.ar(az());
        sjdVar.a = this.a;
        sjdVar.b = this.b;
        sjdVar.c = this.c;
        sjdVar.d = this.d;
        sjdVar.e = this.e;
        sjdVar.f = this.f;
        sjdVar.g = this.g;
        sjdVar.h = this.h;
        sjdVar.i = this.i;
        sjdVar.j = this.j;
        sjdVar.k = this.k;
        sjdVar.l = this.l;
        sjdVar.m = this.m;
        sjdVar.n = this.n;
        sjdVar.o = this.o;
        sjdVar.p = this.p;
        sjdVar.q = this.q;
        sjdVar.r = this.r;
        sjdVar.cF = aA();
        return sjdVar;
    }

    public final void b(String str) {
        aC(10);
        this.k = str;
    }

    public final void c(String str) {
        aC(9);
        this.j = str;
    }

    public final void d(long j) {
        aC(1);
        this.b = j;
    }

    public final void e(long j) {
        int i = this.az;
        if (i < 59080) {
            agnc.t("contact_type", i);
        }
        aC(15);
        this.p = j;
    }

    public final void f(long j) {
        aC(0);
        this.a = j;
    }

    public final void g(String str) {
        int i = this.az;
        if (i < 59120) {
            agnc.t("display_destination", i);
        }
        aC(17);
        this.r = str;
    }

    public final void h(String str) {
        aC(4);
        this.e = str;
    }

    public final void i(String str) {
        aC(6);
        this.g = str;
    }

    public final void j(String str) {
        aC(5);
        this.f = str;
    }

    public final void k(Instant instant) {
        aC(11);
        this.l = instant;
    }

    public final void l(String str) {
        aC(2);
        this.c = str;
    }

    public final void m(String str) {
        aC(3);
        this.d = str;
    }

    public final void n(long j) {
        int i = this.az;
        if (i < 59070) {
            agnc.t("phonebook_bucket", i);
        }
        aC(14);
        this.o = j;
    }

    public final void o(String str) {
        int i = this.az;
        if (i < 59070) {
            agnc.t("phonebook_label", i);
        }
        aC(13);
        this.n = str;
    }

    public final void p(Uri uri) {
        aC(7);
        this.h = uri;
    }

    public final void q(String str) {
        int i = this.az;
        if (i < 59070) {
            agnc.t("sort_key", i);
        }
        aC(12);
        this.m = str;
    }

    public final void r(Uri uri) {
        aC(8);
        this.i = uri;
    }

    public final void s(String str) {
        int i = this.az;
        if (i < 60150) {
            agnc.t("type_label", i);
        }
        aC(16);
        this.q = str;
    }
}
