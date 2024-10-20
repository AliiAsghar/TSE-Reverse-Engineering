package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aozl extends aoyt {
    private static final Logger a = Logger.getLogger(aozl.class.getName());
    public static final boolean e = apdb.b;
    public aojj f;

    public static int G(int i, aozb aozbVar) {
        return Z(i) + H(aozbVar);
    }

    public static int H(aozb aozbVar) {
        return P(aozbVar.d());
    }

    public static int I(int i, int i2) {
        return Z(i) + L(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int J(int i, apbt apbtVar, apcj apcjVar) {
        int Z = Z(i);
        return Z + Z + ((aoyj) apbtVar).getSerializedSize(apcjVar);
    }

    public static int K(int i, int i2) {
        return Z(i) + L(i2);
    }

    public static int L(int i) {
        return ad(i);
    }

    public static int M(int i, long j) {
        return Z(i) + ad(j);
    }

    public static int N(int i, apbg apbgVar) {
        return Z(i) + O(apbgVar);
    }

    public static int O(apbg apbgVar) {
        int i;
        if (apbgVar.b != null) {
            i = apbgVar.b.d();
        } else if (apbgVar.a != null) {
            i = apbgVar.a.getSerializedSize();
        } else {
            i = 0;
        }
        return P(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int P(int i) {
        return ab(i) + i;
    }

    public static int Q(apbt apbtVar) {
        return P(apbtVar.getSerializedSize());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int R(apbt apbtVar, apcj apcjVar) {
        return P(((aoyj) apbtVar).getSerializedSize(apcjVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int S(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int T(int i, int i2) {
        return Z(i) + U(i2);
    }

    public static int U(int i) {
        return ab(ae(i));
    }

    public static int V(int i, long j) {
        return Z(i) + W(j);
    }

    public static int W(long j) {
        return ad(af(j));
    }

    public static int X(int i, String str) {
        return Z(i) + Y(str);
    }

    public static int Y(String str) {
        int length;
        try {
            length = apdd.b(str);
        } catch (apdc unused) {
            length = str.getBytes(apay.a).length;
        }
        return P(length);
    }

    public static int Z(int i) {
        return ab(apdh.c(i, 0));
    }

    public static int aa(int i, int i2) {
        return Z(i) + ab(i2);
    }

    public static int ab(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int ac(int i, long j) {
        return Z(i) + ad(j);
    }

    public static int ad(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int ae(int i) {
        return (i >> 31) ^ (i + i);
    }

    public static long af(long j) {
        return (j >> 63) ^ (j + j);
    }

    public static aozl ag(byte[] bArr) {
        return new aozj(bArr, 0, bArr.length);
    }

    public static int as(int i) {
        return Z(i) + 1;
    }

    public static int at(int i) {
        return Z(i) + 8;
    }

    public static int au(int i) {
        return Z(i) + 4;
    }

    public static int av(int i) {
        return Z(i) + 8;
    }

    public static int aw(int i) {
        return Z(i) + 4;
    }

    public static int ax(int i) {
        return Z(i) + 4;
    }

    public static int ay(int i) {
        return Z(i) + 8;
    }

    public abstract void A(int i, int i2);

    public abstract void B(int i, int i2);

    public abstract void C(int i);

    public abstract void D(int i, long j);

    public abstract void E(long j);

    public abstract void F(byte[] bArr, int i);

    @Override // defpackage.aoyt
    public abstract void a(byte[] bArr, int i, int i2);

    public final void ah() {
        if (b() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ai(String str, apdc apdcVar) {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) apdcVar);
        byte[] bytes = str.getBytes(apay.a);
        try {
            int length = bytes.length;
            C(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new aozk(e2);
        }
    }

    public final void aj(int i, double d) {
        q(i, Double.doubleToRawLongBits(d));
    }

    public final void ak(double d) {
        r(Double.doubleToRawLongBits(d));
    }

    public final void al(int i, float f) {
        o(i, Float.floatToRawIntBits(f));
    }

    public final void am(float f) {
        p(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void an(apbt apbtVar) {
        apbtVar.writeTo(this);
    }

    public final void ao(int i, int i2) {
        B(i, ae(i2));
    }

    public final void ap(int i) {
        C(ae(i));
    }

    public final void aq(int i, long j) {
        D(i, af(j));
    }

    public final void ar(long j) {
        E(af(j));
    }

    public abstract int b();

    public abstract void i();

    public abstract void j(byte b);

    public abstract void l(int i, boolean z);

    public abstract void m(int i, aozb aozbVar);

    public abstract void n(aozb aozbVar);

    public abstract void o(int i, int i2);

    public abstract void p(int i);

    public abstract void q(int i, long j);

    public abstract void r(long j);

    public abstract void s(int i, int i2);

    public abstract void t(int i);

    public abstract void u(int i, apbt apbtVar, apcj apcjVar);

    public abstract void v(apbt apbtVar);

    public abstract void w(int i, apbt apbtVar);

    public abstract void x(int i, aozb aozbVar);

    public abstract void y(int i, String str);

    public abstract void z(String str);
}
