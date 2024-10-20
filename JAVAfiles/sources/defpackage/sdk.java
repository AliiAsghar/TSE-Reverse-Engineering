package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sdk extends agmb {
    public MessageIdType a;
    public MessageIdType b;
    public long c;
    public String d;
    public int e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String[] j;
    public String[] k;
    public Uri[] l;
    public String[] m;
    public String[] n;
    public long[] o;
    public long[] p;
    public String q;
    public long r;
    public String s;
    public String t;
    public boolean u;

    public sdk() {
        super(a.bp());
        MessageIdType messageIdType = rvc.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = 0L;
        this.e = -2;
        this.r = 0L;
        this.u = false;
    }

    public final sdj a() {
        int i = scs.a;
        sdj sdjVar = new sdj();
        sdjVar.ar(az());
        sdjVar.a = this.a;
        sdjVar.b = this.b;
        sdjVar.c = this.c;
        sdjVar.e = this.d;
        sdjVar.f = this.e;
        sdjVar.g = this.f;
        sdjVar.h = this.g;
        sdjVar.i = this.h;
        sdjVar.j = this.i;
        sdjVar.l = this.j;
        sdjVar.m = this.k;
        sdjVar.n = this.l;
        sdjVar.o = this.m;
        sdjVar.p = this.n;
        sdjVar.q = this.o;
        sdjVar.r = this.p;
        sdjVar.t = this.q;
        sdjVar.u = this.r;
        sdjVar.v = this.s;
        sdjVar.w = this.t;
        sdjVar.x = this.u;
        sdjVar.g();
        sdjVar.cF = aA();
        return sdjVar;
    }

    public final void b(String[] strArr) {
        aC(12);
        this.m = strArr;
    }

    public final void c(String str) {
        aC(6);
        if (!this.aA) {
            str = aabr.bb(str);
        }
        this.g = str;
    }

    public final void d(long[] jArr) {
        int i = this.az;
        if (i < 26040) {
            agnc.t("duration", i);
        }
        aC(14);
        this.o = jArr;
    }

    public final void e(long j) {
        aC(17);
        this.r = j;
    }

    public final void f(String[] strArr) {
        int i = this.az;
        if (i < 26000) {
            agnc.t("file_name", i);
        }
        aC(13);
        this.n = strArr;
    }

    public final void g(String str) {
        aC(8);
        if (!this.aA) {
            str = yta.a(str);
        }
        this.i = str;
    }

    public final void h(String str) {
        aC(7);
        if (!this.aA) {
            str = yta.a(str);
        }
        this.h = str;
    }

    public final void i(MessageIdType messageIdType) {
        aC(1);
        this.b = messageIdType;
    }

    public final void j(String str) {
        aC(3);
        this.d = str;
    }

    public final void k(String[] strArr) {
        aC(9);
        this.j = strArr;
    }

    public final void l(String str) {
        aC(19);
        this.t = str;
    }

    public final void m(boolean z) {
        int i = this.az;
        if (i < 22020) {
            agnc.t("link_preview_failed", i);
        }
        aC(20);
        this.u = z;
    }

    public final void n(String str) {
        aC(18);
        if (!this.aA) {
            str = yta.a(str);
        }
        this.s = str;
    }

    public final void o(MessageIdType messageIdType) {
        aC(0);
        this.a = messageIdType;
    }

    public final void p(String str) {
        aC(5);
        if (!this.aA) {
            str = aabr.bb(str);
        }
        this.f = str;
    }

    @Deprecated
    public final void q(long[] jArr) {
        int i = this.az;
        if (i < 0) {
            agnc.t("parts.rowid", i);
        }
        aC(15);
        this.p = jArr;
    }

    public final void r(long j) {
        aC(2);
        this.c = j;
    }

    public final void s(int i) {
        aC(4);
        this.e = i;
    }

    public final void t(String[] strArr) {
        aC(10);
        this.k = strArr;
    }

    public final void u(String str) {
        aC(16);
        this.q = str;
    }

    public final void v(Uri[] uriArr) {
        aC(11);
        this.l = uriArr;
    }
}
