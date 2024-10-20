package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajms extends ajkk {
    public final RectF x;

    public ajms(ajkr ajkrVar, RectF rectF) {
        super(ajkrVar);
        this.x = rectF;
    }

    @Override // defpackage.ajkk, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ajmt ajmtVar = new ajmt(this);
        ajmtVar.invalidateSelf();
        return ajmtVar;
    }

    public ajms(ajms ajmsVar) {
        super(ajmsVar);
        this.x = ajmsVar.x;
    }
}
