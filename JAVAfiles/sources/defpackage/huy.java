package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class huy implements hpt, hpq {
    protected final Drawable a;

    public huy(Drawable drawable) {
        hwr.i(drawable);
        this.a = drawable;
    }

    @Override // defpackage.hpq
    public void d() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof hvf) {
            ((hvf) drawable).a().prepareToDraw();
        }
    }

    @Override // defpackage.hpt
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Drawable c() {
        Drawable.ConstantState constantState = this.a.getConstantState();
        if (constantState == null) {
            return this.a;
        }
        return constantState.newDrawable();
    }
}
