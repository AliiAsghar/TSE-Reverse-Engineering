package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arwq extends asga {
    public int e;

    public arwq(int i) {
        super(0L, false);
        this.e = i;
    }

    public final void J(Throwable th) {
        arro.m(s().u(), new arwg(a.cc(this, "Fatal exception in coroutines machinery for ", ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"), th));
    }

    public abstract Object o();

    public Throwable r(Object obj) {
        arvx arvxVar;
        if (obj instanceof arvx) {
            arvxVar = (arvx) obj;
        } else {
            arvxVar = null;
        }
        if (arvxVar == null) {
            return null;
        }
        return arvxVar.b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [arpt, arpe] */
    @Override // java.lang.Runnable
    public final void run() {
        aryq aryqVar;
        boolean z = arwh.a;
        try {
            aset asetVar = (aset) s();
            ?? r1 = asetVar.b;
            Object obj = asetVar.d;
            arpi u = r1.u();
            Object b = asfq.b(u, obj);
            arxm arxmVar = null;
            if (b != asfq.a) {
                aryqVar = arwa.c(r1, u, b);
            } else {
                aryqVar = null;
            }
            try {
                arpi u2 = r1.u();
                Object o = o();
                Throwable r = r(o);
                if (r == null && d.A(this.e)) {
                    arxmVar = (arxm) u2.get(arxm.c);
                }
                if (arxmVar != null && !arxmVar.x()) {
                    Throwable r2 = arxmVar.r();
                    G(r2);
                    if (arwh.b) {
                        r2 = asfm.a(r2, r1);
                    }
                    r1.w(aqil.O(r2));
                } else if (r != null) {
                    r1.w(aqil.O(r));
                } else {
                    r1.w(n(o));
                }
                if (aryqVar != null && !aryqVar.f()) {
                    return;
                }
                asfq.c(u, b);
            } catch (Throwable th) {
                if (aryqVar == null || aryqVar.f()) {
                    asfq.c(u, b);
                }
                throw th;
            }
        } catch (Throwable th2) {
            J(th2);
        }
    }

    public abstract arpe s();

    public void G(Throwable th) {
    }

    public Object n(Object obj) {
        return obj;
    }
}
