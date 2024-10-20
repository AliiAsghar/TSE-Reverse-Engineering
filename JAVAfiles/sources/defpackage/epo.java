package defpackage;

import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class epo extends ept implements Runnable {
    boolean a;
    final /* synthetic */ epp b;

    public epo(epp eppVar) {
        this.b = eppVar;
    }

    @Override // defpackage.ept
    public final Object a() {
        try {
            return this.b.b();
        } catch (ebk e) {
            if (f()) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.ept
    public final void b(Object obj) {
        this.b.c(this, obj);
    }

    @Override // defpackage.ept
    public final void c(Object obj) {
        epp eppVar = this.b;
        if (eppVar.a == this) {
            if (eppVar.e) {
                eppVar.e(obj);
                return;
            }
            eppVar.h = false;
            SystemClock.uptimeMillis();
            eppVar.a = null;
            eppVar.i(obj);
            return;
        }
        eppVar.c(this, obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.d();
    }
}
