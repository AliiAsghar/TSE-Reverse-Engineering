package defpackage;

import android.content.Context;
import android.view.animation.AlphaAnimation;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class xuh extends AlphaAnimation {
    private final Context a;

    public xuh(Context context, float f, float f2) {
        super(f, f2);
        this.a = context;
    }

    @Override // android.view.animation.Animation
    public final void setDuration(long j) {
        super.setDuration(xui.a(this.a, j));
    }
}
