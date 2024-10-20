package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alqj extends almw {
    final /* synthetic */ Iterable a;
    final /* synthetic */ algk b;

    public alqj(Iterable iterable, algk algkVar) {
        this.a = iterable;
        this.b = algkVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return alzz.aC(this.a.iterator(), this.b);
    }
}
