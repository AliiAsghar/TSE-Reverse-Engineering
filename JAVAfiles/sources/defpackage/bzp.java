package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzp extends arpw implements arqw<arwe, byd, arpe<? super arnb>, Object> {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    Object h;
    int i;
    /* synthetic */ Object j;
    final /* synthetic */ bzj k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bzp$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<Long, arnb> {
        final /* synthetic */ bzj a;
        final /* synthetic */ List b;
        final /* synthetic */ List c;
        final /* synthetic */ List d;
        final /* synthetic */ Set e;
        final /* synthetic */ vh f;
        final /* synthetic */ vh g;
        final /* synthetic */ vh h;
        final /* synthetic */ vh i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bzj bzjVar, vh vhVar, vh vhVar2, List list, List list2, vh vhVar3, List list3, vh vhVar4, Set set) {
            super(1);
            this.a = bzjVar;
            this.f = vhVar;
            this.g = vhVar2;
            this.b = list;
            this.c = list2;
            this.h = vhVar3;
            this.d = list3;
            this.i = vhVar4;
            this.e = set;
        }

        /* JADX WARN: Removed duplicated region for block: B:80:0x029b  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x02a1  */
        @Override // defpackage.arqr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* synthetic */ java.lang.Object a(java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 894
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bzp.AnonymousClass1.a(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzp(bzj bzjVar, arpe arpeVar) {
        super(3, arpeVar);
        this.k = bzjVar;
    }

    public static final void d(List list, bzj bzjVar) {
        list.clear();
        synchronized (bzjVar.d) {
            List list2 = bzjVar.h;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list.add((byi) list2.get(i));
            }
            bzjVar.h.clear();
        }
    }

    public static final void e(bzj bzjVar, List list, List list2, List list3, vh vhVar, vh vhVar2, vh vhVar3, vh vhVar4) {
        synchronized (bzjVar.d) {
            list.clear();
            list2.clear();
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                bxc bxcVar = (bxc) list3.get(i);
                bxcVar.d();
                bzjVar.w(bxcVar);
            }
            list3.clear();
            Object[] objArr = vhVar.b;
            long[] jArr = vhVar.a;
            int length = jArr.length - 2;
            long j = -9187201950435737472L;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    long[] jArr2 = jArr;
                    if ((((~j2) << 7) & j2 & j) != j) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((j2 & 255) < 128) {
                                bxc bxcVar2 = (bxc) objArr[(i2 << 3) + i4];
                                bxcVar2.d();
                                bzjVar.w(bxcVar2);
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    jArr = jArr2;
                    j = -9187201950435737472L;
                }
            }
            vhVar.d();
            Object[] objArr2 = vhVar2.b;
            long[] jArr3 = vhVar2.a;
            int length2 = jArr3.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j3 = jArr3[i5];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j3 & 255) < 128) {
                                ((bxc) objArr2[(i5 << 3) + i7]).h();
                            }
                            j3 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length2) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            vhVar2.d();
            vhVar3.d();
            Object[] objArr3 = vhVar4.b;
            long[] jArr4 = vhVar4.a;
            int length3 = jArr4.length - 2;
            if (length3 >= 0) {
                int i8 = 0;
                while (true) {
                    long j4 = jArr4[i8];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length3)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j4 & 255) < 128) {
                                bxc bxcVar3 = (bxc) objArr3[(i8 << 3) + i10];
                                bxcVar3.d();
                                bzjVar.w(bxcVar3);
                            }
                            j4 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        }
                    }
                    if (i8 == length3) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            vhVar4.d();
        }
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bzp bzpVar = new bzp(this.k, (arpe) obj3);
        bzpVar.j = (byd) obj2;
        return bzpVar.b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, byd] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0157 -> B:5:0x0161). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0217 -> B:31:0x0088). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzp.b(java.lang.Object):java.lang.Object");
    }
}
