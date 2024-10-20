package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apdp {
    public static final aozn a;

    static {
        aozy createBuilder = aozn.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((aozn) apagVar).b = -315576000000L;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((aozn) createBuilder.b).c = -999999999;
        aozy createBuilder2 = aozn.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        ((aozn) apagVar2).b = 315576000000L;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        ((aozn) createBuilder2.b).c = 999999999;
        aozy createBuilder3 = aozn.a.createBuilder();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apag apagVar3 = createBuilder3.b;
        ((aozn) apagVar3).b = 0L;
        if (!apagVar3.isMutable()) {
            createBuilder3.u();
        }
        ((aozn) createBuilder3.b).c = 0;
        a = (aozn) createBuilder3.s();
    }

    public static long a(aozn aoznVar) {
        f(aoznVar);
        return albo.cK(albo.cL(aoznVar.b, 1000L), aoznVar.c / 1000000);
    }

    public static aozn b(long j) {
        aozy createBuilder = aozn.a.createBuilder();
        long cL = albo.cL(j, 86400L);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((aozn) apagVar).b = cL;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((aozn) createBuilder.b).c = 0;
        return (aozn) createBuilder.s();
    }

    public static aozn c(long j) {
        return e(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static aozn d(long j) {
        return e(j / 1000000000, (int) (j % 1000000000));
    }

    public static aozn e(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = albo.cK(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        aozy createBuilder = aozn.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((aozn) apagVar).b = j;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((aozn) createBuilder.b).c = i;
        aozn aoznVar = (aozn) createBuilder.s();
        f(aoznVar);
        return aoznVar;
    }

    public static void f(aozn aoznVar) {
        long j = aoznVar.b;
        int i = aoznVar.c;
        if (j >= -315576000000L && j <= 315576000000L && i >= -999999999 && i < 1000000000) {
            if (j < 0 || i < 0) {
                if (j <= 0 && i <= 0) {
                    return;
                }
            } else {
                return;
            }
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j), Integer.valueOf(i)));
    }
}
