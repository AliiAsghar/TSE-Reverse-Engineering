package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arud implements Iterable, arse {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public arud(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [artx, java.lang.Object] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.b != 0) {
            return arrj.a((Object[]) this.a);
        }
        return this.a.a();
    }
}
