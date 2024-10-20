package defpackage;

import android.graphics.RectF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajlf extends ajld {
    private boolean f = false;
    public float e = brg.a;

    public ajlf(View view) {
        e(view);
    }

    private void e(View view) {
        view.setOutlineProvider(new ajle(this));
    }

    @Override // defpackage.ajld
    public final void a(View view) {
        boolean z;
        ajkr ajkrVar;
        RectF rectF;
        ajkr ajkrVar2 = this.b;
        float f = brg.a;
        if (ajkrVar2 != null && (rectF = this.c) != null) {
            f = ajkrVar2.c.a(rectF);
        }
        this.e = f;
        if (!this.c.isEmpty() && (ajkrVar = this.b) != null && ajkrVar.e(this.c)) {
            z = true;
        } else {
            this.c.isEmpty();
            z = false;
        }
        this.f = z;
        view.setClipToOutline(!d());
        if (d()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // defpackage.ajld
    public final boolean d() {
        if (this.f && !this.a) {
            return false;
        }
        return true;
    }
}
