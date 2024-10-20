package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alfc implements Runnable {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ AtomicReference c;
    final /* synthetic */ aneo d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;
    final /* synthetic */ aegu g;

    public alfc(SettableFuture settableFuture, Runnable runnable, AtomicReference atomicReference, aneo aneoVar, long j, long j2, aegu aeguVar) {
        this.a = settableFuture;
        this.b = runnable;
        this.c = atomicReference;
        this.d = aneoVar;
        this.e = j;
        this.f = j2;
        this.g = aeguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        try {
            if (!this.a.isDone()) {
                this.b.run();
                SettableFuture create = SettableFuture.create();
                this.c.set(create);
                if (!this.a.isDone()) {
                    aneo aneoVar = this.d;
                    long j2 = this.e;
                    long j3 = this.f;
                    long a = this.g.a();
                    if (a < j2) {
                        j = (j2 + j3) - a;
                    } else {
                        j = j3 - ((a - j2) % j3);
                    }
                    create.m(aneoVar.schedule(this, j, TimeUnit.MILLISECONDS));
                }
            }
        } catch (Throwable th) {
            this.a.setException(th);
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
