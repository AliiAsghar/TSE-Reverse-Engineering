package defpackage;

import android.view.View;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdx implements agdz {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public agdx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.agdz
    public final void c(int i, float f) {
        if (this.b != 0) {
            if (i == 0) {
                if (((afwk) this.a).c.b()) {
                    afwk afwkVar = (afwk) this.a;
                    if (afwkVar.f) {
                        afwkVar.f();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 1 && ((afwk) this.a).a.d() == agaq.a) {
                afwk afwkVar2 = (afwk) this.a;
                afwkVar2.a.e((View) afwkVar2.b.g, false);
                return;
            }
            return;
        }
        Iterator it = ((aazm) this.a).d.iterator();
        while (it.hasNext()) {
            ((agdz) it.next()).c(i, f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.agdz
    public final void d(int i) {
        if (this.b != 0) {
            afwk afwkVar = (afwk) this.a;
            if (afwkVar.f) {
                afwkVar.a(i, false);
                return;
            }
            return;
        }
        Iterator it = ((aazm) this.a).d.iterator();
        while (it.hasNext()) {
            ((agdz) it.next()).d(i);
        }
    }
}
