package defpackage;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahdm {
    public final Set a = new LinkedHashSet();
    public final Set b = new LinkedHashSet();
    public final Map c = new HashMap();
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    public final Map f = new HashMap();
    public Collection g = null;
    public final boolean h = true;
    public final boolean i;

    public ahdm() {
        altg altgVar = altg.a;
        this.i = false;
    }

    private final ahdl d(ahcq ahcqVar) {
        ahdl ahdlVar = new ahdl(this.d.size(), this.a.size());
        ahcw a = ahdlVar.a(ahcqVar, -1);
        ArrayList arrayList = new ArrayList(1);
        ahji.aH(ahcqVar, arrayList);
        anas anasVar = a.d;
        if (anasVar == null) {
            anasVar = anas.a;
        }
        ahdlVar.b(new ahdv(1, arrayList, anasVar.c));
        this.d.add(ahdlVar);
        this.c.put(a, ahdlVar);
        return ahdlVar;
    }

    public final ahdl a(List list, int i) {
        ahcw ahcwVar = (ahcw) alzz.aO(list);
        ahdl ahdlVar = (ahdl) this.c.get(ahcwVar);
        if (ahdlVar == null) {
            ahdl ahdlVar2 = new ahdl(this.d.size(), i);
            this.d.add(ahdlVar2);
            this.c.put(ahcwVar, ahdlVar2);
            return ahdlVar2;
        }
        return ahdlVar;
    }

    public final ahdl b(ahcq ahcqVar) {
        boolean z;
        apae checkIsLite;
        String sb;
        int i = ahcqVar.d;
        if (i != -1) {
            if (i != -2) {
                return (ahdl) this.d.get(i);
            }
        } else {
            if (!ahcqVar.b()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ahcqVar);
                sb2.append(" has no VE id, it may need to be re-instrumented if it has been reset.");
                ahcz ahczVar = ahcqVar.e;
                if (ahczVar instanceof ahcz) {
                    sb2.append("\n\tError occurred on CVE with associated View of type: ");
                    sb2.append(ahcz.b(ahcqVar).getClass().getSimpleName());
                } else {
                    sb2.append("\n\tError occurred on SyntheticNode");
                }
                ahcq d = ahczVar.d();
                if (d != null) {
                    sb2.append("\n\t\tAncestry (leaf -> root):");
                }
                while (true) {
                    if (d != null) {
                        ahcz ahczVar2 = d.e;
                        if (ahczVar2 != null) {
                            sb2.append("\n\t\t\tView of type: ");
                            sb2.append(ahcz.b(d).getClass().getSimpleName());
                            d = ahczVar2.d();
                        } else {
                            sb2.append("\n\t\t\t<Found CVE with no Node attached. Ending traversal.>");
                            sb = sb2.toString();
                            break;
                        }
                    } else {
                        sb = sb2.toString();
                        break;
                    }
                }
                throw new IllegalStateException(sb);
            }
            this.e.add(ahcqVar);
            ahcz ahczVar3 = ahcqVar.e;
            if (!ahczVar3.g()) {
                ahcq d2 = ahczVar3.d();
                if (d2 == null) {
                    ahcw a = ahcqVar.a();
                    checkIsLite = apag.checkIsLite(ahfd.a);
                    a.b(checkIsLite);
                    if (!a.l.o(checkIsLite.d)) {
                        View b = ahcz.b(ahcqVar);
                        while (b != null) {
                            if (ahcz.h(b)) {
                                Log.e("GIL", hht.b(ahcqVar, "Unexpected visual element (", ") without parent detected. All visual elements except the root view must have a parent visual element. See also: go/gil-android/instrumentation#requirements."));
                                break;
                            }
                            Object parent = b.getParent();
                            if (!(parent instanceof View)) {
                                break;
                            }
                            b = (View) parent;
                        }
                        if (Log.isLoggable("GIL", 2)) {
                            Log.v("GIL", hht.b(ahcqVar, "Ignoring CVE (", ") outside of AutoLogger scope."));
                        }
                        ahcqVar.d = -2;
                        return null;
                    }
                    return d(ahcqVar);
                }
                if (d2.d == -1 && d2.c()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(null);
                    ahji.aH(d2, arrayList);
                    if (arrayList.size() > 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    albo.T(z);
                    ahdl a2 = a(arrayList, this.a.size());
                    ahcw a3 = a2.a(ahcqVar, -1);
                    arrayList.set(0, a3);
                    anas anasVar = a3.d;
                    if (anasVar == null) {
                        anasVar = anas.a;
                    }
                    a2.b(new ahdv(1, arrayList, anasVar.c));
                    return a2;
                }
                ahdl b2 = b(d2);
                if (b2 != null) {
                    anas anasVar2 = ((ahcw) d2.f.b).d;
                    if (anasVar2 == null) {
                        anasVar2 = anas.a;
                    }
                    b2.a(ahcqVar, anasVar2.c);
                    return b2;
                }
            } else {
                return d(ahcqVar);
            }
        }
        return null;
    }

    public final boolean c(ahcq ahcqVar, int i) {
        if (this.a.contains(ahcqVar)) {
            return false;
        }
        int U = a.U(((ahcw) ahcqVar.f.b).e);
        if (U == 0) {
            U = 1;
        }
        if (U == i) {
            this.b.remove(ahcqVar);
            return false;
        }
        this.b.add(ahcqVar);
        return true;
    }
}
