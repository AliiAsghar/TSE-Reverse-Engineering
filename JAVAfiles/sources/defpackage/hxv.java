package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxv implements hxz {
    private final int a;

    public hxv(int i) {
        this.a = i;
    }

    @Override // defpackage.hxz
    public final /* bridge */ /* synthetic */ boolean a(Object obj, hxy hxyVar) {
        Drawable drawable = (Drawable) obj;
        Drawable j = hxyVar.j();
        if (j == null) {
            j = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{j, drawable});
        transitionDrawable.setCrossFadeEnabled(false);
        transitionDrawable.startTransition(this.a);
        hxyVar.n(transitionDrawable);
        return true;
    }
}
