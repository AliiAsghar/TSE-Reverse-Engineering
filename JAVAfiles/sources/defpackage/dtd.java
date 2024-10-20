package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtd extends czt implements dtf, edh {
    public final Window a;
    public boolean b;
    public boolean c;
    public boolean d;
    private final byn e;
    private boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dtd$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.b = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.b | 1);
            dtd.this.b((bwj) obj, a);
            return arnb.a;
        }
    }

    public dtd(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.a = window;
        this.e = new byu(dtb.a, cav.a);
        edz.k(this, this);
        mka.i(this, new eeu() { // from class: dtd.1
            {
                super(1);
            }

            @Override // defpackage.eeu
            public final efo b(efo efoVar, List list) {
                dtd dtdVar = dtd.this;
                if (!dtdVar.c) {
                    int i = 0;
                    View childAt = dtdVar.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, dtdVar.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, dtdVar.getHeight() - childAt.getBottom());
                    if (max == 0) {
                        if (max2 == 0) {
                            if (max3 == 0) {
                                if (max4 != 0) {
                                    max2 = 0;
                                    max3 = 0;
                                } else {
                                    return efoVar;
                                }
                            } else {
                                max2 = 0;
                            }
                        }
                    } else {
                        i = max;
                    }
                    return efoVar.n(i, max2, max3, max4);
                }
                return efoVar;
            }

            @Override // defpackage.eeu
            public final eet d(eet eetVar) {
                dtd dtdVar = dtd.this;
                if (!dtdVar.c) {
                    int i = 0;
                    View childAt = dtdVar.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, dtdVar.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, dtdVar.getHeight() - childAt.getBottom());
                    if (max == 0) {
                        if (max2 == 0) {
                            if (max3 == 0) {
                                if (max4 != 0) {
                                    max2 = 0;
                                    max3 = 0;
                                } else {
                                    return eetVar;
                                }
                            } else {
                                max2 = 0;
                            }
                        }
                    } else {
                        i = max;
                    }
                    eaq eaqVar = eetVar.a;
                    eaq d = eaq.d(i, max2, max3, max4);
                    int i2 = d.b;
                    int i3 = d.c;
                    int i4 = d.d;
                    int i5 = d.e;
                    return new eet(efo.i(eaqVar, i2, i3, i4, i5), efo.i(eetVar.b, i2, i3, i4, i5));
                }
                return eetVar;
            }
        });
    }

    @Override // defpackage.dtf
    public final Window a() {
        return this.a;
    }

    @Override // defpackage.czt
    public final void b(bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 6;
        bwj c = bwjVar.c(1735448596);
        if (i4 == 0) {
            if (true != c.I(this)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c.L()) {
            c.v();
        } else {
            ((arqv) this.e.a()).a(c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(i);
        }
    }

    public final void c(bwr bwrVar, arqv arqvVar) {
        super.i(bwrVar);
        this.e.h(arqvVar);
        this.f = true;
        e();
    }

    @Override // defpackage.czt
    protected final boolean d() {
        return this.f;
    }

    @Override // defpackage.edh
    public final efo ez(View view, efo efoVar) {
        if (!this.c) {
            int i = 0;
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max == 0) {
                if (max2 == 0) {
                    if (max3 == 0) {
                        if (max4 != 0) {
                            max2 = 0;
                            max3 = 0;
                        } else {
                            return efoVar;
                        }
                    } else {
                        max2 = 0;
                    }
                }
            } else {
                i = max;
            }
            return efoVar.n(i, max2, max3, max4);
        }
        return efoVar;
    }

    @Override // defpackage.czt
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft() + (((i5 - measuredWidth) - paddingLeft) / 2);
        int paddingTop2 = getPaddingTop() + (((i6 - measuredHeight) - paddingTop) / 2);
        childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
    }

    @Override // defpackage.czt
    public final void h(int i, int i2) {
        int i3;
        int min;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.h(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE && !this.b && !this.c && this.a.getAttributes().height == -2) {
            i3 = size2 + 1;
        } else {
            i3 = size2;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i5 = size - paddingLeft;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = i3 - paddingTop;
        if (i6 >= 0) {
            i4 = i6;
        }
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size = childAt.getMeasuredWidth() + paddingLeft;
            }
        } else {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingLeft);
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                min = childAt.getMeasuredHeight() + paddingTop;
            } else {
                min = size2;
            }
        } else {
            min = Math.min(size2, childAt.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, min);
        if (!this.b && !this.c && childAt.getMeasuredHeight() + paddingTop > size2 && this.a.getAttributes().height == -2) {
            this.a.setLayout(-1, -1);
        }
    }
}
