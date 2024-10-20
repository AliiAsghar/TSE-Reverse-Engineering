package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpn extends LayerDrawable {
    private final Path a;
    private final float b;
    private final float c;
    private float d;
    private float e;
    private float f;

    public zpn(Drawable drawable, Drawable drawable2, float f, float f2) {
        super(new Drawable[]{drawable, drawable2});
        this.a = new Path();
        this.b = f;
        this.c = f2;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.a.rewind();
        this.a.addCircle(this.d, this.e, this.f * (getLevel() / 10000.0f), Path.Direction.CCW);
        Drawable drawable = getDrawable(0);
        canvas.save();
        canvas.clipPath(this.a, Region.Op.DIFFERENCE);
        drawable.draw(canvas);
        canvas.restore();
        Drawable drawable2 = getDrawable(1);
        canvas.save();
        canvas.clipPath(this.a);
        drawable2.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float width = rect.width() * (this.b + 0.5f);
        int height = rect.height();
        this.d = width;
        float f = height * (this.c + 0.5f);
        this.e = f;
        this.f = (float) Math.hypot(width, f);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        invalidateSelf();
        return onLevelChange;
    }
}
