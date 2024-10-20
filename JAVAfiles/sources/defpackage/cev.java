package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cev implements Iterable<Integer>, arse {
    public static final cev a = new cev(0, 0, 0, null);
    public final long b;
    public final long c;
    public final int d;
    public final int[] e;

    /* compiled from: PG */
    /* renamed from: cev$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpv implements arqv<artz<? super Integer>, arpe<? super arnb>, Object> {
        Object a;
        int b;
        int c;
        int d;
        private /* synthetic */ Object f;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((artz) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x00d3, code lost:
        
            r2 = r8;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00ab  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0080 -> B:18:0x009a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0096 -> B:18:0x009a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0065 -> B:30:0x0068). Please report as a decompilation issue!!! */
        @Override // defpackage.arpq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.cev.AnonymousClass1.b(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(arpeVar);
            anonymousClass1.f = obj;
            return anonymousClass1;
        }
    }

    private cev(long j, long j2, int i, int[] iArr) {
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = iArr;
    }

    public final cev a(cev cevVar) {
        cev cevVar2 = a;
        if (cevVar == cevVar2) {
            return this;
        }
        if (this == cevVar2) {
            return cevVar2;
        }
        int i = cevVar.d;
        int i2 = this.d;
        if (i == i2) {
            int[] iArr = cevVar.e;
            int[] iArr2 = this.e;
            if (iArr == iArr2) {
                return new cev((~cevVar.b) & this.b, this.c & (~cevVar.c), i2, iArr2);
            }
        }
        int[] iArr3 = cevVar.e;
        cev cevVar3 = this;
        if (iArr3 != null) {
            for (int i3 : iArr3) {
                cevVar3 = cevVar3.b(i3);
            }
        }
        if (cevVar.c != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if ((cevVar.c & (1 << i4)) != 0) {
                    cevVar3 = cevVar3.b(cevVar.d + i4);
                }
            }
        }
        cev cevVar4 = cevVar3;
        if (cevVar.b != 0) {
            for (int i5 = 0; i5 < 64; i5++) {
                if ((cevVar.b & (1 << i5)) != 0) {
                    cevVar4 = cevVar4.b(i5 + 64 + cevVar.d);
                }
            }
            return cevVar4;
        }
        return cevVar4;
    }

    public final cev b(int i) {
        int[] iArr;
        int a2;
        int[] iArr2;
        int i2 = this.d;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.c;
            if ((j2 & j) != 0) {
                return new cev(this.b, (~j) & j2, i2, this.e);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.b;
            if ((j4 & j3) != 0) {
                return new cev(j4 & (~j3), this.c, i2, this.e);
            }
        } else if (i3 < 0 && (iArr = this.e) != null && (a2 = cew.a(iArr, i)) >= 0) {
            int length = iArr.length;
            int i4 = length - 1;
            if (i4 == 0) {
                iArr2 = null;
            } else {
                int[] iArr3 = new int[i4];
                if (a2 > 0) {
                    aqil.x(iArr, iArr3, 0, 0, a2);
                }
                if (a2 < i4) {
                    aqil.x(iArr, iArr3, a2, a2 + 1, length);
                }
                iArr2 = iArr3;
            }
            return new cev(this.b, this.c, this.d, iArr2);
        }
        return this;
    }

    public final cev c(cev cevVar) {
        cev cevVar2 = a;
        if (cevVar == cevVar2) {
            return this;
        }
        if (this == cevVar2) {
            return cevVar;
        }
        int i = cevVar.d;
        int i2 = this.d;
        if (i == i2) {
            int[] iArr = cevVar.e;
            int[] iArr2 = this.e;
            if (iArr == iArr2) {
                return new cev(cevVar.b | this.b, cevVar.c | this.c, i2, iArr2);
            }
        }
        int i3 = 0;
        if (this.e == null) {
            if (this.c != 0) {
                for (int i4 = 0; i4 < 64; i4++) {
                    if ((this.c & (1 << i4)) != 0) {
                        cevVar = cevVar.d(this.d + i4);
                    }
                }
            }
            cev cevVar3 = cevVar;
            if (this.b != 0) {
                while (i3 < 64) {
                    if ((this.b & (1 << i3)) != 0) {
                        cevVar3 = cevVar3.d(i3 + 64 + this.d);
                    }
                    i3++;
                }
                return cevVar3;
            }
            return cevVar3;
        }
        int[] iArr3 = cevVar.e;
        cev cevVar4 = this;
        if (iArr3 != null) {
            for (int i5 : iArr3) {
                cevVar4 = cevVar4.d(i5);
            }
        }
        if (cevVar.c != 0) {
            for (int i6 = 0; i6 < 64; i6++) {
                if ((cevVar.c & (1 << i6)) != 0) {
                    cevVar4 = cevVar4.d(cevVar.d + i6);
                }
            }
        }
        if (cevVar.b != 0) {
            while (i3 < 64) {
                if ((cevVar.b & (1 << i3)) != 0) {
                    cevVar4 = cevVar4.d(i3 + 64 + cevVar.d);
                }
                i3++;
            }
            return cevVar4;
        }
        return cevVar4;
    }

    public final cev d(int i) {
        int i2;
        int[] iArr;
        int i3 = this.d;
        int i4 = i - i3;
        long j = 0;
        if (i4 >= 0 && i4 < 64) {
            long j2 = 1 << i4;
            long j3 = this.c;
            if ((j3 & j2) == 0) {
                return new cev(this.b, j3 | j2, i3, this.e);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j4 = 1 << (i4 - 64);
            long j5 = this.b;
            if ((j5 & j4) == 0) {
                return new cev(j5 | j4, this.c, i3, this.e);
            }
        } else if (i4 >= 128) {
            if (!e(i)) {
                long j6 = this.b;
                long j7 = this.c;
                int i5 = this.d;
                int i6 = ((i + 1) / 64) * 64;
                ArrayList arrayList = null;
                long j8 = j7;
                long j9 = j6;
                while (true) {
                    if (i5 < i6) {
                        if (j8 != j) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                int[] iArr2 = this.e;
                                if (iArr2 != null) {
                                    for (int i7 : iArr2) {
                                        arrayList.add(Integer.valueOf(i7));
                                    }
                                }
                            }
                            for (int i8 = 0; i8 < 64; i8++) {
                                if (((1 << i8) & j8) != 0) {
                                    arrayList.add(Integer.valueOf(i8 + i5));
                                }
                            }
                            j = 0;
                        }
                        if (j9 == j) {
                            i2 = i6;
                            j8 = j;
                            break;
                        }
                        i5 += 64;
                        j8 = j9;
                        j9 = j;
                    } else {
                        i2 = i5;
                        break;
                    }
                }
                if (arrayList != null) {
                    iArr = aqjn.aI(arrayList);
                } else {
                    iArr = this.e;
                }
                return new cev(j9, j8, i2, iArr).d(i);
            }
        } else {
            int[] iArr3 = this.e;
            if (iArr3 == null) {
                return new cev(this.b, this.c, i3, new int[]{i});
            }
            int a2 = cew.a(iArr3, i);
            if (a2 < 0) {
                int length = iArr3.length;
                int[] iArr4 = new int[length + 1];
                int i9 = -(a2 + 1);
                aqil.x(iArr3, iArr4, 0, 0, i9);
                aqil.x(iArr3, iArr4, i9 + 1, i9, length);
                iArr4[i9] = i;
                return new cev(this.b, this.c, this.d, iArr4);
            }
        }
        return this;
    }

    public final boolean e(int i) {
        int[] iArr;
        int i2 = i - this.d;
        if (i2 >= 0 && i2 < 64) {
            if (((1 << i2) & this.c) != 0) {
                return true;
            }
            return false;
        }
        if (i2 >= 64 && i2 < 128) {
            if (((1 << (i2 - 64)) & this.b) != 0) {
                return true;
            }
            return false;
        }
        if (i2 <= 0 && (iArr = this.e) != null && cew.a(iArr, i) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new een(new AnonymousClass1(null), 4).a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(aqjn.J(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null && !(obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    sb2.append(((Character) obj).charValue());
                } else {
                    sb2.append((CharSequence) obj.toString());
                }
            } else {
                sb2.append((CharSequence) obj);
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
