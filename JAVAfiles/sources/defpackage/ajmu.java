package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ajmu extends ajkm {
    public ajms a;

    public ajmu(ajms ajmsVar) {
        super(ajmsVar);
        this.a = ajmsVar;
    }

    public final void a(float f, float f2, float f3, float f4) {
        if (f == this.a.x.left && f2 == this.a.x.top && f3 == this.a.x.right && f4 == this.a.x.bottom) {
            return;
        }
        this.a.x.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.ajkm, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.a = new ajms(this.a);
        return this;
    }
}
