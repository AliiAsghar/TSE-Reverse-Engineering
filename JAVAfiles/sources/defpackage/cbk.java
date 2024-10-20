package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbk<Key, Scope> {
    public static final void a(ve veVar, Object obj, Object obj2) {
        boolean z;
        Object obj3;
        int f = veVar.f(obj);
        if (f < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            obj3 = null;
        } else {
            obj3 = veVar.c[f];
        }
        if (obj3 != null) {
            if (obj3 instanceof vh) {
                ((vh) obj3).j(obj2);
            } else if (obj3 != obj2) {
                vh vhVar = new vh((byte[]) null);
                vhVar.j(obj3);
                vhVar.j(obj2);
                obj2 = vhVar;
            }
            obj2 = obj3;
        }
        if (z) {
            int i = ~f;
            veVar.b[i] = obj;
            veVar.c[i] = obj2;
            return;
        }
        veVar.c[f] = obj2;
    }

    public static final void b(ve veVar, Object obj) {
        int i;
        long[] jArr = veVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj2 = veVar.b[i5];
                            Object obj3 = veVar.c[i5];
                            if (obj3 instanceof vh) {
                                obj3.getClass();
                                vh vhVar = (vh) obj3;
                                vhVar.l(obj);
                                if (!vhVar.b()) {
                                }
                                veVar.h(i5);
                            } else {
                                if (obj3 != obj) {
                                }
                                veVar.h(i5);
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public static final boolean c(ve veVar, Object obj, Object obj2) {
        Object a = veVar.a(obj);
        if (a == null) {
            return false;
        }
        if (a instanceof vh) {
            vh vhVar = (vh) a;
            boolean l = vhVar.l(obj2);
            if (l && vhVar.b()) {
                veVar.g(obj);
                return true;
            }
            return l;
        }
        if (!d.F(a, obj2)) {
            return false;
        }
        veVar.g(obj);
        return true;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
