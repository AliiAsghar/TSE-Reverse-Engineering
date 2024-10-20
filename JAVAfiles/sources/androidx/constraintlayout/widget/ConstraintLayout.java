package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.brg;
import defpackage.dwc;
import defpackage.dwd;
import defpackage.dwg;
import defpackage.dwh;
import defpackage.dxa;
import defpackage.dxc;
import defpackage.dxd;
import defpackage.dxl;
import defpackage.dxm;
import defpackage.dxn;
import defpackage.dxp;
import defpackage.ef;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    final SparseArray a;
    public final ArrayList b;
    protected final dwd c;
    protected boolean d;
    public int e;
    public dxl f;
    final dxd g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private HashMap m;
    private final SparseArray n;

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new dwd();
        this.h = 0;
        this.i = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.f = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.g = new dxd(this, this);
        e(null, 0, 0);
    }

    private final void e(AttributeSet attributeSet, int i, int i2) {
        dwd dwdVar = this.c;
        dwdVar.aq = this;
        dwdVar.af(this.g);
        this.a.put(getId(), this);
        this.f = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dxp.b, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.h = obtainStyledAttributes.getDimensionPixelOffset(16, this.h);
                } else if (index == 17) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(17, this.i);
                } else if (index == 14) {
                    this.j = obtainStyledAttributes.getDimensionPixelOffset(14, this.j);
                } else if (index == 15) {
                    this.k = obtainStyledAttributes.getDimensionPixelOffset(15, this.k);
                } else if (index == 113) {
                    this.e = obtainStyledAttributes.getInt(113, this.e);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(56, 0);
                    if (resourceId != 0) {
                        try {
                            ef.l(getContext(), resourceId, new SparseArray(), new SparseArray());
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(34, 0);
                    try {
                        dxl dxlVar = new dxl();
                        this.f = dxlVar;
                        dxlVar.g(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f = null;
                    }
                    this.l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.c.ag(this.e);
    }

    private final void f() {
        this.d = true;
    }

    private final void g() {
        float f;
        int i;
        int i2;
        dwc dwcVar;
        dwc dwcVar2;
        dwc dwcVar3;
        dwc dwcVar4;
        dxc dxcVar;
        dwc dwcVar5;
        boolean z;
        String str;
        int d;
        dwc dwcVar6;
        String str2;
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            dwc b = b(getChildAt(i3));
            if (b != null) {
                b.u();
            }
        }
        if (isInEditMode) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    int id = childAt.getId();
                    Integer valueOf = Integer.valueOf(id);
                    if (resourceName instanceof String) {
                        if (this.m == null) {
                            this.m = new HashMap();
                        }
                        int indexOf = resourceName.indexOf("/");
                        if (indexOf != -1) {
                            str2 = resourceName.substring(indexOf + 1);
                        } else {
                            str2 = resourceName;
                        }
                        valueOf.getClass();
                        this.m.put(str2, Integer.valueOf(id));
                    }
                    int indexOf2 = resourceName.indexOf(47);
                    if (indexOf2 != -1) {
                        resourceName = resourceName.substring(indexOf2 + 1);
                    }
                    int id2 = childAt.getId();
                    if (id2 == 0) {
                        dwcVar6 = this.c;
                    } else {
                        View view = (View) this.a.get(id2);
                        if (view == null && (view = findViewById(id2)) != null && view != this && view.getParent() == this) {
                            onViewAdded(view);
                        }
                        if (view == this) {
                            dwcVar6 = this.c;
                        } else if (view == null) {
                            dwcVar6 = null;
                        } else {
                            dwcVar6 = ((dxc) view.getLayoutParams()).av;
                        }
                    }
                    dwcVar6.as = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.l != -1) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt2 = getChildAt(i5);
                if (childAt2.getId() == this.l && (childAt2 instanceof dxm)) {
                    throw null;
                }
            }
        }
        dxl dxlVar = this.f;
        if (dxlVar != null) {
            dxlVar.k(this);
        }
        this.c.ao();
        int size = this.b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                dxa dxaVar = (dxa) this.b.get(i6);
                if (dxaVar.isInEditMode()) {
                    dxaVar.h(dxaVar.f);
                }
                dwh dwhVar = dxaVar.i;
                if (dwhVar != null) {
                    dwhVar.aM = 0;
                    Arrays.fill(dwhVar.aL, (Object) null);
                    for (int i7 = 0; i7 < dxaVar.d; i7++) {
                        int i8 = dxaVar.c[i7];
                        View a = a(i8);
                        if (a == null && (d = dxaVar.d(this, (str = (String) dxaVar.h.get(Integer.valueOf(i8))))) != 0) {
                            dxaVar.c[i7] = d;
                            dxaVar.h.put(Integer.valueOf(d), str);
                            a = a(d);
                        }
                        if (a != null) {
                            dxaVar.i.af(b(a));
                        }
                    }
                    dxaVar.i.ah();
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt3 = getChildAt(i9);
            if (childAt3 instanceof dxn) {
                throw null;
            }
        }
        this.n.clear();
        this.n.put(0, this.c);
        this.n.put(getId(), this.c);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt4 = getChildAt(i10);
            this.n.put(childAt4.getId(), b(childAt4));
        }
        int i11 = 0;
        while (i11 < childCount) {
            View childAt5 = getChildAt(i11);
            dwc b2 = b(childAt5);
            if (b2 != null) {
                dxc dxcVar2 = (dxc) childAt5.getLayoutParams();
                this.c.am(b2);
                SparseArray sparseArray = this.n;
                dxcVar2.a();
                dxcVar2.aw = z2;
                b2.ar = childAt5.getVisibility();
                boolean z3 = dxcVar2.aj;
                b2.aq = childAt5;
                if (childAt5 instanceof dxa) {
                    ((dxa) childAt5).c(b2, this.c.d);
                }
                if (dxcVar2.ah) {
                    dwg dwgVar = (dwg) b2;
                    int i12 = dxcVar2.as;
                    int i13 = dxcVar2.at;
                    float f2 = dxcVar2.au;
                    if (f2 != -1.0f) {
                        dwgVar.af(f2);
                    } else if (i12 != -1) {
                        dwgVar.c(i12);
                    } else if (i13 != -1) {
                        dwgVar.ae(i13);
                    }
                } else {
                    int i14 = dxcVar2.al;
                    int i15 = dxcVar2.am;
                    int i16 = dxcVar2.an;
                    int i17 = dxcVar2.ao;
                    int i18 = dxcVar2.ap;
                    int i19 = dxcVar2.aq;
                    float f3 = dxcVar2.ar;
                    int i20 = dxcVar2.p;
                    if (i20 != -1) {
                        dwc dwcVar7 = (dwc) sparseArray.get(i20);
                        if (dwcVar7 != null) {
                            b2.r(dwcVar7, dxcVar2.r, dxcVar2.q);
                        }
                        dxcVar = dxcVar2;
                        dwcVar5 = b2;
                    } else {
                        if (i14 != -1) {
                            dwc dwcVar8 = (dwc) sparseArray.get(i14);
                            if (dwcVar8 != null) {
                                f = f3;
                                i = i19;
                                i2 = i17;
                                b2.Z(2, dwcVar8, 2, dxcVar2.leftMargin, i18);
                            } else {
                                f = f3;
                                i = i19;
                                i2 = i17;
                            }
                        } else {
                            f = f3;
                            i = i19;
                            i2 = i17;
                            if (i15 != -1 && (dwcVar = (dwc) sparseArray.get(i15)) != null) {
                                b2.Z(2, dwcVar, 4, dxcVar2.leftMargin, i18);
                            }
                        }
                        if (i16 != -1) {
                            dwc dwcVar9 = (dwc) sparseArray.get(i16);
                            if (dwcVar9 != null) {
                                b2.Z(4, dwcVar9, 2, dxcVar2.rightMargin, i);
                            }
                        } else if (i2 != -1 && (dwcVar2 = (dwc) sparseArray.get(i2)) != null) {
                            b2.Z(4, dwcVar2, 4, dxcVar2.rightMargin, i);
                        }
                        int i21 = dxcVar2.i;
                        if (i21 != -1) {
                            dwc dwcVar10 = (dwc) sparseArray.get(i21);
                            if (dwcVar10 != null) {
                                b2.Z(3, dwcVar10, 3, dxcVar2.topMargin, dxcVar2.x);
                            }
                        } else {
                            int i22 = dxcVar2.j;
                            if (i22 != -1 && (dwcVar3 = (dwc) sparseArray.get(i22)) != null) {
                                b2.Z(3, dwcVar3, 5, dxcVar2.topMargin, dxcVar2.x);
                            }
                        }
                        int i23 = dxcVar2.k;
                        if (i23 != -1) {
                            dwc dwcVar11 = (dwc) sparseArray.get(i23);
                            if (dwcVar11 != null) {
                                b2.Z(5, dwcVar11, 3, dxcVar2.bottomMargin, dxcVar2.z);
                            }
                        } else {
                            int i24 = dxcVar2.l;
                            if (i24 != -1 && (dwcVar4 = (dwc) sparseArray.get(i24)) != null) {
                                b2.Z(5, dwcVar4, 5, dxcVar2.bottomMargin, dxcVar2.z);
                            }
                        }
                        int i25 = dxcVar2.m;
                        if (i25 != -1) {
                            dxcVar = dxcVar2;
                            dwcVar5 = b2;
                            h(b2, dxcVar2, sparseArray, i25, 6);
                        } else {
                            dxcVar = dxcVar2;
                            dwcVar5 = b2;
                            int i26 = dxcVar.n;
                            if (i26 != -1) {
                                h(dwcVar5, dxcVar, sparseArray, i26, 3);
                            } else {
                                int i27 = dxcVar.o;
                                if (i27 != -1) {
                                    h(dwcVar5, dxcVar, sparseArray, i27, 5);
                                }
                            }
                        }
                        float f4 = f;
                        if (f4 >= brg.a) {
                            dwcVar5.ao = f4;
                        }
                        float f5 = dxcVar.H;
                        if (f5 >= brg.a) {
                            dwcVar5.ap = f5;
                        }
                    }
                    if (isInEditMode) {
                        int i28 = dxcVar.X;
                        if (i28 == -1) {
                            if (dxcVar.Y != -1) {
                                i28 = -1;
                            }
                        }
                        int i29 = dxcVar.Y;
                        dwcVar5.aj = i28;
                        dwcVar5.ak = i29;
                    }
                    if (!dxcVar.ae) {
                        if (dxcVar.width == -1) {
                            if (dxcVar.aa) {
                                dwcVar5.aa(3);
                            } else {
                                dwcVar5.aa(4);
                            }
                            dwcVar5.U(2).f = dxcVar.leftMargin;
                            dwcVar5.U(4).f = dxcVar.rightMargin;
                        } else {
                            dwcVar5.aa(3);
                            dwcVar5.M(0);
                        }
                    } else {
                        dwcVar5.aa(1);
                        dwcVar5.M(dxcVar.width);
                        if (dxcVar.width == -2) {
                            dwcVar5.aa(2);
                        }
                    }
                    if (!dxcVar.af) {
                        if (dxcVar.height == -1) {
                            if (dxcVar.ab) {
                                dwcVar5.ab(3);
                            } else {
                                dwcVar5.ab(4);
                            }
                            dwcVar5.U(3).f = dxcVar.topMargin;
                            dwcVar5.U(5).f = dxcVar.bottomMargin;
                            z = false;
                        } else {
                            dwcVar5.ab(3);
                            z = false;
                            dwcVar5.B(0);
                        }
                    } else {
                        z = false;
                        dwcVar5.ab(1);
                        dwcVar5.B(dxcVar.height);
                        if (dxcVar.height == -2) {
                            dwcVar5.ab(2);
                        }
                    }
                    dwcVar5.y(dxcVar.I);
                    dwcVar5.D(dxcVar.L);
                    dwcVar5.L(dxcVar.M);
                    dwcVar5.at = dxcVar.N;
                    dwcVar5.au = dxcVar.O;
                    int i30 = dxcVar.ad;
                    if (i30 >= 0 && i30 <= 3) {
                        dwcVar5.B = i30;
                    }
                    dwcVar5.C(dxcVar.P, dxcVar.R, dxcVar.T, dxcVar.V);
                    dwcVar5.K(dxcVar.Q, dxcVar.S, dxcVar.U, dxcVar.W);
                    i11++;
                    z2 = z;
                }
            }
            z = z2;
            i11++;
            z2 = z;
        }
    }

    private final void h(dwc dwcVar, dxc dxcVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        dwc dwcVar2 = (dwc) sparseArray.get(i);
        if (dwcVar2 != null && view != null && (view.getLayoutParams() instanceof dxc)) {
            dxcVar.ag = true;
            if (i2 == 6) {
                dxc dxcVar2 = (dxc) view.getLayoutParams();
                dxcVar2.ag = true;
                dxcVar2.av.P = true;
            }
            dwcVar.U(6).n(dwcVar2.U(i2), dxcVar.D, dxcVar.C, true);
            dwcVar.P = true;
            dwcVar.U(3).e();
            dwcVar.U(5).e();
        }
    }

    public final View a(int i) {
        return (View) this.a.get(i);
    }

    public final dwc b(View view) {
        if (view == this) {
            return this.c;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof dxc) {
                return ((dxc) view.getLayoutParams()).av;
            }
            view.setLayoutParams(new dxc(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof dxc) {
                return ((dxc) view.getLayoutParams()).av;
            }
            return null;
        }
        return null;
    }

    protected final boolean c() {
        if ((getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof dxc;
    }

    public final Object d(Object obj) {
        HashMap hashMap;
        if ((obj instanceof String) && (hashMap = this.m) != null && hashMap.containsKey(obj)) {
            return this.m.get(obj);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        int i3 = (int) ((parseInt2 / 1920.0f) * height);
                        int i4 = (int) ((parseInt / 1080.0f) * width);
                        float f = ((int) ((parseInt3 / 1080.0f) * width)) + i4;
                        float f2 = i4;
                        float f3 = i3;
                        canvas.drawLine(f2, f3, f, f3, paint);
                        float parseInt4 = i3 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f, f3, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        f();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new dxc();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new dxc(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            dxc dxcVar = (dxc) childAt.getLayoutParams();
            dwc dwcVar = dxcVar.av;
            if (childAt.getVisibility() == 8 && !dxcVar.ah && !dxcVar.ai) {
                boolean z2 = dxcVar.ak;
                if (!isInEditMode) {
                    continue;
                }
            }
            boolean z3 = dxcVar.aj;
            int k = dwcVar.k();
            int l = dwcVar.l();
            childAt.layout(k, l, dwcVar.j() + k, dwcVar.h() + l);
            if (childAt instanceof dxn) {
                throw null;
            }
        }
        int size = this.b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r19, int r20) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean z = view instanceof Guideline;
        dwc b = b(view);
        if (z && !(b instanceof dwg)) {
            dxc dxcVar = (dxc) view.getLayoutParams();
            dxcVar.av = new dwg();
            dxcVar.ah = true;
            ((dwg) dxcVar.av).ag(dxcVar.Z);
        }
        if (view instanceof dxa) {
            dxa dxaVar = (dxa) view;
            dxaVar.k();
            ((dxc) view.getLayoutParams()).ai = true;
            if (!this.b.contains(dxaVar)) {
                this.b.add(dxaVar);
            }
        }
        this.a.put(view.getId(), view);
        this.d = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.an(b(view));
        this.b.remove(view);
        this.d = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        f();
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new dxc(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new dwd();
        this.h = 0;
        this.i = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.f = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.g = new dxd(this, this);
        e(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new dwd();
        this.h = 0;
        this.i = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.f = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.g = new dxd(this, this);
        e(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new dwd();
        this.h = 0;
        this.i = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.f = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.g = new dxd(this, this);
        e(attributeSet, i, i2);
    }
}
