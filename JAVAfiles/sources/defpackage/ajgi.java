package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajgi extends eu {
    public final Rect b;
    private Drawable c;

    public ajgi(Context context) {
        this(context, 0);
    }

    private static int A(Context context) {
        TypedValue h = ajgk.h(context, R.attr.materialAlertDialogTheme);
        if (h == null) {
            return 0;
        }
        return h.data;
    }

    @Override // defpackage.eu
    public final ev create() {
        ev create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.c;
        if (drawable instanceof ajkm) {
            ((ajkm) drawable).I(edz.a(decorView));
        }
        Drawable drawable2 = this.c;
        Rect rect = this.b;
        window.setBackgroundDrawable(new InsetDrawable(drawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ajgh(create, this.b));
        return create;
    }

    public final void j(boolean z) {
        this.a.m = z;
    }

    public final void k(Drawable drawable) {
        super.b(drawable);
    }

    public final void l(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        er erVar = this.a;
        erVar.q = charSequenceArr;
        erVar.s = onClickListener;
    }

    public final void m(int i) {
        er erVar = this.a;
        erVar.f = erVar.a.getText(i);
    }

    public final void n(CharSequence charSequence) {
        super.c(charSequence);
    }

    public final void o(int i, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(i, onClickListener);
    }

    public final void p(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.h(charSequence, onClickListener);
    }

    public final void q(DialogInterface.OnClickListener onClickListener) {
        super.d(R.string.clear_custom_smsc_dialog_button, onClickListener);
    }

    public final void r(DialogInterface.OnCancelListener onCancelListener) {
        this.a.n = onCancelListener;
    }

    public final void s(DialogInterface.OnDismissListener onDismissListener) {
        this.a.o = onDismissListener;
    }

    @Override // defpackage.eu
    public final /* synthetic */ eu setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(i, onClickListener);
        return this;
    }

    @Override // defpackage.eu
    public final /* synthetic */ eu setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(i, onClickListener);
        return this;
    }

    @Override // defpackage.eu
    public final /* synthetic */ eu setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        return this;
    }

    @Override // defpackage.eu
    public final /* synthetic */ eu setView(View view) {
        super.setView(view);
        return this;
    }

    public final void t(int i, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(i, onClickListener);
    }

    public final void u(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.i(charSequence, onClickListener);
    }

    public final void v(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        super.e(listAdapter, i, onClickListener);
    }

    public final void w(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        super.f(charSequenceArr, i, onClickListener);
    }

    public final void x(int i) {
        super.g(i);
    }

    public final void y(CharSequence charSequence) {
        super.setTitle(charSequence);
    }

    public final void z(View view) {
        super.setView(view);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ajgi(android.content.Context r12, int r13) {
        /*
            r11 = this;
            int r0 = A(r12)
            r1 = 0
            r2 = 2130968849(0x7f040111, float:1.7546363E38)
            r3 = 2132083350(0x7f150296, float:1.980684E38)
            android.content.Context r4 = defpackage.ajnr.a(r12, r1, r2, r3)
            if (r0 != 0) goto L12
            goto L18
        L12:
            so r5 = new so
            r5.<init>(r4, r0)
            r4 = r5
        L18:
            if (r13 != 0) goto L1e
            int r13 = A(r12)
        L1e:
            r11.<init>(r4, r13)
            android.content.Context r12 = r11.getContext()
            android.content.res.Resources$Theme r13 = r12.getTheme()
            int[] r7 = defpackage.ajgj.a
            r9 = 2132083350(0x7f150296, float:1.980684E38)
            r0 = 0
            int[] r10 = new int[r0]
            r6 = 0
            r8 = 2130968849(0x7f040111, float:1.7546363E38)
            r5 = r12
            android.content.res.TypedArray r4 = defpackage.ajig.a(r5, r6, r7, r8, r9, r10)
            android.content.res.Resources r5 = r12.getResources()
            r6 = 2131167137(0x7f0707a1, float:1.794854E38)
            int r5 = r5.getDimensionPixelSize(r6)
            r6 = 2
            int r5 = r4.getDimensionPixelSize(r6, r5)
            android.content.res.Resources r6 = r12.getResources()
            r7 = 2131167138(0x7f0707a2, float:1.7948541E38)
            int r6 = r6.getDimensionPixelSize(r7)
            r7 = 3
            int r6 = r4.getDimensionPixelSize(r7, r6)
            android.content.res.Resources r7 = r12.getResources()
            r8 = 2131167136(0x7f0707a0, float:1.7948537E38)
            int r7 = r7.getDimensionPixelSize(r8)
            r8 = 1
            int r7 = r4.getDimensionPixelSize(r8, r7)
            android.content.res.Resources r9 = r12.getResources()
            r10 = 2131167135(0x7f07079f, float:1.7948535E38)
            int r9 = r9.getDimensionPixelSize(r10)
            int r0 = r4.getDimensionPixelSize(r0, r9)
            r4.recycle()
            android.content.res.Resources r4 = r12.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.getLayoutDirection()
            if (r4 != r8) goto L8c
            r9 = r7
            goto L8d
        L8c:
            r9 = r5
        L8d:
            if (r4 == r8) goto L90
            r5 = r7
        L90:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r9, r6, r5, r0)
            r11.b = r4
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            r4 = 2130969228(0x7f04028c, float:1.7547132E38)
            int r0 = defpackage.ahnz.f(r12, r4, r0)
            int[] r4 = defpackage.ajgj.a
            android.content.res.TypedArray r4 = r12.obtainStyledAttributes(r1, r4, r2, r3)
            r5 = 4
            int r0 = r4.getColor(r5, r0)
            r4.recycle()
            ajkm r4 = new ajkm
            r4.<init>(r12, r1, r2, r3)
            r4.G(r12)
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r0)
            r4.J(r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r12 < r0) goto Lf9
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            r0 = 16844145(0x1010571, float:2.3697462E-38)
            r13.resolveAttribute(r0, r12, r8)
            android.content.Context r13 = r11.getContext()
            android.content.res.Resources r13 = r13.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r12.getDimension(r13)
            int r12 = r12.type
            r0 = 5
            if (r12 != r0) goto Lf9
            r12 = 0
            int r12 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r12 < 0) goto Lf9
            ajkk r12 = r4.o
            ajkr r12 = r12.a
            ajkr r12 = r12.b(r13)
            r4.fn(r12)
        Lf9:
            r11.c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajgi.<init>(android.content.Context, int):void");
    }
}
