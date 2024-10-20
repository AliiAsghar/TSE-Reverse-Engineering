package defpackage;

import j$.util.Optional;
import java.util.Date;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uqt extends agmb {
    public String a;
    public Optional b;
    public Date c;
    public Date d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    public uqt() {
        super(a.bp());
        this.b = rvg.a;
        this.c = rva.a;
        this.d = rva.a;
    }

    public final uqs a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        uqs uqsVar = (uqs) obj;
        uqsVar.ar(az());
        uqsVar.a = this.a;
        uqsVar.b = this.b;
        uqsVar.c = this.c;
        uqsVar.d = this.d;
        uqsVar.e = this.e;
        uqsVar.f = this.f;
        uqsVar.g = this.g;
        uqsVar.h = this.h;
        uqsVar.i = this.i;
        uqsVar.cF = aA();
        return uqsVar;
    }

    public final void b(Date date) {
        aC(3);
        this.d = date;
    }

    public final void c(String str) {
        aC(0);
        this.a = str;
    }

    public final void d(boolean z) {
        aC(7);
        this.h = z;
    }

    public final void e(boolean z) {
        aC(5);
        this.f = z;
    }

    public final void f(boolean z) {
        aC(6);
        this.g = z;
    }

    public final void g(int i) {
        aC(4);
        this.e = i;
    }

    public final void h(boolean z) {
        aC(8);
        this.i = z;
    }

    public final void i(Date date) {
        aC(2);
        this.c = date;
    }

    public final void j(Optional optional) {
        aC(1);
        this.b = optional;
    }
}
