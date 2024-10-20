package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cz implements cx {
    final /* synthetic */ da a;

    public cz(da daVar) {
        this.a = daVar;
    }

    @Override // defpackage.cx
    public final boolean g(ArrayList arrayList, ArrayList arrayList2) {
        boolean ae;
        int i;
        da daVar = this.a;
        if (da.Y(2)) {
            ArrayList arrayList3 = daVar.a;
            Objects.toString(arrayList3);
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: ".concat(arrayList3.toString()));
        }
        int i2 = 0;
        if (daVar.c.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            ae = false;
        } else {
            daVar.f = (bd) daVar.c.get(r1.size() - 1);
            ArrayList arrayList4 = daVar.f.d;
            int size = arrayList4.size();
            for (int i3 = 0; i3 < size; i3++) {
                cg cgVar = ((dj) arrayList4.get(i3)).b;
                if (cgVar != null) {
                    cgVar.t = true;
                }
            }
            ae = daVar.ae(arrayList, arrayList2, null, -1, 0);
        }
        if (!this.a.k.isEmpty() && arrayList.size() > 0) {
            boolean booleanValue = ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                linkedHashSet.addAll(da.ah((bd) arrayList.get(i4)));
            }
            ArrayList arrayList5 = this.a.k;
            int size3 = arrayList5.size();
            while (i2 < size3) {
                aksp akspVar = (aksp) arrayList5.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        akspVar.a((cg) it.next(), booleanValue);
                    }
                }
                i2 = i;
            }
        }
        return ae;
    }
}
