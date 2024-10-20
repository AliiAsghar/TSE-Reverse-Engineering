package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import defpackage.ajt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class biw extends View {
    public bje b;
    public Runnable c;
    private Boolean e;
    private Long f;
    private arqg g;
    private static final int[] d = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] a = new int[0];

    public biw(Context context) {
        super(context);
    }

    private final void e(boolean z) {
        long j;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.c;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long j2 = currentAnimationTimeMillis - j;
        if (!z) {
            if (j2 < 5) {
                Runnable runnable2 = new Runnable() { // from class: biv
                    @Override // java.lang.Runnable
                    public final void run() {
                        biw biwVar = biw.this;
                        bje bjeVar = biwVar.b;
                        if (bjeVar != null) {
                            bjeVar.setState(biw.a);
                        }
                        biwVar.c = null;
                    }
                };
                this.c = runnable2;
                postDelayed(runnable2, 50L);
                this.f = Long.valueOf(currentAnimationTimeMillis);
            }
            iArr = a;
        } else {
            iArr = d;
        }
        bje bjeVar = this.b;
        if (bjeVar != null) {
            bjeVar.setState(iArr);
        }
        this.f = Long.valueOf(currentAnimationTimeMillis);
    }

    public final void a(ajt.b bVar, boolean z, long j, int i, long j2, float f, arqg arqgVar) {
        if (this.b == null || !d.F(Boolean.valueOf(z), this.e)) {
            bje bjeVar = new bje(z);
            setBackground(bjeVar);
            this.b = bjeVar;
            this.e = Boolean.valueOf(z);
        }
        bje bjeVar2 = this.b;
        bjeVar2.getClass();
        this.g = arqgVar;
        d(j, i, j2, f);
        if (z) {
            bjeVar2.setHotspot(cjn.b(bVar.a), cjn.c(bVar.a));
        } else {
            bjeVar2.setHotspot(bjeVar2.getBounds().centerX(), bjeVar2.getBounds().centerY());
        }
        e(true);
    }

    public final void b() {
        this.g = null;
        Runnable runnable = this.c;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.c;
            runnable2.getClass();
            runnable2.run();
        } else {
            bje bjeVar = this.b;
            if (bjeVar != null) {
                bjeVar.setState(a);
            }
        }
        bje bjeVar2 = this.b;
        if (bjeVar2 == null) {
            return;
        }
        bjeVar2.setVisible(false, false);
        unscheduleDrawable(bjeVar2);
    }

    public final void c() {
        e(false);
    }

    public final void d(long j, int i, long j2, float f) {
        long f2;
        bje bjeVar = this.b;
        if (bjeVar == null) {
            return;
        }
        Integer num = bjeVar.b;
        if (num == null || num.intValue() != i) {
            bjeVar.b = Integer.valueOf(i);
            bjeVar.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f += f;
        }
        f2 = ckw.f(cku.d(j2), cku.c(j2), cku.b(j2), arrn.p(f, 1.0f), cku.f(j2));
        cku ckuVar = bjeVar.a;
        if (ckuVar == null || !a.bB(ckuVar.i, f2)) {
            bjeVar.a = new cku(f2);
            bjeVar.setColor(ColorStateList.valueOf(ckw.b(f2)));
        }
        Rect rect = new Rect(0, 0, arsk.g(cjt.c(j)), arsk.g(cjt.a(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        bjeVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        arqg arqgVar = this.g;
        if (arqgVar != null) {
            arqgVar.a();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
