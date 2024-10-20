package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alqi extends almw {
    final /* synthetic */ Iterable a;
    final /* synthetic */ algy b;

    public alqi(Iterable iterable, algy algyVar) {
        this.a = iterable;
        this.b = algyVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return alzz.aw(this.a.iterator(), this.b);
    }
}
