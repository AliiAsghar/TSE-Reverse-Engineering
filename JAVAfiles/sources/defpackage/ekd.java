package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekd implements ejw {
    public final Context a;
    public final ebq b;
    public final Object c = new Object();
    qdq d;
    private Handler e;
    private HandlerThread f;

    public ekd(Context context, ebq ebqVar) {
        d.aC(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = ebqVar;
    }

    @Override // defpackage.ejw
    public final void a(qdq qdqVar) {
        synchronized (this.c) {
            if (this.e == null) {
                HandlerThread handlerThread = new HandlerThread("emojiCompat", 10);
                this.f = handlerThread;
                handlerThread.start();
                this.e = new Handler(this.f.getLooper());
            }
            this.e.post(new ekc(this, qdqVar));
        }
    }

    public final void b() {
        this.d = null;
        synchronized (this.c) {
            this.e.removeCallbacks(null);
            HandlerThread handlerThread = this.f;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.e = null;
            this.f = null;
        }
    }
}
