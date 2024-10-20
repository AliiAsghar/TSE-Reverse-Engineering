package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xvj extends InsetDrawable {
    public static final /* synthetic */ int a = 0;
    private final int b;
    private final int c;

    public xvj(Drawable drawable, int i, int i2, int i3, int i4, int i5, int i6) {
        super(drawable, i, i2, i3, i4);
        this.b = i5;
        this.c = i6;
    }

    @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c;
    }

    @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.b;
    }
}
