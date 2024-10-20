package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class uuh {
    public static final ahtn a = new ahtn().b().a();
    public static final ahtn b = new ahtn().b().a().c("bugle_phenotype__");
    public static final alhr c = albo.D(new ubz(11));
    public static final Object d = new Object();
    public static final ArrayList e = new ArrayList();

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        uvl Qw();
    }

    public static void A(StringBuilder sb, boolean z, String str, Object obj) {
        sb.append(String.format(Locale.US, "%s: %s\n", str, obj));
        if (z) {
            sb.append("\n");
        }
    }

    public static void B(String str, double d2) {
        c(b, str, d2);
    }

    public static utz a(String str, long j) {
        return f(b, str, j);
    }

    public static utz b(String str, boolean z) {
        return i(b, str, z);
    }

    public static utz c(ahtn ahtnVar, String str, double d2) {
        utx utxVar;
        synchronized (d) {
            utxVar = new utx(ahtnVar.d(str, d2), Double.valueOf(d2));
            e.add(utxVar);
        }
        return utxVar;
    }

    public static utz d(ahtn ahtnVar, String str, float f) {
        utx utxVar;
        synchronized (d) {
            utxVar = new utx(ahtnVar.j(str, f), Float.valueOf(f));
            e.add(utxVar);
        }
        return utxVar;
    }

    public static utz e(ahtn ahtnVar, String str, int i) {
        utx utxVar;
        synchronized (d) {
            utxVar = new utx(ahtnVar.e(str, i), Integer.valueOf(i));
            e.add(utxVar);
        }
        return utxVar;
    }

    public static utz f(ahtn ahtnVar, String str, long j) {
        utx utxVar;
        synchronized (d) {
            utxVar = new utx(ahtnVar.f(str, j), Long.valueOf(j));
            e.add(utxVar);
        }
        return utxVar;
    }

    public static utz g(ahtn ahtnVar, String str, apeq apeqVar) {
        utx utxVar;
        synchronized (d) {
            utxVar = new utx(new ahtk(ahtnVar, str, apeqVar, new mdd(7)), apeqVar);
            e.add(utxVar);
        }
        return utxVar;
    }

    public static utz h(ahtn ahtnVar, String str, String str2) {
        utx utxVar;
        synchronized (d) {
            utxVar = new utx(new ahti(ahtnVar, str, str2, false), str2);
            e.add(utxVar);
        }
        return utxVar;
    }

    public static utz i(ahtn ahtnVar, String str, boolean z) {
        utx utxVar;
        synchronized (d) {
            utxVar = new utx(ahtnVar.g(str, z), Boolean.valueOf(z));
            e.add(utxVar);
        }
        return utxVar;
    }

    public static utz j(ahtn ahtnVar, String str, float f) {
        uud uudVar;
        synchronized (d) {
            uudVar = new uud(ahtnVar.j(str, f), Float.valueOf(f));
            e.add(uudVar);
        }
        return uudVar;
    }

    public static utz k(ahtn ahtnVar, String str, int i) {
        uud uudVar;
        synchronized (d) {
            uudVar = new uud(ahtnVar.e(str, i), Integer.valueOf(i));
            e.add(uudVar);
        }
        return uudVar;
    }

    public static utz l(ahtn ahtnVar, String str, long j) {
        uud uudVar;
        synchronized (d) {
            uudVar = new uud(ahtnVar.f(str, j), Long.valueOf(j));
            e.add(uudVar);
        }
        return uudVar;
    }

    public static utz m(ahtn ahtnVar, String str, String str2) {
        uud uudVar;
        synchronized (d) {
            uudVar = new uud(new ahti(ahtnVar, str, str2, false), str2);
            e.add(uudVar);
        }
        return uudVar;
    }

    public static utz n(ahtn ahtnVar, String str, boolean z) {
        uud uudVar;
        synchronized (d) {
            uudVar = new uud(ahtnVar.g(str, z), Boolean.valueOf(z));
            e.add(uudVar);
        }
        return uudVar;
    }

    @Deprecated
    public static utz o(int i) {
        return n(b, defpackage.a.bV(i, "bug_"), true);
    }

    @Deprecated
    public static utz p(int i, String str) {
        return n(b, "bug_" + i + "_" + str, true);
    }

    @Deprecated
    public static utz q(int i) {
        return i(b, defpackage.a.bV(i, "bug_"), true);
    }

    @Deprecated
    public static utz r(int i, String str) {
        return i(b, "bug_" + i + "_" + str, true);
    }

    public static uue s(ahtn ahtnVar, String str, alhr alhrVar) {
        uue uueVar;
        synchronized (d) {
            uueVar = new uue(new mun(ahtnVar, str, alhrVar, 2));
            e.add(uueVar);
        }
        return uueVar;
    }

    public static uuf t(ahtn ahtnVar, String str, byte[] bArr) {
        uud uudVar;
        synchronized (d) {
            uudVar = new uud(new ahtj(ahtnVar, str, bArr), bArr);
            e.add(uudVar);
        }
        return uudVar;
    }

    public static uuf u(ahtn ahtnVar, String str, Object obj, ahtm ahtmVar) {
        uud uudVar;
        synchronized (d) {
            uudVar = new uud(new ahtk(ahtnVar, str, obj, ahtmVar), obj);
            e.add(uudVar);
        }
        return uudVar;
    }

    public static alhr v(int i) {
        return albo.D(new fep(i, 4));
    }

    public static alhr w(String str) {
        return albo.D(new uqw(str, 13));
    }

    public static alhr x(int i, String str) {
        return albo.D(new mso(i, str, 7));
    }

    public static alhr y(String str) {
        return albo.D(new uqw(str, 14));
    }

    public static alhr z(int i, String str) {
        return albo.D(new mso(i, str, 6));
    }
}
