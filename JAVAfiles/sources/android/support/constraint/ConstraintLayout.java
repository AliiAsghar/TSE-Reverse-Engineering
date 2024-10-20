package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ad;
import defpackage.af;
import defpackage.ag;
import defpackage.an;
import defpackage.ao;
import defpackage.ap;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    final SparseArray a;
    final ao b;
    public af c;
    private final ArrayList d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new ao();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 2;
        this.c = null;
        d(null);
    }

    private final an b(int i) {
        View view;
        if (i != 0 && (view = (View) this.a.get(i)) != this) {
            if (view == null) {
                return null;
            }
            return ((ad) view.getLayoutParams()).Y;
        }
        return this.b;
    }

    private final an c(View view) {
        if (view == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((ad) view.getLayoutParams()).Y;
    }

    private final void d(AttributeSet attributeSet) {
        this.b.J = this;
        this.a.put(getId(), this);
        this.c = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ag.a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(16, this.e);
                } else if (index == 17) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(17, this.f);
                } else if (index == 14) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(14, this.g);
                } else if (index == 15) {
                    this.h = obtainStyledAttributes.getDimensionPixelOffset(15, this.h);
                } else if (index == 113) {
                    this.j = obtainStyledAttributes.getInt(113, this.j);
                } else if (index == 34) {
                    int resourceId = obtainStyledAttributes.getResourceId(34, 0);
                    af afVar = new af();
                    this.c = afVar;
                    afVar.h(getContext(), resourceId);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.b.ai = this.j;
    }

    protected final void a() {
        this.b.D();
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ad;
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ad();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ad(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            ad adVar = (ad) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || adVar.Q || isInEditMode) {
                an anVar = adVar.Y;
                int b = anVar.b();
                int c = anVar.c();
                childAt.layout(b, c, anVar.h() + b, anVar.d() + c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x045d, code lost:
    
        if (r10.height == (-1)) goto L231;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04b7 A[EDGE_INSN: B:254:0x04b7->B:255:0x04b7 BREAK  A[LOOP:2: B:207:0x041f->B:239:0x04b1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r25, int r26) {
        /*
            Method dump skipped, instructions count: 1556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean z = view instanceof Guideline;
        an c = c(view);
        if (z && !(c instanceof ap)) {
            ad adVar = (ad) view.getLayoutParams();
            adVar.Y = new ap();
            adVar.Q = true;
            ((ap) adVar.Y).A(adVar.M);
            an anVar = adVar.Y;
        }
        this.a.put(view.getId(), view);
        this.i = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.b.F(c(view));
        this.i = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.i = true;
    }

    @Override // android.view.View
    public final void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ad(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new ao();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 2;
        this.c = null;
        d(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new ao();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 2;
        this.c = null;
        d(attributeSet);
    }
}
