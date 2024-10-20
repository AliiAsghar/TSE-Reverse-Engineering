package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajja extends ajjq {
    public static final int[] a = {0, 1350, 2700, 4050};
    public static final int[] b = {667, 2017, 3367, 4717};
    public static final int[] c = {1000, 2350, 3700, 5050};
    private static final Property l = new ajiy(Float.class);
    private static final Property m = new ajiz(Float.class);
    public final ajiv e;
    public float g;
    public float h;
    private ObjectAnimator n;
    private ObjectAnimator o;
    public int f = 0;
    gmm i = null;
    public final emq d = new emq();

    public ajja(ajjg ajjgVar) {
        this.e = ajjgVar;
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
        this.i = gmmVar;
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<ajja, Float>) l, brg.a, 1.0f);
            this.n = ofFloat;
            ofFloat.setDuration(5400L);
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new ajiw(this));
        }
        if (this.o == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<ajja, Float>) m, brg.a, 1.0f);
            this.o = ofFloat2;
            ofFloat2.setDuration(333L);
            this.o.setInterpolator(this.d);
            this.o.addListener(new ajix(this));
        }
        this.f = 0;
        ((ajjo) this.k.get(0)).c = this.e.c[0];
        this.h = brg.a;
        this.n.start();
    }

    @Override // defpackage.ajjq
    public final void e() {
        this.i = null;
    }
}
