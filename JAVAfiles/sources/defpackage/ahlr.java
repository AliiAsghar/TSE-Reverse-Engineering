package defpackage;

import android.app.Activity;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahlr extends ahls {
    final /* synthetic */ ahlt a;

    public ahlr(ahlt ahltVar) {
        this.a = ahltVar;
    }

    @Override // defpackage.ahls, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ahlt ahltVar = this.a;
        int i = ahltVar.b - 1;
        ahltVar.b = i;
        if (i == 0) {
            ahltVar.h = ahka.b(activity.getClass());
            Handler handler = this.a.e;
            albo.C(handler);
            Runnable runnable = this.a.f;
            albo.C(runnable);
            handler.postDelayed(runnable, 700L);
        }
    }

    @Override // defpackage.ahls, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ahlt ahltVar = this.a;
        int i = ahltVar.b + 1;
        ahltVar.b = i;
        if (i == 1) {
            if (ahltVar.c) {
                Iterator it = ahltVar.g.iterator();
                while (it.hasNext()) {
                    ((ahli) it.next()).l(ahka.b(activity.getClass()));
                }
                this.a.c = false;
                return;
            }
            Handler handler = ahltVar.e;
            albo.C(handler);
            Runnable runnable = this.a.f;
            albo.C(runnable);
            handler.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.ahls, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ahlt ahltVar = this.a;
        int i = ahltVar.a + 1;
        ahltVar.a = i;
        if (i == 1 && ahltVar.d) {
            for (ahli ahliVar : ahltVar.g) {
                ahka.b(activity.getClass());
            }
            this.a.d = false;
        }
    }

    @Override // defpackage.ahls, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ahlt ahltVar = this.a;
        ahltVar.a--;
        ahka.b(activity.getClass());
        ahltVar.a();
    }
}
