package defpackage;

import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import defpackage.ztc;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztb implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ztb(View view, View view2, int i) {
        this.c = i;
        this.a = view;
        this.b = view2;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map$Entry, java.lang.Object] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (((View) this.a).getWidth() > 0 && ((View) this.a).getHeight() > 0) {
                        ((View) this.a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        Object obj = this.a;
                        ((View) obj).getWidth();
                        ((View) this.a).getHeight();
                        ((ViewGroup) obj).addView((View) this.b);
                        return;
                    }
                    return;
                }
                ((View) this.b).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.a.run();
                return;
            }
            if (((View) this.b).getWidth() > 0 && ((View) this.b).getHeight() > 0) {
                ((View) this.b).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ((View) this.b).getWidth();
                ((View) this.b).getHeight();
                ((ioc) this.a).a();
                return;
            }
            return;
        }
        ztc ztcVar = (ztc) this.b;
        ztcVar.m = true;
        aktp.L(new ztc.d(), ztcVar.j);
        ztc ztcVar2 = (ztc) this.b;
        aabr aabrVar = ztcVar2.p;
        aabrVar.getClass();
        zta ztaVar = new zta(this, this.a);
        boolean z = ztcVar2.b().a;
        ztr ztrVar = (ztr) aabrVar;
        ztrVar.s(null, false);
        int i2 = ztq.j;
        ztrVar.g.f();
        if (!z) {
            ztrVar.s++;
            ztrVar.c(true);
            int i3 = ztrVar.s - 1;
            ztrVar.s = i3;
            if (i3 == 0) {
                ztaVar.a(aabrVar);
            }
        } else {
            Slide a = ztrVar.a(48, 333);
            a.addListener(new akuh(ztrVar.G, new zti(ztrVar, ztaVar), "FullBannerUiController: Slide in top transition"));
            ViewGroup viewGroup = ztrVar.q;
            viewGroup.getClass();
            TransitionManager.beginDelayedTransition(viewGroup, a);
            ztrVar.c(true);
        }
        ((ztc) this.b).j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public ztb(View view, Object obj, int i) {
        this.c = i;
        this.b = view;
        this.a = obj;
    }

    public ztb(ztc ztcVar, Map.Entry entry, int i) {
        this.c = i;
        this.a = entry;
        this.b = ztcVar;
    }
}
