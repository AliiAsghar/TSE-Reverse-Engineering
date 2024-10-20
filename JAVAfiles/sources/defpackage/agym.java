package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agym implements AutoCloseable, enk, andy {
    public final Executor a;
    private final AtomicReference b;
    private final eng c;

    public agym(Executor executor, eng engVar, aiim aiimVar) {
        this.a = executor;
        this.c = engVar;
        this.b = new AtomicReference(aiimVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.andy
    public final void a(Throwable th) {
        aiim aiimVar = (aiim) this.b.get();
        int i = 0;
        if (!(th instanceof CancellationException) && !(th instanceof InterruptedException)) {
            ?? r0 = aiimVar.a;
            int i2 = ((alsx) r0).c;
            while (i < i2) {
                ((agyl) r0.get(i)).a(th);
                i++;
            }
            return;
        }
        ?? r02 = aiimVar.d;
        int i3 = ((alsx) r02).c;
        while (i < i3) {
            ((agyl) r02.get(i)).a(th);
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.andy
    public final void b(Object obj) {
        ?? r0 = ((aiim) this.b.get()).c;
        int i = ((alsx) r0).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((agyl) r0.get(i2)).a(obj);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = alog.d;
        alog alogVar = alsx.a;
        Object obj = ((aiim) this.b.getAndSet(new aiim(alogVar, alogVar, alogVar))).b;
    }

    @Override // defpackage.enk
    public final void dH(enm enmVar, enf enfVar) {
        if (!enmVar.N().a().a(this.c)) {
            close();
        }
    }
}
