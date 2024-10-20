package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akuh implements Transition.TransitionListener {
    final /* synthetic */ Transition.TransitionListener a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ahmn c;

    public akuh(ahmn ahmnVar, Transition.TransitionListener transitionListener, String str) {
        this.a = transitionListener;
        this.b = str;
        this.c = ahmnVar;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        ahmn.l(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        if (akqj.u()) {
            this.a.onTransitionEnd(transition);
            return;
        }
        ahmn ahmnVar = this.c;
        akrc b = ((aksr) ahmnVar.a).b(this.b);
        try {
            this.a.onTransitionEnd(transition);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        ahmn.l(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        ahmn.l(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        if (akqj.u()) {
            this.a.onTransitionStart(transition);
            return;
        }
        ahmn ahmnVar = this.c;
        akrc b = ((aksr) ahmnVar.a).b(this.b);
        try {
            this.a.onTransitionStart(transition);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
