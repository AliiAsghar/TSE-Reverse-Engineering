package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftx implements ftn {
    private fmq b;
    private boolean c;
    private int e;
    private int f;
    private final euf a = new euf(10);
    private long d = -9223372036854775807L;

    @Override // defpackage.ftn
    public final void a(euf eufVar) {
        dzg.h(this.b);
        if (!this.c) {
            return;
        }
        int b = eufVar.b();
        int i = this.f;
        if (i < 10) {
            int min = Math.min(b, 10 - i);
            System.arraycopy(eufVar.a, eufVar.b, this.a.a, this.f, min);
            if (this.f + min == 10) {
                this.a.J(0);
                if (this.a.j() == 73 && this.a.j() == 68 && this.a.j() == 51) {
                    this.a.K(3);
                    this.e = this.a.i() + 10;
                } else {
                    eub.f("Id3Reader", "Discarding invalid ID3 tag");
                    this.c = false;
                    return;
                }
            }
        }
        int min2 = Math.min(b, this.e - this.f);
        this.b.l(eufVar, min2);
        this.f += min2;
    }

    @Override // defpackage.ftn
    public final void b(flw flwVar, fuq fuqVar) {
        fuqVar.c();
        fmq p = flwVar.p(fuqVar.a(), 5);
        this.b = p;
        eqm eqmVar = new eqm();
        eqmVar.a = fuqVar.b();
        eqmVar.b("application/id3");
        p.h(new eqn(eqmVar));
    }

    @Override // defpackage.ftn
    public final void c(boolean z) {
        int i;
        boolean z2;
        dzg.h(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            if (this.d != -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            dzg.d(z2);
            this.b.n(this.d, 1, this.e, 0, null);
            this.c = false;
        }
    }

    @Override // defpackage.ftn
    public final void d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.d = j;
        this.e = 0;
        this.f = 0;
    }

    @Override // defpackage.ftn
    public final void e() {
        this.c = false;
        this.d = -9223372036854775807L;
    }
}
