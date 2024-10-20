package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eun extends eup {
    public final long a;
    public final List b;
    public final List c;

    public eun(int i, long j) {
        super(i);
        this.a = j;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final eun a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            eun eunVar = (eun) this.c.get(i2);
            if (eunVar.d == i) {
                return eunVar;
            }
        }
        return null;
    }

    public final euo b(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            euo euoVar = (euo) this.b.get(i2);
            if (euoVar.d == i) {
                return euoVar;
            }
        }
        return null;
    }

    public final void c(eun eunVar) {
        this.c.add(eunVar);
    }

    public final void d(euo euoVar) {
        this.b.add(euoVar);
    }

    @Override // defpackage.eup
    public final String toString() {
        List list = this.b;
        return e(this.d) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.c.toArray());
    }
}
