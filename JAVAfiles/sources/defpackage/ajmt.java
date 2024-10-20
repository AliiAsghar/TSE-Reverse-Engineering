package defpackage;

import android.graphics.Canvas;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajmt extends ajmu {
    public ajmt(ajms ajmsVar) {
        super(ajmsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajkm
    public final void F(Canvas canvas) {
        if (this.a.x.isEmpty()) {
            super.F(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.a.x);
        super.F(canvas);
        canvas.restore();
    }
}
