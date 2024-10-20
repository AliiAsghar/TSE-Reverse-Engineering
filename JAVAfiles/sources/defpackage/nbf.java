package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbf implements nbe {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nbf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.nbe
    public final alog a() {
        Iterable iterable;
        if (this.b != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((kci) this.a).a.iterator();
            while (it.hasNext()) {
                nbe f = ((miz) it.next()).f();
                if (f != null) {
                    iterable = f.a();
                } else {
                    iterable = null;
                }
                if (iterable == null) {
                    iterable = arnv.a;
                }
                aqjn.S(arrayList, iterable);
            }
            return alzz.aZ(arrayList);
        }
        return alzz.aZ((Collection) ((arsb) this.a).a);
    }
}
