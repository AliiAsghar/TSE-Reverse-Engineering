package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class byw {
    public final List a;
    public final int b;
    public int c;
    public final List d;
    public final arml e;
    public final tx f;

    /* compiled from: PG */
    /* renamed from: byw$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<bym<Object, bxw>> {
        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r5v2, types: [bxw, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v5 */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object[]] */
        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            Object valueOf;
            boolean z;
            Object obj;
            ve veVar = new ve(byw.this.a.size());
            byw bywVar = byw.this;
            int size = bywVar.a.size();
            for (int i = 0; i < size; i++) {
                ?? r5 = (bxw) bywVar.a.get(i);
                if (r5.b != null) {
                    valueOf = new bxv(Integer.valueOf(r5.a), r5.b);
                } else {
                    valueOf = Integer.valueOf(r5.a);
                }
                int f = veVar.f(valueOf);
                if (f < 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    obj = null;
                } else {
                    obj = veVar.c[f];
                }
                if (obj != null) {
                    if (arsd.e(obj)) {
                        List b = arsd.b(obj);
                        b.add(r5);
                        r5 = b;
                    } else {
                        r5 = aqjn.D(new Object[]{obj, r5});
                    }
                }
                if (z) {
                    int i2 = ~f;
                    veVar.b[i2] = valueOf;
                    veVar.c[i2] = r5;
                } else {
                    veVar.c[f] = r5;
                }
            }
            return new bym(veVar);
        }
    }

    public byw(List list, int i) {
        this.a = list;
        this.b = i;
        if (i < 0) {
            byy.a("Invalid start index");
        }
        this.d = new ArrayList();
        tx txVar = new tx((byte[]) null);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            bxw bxwVar = (bxw) this.a.get(i3);
            txVar.f(bxwVar.c, new bxo(i3, i2, bxwVar.d));
            i2 += bxwVar.d;
        }
        this.f = txVar;
        this.e = armd.a(new AnonymousClass1());
    }

    public final int a(bxw bxwVar) {
        bxo bxoVar = (bxo) this.f.a(bxwVar.c);
        if (bxoVar != null) {
            return bxoVar.b;
        }
        return -1;
    }

    public final int b(bxw bxwVar) {
        bxo bxoVar = (bxo) this.f.a(bxwVar.c);
        if (bxoVar != null) {
            return bxoVar.c;
        }
        return bxwVar.d;
    }

    public final void c(bxw bxwVar, int i) {
        this.f.f(bxwVar.c, new bxo(-1, i, 0));
    }

    public final boolean d(int i, int i2) {
        int i3;
        int i4;
        bxo bxoVar = (bxo) this.f.a(i);
        if (bxoVar == null) {
            return false;
        }
        int i5 = bxoVar.b;
        int i6 = i2 - bxoVar.c;
        bxoVar.c = i2;
        if (i6 != 0) {
            tx txVar = this.f;
            Object[] objArr = txVar.c;
            long[] jArr = txVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j = jArr[i7];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = i7 - length;
                        int i9 = 0;
                        while (true) {
                            i3 = 8 - ((~i8) >>> 31);
                            if (i9 >= i3) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                bxo bxoVar2 = (bxo) objArr[(i7 << 3) + i9];
                                if (bxoVar2.b >= i5 && !d.F(bxoVar2, bxoVar) && (i4 = bxoVar2.b + i6) >= 0) {
                                    bxoVar2.b = i4;
                                }
                            }
                            j >>= 8;
                            i9++;
                        }
                        if (i3 != 8) {
                            return true;
                        }
                    }
                    if (i7 != length) {
                        i7++;
                    } else {
                        return true;
                    }
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public final void e(bxw bxwVar) {
        this.d.add(bxwVar);
    }
}
