package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cq extends rg {
    final /* synthetic */ da a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(da daVar) {
        super(false);
        this.a = daVar;
    }

    @Override // defpackage.rg
    public final void a() {
        if (da.Y(3)) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        da daVar = this.a;
        if (da.Y(3)) {
            bd bdVar = daVar.f;
            Objects.toString(bdVar);
            Log.d("FragmentManager", "cancelBackStackTransition for transition ".concat(String.valueOf(bdVar)));
        }
        bd bdVar2 = daVar.f;
        if (bdVar2 != null) {
            bdVar2.b = false;
            bdVar2.x(true, new bo(daVar, 5));
            daVar.f.i();
            daVar.g = true;
            daVar.ag();
            daVar.g = false;
            daVar.f = null;
        }
    }

    @Override // defpackage.rg
    public final void b() {
        int i;
        if (da.Y(3)) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        da daVar = this.a;
        daVar.g = true;
        daVar.am(true);
        daVar.g = false;
        if (daVar.f != null) {
            if (!daVar.k.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(da.ah(daVar.f));
                ArrayList arrayList = daVar.k;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Iterator it = linkedHashSet.iterator();
                    while (true) {
                        i = i2 + 1;
                        if (it.hasNext()) {
                        }
                    }
                    i2 = i;
                }
            }
            ArrayList arrayList2 = daVar.f.d;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                cg cgVar = ((dj) arrayList2.get(i3)).b;
                if (cgVar != null) {
                    cgVar.t = false;
                }
            }
            for (dv dvVar : daVar.m(new ArrayList(Collections.singletonList(daVar.f)), 0, 1)) {
                if (da.Y(3)) {
                    Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                }
                dvVar.g(dvVar.c);
                dvVar.e(dvVar.c);
            }
            ArrayList arrayList3 = daVar.f.d;
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                cg cgVar2 = ((dj) arrayList3.get(i4)).b;
                if (cgVar2 != null && cgVar2.P == null) {
                    daVar.k(cgVar2).e();
                }
            }
            daVar.f = null;
            daVar.T();
            if (da.Y(3)) {
                Log.d("FragmentManager", "Op is being set to null");
                Log.d("FragmentManager", "OnBackPressedCallback enabled=" + daVar.h.b + " for  FragmentManager " + daVar);
                return;
            }
            return;
        }
        if (daVar.h.b) {
            if (da.Y(3)) {
                Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
            }
            daVar.ac();
        } else {
            if (da.Y(3)) {
                Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
            }
            daVar.e.d();
        }
    }

    @Override // defpackage.rg
    public final void c(qz qzVar) {
        if (da.Y(2)) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        da daVar = this.a;
        bd bdVar = daVar.f;
        if (bdVar != null) {
            ArrayList arrayList = new ArrayList(Collections.singletonList(bdVar));
            for (dv dvVar : daVar.m(arrayList, 0, 1)) {
                if (da.Y(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + qzVar.a);
                }
                List list = dvVar.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    aqjn.S(arrayList2, ((du) it.next()).g);
                }
                List ax = aqjn.ax(aqjn.aE(arrayList2));
                int size = ax.size();
                for (int i = 0; i < size; i++) {
                    ds dsVar = (ds) ax.get(i);
                    ViewGroup viewGroup = dvVar.a;
                    dsVar.e(qzVar);
                }
            }
            ArrayList arrayList3 = this.a.k;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
            }
        }
    }

    @Override // defpackage.rg
    public final void d() {
        if (da.Y(3)) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        this.a.H();
        da daVar = this.a;
        daVar.I(new cz(daVar), false);
    }
}
