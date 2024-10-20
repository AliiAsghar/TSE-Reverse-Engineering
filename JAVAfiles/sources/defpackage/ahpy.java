package defpackage;

import android.os.Handler;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahpy {
    public final aegu a;
    public final ahpv b;
    public final Handler c;
    public final ahmu d;
    public int e = 0;
    public long f = -1;
    public volatile long g = -1;
    public volatile boolean h = false;
    public final AtomicReference i = new AtomicReference(aneh.a);
    private final aneo j;

    public ahpy(aegu aeguVar, aneo aneoVar, ahpv ahpvVar, ahmu ahmuVar, Handler handler) {
        this.a = aeguVar;
        this.j = aneoVar;
        this.b = ahpvVar;
        this.c = handler;
        this.d = ahmuVar;
    }

    public final void a(Runnable runnable, int i) {
        if (this.h) {
            AtomicReference atomicReference = this.i;
            SettableFuture create = SettableFuture.create();
            atomicReference.set(create);
            if (this.h) {
                create.m(this.j.schedule(runnable, i, TimeUnit.MILLISECONDS));
            }
        }
    }

    public final void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.i.set(albo.bL(new ahoa(this, 8), this.j));
    }
}
