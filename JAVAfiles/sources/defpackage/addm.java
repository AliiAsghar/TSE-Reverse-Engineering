package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class addm {
    public final aegu b;
    final /* synthetic */ adqg c;
    public final ArrayDeque a = new ArrayDeque();
    private final AtomicBoolean d = new AtomicBoolean();

    public addm(adqg adqgVar, aegu aeguVar) {
        this.c = adqgVar;
        this.b = aeguVar;
    }

    public final void a() {
        this.d.set(false);
        b();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void b() {
        if (this.d.compareAndSet(false, true)) {
            addo addoVar = (addo) this.a.poll();
            if (addoVar == null) {
                this.d.set(false);
                return;
            }
            addoVar.c(this.b.f());
            wcr wcrVar = addoVar.b;
            int i = wcrVar.c;
            if (i != 2) {
                if (i == 3) {
                    wcf wcfVar = (wcf) ((apxx) this.c.d).a;
                    albo.bR(arlj.a(wcfVar.a.a(wch.c(), wcfVar.b), (wct) wcrVar.d), new addn(this, addoVar, 1), this.c.a);
                    return;
                }
                return;
            }
            wcf wcfVar2 = (wcf) ((apxx) this.c.d).a;
            albo.bR(arlj.a(wcfVar2.a.a(wch.d(), wcfVar2.b), (wcv) wcrVar.d), new addn(this, addoVar, 0), this.c.a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, aneo] */
    public final boolean c(addo addoVar) {
        if (addoVar.b.h >= 3) {
            return false;
        }
        this.a.offerFirst(addoVar);
        this.d.set(false);
        adqg adqgVar = this.c;
        adqgVar.a.schedule(new acbq(this, 12), 5L, TimeUnit.SECONDS);
        return true;
    }
}
