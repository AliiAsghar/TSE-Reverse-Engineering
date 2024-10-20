package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.Window;
import com.google.android.apps.messaging.R;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wtt {
    public static final akfc a = new akgc("SCREEN_DETECTION_LISTENER_DATA_SOURCE_KEY");
    public final armf b;
    public final armf c;
    public final armf d;
    public final arwe e;
    public final AtomicReference f;
    public final AtomicReference g;
    public final AtomicReference h;
    public final AtomicReference i;
    private final armf j;

    public wtt(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        arweVar.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.j = armfVar3;
        this.d = armfVar4;
        this.e = arweVar;
        this.f = new AtomicReference(null);
        this.g = new AtomicReference();
        this.h = new AtomicReference();
        this.i = new AtomicReference();
    }

    public final void a(wth wthVar, wth wthVar2) {
        akrh e = aktp.e("ScreenDetectionListener.handleDisplayChangeWithSignal");
        try {
            this.f.set(wthVar);
            if (wthVar2 != null && wthVar2.a == wthVar.a) {
                ((ahiy) this.j.b()).q(aktp.ag(wthVar), a);
            } else {
                ((ahiy) this.j.b()).q(aktp.ag(wthVar), a);
            }
            armd.i(e, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(e, th);
                throw th2;
            }
        }
    }

    @armg
    public final void b() {
        akrh e = aktp.e("handleDisplayChange");
        try {
            wth wthVar = (wth) this.f.get();
            wth b = ((wtp) this.b.b()).b(wthVar);
            this.f.set(b);
            if (wthVar != null && wthVar.a == b.a) {
                ((ahiy) this.j.b()).q(aktp.ag(b), a);
            } else {
                ((ahiy) this.j.b()).q(aktp.ag(b), a);
            }
            armd.i(e, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(e, th);
                throw th2;
            }
        }
    }

    public final void c(akgu akguVar, final Context context) {
        akguVar.getClass();
        akrh e = aktp.e("ScreenDetectionListener.registerDataSource");
        try {
            akguVar.a(R.id.screen_detection_listener_subscription_id, new wts(this), new akgs() { // from class: wtr
                @Override // defpackage.akgs
                public final /* synthetic */ void a(Throwable th) {
                    akec.l(th);
                }

                @Override // defpackage.akgs
                public final void b(Object obj) {
                    wth wthVar = (wth) obj;
                    akrh e2 = aktp.e("ScreenDetectionListener.callback");
                    Context context2 = context;
                    try {
                        if (((Boolean) ((utz) wti.a.get()).e()).booleanValue()) {
                            boolean z = wthVar.a;
                            wtt wttVar = this;
                            if (z) {
                                Drawable drawable = context2.getDrawable(R.drawable.gs_report_fill1_vd_theme_24);
                                if (drawable != null) {
                                    drawable.setTint(ahnz.f(context2, R.attr.colorErrorVariant, "ScreenDetectionListener"));
                                }
                                wtk d = ((wtp) wttVar.b.b()).d(wthVar);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(d.a);
                                if (d.b != null && d.c != null) {
                                    StyleSpan styleSpan = new StyleSpan(1);
                                    Integer num = d.b;
                                    num.getClass();
                                    int intValue = num.intValue();
                                    Integer num2 = d.c;
                                    num2.getClass();
                                    spannableStringBuilder.setSpan(styleSpan, intValue, num2.intValue(), 17);
                                }
                                ajgi ajgiVar = new ajgi(context2);
                                ajgiVar.k(drawable);
                                ajgiVar.x(R.string.screen_detection_dialog_title);
                                ajgiVar.n(spannableStringBuilder);
                                ajgiVar.j(false);
                                e2 = aktp.e("ScreenDetectionListener.callback.showDialog");
                                try {
                                    ev a2 = ajgiVar.a();
                                    armd.i(e2, null);
                                    ahqe.a.b(a2.getOwnerActivity());
                                    Window window = a2.getWindow();
                                    if (window != null) {
                                        window.addFlags(2);
                                    }
                                    Window window2 = a2.getWindow();
                                    if (window2 != null) {
                                        window2.setDimAmount(1.0f);
                                    }
                                    wttVar.g.set(a2);
                                } finally {
                                }
                            } else {
                                ev evVar = (ev) wttVar.g.getAndSet(null);
                                if (evVar != null) {
                                    evVar.dismiss();
                                }
                            }
                            armd.i(e2, null);
                            return;
                        }
                        armd.i(e2, null);
                    } finally {
                    }
                }
            });
            armd.i(e, null);
        } finally {
        }
    }

    public final void d() {
        akrh e = aktp.e("ScreenDetectionListener.unregister");
        try {
            if (((Boolean) ((utz) wti.a.get()).e()).booleanValue()) {
                if (wcm.D().booleanValue()) {
                    wtm wtmVar = (wtm) this.i.getAndSet(null);
                    if (wtmVar != null) {
                        ((wtp) this.b.b()).g(wtmVar);
                    }
                    armd.i(e, null);
                    return;
                }
                DisplayManager.DisplayListener displayListener = (DisplayManager.DisplayListener) this.h.getAndSet(null);
                if (displayListener != null) {
                    ((wtp) this.b.b()).f(displayListener);
                }
                armd.i(e, null);
                return;
            }
            armd.i(e, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(e, th);
                throw th2;
            }
        }
    }
}
