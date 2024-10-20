package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxd implements fvd {
    final /* synthetic */ fxf a;
    private final long b;
    private final eqn c;
    private final eqn d;
    private boolean e;

    public fxd(fxf fxfVar, long j) {
        this.a = fxfVar;
        this.b = j;
        eqm eqmVar = new eqm();
        eqmVar.b("audio/raw");
        this.c = new eqn(eqmVar);
        eqm eqmVar2 = new eqm();
        eqmVar2.b("audio/raw");
        eqmVar2.C = 44100;
        eqmVar2.B = 2;
        eqmVar2.D = 2;
        this.d = new eqn(eqmVar2);
    }

    public final void a() {
        try {
            if (!this.e) {
                fxe i = this.a.i(this.d);
                if (i != null) {
                    this.e = true;
                    i.c.f.decrementAndGet();
                    if (i.c.h < ((alsx) r1.a).c - 1) {
                        i.d();
                        return;
                    }
                    return;
                }
                ((eui) this.a.c).b.postDelayed(new fhg(this, 17), 10L);
            }
        } catch (fwo e) {
            this.a.b(e);
        } catch (RuntimeException e2) {
            this.a.b(new fwo("Asset loader error", e2, 1000));
        }
    }

    @Override // defpackage.fvd
    public final alor e() {
        return altc.a;
    }

    @Override // defpackage.fvd
    public final void g() {
        this.a.a(this.b);
        this.a.c(1);
        this.a.d(this.c, 2);
        a();
    }

    @Override // defpackage.fvd
    public final int h(arjs arjsVar) {
        int i;
        if (true != this.e) {
            i = 0;
        } else {
            i = 99;
        }
        arjsVar.a = i;
        return 2;
    }

    @Override // defpackage.fvd
    public final void f() {
    }
}
