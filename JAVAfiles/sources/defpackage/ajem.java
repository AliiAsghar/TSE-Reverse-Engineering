package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajem extends eeu {
    private final View a;
    private int d;
    private int e;
    private final int[] f;

    public ajem(View view) {
        super(0);
        this.f = new int[2];
        this.a = view;
    }

    @Override // defpackage.eeu
    public final efo b(efo efoVar, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((efc) ((mka) it.next()).a).h() & 8) != 0) {
                this.a.setTranslationY(ajdd.b(this.e, 0, r0.g()));
                break;
            }
        }
        return efoVar;
    }

    @Override // defpackage.eeu
    public final void c() {
        this.a.getLocationOnScreen(this.f);
        this.d = this.f[1];
    }

    @Override // defpackage.eeu
    public final eet d(eet eetVar) {
        this.a.getLocationOnScreen(this.f);
        int i = this.d - this.f[1];
        this.e = i;
        this.a.setTranslationY(i);
        return eetVar;
    }

    @Override // defpackage.eeu
    public final void e(mka mkaVar) {
        this.a.setTranslationY(brg.a);
    }
}
