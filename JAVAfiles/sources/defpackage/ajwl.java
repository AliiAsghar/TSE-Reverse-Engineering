package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajwl extends LayerDrawable {
    public ColorStateList a;

    public ajwl(Drawable drawable) {
        super(new Drawable[]{drawable});
        this.a = null;
    }

    public static ajwl a(Drawable drawable) {
        if (drawable instanceof ajwl) {
            return (ajwl) drawable;
        }
        return new ajwl(drawable.mutate());
    }

    public final boolean b() {
        ColorStateList colorStateList = this.a;
        if (colorStateList == null) {
            return false;
        }
        setColorFilter(colorStateList.getColorForState(getState(), 0), PorterDuff.Mode.SRC_IN);
        return true;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        boolean state = super.setState(iArr);
        boolean b = b();
        if (!state && !b) {
            return false;
        }
        return true;
    }
}
