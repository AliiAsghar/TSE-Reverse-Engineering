package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.eek;
import defpackage.efu;
import defpackage.efx;
import defpackage.gnn;
import defpackage.gnu;
import defpackage.gnw;
import defpackage.gnx;
import defpackage.gny;
import defpackage.gnz;
import defpackage.goa;
import defpackage.gob;
import defpackage.goc;
import defpackage.god;
import defpackage.gof;
import defpackage.goh;
import defpackage.goi;
import defpackage.goj;
import defpackage.gok;
import defpackage.gol;
import defpackage.gom;
import defpackage.gvf;
import defpackage.hgi;
import defpackage.nn;
import defpackage.no;
import defpackage.nq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public final gnw a;
    public int b;
    public boolean c;
    LinearLayoutManager d;
    public RecyclerView e;
    public gnz f;
    public final boolean g;
    public final int h;
    public final nq i;
    public gvf j;
    private final Rect k;
    private final Rect l;
    private int m;
    private Parcelable n;
    private nn o;
    private gnw p;
    private gnx q;
    private hgi r;

    public ViewPager2(Context context) {
        super(context);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new gnw();
        this.c = false;
        this.i = new goa(this);
        this.m = -1;
        this.g = true;
        this.h = -1;
        j(context, null);
    }

    private final void j(Context context, AttributeSet attributeSet) {
        this.j = new goi(this);
        gok gokVar = new gok(this, context);
        this.e = gokVar;
        gokVar.setId(View.generateViewId());
        this.e.setDescendantFocusability(131072);
        gof gofVar = new gof(this);
        this.d = gofVar;
        this.e.aj(gofVar);
        RecyclerView recyclerView = this.e;
        recyclerView.E = ViewConfiguration.get(recyclerView.getContext()).getScaledPagingTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gnn.a);
        eek.m(this, context, gnn.a, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            this.d.ae(obtainStyledAttributes.getInt(0, 0));
            ((goi) this.j).j();
            obtainStyledAttributes.recycle();
            this.e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.e.v(new god());
            this.f = new gnz(this);
            gnz gnzVar = this.f;
            RecyclerView recyclerView2 = this.e;
            this.r = new hgi(gnzVar);
            goj gojVar = new goj(this);
            this.o = gojVar;
            gojVar.e(recyclerView2);
            this.e.aL(this.f);
            this.e.setOverScrollMode(getOverScrollMode());
            gnw gnwVar = new gnw();
            this.p = gnwVar;
            this.f.f = gnwVar;
            gob gobVar = new gob(this);
            goc gocVar = new goc(this);
            gnwVar.i(gobVar);
            this.p.i(gocVar);
            gvf gvfVar = this.j;
            this.e.setImportantForAccessibility(2);
            goi goiVar = (goi) gvfVar;
            goiVar.b = new goh(goiVar);
            if (goiVar.a.getImportantForAccessibility() == 0) {
                goiVar.a.setImportantForAccessibility(1);
            }
            this.p.i(this.a);
            gnx gnxVar = new gnx();
            this.q = gnxVar;
            this.p.i(gnxVar);
            RecyclerView recyclerView3 = this.e;
            attachViewToParent(recyclerView3, 0, recyclerView3.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int a() {
        if (this.d.k == 1) {
            return 1;
        }
        return 0;
    }

    public final int b() {
        return this.f.b;
    }

    public final no c() {
        return this.e.l;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.e.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.e.canScrollVertically(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        no c;
        if (this.m != -1 && (c = c()) != 0) {
            Parcelable parcelable = this.n;
            if (parcelable != null) {
                if (c instanceof gnu) {
                    ((gnu) c).H(parcelable);
                }
                this.n = null;
            }
            int max = Math.max(0, Math.min(this.m, c.b() - 1));
            this.b = max;
            this.m = -1;
            this.e.ae(max);
            ((goi) this.j).j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof gol) {
            int i = ((gol) parcelable).a;
            sparseArray.put(this.e.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        d();
    }

    public final void e(int i) {
        h();
        i(i);
    }

    public final void f() {
        nn nnVar = this.o;
        if (nnVar != null) {
            View b = nnVar.b(this.d);
            if (b == null) {
                return;
            }
            int bt = LinearLayoutManager.bt(b);
            if (bt != this.b && b() == 0) {
                this.p.g(bt);
            }
            this.c = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final boolean g() {
        if (this.d.aw() == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }

    public final void h() {
        Object obj = this.r.a;
    }

    public final void i(int i) {
        int i2;
        int i3;
        no c = c();
        if (c == null) {
            if (this.m != -1) {
                this.m = Math.max(i, 0);
                return;
            }
            return;
        }
        if (c.b() > 0) {
            int min = Math.min(Math.max(i, 0), c.b() - 1);
            if ((min != this.b || !this.f.Y()) && min != (i2 = this.b)) {
                this.b = min;
                ((goi) this.j).j();
                double d = i2;
                if (!this.f.Y()) {
                    gnz gnzVar = this.f;
                    gnzVar.X();
                    gny gnyVar = gnzVar.c;
                    d = gnyVar.a + gnyVar.b;
                }
                gnz gnzVar2 = this.f;
                gnzVar2.a = 2;
                int i4 = gnzVar2.d;
                gnzVar2.d = min;
                gnzVar2.W(2);
                if (i4 != min) {
                    gnzVar2.k(min);
                }
                double d2 = min;
                if (Math.abs(d2 - d) > 3.0d) {
                    RecyclerView recyclerView = this.e;
                    if (d2 > d) {
                        i3 = min - 3;
                    } else {
                        i3 = min + 3;
                    }
                    recyclerView.ae(i3);
                    RecyclerView recyclerView2 = this.e;
                    recyclerView2.post(new gom(min, recyclerView2));
                    return;
                }
                this.e.ao(min);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int b;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        gvf gvfVar = this.j;
        efx efxVar = new efx(accessibilityNodeInfo);
        goi goiVar = (goi) gvfVar;
        if (goiVar.a.c() != null) {
            if (goiVar.a.a() == 1) {
                i = goiVar.a.c().b();
                i2 = 1;
            } else {
                i2 = goiVar.a.c().b();
                i = 1;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        efxVar.s(efu.j(i, i2, 0));
        no c = goiVar.a.c();
        if (c != null && (b = c.b()) != 0) {
            ViewPager2 viewPager2 = goiVar.a;
            if (viewPager2.g) {
                if (viewPager2.b > 0) {
                    efxVar.g(8192);
                }
                if (goiVar.a.b < b - 1) {
                    efxVar.g(4096);
                }
                efxVar.M(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.e.getMeasuredWidth();
        int measuredHeight = this.e.getMeasuredHeight();
        this.k.left = getPaddingLeft();
        this.k.right = (i3 - i) - getPaddingRight();
        this.k.top = getPaddingTop();
        this.k.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.k, this.l);
        Rect rect = this.l;
        this.e.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.c) {
            f();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        measureChild(this.e, i, i2);
        int measuredWidth = this.e.getMeasuredWidth();
        int measuredHeight = this.e.getMeasuredHeight();
        int measuredState = this.e.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof gol)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        gol golVar = (gol) parcelable;
        super.onRestoreInstanceState(golVar.getSuperState());
        this.m = golVar.b;
        this.n = golVar.c;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        gol golVar = new gol(super.onSaveInstanceState());
        golVar.a = this.e.getId();
        int i = this.m;
        if (i == -1) {
            i = this.b;
        }
        golVar.b = i;
        Parcelable parcelable = this.n;
        if (parcelable != null) {
            golVar.c = parcelable;
        } else {
            Object obj = this.e.l;
            if (obj instanceof gnu) {
                golVar.c = ((gnu) obj).m();
            }
        }
        return golVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" does not support direct child views"));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2;
        if (this.j.k(i)) {
            gvf gvfVar = this.j;
            if (gvfVar.k(i)) {
                if (i == 8192) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                goi goiVar = (goi) gvfVar;
                goiVar.i(goiVar.a.b + i2);
                return true;
            }
            throw new IllegalStateException();
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        ((goi) this.j).j();
    }

    @Override // android.view.View
    public final void setOverScrollMode(int i) {
        RecyclerView recyclerView = this.e;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(i);
        }
        super.setOverScrollMode(i);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new gnw();
        this.c = false;
        this.i = new goa(this);
        this.m = -1;
        this.g = true;
        this.h = -1;
        j(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new gnw();
        this.c = false;
        this.i = new goa(this);
        this.m = -1;
        this.g = true;
        this.h = -1;
        j(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new gnw();
        this.c = false;
        this.i = new goa(this);
        this.m = -1;
        this.g = true;
        this.h = -1;
        j(context, attributeSet);
    }
}
