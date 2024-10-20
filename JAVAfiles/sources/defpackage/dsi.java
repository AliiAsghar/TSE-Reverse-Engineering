package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsi extends cga.c implements ViewTreeObserver.OnGlobalFocusChangeListener, View.OnAttachStateChangeListener, cis {
    public View a;

    /* compiled from: PG */
    /* renamed from: dsi$1, reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass1 extends arrm implements arqr<cib, cit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, dsi.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            int i = ((cib) obj).a;
            dsi dsiVar = (dsi) this.e;
            View b = dsh.b(dsiVar);
            if (!b.isFocused() && !b.hasFocus()) {
                if (cih.e(b, cih.d(i), dsh.a(((dai) cwp.g(dsiVar)).d, (View) cwp.g(dsiVar), b))) {
                    return cit.a;
                }
                return cit.b;
            }
            return cit.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: dsi$2, reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass2 extends arrm implements arqr<cib, cit> {
        public AnonymousClass2(Object obj) {
            super(1, obj, dsi.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            int i;
            View findNextFocusFromRect;
            int i2 = ((cib) obj).a;
            dsi dsiVar = (dsi) this.e;
            View b = dsh.b(dsiVar);
            if (!b.hasFocus()) {
                return cit.a;
            }
            cin cinVar = ((dai) cwp.g(dsiVar)).d;
            Object g = cwp.g(dsiVar);
            if (!(b instanceof ViewGroup)) {
                if (((View) g).requestFocus()) {
                    return cit.a;
                }
                throw new IllegalStateException("host view did not take focus");
            }
            View view = (View) g;
            Rect a = dsh.a(cinVar, view, b);
            Integer d = cih.d(i2);
            if (d != null) {
                i = d.intValue();
            } else {
                i = 130;
            }
            FocusFinder focusFinder = FocusFinder.getInstance();
            View view2 = dsiVar.a;
            if (view2 != null) {
                findNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) g, view2, i);
            } else {
                findNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) g, a, i);
            }
            if (findNextFocusFromRect != null && dsh.c(b, findNextFocusFromRect)) {
                findNextFocusFromRect.requestFocus(i, a);
                return cit.b;
            }
            if (view.requestFocus()) {
                return cit.a;
            }
            throw new IllegalStateException("host view did not take focus");
        }
    }

    private final FocusTargetNode a() {
        if (!this.p.z) {
            csg.c("visitLocalDescendants called on an unattached node");
        }
        cga.c cVar = this.p;
        if ((cVar.r & 1024) != 0) {
            boolean z = false;
            for (cga.c cVar2 = cVar.t; cVar2 != null; cVar2 = cVar2.t) {
                if ((cVar2.q & 1024) != 0) {
                    cga.c cVar3 = cVar2;
                    cbh cbhVar = null;
                    while (cVar3 != null) {
                        if (cVar3 instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVar3;
                            if (!z) {
                                z = true;
                            } else {
                                return focusTargetNode;
                            }
                        } else if ((cVar3.q & 1024) != 0 && (cVar3 instanceof cwr)) {
                            int i = 0;
                            for (cga.c cVar4 = ((cwr) cVar3).B; cVar4 != null; cVar4 = cVar4.t) {
                                if ((cVar4.q & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cVar3 = cVar4;
                                    } else {
                                        if (cbhVar == null) {
                                            cbhVar = new cbh(new cga.c[16]);
                                        }
                                        if (cVar3 != null) {
                                            cbhVar.n(cVar3);
                                        }
                                        cbhVar.n(cVar4);
                                        cVar3 = null;
                                    }
                                }
                            }
                            if (i != 1) {
                            }
                        }
                        cVar3 = cwp.a(cbhVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // cga.c
    public final void dQ() {
        dsh.b(this).addOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (cwp.e(this).l != null) {
            View b = dsh.b(this);
            cin cinVar = ((dai) cwp.g(this)).d;
            czb g = cwp.g(this);
            boolean z2 = true;
            if (view != null && !d.F(view, g) && dsh.c(b, view)) {
                z = true;
            } else {
                z = false;
            }
            if (view2 == null || d.F(view2, g) || !dsh.c(b, view2)) {
                z2 = false;
            }
            if (z && z2) {
                this.a = view2;
                return;
            }
            if (z2) {
                this.a = view2;
                FocusTargetNode a = a();
                if (!a.e().a()) {
                    cjc cjcVar = ((FocusOwnerImpl) cinVar).e;
                    try {
                        if (cjcVar.b) {
                            cjcVar.c();
                        }
                        cjcVar.b();
                        cjd.d(a);
                        return;
                    } finally {
                        cjcVar.d();
                    }
                }
                return;
            }
            if (z) {
                this.a = null;
                if (a().e().b()) {
                    cinVar.g(false, false, 8);
                    return;
                }
                return;
            }
            this.a = null;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    @Override // cga.c
    public final void s() {
        dsh.b(this).removeOnAttachStateChangeListener(this);
        this.a = null;
    }

    @Override // defpackage.cis
    public final void u(ciq ciqVar) {
        ciqVar.a(false);
        ciqVar.b(new AnonymousClass1(this));
        ciqVar.c(new AnonymousClass2(this));
    }
}
