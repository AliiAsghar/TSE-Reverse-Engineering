package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfh extends nq {
    public Drawable a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ gfl d;

    public gfh(gfl gflVar) {
        this.d = gflVar;
    }

    private final boolean k(View view, RecyclerView recyclerView) {
        oo j = recyclerView.j(view);
        if (!(j instanceof gfx) || !((gfx) j).v) {
            return false;
        }
        boolean z = this.c;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild < recyclerView.getChildCount() - 1) {
            z = true;
            oo j2 = recyclerView.j(recyclerView.getChildAt(indexOfChild + 1));
            if (!(j2 instanceof gfx) || !((gfx) j2).u) {
                return false;
            }
        }
        return z;
    }

    @Override // defpackage.nq
    public final void a(Rect rect, View view, RecyclerView recyclerView, ol olVar) {
        if (k(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.nq
    public final void l(Canvas canvas, RecyclerView recyclerView) {
        if (this.a != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (k(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.a.setBounds(0, y, width, this.b + y);
                    this.a.draw(canvas);
                }
            }
        }
    }
}
