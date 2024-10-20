package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgq implements View.OnAttachStateChangeListener, emx {
    public final dai a;
    public ddv e;
    public boolean f;
    private final arqg i;
    private dfr j;
    private long o;
    private final tx p = new tx((byte[]) null);
    private final tz q = new tz((byte[]) null);
    private final long k = 100;
    public a b = a.a;
    public boolean c = true;
    private final to l = new to((byte[]) null);
    private final arzj m = arhi.t(1, 0, 6);
    public final Handler d = new Handler(Looper.getMainLooper());
    private tx n = ty.a();
    public final tx h = new tx((byte[]) null);
    public final Runnable g = new Runnable() { // from class: cgp
        @Override // java.lang.Runnable
        public final void run() {
            tx txVar;
            int[] iArr;
            long[] jArr;
            tx txVar2;
            int[] iArr2;
            long[] jArr2;
            int i;
            int i2;
            int i3;
            int i4;
            dhe dheVar;
            long[] jArr3;
            Object[] objArr;
            ddv ddvVar;
            long[] jArr4;
            Object[] objArr2;
            ddv ddvVar2;
            dhv dhvVar;
            dhv dhvVar2;
            Object[] objArr3;
            Object[] objArr4;
            dhv dhvVar3;
            cgq cgqVar = cgq.this;
            if (cgqVar.m()) {
                cgqVar.a.q(true);
                cgqVar.l(cgqVar.a.j.a(), cgqVar.e);
                cgqVar.j(cgqVar.a.j.a(), cgqVar.e);
                tx a2 = cgqVar.a();
                int[] iArr3 = a2.b;
                long[] jArr5 = a2.a;
                int length = jArr5.length - 2;
                char c = 7;
                long j = -9187201950435737472L;
                int i5 = 8;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j2 = jArr5[i6];
                        if ((((~j2) << c) & j2 & j) != j) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j2 & 255) < 128) {
                                    int i9 = iArr3[(i6 << 3) + i8];
                                    ddv ddvVar3 = (ddv) cgqVar.h.a(i9);
                                    ddw ddwVar = (ddw) a2.a(i9);
                                    if (ddwVar != null) {
                                        dheVar = ddwVar.a;
                                    } else {
                                        dheVar = null;
                                    }
                                    if (dheVar != null) {
                                        if (ddvVar3 == null) {
                                            ve veVar = dheVar.c.c;
                                            Object[] objArr5 = veVar.b;
                                            long[] jArr6 = veVar.a;
                                            int length2 = jArr6.length - 2;
                                            txVar2 = a2;
                                            iArr2 = iArr3;
                                            if (length2 >= 0) {
                                                int i10 = 0;
                                                while (true) {
                                                    long j3 = jArr6[i10];
                                                    jArr2 = jArr5;
                                                    i = length;
                                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                        int i12 = 0;
                                                        while (i12 < i11) {
                                                            if ((j3 & 255) < 128) {
                                                                dhn dhnVar = (dhn) objArr5[(i10 << 3) + i12];
                                                                dhn dhnVar2 = dhh.a;
                                                                objArr4 = objArr5;
                                                                if (d.F(dhnVar, dhh.x)) {
                                                                    List list = (List) dgz.a(dheVar.c, dhh.x);
                                                                    if (list != null) {
                                                                        dhvVar3 = (dhv) aqjn.Z(list);
                                                                    } else {
                                                                        dhvVar3 = null;
                                                                    }
                                                                    cgqVar.k(dheVar.e, String.valueOf(dhvVar3));
                                                                }
                                                            } else {
                                                                objArr4 = objArr5;
                                                            }
                                                            j3 >>= 8;
                                                            i12++;
                                                            objArr5 = objArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        i4 = 8;
                                                        if (i11 != 8) {
                                                            i2 = i7;
                                                            i3 = i8;
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                    }
                                                    if (i10 == length2) {
                                                        break;
                                                    }
                                                    i10++;
                                                    jArr5 = jArr2;
                                                    length = i;
                                                    objArr5 = objArr3;
                                                }
                                            } else {
                                                jArr2 = jArr5;
                                                i = length;
                                            }
                                            i2 = i7;
                                            i3 = i8;
                                        } else {
                                            txVar2 = a2;
                                            iArr2 = iArr3;
                                            jArr2 = jArr5;
                                            i = length;
                                            ve veVar2 = dheVar.c.c;
                                            Object[] objArr6 = veVar2.b;
                                            long[] jArr7 = veVar2.a;
                                            int length3 = jArr7.length - 2;
                                            if (length3 >= 0) {
                                                int i13 = 0;
                                                while (true) {
                                                    long j4 = jArr7[i13];
                                                    i2 = i7;
                                                    i3 = i8;
                                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                                        int i15 = 0;
                                                        while (i15 < i14) {
                                                            if ((j4 & 255) < 128) {
                                                                jArr4 = jArr7;
                                                                dhn dhnVar3 = (dhn) objArr6[(i13 << 3) + i15];
                                                                dhn dhnVar4 = dhh.a;
                                                                objArr2 = objArr6;
                                                                if (d.F(dhnVar3, dhh.x)) {
                                                                    List list2 = (List) dgz.a(ddvVar3.a, dhh.x);
                                                                    if (list2 != null) {
                                                                        dhvVar = (dhv) aqjn.Z(list2);
                                                                    } else {
                                                                        dhvVar = null;
                                                                    }
                                                                    ddvVar2 = ddvVar3;
                                                                    List list3 = (List) dgz.a(dheVar.c, dhh.x);
                                                                    if (list3 != null) {
                                                                        dhvVar2 = (dhv) aqjn.Z(list3);
                                                                    } else {
                                                                        dhvVar2 = null;
                                                                    }
                                                                    if (!d.F(dhvVar, dhvVar2)) {
                                                                        cgqVar.k(dheVar.e, String.valueOf(dhvVar2));
                                                                    }
                                                                    j4 >>= 8;
                                                                    i15++;
                                                                    objArr6 = objArr2;
                                                                    jArr7 = jArr4;
                                                                    ddvVar3 = ddvVar2;
                                                                }
                                                            } else {
                                                                jArr4 = jArr7;
                                                                objArr2 = objArr6;
                                                            }
                                                            ddvVar2 = ddvVar3;
                                                            j4 >>= 8;
                                                            i15++;
                                                            objArr6 = objArr2;
                                                            jArr7 = jArr4;
                                                            ddvVar3 = ddvVar2;
                                                        }
                                                        jArr3 = jArr7;
                                                        objArr = objArr6;
                                                        ddvVar = ddvVar3;
                                                        i4 = 8;
                                                        if (i14 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr3 = jArr7;
                                                        objArr = objArr6;
                                                        ddvVar = ddvVar3;
                                                    }
                                                    if (i13 == length3) {
                                                        break;
                                                    }
                                                    i13++;
                                                    i7 = i2;
                                                    i8 = i3;
                                                    objArr6 = objArr;
                                                    jArr7 = jArr3;
                                                    ddvVar3 = ddvVar;
                                                }
                                            }
                                            i2 = i7;
                                            i3 = i8;
                                        }
                                        i4 = 8;
                                    } else {
                                        csg.a("no value for specified key");
                                        throw new armj();
                                    }
                                } else {
                                    txVar2 = a2;
                                    iArr2 = iArr3;
                                    jArr2 = jArr5;
                                    i = length;
                                    i2 = i7;
                                    i3 = i8;
                                    i4 = i5;
                                }
                                j2 >>= i4;
                                i8 = i3 + 1;
                                i5 = i4;
                                i7 = i2;
                                a2 = txVar2;
                                iArr3 = iArr2;
                                jArr5 = jArr2;
                                length = i;
                            }
                            txVar = a2;
                            iArr = iArr3;
                            jArr = jArr5;
                            int i16 = length;
                            if (i7 != i5) {
                                break;
                            } else {
                                length = i16;
                            }
                        } else {
                            txVar = a2;
                            iArr = iArr3;
                            jArr = jArr5;
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                        a2 = txVar;
                        iArr3 = iArr;
                        jArr5 = jArr;
                        c = 7;
                        j = -9187201950435737472L;
                        i5 = 8;
                    }
                }
                cgqVar.h.e();
                tx a3 = cgqVar.a();
                int[] iArr4 = a3.b;
                Object[] objArr7 = a3.c;
                long[] jArr8 = a3.a;
                int length4 = jArr8.length - 2;
                if (length4 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j5 = jArr8[i17];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8 - ((~(i17 - length4)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j5 & 255) < 128) {
                                    int i20 = (i17 << 3) + i19;
                                    cgqVar.h.f(iArr4[i20], new ddv(((ddw) objArr7[i20]).a, cgqVar.a()));
                                }
                                j5 >>= 8;
                            }
                            if (i18 != 8) {
                                break;
                            }
                        }
                        if (i17 == length4) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                cgqVar.e = new ddv(cgqVar.a.j.a(), cgqVar.a());
                cgqVar.f = false;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cgq$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        /* synthetic */ Object a;
        int c;
        cgq d;
        aryz e;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return cgq.this.b(this);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final a a;
        public static final a b;
        private static final /* synthetic */ a[] c;

        static {
            a aVar = new a("SHOW_ORIGINAL", 0);
            a = aVar;
            a aVar2 = new a("SHOW_TRANSLATED", 1);
            b = aVar2;
            a[] aVarArr = {aVar, aVar2};
            c = aVarArr;
            arhi.f(aVarArr);
        }

        private a(String str, int i) {
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b {
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
        
            r4 = r4.getValue("android:text");
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        
            r4 = r4.getText();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void a(defpackage.cgq r6, android.util.LongSparseArray r7) {
            /*
                int r0 = r7.size()
                r1 = 0
            L5:
                if (r1 >= r0) goto L5a
                long r2 = r7.keyAt(r1)
                java.lang.Object r4 = r7.get(r2)
                android.view.translation.ViewTranslationResponse r4 = defpackage.aej$$ExternalSyntheticApiModelOutline0.m39m(r4)
                if (r4 == 0) goto L57
                java.lang.String r5 = "android:text"
                android.view.translation.TranslationResponseValue r4 = defpackage.aej$$ExternalSyntheticApiModelOutline0.m(r4, r5)
                if (r4 == 0) goto L57
                java.lang.CharSequence r4 = defpackage.aej$$ExternalSyntheticApiModelOutline0.m(r4)
                if (r4 == 0) goto L57
                tx r5 = r6.a()
                int r2 = (int) r2
                java.lang.Object r2 = r5.a(r2)
                ddw r2 = (defpackage.ddw) r2
                if (r2 == 0) goto L57
                dhe r2 = r2.a
                if (r2 == 0) goto L57
                dhn r3 = defpackage.dgx.a
                dgy r2 = r2.c
                dhn r3 = defpackage.dgx.j
                java.lang.Object r2 = defpackage.dgz.a(r2, r3)
                dgn r2 = (defpackage.dgn) r2
                if (r2 == 0) goto L57
                armh r2 = r2.b
                arqr r2 = (defpackage.arqr) r2
                if (r2 == 0) goto L57
                dhv r3 = new dhv
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                java.lang.Object r2 = r2.a(r3)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
            L57:
                int r1 = r1 + 1
                goto L5
            L5a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cgq.b.a(cgq, android.util.LongSparseArray):void");
        }
    }

    public cgq(dai daiVar, arqg arqgVar) {
        this.a = daiVar;
        this.i = arqgVar;
        this.e = new ddv(daiVar.j.a(), ty.a());
    }

    private final void n(int i) {
        if (this.p.b(i)) {
            this.p.d(i);
        } else {
            this.q.d(i);
        }
    }

    private final void o() {
        ViewStructure newViewStructure;
        ViewStructure newViewStructure2;
        ViewStructure newViewStructure3;
        ViewStructure newViewStructure4;
        dfr dfrVar = this.j;
        if (dfrVar != null && Build.VERSION.SDK_INT >= 29) {
            char c = 7;
            if (this.p.e != 0) {
                ArrayList arrayList = new ArrayList();
                tx txVar = this.p;
                Object[] objArr = txVar.c;
                long[] jArr = txVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        long[] jArr2 = jArr;
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((j & 255) < 128) {
                                    arrayList.add((dft) objArr[(i << 3) + i3]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                        jArr = jArr2;
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add(((dft) arrayList.get(i4)).a);
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    aei$$ExternalSyntheticApiModelOutline0.m25m(dfrVar.a).notifyViewsAppeared(arrayList2);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    newViewStructure3 = aei$$ExternalSyntheticApiModelOutline0.m25m(dfrVar.a).newViewStructure(dfrVar.b);
                    newViewStructure3.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    aei$$ExternalSyntheticApiModelOutline0.m25m(dfrVar.a).notifyViewAppeared(newViewStructure3);
                    for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                        aei$$ExternalSyntheticApiModelOutline0.m25m(dfrVar.a).notifyViewAppeared((ViewStructure) arrayList2.get(i5));
                    }
                    newViewStructure4 = aei$$ExternalSyntheticApiModelOutline0.m25m(dfrVar.a).newViewStructure(dfrVar.b);
                    newViewStructure4.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
                    aei$$ExternalSyntheticApiModelOutline0.m25m(dfrVar.a).notifyViewAppeared(newViewStructure4);
                }
                this.p.e();
            }
            if (this.q.d != 0) {
                ArrayList arrayList3 = new ArrayList();
                tz tzVar = this.q;
                int[] iArr = tzVar.b;
                long[] jArr3 = tzVar.a;
                int length2 = jArr3.length - 2;
                if (length2 >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j2 = jArr3[i6];
                        int i7 = length2;
                        if ((((~j2) << c) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i6 - i7)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((j2 & 255) < 128) {
                                    arrayList3.add(Integer.valueOf(iArr[(i6 << 3) + i9]));
                                }
                                j2 >>= 8;
                            }
                            if (i8 != 8) {
                                break;
                            }
                        }
                        if (i6 == i7) {
                            break;
                        }
                        i6++;
                        length2 = i7;
                        c = 7;
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    arrayList4.add(Long.valueOf(((Number) arrayList3.get(i10)).intValue()));
                }
                long[] jArr4 = new long[arrayList4.size()];
                Iterator it = arrayList4.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    jArr4[i11] = ((Number) it.next()).longValue();
                    i11++;
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    aei$$ExternalSyntheticApiModelOutline0.m25m(dfrVar.a).notifyViewsDisappeared(bl$$ExternalSyntheticApiModelOutline0.m94m(dfs.a(dfrVar.b).a), jArr4);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    newViewStructure = aei$$ExternalSyntheticApiModelOutline0.m25m(dfrVar.a).newViewStructure(dfrVar.b);
                    newViewStructure.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    aei$$ExternalSyntheticApiModelOutline0.m25m(dfrVar.a).notifyViewAppeared(newViewStructure);
                    aei$$ExternalSyntheticApiModelOutline0.m25m(dfrVar.a).notifyViewsDisappeared(bl$$ExternalSyntheticApiModelOutline0.m94m(dfs.a(dfrVar.b).a), jArr4);
                    newViewStructure2 = aei$$ExternalSyntheticApiModelOutline0.m25m(dfrVar.a).newViewStructure(dfrVar.b);
                    newViewStructure2.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
                    aei$$ExternalSyntheticApiModelOutline0.m25m(dfrVar.a).notifyViewAppeared(newViewStructure2);
                }
                this.q.b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        if (r8 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021d, code lost:
    
        if (((((~r11) << 6) & r11) & (-9187201950435737472L)) == 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x021f, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void p(defpackage.dhe r20) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgq.p(dhe):void");
    }

    private final void q(dhe dheVar) {
        if (m()) {
            n(dheVar.e);
            List i = dheVar.i();
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                q((dhe) i.get(i2));
            }
        }
    }

    public final tx a() {
        if (this.c) {
            this.c = false;
            this.n = ddx.b(this.a.j);
            this.o = System.currentTimeMillis();
        }
        return this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x002a, B:13:0x004a, B:17:0x0057, B:19:0x005f, B:21:0x0068, B:22:0x006b, B:24:0x006f, B:25:0x0078, B:34:0x003c), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008b -> B:13:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.cgq.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            cgq$1 r0 = (defpackage.cgq.AnonymousClass1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgq$1 r0 = new cgq$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            aryz r2 = r0.e
            cgq r5 = r0.d
            defpackage.aqil.P(r9)     // Catch: java.lang.Throwable -> L2e
            goto L4a
        L2e:
            r9 = move-exception
            goto L99
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            aryz r2 = r0.e
            cgq r5 = r0.d
            defpackage.aqil.P(r9)     // Catch: java.lang.Throwable -> L2e
            goto L57
        L40:
            defpackage.aqil.P(r9)
            arzj r9 = r8.m     // Catch: java.lang.Throwable -> L97
            aryz r2 = r9.B()     // Catch: java.lang.Throwable -> L97
            r5 = r8
        L4a:
            r0.d = r5     // Catch: java.lang.Throwable -> L2e
            r0.e = r2     // Catch: java.lang.Throwable -> L2e
            r0.c = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = r2.a(r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L57
            return r1
        L57:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L8f
            r2.b()     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r5.m()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L6b
            r5.o()     // Catch: java.lang.Throwable -> L2e
        L6b:
            boolean r9 = r5.f     // Catch: java.lang.Throwable -> L2e
            if (r9 != 0) goto L78
            r5.f = r4     // Catch: java.lang.Throwable -> L2e
            android.os.Handler r9 = r5.d     // Catch: java.lang.Throwable -> L2e
            java.lang.Runnable r6 = r5.g     // Catch: java.lang.Throwable -> L2e
            r9.post(r6)     // Catch: java.lang.Throwable -> L2e
        L78:
            to r9 = r5.l     // Catch: java.lang.Throwable -> L2e
            r9.clear()     // Catch: java.lang.Throwable -> L2e
            long r6 = r5.k     // Catch: java.lang.Throwable -> L2e
            r0.d = r5     // Catch: java.lang.Throwable -> L2e
            r0.e = r2     // Catch: java.lang.Throwable -> L2e
            r0.c = r3     // Catch: java.lang.Throwable -> L2e
            r6 = 100
            java.lang.Object r9 = defpackage.arwi.m(r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 == r1) goto L8e
            goto L4a
        L8e:
            return r1
        L8f:
            to r9 = r5.l
            r9.clear()
            arnb r9 = defpackage.arnb.a
            return r9
        L97:
            r9 = move-exception
            r5 = r8
        L99:
            to r0 = r5.l
            r0.clear()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgq.b(arpe):java.lang.Object");
    }

    public final void c(cxn cxnVar) {
        if (this.l.add(cxnVar)) {
            this.m.c(arnb.a);
        }
    }

    @Override // defpackage.emx
    public final void h(enm enmVar) {
        this.j = (dfr) this.i.a();
        p(this.a.j.a());
        o();
    }

    @Override // defpackage.emx
    public final void i(enm enmVar) {
        q(this.a.j.a());
        o();
        this.j = null;
    }

    public final void j(dhe dheVar, ddv ddvVar) {
        int i;
        List i2 = dheVar.i();
        int size = i2.size();
        for (int i3 = 0; i3 < size; i3++) {
            dhe dheVar2 = (dhe) i2.get(i3);
            if (a().b(dheVar2.e) && !ddvVar.b.a(dheVar2.e)) {
                p(dheVar2);
            }
        }
        tx txVar = this.h;
        int[] iArr = txVar.b;
        long[] jArr = txVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j = jArr[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = i4 - length;
                    int i6 = 0;
                    while (true) {
                        i = 8 - ((~i5) >>> 31);
                        if (i6 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i7 = iArr[(i4 << 3) + i6];
                            if (!a().b(i7)) {
                                n(i7);
                            }
                        }
                        j >>= 8;
                        i6++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        List i8 = dheVar.i();
        int size2 = i8.size();
        for (int i9 = 0; i9 < size2; i9++) {
            dhe dheVar3 = (dhe) i8.get(i9);
            if (a().b(dheVar3.e) && this.h.b(dheVar3.e)) {
                Object a2 = this.h.a(dheVar3.e);
                if (a2 != null) {
                    j(dheVar3, (ddv) a2);
                } else {
                    csg.a("node not present in pruned tree before this change");
                    throw new armj();
                }
            }
        }
    }

    public final void k(int i, String str) {
        dfr dfrVar;
        if (Build.VERSION.SDK_INT >= 29 && (dfrVar = this.j) != null) {
            AutofillId a2 = dfrVar.a(i);
            if (a2 != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    aei$$ExternalSyntheticApiModelOutline0.m25m(dfrVar.a).notifyViewTextChanged(a2, str);
                    return;
                }
                return;
            }
            csg.a("Invalid content capture ID");
            throw new armj();
        }
    }

    public final void l(dhe dheVar, ddv ddvVar) {
        tz tzVar = new tz(dheVar.i().size());
        List i = dheVar.i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            dhe dheVar2 = (dhe) i.get(i2);
            if (a().b(dheVar2.e)) {
                if (!ddvVar.b.a(dheVar2.e)) {
                    c(dheVar.b);
                    return;
                }
                tzVar.d(dheVar2.e);
            }
        }
        tz tzVar2 = ddvVar.b;
        int[] iArr = tzVar2.b;
        long[] jArr = tzVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 < i6) {
                            if ((255 & j) < 128 && !tzVar.a(iArr[(i3 << 3) + i5])) {
                                c(dheVar.b);
                                return;
                            } else {
                                j >>= 8;
                                i5++;
                            }
                        } else if (i6 != 8) {
                            break;
                        }
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List i7 = dheVar.i();
        int size2 = i7.size();
        for (int i8 = 0; i8 < size2; i8++) {
            dhe dheVar3 = (dhe) i7.get(i8);
            if (a().b(dheVar3.e)) {
                Object a2 = this.h.a(dheVar3.e);
                if (a2 != null) {
                    l(dheVar3, (ddv) a2);
                } else {
                    csg.a("node not present in pruned tree before this change");
                    throw new armj();
                }
            }
        }
    }

    public final boolean m() {
        if (this.j != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.d.removeCallbacks(this.g);
        this.j = null;
    }

    @Override // defpackage.emx
    public final /* synthetic */ void d(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gF(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
