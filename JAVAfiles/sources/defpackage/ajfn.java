package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajfn extends gmm {
    final /* synthetic */ ajfq b;

    public ajfn(ajfq ajfqVar) {
        this.b = ajfqVar;
    }

    @Override // defpackage.gmm
    public final void b(Drawable drawable) {
        ColorStateList colorStateList = this.b.b;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // defpackage.gmm
    public final void c(Drawable drawable) {
        ajfq ajfqVar = this.b;
        ColorStateList colorStateList = ajfqVar.b;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(ajfqVar.d, colorStateList.getDefaultColor()));
        }
    }
}
