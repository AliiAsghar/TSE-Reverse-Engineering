package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dv {
    public final ViewGroup a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public boolean d;
    public boolean e;
    public boolean f;

    public dv(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static final dv c(ViewGroup viewGroup, da daVar) {
        viewGroup.getClass();
        a an = daVar.an();
        an.getClass();
        return a.bu(viewGroup, an);
    }

    public final du a(cg cgVar) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                du duVar = (du) obj;
                if (d.F(duVar.a, cgVar) && !duVar.b) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (du) obj;
    }

    public final du b(cg cgVar) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                du duVar = (du) obj;
                if (d.F(duVar.a, cgVar) && !duVar.b) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (du) obj;
    }

    public final void d(du duVar) {
        duVar.getClass();
        if (duVar.f) {
            int i = duVar.h;
            cg cgVar = duVar.a;
            ef.e(i, cgVar.L(), this.a);
            duVar.h();
        }
    }

    public final void e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqjn.S(arrayList, ((du) it.next()).g);
        }
        List ax = aqjn.ax(aqjn.aE(arrayList));
        int size = ax.size();
        for (int i = 0; i < size; i++) {
            ((ds) ax.get(i)).b(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            d((du) list.get(i2));
        }
        List ax2 = aqjn.ax(list);
        int size3 = ax2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            du duVar = (du) ax2.get(i3);
            if (duVar.g.isEmpty()) {
                duVar.a();
            }
        }
    }

    public final void f() {
        String str;
        String str2;
        if (da.Y(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        List list = this.b;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (list) {
            h();
            g(this.b);
            List<du> az = aqjn.az(this.c);
            Iterator it = az.iterator();
            while (it.hasNext()) {
                ((du) it.next()).d = false;
            }
            for (du duVar : az) {
                if (da.Y(2)) {
                    if (isAttachedToWindow) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    Log.v("FragmentManager", a.ci(duVar, str2, "SpecialEffectsController: ", "Cancelling running operation "));
                }
                duVar.e(this.a);
            }
            List<du> az2 = aqjn.az(this.b);
            Iterator it2 = az2.iterator();
            while (it2.hasNext()) {
                ((du) it2.next()).d = false;
            }
            for (du duVar2 : az2) {
                if (da.Y(2)) {
                    if (isAttachedToWindow) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    Log.v("FragmentManager", a.ci(duVar2, str, "SpecialEffectsController: ", "Cancelling pending operation "));
                }
                duVar2.e(this.a);
            }
        }
    }

    public final void g(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((du) list.get(i)).b();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqjn.S(arrayList, ((du) it.next()).g);
        }
        List ax = aqjn.ax(aqjn.aE(arrayList));
        int size2 = ax.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ds dsVar = (ds) ax.get(i2);
            ViewGroup viewGroup = this.a;
            if (!dsVar.c) {
                dsVar.c(viewGroup);
            }
            dsVar.c = true;
        }
    }

    public final void h() {
        for (du duVar : this.b) {
            if (duVar.i == 2) {
                duVar.g(a.br(duVar.a.L().getVisibility()), 1);
            }
        }
    }

    public final void i(int i, int i2, dg dgVar) {
        synchronized (this.b) {
            cg cgVar = dgVar.a;
            cgVar.getClass();
            du a = a(cgVar);
            if (a == null) {
                cg cgVar2 = dgVar.a;
                if (cgVar2.t) {
                    cgVar2.getClass();
                    a = b(cgVar2);
                } else {
                    a = null;
                }
            }
            if (a != null) {
                a.g(i, i2);
                return;
            }
            dt dtVar = new dt(i, i2, dgVar);
            this.b.add(dtVar);
            dtVar.c(new bn(this, dtVar, 5));
            dtVar.c(new bn(this, dtVar, 6));
        }
    }

    public final void j(List list, boolean z) {
        Object obj;
        Object obj2;
        boolean z2;
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                du duVar = (du) obj2;
                View view = duVar.a.Q;
                view.getClass();
                if (a.bs(view) == 2 && duVar.h != 2) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        du duVar2 = (du) obj2;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            du duVar3 = (du) previous;
            View view2 = duVar3.a.Q;
            view2.getClass();
            if (a.bs(view2) != 2 && duVar3.h == 2) {
                obj = previous;
                break;
            }
        }
        du duVar4 = (du) obj;
        if (da.Y(2)) {
            Log.v("FragmentManager", a.cd(duVar4, duVar2, "Executing operations from ", " to "));
        }
        ArrayList<bj> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        cg cgVar = ((du) aqjn.ac(list)).a;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            cc ccVar = ((du) it2.next()).a.T;
            cc ccVar2 = cgVar.T;
            ccVar.b = ccVar2.b;
            ccVar.c = ccVar2.c;
            ccVar.d = ccVar2.d;
            ccVar.e = ccVar2.e;
        }
        Iterator it3 = list.iterator();
        while (true) {
            z2 = false;
            if (!it3.hasNext()) {
                break;
            }
            du duVar5 = (du) it3.next();
            arrayList.add(new bj(duVar5, z));
            if (z) {
                if (duVar5 != duVar2) {
                    arrayList2.add(new br(duVar5, z, z2));
                    duVar5.c(new bn(this, duVar5, 1));
                }
                z2 = true;
                arrayList2.add(new br(duVar5, z, z2));
                duVar5.c(new bn(this, duVar5, 1));
            } else {
                if (duVar5 != duVar4) {
                    arrayList2.add(new br(duVar5, z, z2));
                    duVar5.c(new bn(this, duVar5, 1));
                }
                z2 = true;
                arrayList2.add(new br(duVar5, z, z2));
                duVar5.c(new bn(this, duVar5, 1));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (!((br) obj3).b()) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ((br) it4.next()).a();
        }
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            ((br) it5.next()).a();
        }
        ArrayList<bj> arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            aqjn.S(arrayList6, ((bj) it6.next()).a.g);
        }
        boolean isEmpty = arrayList6.isEmpty();
        for (bj bjVar : arrayList) {
            ViewGroup viewGroup = this.a;
            du duVar6 = bjVar.a;
            Context context = viewGroup.getContext();
            context.getClass();
            fdx a = bjVar.a(context);
            if (a != null) {
                if (a.a == null) {
                    arrayList5.add(bjVar);
                } else {
                    cg cgVar2 = duVar6.a;
                    if (!duVar6.g.isEmpty()) {
                        if (da.Y(2)) {
                            Log.v("FragmentManager", a.cc(cgVar2, "Ignoring Animator set on ", " as this Fragment was involved in a Transition."));
                        }
                    } else {
                        if (duVar6.h == 3) {
                            duVar6.h();
                        }
                        duVar6.d(new bl(bjVar));
                        z2 = true;
                    }
                }
            }
        }
        for (bj bjVar2 : arrayList5) {
            du duVar7 = bjVar2.a;
            cg cgVar3 = duVar7.a;
            if (!isEmpty) {
                if (da.Y(2)) {
                    Log.v("FragmentManager", a.cc(cgVar3, "Ignoring Animation set on ", " as Animations cannot run alongside Transitions."));
                }
            } else if (z2) {
                if (da.Y(2)) {
                    Log.v("FragmentManager", a.cc(cgVar3, "Ignoring Animation set on ", " as Animations cannot run alongside Animators."));
                }
            } else {
                duVar7.d(new bi(bjVar2));
            }
        }
    }
}
