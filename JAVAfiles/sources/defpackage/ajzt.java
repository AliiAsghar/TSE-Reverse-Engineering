package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajzt implements Executor {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ajzt(amdw amdwVar, Executor executor, int i) {
        this.c = i;
        this.b = executor;
        this.a = amdwVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.c;
        int i2 = 4;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                try {
                                    this.a.execute(runnable);
                                    return;
                                } catch (RejectedExecutionException e) {
                                    ((atew) this.b).g(e);
                                    return;
                                }
                            }
                            this.b.execute(new aofk(this.a, runnable, 14));
                            return;
                        }
                        try {
                            this.b.execute(runnable);
                            return;
                        } catch (RejectedExecutionException e2) {
                            ((ance) this.a).setException(e2);
                            return;
                        }
                    }
                    try {
                        this.b.execute(runnable);
                        return;
                    } catch (RejectedExecutionException e3) {
                        ((ance) this.a).setException(e3);
                        return;
                    }
                }
                this.a.c(runnable, this.b);
                return;
            }
            runnable.getClass();
            this.b.execute(new adhc(this.a, new aarj(runnable, i2), 12, null));
            return;
        }
        ((ahiy) this.a).a.execute(new ajnt(this.b, runnable, i2));
    }

    public ajzt(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ ajzt(Object obj, Executor executor, int i) {
        this.c = i;
        this.a = obj;
        this.b = executor;
    }
}
