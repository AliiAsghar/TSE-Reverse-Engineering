package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajft extends ViewOutlineProvider {
    final /* synthetic */ Chip a;

    public ajft(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ajfw ajfwVar = this.a.b;
        if (ajfwVar != null) {
            ajfwVar.getOutline(outline);
        } else {
            outline.setAlpha(brg.a);
        }
    }
}
