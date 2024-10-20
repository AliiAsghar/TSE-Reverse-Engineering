package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.dwc;
import defpackage.dwf;
import defpackage.dwj;
import defpackage.dxp;
import defpackage.dxq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Flow extends dxq {
    private dwf a;

    public Flow(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dxq, defpackage.dxa
    public final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.a = new dwf();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dxp.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.a.aI = obtainStyledAttributes.getInt(0, 0);
                } else if (index == 1) {
                    dwf dwfVar = this.a;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
                    dwfVar.aN = dimensionPixelSize;
                    dwfVar.aO = dimensionPixelSize;
                    dwfVar.aP = dimensionPixelSize;
                    dwfVar.aQ = dimensionPixelSize;
                } else if (index == 18) {
                    this.a.aj(obtainStyledAttributes.getDimensionPixelSize(18, 0));
                } else if (index == 19) {
                    this.a.aQ = obtainStyledAttributes.getDimensionPixelSize(19, 0);
                } else if (index == 2) {
                    this.a.aR = obtainStyledAttributes.getDimensionPixelSize(2, 0);
                } else if (index == 3) {
                    this.a.aN = obtainStyledAttributes.getDimensionPixelSize(3, 0);
                } else if (index == 4) {
                    this.a.aS = obtainStyledAttributes.getDimensionPixelSize(4, 0);
                } else if (index == 5) {
                    this.a.aO = obtainStyledAttributes.getDimensionPixelSize(5, 0);
                } else if (index == 54) {
                    this.a.aG = obtainStyledAttributes.getInt(54, 0);
                } else if (index == 44) {
                    this.a.a = obtainStyledAttributes.getInt(44, 0);
                } else if (index == 53) {
                    this.a.b = obtainStyledAttributes.getInt(53, 0);
                } else if (index == 38) {
                    this.a.c = obtainStyledAttributes.getInt(38, 0);
                } else if (index == 46) {
                    this.a.e = obtainStyledAttributes.getInt(46, 0);
                } else if (index == 40) {
                    this.a.d = obtainStyledAttributes.getInt(40, 0);
                } else if (index == 48) {
                    this.a.f = obtainStyledAttributes.getInt(48, 0);
                } else if (index == 42) {
                    this.a.g = obtainStyledAttributes.getFloat(42, 0.5f);
                } else if (index == 37) {
                    this.a.i = obtainStyledAttributes.getFloat(37, 0.5f);
                } else if (index == 45) {
                    this.a.k = obtainStyledAttributes.getFloat(45, 0.5f);
                } else if (index == 39) {
                    this.a.j = obtainStyledAttributes.getFloat(39, 0.5f);
                } else if (index == 47) {
                    this.a.aB = obtainStyledAttributes.getFloat(47, 0.5f);
                } else if (index == 51) {
                    this.a.h = obtainStyledAttributes.getFloat(51, 0.5f);
                } else if (index == 41) {
                    this.a.aE = obtainStyledAttributes.getInt(41, 2);
                } else if (index == 50) {
                    this.a.aF = obtainStyledAttributes.getInt(50, 2);
                } else if (index == 43) {
                    this.a.aC = obtainStyledAttributes.getDimensionPixelSize(43, 0);
                } else if (index == 52) {
                    this.a.aD = obtainStyledAttributes.getDimensionPixelSize(52, 0);
                } else if (index == 49) {
                    this.a.aH = obtainStyledAttributes.getInt(49, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.i = this.a;
        k();
    }

    @Override // defpackage.dxq
    public final void b(dwj dwjVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (dwjVar != null) {
            dwjVar.b(mode, size, mode2, size2);
            setMeasuredDimension(dwjVar.aU, dwjVar.aV);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // defpackage.dxa
    public final void c(dwc dwcVar, boolean z) {
        dwf dwfVar = this.a;
        int i = dwfVar.aP;
        if (i <= 0 && dwfVar.aQ <= 0) {
            return;
        }
        if (z) {
            dwfVar.aR = dwfVar.aQ;
            dwfVar.aS = i;
        } else {
            dwfVar.aR = i;
            dwfVar.aS = dwfVar.aQ;
        }
    }

    @Override // defpackage.dxa, android.view.View
    protected final void onMeasure(int i, int i2) {
        b(this.a, i, i2);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
