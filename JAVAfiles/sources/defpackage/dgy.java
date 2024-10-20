package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgy implements Iterable<Map.Entry<? extends dhn<?>, ? extends Object>>, dho, arse {
    public boolean a;
    public boolean b;
    public final ve c = new ve((byte[]) null);
    private Map d;

    public final Object a(dhn dhnVar) {
        Object a = this.c.a(dhnVar);
        if (a != null) {
            return a;
        }
        throw new IllegalStateException(a.cc(dhnVar, "Key not present: ", " - consider getOrElse or getOrNull"));
    }

    public final Object b(dhn dhnVar, arqg arqgVar) {
        Object a = this.c.a(dhnVar);
        if (a == null) {
            return arqgVar.a();
        }
        return a;
    }

    @Override // defpackage.dho
    public final void c(dhn dhnVar, Object obj) {
        if ((obj instanceof dgn) && d(dhnVar)) {
            Object a = this.c.a(dhnVar);
            a.getClass();
            ve veVar = this.c;
            dgn dgnVar = (dgn) a;
            dgn dgnVar2 = (dgn) obj;
            String str = dgnVar2.a;
            if (str == null) {
                str = dgnVar.a;
            }
            armh armhVar = dgnVar2.b;
            if (armhVar == null) {
                armhVar = dgnVar.b;
            }
            veVar.j(dhnVar, new dgn(str, armhVar));
            return;
        }
        this.c.j(dhnVar, obj);
    }

    public final boolean d(dhn dhnVar) {
        return ve.e(this.c, dhnVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgy)) {
            return false;
        }
        dgy dgyVar = (dgy) obj;
        if (d.F(this.c, dgyVar.c) && this.a == dgyVar.a && this.b == dgyVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + a.v(this.a)) * 31) + a.v(this.b);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends dhn<?>, ? extends Object>> iterator() {
        Map map = this.d;
        if (map == null) {
            un unVar = new un(this.c);
            this.d = unVar;
            map = unVar;
        }
        return map.entrySet().iterator();
    }

    public final String toString() {
        String str;
        int i;
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.b) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        ve veVar = this.c;
        Object[] objArr = veVar.b;
        Object[] objArr2 = veVar.c;
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
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            sb.append(str);
                            sb.append(((dhn) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return ddd.a(this) + "{ " + ((Object) sb) + " }";
    }
}
