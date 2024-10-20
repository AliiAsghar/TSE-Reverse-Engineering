package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftz implements ftn {
    private final euf a;
    private final fmf b;
    private final String c;
    private final int d;
    private fmq e;
    private String f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private long k;
    private int l;
    private long m;

    public ftz() {
        this(null, 0);
    }

    @Override // defpackage.ftn
    public final void a(euf eufVar) {
        boolean z;
        boolean z2;
        dzg.h(this.e);
        while (eufVar.b() > 0) {
            int i = this.g;
            boolean z3 = true;
            if (i != 0) {
                if (i != 1) {
                    int min = Math.min(eufVar.b(), this.l - this.h);
                    this.e.l(eufVar, min);
                    int i2 = this.h + min;
                    this.h = i2;
                    if (i2 >= this.l) {
                        if (this.m == -9223372036854775807L) {
                            z3 = false;
                        }
                        dzg.d(z3);
                        this.e.n(this.m, 1, this.l, 0, null);
                        this.m += this.k;
                        this.h = 0;
                        this.g = 0;
                    }
                } else {
                    int min2 = Math.min(eufVar.b(), 4 - this.h);
                    eufVar.E(this.a.a, this.h, min2);
                    int i3 = this.h + min2;
                    this.h = i3;
                    if (i3 >= 4) {
                        this.a.J(0);
                        if (!this.b.a(this.a.e())) {
                            this.h = 0;
                            this.g = 1;
                        } else {
                            this.l = this.b.c;
                            if (!this.i) {
                                this.k = (r0.g * 1000000) / r0.d;
                                eqm eqmVar = new eqm();
                                eqmVar.a = this.f;
                                eqmVar.b(this.b.b);
                                eqmVar.n = 4096;
                                fmf fmfVar = this.b;
                                eqmVar.B = fmfVar.e;
                                eqmVar.C = fmfVar.d;
                                eqmVar.d = this.c;
                                eqmVar.f = this.d;
                                this.e.h(new eqn(eqmVar));
                                this.i = true;
                            }
                            this.a.J(0);
                            this.e.l(this.a, 4);
                            this.g = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = eufVar.a;
                int i4 = eufVar.b;
                int i5 = eufVar.c;
                while (true) {
                    if (i4 < i5) {
                        int i6 = i4 + 1;
                        byte b = bArr[i4];
                        if ((b & 255) == 255) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (this.j && (b & 224) == 224) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.j = z;
                        if (z2) {
                            eufVar.J(i6);
                            this.j = false;
                            this.a.a[1] = bArr[i4];
                            this.h = 2;
                            this.g = 1;
                            break;
                        }
                        i4 = i6;
                    } else {
                        eufVar.J(i5);
                        break;
                    }
                }
            }
        }
    }

    @Override // defpackage.ftn
    public final void b(flw flwVar, fuq fuqVar) {
        fuqVar.c();
        this.f = fuqVar.b();
        this.e = flwVar.p(fuqVar.a(), 1);
    }

    @Override // defpackage.ftn
    public final void d(long j, int i) {
        this.m = j;
    }

    @Override // defpackage.ftn
    public final void e() {
        this.g = 0;
        this.h = 0;
        this.j = false;
        this.m = -9223372036854775807L;
    }

    public ftz(String str, int i) {
        this.g = 0;
        euf eufVar = new euf(4);
        this.a = eufVar;
        eufVar.a[0] = -1;
        this.b = new fmf();
        this.m = -9223372036854775807L;
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.ftn
    public final void c(boolean z) {
    }
}
