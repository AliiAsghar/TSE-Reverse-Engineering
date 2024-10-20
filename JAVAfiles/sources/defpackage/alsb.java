package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alsb extends alsd {
    final /* synthetic */ Comparator a;

    public alsb(Comparator comparator) {
        this.a = comparator;
    }

    @Override // defpackage.alsd
    public final Map a() {
        return new TreeMap(this.a);
    }
}
