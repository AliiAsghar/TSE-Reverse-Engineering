package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class actq {
    public Optional a;
    public Optional b;
    public Optional c;
    private String d;
    private long e;
    private String f;
    private String g;
    private Optional h;
    private Optional i;
    private Optional j;
    private Optional k;
    private Optional l;
    private Optional m;
    private Optional n;
    private Optional o;
    private Optional p;
    private byte q;

    public actq() {
        throw null;
    }

    public final actr a() {
        String str;
        String str2;
        String str3;
        if (this.q == 1 && (str = this.d) != null && (str2 = this.f) != null && (str3 = this.g) != null) {
            return new actr(str, this.e, str2, str3, this.h, this.a, this.b, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.c, this.p);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" rcsMessageId");
        }
        if (this.q == 0) {
            sb.append(" fileSize");
        }
        if (this.f == null) {
            sb.append(" contentType");
        }
        if (this.g == null) {
            sb.append(" fileUrl");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.k = Optional.of(Long.valueOf(j));
    }

    public final void c(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null contentType");
    }

    public final void d(Uri uri) {
        this.m = Optional.of(uri);
    }

    public final void e(String str) {
        this.l = Optional.of(str);
    }

    public final void f(long j) {
        this.e = j;
        this.q = (byte) 1;
    }

    public final void g(long j) {
        this.j = Optional.of(Long.valueOf(j));
    }

    public final void h(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null fileUrl");
    }

    public final void i(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null rcsMessageId");
    }

    public final void j(String str) {
        this.h = Optional.of(str);
    }

    public final void k(String str) {
        this.n = Optional.of(str);
    }

    public final void l(byte[] bArr) {
        this.o = Optional.of(bArr);
    }

    public final void m(long j) {
        this.i = Optional.of(Long.valueOf(j));
    }

    public actq(byte[] bArr) {
        this.h = Optional.empty();
        this.a = Optional.empty();
        this.b = Optional.empty();
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.n = Optional.empty();
        this.o = Optional.empty();
        this.c = Optional.empty();
        this.p = Optional.empty();
    }
}
