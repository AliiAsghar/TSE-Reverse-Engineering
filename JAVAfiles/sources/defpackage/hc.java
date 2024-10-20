package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hc {
    private final List a;
    private final int[] b;
    private final int[] c;
    private final hb d;
    private final int e;
    private final int f;

    public hc(hb hbVar, List list, int[] iArr, int[] iArr2) {
        akrq akrqVar;
        int i;
        int i2;
        this.a = list;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = hbVar;
        int b = hbVar.b();
        this.e = b;
        int a = hbVar.a();
        this.f = a;
        if (list.isEmpty()) {
            akrqVar = null;
        } else {
            akrqVar = (akrq) list.get(0);
        }
        if (akrqVar == null || akrqVar.b != 0 || akrqVar.c != 0) {
            list.add(0, new akrq(0, 0, 0, (byte[]) null, (byte[]) null));
        }
        list.add(new akrq(b, a, 0, (byte[]) null, (byte[]) null));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            akrq akrqVar2 = (akrq) it.next();
            for (int i3 = 0; i3 < akrqVar2.a; i3++) {
                int i4 = akrqVar2.b + i3;
                int i5 = akrqVar2.c + i3;
                if (true != this.d.d(i4, i5)) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                this.b[i4] = (i5 << 4) | i2;
                this.c[i5] = (i4 << 4) | i2;
            }
        }
        int i6 = 0;
        for (akrq akrqVar3 : this.a) {
            while (i6 < akrqVar3.b) {
                if (this.b[i6] == 0) {
                    int size = this.a.size();
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        if (i7 < size) {
                            akrq akrqVar4 = (akrq) this.a.get(i7);
                            while (i8 < akrqVar4.c) {
                                if (this.c[i8] == 0 && this.d.e(i6, i8)) {
                                    if (true != this.d.d(i6, i8)) {
                                        i = 4;
                                    } else {
                                        i = 8;
                                    }
                                    this.b[i6] = (i8 << 4) | i;
                                    this.c[i8] = i | (i6 << 4);
                                } else {
                                    i8++;
                                }
                            }
                            i8 = akrqVar4.b();
                            i7++;
                        }
                    }
                }
                i6++;
            }
            i6 = akrqVar3.a();
        }
    }

    private static frp c(Collection collection, int i, boolean z) {
        frp frpVar;
        Iterator it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                frpVar = (frp) it.next();
                if (frpVar.a == i && frpVar.b == z) {
                    it.remove();
                    break;
                }
            } else {
                frpVar = null;
                break;
            }
        }
        while (it.hasNext()) {
            frp frpVar2 = (frp) it.next();
            if (z) {
                frpVar2.c--;
            } else {
                frpVar2.c++;
            }
        }
        return frpVar;
    }

    public final int a(int i) {
        if (i >= 0 && i < this.e) {
            int i2 = this.b[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }
        throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.e);
    }

    public final void b(hh hhVar) {
        ha haVar;
        int i;
        if (hhVar instanceof ha) {
            haVar = (ha) hhVar;
        } else {
            haVar = new ha(hhVar);
        }
        int i2 = this.e;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = this.e;
        int i4 = this.f;
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                akrq akrqVar = (akrq) this.a.get(size);
                int a = akrqVar.a();
                int b = akrqVar.b();
                while (true) {
                    if (i3 <= a) {
                        break;
                    }
                    i3--;
                    int i5 = this.b[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        frp c = c(arrayDeque, i6, false);
                        if (c != null) {
                            int i7 = (i2 - c.c) - 1;
                            haVar.c(i3, i7);
                            if ((i5 & 4) != 0) {
                                haVar.a(i7, 1, this.d.c(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new frp(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        haVar.d(i3, 1);
                        i2--;
                    }
                }
                while (i4 > b) {
                    i4--;
                    int i8 = this.c[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        if (c(arrayDeque, i9, true) == null) {
                            arrayDeque.add(new frp(i4, i2 - i3, false));
                        } else {
                            haVar.c((i2 - r11.c) - 1, i3);
                            if ((i8 & 4) != 0) {
                                haVar.a(i3, 1, this.d.c(i9, i4));
                            }
                        }
                    } else {
                        haVar.b(i3, 1);
                        i2++;
                    }
                }
                int i10 = akrqVar.b;
                int i11 = akrqVar.c;
                for (i = 0; i < akrqVar.a; i++) {
                    if ((this.b[i10] & 15) == 2) {
                        haVar.a(i10, 1, this.d.c(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = akrqVar.b;
                i4 = akrqVar.c;
            } else {
                haVar.e();
                return;
            }
        }
    }
}
