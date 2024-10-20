package defpackage;

import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asmt {
    public static final byte[] a;
    public static final aslv b = aotl.au(new String[0]);
    public static final asmp c;
    public static final asrf d;
    public static final TimeZone e;
    public static final String f;
    private static final arus g;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        asqu asquVar = new asqu();
        asquVar.X(bArr);
        c = new asmo(null, 0L, asquVar);
        aotl.am(bArr);
        aotl aotlVar = asrf.c;
        asqx asqxVar = asqx.a;
        d = aotlVar.P(aotl.Q("efbbbf"), aotl.Q("feff"), aotl.Q("fffe"), aotl.Q("0000ffff"), aotl.Q("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        timeZone.getClass();
        e = timeZone;
        g = new arus("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = asme.class.getName();
        name.getClass();
        String G = arsd.G(name, "okhttp3.");
        if (arsd.P(G, "Client")) {
            G = G.substring(0, G.length() - "Client".length());
            G.getClass();
        }
        f = G;
    }

    public static /* synthetic */ int A(String str, char c2, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = str.length();
        }
        return a(str, c2, 0, i);
    }

    public static final boolean B(asrq asrqVar, TimeUnit timeUnit) {
        timeUnit.getClass();
        try {
            return w(asrqVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final void C(Exception exc, List list) {
        exc.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            armd.c(exc, (Exception) it.next());
        }
    }

    public static final int a(String str, char c2, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int b(String str, String str2, int i, int i2) {
        while (i < i2) {
            if (arsd.N(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int c(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (arro.a(charAt, 31) <= 0 || arro.a(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int d(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int e(String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final int f(char c2) {
        if (c2 >= '0' && c2 < ':') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 < 'g') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final int g(asqw asqwVar) {
        return y(asqwVar.d()) | (y(asqwVar.d()) << 16) | (y(asqwVar.d()) << 8);
    }

    public static final int h(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final long i(asmm asmmVar) {
        String b2 = asmmVar.f.b("Content-Length");
        if (b2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(b2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final String j(String str, Object... objArr) {
        int length = objArr.length;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        format.getClass();
        return format;
    }

    public static final String k(aslx aslxVar, boolean z) {
        String str;
        if (arsd.O(aslxVar.c, ":")) {
            str = "[" + aslxVar.c + "]";
        } else {
            str = aslxVar.c;
        }
        if (!z && aslxVar.d == aotl.ao(aslxVar.b)) {
            return str;
        }
        return str + ":" + aslxVar.d;
    }

    public static final String l(String str, int i, int i2) {
        int d2 = d(str, i, i2);
        String substring = str.substring(d2, e(str, d2, i2));
        substring.getClass();
        return substring;
    }

    @SafeVarargs
    public static final List m(Object... objArr) {
        objArr.getClass();
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = DesugarCollections.unmodifiableList(aqjn.B(Arrays.copyOf(objArr2, objArr2.length)));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final List n(List list) {
        List unmodifiableList = DesugarCollections.unmodifiableList(aqjn.az(list));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final aslv o(List list) {
        asuo asuoVar = new asuo((char[]) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            asoi asoiVar = (asoi) it.next();
            asuoVar.j(asoiVar.g.e(), asoiVar.h.e());
        }
        return asuoVar.h();
    }

    public static final void p(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void q(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (d.F(e3.getMessage(), "bio == null")) {
            } else {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean r(String str) {
        return g.b(str);
    }

    public static final boolean s(aslx aslxVar, aslx aslxVar2) {
        if (d.F(aslxVar.c, aslxVar2.c) && aslxVar.d == aslxVar2.d && d.F(aslxVar.b, aslxVar2.b)) {
            return true;
        }
        return false;
    }

    public static final boolean t(String[] strArr, String[] strArr2, Comparator comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator a2 = arrj.a(strArr2);
                while (a2.hasNext()) {
                    if (comparator.compare(str, (String) a2.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean u(Socket socket, asqw asqwVar) {
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z = !asqwVar.C();
                socket.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean v(String str) {
        str.getClass();
        if (arsd.x(str, "Authorization", true) || arsd.x(str, "Cookie", true) || arsd.x(str, "Proxy-Authorization", true) || arsd.x(str, "Set-Cookie", true)) {
            return true;
        }
        return false;
    }

    public static final boolean w(asrq asrqVar, int i, TimeUnit timeUnit) {
        long j;
        boolean z;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        if (asrqVar.a().g()) {
            j = asrqVar.a().h() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        asrqVar.a().j(Math.min(j, timeUnit.toNanos(i)) + nanoTime);
        try {
            asqu asquVar = new asqu();
            while (asrqVar.b(asquVar, 8192L) != -1) {
                asquVar.z();
            }
            z = true;
        } catch (InterruptedIOException unused) {
            z = false;
        } catch (Throwable th) {
            asrs a2 = asrqVar.a();
            if (j == Long.MAX_VALUE) {
                a2.m();
            } else {
                a2.j(nanoTime + j);
            }
            throw th;
        }
        if (j == Long.MAX_VALUE) {
            asrqVar.a().m();
        } else {
            asrqVar.a().j(nanoTime + j);
        }
        return z;
    }

    public static final String[] x(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int i = 0;
            while (true) {
                if (i >= strArr2.length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final int y(byte b2) {
        return b2 & 255;
    }

    public static final void z(long j, long j2) {
        if (j >= 0 && j >= j2) {
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
