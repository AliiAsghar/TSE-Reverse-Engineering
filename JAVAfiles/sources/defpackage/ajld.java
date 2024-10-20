package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ajld {
    public ajkr b;
    public boolean a = false;
    public RectF c = new RectF();
    public final Path d = new Path();

    public abstract void a(View view);

    public final void b(View view, boolean z) {
        if (z != this.a) {
            this.a = z;
            a(view);
        }
    }

    public final void c() {
        if (this.c.left <= this.c.right && this.c.top <= this.c.bottom && this.b != null) {
            ajks.a.a(this.b, this.c, this.d);
        }
    }

    public abstract boolean d();
}
