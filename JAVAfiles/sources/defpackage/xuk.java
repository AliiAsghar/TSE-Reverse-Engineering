package defpackage;

import android.content.Context;
import android.view.animation.ScaleAnimation;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class xuk extends ScaleAnimation {
    private final Context a;

    public xuk(Context context) {
        super(brg.a, 1.0f, brg.a, 1.0f, 1, 0.5f, 1, 0.5f);
        this.a = context;
    }

    @Override // android.view.animation.Animation
    public final void setDuration(long j) {
        super.setDuration(xui.a(this.a, j));
    }
}
