package defpackage;

import com.android.vcard.VCardBuilder;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asog implements asnt {
    public final asme a;
    public final asnj b;
    public final asqw c;
    public final asqv d;
    public int e;
    public final asnz f;
    public aslv g;

    public asog(asme asmeVar, asnj asnjVar, asqw asqwVar, asqv asqvVar) {
        this.a = asmeVar;
        this.b = asnjVar;
        this.c = asqwVar;
        this.d = asqvVar;
        this.f = new asnz(asqwVar);
    }

    public static final void l(asra asraVar) {
        asrs asrsVar = asraVar.a;
        asraVar.a = asrs.j;
        asrsVar.m();
        asrsVar.i();
    }

    private static final boolean m(asmm asmmVar) {
        return arsd.x("chunked", asmm.b(asmmVar, "Transfer-Encoding"), true);
    }

    @Override // defpackage.asnt
    public final long a(asmm asmmVar) {
        if (!asnu.b(asmmVar)) {
            return 0L;
        }
        if (m(asmmVar)) {
            return -1L;
        }
        return asmt.i(asmmVar);
    }

    @Override // defpackage.asnt
    public final asml b(boolean z) {
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(a.bV(i, "state: "));
        }
        try {
            asny ae = aotl.ae(this.f.a());
            asml asmlVar = new asml();
            asmlVar.d(ae.a);
            asmlVar.b = ae.b;
            asmlVar.c = ae.c;
            asmlVar.c(this.f.b());
            if (z && ae.b == 100) {
                return null;
            }
            int i2 = ae.b;
            if (i2 != 100 && (i2 < 102 || i2 >= 200)) {
                this.e = 4;
                return asmlVar;
            }
            this.e = 3;
            return asmlVar;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.a.a.h.e()), e);
        }
    }

    @Override // defpackage.asnt
    public final asnj c() {
        return this.b;
    }

    @Override // defpackage.asnt
    public final asro d(asmh asmhVar, long j) {
        if (arsd.x("chunked", asmhVar.a("Transfer-Encoding"), true)) {
            int i = this.e;
            if (i == 1) {
                this.e = 2;
                return new asob(this);
            }
            throw new IllegalStateException(a.bV(i, "state: "));
        }
        if (j != -1) {
            int i2 = this.e;
            if (i2 == 1) {
                this.e = 2;
                return new asoe(this);
            }
            throw new IllegalStateException(a.bV(i2, "state: "));
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // defpackage.asnt
    public final asrq e(asmm asmmVar) {
        if (!asnu.b(asmmVar)) {
            return j(0L);
        }
        if (m(asmmVar)) {
            asmh asmhVar = asmmVar.a;
            int i = this.e;
            if (i == 4) {
                aslx aslxVar = asmhVar.a;
                this.e = 5;
                return new asoc(this, aslxVar);
            }
            throw new IllegalStateException(a.bV(i, "state: "));
        }
        long i2 = asmt.i(asmmVar);
        if (i2 != -1) {
            return j(i2);
        }
        int i3 = this.e;
        if (i3 == 4) {
            this.e = 5;
            this.b.e();
            return new asof(this);
        }
        throw new IllegalStateException(a.bV(i3, "state: "));
    }

    @Override // defpackage.asnt
    public final void f() {
        this.b.b();
    }

    @Override // defpackage.asnt
    public final void g() {
        this.d.flush();
    }

    @Override // defpackage.asnt
    public final void h() {
        this.d.flush();
    }

    @Override // defpackage.asnt
    public final void i(asmh asmhVar) {
        Proxy.Type type = this.b.a.b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(asmhVar.b);
        sb.append(' ');
        if (!asmhVar.a.h && type == Proxy.Type.HTTP) {
            sb.append(asmhVar.a);
        } else {
            sb.append(aotl.af(asmhVar.a));
        }
        sb.append(" HTTP/1.1");
        k(asmhVar.c, sb.toString());
    }

    public final asrq j(long j) {
        int i = this.e;
        if (i == 4) {
            this.e = 5;
            return new asod(this, j);
        }
        throw new IllegalStateException(a.bV(i, "state: "));
    }

    public final void k(aslv aslvVar, String str) {
        int i = this.e;
        if (i == 0) {
            asqv asqvVar = this.d;
            asqvVar.Z(str);
            asqvVar.Z(VCardBuilder.VCARD_END_OF_LINE);
            int a = aslvVar.a();
            for (int i2 = 0; i2 < a; i2++) {
                asqv asqvVar2 = this.d;
                asqvVar2.Z(aslvVar.c(i2));
                asqvVar2.Z(": ");
                asqvVar2.Z(aslvVar.d(i2));
                asqvVar2.Z(VCardBuilder.VCARD_END_OF_LINE);
            }
            this.d.Z(VCardBuilder.VCARD_END_OF_LINE);
            this.e = 1;
            return;
        }
        throw new IllegalStateException(a.bV(i, "state: "));
    }
}
