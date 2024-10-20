package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efa extends WindowInsetsAnimation$Callback {
    private final eeu a;
    private List b;
    private ArrayList c;
    private final HashMap d;

    public efa(eeu eeuVar) {
        super(eeuVar.c);
        this.d = new HashMap();
        this.a = eeuVar;
    }

    private final mka a(WindowInsetsAnimation windowInsetsAnimation) {
        mka mkaVar = (mka) this.d.get(windowInsetsAnimation);
        if (mkaVar == null) {
            mka mkaVar2 = new mka(windowInsetsAnimation);
            this.d.put(windowInsetsAnimation, mkaVar2);
            return mkaVar2;
        }
        return mkaVar;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.e(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.a.c();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                WindowInsetsAnimation m73m = anf$$ExternalSyntheticApiModelOutline0.m73m(list.get(size));
                mka a = a(m73m);
                fraction = m73m.getFraction();
                a.j(fraction);
                this.c.add(a);
            } else {
                return this.a.b(efo.o(windowInsets), this.b).e();
            }
        }
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        eet d = this.a.d(new eet(bounds));
        return new WindowInsetsAnimation.Bounds(d.a.a(), d.b.a());
    }
}
