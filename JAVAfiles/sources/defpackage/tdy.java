package defpackage;

import com.google.android.ims.rcsservice.businessinfo.AgentUseCase;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tdy extends agmb {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public long k;
    public AgentUseCase l;

    public tdy() {
        super(a.bp());
        this.l = AgentUseCase.AGENT_USE_CASE_UNSPECIFIED;
    }

    public final tdx a() {
        int i = tdb.a;
        tdx tdxVar = new tdx();
        tdxVar.ar(az());
        tdxVar.a = this.a;
        tdxVar.b = this.b;
        tdxVar.c = this.c;
        tdxVar.d = this.d;
        tdxVar.e = this.e;
        tdxVar.f = this.f;
        tdxVar.g = this.g;
        tdxVar.h = this.h;
        tdxVar.i = this.i;
        tdxVar.j = this.j;
        tdxVar.k = this.k;
        tdxVar.l = this.l;
        tdxVar.cF = aA();
        return tdxVar;
    }

    public final void b(AgentUseCase agentUseCase) {
        int i = this.az;
        if (i < 59140) {
            agnc.t("agent_use_case_category", i);
        }
        aC(11);
        this.l = agentUseCase;
    }

    public final void c(String str) {
        aC(5);
        this.f = str;
    }

    public final void d(String str) {
        aC(4);
        this.e = str;
    }

    public final void e(String str) {
        aC(1);
        this.b = str;
    }

    public final void f(long j) {
        aC(10);
        this.k = j;
    }

    public final void g(String str) {
        aC(7);
        this.h = str;
    }

    public final void h(String str) {
        aC(6);
        this.g = str;
    }

    public final void i(String str) {
        aC(3);
        this.d = str;
    }

    public final void j(String str) {
        aC(2);
        this.c = str;
    }

    public final void k(String str) {
        aC(0);
        this.a = str;
    }

    public final void l(String str) {
        aC(8);
        this.i = str;
    }

    public final void m(String str) {
        aC(9);
        this.j = str;
    }
}
