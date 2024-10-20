package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class akup {
    private final AtomicReference a;

    public akup(Object obj) {
        this.a = new AtomicReference(obj);
    }

    public abstract Object a(Object obj, Object obj2);

    public final Object b() {
        return this.a.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Object obj) {
        Object b;
        AtomicReference atomicReference;
        Object obj2;
        if (obj == null) {
            return;
        }
        do {
            b = b();
            atomicReference = this.a;
            if (b != null) {
                obj2 = a(b, obj);
            } else {
                obj2 = obj;
            }
        } while (!a.bC(atomicReference, b, obj2));
    }
}
