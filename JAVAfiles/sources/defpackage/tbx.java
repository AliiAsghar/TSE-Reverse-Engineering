package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tbx extends agmb {
    public rve a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public String i;
    public int j;
    public long k;
    public tqn l;
    public apwq m;
    public boolean n;
    public String o;
    public String p;
    public boolean q;
    public boolean r;

    public tbx() {
        super(a.bp());
        this.a = rve.a;
        this.q = false;
        this.r = false;
    }

    public final tbw a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        tbw tbwVar = (tbw) obj;
        tbwVar.ar(az());
        tbwVar.a = this.a;
        tbwVar.b = this.b;
        tbwVar.c = this.c;
        tbwVar.d = this.d;
        tbwVar.e = this.e;
        tbwVar.f = this.f;
        tbwVar.g = this.g;
        tbwVar.h = this.h;
        tbwVar.i = this.i;
        tbwVar.j = this.j;
        tbwVar.k = this.k;
        tbwVar.l = this.l;
        tbwVar.m = this.m;
        tbwVar.n = this.n;
        tbwVar.o = this.o;
        tbwVar.p = this.p;
        tbwVar.q = this.q;
        tbwVar.r = this.r;
        tbwVar.cF = aA();
        return tbwVar;
    }

    public final void b() {
        agnw d;
        agnw d2;
        tbw a = a(new taq(14));
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        agnc.a(d2, "pending_incoming_message_rcs_table", a, new tbe(d, 4), new swb(4));
    }

    public final void c(String str) {
        int i = this.az;
        if (i < 58820) {
            agnc.t("conference_uri", i);
        }
        aC(15);
        this.p = str;
    }

    public final void d(String str) {
        aC(4);
        this.e = str;
    }

    public final void e(String str) {
        int i = this.az;
        if (i < 58820) {
            agnc.t("conversation_id", i);
        }
        aC(14);
        this.o = str;
    }

    public final void f(apwq apwqVar) {
        int i = this.az;
        if (i < 44020) {
            agnc.t("custom_headers", i);
        }
        aC(12);
        this.m = apwqVar;
    }

    public final void g(boolean z) {
        int i = this.az;
        if (i < 58870) {
            agnc.t("is_delivery_report_requested", i);
        }
        aC(16);
        this.q = z;
    }

    public final void h(boolean z) {
        int i = this.az;
        if (i < 58870) {
            agnc.t("is_display_report_requested", i);
        }
        aC(17);
        this.r = z;
    }

    public final void i(boolean z) {
        int i = this.az;
        if (i < 58820) {
            agnc.t("is_group", i);
        }
        aC(13);
        this.n = z;
    }

    public final void j(tqn tqnVar) {
        aC(11);
        this.l = tqnVar;
    }

    public final void k(String str) {
        aC(3);
        this.d = str;
    }

    public final void l(rve rveVar) {
        aC(0);
        this.a = rveVar;
    }

    public final void m(long j) {
        aC(7);
        this.h = j;
    }

    public final void n(String str) {
        aC(5);
        this.f = str;
    }

    public final void o(String str) {
        aC(1);
        this.b = str;
    }

    public final void p(String str) {
        int i = this.az;
        if (i < 59410) {
            agnc.t("self_identity", i);
        }
        aC(2);
        this.c = str;
    }

    public final void q(long j) {
        aC(6);
        this.g = j;
    }

    public final void r(long j) {
        aC(10);
        this.k = j;
    }

    public final void s(String str) {
        aC(8);
        this.i = str;
    }

    public final void t(int i) {
        aC(9);
        this.j = i;
    }
}
