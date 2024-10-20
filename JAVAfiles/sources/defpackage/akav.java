package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akav implements Application.ActivityLifecycleCallbacks {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ Object a;
    private final /* synthetic */ int c;

    public akav(Object obj, int i) {
        this.c = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [arpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Set, java.lang.Object] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                activity.getClass();
                ((akju) this.a).b.add(activity);
                return;
            }
            activity.getClass();
            AtomicReference atomicReference = dey.a;
            final ?? r2 = this.a;
            dey.a.set(new dev() { // from class: akap
                @Override // defpackage.dev
                public final bzj a(View view) {
                    int i2 = akav.b;
                    view.getClass();
                    return dfd.c(view, arpi.this, 2);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Set, java.lang.Object] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                activity.getClass();
                ((akju) this.a).b.remove(activity);
            } else {
                activity.getClass();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                activity.getClass();
            } else {
                activity.getClass();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                activity.getClass();
            } else {
                activity.getClass();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                activity.getClass();
                bundle.getClass();
            } else {
                activity.getClass();
                bundle.getClass();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Set, java.lang.Object] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                activity.getClass();
                ((akju) this.a).c.add(activity);
                return;
            } else {
                activity.getClass();
                return;
            }
        }
        akaw akawVar = (akaw) this.a;
        int i2 = akawVar.c + 1;
        akawVar.c = i2;
        if (i2 == 1) {
            akawVar.a(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Set, java.lang.Object] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.c;
        int i2 = 0;
        if (i != 0) {
            if (i != 1) {
                activity.getClass();
                ((akju) this.a).c.remove(activity);
                aiut.c();
                Object obj = this.a;
                akju akjuVar = (akju) obj;
                if (!akjuVar.a && akjuVar.c.isEmpty() && akjuVar.a()) {
                    MessageQueue myQueue = Looper.myQueue();
                    final akjs akjsVar = new akjs(obj, i2);
                    long j = akto.a;
                    final akry e = akqj.e();
                    myQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: aktf
                        @Override // android.os.MessageQueue.IdleHandler
                        public final boolean queueIdle() {
                            long j2 = akto.a;
                            akry h = akqj.h(akqj.b(), akry.this);
                            try {
                                return akjsVar.queueIdle();
                            } finally {
                            }
                        }
                    });
                    return;
                }
                return;
            }
            activity.getClass();
            return;
        }
        akaw akawVar = (akaw) this.a;
        int i3 = akawVar.c - 1;
        akawVar.c = i3;
        if (i3 == 0 && !activity.isChangingConfigurations()) {
            ((akaw) this.a).a(false);
        }
    }
}
