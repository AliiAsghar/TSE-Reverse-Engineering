package defpackage;

import android.os.Process;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahqf extends ahop implements ahmw, ahlj {
    private final ahlm a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final AtomicBoolean e = new AtomicBoolean();
    private final armf f;
    private final alhr g;
    private final armf h;
    private final armf i;

    public ahqf(ahlm ahlmVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, apwt apwtVar) {
        this.g = albo.D(new agud(armfVar4, 16));
        this.h = armfVar5;
        this.i = armfVar6;
        this.a = ahlmVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.f = new acss(apwtVar, 7);
    }

    private static long h(Long l, long j) {
        if (l == null) {
            return j;
        }
        return Math.min(l.longValue(), j);
    }

    private static asik k(ahqa ahqaVar) {
        aozy createBuilder = asik.a.createBuilder();
        if (ahqaVar.a != null) {
            String str = ahqaVar.a;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asik asikVar = (asik) createBuilder.b;
            str.getClass();
            asikVar.b |= 1;
            asikVar.c = str;
        }
        if (ahqaVar.b != null) {
            long j = ahqaVar.b.a;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asik asikVar2 = (asik) createBuilder.b;
            asikVar2.b |= 2;
            asikVar2.d = j;
        }
        if (ahqaVar.c != null) {
            long j2 = ahqaVar.c.a;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asik asikVar3 = (asik) createBuilder.b;
            asikVar3.b |= 4;
            asikVar3.e = j2;
        }
        if (ahqaVar.d != null) {
            long j3 = ahqaVar.d.a;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asik asikVar4 = (asik) createBuilder.b;
            asikVar4.b |= 8;
            asikVar4.f = j3;
        }
        return (asik) createBuilder.s();
    }

    @Override // defpackage.ahmw
    public final void as() {
        this.a.a(this);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.ahlj
    public final void i(ahka ahkaVar) {
        ahmz ahmzVar;
        Long l;
        long startElapsedRealtime;
        this.a.b(this);
        ahqe ahqeVar = ahqe.a;
        ahmz ahmzVar2 = ahqeVar.n;
        ahmz ahmzVar3 = ahqeVar.o;
        ((Boolean) this.f.b()).booleanValue();
        if ((ahmzVar2 != null && ahmzVar2.a > 0) || (ahmzVar3 != null && ahmzVar3.a > 0)) {
            if (ahqeVar.f(((Boolean) this.h.b()).booleanValue(), ((Long) this.i.b()).longValue(), (ahqh) this.g.get())) {
                ahmzVar = ahqeVar.g;
            } else {
                ahmzVar = ahqeVar.l;
            }
            if (ahmzVar != null) {
                long j = ahmzVar.a;
                if (j > 0) {
                    if ((ahmzVar2 != null && ahmzVar2.a >= j) || (ahmzVar3 != null && ahmzVar3.a >= j)) {
                        ((Boolean) this.f.b()).booleanValue();
                        aozy createBuilder = asim.a.createBuilder();
                        boolean f = ahqeVar.f(((Boolean) this.h.b()).booleanValue(), ((Long) this.i.b()).longValue(), (ahqh) this.g.get());
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        asim asimVar = (asim) createBuilder.b;
                        asimVar.b |= 65536;
                        asimVar.r = f;
                        if (ahqeVar.f(((Boolean) this.h.b()).booleanValue(), ((Long) this.i.b()).longValue(), (ahqh) this.g.get())) {
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            asim asimVar2 = (asim) createBuilder.b;
                            asimVar2.s = 1;
                            asimVar2.b = 131072 | asimVar2.b;
                        } else {
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            asim asimVar3 = (asim) createBuilder.b;
                            asimVar3.s = 2;
                            asimVar3.b = 131072 | asimVar3.b;
                        }
                        ahmz ahmzVar4 = ahqeVar.g;
                        ahmz ahmzVar5 = null;
                        if (ahmzVar4 != null) {
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            asim asimVar4 = (asim) createBuilder.b;
                            asimVar4.b |= 16;
                            long j2 = ahmzVar4.a;
                            asimVar4.f = j2;
                            l = Long.valueOf(j2);
                        } else {
                            l = null;
                        }
                        ahmz ahmzVar6 = ahqeVar.h;
                        if (ahmzVar6 != null) {
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            asim asimVar5 = (asim) createBuilder.b;
                            asimVar5.b |= 128;
                            long j3 = ahmzVar6.a;
                            asimVar5.i = j3;
                            l = Long.valueOf(h(l, j3));
                        }
                        ahmz ahmzVar7 = ahqeVar.i;
                        ahmz ahmzVar8 = ahqeVar.j;
                        ahmz ahmzVar9 = ahqeVar.k;
                        ahmz ahmzVar10 = ahqeVar.l;
                        if (ahmzVar10 != null) {
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            asim asimVar6 = (asim) createBuilder.b;
                            asimVar6.b |= 512;
                            long j4 = ahmzVar10.a;
                            asimVar6.k = j4;
                            l = Long.valueOf(h(l, j4));
                        }
                        ahmz ahmzVar11 = ahqeVar.o;
                        ahmz ahmzVar12 = ahqeVar.p;
                        ahmz ahmzVar13 = ahqeVar.n;
                        ahmz ahmzVar14 = ahqeVar.m;
                        int intValue = ((Long) this.d.b()).intValue();
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    if (intValue == 4) {
                                        ahmzVar5 = ahmzVar14;
                                    }
                                } else {
                                    ahmzVar5 = ahmzVar13;
                                }
                            } else {
                                ahmzVar5 = ahmzVar12;
                            }
                        } else {
                            ahmzVar5 = ahmzVar11;
                        }
                        if (ahmzVar5 != null) {
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            asim asimVar7 = (asim) createBuilder.b;
                            asimVar7.b |= 1024;
                            long j5 = ahmzVar5.a;
                            asimVar7.l = j5;
                            l = Long.valueOf(h(l, j5));
                        }
                        if (ahmzVar13 != null) {
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            asim asimVar8 = (asim) createBuilder.b;
                            asimVar8.b |= 8192;
                            long j6 = ahmzVar13.a;
                            asimVar8.o = j6;
                            l = Long.valueOf(h(l, j6));
                        }
                        if (ahmzVar14 != null) {
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            asim asimVar9 = (asim) createBuilder.b;
                            asimVar9.b |= 16384;
                            long j7 = ahmzVar14.a;
                            asimVar9.p = j7;
                            l = Long.valueOf(h(l, j7));
                        }
                        if (ahmzVar11 != null) {
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            asim asimVar10 = (asim) createBuilder.b;
                            asimVar10.b |= 2048;
                            long j8 = ahmzVar11.a;
                            asimVar10.m = j8;
                            l = Long.valueOf(h(l, j8));
                        }
                        if (ahmzVar12 != null) {
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            asim asimVar11 = (asim) createBuilder.b;
                            asimVar11.b |= 4096;
                            long j9 = ahmzVar12.a;
                            asimVar11.n = j9;
                            l = Long.valueOf(h(l, j9));
                        }
                        ahmz ahmzVar15 = ahqeVar.q;
                        if (ahmzVar15 != null) {
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            asim asimVar12 = (asim) createBuilder.b;
                            asimVar12.b |= 32768;
                            long j10 = ahmzVar15.a;
                            asimVar12.q = j10;
                            l = Long.valueOf(h(l, j10));
                        }
                        if (ahqeVar.s.b != null) {
                            asik k = k(ahqeVar.s);
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            asim asimVar13 = (asim) createBuilder.b;
                            k.getClass();
                            asimVar13.u = k;
                            asimVar13.b |= 524288;
                            if ((k.b & 2) != 0) {
                                l = Long.valueOf(h(l, k.d));
                            }
                            if ((k.b & 4) != 0) {
                                l = Long.valueOf(h(l, k.e));
                            }
                            if ((k.b & 8) != 0) {
                                l = Long.valueOf(h(l, k.f));
                            }
                        }
                        if (ahqeVar.t.b != null) {
                            asik k2 = k(ahqeVar.t);
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            asim asimVar14 = (asim) createBuilder.b;
                            k2.getClass();
                            asimVar14.v = k2;
                            asimVar14.b |= 1048576;
                            if ((k2.b & 2) != 0) {
                                l = Long.valueOf(h(l, k2.d));
                            }
                            if ((k2.b & 4) != 0) {
                                l = Long.valueOf(h(l, k2.e));
                            }
                            if ((k2.b & 8) != 0) {
                                l = Long.valueOf(h(l, k2.f));
                            }
                        }
                        algw a = ahqg.a();
                        if (a.f()) {
                            Long l2 = (Long) a.b();
                            long longValue = l2.longValue();
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            asim asimVar15 = (asim) createBuilder.b;
                            asimVar15.b |= 2;
                            asimVar15.d = longValue;
                            l = Long.valueOf(h(l, l2.longValue()));
                        }
                        startElapsedRealtime = Process.getStartElapsedRealtime();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        asim asimVar16 = (asim) createBuilder.b;
                        asimVar16.b |= 4;
                        asimVar16.e = startElapsedRealtime;
                        long h = h(l, startElapsedRealtime);
                        Long valueOf = Long.valueOf(h);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        asim asimVar17 = (asim) createBuilder.b;
                        asimVar17.b |= 262144;
                        asimVar17.t = true;
                        valueOf.getClass();
                        boolean booleanValue = ((Boolean) this.c.b()).booleanValue();
                        if (h != 0) {
                            if (!booleanValue) {
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                asim asimVar18 = (asim) createBuilder.b;
                                asimVar18.b |= 1;
                                asimVar18.c = h;
                            }
                            apag apagVar = createBuilder.b;
                            asim asimVar19 = (asim) apagVar;
                            if ((asimVar19.b & 16) != 0) {
                                long j11 = asimVar19.f - h;
                                if (!apagVar.isMutable()) {
                                    createBuilder.u();
                                }
                                asim asimVar20 = (asim) createBuilder.b;
                                asimVar20.b |= 16;
                                asimVar20.f = j11;
                            }
                            apag apagVar2 = createBuilder.b;
                            asim asimVar21 = (asim) apagVar2;
                            if ((asimVar21.b & 128) != 0) {
                                long j12 = asimVar21.i - h;
                                if (!apagVar2.isMutable()) {
                                    createBuilder.u();
                                }
                                asim asimVar22 = (asim) createBuilder.b;
                                asimVar22.b |= 128;
                                asimVar22.i = j12;
                            }
                            apag apagVar3 = createBuilder.b;
                            asim asimVar23 = (asim) apagVar3;
                            if ((asimVar23.b & 256) != 0) {
                                long j13 = asimVar23.j - h;
                                if (!apagVar3.isMutable()) {
                                    createBuilder.u();
                                }
                                asim asimVar24 = (asim) createBuilder.b;
                                asimVar24.b |= 256;
                                asimVar24.j = j13;
                            }
                            apag apagVar4 = createBuilder.b;
                            asim asimVar25 = (asim) apagVar4;
                            if ((asimVar25.b & 32) != 0) {
                                long j14 = asimVar25.g - h;
                                if (!apagVar4.isMutable()) {
                                    createBuilder.u();
                                }
                                asim asimVar26 = (asim) createBuilder.b;
                                asimVar26.b |= 32;
                                asimVar26.g = j14;
                            }
                            apag apagVar5 = createBuilder.b;
                            asim asimVar27 = (asim) apagVar5;
                            if ((asimVar27.b & 64) != 0) {
                                long j15 = asimVar27.h - h;
                                if (!apagVar5.isMutable()) {
                                    createBuilder.u();
                                }
                                asim asimVar28 = (asim) createBuilder.b;
                                asimVar28.b |= 64;
                                asimVar28.h = j15;
                            }
                            apag apagVar6 = createBuilder.b;
                            asim asimVar29 = (asim) apagVar6;
                            if ((asimVar29.b & 512) != 0) {
                                long j16 = asimVar29.k - h;
                                if (!apagVar6.isMutable()) {
                                    createBuilder.u();
                                }
                                asim asimVar30 = (asim) createBuilder.b;
                                asimVar30.b |= 512;
                                asimVar30.k = j16;
                            }
                            apag apagVar7 = createBuilder.b;
                            asim asimVar31 = (asim) apagVar7;
                            if ((asimVar31.b & 1024) != 0) {
                                long j17 = asimVar31.l - h;
                                if (!apagVar7.isMutable()) {
                                    createBuilder.u();
                                }
                                asim asimVar32 = (asim) createBuilder.b;
                                asimVar32.b |= 1024;
                                asimVar32.l = j17;
                            }
                            apag apagVar8 = createBuilder.b;
                            asim asimVar33 = (asim) apagVar8;
                            if ((asimVar33.b & 2048) != 0) {
                                long j18 = asimVar33.m - h;
                                if (!apagVar8.isMutable()) {
                                    createBuilder.u();
                                }
                                asim asimVar34 = (asim) createBuilder.b;
                                asimVar34.b |= 2048;
                                asimVar34.m = j18;
                            }
                            apag apagVar9 = createBuilder.b;
                            asim asimVar35 = (asim) apagVar9;
                            if ((asimVar35.b & 4096) != 0) {
                                long j19 = asimVar35.n - h;
                                if (!apagVar9.isMutable()) {
                                    createBuilder.u();
                                }
                                asim asimVar36 = (asim) createBuilder.b;
                                asimVar36.b |= 4096;
                                asimVar36.n = j19;
                            }
                            apag apagVar10 = createBuilder.b;
                            asim asimVar37 = (asim) apagVar10;
                            if ((asimVar37.b & 8192) != 0) {
                                long j20 = asimVar37.o - h;
                                if (!apagVar10.isMutable()) {
                                    createBuilder.u();
                                }
                                asim asimVar38 = (asim) createBuilder.b;
                                asimVar38.b |= 8192;
                                asimVar38.o = j20;
                            }
                            apag apagVar11 = createBuilder.b;
                            asim asimVar39 = (asim) apagVar11;
                            if ((asimVar39.b & 16384) != 0) {
                                long j21 = asimVar39.p - h;
                                if (!apagVar11.isMutable()) {
                                    createBuilder.u();
                                }
                                asim asimVar40 = (asim) createBuilder.b;
                                asimVar40.b |= 16384;
                                asimVar40.p = j21;
                            }
                            apag apagVar12 = createBuilder.b;
                            asim asimVar41 = (asim) apagVar12;
                            if ((asimVar41.b & 32768) != 0) {
                                long j22 = asimVar41.q - h;
                                if (!apagVar12.isMutable()) {
                                    createBuilder.u();
                                }
                                asim asimVar42 = (asim) createBuilder.b;
                                asimVar42.b = 32768 | asimVar42.b;
                                asimVar42.q = j22;
                            }
                            asim asimVar43 = (asim) createBuilder.b;
                            if ((asimVar43.b & 524288) != 0) {
                                asik asikVar = asimVar43.u;
                                if (asikVar == null) {
                                    asikVar = asik.a;
                                }
                                asik a2 = ahnz.a(asikVar, h);
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                asim asimVar44 = (asim) createBuilder.b;
                                a2.getClass();
                                asimVar44.u = a2;
                                asimVar44.b |= 524288;
                            }
                            asim asimVar45 = (asim) createBuilder.b;
                            if ((asimVar45.b & 1048576) != 0) {
                                asik asikVar2 = asimVar45.v;
                                if (asikVar2 == null) {
                                    asikVar2 = asik.a;
                                }
                                asik a3 = ahnz.a(asikVar2, h);
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                asim asimVar46 = (asim) createBuilder.b;
                                a3.getClass();
                                asimVar46.v = a3;
                                asimVar46.b |= 1048576;
                            }
                            apag apagVar13 = createBuilder.b;
                            asim asimVar47 = (asim) apagVar13;
                            if ((asimVar47.b & 4) != 0) {
                                long j23 = asimVar47.e - h;
                                if (!apagVar13.isMutable()) {
                                    createBuilder.u();
                                }
                                asim asimVar48 = (asim) createBuilder.b;
                                asimVar48.b |= 4;
                                asimVar48.e = j23;
                            }
                            apag apagVar14 = createBuilder.b;
                            asim asimVar49 = (asim) apagVar14;
                            if ((asimVar49.b & 2) != 0) {
                                long j24 = asimVar49.d - h;
                                if (!apagVar14.isMutable()) {
                                    createBuilder.u();
                                }
                                asim asimVar50 = (asim) createBuilder.b;
                                asimVar50.b |= 2;
                                asimVar50.d = j24;
                            }
                        }
                        ahka ahkaVar2 = ahqeVar.r;
                        if (!this.e.getAndSet(true)) {
                            ahrn ahrnVar = (ahrn) this.b.b();
                            albo.bN(new ncx(ahrnVar, createBuilder, ahka.d(ahkaVar2), 18), ahrnVar.b);
                            return;
                        } else {
                            ListenableFuture listenableFuture = aneh.a;
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        ((alvg) ((alvg) ahkh.a.g()).h("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricServiceImpl", "onAppToBackground", 318, "StartupMetricServiceImpl.java")).q("missing firstDraw timestamp");
    }

    @Override // defpackage.ahlj
    public final /* synthetic */ void j(ahka ahkaVar) {
    }
}
