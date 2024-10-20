package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$DurationScaleChangeListener;
import android.os.Build;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejq {
    public static final ejp a = new ejj();
    public static final ejp b = new ejk();
    public static final ejp c = new ejl();
    public static final ejp d = new ejm();
    public static final ejp e = new ejn();
    public static final ejp f = new eji();
    final Object j;
    final ejr k;
    public float o;
    public ejs r;
    private float t;
    private boolean u;
    public float g = brg.a;
    float h = Float.MAX_VALUE;
    boolean i = false;
    public boolean l = false;
    public float m = Float.MAX_VALUE;
    public float n = -3.4028235E38f;
    private long s = 0;
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();

    public ejq(Object obj, ejr ejrVar) {
        this.j = obj;
        this.k = ejrVar;
        float f2 = 0.1f;
        if (ejrVar != c && ejrVar != d && ejrVar != e) {
            if (ejrVar == f) {
                f2 = 0.00390625f;
            } else {
                f2 = 0.002f;
                if (ejrVar != a && ejrVar != b) {
                    f2 = 1.0f;
                }
            }
        }
        this.o = f2;
        this.r = null;
        this.t = Float.MAX_VALUE;
        this.u = false;
    }

    private static void f(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            } else {
                return;
            }
        }
    }

    final void a(float f2) {
        this.k.b(this.j, f2);
        for (int i = 0; i < this.q.size(); i++) {
            if (this.q.get(i) != null) {
                gli gliVar = (gli) this.q.get(i);
                long max = Math.max(-1L, Math.min(gliVar.h() + 1, Math.round(this.h)));
                gliVar.e.w(max, gliVar.a);
                gliVar.a = max;
            }
        }
        f(this.q);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r26) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejq.b(long):void");
    }

    public final void c(float f2) {
        this.h = f2;
        this.i = true;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    public final void d(float f2) {
        float durationScale;
        if (this.l) {
            this.t = f2;
            return;
        }
        if (this.r == null) {
            this.r = new ejs(f2);
        }
        this.r.d(f2);
        ejs ejsVar = this.r;
        if (ejsVar != null) {
            double a2 = ejsVar.a();
            if (a2 <= this.m) {
                if (a2 >= this.n) {
                    double abs = Math.abs(this.o * 0.75f);
                    ejsVar.c = abs;
                    ejsVar.d = abs * 62.5d;
                    if (ejh.a().b()) {
                        if (!this.l) {
                            this.l = true;
                            if (!this.i) {
                                this.h = this.k.a(this.j);
                            }
                            float f3 = this.h;
                            if (f3 <= this.m && f3 >= this.n) {
                                ejh a3 = ejh.a();
                                if (a3.b.size() == 0) {
                                    a3.h.n(a3.c);
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        durationScale = ValueAnimator.getDurationScale();
                                        a3.f = durationScale;
                                        if (a3.g == null) {
                                            a3.g = new ejf(a3);
                                        }
                                        final ejf ejfVar = a3.g;
                                        if (ejfVar.a == null) {
                                            ejfVar.a = new ValueAnimator$DurationScaleChangeListener() { // from class: eje
                                                public final void onChanged(float f4) {
                                                    ((ejh) ejf.this.b).f = f4;
                                                }
                                            };
                                            ValueAnimator.registerDurationScaleChangeListener(ejfVar.a);
                                        }
                                    }
                                }
                                if (!a3.b.contains(this)) {
                                    a3.b.add(this);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                        }
                        return;
                    }
                    throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
                }
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    public final void e() {
        if (this.r.b > 0.0d) {
            if (ejh.a().b()) {
                if (this.l) {
                    this.u = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }
}
