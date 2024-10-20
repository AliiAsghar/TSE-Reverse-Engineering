package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cac implements Iterable, cfm, arse {
    private final cab a;
    private final int b;
    private final int c;

    public cac(cab cabVar, int i, int i2) {
        this.a = cabVar;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        bwa bwaVar;
        int i;
        if (this.a.g != this.c) {
            cad.l();
        }
        cab cabVar = this.a;
        int i2 = this.b;
        HashMap hashMap = cabVar.i;
        bxq bxqVar = null;
        if (hashMap != null) {
            if (cabVar.f) {
                bwp.i("use active SlotWriter to crate an anchor for location instead");
            }
            if (i2 >= 0 && i2 < (i = cabVar.b)) {
                bwaVar = cad.k(cabVar.h, i2, i);
            } else {
                bwaVar = null;
            }
            if (bwaVar != null) {
                bxqVar = (bxq) hashMap.get(bwaVar);
            }
        }
        if (bxqVar != null) {
            return new caq();
        }
        cab cabVar2 = this.a;
        int i3 = this.b;
        return new bxp(cabVar2, i3 + 1, i3 + cad.c(cabVar2.a, i3));
    }
}
