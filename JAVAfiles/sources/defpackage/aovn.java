package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aovn {
    public static void c() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ apcp d(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (apcp) s;
    }

    public static void e(String str, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        apcp apcpVar = (apcp) aozyVar.b;
        apcp apcpVar2 = apcp.a;
        apcpVar.b = str;
    }

    public static void f(aozb aozbVar, ArrayDeque arrayDeque) {
        if (aozbVar.h()) {
            int s = s(aozbVar.d());
            int c = apci.c(s + 1);
            if (!arrayDeque.isEmpty() && ((aozb) arrayDeque.peek()).d() < c) {
                int c2 = apci.c(s);
                aozb aozbVar2 = (aozb) arrayDeque.pop();
                while (!arrayDeque.isEmpty() && ((aozb) arrayDeque.peek()).d() < c2) {
                    aozbVar2 = new apci((aozb) arrayDeque.pop(), aozbVar2);
                }
                apci apciVar = new apci(aozbVar2, aozbVar);
                while (!arrayDeque.isEmpty()) {
                    if (((aozb) arrayDeque.peek()).d() >= apci.c(s(apciVar.d) + 1)) {
                        break;
                    } else {
                        apciVar = new apci((aozb) arrayDeque.pop(), apciVar);
                    }
                }
                arrayDeque.push(apciVar);
                return;
            }
            arrayDeque.push(aozbVar);
            return;
        }
        if (aozbVar instanceof apci) {
            apci apciVar2 = (apci) aozbVar;
            int[] iArr = apci.a;
            f(apciVar2.e, arrayDeque);
            f(apciVar2.f, arrayDeque);
            return;
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(aozbVar.getClass()))));
    }

    public static /* synthetic */ apty g(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (apty) s;
    }

    public static void h(String str, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        apty aptyVar = (apty) aozyVar.b;
        apty aptyVar2 = apty.a;
        aptyVar.d = str;
    }

    public static void i(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        apty aptyVar = (apty) aozyVar.b;
        apty aptyVar2 = apty.a;
        aptyVar.c = str;
    }

    public static void j(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        apty aptyVar = (apty) aozyVar.b;
        apty aptyVar2 = apty.a;
        aptyVar.e = i;
    }

    public static void k(aptw aptwVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        apty aptyVar = (apty) aozyVar.b;
        apty aptyVar2 = apty.a;
        aptyVar.g = aptwVar;
        aptyVar.b |= 1;
    }

    public static void l(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        apty aptyVar = (apty) aozyVar.b;
        apty aptyVar2 = apty.a;
        aptyVar.f = a.ar(i);
    }

    public static /* synthetic */ aptx m(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aptx) s;
    }

    public static void n(aptt apttVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aptx aptxVar = (aptx) aozyVar.b;
        aptx aptxVar2 = aptx.a;
        aptxVar.d = apttVar;
        aptxVar.c = 2;
    }

    public static void o(String str, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aptx aptxVar = (aptx) aozyVar.b;
        aptx aptxVar2 = aptx.a;
        aptxVar.e = str;
    }

    public static void p(apty aptyVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aptx aptxVar = (aptx) aozyVar.b;
        aptx aptxVar2 = aptx.a;
        aptxVar.d = aptyVar;
        aptxVar.c = 1;
    }

    public static void q(String str, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aptx aptxVar = (aptx) aozyVar.b;
        aptx aptxVar2 = aptx.a;
        aptxVar.b |= 1;
        aptxVar.f = str;
    }

    public static /* synthetic */ aptw r(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aptw) s;
    }

    private static int s(int i) {
        int binarySearch = Arrays.binarySearch(apci.a, i);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }

    public String[] getElements() {
        throw null;
    }

    public void a(apvh apvhVar) {
    }

    public void b(apvh apvhVar) {
    }
}
