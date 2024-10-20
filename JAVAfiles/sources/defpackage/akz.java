package defpackage;

import defpackage.ajw;
import defpackage.akx;
import defpackage.cfq;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akz {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: akz$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ ajw.b b;
        final /* synthetic */ ajw.e c;
        final /* synthetic */ cfq.c d;
        final /* synthetic */ int e;
        final /* synthetic */ int f;
        final /* synthetic */ aln g;
        final /* synthetic */ arqw h;
        final /* synthetic */ int i;
        final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cga cgaVar, ajw.b bVar, ajw.e eVar, cfq.c cVar, int i, int i2, aln alnVar, arqw arqwVar, int i3, int i4) {
            super(2);
            this.a = cgaVar;
            this.b = bVar;
            this.c = eVar;
            this.d = cVar;
            this.e = i;
            this.f = i2;
            this.g = alnVar;
            this.h = arqwVar;
            this.i = i3;
            this.j = i4;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            akz.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (bwj) obj, bzh.a(this.i | 1), this.j);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: akz$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqw a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arqw arqwVar) {
            super(2);
            this.a = arqwVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                this.a.a(alp.a, bwjVar, 6);
            }
            return arnb.a;
        }
    }

    static {
        int i = cfq.a;
    }

    public static final cuc a(Iterator it, alj aljVar) {
        try {
            if (!(it instanceof akq)) {
                return (cuc) it.next();
            }
            aljVar.getClass();
            throw null;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x019a, code lost:
    
        if (r12 == bwj.a.a) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.cga r17, ajw.b r18, ajw.e r19, cfq.c r20, int r21, int r22, defpackage.aln r23, defpackage.arqw r24, defpackage.bwj r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akz.b(cga, ajw$b, ajw$e, cfq$c, int, int, aln, arqw, bwj, int, int):void");
    }

    public static final int c(ctc ctcVar, int i) {
        return ctcVar.c(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long d(List list, arqw arqwVar, arqw arqwVar2, int i, int i2, int i3, ali aliVar) {
        int i4;
        boolean z;
        int i5;
        boolean z2;
        tu tuVar;
        int i6;
        int i7;
        int i8;
        boolean z3;
        int i9;
        tu tuVar2;
        int i10;
        int i11;
        int i12 = 0;
        if (!list.isEmpty()) {
            akx akxVar = new akx(aliVar, dqt.d(0, i, 0, Integer.MAX_VALUE), i2, i3);
            ctc ctcVar = (ctc) aqjn.aa(list, 0);
            if (ctcVar != null) {
                i4 = ((Number) arqwVar2.a(ctcVar, 0, Integer.valueOf(i))).intValue();
            } else {
                i4 = 0;
            }
            int i13 = 1;
            if (ctcVar != null) {
                z = false;
            } else {
                z = true;
            }
            if (ctcVar != null) {
                i5 = ((Number) arqwVar.a(ctcVar, 0, Integer.valueOf(i4))).intValue();
            } else {
                i5 = 0;
            }
            if (list.size() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            long c = tu.c(i, Integer.MAX_VALUE);
            if (ctcVar == null) {
                tuVar = null;
            } else {
                tuVar = new tu(tu.c(i5, i4));
            }
            if (akxVar.b(z2, 0, c, tuVar, 0, 0, 0, false, false).b) {
                tu a2 = aliVar.a(!z, 0, 0);
                if (a2 != null) {
                    i11 = tu.b(a2.a);
                } else {
                    i11 = 0;
                }
                return tu.c(i11, 0);
            }
            int size = list.size();
            int i14 = i;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (i15 >= size) {
                    break;
                }
                int i21 = i14 - i5;
                int i22 = i15 + 1;
                int max = Math.max(i17, i4);
                ctc ctcVar2 = (ctc) aqjn.aa(list, i22);
                if (ctcVar2 != null) {
                    i6 = ((Number) arqwVar2.a(ctcVar2, Integer.valueOf(i22), Integer.valueOf(i))).intValue();
                } else {
                    i6 = i12;
                }
                if (ctcVar2 != null) {
                    i7 = i12;
                } else {
                    i7 = i13;
                }
                if (ctcVar2 != null) {
                    i8 = ((Number) arqwVar.a(ctcVar2, Integer.valueOf(i22), Integer.valueOf(i6))).intValue() + i2;
                } else {
                    i8 = i12;
                }
                if (i15 + 2 < list.size()) {
                    z3 = i13;
                } else {
                    z3 = i12;
                }
                int i23 = i22 - i19;
                long c2 = tu.c(i21, Integer.MAX_VALUE);
                if (ctcVar2 == null) {
                    i9 = size;
                    tuVar2 = null;
                } else {
                    i9 = size;
                    tuVar2 = new tu(tu.c(i8, i6));
                }
                akx.b b = akxVar.b(z3, i23, c2, tuVar2, i20, i16, max, false, false);
                if (b.a) {
                    i16 += max + i3;
                    i10 = 1;
                    akx.a a3 = akxVar.a(b, i7 ^ 1, i20, i16, i21, i23);
                    int i24 = i8 - i2;
                    i20++;
                    if (b.b) {
                        if (a3 != null && !a3.d) {
                            i16 += tu.b(a3.c) + i3;
                        }
                        i18 = i22;
                    } else {
                        i14 = i;
                        i19 = i22;
                        i5 = i24;
                        i17 = 0;
                    }
                } else {
                    i10 = 1;
                    i17 = max;
                    i14 = i21;
                    i5 = i8;
                }
                size = i9;
                i4 = i6;
                i15 = i22;
                i18 = i15;
                i13 = i10;
                i12 = 0;
            }
            return tu.c(i16 - i3, i18);
        }
        return tu.c(0, 0);
    }

    public static final int e(ctc ctcVar, int i) {
        return ctcVar.d(i);
    }

    public static final long f(cuc cucVar, long j, arqr arqrVar) {
        if (amm.a(amm.b(cucVar)) == brg.a) {
            amm.b(cucVar);
            cvc e = cucVar.e(j);
            arqrVar.a(e);
            return tu.c(e.u(), e.t());
        }
        int e2 = e(cucVar, Integer.MAX_VALUE);
        return tu.c(e2, c(cucVar, e2));
    }
}
