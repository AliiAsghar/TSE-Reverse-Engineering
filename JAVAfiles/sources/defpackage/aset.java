package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aset extends arwq implements arpt, arpe {
    public final arwb a;
    public final arpe b;
    public Object c;
    public final Object d;
    public final arve f;

    public aset(arwb arwbVar, arpe arpeVar) {
        super(-1);
        this.a = arwbVar;
        this.b = arpeVar;
        this.c = aseu.a;
        this.d = asfq.a(u());
        this.f = new arve(null, arvf.a);
    }

    public final void a(arpi arpiVar, Object obj) {
        this.c = obj;
        this.e = 1;
        this.a.h(arpiVar, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arpt, arpe] */
    @Override // defpackage.arpt
    public final arpt dJ() {
        return this.b;
    }

    @Override // defpackage.arwq
    public final Object o() {
        Object obj = this.c;
        boolean z = arwh.a;
        this.c = aseu.a;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.a + ", " + arwi.c(this.b) + "]";
    }

    @Override // defpackage.arpe
    public final arpi u() {
        return this.b.u();
    }

    @Override // defpackage.arpe
    public final void w(Object obj) {
        Object o = arro.o(obj);
        if (this.a.ey(u())) {
            this.c = o;
            this.e = 0;
            this.a.a(u(), this);
            return;
        }
        boolean z = arwh.a;
        ThreadLocal threadLocal = aryl.a;
        arwx a = aryl.a();
        if (a.p()) {
            this.c = o;
            this.e = 0;
            a.n(this);
            return;
        }
        a.o(true);
        try {
            arpi u = u();
            Object b = asfq.b(u, this.d);
            try {
                this.b.w(obj);
                do {
                } while (a.r());
            } finally {
                asfq.c(u, b);
            }
        } catch (Throwable th) {
            try {
                J(th);
            } finally {
                a.m(true);
            }
        }
    }

    @Override // defpackage.arpt
    public final void dK() {
    }

    @Override // defpackage.arwq
    public final arpe s() {
        return this;
    }
}
