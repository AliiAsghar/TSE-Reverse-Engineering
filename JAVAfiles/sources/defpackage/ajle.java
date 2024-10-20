package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajle extends ViewOutlineProvider {
    final /* synthetic */ ajlf a;

    public ajle(ajlf ajlfVar) {
        this.a = ajlfVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ajlf ajlfVar = this.a;
        if (ajlfVar.b != null && !ajlfVar.c.isEmpty()) {
            outline.setRoundRect((int) this.a.c.left, (int) this.a.c.top, (int) this.a.c.right, (int) this.a.c.bottom, this.a.e);
        }
    }
}
