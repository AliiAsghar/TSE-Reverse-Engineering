package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfr implements hfh {
    public final String a;
    public final List b;
    public final boolean c;

    public hfr(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.hfh
    public final hbz a(hbl hblVar, hbb hbbVar, hfw hfwVar) {
        return new hca(hblVar, hfwVar, this, hbbVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + "}";
    }
}
