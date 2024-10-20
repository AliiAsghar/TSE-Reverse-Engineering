package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fti implements ftn {
    public long a;
    private final euf b;
    private final String c;
    private final int d;
    private String e;
    private fmq f;
    private int g;
    private int h;
    private boolean i;
    private long j;
    private eqn k;
    private int l;
    private final fjl m;

    public fti() {
        this(null, 0);
    }

    @Override // defpackage.ftn
    public final void a(euf eufVar) {
        boolean z;
        boolean z2;
        dzg.h(this.f);
        while (eufVar.b() > 0) {
            int i = this.g;
            boolean z3 = true;
            if (i != 0) {
                if (i != 1) {
                    int min = Math.min(eufVar.b(), this.l - this.h);
                    this.f.l(eufVar, min);
                    int i2 = this.h + min;
                    this.h = i2;
                    if (i2 == this.l) {
                        if (this.a == -9223372036854775807L) {
                            z3 = false;
                        }
                        dzg.d(z3);
                        this.f.n(this.a, 1, this.l, 0, null);
                        this.a += this.j;
                        this.g = 0;
                    }
                } else {
                    byte[] bArr = this.b.a;
                    int min2 = Math.min(eufVar.b(), 16 - this.h);
                    eufVar.E(bArr, this.h, min2);
                    int i3 = this.h + min2;
                    this.h = i3;
                    if (i3 == 16) {
                        this.m.q(0);
                        akrq b = flc.b(this.m);
                        eqn eqnVar = this.k;
                        if (eqnVar == null || eqnVar.D != 2 || b.c != eqnVar.E || !"audio/ac4".equals(eqnVar.o)) {
                            eqm eqmVar = new eqm();
                            eqmVar.a = this.e;
                            eqmVar.b("audio/ac4");
                            eqmVar.B = 2;
                            eqmVar.C = b.c;
                            eqmVar.d = this.c;
                            eqmVar.f = this.d;
                            eqn eqnVar2 = new eqn(eqmVar);
                            this.k = eqnVar2;
                            this.f.h(eqnVar2);
                        }
                        this.l = b.a;
                        this.j = (b.b * 1000000) / this.k.E;
                        this.b.J(0);
                        this.f.l(this.b, 16);
                        this.g = 2;
                    }
                }
            } else {
                while (eufVar.b() > 0) {
                    if (!this.i) {
                        if (eufVar.j() == 172) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.i = z;
                    } else {
                        int j = eufVar.j();
                        if (j == 172) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.i = z2;
                        byte b2 = 64;
                        if (j != 64) {
                            if (j == 65) {
                                j = 65;
                            }
                        }
                        this.g = 1;
                        byte[] bArr2 = this.b.a;
                        bArr2[0] = -84;
                        if (j == 65) {
                            b2 = 65;
                        }
                        bArr2[1] = b2;
                        this.h = 2;
                    }
                }
            }
        }
    }

    @Override // defpackage.ftn
    public final void b(flw flwVar, fuq fuqVar) {
        fuqVar.c();
        this.e = fuqVar.b();
        this.f = flwVar.p(fuqVar.a(), 1);
    }

    @Override // defpackage.ftn
    public final void d(long j, int i) {
        this.a = j;
    }

    @Override // defpackage.ftn
    public final void e() {
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.a = -9223372036854775807L;
    }

    public fti(String str, int i) {
        fjl fjlVar = new fjl(new byte[16], (byte[]) null);
        this.m = fjlVar;
        this.b = new euf((byte[]) fjlVar.c);
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.a = -9223372036854775807L;
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.ftn
    public final void c(boolean z) {
    }
}
