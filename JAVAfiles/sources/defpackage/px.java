package defpackage;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class px implements iv {
    ij a;
    public im b;
    final /* synthetic */ Toolbar c;

    public px(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.iv
    public final void b(Context context, ij ijVar) {
        im imVar;
        ij ijVar2 = this.a;
        if (ijVar2 != null && (imVar = this.b) != null) {
            ijVar2.t(imVar);
        }
        this.a = ijVar;
    }

    @Override // defpackage.iv
    public final void d(iu iuVar) {
        throw null;
    }

    @Override // defpackage.iv
    public final boolean e() {
        return false;
    }

    @Override // defpackage.iv
    public final boolean f(jc jcVar) {
        return false;
    }

    @Override // defpackage.iv
    public final boolean g(im imVar) {
        KeyEvent.Callback callback = this.c.h;
        if (callback instanceof hn) {
            ((hn) callback).onActionViewCollapsed();
        }
        Toolbar toolbar = this.c;
        toolbar.removeView(toolbar.h);
        Toolbar toolbar2 = this.c;
        toolbar2.removeView(toolbar2.g);
        Toolbar toolbar3 = this.c;
        toolbar3.h = null;
        int size = toolbar3.q.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar3.addView((View) toolbar3.q.get(size));
            } else {
                toolbar3.q.clear();
                this.b = null;
                this.c.requestLayout();
                imVar.h(false);
                this.c.x();
                return true;
            }
        }
    }

    @Override // defpackage.iv
    public final boolean h(im imVar) {
        Toolbar toolbar = this.c;
        if (toolbar.g == null) {
            toolbar.g = new ko(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.g.setImageDrawable(toolbar.e);
            toolbar.g.setContentDescription(toolbar.f);
            py pyVar = new py();
            pyVar.a = (toolbar.m & 112) | 8388611;
            pyVar.b = 2;
            toolbar.g.setLayoutParams(pyVar);
            toolbar.g.setOnClickListener(new jh(toolbar, 3));
        }
        ViewParent parent = this.c.g.getParent();
        Toolbar toolbar2 = this.c;
        if (parent != toolbar2) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar2.g);
            }
            Toolbar toolbar3 = this.c;
            toolbar3.addView(toolbar3.g);
        }
        this.c.h = imVar.getActionView();
        this.b = imVar;
        ViewParent parent2 = this.c.h.getParent();
        Toolbar toolbar4 = this.c;
        if (parent2 != toolbar4) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar4.h);
            }
            py pyVar2 = new py();
            Toolbar toolbar5 = this.c;
            pyVar2.a = 8388611 | (toolbar5.m & 112);
            pyVar2.b = 2;
            toolbar5.h.setLayoutParams(pyVar2);
            Toolbar toolbar6 = this.c;
            toolbar6.addView(toolbar6.h);
        }
        Toolbar toolbar7 = this.c;
        int childCount = toolbar7.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar7.getChildAt(childCount);
            if (((py) childAt.getLayoutParams()).b != 2 && childAt != toolbar7.a) {
                toolbar7.removeViewAt(childCount);
                toolbar7.q.add(childAt);
            }
        }
        this.c.requestLayout();
        imVar.h(true);
        KeyEvent.Callback callback = this.c.h;
        if (callback instanceof hn) {
            ((hn) callback).onActionViewExpanded();
        }
        this.c.x();
        return true;
    }

    @Override // defpackage.iv
    public final void i() {
        if (this.b != null) {
            ij ijVar = this.a;
            if (ijVar != null) {
                int size = ijVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            g(this.b);
        }
    }

    @Override // defpackage.iv
    public final void c(ij ijVar, boolean z) {
    }
}
