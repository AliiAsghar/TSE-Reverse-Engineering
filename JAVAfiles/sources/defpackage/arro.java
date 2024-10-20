package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arro {
    private arro() {
    }

    public static final long A(long j, long j2) {
        return j & (~j2);
    }

    public static final long B(long j, int i) {
        return A(j, 1073741823L) | i;
    }

    public static final void C(int i) {
        if (i > 0) {
        } else {
            throw new IllegalArgumentException(a.bV(i, "Expected positive parallelism level, but got "));
        }
    }

    public static final void D(arpi arpiVar, Throwable th) {
        Iterator it = aseq.a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(arpiVar, th);
            } catch (asev unused) {
                return;
            } catch (Throwable th2) {
                aseq.a(l(th, th2));
            }
        }
        try {
            armd.c(th, new ases(arpiVar));
        } catch (Throwable unused2) {
        }
        aseq.a(th);
    }

    public static final ListenableFuture E(arwl arwlVar) {
        aseh asehVar = new aseh(arwlVar);
        arwlVar.s(new akko(asehVar, arwlVar, 5, null));
        return asehVar;
    }

    public static final Object F(ListenableFuture listenableFuture, arpe arpeVar) {
        try {
            if (listenableFuture.isDone()) {
                return d.p(listenableFuture);
            }
            arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
            arvpVar.A();
            listenableFuture.c(new asek(listenableFuture, arvpVar), andi.a);
            arvpVar.d(new arnd(listenableFuture, 8));
            Object l = arvpVar.l();
            if (l == arpl.a) {
                arpeVar.getClass();
            }
            return l;
        } catch (ExecutionException e) {
            throw G(e);
        }
    }

    public static final Throwable G(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }

    public static final arwl H(ListenableFuture listenableFuture) {
        arvv arvvVar;
        if (listenableFuture.isDone()) {
            try {
                return arrn.D(d.p(listenableFuture));
            } catch (CancellationException e) {
                arvvVar = new arvv();
                arvvVar.v(e);
                return arvvVar;
            } catch (ExecutionException e2) {
                arvvVar = new arvv();
                arvvVar.b(G(e2));
                return arvvVar;
            }
        }
        arvv arvvVar2 = new arvv();
        albo.bR(listenableFuture, new xch(arvvVar2, 8), andi.a);
        arvvVar2.s(new arnd(listenableFuture, 7));
        return new asej(arvvVar2);
    }

    public static /* synthetic */ ListenableFuture I(arwe arweVar, arqv arqvVar) {
        arpj arpjVar = arpj.a;
        arwf arwfVar = arwf.a;
        if (!arwfVar.b()) {
            asei aseiVar = new asei(arwa.b(arweVar, arpjVar));
            arwfVar.a(arqvVar, aseiVar, aseiVar);
            return aseiVar.b;
        }
        Objects.toString(arwfVar);
        throw new IllegalArgumentException(String.valueOf(arwfVar).concat(" start is not supported"));
    }

    public static /* synthetic */ asai J(asdv asdvVar, arpi arpiVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            arpiVar = arpj.a;
        }
        if ((i3 & 2) != 0) {
            i = -3;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return asdvVar.hp(arpiVar, i, i2);
    }

    private static final void K(arpe arpeVar, Throwable th) {
        arpeVar.w(aqil.O(th));
        throw th;
    }

    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i != i2) {
            return 1;
        }
        return 0;
    }

    public static void b(String str) {
        arna arnaVar = new arna(a.bW(str, "lateinit property ", " has not been initialized"));
        d(arnaVar, arro.class.getName());
        throw arnaVar;
    }

    public static boolean c(Float f, float f2) {
        if (f != null && f.floatValue() == f2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (true == str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static final void e(Object obj, ArrayList arrayList) {
        Object[] objArr;
        int length;
        if (obj != null && (length = (objArr = (Object[]) obj).length) > 0) {
            arrayList.ensureCapacity(arrayList.size() + length);
            Collections.addAll(arrayList, objArr);
        }
    }

    public static final aruo f(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new arup(matcher, charSequence);
    }

    public static final boolean g(char c) {
        if (!Character.isWhitespace(c) && !Character.isSpaceChar(c)) {
            return false;
        }
        return true;
    }

    public static char h(int i) {
        if (new artb(0, 9).e(i)) {
            return (char) (i + 48);
        }
        throw new IllegalArgumentException(a.cb(i, "Int ", " is not a decimal digit"));
    }

    public static final void i(int i) {
        if (new artb(2, 36).e(i)) {
            return;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new artb(2, 36));
    }

    public static final int j(char c) {
        return Character.digit((int) c, 10);
    }

    public static boolean k(char c, char c2) {
        if (c == c2) {
            return true;
        }
        return false;
    }

    public static final Throwable l(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        armd.c(runtimeException, th);
        return runtimeException;
    }

    public static final void m(arpi arpiVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) arpiVar.get(CoroutineExceptionHandler.c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(arpiVar, th);
            } else {
                D(arpiVar, th);
            }
        } catch (Throwable th2) {
            D(arpiVar, l(th, th2));
        }
    }

    public static final Object n(Object obj, arpe arpeVar) {
        if (obj instanceof arvx) {
            Throwable th = ((arvx) obj).b;
            if (arwh.b && (arpeVar instanceof arpt)) {
                th = asfm.a(th, (arpt) arpeVar);
            }
            return aqil.O(th);
        }
        return obj;
    }

    public static final Object o(Object obj) {
        Throwable c = armq.c(obj);
        if (c == null) {
            return obj;
        }
        return new arvx(c);
    }

    public static final Object q(arpi arpiVar, arqv arqvVar, arpe arpeVar) {
        Object b;
        arpi u = arpeVar.u();
        arpi a = arwa.a(u, arpiVar);
        arwi.y(a);
        if (a == u) {
            asfk asfkVar = new asfk(a, arpeVar);
            b = arsd.ay(asfkVar, asfkVar, arqvVar);
        } else if (d.F(a.get(arpf.k), u.get(arpf.k))) {
            aryq aryqVar = new aryq(a, arpeVar);
            arpi arpiVar2 = ((arvg) aryqVar).a;
            Object b2 = asfq.b(arpiVar2, null);
            try {
                Object ay = arsd.ay(aryqVar, aryqVar, arqvVar);
                asfq.c(arpiVar2, b2);
                b = ay;
            } catch (Throwable th) {
                asfq.c(arpiVar2, b2);
                throw th;
            }
        } else {
            arwp arwpVar = new arwp(a, arpeVar);
            u(arqvVar, arwpVar, arwpVar);
            arvc arvcVar = arwpVar.b;
            while (true) {
                int i = arvcVar.b;
                if (i != 0) {
                    if (i == 2) {
                        b = arxx.b(arwpVar.G());
                        if (b instanceof arvx) {
                            throw ((arvx) b).b;
                        }
                    } else {
                        throw new IllegalStateException("Already suspended");
                    }
                } else if (arwpVar.b.c(0, 1)) {
                    b = arpl.a;
                    break;
                }
            }
        }
        if (b == arpl.a) {
            arpeVar.getClass();
        }
        return b;
    }

    public static final arwl r(arwe arweVar, arpi arpiVar, arwf arwfVar, arqv arqvVar) {
        arvg arvgVar;
        arpi b = arwa.b(arweVar, arpiVar);
        if (arwfVar.b()) {
            arvgVar = new arxy(b, arqvVar);
        } else {
            arvgVar = new arvg(b, true);
        }
        arwfVar.a(arqvVar, arvgVar, arvgVar);
        return arvgVar;
    }

    public static final arxm s(arwe arweVar, arpi arpiVar, arwf arwfVar, arqv arqvVar) {
        arvg aryhVar;
        arpi b = arwa.b(arweVar, arpiVar);
        if (arwfVar.b()) {
            aryhVar = new arxz(b, arqvVar);
        } else {
            aryhVar = new aryh(b, true);
        }
        arwfVar.a(arqvVar, aryhVar, aryhVar);
        return aryhVar;
    }

    public static final void t(arpe arpeVar, arpe arpeVar2) {
        try {
            aseu.a(arhi.i(arpeVar), arnb.a);
        } catch (Throwable th) {
            K(arpeVar2, th);
        }
    }

    public static final void u(arqv arqvVar, Object obj, arpe arpeVar) {
        try {
            aseu.a(arhi.i(arhi.h(arqvVar, obj, arpeVar)), arnb.a);
        } catch (Throwable th) {
            K(arpeVar, th);
        }
    }

    public static final int v(String str, int i, int i2, int i3) {
        return (int) w(str, i, i2, i3);
    }

    public static final long w(String str, long j, long j2, long j3) {
        String a = asfo.a(str);
        if (a == null) {
            return j;
        }
        Long v = arsd.v(a);
        if (v != null) {
            long longValue = v.longValue();
            if (j2 <= longValue && longValue <= j3) {
                return longValue;
            }
            throw new IllegalStateException("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + "'");
        }
        throw new IllegalStateException(a.bZ(a, str, "System property '", "' has unrecognized value '", "'"));
    }

    public static final boolean x(String str, boolean z) {
        String a = asfo.a(str);
        if (a != null) {
            return Boolean.parseBoolean(a);
        }
        return z;
    }

    public static /* synthetic */ int y(String str, int i, int i2, int i3, int i4) {
        int i5;
        if ((i4 & 4) != 0) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        int i6 = i2 | (i5 ^ 1);
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return v(str, i, i6, i3);
    }
}
