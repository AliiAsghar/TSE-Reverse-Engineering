package defpackage;

import android.net.Uri;
import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class spn extends agmb {
    public rve a;
    public byte[] b;
    public byte[] c;
    public int d;
    public byte[] e;
    public byte[] f;
    public int g;
    public Instant h;
    public Uri i;
    public String j;
    public byte[] k;
    public byte[] l;
    public String m;
    public Instant n;
    public String o;
    public String p;
    public String q;

    public spn() {
        super(a.bp());
        this.a = rve.a;
        this.h = uzz.l(0L);
        this.n = Instant.EPOCH;
    }

    public final spm a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        spm spmVar = (spm) obj;
        spmVar.ar(az());
        spmVar.a = this.a;
        spmVar.b = this.b;
        spmVar.c = this.c;
        spmVar.d = this.d;
        spmVar.e = this.e;
        spmVar.f = this.f;
        spmVar.g = this.g;
        spmVar.h = this.h;
        spmVar.i = this.i;
        spmVar.j = this.j;
        spmVar.k = this.k;
        spmVar.l = this.l;
        spmVar.m = this.m;
        spmVar.n = this.n;
        spmVar.o = this.o;
        spmVar.p = this.p;
        spmVar.q = this.q;
        spmVar.cF = aA();
        return spmVar;
    }

    @Deprecated
    public final void b() {
        agnw d;
        agnw d2;
        spm a = a(new spk(3));
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        agnc.a(d2, "etouffee_rcs_metadata", a, new spl(d, 0), new rbc(18));
    }

    public final void c(byte[] bArr) {
        aC(5);
        this.f = bArr;
    }

    public final void d(byte[] bArr) {
        aC(4);
        this.e = bArr;
    }

    public final void e(int i) {
        aC(6);
        this.g = i;
    }

    public final void f(Uri uri) {
        int i = this.az;
        if (i < 35060) {
            agnc.t("attachment_uri", i);
        }
        aC(8);
        this.i = uri;
    }

    public final void g(Instant instant) {
        aC(7);
        this.h = instant;
    }

    public final void h(byte[] bArr) {
        int i = this.az;
        if (i < 37020) {
            agnc.t("custom_delivery_receipt_content", i);
        }
        aC(10);
        this.k = bArr;
    }

    public final void i(String str) {
        int i = this.az;
        if (i < 37020) {
            agnc.t("custom_delivery_receipt_mime_type", i);
        }
        aC(9);
        this.j = str;
    }

    public final void j(String str) {
        int i = this.az;
        if (i < 56020) {
            agnc.t("plaintext_attachment_content_type", i);
        }
        aC(15);
        this.p = str;
    }

    public final void k(String str) {
        int i = this.az;
        if (i < 56020) {
            agnc.t("plaintext_attachment_name", i);
        }
        aC(14);
        this.o = str;
    }

    public final void l(String str) {
        int i = this.az;
        if (i < 56020) {
            agnc.t("plaintext_thumbnail_content_type", i);
        }
        aC(16);
        this.q = str;
    }

    public final void m(byte[] bArr) {
        aC(2);
        this.c = bArr;
    }

    public final void n(byte[] bArr) {
        aC(1);
        this.b = bArr;
    }

    public final void o(int i) {
        aC(3);
        this.d = i;
    }

    public final void p(rve rveVar) {
        aC(0);
        this.a = rveVar;
    }
}
