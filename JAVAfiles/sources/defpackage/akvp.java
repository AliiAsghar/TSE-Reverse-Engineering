package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akvp {
    public final aktq d;
    public final float e;
    public akrg i;
    public akrg j;
    private final SparseArray l;
    private final long[] m;
    private final boolean[] n;
    public final Map a = new HashMap();
    public final Set b = new HashSet();
    public final Map c = new HashMap();
    public final aozy k = asis.a.createBuilder();
    public long f = 0;
    public long g = Long.MAX_VALUE;
    public long h = Long.MIN_VALUE;
    private long o = 1;
    private long p = 2;

    public akvp(aktq aktqVar, SparseArray sparseArray, float f) {
        this.d = aktqVar;
        this.l = sparseArray;
        this.e = f;
        this.n = new boolean[aktqVar.e.size()];
        this.m = new long[aktqVar.e.size()];
    }

    private final long c(long j, aozn aoznVar, String str) {
        long j2 = this.o;
        this.o = 1 + j2;
        aozy createBuilder = asiw.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        asiw asiwVar = (asiw) apagVar;
        asiwVar.b |= 2;
        asiwVar.d = j;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        asiw asiwVar2 = (asiw) createBuilder.b;
        asiwVar2.b |= 1;
        asiwVar2.c = str;
        m(j2, aoznVar, (asiw) createBuilder.s());
        aozy o = o(j2);
        if (!o.b.isMutable()) {
            o.u();
        }
        asjv asjvVar = (asjv) o.b;
        asjv asjvVar2 = asjv.a;
        asjvVar.b |= 16;
        asjvVar.g = true;
        return j2;
    }

    private final long d(int i) {
        long[] jArr = this.m;
        long j = jArr[i];
        if (j == 0) {
            long j2 = this.o;
            this.o = 1 + j2;
            jArr[i] = j2;
            return j2;
        }
        return j;
    }

    private final long e(akrg akrgVar) {
        return d(akrgVar.d);
    }

    private static long f(akrg akrgVar) {
        return ((akrgVar.f + akrgVar.h) * 1000000) + akrgVar.g + akrgVar.i;
    }

    private static long g(akrg akrgVar) {
        return (akrgVar.f * 1000000) + akrgVar.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        if (r4 <= r7) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.akvo h(defpackage.akrg r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akvp.h(akrg):akvo");
    }

    private static aozn i(akrg akrgVar) {
        return apdp.d(f(akrgVar));
    }

    private static aozn j(akrg akrgVar) {
        return k(akrgVar, 0L);
    }

    private static aozn k(akrg akrgVar, long j) {
        return apdp.d(g(akrgVar) + j);
    }

    private final asiw l(akrg akrgVar, long j) {
        aozy createBuilder = asiw.a.createBuilder();
        String str = akrgVar.c;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        asiw asiwVar = (asiw) apagVar;
        str.getClass();
        asiwVar.b |= 1;
        asiwVar.c = str;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        asiw asiwVar2 = (asiw) createBuilder.b;
        asiwVar2.b |= 2;
        asiwVar2.d = j;
        alpt alptVar = (alpt) ((akrl) this.l.get(akrgVar.d, akrk.a)).h(aksy.a);
        if (alptVar != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asiw asiwVar3 = (asiw) createBuilder.b;
            apar aparVar = asiwVar3.e;
            if (!aparVar.c()) {
                asiwVar3.e = apag.mutableCopy(aparVar);
            }
            aoyj.addAll(alptVar, asiwVar3.e);
        }
        return (asiw) createBuilder.s();
    }

    private final void m(long j, aozn aoznVar, asiw asiwVar) {
        aozy createBuilder = asix.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        asix asixVar = (asix) apagVar;
        asixVar.b |= 1;
        asixVar.e = j;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        asix asixVar2 = (asix) createBuilder.b;
        aoznVar.getClass();
        asixVar2.f = aoznVar;
        asixVar2.b |= 2;
        aozy createBuilder2 = asit.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        asit asitVar = (asit) createBuilder2.b;
        asiwVar.getClass();
        asitVar.c = asiwVar;
        asitVar.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aozy aozyVar = this.k;
        asix asixVar3 = (asix) createBuilder.b;
        asit asitVar2 = (asit) createBuilder2.s();
        asitVar2.getClass();
        asixVar3.d = asitVar2;
        asixVar3.c = 5;
        aozyVar.cp(createBuilder);
    }

    private final void n(akrg akrgVar, long j, long j2, long j3, String str, long j4) {
        long e = e(akrgVar);
        aozn k = k(akrgVar, j4);
        aozy createBuilder = asiu.a.createBuilder();
        asiw l = l(akrgVar, j);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        asiu asiuVar = (asiu) apagVar;
        l.getClass();
        asiuVar.c = l;
        asiuVar.b |= 1;
        if (j2 != 0) {
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            asiu asiuVar2 = (asiu) createBuilder.b;
            asiuVar2.b |= 2;
            asiuVar2.d = j2;
        }
        if (j3 != 0 && str != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            asiu asiuVar3 = (asiu) apagVar2;
            asiuVar3.b |= 8;
            asiuVar3.e = str;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            apag apagVar3 = createBuilder.b;
            asiu asiuVar4 = (asiu) apagVar3;
            asiuVar4.b |= 32;
            asiuVar4.g = 1L;
            if (!apagVar3.isMutable()) {
                createBuilder.u();
            }
            asiu asiuVar5 = (asiu) createBuilder.b;
            asiuVar5.f = 3;
            asiuVar5.b |= 16;
        }
        aozy aozyVar = this.k;
        aozy createBuilder2 = asix.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar4 = createBuilder2.b;
        asix asixVar = (asix) apagVar4;
        asixVar.b |= 1;
        asixVar.e = e;
        if (!apagVar4.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar5 = createBuilder2.b;
        asix asixVar2 = (asix) apagVar5;
        k.getClass();
        asixVar2.f = k;
        asixVar2.b |= 2;
        if (!apagVar5.isMutable()) {
            createBuilder2.u();
        }
        asix asixVar3 = (asix) createBuilder2.b;
        asiu asiuVar6 = (asiu) createBuilder.s();
        asiuVar6.getClass();
        asixVar3.d = asiuVar6;
        asixVar3.c = 3;
        aozyVar.cp(createBuilder2);
        if ((akrgVar.b & 32) != 0) {
            if (akrgVar.h > 0 || akrgVar.i > 0) {
                k = i(akrgVar);
            }
            aozy createBuilder3 = asiv.a.createBuilder();
            if ((akrgVar.b & 128) != 0) {
                aozn c = apdp.c(akrgVar.j);
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                asiv asivVar = (asiv) createBuilder3.b;
                c.getClass();
                asivVar.c = c;
                asivVar.b |= 1;
            }
            aozy aozyVar2 = this.k;
            aozy createBuilder4 = asix.a.createBuilder();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            apag apagVar6 = createBuilder4.b;
            asix asixVar4 = (asix) apagVar6;
            asixVar4.b |= 1;
            asixVar4.e = e;
            if (!apagVar6.isMutable()) {
                createBuilder4.u();
            }
            apag apagVar7 = createBuilder4.b;
            asix asixVar5 = (asix) apagVar7;
            k.getClass();
            asixVar5.f = k;
            asixVar5.b |= 2;
            if (!apagVar7.isMutable()) {
                createBuilder4.u();
            }
            asix asixVar6 = (asix) createBuilder4.b;
            asiv asivVar2 = (asiv) createBuilder3.s();
            asivVar2.getClass();
            asixVar6.d = asivVar2;
            asixVar6.c = 4;
            aozyVar2.cp(createBuilder4);
        }
    }

    private final aozy o(long j) {
        Map map = this.a;
        Long valueOf = Long.valueOf(j);
        aozy aozyVar = (aozy) map.get(valueOf);
        if (aozyVar == null) {
            aozyVar = asjv.a.createBuilder();
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            asjv asjvVar = (asjv) aozyVar.b;
            asjvVar.b |= 1;
            asjvVar.c = j;
            this.a.put(valueOf, aozyVar);
        }
        return aozyVar;
    }

    public final algw a(akrg akrgVar) {
        akri j = akrl.j(akvm.a, (akrl) this.l.get(akrgVar.d, akrk.a));
        if (j.b()) {
            return ((akvk) j.a()).a();
        }
        return alfd.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.akrg r22) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akvp.b(akrg):void");
    }
}
