package defpackage;

import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class amav extends alkg {
    final /* synthetic */ Deque a;
    final /* synthetic */ Deque b;
    final /* synthetic */ ahlp c;

    public amav(ahlp ahlpVar, Deque deque, Deque deque2) {
        this.a = deque;
        this.b = deque2;
        this.c = ahlpVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [amat, java.lang.Object] */
    @Override // defpackage.alkg
    protected final Object a() {
        Deque deque = this.a;
        while (true) {
            Object J = ahlp.J(deque);
            if (J != null) {
                Iterator it = this.c.a.b(J).iterator();
                if (!it.hasNext()) {
                    return J;
                }
                this.a.addFirst(it);
                this.b.push(J);
                deque = this.a;
            } else {
                if (!this.b.isEmpty()) {
                    return this.b.pop();
                }
                b();
                return null;
            }
        }
    }
}
