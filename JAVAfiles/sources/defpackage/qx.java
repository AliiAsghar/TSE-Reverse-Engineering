package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qx extends nq implements ny {
    private qt A;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public final qs j;
    public int k;
    public RecyclerView m;
    public VelocityTracker o;
    public GestureDetector q;
    public Rect r;
    public long s;
    private float u;
    private float v;
    private int x;
    private List y;
    private List z;
    public final List a = new ArrayList();
    private final float[] t = new float[2];
    public oo b = null;
    public int i = -1;
    private int w = 0;
    public final List l = new ArrayList();
    public final Runnable n = new ou(this, 7);
    View p = null;
    private final oa B = new ghe(this, 1);

    public qx(qs qsVar) {
        this.j = qsVar;
    }

    private final void af(float[] fArr) {
        if ((this.k & 12) != 0) {
            fArr[0] = (this.g + this.e) - this.b.a.getLeft();
        } else {
            fArr[0] = this.b.a.getTranslationX();
        }
        if ((this.k & 3) != 0) {
            fArr[1] = (this.h + this.f) - this.b.a.getTop();
        } else {
            fArr[1] = this.b.a.getTranslationY();
        }
    }

    private final void ag() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.o = null;
        }
    }

    private static boolean ah(View view, float f, float f2, float f3, float f4) {
        if (f >= f3 && f <= f3 + view.getWidth() && f2 >= f4 && f2 <= f4 + view.getHeight()) {
            return true;
        }
        return false;
    }

    private final int ai(int i) {
        int i2;
        if ((i & 12) != 0) {
            int i3 = 8;
            if (this.e > brg.a) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            VelocityTracker velocityTracker = this.o;
            if (velocityTracker != null && this.i >= 0) {
                velocityTracker.computeCurrentVelocity(1000, this.v);
                float xVelocity = this.o.getXVelocity(this.i);
                float yVelocity = this.o.getYVelocity(this.i);
                if (xVelocity <= brg.a) {
                    i3 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3 && abs >= this.j.a(this.u) && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float width = this.m.getWidth();
            if ((i & i2) != 0) {
                if (Math.abs(this.e) > width * 0.5f) {
                    return i2;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    private final int aj(int i) {
        int i2;
        if ((i & 3) != 0) {
            int i3 = 2;
            if (this.f > brg.a) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            VelocityTracker velocityTracker = this.o;
            if (velocityTracker != null && this.i >= 0) {
                velocityTracker.computeCurrentVelocity(1000, this.v);
                float xVelocity = this.o.getXVelocity(this.i);
                float yVelocity = this.o.getYVelocity(this.i);
                if (yVelocity <= brg.a) {
                    i3 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2 && abs >= this.j.a(this.u) && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float height = this.m.getHeight();
            if ((i & i2) != 0) {
                if (Math.abs(this.f) > height * 0.5f) {
                    return i2;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    public final void W(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.m;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.aK(this);
                this.m.ac(this.B);
                List list = this.m.v;
                if (list != null) {
                    list.remove(this);
                }
                int size = this.l.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    qv qvVar = (qv) this.l.get(0);
                    qvVar.a();
                    this.j.l(qvVar.h);
                }
                this.l.clear();
                this.p = null;
                ag();
                qt qtVar = this.A;
                if (qtVar != null) {
                    qtVar.a = false;
                    this.A = null;
                }
                if (this.q != null) {
                    this.q = null;
                }
            }
            this.m = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.u = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                this.v = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                this.x = ViewConfiguration.get(this.m.getContext()).getScaledTouchSlop();
                this.m.aJ(this);
                this.m.w(this.B);
                this.m.v(this);
                this.A = new qt(this);
                this.q = new GestureDetector(this.m.getContext(), this.A);
            }
        }
    }

    public final void X(int i, MotionEvent motionEvent, int i2) {
        View k;
        if (this.b == null && i == 2 && this.w != 2 && this.j.j()) {
            RecyclerView recyclerView = this.m;
            if (recyclerView.D != 1) {
                nw nwVar = recyclerView.m;
                int i3 = this.i;
                oo ooVar = null;
                if (i3 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(findPointerIndex) - this.c;
                    float y = motionEvent.getY(findPointerIndex) - this.d;
                    float abs = Math.abs(x);
                    float abs2 = Math.abs(y);
                    float f = this.x;
                    if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !nwVar.ag()) && ((abs2 <= abs || !nwVar.ah()) && (k = k(motionEvent)) != null))) {
                        ooVar = this.m.j(k);
                    }
                }
                if (ooVar != null) {
                    int d = this.j.d(this.m, ooVar) >> 8;
                    if ((d & 255) != 0) {
                        float x2 = motionEvent.getX(i2);
                        float y2 = motionEvent.getY(i2);
                        float f2 = x2 - this.c;
                        float f3 = y2 - this.d;
                        float abs3 = Math.abs(f2);
                        float abs4 = Math.abs(f3);
                        float f4 = this.x;
                        if (abs3 >= f4 || abs4 >= f4) {
                            if (abs3 > abs4) {
                                if (f2 >= brg.a || (d & 4) != 0) {
                                    if (f2 > brg.a && (d & 8) == 0) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else if (f3 >= brg.a || (d & 1) != 0) {
                                if (f3 > brg.a && (d & 2) == 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                            this.f = brg.a;
                            this.e = brg.a;
                            this.i = motionEvent.getPointerId(0);
                            ac(ooVar, 1);
                        }
                    }
                }
            }
        }
    }

    public final void Y(oo ooVar, boolean z) {
        qv qvVar;
        int size = this.l.size();
        do {
            size--;
            if (size >= 0) {
                qvVar = (qv) this.l.get(size);
            } else {
                return;
            }
        } while (qvVar.h != ooVar);
        qvVar.n |= z;
        if (!qvVar.o) {
            qvVar.a();
        }
        this.l.remove(size);
    }

    public final void Z(oo ooVar) {
        char c;
        List list;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i;
        int i2;
        int i3;
        int i4;
        if (!this.m.isLayoutRequested() && this.w == 2) {
            float f = this.g + this.e;
            int i5 = (int) (this.h + this.f);
            int i6 = (int) f;
            if (Math.abs(i5 - ooVar.a.getTop()) >= ooVar.a.getHeight() * 0.5f || Math.abs(i6 - ooVar.a.getLeft()) >= ooVar.a.getWidth() * 0.5f) {
                List list2 = this.y;
                if (list2 == null) {
                    this.y = new ArrayList();
                    this.z = new ArrayList();
                } else {
                    list2.clear();
                    this.z.clear();
                }
                int round = Math.round(this.g + this.e);
                float f2 = this.h + this.f;
                View view = ooVar.a;
                int round2 = Math.round(f2);
                int width = view.getWidth() + round;
                int height = ooVar.a.getHeight() + round2;
                int i7 = (round + width) / 2;
                int i8 = (round2 + height) / 2;
                nw nwVar = this.m.m;
                int at = nwVar.at();
                int i9 = 0;
                while (i9 < at) {
                    View aF = nwVar.aF(i9);
                    if (aF == ooVar.a || aF.getBottom() < round2 || aF.getTop() > height || aF.getRight() < round || aF.getLeft() > width) {
                        i = round;
                        i2 = round2;
                        i3 = width;
                    } else {
                        oo j = this.m.j(aF);
                        int abs5 = Math.abs(i7 - ((aF.getLeft() + aF.getRight()) / 2));
                        int i10 = abs5 * abs5;
                        int abs6 = Math.abs(i8 - ((aF.getTop() + aF.getBottom()) / 2));
                        int i11 = abs6 * abs6;
                        int size = this.y.size();
                        i = round;
                        i2 = round2;
                        i3 = width;
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            i4 = i10 + i11;
                            if (i12 >= size) {
                                break;
                            }
                            int i14 = size;
                            if (i4 <= ((Integer) this.z.get(i12)).intValue()) {
                                break;
                            }
                            i13++;
                            i12++;
                            size = i14;
                        }
                        this.y.add(i13, j);
                        this.z.add(i13, Integer.valueOf(i4));
                    }
                    i9++;
                    round = i;
                    round2 = i2;
                    width = i3;
                }
                List list3 = this.y;
                if (list3.size() != 0) {
                    int width2 = ooVar.a.getWidth() + i6;
                    int height2 = ooVar.a.getHeight() + i5;
                    int left2 = i6 - ooVar.a.getLeft();
                    int top2 = i5 - ooVar.a.getTop();
                    int size2 = list3.size();
                    oo ooVar2 = null;
                    int i15 = -1;
                    int i16 = 0;
                    while (i16 < size2) {
                        oo ooVar3 = (oo) list3.get(i16);
                        if (left2 > 0 && (right = ooVar3.a.getRight() - width2) < 0) {
                            list = list3;
                            if (ooVar3.a.getRight() > ooVar.a.getRight() && (abs4 = Math.abs(right)) > i15) {
                                i15 = abs4;
                                ooVar2 = ooVar3;
                            }
                        } else {
                            list = list3;
                        }
                        if (left2 < 0 && (left = ooVar3.a.getLeft() - i6) > 0 && ooVar3.a.getLeft() < ooVar.a.getLeft() && (abs3 = Math.abs(left)) > i15) {
                            i15 = abs3;
                            ooVar2 = ooVar3;
                        }
                        if (top2 < 0 && (top = ooVar3.a.getTop() - i5) > 0 && ooVar3.a.getTop() < ooVar.a.getTop() && (abs2 = Math.abs(top)) > i15) {
                            i15 = abs2;
                            ooVar2 = ooVar3;
                        }
                        if (top2 > 0 && (bottom = ooVar3.a.getBottom() - height2) < 0 && ooVar3.a.getBottom() > ooVar.a.getBottom() && (abs = Math.abs(bottom)) > i15) {
                            i15 = abs;
                            ooVar2 = ooVar3;
                        }
                        i16++;
                        list3 = list;
                    }
                    if (ooVar2 == null) {
                        this.y.clear();
                        this.z.clear();
                        return;
                    }
                    int a = ooVar2.a();
                    ooVar.a();
                    if (this.j.n(ooVar, ooVar2)) {
                        RecyclerView recyclerView = this.m;
                        nw nwVar2 = recyclerView.m;
                        if (nwVar2 instanceof LinearLayoutManager) {
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) nwVar2;
                            View view2 = ooVar.a;
                            View view3 = ooVar2.a;
                            linearLayoutManager.V("Cannot drop a view during a scroll or layout calculation");
                            linearLayoutManager.X();
                            linearLayoutManager.ab();
                            int bt = LinearLayoutManager.bt(view2);
                            int bt2 = LinearLayoutManager.bt(view3);
                            boolean z = linearLayoutManager.n;
                            if (bt < bt2) {
                                c = 1;
                            } else {
                                c = 65535;
                            }
                            if (z) {
                                if (c == 1) {
                                    linearLayoutManager.ad(bt2, linearLayoutManager.l.f() - (linearLayoutManager.l.d(view3) + linearLayoutManager.l.b(view2)));
                                    return;
                                } else {
                                    linearLayoutManager.ad(bt2, linearLayoutManager.l.f() - linearLayoutManager.l.a(view3));
                                    return;
                                }
                            }
                            if (c == 65535) {
                                linearLayoutManager.ad(bt2, linearLayoutManager.l.d(view3));
                                return;
                            } else {
                                linearLayoutManager.ad(bt2, linearLayoutManager.l.a(view3) - linearLayoutManager.l.b(view2));
                                return;
                            }
                        }
                        if (nwVar2.ag()) {
                            if (nw.bF(ooVar2.a) <= recyclerView.getPaddingLeft()) {
                                recyclerView.ae(a);
                            }
                            if (nw.bG(ooVar2.a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.ae(a);
                            }
                        }
                        if (nwVar2.ah()) {
                            if (nw.bH(ooVar2.a) <= recyclerView.getPaddingTop()) {
                                recyclerView.ae(a);
                            }
                            if (nw.bE(ooVar2.a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.ae(a);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.nq
    public final void a(Rect rect, View view, RecyclerView recyclerView, ol olVar) {
        rect.setEmpty();
    }

    public final void aa() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.o = VelocityTracker.obtain();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ab(View view) {
        if (view == this.p) {
            this.p = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x008f, code lost:
    
        if (r0 <= 0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ac(defpackage.oo r20, int r21) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx.ac(oo, int):void");
    }

    public final void ad(oo ooVar) {
        if (!this.j.i(this.m, ooVar)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (ooVar.a.getParent() != this.m) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        aa();
        this.f = brg.a;
        this.e = brg.a;
        ac(ooVar, 2);
    }

    public final void ae(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.c;
        this.e = f;
        this.f = y - this.d;
        if ((i & 4) == 0) {
            f = Math.max(brg.a, f);
            this.e = f;
        }
        if ((i & 8) == 0) {
            this.e = Math.min(brg.a, f);
        }
        if ((i & 1) == 0) {
            this.f = Math.max(brg.a, this.f);
        }
        if ((i & 2) == 0) {
            this.f = Math.min(brg.a, this.f);
        }
    }

    @Override // defpackage.nq
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.b != null) {
            af(this.t);
            float[] fArr = this.t;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        qs qsVar = this.j;
        oo ooVar = this.b;
        List list = this.l;
        int i = this.w;
        int i2 = 0;
        for (int size = list.size(); i2 < size; size = size) {
            qv qvVar = (qv) list.get(i2);
            float f4 = qvVar.d;
            float f5 = qvVar.f;
            if (f4 == f5) {
                qvVar.l = qvVar.h.a.getTranslationX();
            } else {
                qvVar.l = f4 + (qvVar.p * (f5 - f4));
            }
            float f6 = qvVar.e;
            float f7 = qvVar.g;
            if (f6 == f7) {
                qvVar.m = qvVar.h.a.getTranslationY();
            } else {
                qvVar.m = f6 + (qvVar.p * (f7 - f6));
            }
            int save = canvas.save();
            qsVar.g(canvas, recyclerView, qvVar.h, qvVar.l, qvVar.m, qvVar.i, false);
            canvas.restoreToCount(save);
            i2++;
        }
        if (ooVar != null) {
            int save2 = canvas.save();
            qsVar.g(canvas, recyclerView, ooVar, f, f2, i, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // defpackage.ny
    public final void d(View view) {
        ab(view);
        oo j = this.m.j(view);
        if (j != null) {
            oo ooVar = this.b;
            if (ooVar != null && j == ooVar) {
                ac(null, 0);
                return;
            }
            Y(j, false);
            if (this.a.remove(j.a)) {
                this.j.l(j);
            }
        }
    }

    public final View k(MotionEvent motionEvent) {
        qv qvVar;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        oo ooVar = this.b;
        if (ooVar != null) {
            float f = this.g + this.e;
            float f2 = this.h + this.f;
            View view2 = ooVar.a;
            if (ah(view2, x, y, f, f2)) {
                return view2;
            }
        }
        int size = this.l.size();
        do {
            size--;
            if (size >= 0) {
                qvVar = (qv) this.l.get(size);
                view = qvVar.h.a;
            } else {
                return this.m.m(x, y);
            }
        } while (!ah(view, x, y, qvVar.l, qvVar.m));
        return view;
    }

    @Override // defpackage.nq
    public final void l(Canvas canvas, RecyclerView recyclerView) {
        if (this.b != null) {
            af(this.t);
        }
        oo ooVar = this.b;
        List list = this.l;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            qv qvVar = (qv) list.get(i);
            int save = canvas.save();
            oo ooVar2 = qvVar.h;
            float f = qvVar.l;
            float f2 = qvVar.m;
            int i2 = qvVar.i;
            canvas.restoreToCount(save);
        }
        if (ooVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            qv qvVar2 = (qv) list.get(size);
            if (qvVar2.o) {
                if (!qvVar2.k) {
                    list.remove(size);
                }
            } else {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    @Override // defpackage.ny
    public final void c(View view) {
    }
}
