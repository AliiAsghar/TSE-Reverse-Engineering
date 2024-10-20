package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bwj;

/* compiled from: PG */
@armg
/* loaded from: classes.dex */
public final class bil extends bim {
    public bil(boolean z, float f, cas casVar) {
        super(z, f, casVar);
    }

    @Override // defpackage.bim
    public final bix a(ajq ajqVar, boolean z, float f, cas casVar, cas casVar2, bwj bwjVar) {
        bwjVar.y(331259447);
        ViewGroup a = bjc.a((View) bwjVar.g(AndroidCompositionLocals_androidKt.f));
        boolean G = bwjVar.G(ajqVar) | bwjVar.G(this) | bwjVar.G(a);
        Object h = bwjVar.h();
        if (G || h == bwj.a.a) {
            h = new bih(z, f, casVar, casVar2, a);
            bwjVar.B(h);
        }
        bih bihVar = (bih) h;
        bwjVar.q();
        return bihVar;
    }
}
