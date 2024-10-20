package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alje implements aljs {
    volatile aljs a;
    final SettableFuture b;
    final alhp c;

    public alje() {
        aljs aljsVar = alkd.b;
        this.b = SettableFuture.create();
        this.c = new alhp();
        this.a = aljsVar;
    }

    @Override // defpackage.aljs
    public final int a() {
        return 0;
    }

    @Override // defpackage.aljs
    public final alke c() {
        return null;
    }

    @Override // defpackage.aljs
    public final Object d() {
        return d.p(this.b);
    }

    @Override // defpackage.aljs
    public final void e(Object obj) {
        if (obj != null) {
            h(obj);
        } else {
            this.a = alkd.b;
        }
    }

    @Override // defpackage.aljs
    public final boolean f() {
        return false;
    }

    @Override // defpackage.aljs
    public final boolean g() {
        return true;
    }

    @Override // defpackage.aljs
    public final Object get() {
        return null;
    }

    public final boolean h(Object obj) {
        return this.b.set(obj);
    }

    public final void i() {
        this.c.a(TimeUnit.NANOSECONDS);
    }

    @Override // defpackage.aljs
    public final aljs b(ReferenceQueue referenceQueue, Object obj, alke alkeVar) {
        return this;
    }
}
