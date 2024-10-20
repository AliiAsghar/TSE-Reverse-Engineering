package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahln extends ahlh implements ahlo {
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final ahlj c;
    private ahka d;

    public ahln(ahlj ahljVar) {
        this.c = ahljVar;
    }

    @Override // defpackage.ahlo
    public final void a(Activity activity, Bundle bundle) {
        this.d = null;
    }

    @Override // defpackage.ahlo
    public final void b(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.ahlo
    public final void d(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.ahlo
    public final void f(Activity activity) {
        this.d = null;
        Context applicationContext = activity.getApplicationContext();
        if (ahlv.e(applicationContext, ahlv.b(applicationContext))) {
            l(ahka.b(activity.getClass()));
        } else if (!this.b.getAndSet(true)) {
            ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/foreground/ProcessImportanceForegroundSignalAdapter", "onActivityStarted", 57, "ProcessImportanceForegroundSignalAdapter.java")).q("Activity started with background importance");
        }
    }

    @Override // defpackage.ahlo
    public final void g(Activity activity) {
        ahka b = ahka.b(activity.getClass());
        this.d = b;
        Context applicationContext = activity.getApplicationContext();
        if (!ahlv.e(applicationContext, ahlv.b(applicationContext))) {
            k(b);
        }
    }

    @Override // defpackage.ahlo
    public final void h(int i) {
        ahka ahkaVar;
        if (i >= 20 && (ahkaVar = this.d) != null) {
            k(ahkaVar);
        }
        this.d = null;
    }

    @Override // defpackage.ahlh
    public final void i(ahka ahkaVar) {
        this.c.i(ahkaVar);
    }

    @Override // defpackage.ahlh
    public final void j(ahka ahkaVar) {
        this.c.j(ahkaVar);
    }

    @Override // defpackage.ahlo
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.ahlo
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
