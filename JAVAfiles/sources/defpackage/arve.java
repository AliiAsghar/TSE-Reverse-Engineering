package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arve {
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(arve.class, Object.class, "a");
    public volatile Object a;
    private final arrj c;

    public arve(Object obj, arrj arrjVar) {
        this.c = arrjVar;
        this.a = obj;
    }

    public final Object a(Object obj) {
        Object andSet = b.getAndSet(this, obj);
        if (this.c != arvf.a) {
            Objects.toString(obj);
            Objects.toString(andSet);
        }
        return andSet;
    }

    public final void b(Object obj) {
        b.lazySet(this, obj);
        if (this.c != arvf.a) {
            Objects.toString(obj);
        }
    }

    public final void c(Object obj) {
        this.a = obj;
        if (this.c != arvf.a) {
            Objects.toString(obj);
        }
    }

    public final boolean d(Object obj, Object obj2) {
        boolean o = d.o(b, this, obj, obj2);
        if (o && this.c != arvf.a) {
            Objects.toString(obj);
            Objects.toString(obj2);
            return true;
        }
        return o;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
