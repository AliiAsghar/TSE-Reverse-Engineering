package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aeq extends EdgeEffect {
    public final float a;
    public float b;

    public aeq(Context context) {
        super(context);
        this.a = dqu.d(dqr.a(context), 1.0f);
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.b = brg.a;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.b = brg.a;
        super.onPull(f);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.b = brg.a;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.b = brg.a;
        super.onPull(f, f2);
    }
}
