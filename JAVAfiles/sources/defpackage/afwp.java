package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afwp implements ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public afwp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, arqr] */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                view.getClass();
                view2.getClass();
                Object a = ((adec) this.a).d.a(view2);
                if (a != null) {
                    ((adec) this.a).b.a(a);
                    return;
                }
                return;
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) this.a).g;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
                return;
            }
            return;
        }
        view.getClass();
        view2.getClass();
        if (d.F(view, ((afwt) this.a).e.k)) {
            afwt.m((afwt) this.a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, arqr] */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                view.getClass();
                view2.getClass();
                adec adecVar = (adec) this.a;
                if (((agdq) adecVar.c).h) {
                    adecVar.f();
                }
                Object a = ((adec) this.a).d.a(view2);
                if (a != null) {
                    ((adec) this.a).e.a(a);
                    return;
                }
                return;
            }
            ((CoordinatorLayout) this.a).d(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) this.a).g;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
                return;
            }
            return;
        }
        view.getClass();
        view2.getClass();
    }
}
