package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agfx extends nq {
    private final int a;
    private final int b;

    public agfx() {
        this(0, 3);
    }

    @Override // defpackage.nq
    public final void a(Rect rect, View view, RecyclerView recyclerView, ol olVar) {
        rect.getClass();
        view.getClass();
        olVar.getClass();
        super.a(rect, view, recyclerView, olVar);
        if (afwv.A(view)) {
            rect.left = this.a;
        } else {
            rect.right = this.a;
        }
        rect.bottom = this.b;
    }

    public /* synthetic */ agfx(int i, int i2) {
        i = 1 == (i2 & 1) ? 0 : i;
        this.a = i;
        this.b = i;
    }
}
