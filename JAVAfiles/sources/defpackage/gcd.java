package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcd {
    public final gcn a;
    public final List b;
    public final List c;
    public int d;
    public int e;
    public int f;
    public final arzj g;
    public final arzj h;
    public final Map i;
    public final pa j;
    private int k;
    private int l;

    public gcd(gcn gcnVar) {
        this.a = gcnVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = arrayList;
        this.g = arhi.t(-1, 0, 6);
        this.h = arhi.t(-1, 0, 6);
        this.i = new LinkedHashMap();
        pa paVar = new pa((byte[]) null);
        paVar.e(gbb.REFRESH, gax.a);
        this.j = paVar;
    }

    public final int a() {
        if (this.a.c) {
            return this.l;
        }
        return 0;
    }

    public final int b() {
        if (this.a.c) {
            return this.k;
        }
        return 0;
    }

    public final int c() {
        Iterator it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((gdj) it.next()).b.size();
        }
        return i;
    }

    public final gdl d(ged gedVar) {
        Integer num;
        int i;
        int size;
        List ax = aqjn.ax(this.c);
        if (gedVar != null) {
            int b = b();
            int i2 = -this.d;
            int z = aqjn.z(this.c) - this.d;
            int i3 = i2;
            while (true) {
                i = gedVar.a;
                if (i3 >= i) {
                    break;
                }
                if (i3 > z) {
                    size = this.a.a;
                } else {
                    size = ((gdj) this.c.get(this.d + i3)).b.size();
                }
                b += size;
                i3++;
            }
            int i4 = b + gedVar.b;
            if (i < i2) {
                i4 -= this.a.a;
            }
            num = Integer.valueOf(i4);
        } else {
            num = null;
        }
        return new gdl(ax, num, this.a, b());
    }

    public final void e(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.l = i;
    }

    public final void f(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.k = i;
    }

    public final boolean g(int i, gbb gbbVar, gdj gdjVar) {
        gbbVar.getClass();
        gdjVar.getClass();
        int ordinal = gbbVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (!this.c.isEmpty()) {
                        if (i != this.f) {
                            return false;
                        }
                        this.b.add(gdjVar);
                        int i2 = gdjVar.f;
                        if (i2 == Integer.MIN_VALUE) {
                            i2 = arrn.r(a() - gdjVar.b.size(), 0);
                        }
                        e(i2);
                        this.i.remove(gbb.APPEND);
                    } else {
                        throw new IllegalStateException("should've received an init before append");
                    }
                }
            } else if (!this.c.isEmpty()) {
                if (i != this.e) {
                    return false;
                }
                this.b.add(0, gdjVar);
                this.d++;
                int i3 = gdjVar.e;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = arrn.r(b() - gdjVar.b.size(), 0);
                }
                f(i3);
                this.i.remove(gbb.PREPEND);
            } else {
                throw new IllegalStateException("should've received an init before prepend");
            }
        } else if (this.c.isEmpty()) {
            if (i == 0) {
                this.b.add(gdjVar);
                this.d = 0;
                e(gdjVar.f);
                f(gdjVar.e);
            } else {
                throw new IllegalStateException("init loadId must be the initial value, 0");
            }
        } else {
            throw new IllegalStateException("cannot receive multiple init calls");
        }
        return true;
    }

    public final dyh h(gdj gdjVar, gbb gbbVar) {
        int i;
        gdjVar.getClass();
        gbbVar.getClass();
        int ordinal = gbbVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i = (this.c.size() - this.d) - 1;
                } else {
                    throw new armm();
                }
            } else {
                i = -this.d;
            }
        } else {
            i = 0;
        }
        List y = aqjn.y(new gec(i, gdjVar.b));
        int ordinal2 = gbbVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 == 2) {
                    gbg gbgVar = gbg.a;
                    return new gbg(gbb.APPEND, y, -1, a(), this.j.c());
                }
                throw new armm();
            }
            gbg gbgVar2 = gbg.a;
            return new gbg(gbb.PREPEND, y, b(), -1, this.j.c());
        }
        gbg gbgVar3 = gbg.a;
        return new gbg(gbb.REFRESH, y, b(), a(), this.j.c());
    }
}
