package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nd implements iz {
    private static Method a;
    private static Method b;
    private final iiy A;
    private final bo B;
    private Context c;
    private ListAdapter d;
    public mh e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public View l;
    public AdapterView.OnItemClickListener m;
    public AdapterView.OnItemSelectedListener n;
    public final Handler o;
    public boolean p;
    public PopupWindow q;
    public final bo r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private DataSetObserver w;
    private final nc x;
    private final Rect y;
    private Rect z;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                b = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public nd(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        if (!this.v) {
            return 0;
        }
        return this.t;
    }

    public final Drawable c() {
        return this.q.getBackground();
    }

    @Override // defpackage.iz
    public final ListView dy() {
        return this.e;
    }

    public void e(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.w;
        if (dataSetObserver == null) {
            this.w = new nb(this);
        } else {
            ListAdapter listAdapter2 = this.d;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.d = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.w);
        }
        mh mhVar = this.e;
        if (mhVar != null) {
            mhVar.setAdapter(this.d);
        }
    }

    public final void f(Drawable drawable) {
        this.q.setBackgroundDrawable(drawable);
    }

    public final void g(int i) {
        this.g = i;
    }

    public final void j(int i) {
        this.t = i;
        this.v = true;
    }

    @Override // defpackage.iz
    public final void k() {
        this.q.dismiss();
        this.q.setContentView(null);
        this.e = null;
        this.o.removeCallbacks(this.r);
    }

    public final int o() {
        if (!u()) {
            return -1;
        }
        return this.e.getSelectedItemPosition();
    }

    public mh p(Context context, boolean z) {
        return new mh(context, z);
    }

    public final void q() {
        mh mhVar = this.e;
        if (mhVar != null) {
            mhVar.a = true;
            mhVar.requestLayout();
        }
    }

    public final void r(int i) {
        Drawable background = this.q.getBackground();
        if (background != null) {
            background.getPadding(this.y);
            Rect rect = this.y;
            this.f = rect.left + rect.right + i;
            return;
        }
        this.f = i;
    }

    @Override // defpackage.iz
    public final void s() {
        int i;
        boolean z;
        int maxAvailableHeight;
        int i2;
        int i3;
        int i4;
        int makeMeasureSpec;
        if (this.e == null) {
            mh p = p(this.c, !this.p);
            this.e = p;
            p.setAdapter(this.d);
            this.e.setOnItemClickListener(this.m);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new ow(this, 1));
            this.e.setOnScrollListener(this.x);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.n;
            if (onItemSelectedListener != null) {
                this.e.setOnItemSelectedListener(onItemSelectedListener);
            }
            this.q.setContentView(this.e);
        }
        Drawable background = this.q.getBackground();
        int i5 = 0;
        if (background != null) {
            background.getPadding(this.y);
            Rect rect = this.y;
            i = rect.top + rect.bottom;
            if (!this.v) {
                this.t = -this.y.top;
            }
        } else {
            this.y.setEmpty();
            i = 0;
        }
        if (this.q.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        maxAvailableHeight = this.q.getMaxAvailableHeight(this.l, this.t, z);
        if (this.s != -1) {
            int i6 = this.f;
            if (i6 != -2) {
                if (i6 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                } else {
                    int i7 = this.c.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.y;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7 - (rect2.left + rect2.right), 1073741824);
                }
            } else {
                int i8 = this.c.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.y;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect3.left + rect3.right), Integer.MIN_VALUE);
            }
            maxAvailableHeight = this.e.b(makeMeasureSpec, maxAvailableHeight);
            if (maxAvailableHeight > 0) {
                i += this.e.getPaddingTop() + this.e.getPaddingBottom();
            } else {
                i = 0;
            }
        }
        boolean w = w();
        this.q.setWindowLayoutType(this.u);
        int i9 = maxAvailableHeight + i;
        if (this.q.isShowing()) {
            if (this.l.isAttachedToWindow()) {
                int i10 = this.f;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = this.l.getWidth();
                }
                int i11 = this.s;
                if (i11 == -1) {
                    if (true != w) {
                        i9 = -1;
                    }
                    if (w) {
                        PopupWindow popupWindow = this.q;
                        if (this.f == -1) {
                            i4 = -1;
                        } else {
                            i4 = 0;
                        }
                        popupWindow.setWidth(i4);
                        this.q.setHeight(0);
                    } else {
                        PopupWindow popupWindow2 = this.q;
                        if (this.f == -1) {
                            i5 = -1;
                        }
                        popupWindow2.setWidth(i5);
                        this.q.setHeight(-1);
                    }
                } else if (i11 != -2) {
                    i9 = i11;
                }
                this.q.setOutsideTouchable(true);
                PopupWindow popupWindow3 = this.q;
                View view = this.l;
                int i12 = this.g;
                int i13 = this.t;
                if (i10 < 0) {
                    i2 = -1;
                } else {
                    i2 = i10;
                }
                if (i9 < 0) {
                    i3 = -1;
                } else {
                    i3 = i9;
                }
                popupWindow3.update(view, i12, i13, i2, i3);
                return;
            }
            return;
        }
        int i14 = this.f;
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = this.l.getWidth();
        }
        int i15 = this.s;
        if (i15 == -1) {
            i9 = -1;
        } else if (i15 != -2) {
            i9 = i15;
        }
        this.q.setWidth(i14);
        this.q.setHeight(i9);
        if (Build.VERSION.SDK_INT > 28) {
            this.q.setIsClippedToScreen(true);
        } else {
            Method method = a;
            if (method != null) {
                try {
                    method.invoke(this.q, true);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        }
        this.q.setOutsideTouchable(true);
        this.q.setTouchInterceptor(this.A);
        if (this.i) {
            this.q.setOverlapAnchor(this.h);
        }
        if (Build.VERSION.SDK_INT > 28) {
            this.q.setEpicenterBounds(this.z);
        } else {
            Method method2 = b;
            if (method2 != null) {
                try {
                    method2.invoke(this.q, this.z);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        }
        this.q.showAsDropDown(this.l, this.g, this.t, this.j);
        this.e.setSelection(-1);
        if (!this.p || this.e.isInTouchMode()) {
            q();
        }
        if (!this.p) {
            this.o.post(this.B);
        }
    }

    public final void t(Rect rect) {
        Rect rect2;
        if (rect != null) {
            rect2 = new Rect(rect);
        } else {
            rect2 = null;
        }
        this.z = rect2;
    }

    @Override // defpackage.iz
    public final boolean u() {
        return this.q.isShowing();
    }

    public final void v(PopupWindow.OnDismissListener onDismissListener) {
        this.q.setOnDismissListener(onDismissListener);
    }

    public final boolean w() {
        if (this.q.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    public final void x() {
        this.q.setInputMethodMode(2);
    }

    public final void y() {
        this.p = true;
        this.q.setFocusable(true);
    }

    public nd(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public nd(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        this.s = -2;
        this.f = -2;
        this.u = 1002;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.r = new bo(this, 18, null);
        this.A = new iiy(this, 1, null);
        this.x = new nc(this);
        this.B = new bo(this, 17, null);
        this.y = new Rect();
        this.c = context;
        this.o = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gc.p, i, 0);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.t = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.v = true;
        }
        obtainStyledAttributes.recycle();
        kq kqVar = new kq(context, attributeSet, i);
        this.q = kqVar;
        kqVar.setInputMethodMode(1);
    }
}
