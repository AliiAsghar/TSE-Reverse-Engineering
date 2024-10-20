package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alro extends alrr {
    final /* synthetic */ alrp a;

    public alro(alrp alrpVar) {
        this.a = alrpVar;
    }

    @Override // defpackage.alrr
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        alrp alrpVar = this.a;
        return new alrj(alrpVar.a.iterator(), alrpVar.b);
    }
}
