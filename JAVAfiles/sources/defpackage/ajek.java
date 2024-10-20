package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajek extends fq {
    public BottomSheetBehavior a;
    public FrameLayout c;
    boolean d;
    public boolean e;
    public boolean f;
    public ajej g;
    private FrameLayout h;
    private CoordinatorLayout i;
    private boolean j;
    private ajec k;
    private agcp l;

    public ajek(Context context) {
        this(context, 0);
        i();
    }

    private final View b(int i, View view, ViewGroup.LayoutParams layoutParams) {
        k();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.h.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.j) {
            edz.k(this.c, new lbd(this, 3));
        }
        this.c.removeAllViews();
        if (layoutParams == null) {
            this.c.addView(view);
        } else {
            this.c.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new ajeg(this, 0));
        eek.n(this.c, new ajeh(this));
        this.c.setOnTouchListener(new nhn(5));
        return this.h;
    }

    private final void i() {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.j = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ajim, java.lang.Object] */
    private final void j() {
        agcp agcpVar = this.l;
        if (agcpVar != null) {
            if (this.d) {
                Object obj = agcpVar.b;
                if (obj != null) {
                    ((ajin) obj).b(agcpVar.c, (View) agcpVar.a, false);
                    return;
                }
                return;
            }
            agcpVar.q();
        }
    }

    private final void k() {
        if (this.h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.h = frameLayout;
            this.i = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.h.findViewById(R.id.design_bottom_sheet);
            this.c = frameLayout2;
            BottomSheetBehavior N = BottomSheetBehavior.N(frameLayout2);
            this.a = N;
            N.O(this.k);
            this.a.T(this.d);
            this.l = new agcp(this.a, this.c);
        }
    }

    public final BottomSheetBehavior a() {
        if (this.a == null) {
            k();
        }
        return this.a;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        a();
        super.cancel();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = false;
            if (this.j && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            }
            boolean z2 = !z;
            FrameLayout frameLayout = this.h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(z2);
            }
            CoordinatorLayout coordinatorLayout = this.i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(z2);
            }
            eea.c(window, z2);
            ajej ajejVar = this.g;
            if (ajejVar != null) {
                ajejVar.d(window);
            }
        }
        j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fq, defpackage.rf, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        ajej ajejVar = this.g;
        if (ajejVar != null) {
            ajejVar.d(null);
        }
        agcp agcpVar = this.l;
        if (agcpVar != null) {
            agcpVar.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rf, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.a;
        if (bottomSheetBehavior != null && bottomSheetBehavior.w == 5) {
            bottomSheetBehavior.V(4);
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.d != z) {
            this.d = z;
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.T(z);
            }
            if (getWindow() != null) {
                j();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.d) {
            this.d = true;
        }
        this.e = z;
        this.f = true;
    }

    @Override // defpackage.fq, defpackage.rf, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(b(i, null, null));
    }

    @Override // defpackage.fq, defpackage.rf, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(b(0, view, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ajek(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968958(0x7f04017e, float:1.7546584E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2132084192(0x7f1505e0, float:1.9808548E38)
        L1b:
            r3.<init>(r4, r5)
            r3.d = r0
            r3.e = r0
            ajei r4 = new ajei
            r4.<init>(r3)
            r3.k = r4
            r3.f()
            r3.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajek.<init>(android.content.Context, int):void");
    }

    @Override // defpackage.fq, defpackage.rf, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(b(0, view, layoutParams));
    }
}
