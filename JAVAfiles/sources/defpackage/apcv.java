package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apcv {
    private static volatile int a = 100;

    public static apcw f(Object obj) {
        return ((apag) obj).unknownFields;
    }

    public static void g(Object obj, apcw apcwVar) {
        ((apag) obj).unknownFields = apcwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(Object obj, aozh aozhVar, int i) {
        int i2 = aozhVar.a;
        int a2 = apdh.a(i2);
        int b = apdh.b(i2);
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        if (b != 4) {
                            if (b == 5) {
                                apcw apcwVar = (apcw) obj;
                                apcwVar.f(apdh.c(a2, 5), Integer.valueOf(aozhVar.e()));
                                return true;
                            }
                            throw new apaz();
                        }
                        return false;
                    }
                    apcw apcwVar2 = new apcw();
                    int c = apdh.c(a2, 4);
                    int i3 = i + 1;
                    if (i3 >= a) {
                        throw new apba("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    while (aozhVar.c() != Integer.MAX_VALUE && a(apcwVar2, aozhVar, i3)) {
                    }
                    if (c == aozhVar.a) {
                        apcwVar2.e();
                        ((apcw) obj).f(apdh.c(a2, 3), apcwVar2);
                        return true;
                    }
                    throw new apba("Protocol message end-group tag did not match expected tag.");
                }
                c(obj, a2, aozhVar.o());
                return true;
            }
            apcw apcwVar3 = (apcw) obj;
            apcwVar3.f(apdh.c(a2, 1), Long.valueOf(aozhVar.j()));
            return true;
        }
        d(obj, a2, aozhVar.k());
        return true;
    }

    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        apcw f = f(obj);
        if (f == apcw.a) {
            apcw apcwVar = new apcw();
            g(obj, apcwVar);
            return apcwVar;
        }
        return f;
    }

    public final /* bridge */ /* synthetic */ void c(Object obj, int i, aozb aozbVar) {
        ((apcw) obj).f(apdh.c(i, 2), aozbVar);
    }

    public final /* bridge */ /* synthetic */ void d(Object obj, int i, long j) {
        ((apcw) obj).f(apdh.c(i, 0), Long.valueOf(j));
    }

    public final void e(Object obj) {
        f(obj).e();
    }
}
