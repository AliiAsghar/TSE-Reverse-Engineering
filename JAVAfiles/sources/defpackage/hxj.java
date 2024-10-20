package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hxj implements hxq {
    protected final View a;
    private final ktk b;

    public hxj(View view) {
        hwr.i(view);
        this.a = view;
        this.b = new ktk(view);
    }

    @Override // defpackage.hxq
    public final hwx c() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof hwx) {
                return (hwx) tag;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.hxq
    public final void d(hxp hxpVar) {
        ktk ktkVar = this.b;
        int c = ktkVar.c();
        int b = ktkVar.b();
        if (ktk.e(c, b)) {
            hxpVar.g(c, b);
            return;
        }
        if (!ktkVar.b.contains(hxpVar)) {
            ktkVar.b.add(hxpVar);
        }
        if (ktkVar.c == null) {
            ViewTreeObserver viewTreeObserver = ((View) ktkVar.a).getViewTreeObserver();
            ktkVar.c = new hxr(ktkVar, 1);
            viewTreeObserver.addOnPreDrawListener(ktkVar.c);
        }
    }

    @Override // defpackage.hxq
    public final void e(Drawable drawable) {
        this.b.d();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.hxq
    public final void g(hxp hxpVar) {
        this.b.b.remove(hxpVar);
    }

    @Override // defpackage.hxq
    public final void h(hwx hwxVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, hwxVar);
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }

    @Override // defpackage.hwb
    public final void k() {
    }

    @Override // defpackage.hwb
    public final void l() {
    }

    @Override // defpackage.hwb
    public final void m() {
    }

    @Override // defpackage.hxq
    public final void f(Drawable drawable) {
    }
}
