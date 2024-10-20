package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ssj extends agmb {
    public long a;
    public MessageIdType b;
    public String c;
    public long d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;

    public ssj() {
        super(a.bp());
        this.b = rvc.a;
        this.d = 0L;
        this.j = false;
        this.k = false;
    }

    public final ssi a() {
        return b(new srr(8));
    }

    public final ssi b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        ssi ssiVar = (ssi) obj;
        ssiVar.ar(az());
        ssiVar.a = this.a;
        ssiVar.b = this.b;
        ssiVar.c = this.c;
        ssiVar.d = this.d;
        ssiVar.e = this.e;
        ssiVar.f = this.f;
        ssiVar.g = this.g;
        ssiVar.h = this.h;
        ssiVar.i = this.i;
        ssiVar.j = this.j;
        ssiVar.k = this.k;
        ssiVar.cF = aA();
        return ssiVar;
    }

    public final void c() {
        agnw d;
        agnw d2;
        ssi b = b(new srr(7));
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        agnc.a(d2, "link_preview", b, new spl(d, 6), new smq(b, 7));
    }

    public final void d(long j) {
        aC(3);
        this.d = j;
    }

    public final void e(String str) {
        aC(8);
        this.i = str;
    }

    public final void f(String str) {
        aC(5);
        if (!this.aA) {
            str = yta.a(str);
        }
        this.f = str;
    }

    public final void g(String str) {
        aC(7);
        this.h = str;
    }

    public final void h(String str) {
        aC(6);
        this.g = str;
    }

    public final void i(boolean z) {
        int i = this.az;
        if (i < 22020) {
            agnc.t("link_preview_failed", i);
        }
        aC(10);
        this.k = z;
    }

    public final void j(boolean z) {
        int i = this.az;
        if (i < 21010) {
            agnc.t("link_preview_prevented", i);
        }
        aC(9);
        this.j = z;
    }

    public final void k(String str) {
        aC(4);
        if (!this.aA) {
            str = yta.a(str);
        }
        this.e = str;
    }

    public final void l(MessageIdType messageIdType) {
        aC(1);
        this.b = messageIdType;
    }

    public final void m(String str) {
        aC(2);
        this.c = str;
    }
}
