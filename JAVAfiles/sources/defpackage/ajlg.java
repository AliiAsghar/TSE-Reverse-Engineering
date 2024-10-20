package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajlg extends ViewOutlineProvider {
    final /* synthetic */ ajlh a;

    public ajlg(ajlh ajlhVar) {
        this.a = ajlhVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (this.a.d.isEmpty()) {
            return;
        }
        outline.setPath(this.a.d);
    }
}
