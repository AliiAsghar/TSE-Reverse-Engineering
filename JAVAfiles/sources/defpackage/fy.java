package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fy extends ees {
    final /* synthetic */ gb a;

    public fy(gb gbVar) {
        this.a = gbVar;
    }

    @Override // defpackage.ees, defpackage.eer
    public final void a() {
        View view;
        gb gbVar = this.a;
        if (gbVar.j && (view = gbVar.e) != null) {
            view.setTranslationY(brg.a);
            this.a.c.setTranslationY(brg.a);
        }
        this.a.c.setVisibility(8);
        this.a.c.a(false);
        gb gbVar2 = this.a;
        gbVar2.m = null;
        hl hlVar = gbVar2.h;
        if (hlVar != null) {
            hlVar.a(gbVar2.g);
            gbVar2.g = null;
            gbVar2.h = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.a.b;
        if (actionBarOverlayLayout != null) {
            edx.c(actionBarOverlayLayout);
        }
    }
}
