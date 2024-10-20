package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajjf extends ajjq {
    public final TimeInterpolator c;
    public final ajiv d;
    public float f;
    public float g;
    private ObjectAnimator n;
    private ObjectAnimator o;
    private static final TimeInterpolator i = ajdd.b;
    public static final int[] a = {0, 1500, 3000, 4500};
    public static final float[] b = {0.1f, 0.87f};
    private static final Property l = new ajjd(Float.class);
    private static final Property m = new ajje(Float.class);
    public int e = 0;
    gmm h = null;

    public ajjf(Context context, ajjg ajjgVar) {
        this.d = ajjgVar;
        this.c = ajgk.l(context, R.attr.motionEasingStandardInterpolator, i);
    }

    @Override // defpackage.ajjq
    public final void a() {
        ObjectAnimator objectAnimator = this.n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.ajjq
    public final void b(gmm gmmVar) {
        this.h = gmmVar;
    }

    @Override // defpackage.ajjq
    public final void c() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.j.isVisible()) {
                this.o.start();
            } else {
                a();
            }
        }
    }

    @Override // defpackage.ajjq
    public final void d() {
        if (this.n == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<ajjf, Float>) l, brg.a, 1.0f);
            this.n = ofFloat;
            ofFloat.setDuration(6000L);
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new ajjb(this));
        }
        if (this.o == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<ajjf, Float>) m, brg.a, 1.0f);
            this.o = ofFloat2;
            ofFloat2.setDuration(500L);
            this.o.addListener(new ajjc(this));
        }
        this.e = 0;
        ((ajjo) this.k.get(0)).c = this.d.c[0];
        this.g = brg.a;
        this.n.start();
    }

    @Override // defpackage.ajjq
    public final void e() {
        this.h = null;
    }
}
