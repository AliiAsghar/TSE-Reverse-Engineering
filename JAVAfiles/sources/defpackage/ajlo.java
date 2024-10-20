package defpackage;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajlo implements edh {
    final /* synthetic */ BaseTransientBottomBar a;

    public ajlo(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // defpackage.edh
    public final efo ez(View view, efo efoVar) {
        this.a.m = efoVar.a();
        this.a.n = efoVar.b();
        BaseTransientBottomBar baseTransientBottomBar = this.a;
        baseTransientBottomBar.o = efoVar.c();
        baseTransientBottomBar.k();
        return efoVar;
    }
}
