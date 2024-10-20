package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.apps.messaging.ui.conversation.typingindicator.ConversationTypingIndicatorView;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irw extends nt {
    public int h;
    private final View i;
    private final long o;
    private final int p;
    private final int q;
    private final xnv r;
    private final iru s;
    private final Optional t;
    private final List j = new ArrayList();
    private final List k = new ArrayList();
    private final List l = new ArrayList();
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    public final List g = new ArrayList();
    private final Map m = new tm();
    private final Map n = new tm();

    public irw(Context context, xnv xnvVar, Optional optional, View view, iru iruVar, int i) {
        this.r = xnvVar;
        this.i = view;
        this.s = iruVar;
        this.t = optional;
        this.c = i;
        this.b = 217L;
        this.a = 217L;
        Resources resources = context.getResources();
        this.p = resources.getDimensionPixelSize(R.dimen.message_bubble_initial_offset);
        this.q = resources.getDimensionPixelSize(R.dimen.jump_scroll_y_translation);
        this.o = xnvVar.a();
    }

    private static void r(oo ooVar, int i) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(ooVar.a, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, brg.a, 1.0f));
        ofPropertyValuesHolder.setStartDelay(50L);
        ofPropertyValuesHolder.setDuration(i);
        ofPropertyValuesHolder.setInterpolator(new emr());
        ofPropertyValuesHolder.start();
    }

    private final boolean s(oo ooVar, ns nsVar, ns nsVar2) {
        int i = 0;
        if (u(ooVar) || nsVar == null || nsVar2 == null) {
            return false;
        }
        int i2 = nsVar.a;
        int i3 = nsVar.b;
        int i4 = nsVar2.a;
        int i5 = nsVar2.b;
        View view = ooVar.a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) ooVar.a.getTranslationY());
        g(ooVar);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0) {
            if (i7 == 0) {
                e(ooVar);
                return false;
            }
        } else {
            i = i6;
        }
        if (i != 0) {
            view.setTranslationX(-i);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.l.add(new irv(ooVar, translationX, translationY, i4, i5));
        return true;
    }

    private static boolean t(ns nsVar) {
        if (nsVar instanceof iro) {
            return ((iro) nsVar).e;
        }
        return false;
    }

    private final boolean u(oo ooVar) {
        if (this.r.a() - this.o < 1000) {
            e(ooVar);
            return true;
        }
        return false;
    }

    private final boolean v(oo ooVar) {
        iro iroVar = (iro) this.m.get(ooVar);
        iro iroVar2 = (iro) this.n.get(ooVar);
        if (iroVar != null && iroVar.e) {
            return true;
        }
        if (iroVar2 != null && iroVar2.e) {
            return true;
        }
        return false;
    }

    private final boolean w() {
        return ((itb) this.s).aB;
    }

    private final boolean x() {
        if (((Boolean) wsm.a.e()).booleanValue() && this.t.isPresent() && ((lyi) this.t.get()).a()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nt
    public final long b() {
        if (this.c == 0 && (!this.j.isEmpty() || !this.k.isEmpty())) {
            return 217L;
        }
        return this.c;
    }

    @Override // defpackage.nt
    public final ns c(ol olVar, oo ooVar) {
        iro iroVar = new iro(super.c(olVar, ooVar), w());
        this.n.put(ooVar, iroVar);
        return iroVar;
    }

    @Override // defpackage.nt
    public final ns d(ol olVar, oo ooVar, int i, List list) {
        iro iroVar = new iro(super.d(olVar, ooVar, i, list), w());
        this.m.put(ooVar, iroVar);
        return iroVar;
    }

    @Override // defpackage.nt
    public final void g(oo ooVar) {
        View view = ooVar.a;
        view.animate().cancel();
        int size = this.l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((irv) this.l.get(size)).a == ooVar) {
                view.setTranslationY(brg.a);
                view.setTranslationX(brg.a);
                e(ooVar);
                this.l.remove(size);
            }
        }
        if (this.j.remove(ooVar)) {
            view.setAlpha(1.0f);
            e(ooVar);
        }
        if (this.k.remove(ooVar)) {
            view.setTranslationY(brg.a);
            view.setAlpha(1.0f);
            e(ooVar);
        }
        q();
    }

    @Override // defpackage.nt
    public final void h() {
        int size = this.l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            irv irvVar = (irv) this.l.get(size);
            View view = irvVar.a.a;
            view.setTranslationY(brg.a);
            view.setTranslationX(brg.a);
            e(irvVar.a);
            this.l.remove(size);
        }
        int size2 = this.j.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            e((oo) this.j.get(size2));
            this.j.remove(size2);
        }
        int size3 = this.k.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            oo ooVar = (oo) this.k.get(size3);
            ooVar.a.setTranslationY(brg.a);
            e(ooVar);
            this.k.remove(size3);
        }
        if (!p()) {
            return;
        }
        a.H(this.g);
        a.H(this.f);
        a.H(this.e);
        f();
    }

    @Override // defpackage.nt
    public final void i() {
        int i;
        for (oo ooVar : this.j) {
            View view = ooVar.a;
            this.g.add(ooVar);
            if (x()) {
                lyi lyiVar = (lyi) this.t.get();
                new irt(this, ooVar, new irs(this, ooVar, 4), null);
                lyiVar.b();
            } else {
                ViewPropertyAnimator animate = view.animate();
                if (v(ooVar)) {
                    animate.translationYBy(this.q).setInterpolator(new emq());
                }
                animate.setDuration(this.b).alpha(brg.a).setListener(new irt(this, ooVar, new eex(this, animate, view, ooVar, 8), null)).start();
            }
        }
        Iterator it = this.l.iterator();
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            irv irvVar = (irv) it.next();
            oo ooVar2 = irvVar.a;
            int i2 = irvVar.b;
            int i3 = irvVar.c;
            int i4 = irvVar.d;
            int i5 = irvVar.e;
            View view2 = ooVar2.a;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            ViewPropertyAnimator animate2 = view2.animate();
            if (i6 != 0) {
                animate2.translationX(brg.a);
            }
            if (i7 != 0) {
                animate2.translationY(brg.a);
            }
            animate2.setInterpolator(new emq());
            this.f.add(ooVar2);
            animate2.setDuration(b()).setListener(new irt(this, ooVar2, new irs(this, ooVar2, 3), new eyr(i6, view2, i7, i))).start();
        }
        for (oo ooVar3 : this.k) {
            View view3 = ooVar3.a;
            this.e.add(ooVar3);
            int i8 = 0;
            if (x()) {
                lyi lyiVar2 = (lyi) this.t.get();
                new irt(this, ooVar3, new irs(this, ooVar3, i8), null);
                lyiVar2.d();
            } else {
                if (v(ooVar3)) {
                    r(ooVar3, 160);
                } else if (view3 instanceof ConversationMessageView) {
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(ooVar3.a, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, -this.p, brg.a));
                    ofPropertyValuesHolder.setDuration(133L);
                    ofPropertyValuesHolder.setInterpolator(new emq());
                    ofPropertyValuesHolder.start();
                    r(ooVar3, 83);
                } else if (view3 instanceof ConversationTypingIndicatorView) {
                    r(ooVar3, 83);
                }
                ViewPropertyAnimator animate3 = view3.animate();
                animate3.setInterpolator(new emq());
                animate3.translationY(brg.a).setDuration(this.a).setListener(new irt(this, ooVar3, new irs(this, ooVar3, i), new gtq(view3, 16))).start();
            }
        }
        this.j.clear();
        this.l.clear();
        this.k.clear();
        this.m.clear();
        this.n.clear();
    }

    @Override // defpackage.nt
    public final boolean j(oo ooVar, ns nsVar, ns nsVar2) {
        if (u(ooVar)) {
            return false;
        }
        if (!t(nsVar) && !t(nsVar2)) {
            if (nsVar != null && (nsVar.a != nsVar2.a || nsVar.b != nsVar2.b)) {
                return s(ooVar, nsVar, nsVar2);
            }
            View view = ooVar.a;
            if (x()) {
                lyi lyiVar = (lyi) this.t.get();
                View view2 = ooVar.a;
                lyiVar.c();
                this.k.add(ooVar);
                return true;
            }
            if (nsVar2.d < this.i.getHeight() / 2) {
                e(ooVar);
                return false;
            }
            ooVar.a.setTranslationY((this.i.getHeight() - this.h) - nsVar2.b);
            View view3 = ooVar.a;
            if (view3 instanceof ConversationMessageView) {
                view3.setTranslationX(-this.p);
                ooVar.a.setAlpha(brg.a);
            } else if (view3 instanceof ConversationTypingIndicatorView) {
                view3.setTranslationY(view3.getHeight());
                ooVar.a.setAlpha(brg.a);
            }
            this.k.add(ooVar);
            return true;
        }
        ooVar.a.setTranslationY(-this.q);
        ooVar.a.setAlpha(brg.a);
        this.k.add(ooVar);
        return true;
    }

    @Override // defpackage.nt
    public final boolean k(oo ooVar, oo ooVar2, ns nsVar, ns nsVar2) {
        if (ooVar == ooVar2) {
            return m(ooVar, nsVar, nsVar2);
        }
        e(ooVar);
        e(ooVar2);
        return false;
    }

    @Override // defpackage.nt
    public final boolean l(oo ooVar, ns nsVar, ns nsVar2) {
        int i;
        int i2;
        int i3 = nsVar.a;
        int i4 = nsVar.b;
        View view = ooVar.a;
        if (nsVar2 == null) {
            i = view.getLeft();
        } else {
            i = nsVar2.a;
        }
        if (nsVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = nsVar2.b;
        }
        if (i3 == i && i4 == i2) {
            g(ooVar);
            this.j.add(ooVar);
            return true;
        }
        return s(ooVar, nsVar, nsVar2);
    }

    @Override // defpackage.nt
    public final boolean m(oo ooVar, ns nsVar, ns nsVar2) {
        if (ooVar.e == -5) {
            return false;
        }
        if (nsVar.a == nsVar2.a && nsVar.b == nsVar2.b) {
            e(ooVar);
            return false;
        }
        return s(ooVar, nsVar, nsVar2);
    }

    @Override // defpackage.nt
    public final boolean n(oo ooVar) {
        return true;
    }

    @Override // defpackage.nt
    public final boolean p() {
        if (this.k.isEmpty() && this.l.isEmpty() && this.j.isEmpty() && this.f.isEmpty() && this.g.isEmpty() && this.e.isEmpty()) {
            return false;
        }
        return true;
    }

    public final void q() {
        if (!p()) {
            f();
        }
    }
}
