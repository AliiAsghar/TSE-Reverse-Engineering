package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aljx extends WeakReference implements aljs {
    final alke a;

    public aljx(ReferenceQueue referenceQueue, Object obj, alke alkeVar) {
        super(obj, referenceQueue);
        this.a = alkeVar;
    }

    @Override // defpackage.aljs
    public final int a() {
        return 1;
    }

    @Override // defpackage.aljs
    public final aljs b(ReferenceQueue referenceQueue, Object obj, alke alkeVar) {
        return new aljx(referenceQueue, obj, alkeVar);
    }

    @Override // defpackage.aljs
    public final alke c() {
        return this.a;
    }

    @Override // defpackage.aljs
    public final Object d() {
        return get();
    }

    @Override // defpackage.aljs
    public final boolean f() {
        return true;
    }

    @Override // defpackage.aljs
    public final boolean g() {
        return false;
    }

    @Override // defpackage.aljs
    public final void e(Object obj) {
    }
}
