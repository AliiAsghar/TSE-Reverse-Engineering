package defpackage;

import android.util.Log;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxr implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;
    private final /* synthetic */ int b;

    public hxr(ktk ktkVar, int i) {
        this.b = i;
        this.a = new WeakReference(ktkVar);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Collection, java.lang.Object] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = 0;
        if (this.b != 0) {
            if (Log.isLoggable("CustomViewTarget", 2)) {
                Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=".concat(toString()));
            }
            ktk ktkVar = (ktk) this.a.get();
            if (ktkVar != null && !ktkVar.b.isEmpty()) {
                int c = ktkVar.c();
                int b = ktkVar.b();
                if (ktk.e(c, b)) {
                    ArrayList arrayList = new ArrayList((Collection) ktkVar.b);
                    int size = arrayList.size();
                    while (i < size) {
                        ((hxp) arrayList.get(i)).g(c, b);
                        i++;
                    }
                    ktkVar.d();
                }
            }
            return true;
        }
        if (Log.isLoggable("ViewTarget", 2)) {
            Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=".concat(toString()));
        }
        hxs hxsVar = (hxs) this.a.get();
        if (hxsVar != null && !hxsVar.c.isEmpty()) {
            int b2 = hxsVar.b();
            int a = hxsVar.a();
            if (hxs.d(b2, a)) {
                ArrayList arrayList2 = new ArrayList(hxsVar.c);
                int size2 = arrayList2.size();
                while (i < size2) {
                    ((hxp) arrayList2.get(i)).g(b2, a);
                    i++;
                }
                hxsVar.c();
            }
        }
        return true;
    }

    public hxr(hxs hxsVar, int i) {
        this.b = i;
        this.a = new WeakReference(hxsVar);
    }
}
