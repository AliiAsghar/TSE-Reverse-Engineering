package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hva extends huy {
    private hva(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static hpt g(Drawable drawable) {
        if (drawable != null) {
            return new hva(drawable);
        }
        return null;
    }

    @Override // defpackage.hpt
    public final int a() {
        Drawable drawable = this.a;
        return Math.max(1, drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.hpt
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.hpt
    public final void e() {
    }
}
