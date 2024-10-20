package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jq extends hz implements ecm {
    public jo g;
    public int h;
    public jp i;
    public jm j;
    public absa k;
    final fn l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private boolean q;
    private final SparseBooleanArray r;
    private qdq s;

    public jq(Context context) {
        super(context);
        this.r = new SparseBooleanArray();
        this.l = new fn(this, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v4, types: [iw] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.hz
    public final View a(im imVar, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        View actionView = imVar.getActionView();
        int i = 0;
        if (actionView == null || imVar.m()) {
            if (view instanceof iw) {
                actionMenuItemView = (iw) view;
            } else {
                actionMenuItemView = (iw) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            }
            actionMenuItemView.f(imVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.b = (ActionMenuView) this.f;
            if (this.s == null) {
                this.s = new qdq(this, null);
            }
            actionMenuItemView2.c = this.s;
            actionView = actionMenuItemView;
        }
        if (true == imVar.p) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof jt)) {
            actionView.setLayoutParams(ActionMenuView.l(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.hz, defpackage.iv
    public final void b(Context context, ij ijVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = ijVar;
        Resources resources = context.getResources();
        if (!this.n) {
            this.m = true;
        }
        this.o = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.h = ef.j(context);
        int i = this.o;
        if (this.m) {
            if (this.g == null) {
                this.g = new jo(this, this.a);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.p = i;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.hz, defpackage.iv
    public final void c(ij ijVar, boolean z) {
        o();
        iu iuVar = this.e;
        if (iuVar != null) {
            iuVar.a(ijVar, z);
        }
    }

    @Override // defpackage.hz, defpackage.iv
    public final boolean e() {
        ArrayList arrayList;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        ij ijVar = this.c;
        View view = null;
        boolean z4 = false;
        if (ijVar != null) {
            arrayList = ijVar.f();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i2 = this.h;
        int i3 = this.p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i4 = 0;
        boolean z5 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            z = true;
            if (i4 >= i) {
                break;
            }
            im imVar = (im) arrayList.get(i4);
            if (imVar.r()) {
                i5++;
            } else if (imVar.q()) {
                i6++;
            } else {
                z5 = true;
            }
            if (this.q && imVar.p) {
                i2 = 0;
            }
            i4++;
        }
        if (this.m && (z5 || i6 + i5 > i2)) {
            i2--;
        }
        int i7 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.r;
        sparseBooleanArray.clear();
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            im imVar2 = (im) arrayList.get(i8);
            if (imVar2.r()) {
                View a = a(imVar2, view, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i9 == 0) {
                    i9 = measuredWidth;
                }
                int i10 = imVar2.b;
                if (i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                }
                imVar2.k(z);
                z2 = z4;
            } else if (imVar2.q()) {
                int i11 = imVar2.b;
                boolean z6 = sparseBooleanArray.get(i11);
                if ((i7 > 0 || z6) && i3 > 0) {
                    z3 = z;
                } else {
                    z3 = z4;
                }
                if (z3) {
                    View a2 = a(imVar2, view, viewGroup);
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i9 == 0) {
                        i9 = measuredWidth2;
                    }
                    if (i3 + i9 > 0) {
                        z3 = z;
                    } else {
                        z3 = false;
                    }
                }
                boolean z7 = z3;
                if (z7 && i11 != 0) {
                    sparseBooleanArray.put(i11, z);
                } else if (z6) {
                    sparseBooleanArray.put(i11, false);
                    for (int i12 = 0; i12 < i8; i12++) {
                        im imVar3 = (im) arrayList.get(i12);
                        if (imVar3.b == i11) {
                            if (imVar3.o()) {
                                i7++;
                            }
                            imVar3.k(false);
                        }
                    }
                }
                if (z7) {
                    i7--;
                }
                imVar2.k(z7);
                z2 = false;
            } else {
                z2 = z4;
                imVar2.k(z2);
            }
            i8++;
            z4 = z2;
            view = null;
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hz, defpackage.iv
    public final boolean f(jc jcVar) {
        boolean z = false;
        if (jcVar.hasVisibleItems()) {
            jc jcVar2 = jcVar;
            while (true) {
                ij ijVar = jcVar2.k;
                if (ijVar == this.c) {
                    break;
                }
                jcVar2 = (jc) ijVar;
            }
            im imVar = jcVar2.l;
            ViewGroup viewGroup = (ViewGroup) this.f;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof iw) && ((iw) childAt).a() == imVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                im imVar2 = jcVar.l;
                int size = jcVar.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    MenuItem item = jcVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                jm jmVar = new jm(this, this.b, jcVar, view);
                this.j = jmVar;
                jmVar.d(z);
                if (this.j.h()) {
                    super.f(jcVar);
                    return true;
                }
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hz, defpackage.iv
    public final void i() {
        int i;
        im imVar;
        ViewGroup viewGroup = (ViewGroup) this.f;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            ij ijVar = this.c;
            if (ijVar != null) {
                ijVar.k();
                ArrayList f = this.c.f();
                int size = f.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    im imVar2 = (im) f.get(i2);
                    if (imVar2.o()) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof iw) {
                            imVar = ((iw) childAt).a();
                        } else {
                            imVar = null;
                        }
                        View a = a(imVar2, childAt, viewGroup);
                        if (imVar2 != imVar) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.f).addView(a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.g) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f).requestLayout();
        ij ijVar2 = this.c;
        if (ijVar2 != null) {
            ijVar2.k();
            ArrayList arrayList2 = ijVar2.d;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                eco ecoVar = ((im) arrayList2.get(i3)).o;
                if (ecoVar != null) {
                    ecoVar.setSubUiVisibilityListener(this);
                }
            }
        }
        ij ijVar3 = this.c;
        if (ijVar3 != null) {
            arrayList = ijVar3.e();
        }
        if (this.m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((im) arrayList.get(0)).p;
            } else if (size3 > 0) {
                z = true;
            }
            if (z) {
                if (this.g == null) {
                    this.g = new jo(this, this.a);
                }
                ViewGroup viewGroup3 = (ViewGroup) this.g.getParent();
                if (viewGroup3 != this.f) {
                    if (viewGroup3 != null) {
                        viewGroup3.removeView(this.g);
                    }
                    ActionMenuView actionMenuView = (ActionMenuView) this.f;
                    jo joVar = this.g;
                    jt k = ActionMenuView.k();
                    k.a = true;
                    actionMenuView.addView(joVar, k);
                }
                ((ActionMenuView) this.f).b = this.m;
            }
        }
        jo joVar2 = this.g;
        if (joVar2 != null) {
            Object parent = joVar2.getParent();
            Object obj = this.f;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.g);
            }
        }
        ((ActionMenuView) this.f).b = this.m;
    }

    @Override // defpackage.ecm
    public final void j(boolean z) {
        if (z) {
            super.f(null);
            return;
        }
        ij ijVar = this.c;
        if (ijVar != null) {
            ijVar.i(false);
        }
    }

    public final void k(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean l() {
        Object obj;
        absa absaVar = this.k;
        if (absaVar != null && (obj = this.f) != null) {
            ((View) obj).removeCallbacks(absaVar);
            this.k = null;
            return true;
        }
        jp jpVar = this.i;
        if (jpVar != null) {
            jpVar.b();
            return true;
        }
        return false;
    }

    public final boolean m() {
        jp jpVar = this.i;
        if (jpVar != null && jpVar.g()) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        ij ijVar;
        if (this.m && !m() && (ijVar = this.c) != null && this.f != null && this.k == null && !ijVar.e().isEmpty()) {
            this.k = new absa(this, new jp(this, this.b, this.c, this.g), 1);
            ((View) this.f).post(this.k);
            return true;
        }
        return false;
    }

    public final void o() {
        l();
        r();
    }

    public final void p() {
        this.q = true;
    }

    public final void q() {
        this.m = true;
        this.n = true;
    }

    public final void r() {
        jm jmVar = this.j;
        if (jmVar != null) {
            jmVar.b();
        }
    }
}
