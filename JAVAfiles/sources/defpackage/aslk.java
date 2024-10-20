package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aslk {
    public static final aslk a;
    public static final aslk b;
    private static final asli[] g;
    private static final asli[] h;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final String[] f;

    static {
        asli asliVar = asli.q;
        asli asliVar2 = asli.r;
        asli asliVar3 = asli.j;
        asli asliVar4 = asli.l;
        asli asliVar5 = asli.k;
        asli asliVar6 = asli.m;
        asli asliVar7 = asli.o;
        asli asliVar8 = asli.n;
        asli[] asliVarArr = {asli.p, asliVar, asliVar2, asliVar3, asliVar4, asliVar5, asliVar6, asliVar7, asliVar8};
        g = asliVarArr;
        asli[] asliVarArr2 = {asli.p, asliVar, asliVar2, asliVar3, asliVar4, asliVar5, asliVar6, asliVar7, asliVar8, asli.h, asli.i, asli.f, asli.g, asli.d, asli.e, asli.c};
        h = asliVarArr2;
        aslj asljVar = new aslj(true);
        asljVar.e((asli[]) Arrays.copyOf(asliVarArr, 9));
        asljVar.f(asmr.a, asmr.b);
        asljVar.c();
        asljVar.a();
        aslj asljVar2 = new aslj(true);
        asljVar2.e((asli[]) Arrays.copyOf(asliVarArr2, 16));
        asljVar2.f(asmr.a, asmr.b);
        asljVar2.c();
        a = asljVar2.a();
        aslj asljVar3 = new aslj(true);
        asljVar3.e((asli[]) Arrays.copyOf(asliVarArr2, 16));
        asljVar3.f(asmr.a, asmr.b, asmr.c, asmr.d);
        asljVar3.c();
        asljVar3.a();
        b = new aslj(false).a();
    }

    public aslk(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = strArr2;
    }

    public final List a() {
        String[] strArr = this.e;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(asli.t.D(str));
            }
            return aqjn.ax(arrayList);
        }
        return null;
    }

    public final List b() {
        String[] strArr = this.f;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                asmr asmrVar = asmr.a;
                arrayList.add(aotl.al(str));
            }
            return aqjn.ax(arrayList);
        }
        return null;
    }

    public final boolean c(SSLSocket sSLSocket) {
        if (!this.c) {
            return false;
        }
        String[] strArr = this.f;
        if (strArr != null && !asmt.t(strArr, sSLSocket.getEnabledProtocols(), aroz.b)) {
            return false;
        }
        String[] strArr2 = this.e;
        if (strArr2 != null && !asmt.t(strArr2, sSLSocket.getEnabledCipherSuites(), asli.a)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aslk)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.c;
        aslk aslkVar = (aslk) obj;
        if (z != aslkVar.c) {
            return false;
        }
        if (z && (!Arrays.equals(this.e, aslkVar.e) || !Arrays.equals(this.f, aslkVar.f) || this.d != aslkVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        if (this.c) {
            String[] strArr = this.e;
            int i2 = 0;
            if (strArr != null) {
                i = Arrays.hashCode(strArr);
            } else {
                i = 0;
            }
            String[] strArr2 = this.f;
            if (strArr2 != null) {
                i2 = Arrays.hashCode(strArr2);
            }
            return ((((i + 527) * 31) + i2) * 31) + (!this.d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.c) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(b(), "[all enabled]") + ", supportsTlsExtensions=" + this.d + ")";
    }
}
