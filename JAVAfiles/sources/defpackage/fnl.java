package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fnl extends fnk {
    private final euf a;
    private final euf b;
    private int c;
    private boolean e;
    private boolean f;
    private int g;

    public fnl(fmq fmqVar) {
        super(fmqVar);
        this.a = new euf(euw.a);
        this.b = new euf(4);
    }

    @Override // defpackage.fnk
    protected final boolean a(euf eufVar) {
        int j = eufVar.j();
        int i = j >> 4;
        int i2 = j & 15;
        if (i2 == 7) {
            this.g = i;
            if (i != 5) {
                return true;
            }
            return false;
        }
        throw new fnj(a.bV(i2, "Video format not supported: "));
    }

    @Override // defpackage.fnk
    protected final boolean b(euf eufVar, long j) {
        int i;
        int i2;
        int j2 = eufVar.j();
        byte[] bArr = eufVar.a;
        int i3 = eufVar.b;
        int i4 = i3 + 1;
        eufVar.b = i4;
        int i5 = bArr[i3] & 255;
        int i6 = i3 + 2;
        eufVar.b = i6;
        int i7 = bArr[i4] & 255;
        eufVar.b = i3 + 3;
        int i8 = bArr[i6] & 255;
        if (j2 == 0) {
            if (!this.e) {
                euf eufVar2 = new euf(new byte[eufVar.b()]);
                eufVar.E(eufVar2.a, 0, eufVar.b());
                fld a = fld.a(eufVar2);
                this.c = a.b;
                eqm eqmVar = new eqm();
                eqmVar.b("video/avc");
                eqmVar.j = a.l;
                eqmVar.t = a.c;
                eqmVar.u = a.d;
                eqmVar.x = a.k;
                eqmVar.p = a.a;
                this.d.h(new eqn(eqmVar));
                this.e = true;
                return false;
            }
        } else if (j2 == 1 && this.e) {
            if (this.g == 1) {
                i = 1;
            } else {
                i = 0;
            }
            if (!this.f) {
                if (i != 0) {
                    i2 = 1;
                }
            } else {
                i2 = i;
            }
            byte[] bArr2 = this.b.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i9 = 4 - this.c;
            int i10 = 0;
            while (eufVar.b() > 0) {
                eufVar.E(this.b.a, i9, this.c);
                this.b.J(0);
                euf eufVar3 = this.b;
                euf eufVar4 = this.a;
                int m = eufVar3.m();
                eufVar4.J(0);
                this.d.l(this.a, 4);
                this.d.l(eufVar, m);
                i10 = i10 + 4 + m;
            }
            this.d.n(j + ((((i5 << 24) >> 8) | (i7 << 8) | i8) * 1000), i2, i10, 0, null);
            this.f = true;
            return true;
        }
        return false;
    }
}
