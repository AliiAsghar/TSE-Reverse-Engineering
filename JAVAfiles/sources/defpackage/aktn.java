package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aktn implements andy {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public aktn(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, akry] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, andy] */
    @Override // defpackage.andy
    public final void a(Throwable th) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                akwg akwgVar = (akwg) this.b;
                SettableFuture settableFuture = akwgVar.b;
                try {
                    Throwable th2 = (Throwable) akwgVar.a.apply(th);
                    th2.getClass();
                    settableFuture.setException(th2);
                    return;
                } catch (Throwable th3) {
                    settableFuture.setException(new akwh(alog.p(new Throwable[]{th, th3})));
                    return;
                }
            }
            if (th instanceof CancellationException) {
                ((alwl) ((alwl) alwo.o((String) this.b).a(Level.WARNING).g(th)).h("com/google/android/apps/messaging/shared/util/future/BugleFutures", "logCancel", 118, "BugleFutures.java")).q("task cancelled");
                return;
            } else {
                ((alwl) ((alwl) alwo.o((String) this.b).a(Level.SEVERE).g(th)).h("com/google/android/apps/messaging/shared/util/future/BugleFutures", "logFailure", 105, "BugleFutures.java")).q((String) this.a);
                return;
            }
        }
        th.getClass();
        akry h = akqj.h(akqj.b(), this.a);
        try {
            this.b.a(th);
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, akry] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, andy] */
    @Override // defpackage.andy
    public final void b(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                ((akwf) this.a).a.set(obj);
                return;
            }
            return;
        }
        ?? r0 = this.a;
        akru b = akqj.b();
        akry h = akqj.h(b, r0);
        try {
            this.b.b(obj);
        } catch (Throwable th) {
            try {
                akqd.b(th);
                throw th;
            } finally {
                akqj.h(b, h);
            }
        }
    }

    public aktn(String str, String str2, int i) {
        this.c = i;
        this.b = str;
        this.a = str2;
    }
}
