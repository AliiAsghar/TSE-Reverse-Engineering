package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjd extends fji implements fbe {
    public static final alsr a = alsr.b(new ebn(3));
    public final Object b;
    public final Context c;
    public final boolean d;
    public fiv e;
    public fiy f;
    public epz g;

    public fjd(Context context) {
        Context context2;
        Spatializer spatializer;
        fiv fivVar = new fiv(new fiu(context));
        this.b = new Object();
        fiy fiyVar = null;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.c = context2;
        this.e = fivVar;
        this.g = epz.a;
        boolean z = false;
        if (context != null && eul.aa(context)) {
            z = true;
        }
        this.d = z;
        if (!z && context != null && eul.a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                spatializer = audioManager.getSpatializer();
                fiyVar = new fiy(spatializer);
            }
            this.f = fiyVar;
        }
        if (this.e.M && context == null) {
            eub.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int a(eqn eqnVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(eqnVar.d)) {
            return 4;
        }
        String f = f(str);
        String f2 = f(eqnVar.d);
        if (f2 != null && f != null) {
            if (!f2.startsWith(f) && !f.startsWith(f2)) {
                if (!eul.af(f2, "-")[0].equals(eul.af(f, "-")[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z || f2 != null) {
            return 0;
        }
        return 1;
    }

    public static int b(int i, int i2) {
        if (i != 0 && i == i2) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(i & i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String f(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    private static void n(fid fidVar, ese eseVar, Map map) {
        esb esbVar;
        for (int i = 0; i < fidVar.b; i++) {
            esb esbVar2 = (esb) eseVar.A.get(fidVar.b(i));
            if (esbVar2 != null && ((esbVar = (esb) map.get(Integer.valueOf(esbVar2.a()))) == null || (esbVar.b.isEmpty() && !esbVar2.b.isEmpty()))) {
                map.put(Integer.valueOf(esbVar2.a()), esbVar2);
            }
        }
    }

    private final void o(fiv fivVar) {
        boolean equals;
        synchronized (this.b) {
            equals = this.e.equals(fivVar);
            this.e = fivVar;
        }
        if (!equals) {
            if (fivVar.M && this.c == null) {
                eub.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            m();
        }
    }

    private static final Pair p(int i, fjf fjfVar, int[][][] iArr, fja fjaVar, Comparator comparator) {
        RandomAccess randomAccess;
        boolean z;
        fjf fjfVar2 = fjfVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < fjfVar2.a) {
            if (i == fjfVar2.a(i2)) {
                fid c = fjfVar2.c(i2);
                for (int i3 = 0; i3 < c.b; i3++) {
                    esa b = c.b(i3);
                    List a2 = fjaVar.a(i2, b, iArr[i2][i3]);
                    boolean[] zArr = new boolean[b.a];
                    int i4 = 0;
                    while (i4 < b.a) {
                        int i5 = i4 + 1;
                        fjb fjbVar = (fjb) a2.get(i4);
                        int b2 = fjbVar.b();
                        if (!zArr[i4] && b2 != 0) {
                            if (b2 == 1) {
                                randomAccess = alog.r(fjbVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(fjbVar);
                                for (int i6 = i5; i6 < b.a; i6++) {
                                    fjb fjbVar2 = (fjb) a2.get(i6);
                                    if (fjbVar2.b() == 2 && fjbVar.c(fjbVar2)) {
                                        arrayList2.add(fjbVar2);
                                        z = true;
                                        zArr[i6] = true;
                                    } else {
                                        z = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i4 = i5;
                    }
                }
            }
            i2++;
            fjfVar2 = fjfVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((fjb) list.get(i7)).c;
        }
        fjb fjbVar3 = (fjb) list.get(0);
        return Pair.create(new fvq(fjbVar3.b, iArr2), Integer.valueOf(fjbVar3.a));
    }

    @Override // defpackage.fji
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final fiv c() {
        fiv fivVar;
        synchronized (this.b) {
            fivVar = this.e;
        }
        return fivVar;
    }

    public final void g() {
        boolean z;
        fiy fiyVar;
        synchronized (this.b) {
            z = false;
            if (this.e.M && !this.d && eul.a >= 32 && (fiyVar = this.f) != null && fiyVar.b) {
                z = true;
            }
        }
        if (z) {
            m();
        }
    }

    @Override // defpackage.fji
    public final void h() {
        fiy fiyVar;
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        synchronized (this.b) {
            if (eul.a >= 32 && (fiyVar = this.f) != null && (spatializer$OnSpatializerStateChangedListener = fiyVar.d) != null && fiyVar.c != null) {
                fiyVar.a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
                fiyVar.c.removeCallbacksAndMessages(null);
                fiyVar.c = null;
                fiyVar.d = null;
            }
        }
        this.h = null;
        this.i = null;
    }

    @Override // defpackage.fji
    public final void i(epz epzVar) {
        boolean equals;
        synchronized (this.b) {
            equals = this.g.equals(epzVar);
            this.g = epzVar;
        }
        if (!equals) {
            g();
        }
    }

    @Override // defpackage.fji
    public final void j(ese eseVar) {
        o((fiv) eseVar);
        fiu fiuVar = new fiu(c());
        fiuVar.e(eseVar);
        o(new fiv(fiuVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fji
    public final Pair k(fjf fjfVar, int[][][] iArr, final int[] iArr2) {
        final fiv fivVar;
        int i;
        Pair pair;
        final boolean z;
        final String str;
        fbg fbgVar;
        int[] iArr3;
        int length;
        fin finVar;
        alog g;
        double d;
        long j;
        fiw fiwVar;
        fvq fvqVar;
        fvq fvqVar2;
        fiy fiyVar;
        int[][][] iArr4 = iArr;
        synchronized (this.b) {
            fivVar = this.e;
            i = 2;
            if (fivVar.M && eul.a >= 32 && (fiyVar = this.f) != null) {
                Looper myLooper = Looper.myLooper();
                dzg.h(myLooper);
                if (fiyVar.d == null && fiyVar.c == null) {
                    fiyVar.d = new fix(this);
                    fiyVar.c = new Handler(myLooper);
                    Spatializer spatializer = fiyVar.a;
                    Handler handler = fiyVar.c;
                    handler.getClass();
                    spatializer.addOnSpatializerStateChangedListener(new fcv(handler, 2), fiyVar.d);
                }
            }
        }
        int i2 = fjfVar.a;
        fvq[] fvqVarArr = new fvq[i2];
        int i3 = fivVar.s.b;
        final int i4 = 1;
        Pair p = p(2, fjfVar, iArr4, new fja() { // from class: fiq
            /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
            @Override // defpackage.fja
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List a(int r17, defpackage.esa r18, int[] r19) {
                /*
                    Method dump skipped, instructions count: 226
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.fiq.a(int, esa, int[]):java.util.List");
            }
        }, new ebn(6));
        boolean z2 = fivVar.x;
        int i5 = 4;
        if (p == null) {
            int i6 = fivVar.s.b;
            pair = p(4, fjfVar, iArr4, new fja() { // from class: fio
                @Override // defpackage.fja
                public final List a(int i7, esa esaVar, int[] iArr5) {
                    alsr alsrVar = fjd.a;
                    alob alobVar = new alob();
                    for (int i8 = 0; i8 < esaVar.a; i8++) {
                        alobVar.h(new fis(i7, esaVar, i8, fiv.this, iArr5[i8]));
                    }
                    return alobVar.g();
                }
            }, new ebn(4));
        } else {
            pair = null;
        }
        final int i7 = 0;
        if (pair != null) {
            fvqVarArr[((Integer) pair.second).intValue()] = (fvq) pair.first;
        } else if (p != null) {
            fvqVarArr[((Integer) p.second).intValue()] = (fvq) p.first;
        }
        int i8 = 0;
        while (true) {
            if (i8 < fjfVar.a) {
                if (fjfVar.a(i8) == 2 && fjfVar.c(i8).b > 0) {
                    z = true;
                    break;
                }
                i8++;
            } else {
                z = false;
                break;
            }
        }
        Pair p2 = p(1, fjfVar, iArr4, new fja() { // from class: fip
            @Override // defpackage.fja
            public final List a(int i9, esa esaVar, int[] iArr5) {
                fwc fwcVar = new fwc(fjd.this, 1);
                int i10 = iArr2[i9];
                alob alobVar = new alob();
                for (int i11 = 0; i11 < esaVar.a; i11++) {
                    alobVar.h(new fir(i9, esaVar, i11, fivVar, iArr5[i11], z, fwcVar));
                }
                return alobVar.g();
            }
        }, new ebn(5));
        if (p2 != null) {
            fvqVarArr[((Integer) p2.second).intValue()] = (fvq) p2.first;
        }
        if (p2 == null) {
            str = null;
        } else {
            str = ((esa) ((fvq) p2.first).a).a(((int[]) ((fvq) p2.first).b)[0]).d;
        }
        int i9 = fivVar.s.b;
        int i10 = 3;
        Pair p3 = p(3, fjfVar, iArr4, new fja() { // from class: fiq
            @Override // defpackage.fja
            public final List a(int i11, esa esaVar, int[] iArr5) {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    Method dump skipped, instructions count: 226
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.fiq.a(int, esa, int[]):java.util.List");
            }
        }, new ebn(7));
        if (p3 != null) {
            fvqVarArr[((Integer) p3.second).intValue()] = (fvq) p3.first;
        }
        int i11 = 0;
        while (i11 < i2) {
            int a2 = fjfVar.a(i11);
            if (a2 != i && a2 != i4 && a2 != i10 && a2 != i5) {
                fid c = fjfVar.c(i11);
                int[][] iArr5 = iArr4[i11];
                int i12 = fivVar.s.b;
                int i13 = i7;
                int i14 = i13;
                esa esaVar = null;
                fit fitVar = null;
                while (i13 < c.b) {
                    esa b = c.b(i13);
                    int[] iArr6 = iArr5[i13];
                    fit fitVar2 = fitVar;
                    while (i7 < b.a) {
                        if (dzn.j(iArr6[i7], fivVar.N)) {
                            fit fitVar3 = new fit(b.a(i7), iArr6[i7]);
                            if (fitVar2 == null || fitVar3.compareTo(fitVar2) > 0) {
                                esaVar = b;
                                fitVar2 = fitVar3;
                                i14 = i7;
                            }
                        }
                        i7++;
                    }
                    i13++;
                    fitVar = fitVar2;
                    i7 = 0;
                }
                if (esaVar == null) {
                    fvqVar2 = null;
                } else {
                    fvqVar2 = new fvq(esaVar, i14);
                }
                fvqVarArr[i11] = fvqVar2;
            }
            i11++;
            iArr4 = iArr;
            i = 2;
            i4 = 1;
            i5 = 4;
            i10 = 3;
            i7 = 0;
        }
        int i15 = fjfVar.a;
        HashMap hashMap = new HashMap();
        for (int i16 = 0; i16 < i15; i16++) {
            n(fjfVar.c(i16), fivVar, hashMap);
        }
        n(fjfVar.e, fivVar, hashMap);
        for (int i17 = 0; i17 < i15; i17++) {
            esb esbVar = (esb) hashMap.get(Integer.valueOf(fjfVar.a(i17)));
            if (esbVar != null) {
                if (!esbVar.b.isEmpty() && fjfVar.c(i17).a(esbVar.a) != -1) {
                    fvqVar = new fvq(esbVar.a, albo.cy(esbVar.b));
                } else {
                    fvqVar = null;
                }
                fvqVarArr[i17] = fvqVar;
            }
        }
        int i18 = fjfVar.a;
        for (int i19 = 0; i19 < i18; i19++) {
            fid c2 = fjfVar.c(i19);
            Map map = (Map) fivVar.R.get(i19);
            if (map != null && map.containsKey(c2)) {
                Map map2 = (Map) fivVar.R.get(i19);
                if (map2 != null) {
                    fiwVar = (fiw) map2.get(c2);
                } else {
                    fiwVar = null;
                }
                if (fiwVar == null) {
                    fvqVarArr[i19] = null;
                } else {
                    throw null;
                }
            }
        }
        for (int i20 = 0; i20 < i2; i20++) {
            int a3 = fjfVar.a(i20);
            if (fivVar.a(i20) || fivVar.B.contains(Integer.valueOf(a3))) {
                fvqVarArr[i20] = null;
            }
        }
        dzg.h(this.i);
        ArrayList arrayList = new ArrayList();
        for (int i21 = 0; i21 < i2; i21++) {
            fvq fvqVar3 = fvqVarArr[i21];
            if (fvqVar3 != null && ((int[]) fvqVar3.b).length > 1) {
                alob alobVar = new alob();
                alobVar.h(new fim(0L, 0L));
                arrayList.add(alobVar);
            } else {
                arrayList.add(null);
            }
        }
        long[][] jArr = new long[i2];
        for (int i22 = 0; i22 < i2; i22++) {
            fvq fvqVar4 = fvqVarArr[i22];
            if (fvqVar4 == null) {
                jArr[i22] = new long[0];
            } else {
                jArr[i22] = new long[((int[]) fvqVar4.b).length];
                int i23 = 0;
                while (true) {
                    int[] iArr7 = (int[]) fvqVar4.b;
                    if (i23 >= iArr7.length) {
                        break;
                    }
                    long j2 = ((esa) fvqVar4.a).a(iArr7[i23]).j;
                    long[] jArr2 = jArr[i22];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i23] = j2;
                    i23++;
                }
                Arrays.sort(jArr[i22]);
            }
        }
        int[] iArr8 = new int[i2];
        long[] jArr3 = new long[i2];
        for (int i24 = 0; i24 < i2; i24++) {
            long[] jArr4 = jArr[i24];
            if (jArr4.length == 0) {
                j = 0;
            } else {
                j = jArr4[0];
            }
            jArr3[i24] = j;
        }
        fin.h(arrayList, jArr3);
        alqu f = new alsb(also.a).b().f();
        for (int i25 = 0; i25 < i2; i25++) {
            int length2 = jArr[i25].length;
            if (length2 > 1) {
                double[] dArr = new double[length2];
                int i26 = 0;
                while (true) {
                    long[] jArr5 = jArr[i25];
                    double d2 = 0.0d;
                    if (i26 >= jArr5.length) {
                        break;
                    }
                    long j3 = jArr5[i26];
                    if (j3 != -1) {
                        d2 = Math.log(j3);
                    }
                    dArr[i26] = d2;
                    i26++;
                }
                int i27 = length2 - 1;
                double d3 = dArr[i27] - dArr[0];
                int i28 = 0;
                while (i28 < i27) {
                    double d4 = dArr[i28];
                    i28++;
                    double d5 = d4 + dArr[i28];
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = ((d5 * 0.5d) - dArr[0]) / d3;
                    }
                    f.q(Double.valueOf(d), Integer.valueOf(i25));
                }
            }
        }
        alog n = alog.n(f.s());
        for (int i29 = 0; i29 < n.size(); i29++) {
            int intValue = ((Integer) n.get(i29)).intValue();
            int i30 = iArr8[intValue] + 1;
            iArr8[intValue] = i30;
            jArr3[intValue] = jArr[intValue][i30];
            fin.h(arrayList, jArr3);
        }
        for (int i31 = 0; i31 < i2; i31++) {
            if (arrayList.get(i31) != null) {
                long j4 = jArr3[i31];
                jArr3[i31] = j4 + j4;
            }
        }
        fin.h(arrayList, jArr3);
        alob alobVar2 = new alob();
        for (int i32 = 0; i32 < arrayList.size(); i32++) {
            alob alobVar3 = (alob) arrayList.get(i32);
            if (alobVar3 == null) {
                g = alsx.a;
            } else {
                g = alobVar3.g();
            }
            alobVar2.h(g);
        }
        alog g2 = alobVar2.g();
        fje[] fjeVarArr = new fje[i2];
        for (int i33 = 0; i33 < i2; i33++) {
            fvq fvqVar5 = fvqVarArr[i33];
            if (fvqVar5 != null && (length = (iArr3 = (int[]) fvqVar5.b).length) != 0) {
                if (length == 1) {
                    finVar = new fin((esa) fvqVar5.a, new int[]{iArr3[0]});
                } else {
                    finVar = new fin((esa) fvqVar5.a, iArr3, (alog) g2.get(i33));
                }
                fjeVarArr[i33] = finVar;
            }
        }
        fbg[] fbgVarArr = new fbg[i2];
        for (int i34 = 0; i34 < i2; i34++) {
            int a4 = fjfVar.a(i34);
            if (!fivVar.a(i34) && !fivVar.B.contains(Integer.valueOf(a4)) && (fjfVar.a(i34) == -2 || fjeVarArr[i34] != null)) {
                fbgVar = fbg.a;
            } else {
                fbgVar = null;
            }
            fbgVarArr[i34] = fbgVar;
        }
        boolean z3 = fivVar.O;
        int i35 = fivVar.s.b;
        return Pair.create(fbgVarArr, fjeVarArr);
    }

    @Override // defpackage.fji
    public final fbe d() {
        return this;
    }

    @Override // defpackage.fji
    public final void l() {
    }
}
