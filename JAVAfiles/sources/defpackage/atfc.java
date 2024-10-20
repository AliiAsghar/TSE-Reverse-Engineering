package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atfc {
    public final atfo a;
    final Executor b;
    final Executor c;
    public final /* synthetic */ atfe d;

    public atfc(atfe atfeVar, UrlRequest.Callback callback, Executor executor) {
        this.d = atfeVar;
        this.a = new atfo(callback);
        if (atfeVar.h) {
            this.b = executor;
            this.c = null;
        } else {
            this.b = new qyk(executor, 3);
            this.c = executor;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(atff atffVar) {
        try {
            this.b.execute(new atep(this.d, atffVar, 5));
        } catch (RejectedExecutionException e) {
            this.d.b(new atef("Exception posting task to executor", e));
        }
    }

    public final void b() {
        this.d.c.execute(new atfa(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        a(new ateu(this, 5));
    }
}
