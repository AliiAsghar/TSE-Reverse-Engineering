package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arnz<T> implements Iterable<arny<? extends T>>, arse {
    private final arqg a;

    public arnz(arqg arqgVar) {
        this.a = arqgVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Iterator, java.lang.Object] */
    @Override // java.lang.Iterable
    public final Iterator<arny<T>> iterator() {
        return new aroa(this.a.a());
    }
}
