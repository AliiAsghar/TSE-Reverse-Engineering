package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mb extends nq {
    private static final int[] a = {R.attr.listDivider};
    private final Drawable b;
    private final int c;
    private final Rect d = new Rect();

    public mb(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.b = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        this.c = i != 0 ? 1 : i;
    }

    @Override // defpackage.nq
    public final void a(Rect rect, View view, RecyclerView recyclerView, ol olVar) {
        Drawable drawable = this.b;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.c == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // defpackage.nq
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i;
        int width;
        int i2;
        if (recyclerView.m != null && this.b != null) {
            int i3 = 0;
            if (this.c == 1) {
                canvas.save();
                if (recyclerView.h) {
                    i2 = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    i2 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i3 < childCount) {
                    View childAt = recyclerView.getChildAt(i3);
                    RecyclerView.N(childAt, this.d);
                    int round = this.d.bottom + Math.round(childAt.getTranslationY());
                    this.b.setBounds(i2, round - this.b.getIntrinsicHeight(), width, round);
                    this.b.draw(canvas);
                    i3++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.h) {
                i = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            } else {
                height = recyclerView.getHeight();
                i = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i3 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i3);
                recyclerView.m.aQ(childAt2, this.d);
                int round2 = this.d.right + Math.round(childAt2.getTranslationX());
                this.b.setBounds(round2 - this.b.getIntrinsicWidth(), i, round2, height);
                this.b.draw(canvas);
                i3++;
            }
            canvas.restore();
        }
    }
}
