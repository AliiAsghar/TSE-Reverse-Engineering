package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class almv extends almw {
    final /* synthetic */ Iterable[] a;

    public almv(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new alqq(new almu(this.a));
    }
}
