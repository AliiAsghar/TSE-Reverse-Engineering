package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akct {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public akct() {
        throw null;
    }

    private static void p(ajki ajkiVar) {
        if (ajkiVar instanceof ajkp) {
            float f = ((ajkp) ajkiVar).a;
        } else if (ajkiVar instanceof ajkh) {
            float f2 = ((ajkh) ajkiVar).a;
        }
    }

    public final akcx a() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5 = this.a;
        if (obj5 != null && (obj = this.b) != null && (obj2 = this.d) != null && (obj3 = this.f) != null && (obj4 = this.i) != null) {
            Object obj6 = this.c;
            Object obj7 = this.e;
            Object obj8 = this.g;
            Object obj9 = this.h;
            Object obj10 = this.j;
            algw algwVar = (algw) obj10;
            algw algwVar2 = (algw) obj9;
            algw algwVar3 = (algw) obj6;
            akcv akcvVar = (akcv) obj2;
            gsf gsfVar = (gsf) obj;
            Class cls = (Class) obj5;
            akcx akcxVar = new akcx(cls, gsfVar, algwVar3, akcvVar, (algw) obj7, (gsi) obj3, (algw) obj8, algwVar2, (alpt) obj4, algwVar, (algw) this.k, (algw) this.l);
            if (akcxVar.l.f()) {
                d.t(!((String) akcxVar.l.b()).contains(":"), "Worker target process must either be a custom process like 'my_process' or the empty String '' for the Android default process.");
            }
            return akcxVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" workerClass");
        }
        if (this.b == null) {
            sb.append(" constraints");
        }
        if (this.d == null) {
            sb.append(" initialDelay");
        }
        if (this.f == null) {
            sb.append(" inputData");
        }
        if (this.i == null) {
            sb.append(" tags");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(gsf gsfVar) {
        if (gsfVar != null) {
            this.b = gsfVar;
            return;
        }
        throw new NullPointerException("Null constraints");
    }

    public final void c(akcu akcuVar) {
        this.g = algw.i(akcuVar);
    }

    public final void d(Set set) {
        this.i = alpt.o(set);
    }

    public final void e(akcw akcwVar) {
        this.h = algw.i(akcwVar);
    }

    public final void f(gry gryVar, akcv akcvVar) {
        this.k = algw.i(akcvVar);
        this.j = algw.i(gryVar);
    }

    public final void g(float f) {
        this.b = new ajkd(f);
    }

    public final void h(float f) {
        this.f = new ajkd(f);
    }

    public final void i(float f) {
        this.d = new ajkd(f);
    }

    public final void j(float f) {
        this.k = new ajkd(f);
    }

    public final void k(float f) {
        i(f);
        j(f);
        h(f);
        g(f);
    }

    public final void l(ajki ajkiVar) {
        this.j = ajkiVar;
        p(ajkiVar);
    }

    public final void m(ajki ajkiVar) {
        this.c = ajkiVar;
        p(ajkiVar);
    }

    public final void n(ajki ajkiVar) {
        this.e = ajkiVar;
        p(ajkiVar);
    }

    public final void o(ajki ajkiVar) {
        this.g = ajkiVar;
        p(ajkiVar);
    }

    public akct(ajkr ajkrVar) {
        this.e = new ajkp();
        this.g = new ajkp();
        this.c = new ajkp();
        this.j = new ajkp();
        this.d = new ajkd(brg.a);
        this.k = new ajkd(brg.a);
        this.f = new ajkd(brg.a);
        this.b = new ajkd(brg.a);
        this.a = new ajki();
        this.i = new ajki();
        this.l = new ajki();
        this.h = new ajki();
        this.e = ajkrVar.j;
        this.g = ajkrVar.k;
        this.c = ajkrVar.l;
        this.j = ajkrVar.m;
        this.d = ajkrVar.b;
        this.k = ajkrVar.c;
        this.f = ajkrVar.d;
        this.b = ajkrVar.e;
        this.a = ajkrVar.f;
        this.i = ajkrVar.g;
        this.l = ajkrVar.h;
        this.h = ajkrVar.i;
    }

    public akct(akcx akcxVar) {
        alfd alfdVar = alfd.a;
        this.c = alfdVar;
        this.e = alfdVar;
        this.g = alfdVar;
        this.h = alfdVar;
        this.j = alfdVar;
        this.k = alfdVar;
        this.l = alfdVar;
        this.a = akcxVar.a;
        this.b = akcxVar.b;
        this.c = akcxVar.c;
        this.d = akcxVar.d;
        this.e = akcxVar.e;
        this.f = akcxVar.f;
        this.g = akcxVar.g;
        this.h = akcxVar.h;
        this.i = akcxVar.i;
        this.j = akcxVar.j;
        this.k = akcxVar.k;
        this.l = akcxVar.l;
    }

    public akct(byte[] bArr) {
        alfd alfdVar = alfd.a;
        this.c = alfdVar;
        this.e = alfdVar;
        this.g = alfdVar;
        this.h = alfdVar;
        this.j = alfdVar;
        this.k = alfdVar;
        this.l = alfdVar;
    }

    public akct(char[] cArr) {
        this.e = new ajkp();
        this.g = new ajkp();
        this.c = new ajkp();
        this.j = new ajkp();
        this.d = new ajkd(brg.a);
        this.k = new ajkd(brg.a);
        this.f = new ajkd(brg.a);
        this.b = new ajkd(brg.a);
        this.a = new ajki();
        this.i = new ajki();
        this.l = new ajki();
        this.h = new ajki();
    }
}
