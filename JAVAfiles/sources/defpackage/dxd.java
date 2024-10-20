package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxd implements dwm {
    final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final /* synthetic */ ConstraintLayout h;

    public dxd(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    private static final boolean c(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.dwm
    public final void a() {
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.a.getChildAt(i);
            if (childAt instanceof dxn) {
                throw null;
            }
        }
        int size = this.a.b.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
            }
        }
    }

    @Override // defpackage.dwm
    public final void b(dwc dwcVar, dwl dwlVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int baseline;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z7;
        boolean z8;
        int i6;
        int i7;
        int i8;
        if (dwcVar != null) {
            if (dwcVar.ar != 8) {
                if (dwcVar.ae != null) {
                    int i9 = dwlVar.i;
                    int i10 = dwlVar.j;
                    int i11 = dwlVar.a;
                    int i12 = dwlVar.b;
                    int i13 = this.b + this.c;
                    int i14 = this.d;
                    View view = (View) dwcVar.aq;
                    int i15 = i9 - 1;
                    if (i9 != 0) {
                        if (i15 != 0) {
                            if (i15 != 1) {
                                if (i15 != 2) {
                                    if (i15 != 3) {
                                        makeMeasureSpec = 0;
                                    } else {
                                        int i16 = this.f;
                                        dwb dwbVar = dwcVar.T;
                                        if (dwbVar != null) {
                                            i8 = dwbVar.f;
                                        } else {
                                            i8 = 0;
                                        }
                                        dwb dwbVar2 = dwcVar.V;
                                        if (dwbVar2 != null) {
                                            i8 += dwbVar2.f;
                                        }
                                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(i16, i14 + i8, -1);
                                    }
                                } else {
                                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i14, -2);
                                    int i17 = dwcVar.C;
                                    int i18 = dwlVar.h;
                                    if (i18 == 1 || i18 == 2) {
                                        int measuredHeight = view.getMeasuredHeight();
                                        int h = dwcVar.h();
                                        if (dwlVar.h == 2 || i17 != 1 || measuredHeight == h || (view instanceof dxn) || dwcVar.e()) {
                                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dwcVar.j(), 1073741824);
                                        }
                                    }
                                }
                            } else {
                                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i14, -2);
                            }
                        } else {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                        }
                        int i19 = i10 - 1;
                        if (i10 != 0) {
                            if (i19 != 0) {
                                if (i19 != 1) {
                                    if (i19 != 2) {
                                        if (i19 != 3) {
                                            makeMeasureSpec2 = 0;
                                        } else {
                                            int i20 = this.g;
                                            if (dwcVar.T != null) {
                                                i7 = dwcVar.U.f;
                                            } else {
                                                i7 = 0;
                                            }
                                            if (dwcVar.V != null) {
                                                i7 += dwcVar.W.f;
                                            }
                                            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i20, i13 + i7, -1);
                                        }
                                    } else {
                                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i13, -2);
                                        int i21 = dwcVar.D;
                                        int i22 = dwlVar.h;
                                        if (i22 == 1 || i22 == 2) {
                                            int measuredWidth = view.getMeasuredWidth();
                                            int j = dwcVar.j();
                                            if (dwlVar.h == 2 || i21 != 1 || measuredWidth == j || (view instanceof dxn) || dwcVar.f()) {
                                                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dwcVar.h(), 1073741824);
                                            }
                                        }
                                    }
                                } else {
                                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i13, -2);
                                }
                            } else {
                                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                            }
                            dwd dwdVar = (dwd) dwcVar.ae;
                            if (dwdVar != null && dwi.b(this.h.e, 256) && view.getMeasuredWidth() == dwcVar.j() && view.getMeasuredWidth() < dwdVar.j() && view.getMeasuredHeight() == dwcVar.h() && view.getMeasuredHeight() < dwdVar.h() && view.getBaseline() == dwcVar.al && !dwcVar.T() && c(dwcVar.R, makeMeasureSpec, dwcVar.j()) && c(dwcVar.S, makeMeasureSpec2, dwcVar.h())) {
                                dwlVar.c = dwcVar.j();
                                dwlVar.d = dwcVar.h();
                                dwlVar.e = dwcVar.al;
                                return;
                            }
                            if (i9 == 3) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i10 == 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i10 != 4 && i10 != 1) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (i9 != 4 && i9 != 1) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (z && dwcVar.ah > brg.a) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z2 && dwcVar.ah > brg.a) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (view != null) {
                                dxc dxcVar = (dxc) view.getLayoutParams();
                                int i23 = dwlVar.h;
                                if (i23 != 1 && i23 != 2 && z && dwcVar.C == 0 && z2 && dwcVar.D == 0) {
                                    i5 = -1;
                                    baseline = 0;
                                    i = 0;
                                    i3 = 0;
                                } else {
                                    if ((view instanceof dxq) && (dwcVar instanceof dwj)) {
                                        ((dxq) view).b((dwj) dwcVar, makeMeasureSpec, makeMeasureSpec2);
                                    } else {
                                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                                    }
                                    dwcVar.F(makeMeasureSpec, makeMeasureSpec2);
                                    int measuredWidth2 = view.getMeasuredWidth();
                                    int measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                    int i24 = dwcVar.F;
                                    if (i24 > 0) {
                                        i = Math.max(i24, measuredWidth2);
                                    } else {
                                        i = measuredWidth2;
                                    }
                                    int i25 = dwcVar.G;
                                    if (i25 > 0) {
                                        i = Math.min(i25, i);
                                    }
                                    int i26 = dwcVar.I;
                                    if (i26 > 0) {
                                        i3 = Math.max(i26, measuredHeight2);
                                        i2 = makeMeasureSpec;
                                    } else {
                                        i2 = makeMeasureSpec;
                                        i3 = measuredHeight2;
                                    }
                                    int i27 = dwcVar.J;
                                    if (i27 > 0) {
                                        i3 = Math.min(i27, i3);
                                    }
                                    if (!dwi.b(this.h.e, 1)) {
                                        if (z5 && z3) {
                                            i = (int) ((i3 * dwcVar.ah) + 0.5f);
                                        } else if (z6 && z4) {
                                            i3 = (int) ((i / dwcVar.ah) + 0.5f);
                                        }
                                    }
                                    if (measuredWidth2 != i || measuredHeight2 != i3) {
                                        if (measuredWidth2 != i) {
                                            i4 = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
                                        } else {
                                            i4 = i2;
                                        }
                                        if (measuredHeight2 != i3) {
                                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                        }
                                        view.measure(i4, makeMeasureSpec2);
                                        dwcVar.F(i4, makeMeasureSpec2);
                                        i = view.getMeasuredWidth();
                                        i3 = view.getMeasuredHeight();
                                        baseline = view.getBaseline();
                                    }
                                    i5 = -1;
                                }
                                if (baseline == i5) {
                                    z7 = false;
                                } else {
                                    z7 = true;
                                }
                                if (i == dwlVar.a && i3 == dwlVar.b) {
                                    z8 = false;
                                } else {
                                    z8 = true;
                                }
                                dwlVar.g = z8;
                                boolean z9 = z7 | dxcVar.ag;
                                if (z9) {
                                    if (baseline != -1) {
                                        if (dwcVar.al != baseline) {
                                            dwlVar.g = true;
                                        }
                                    } else {
                                        i6 = -1;
                                        dwlVar.c = i;
                                        dwlVar.d = i3;
                                        dwlVar.f = z9;
                                        dwlVar.e = i6;
                                        return;
                                    }
                                }
                                i6 = baseline;
                                dwlVar.c = i;
                                dwlVar.d = i3;
                                dwlVar.f = z9;
                                dwlVar.e = i6;
                                return;
                            }
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                return;
            }
            dwlVar.c = 0;
            dwlVar.d = 0;
            dwlVar.e = 0;
        }
    }
}
