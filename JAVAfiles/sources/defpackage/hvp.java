package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvp implements hvq {
    private final hqa a;
    private final hvq b;
    private final hvq c;

    public hvp(hqa hqaVar, hvq hvqVar, hvq hvqVar2) {
        this.a = hqaVar;
        this.b = hvqVar;
        this.c = hvqVar2;
    }

    @Override // defpackage.hvq
    public final hpt a(hpt hptVar, hnj hnjVar) {
        Drawable drawable = (Drawable) hptVar.c();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(huh.g(((BitmapDrawable) drawable).getBitmap(), this.a), hnjVar);
        }
        if (drawable instanceof hvf) {
            return this.c.a(hptVar, hnjVar);
        }
        return null;
    }
}
