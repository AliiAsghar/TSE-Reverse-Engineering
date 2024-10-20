package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qvd extends agmb {
    public qwe a;
    public String b;
    public boolean c;
    public qvn d;
    public String e;
    public String f;

    public qvd() {
        super(a.bp());
        this.a = null;
        this.c = false;
    }

    public final qvc a() {
        return b(new qqe(15));
    }

    public final qvc b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        qvc qvcVar = (qvc) obj;
        qvcVar.ar(az());
        qvcVar.a = this.a;
        qvcVar.b = this.b;
        qvcVar.c = this.c;
        qvcVar.d = this.d;
        qvcVar.e = this.e;
        qvcVar.f = this.f;
        qvcVar.cF = aA();
        return qvcVar;
    }

    public final void c(String str) {
        aC(4);
        this.e = str;
    }

    public final void d(qvn qvnVar) {
        if (this.az < 59980) {
            return;
        }
        aC(3);
        this.d = qvnVar;
    }

    public final void e(String str) {
        int i = this.az;
        if (i < 60120) {
            agnc.t("display_name", i);
        }
        aC(5);
        this.f = str;
    }

    public final void f(String str) {
        int i = this.az;
        if (i < 59990) {
            agnc.t("provisioning_id", i);
        }
        aC(1);
        this.b = str;
    }

    public final void g(qwe qweVar) {
        aC(0);
        this.a = qweVar;
    }
}
