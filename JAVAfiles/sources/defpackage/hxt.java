package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class hxt extends hxg {
    protected final View a;
    public final hxs b;

    public hxt(View view) {
        hwr.i(view);
        this.a = view;
        this.b = new hxs(view);
    }

    @Override // defpackage.hxg, defpackage.hxq
    public final hwx c() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof hwx) {
                return (hwx) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // defpackage.hxq
    public final void d(hxp hxpVar) {
        hxs hxsVar = this.b;
        int b = hxsVar.b();
        int a = hxsVar.a();
        if (hxs.d(b, a)) {
            hxpVar.g(b, a);
            return;
        }
        if (!hxsVar.c.contains(hxpVar)) {
            hxsVar.c.add(hxpVar);
        }
        if (hxsVar.e == null) {
            ViewTreeObserver viewTreeObserver = hxsVar.b.getViewTreeObserver();
            hxsVar.e = new hxr(hxsVar, 0);
            viewTreeObserver.addOnPreDrawListener(hxsVar.e);
        }
    }

    @Override // defpackage.hxq
    public final void g(hxp hxpVar) {
        this.b.c.remove(hxpVar);
    }

    @Override // defpackage.hxg, defpackage.hxq
    public final void h(hwx hwxVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, hwxVar);
    }

    public final void o() {
        this.b.d = true;
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }
}
