package defpackage;

import android.view.View;
import android.view.Window;
import defpackage.apxm;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class rb implements enk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r3v20, types: [byn, java.lang.Object] */
    @Override // defpackage.enk
    public final void dH(enm enmVar, enf enfVar) {
        Window window;
        View peekDecorView;
        switch (this.b) {
            case 0:
                if (enfVar == enf.ON_DESTROY) {
                    re reVar = (re) this.a;
                    reVar.f.b = null;
                    if (!reVar.isChangingConfigurations()) {
                        reVar.aL().z();
                    }
                    rc rcVar = reVar.l;
                    rcVar.b.getWindow().getDecorView().removeCallbacks(rcVar);
                    rcVar.b.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(rcVar);
                    return;
                }
                return;
            case 1:
                if (enfVar == enf.ON_STOP && (window = ((re) this.a).getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    return;
                }
                return;
            case 2:
                ((re) this.a).v();
                ((dx) this.a).N().d(this);
                return;
            case 3:
                Object obj = this.a;
                if (enfVar == enf.ON_START) {
                    ((gka) obj).f = true;
                    return;
                } else {
                    if (enfVar == enf.ON_STOP) {
                        ((gka) obj).f = false;
                        return;
                    }
                    return;
                }
            case 4:
                if (enfVar == enf.ON_RESUME) {
                    this.a.a();
                    return;
                }
                return;
            case 5:
                ?? r3 = this.a;
                r3.getClass();
                r3.h(enfVar);
                return;
            case 6:
                if (enfVar == enf.ON_STOP) {
                    ((agde) this.a).a();
                    return;
                }
                return;
            case 7:
                if (enfVar == enf.ON_DESTROY) {
                    apxm.a aVar = (apxm.a) this.a;
                    aVar.a = null;
                    aVar.b = null;
                    aVar.c = null;
                    return;
                }
                return;
            default:
                if (enfVar == enf.ON_DESTROY) {
                    enmVar.N().d(this);
                    ((aqvq) this.a).a();
                    return;
                }
                return;
        }
    }

    public rb(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
