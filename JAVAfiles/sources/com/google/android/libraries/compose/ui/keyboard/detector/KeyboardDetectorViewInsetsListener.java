package com.google.android.libraries.compose.ui.keyboard.detector;

import android.graphics.Insets;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.lifecycle.OnLifecycleEvent;
import defpackage.aefw;
import defpackage.afke;
import defpackage.agax;
import defpackage.agay;
import defpackage.agaz;
import defpackage.agba;
import defpackage.agbb;
import defpackage.agbc;
import defpackage.agbd;
import defpackage.agbf;
import defpackage.agbg;
import defpackage.agbh;
import defpackage.agbk;
import defpackage.agbq;
import defpackage.agbr;
import defpackage.anf$$ExternalSyntheticApiModelOutline0;
import defpackage.arqr;
import defpackage.arrr;
import defpackage.arsc;
import defpackage.arsk;
import defpackage.arsn;
import defpackage.artm;
import defpackage.enf;
import defpackage.enl;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class KeyboardDetectorViewInsetsListener extends WindowInsetsAnimation$Callback implements View.OnApplyWindowInsetsListener, enl, agbq {
    static final /* synthetic */ artm[] a;
    public static final /* synthetic */ int e = 0;
    public final agbr b;
    public agaz c;
    public boolean d;
    private final afke f;
    private final arsn g;

    static {
        arrr arrrVar = new arrr(KeyboardDetectorViewInsetsListener.class, "state", "getState()Lcom/google/android/libraries/compose/ui/keyboard/detector/KeyboardDetectorViewInsetsListener$KeyboardListeningState;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar};
    }

    public KeyboardDetectorViewInsetsListener(afke afkeVar, agbr agbrVar) {
        super(0);
        this.f = afkeVar;
        this.b = agbrVar;
        this.g = new agbh(agbb.a, this);
    }

    private final void e(String str, arqr arqrVar) {
        agbk agbkVar = (agbk) this.g.c(a[0]);
        if (agbkVar instanceof agba) {
            if (str != null) {
                this.f.f(str, new agbc(arqrVar, agbkVar));
            } else {
                arqrVar.a(((agba) agbkVar).b);
            }
        }
    }

    public final int a(WindowInsets windowInsets) {
        boolean isVisible;
        int navigationBars;
        Insets insets;
        int i;
        Float f;
        Insets insets2;
        int i2;
        isVisible = windowInsets.isVisible(anf$$ExternalSyntheticApiModelOutline0.m());
        if (isVisible) {
            navigationBars = WindowInsets.Type.navigationBars();
            insets = windowInsets.getInsets(navigationBars);
            i = insets.bottom;
            agaz agazVar = this.c;
            if (agazVar != null) {
                f = Float.valueOf(agazVar.a());
            } else {
                f = null;
            }
            if (f != null) {
                i = arsk.g(i * f.floatValue());
            }
            insets2 = windowInsets.getInsets(anf$$ExternalSyntheticApiModelOutline0.m());
            i2 = insets2.bottom;
            return i2 - i;
        }
        return 0;
    }

    public final agaz b(WindowInsetsAnimation windowInsetsAnimation) {
        boolean isVisible;
        isVisible = this.b.getRootWindowInsets().isVisible(anf$$ExternalSyntheticApiModelOutline0.m());
        if (isVisible) {
            return new agax(windowInsetsAnimation);
        }
        return new agay(windowInsetsAnimation);
    }

    @Override // defpackage.agbq
    public final void c(boolean z) {
        if (z) {
            this.c = null;
            e("KeyboardDetectorViewInsetsListener#onWindowFocusChanged", new agbg(this, 0));
        }
    }

    public final void d(agbk agbkVar) {
        this.g.d(a[0], agbkVar);
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        view.getClass();
        windowInsets.getClass();
        if (this.c == null) {
            e("KeyboardDetectorViewInsetsListener#onApplyWindowInsets", new agbd(windowInsets, this, 1));
        }
        return windowInsets;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        windowInsetsAnimation.getClass();
        super.onEnd(windowInsetsAnimation);
        this.c = null;
        e("KeyboardDetectorViewInsetsListener#onEnd", new agbd(windowInsetsAnimation, this, 0));
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        windowInsetsAnimation.getClass();
        super.onPrepare(windowInsetsAnimation);
        if (agbk.a(windowInsetsAnimation)) {
            agaz b = b(windowInsetsAnimation);
            this.c = b;
            this.d = false;
            agbr agbrVar = this.b;
            agbf agbfVar = new agbf(this, b, windowInsetsAnimation);
            Handler handler = agbrVar.getHandler();
            if (handler != null) {
                Message obtain = Message.obtain(agbrVar.getHandler(), new aefw(agbfVar, 8));
                obtain.setAsynchronous(true);
                handler.sendMessageAtFrontOfQueue(obtain);
            }
        }
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        windowInsets.getClass();
        list.getClass();
        if (this.c != null) {
            e("KeyboardDetectorViewInsetsListener#onProgress", new agbd(this, windowInsets, 2));
        }
        return windowInsets;
    }

    @OnLifecycleEvent(a = enf.ON_RESUME)
    public final void onResume() {
        this.c = null;
        e(null, new agbg(this, 1));
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        windowInsetsAnimation.getClass();
        bounds.getClass();
        if (agbk.a(windowInsetsAnimation)) {
            this.d = true;
            e("KeyboardDetectorViewInsetsListener#onStart", new agbd(this, windowInsetsAnimation, 3));
        }
        WindowInsetsAnimation.Bounds onStart = super.onStart(windowInsetsAnimation, bounds);
        onStart.getClass();
        return onStart;
    }
}
