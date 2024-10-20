package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bk extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ du d;
    final /* synthetic */ bl e;

    public bk(ViewGroup viewGroup, View view, boolean z, du duVar, bl blVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = duVar;
        this.e = blVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.endViewTransition(this.b);
        if (this.c) {
            du duVar = this.d;
            View view = this.b;
            int i = duVar.h;
            view.getClass();
            ef.e(i, view, this.a);
        }
        bl blVar = this.e;
        blVar.a.a.f(blVar);
        if (da.Y(2)) {
            Log.v("FragmentManager", "Animator from operation " + this.d + " has ended.");
        }
    }
}
