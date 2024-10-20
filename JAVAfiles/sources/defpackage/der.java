package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class der<T> {
    public final cbh a = new cbh(new Reference[16]);
    public final ReferenceQueue b = new ReferenceQueue();

    public final void a() {
        Reference<? extends T> poll;
        do {
            poll = this.b.poll();
            if (poll != null) {
                this.a.m(poll);
            }
        } while (poll != null);
    }
}
