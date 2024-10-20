package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alrt extends alrr {
    final /* synthetic */ alru a;

    public alrt(alru alruVar) {
        this.a = alruVar;
    }

    @Override // defpackage.alrr
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return this.a.a();
    }
}
