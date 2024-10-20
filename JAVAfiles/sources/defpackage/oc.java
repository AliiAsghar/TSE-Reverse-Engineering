package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oc {
    public final SparseArray a = new SparseArray();
    public int b = 0;
    final Set c = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final long g(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        return ((j / 4) * 3) + (j2 / 4);
    }

    public final ob a(int i) {
        ob obVar = (ob) this.a.get(i);
        if (obVar == null) {
            ob obVar2 = new ob();
            this.a.put(i, obVar2);
            return obVar2;
        }
        return obVar;
    }

    public oo b(int i) {
        ob obVar = (ob) this.a.get(i);
        if (obVar != null && !obVar.a.isEmpty()) {
            ArrayList arrayList = obVar.a;
            int size = arrayList.size();
            do {
                size--;
                if (size < 0) {
                    return null;
                }
            } while (((oo) arrayList.get(size)).r());
            return (oo) arrayList.remove(size);
        }
        return null;
    }

    public final void c() {
        this.b++;
    }

    public final void d() {
        this.b--;
    }

    public void e(oo ooVar) {
        int i = ooVar.f;
        ArrayList arrayList = a(i).a;
        if (((ob) this.a.get(i)).b <= arrayList.size()) {
            ego.b(ooVar.a);
            return;
        }
        int i2 = RecyclerView.aa;
        ooVar.l();
        arrayList.add(ooVar);
    }

    public final void f(int i, int i2) {
        ob a = a(i);
        a.b = i2;
        ArrayList arrayList = a.a;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
