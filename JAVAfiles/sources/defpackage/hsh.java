package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hsh implements hse {
    private final List a;
    private final ecf b;

    public hsh(List list, ecf ecfVar) {
        this.a = list;
        this.b = ecfVar;
    }

    @Override // defpackage.hse
    public final boolean a(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((hse) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [hne] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // defpackage.hse
    public final kkc b(Object obj, int i, int i2, hnj hnjVar) {
        kkc b;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        int i3 = 0;
        ?? r4 = 0;
        while (i3 < size) {
            hse hseVar = (hse) this.a.get(i3);
            if (hseVar.a(obj) && (b = hseVar.b(obj, i, i2, hnjVar)) != null) {
                arrayList.add(b.b);
                r4 = b.c;
            }
            i3++;
            r4 = r4;
        }
        if (arrayList.isEmpty() || r4 == 0) {
            return null;
        }
        return new kkc((hne) r4, new hsg(arrayList, this.b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + "}";
    }
}
