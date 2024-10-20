package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alr extends eeu implements Runnable, View.OnAttachStateChangeListener, edh {
    private final anf a;
    private boolean d;
    private boolean e;
    private efo f;

    public alr(anf anfVar) {
        super(!anfVar.h ? 1 : 0);
        this.a = anfVar;
    }

    @Override // defpackage.eeu
    public final efo b(efo efoVar, List list) {
        anf.c(this.a, efoVar);
        if (this.a.h) {
            return efo.a;
        }
        return efoVar;
    }

    @Override // defpackage.eeu
    public final void c() {
        this.d = true;
        this.e = true;
    }

    @Override // defpackage.eeu
    public final eet d(eet eetVar) {
        this.d = false;
        return eetVar;
    }

    @Override // defpackage.eeu
    public final void e(mka mkaVar) {
        this.d = false;
        this.e = false;
        efo efoVar = this.f;
        if (mkaVar.h() != 0 && efoVar != null) {
            this.a.a(efoVar);
            this.a.b(efoVar);
            anf.c(this.a, efoVar);
        }
        this.f = null;
    }

    @Override // defpackage.edh
    public final efo ez(View view, efo efoVar) {
        this.f = efoVar;
        this.a.b(efoVar);
        if (this.d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.e) {
            this.a.a(efoVar);
            anf.c(this.a, efoVar);
        }
        if (this.a.h) {
            return efo.a;
        }
        return efoVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.d = false;
            this.e = false;
            efo efoVar = this.f;
            if (efoVar != null) {
                this.a.a(efoVar);
                anf.c(this.a, efoVar);
                this.f = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
