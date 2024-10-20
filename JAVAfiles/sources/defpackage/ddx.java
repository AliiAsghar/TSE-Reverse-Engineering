package defpackage;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import defpackage.cga;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddx {
    private static final cjp a = new cjp(brg.a, brg.a, 10.0f, 10.0f);

    public static final View a(dbz dbzVar, int i) {
        Object obj;
        Iterator it = dbzVar.b.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((cxn) ((Map.Entry) obj).getKey()).d == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (drx) entry.getValue();
    }

    public static final tx b(dhg dhgVar) {
        dhe a2 = dhgVar.a();
        if (a2.b.ew() && a2.b.am()) {
            tx txVar = new tx(48);
            cjp b = a2.b();
            h(new Region(Math.round(b.b), Math.round(b.c), Math.round(b.d), Math.round(b.e)), a2, txVar, a2, new Region());
            return txVar;
        }
        tx txVar2 = ty.a;
        txVar2.getClass();
        return txVar2;
    }

    public static final ddu c(List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((ddu) list.get(i2)).a == i) {
                return (ddu) list.get(i2);
            }
        }
        return null;
    }

    public static final diy d(dgy dgyVar) {
        arqr arqrVar;
        ArrayList arrayList = new ArrayList();
        dhn dhnVar = dgx.a;
        dgn dgnVar = (dgn) dgz.a(dgyVar, dgx.a);
        if (dgnVar != null && (arqrVar = (arqr) dgnVar.b) != null && ((Boolean) arqrVar.a(arrayList)).booleanValue()) {
            return (diy) arrayList.get(0);
        }
        return null;
    }

    public static final String e(int i) {
        if (a.bA(i, 0)) {
            return "android.widget.Button";
        }
        if (a.bA(i, 1)) {
            return "android.widget.CheckBox";
        }
        if (a.bA(i, 3)) {
            return "android.widget.RadioButton";
        }
        if (a.bA(i, 5)) {
            return "android.widget.ImageView";
        }
        if (a.bA(i, 6)) {
            return "android.widget.Spinner";
        }
        if (!a.bA(i, 7)) {
            return null;
        }
        return "android.widget.NumberPicker";
    }

    public static final boolean f(dhe dheVar) {
        if (!dheVar.j()) {
            dgy dgyVar = dheVar.c;
            dhn dhnVar = dhh.a;
            if (!dgyVar.d(dhh.o) && !dheVar.c.d(dhh.n)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean g(dhe dheVar) {
        if (f(dheVar)) {
            return false;
        }
        dgy dgyVar = dheVar.c;
        if (dgyVar.a) {
            return true;
        }
        ve veVar = dgyVar.c;
        Object[] objArr = veVar.b;
        Object[] objArr2 = veVar.c;
        long[] jArr = veVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = i - length;
                int i3 = 0;
                while (true) {
                    int i4 = 8 - ((~i2) >>> 31);
                    if (i3 < i4) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i3;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            if (((dhn) obj).c) {
                                return true;
                            }
                        }
                        j >>= 8;
                        i3++;
                    } else if (i4 != 8) {
                        return false;
                    }
                }
            }
            if (i == length) {
                return false;
            }
            i++;
        }
    }

    private static final void h(Region region, dhe dheVar, tx txVar, dhe dheVar2, Region region2) {
        boolean z;
        cwo cwoVar;
        cjp a2;
        cjp cjpVar;
        cxn cxnVar;
        if (dheVar2.b.ew() && dheVar2.b.am()) {
            z = false;
        } else {
            z = true;
        }
        if (!region.isEmpty() || dheVar2.e == dheVar.e) {
            if (!z || dheVar2.d) {
                if (dheVar2.c.a) {
                    cwoVar = dhf.a(dheVar2.b);
                    if (cwoVar == null) {
                        cwoVar = dheVar2.a;
                    }
                } else {
                    cwoVar = dheVar2.a;
                }
                cga.c A = cwoVar.A();
                dgy dgyVar = dheVar2.c;
                dhn dhnVar = dgx.a;
                Object a3 = dgz.a(dgyVar, dgx.b);
                if (!A.p.z) {
                    a2 = cjp.a;
                } else if (a3 == null) {
                    a2 = ctj.d(cwp.f(A, 8));
                } else {
                    cyn f = cwp.f(A, 8);
                    if (!f.r()) {
                        a2 = cjp.a;
                    } else {
                        cti f2 = ctj.f(f);
                        cjl W = f.W();
                        long S = f.S(f.T());
                        int i = (int) (S >> 32);
                        W.a = -Float.intBitsToFloat(i);
                        int i2 = (int) (S & 4294967295L);
                        W.b = -Float.intBitsToFloat(i2);
                        W.c = f.u() + Float.intBitsToFloat(i);
                        W.d = f.t() + Float.intBitsToFloat(i2);
                        while (true) {
                            if (f != f2) {
                                f.al(W, false, true);
                                if (W.c()) {
                                    a2 = cjp.a;
                                    break;
                                } else {
                                    f = f.v;
                                    f.getClass();
                                }
                            } else {
                                a2 = cjm.a(W);
                                break;
                            }
                        }
                    }
                }
                int round = Math.round(a2.b);
                int round2 = Math.round(a2.c);
                int round3 = Math.round(a2.d);
                int round4 = Math.round(a2.e);
                region2.set(round, round2, round3, round4);
                int i3 = dheVar2.e;
                if (i3 == dheVar.e) {
                    i3 = -1;
                }
                if (region2.op(region, Region.Op.INTERSECT)) {
                    txVar.f(i3, new ddw(dheVar2, region2.getBounds()));
                    List i4 = dheVar2.i();
                    for (int size = i4.size() - 1; size >= 0; size--) {
                        dgy e = ((dhe) i4.get(size)).e();
                        dhn dhnVar2 = dhh.a;
                        if (!e.d(dhh.w)) {
                            h(region, dheVar, txVar, (dhe) i4.get(size), region2);
                        }
                    }
                    if (g(dheVar2)) {
                        region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                        return;
                    }
                    return;
                }
                if (dheVar2.d) {
                    dhe g = dheVar2.g();
                    if (g != null && (cxnVar = g.b) != null && cxnVar.ew()) {
                        cjpVar = g.b();
                    } else {
                        cjpVar = a;
                    }
                    txVar.f(i3, new ddw(dheVar2, new Rect(Math.round(cjpVar.b), Math.round(cjpVar.c), Math.round(cjpVar.d), Math.round(cjpVar.e))));
                    return;
                }
                if (i3 == -1) {
                    txVar.f(-1, new ddw(dheVar2, region2.getBounds()));
                }
            }
        }
    }
}
