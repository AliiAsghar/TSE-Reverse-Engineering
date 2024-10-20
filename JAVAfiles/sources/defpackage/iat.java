package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iat implements Drawable.Callback {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public iat(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (this.b != 0) {
            ((gmq) this.a).invalidateSelf();
            return;
        }
        drawable.getClass();
        int j = ((iau) this.a).j() + 1;
        Object obj = this.a;
        ((iau) obj).b.h(Integer.valueOf(j));
        iau iauVar = (iau) this.a;
        iauVar.c.h(new cjt(iav.a(iauVar.a)));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (this.b != 0) {
            ((gmq) this.a).scheduleSelf(runnable, j);
            return;
        }
        drawable.getClass();
        runnable.getClass();
        iav.b().postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (this.b != 0) {
            ((gmq) this.a).unscheduleSelf(runnable);
            return;
        }
        drawable.getClass();
        runnable.getClass();
        iav.b().removeCallbacks(runnable);
    }
}
