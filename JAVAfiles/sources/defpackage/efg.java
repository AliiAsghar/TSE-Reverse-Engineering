package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class efg {
    private final efo a;
    eaq[] b;

    public efg(efo efoVar) {
        this.a = efoVar;
    }

    public efo a() {
        h();
        return this.a;
    }

    public void g(int i, eaq eaqVar) {
        if (this.b == null) {
            this.b = new eaq[9];
        }
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            if ((i & i2) != 0) {
                this.b[eeb.b(i2)] = eaqVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h() {
        eaq[] eaqVarArr = this.b;
        if (eaqVarArr != null) {
            eaq eaqVar = eaqVarArr[eeb.b(1)];
            eaq eaqVar2 = this.b[eeb.b(2)];
            if (eaqVar2 == null) {
                eaqVar2 = this.a.f(2);
            }
            if (eaqVar == null) {
                eaqVar = this.a.f(1);
            }
            c(eaq.b(eaqVar, eaqVar2));
            eaq eaqVar3 = this.b[eeb.b(16)];
            if (eaqVar3 != null) {
                e(eaqVar3);
            }
            eaq eaqVar4 = this.b[eeb.b(32)];
            if (eaqVar4 != null) {
                d(eaqVar4);
            }
            eaq eaqVar5 = this.b[eeb.b(64)];
            if (eaqVar5 != null) {
                f(eaqVar5);
            }
        }
    }

    public efg() {
        this(new efo());
    }

    public void b(eaq eaqVar) {
    }

    public void c(eaq eaqVar) {
    }

    public void d(eaq eaqVar) {
    }

    public void e(eaq eaqVar) {
    }

    public void f(eaq eaqVar) {
    }
}
