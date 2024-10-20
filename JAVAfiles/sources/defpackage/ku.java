package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ku extends SeekBar {
    private final kv a;

    public ku(Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        kv kvVar = this.a;
        Drawable drawable = kvVar.c;
        if (drawable != null && drawable.isStateful() && drawable.setState(kvVar.b.getDrawableState())) {
            kvVar.b.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        kv kvVar = this.a;
        if (kvVar.c != null) {
            int max = kvVar.b.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = kvVar.c.getIntrinsicWidth();
                int intrinsicHeight = kvVar.c.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth >> 1;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight >> 1;
                }
                kvVar.c.setBounds(-i, -i2, i, i2);
                int width = (kvVar.b.getWidth() - kvVar.b.getPaddingLeft()) - kvVar.b.getPaddingRight();
                int save = canvas.save();
                canvas.translate(kvVar.b.getPaddingLeft(), kvVar.b.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    kvVar.c.draw(canvas);
                    canvas.translate(width / max, brg.a);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public ku(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public ku(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        pr.d(this, getContext());
        kv kvVar = new kv(this);
        this.a = kvVar;
        kvVar.b(attributeSet, i);
    }
}
