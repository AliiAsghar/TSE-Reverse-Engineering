package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agee extends cg implements afyf {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/ui/rendering/renderer/RendererFragment");
    public Integer b;
    public RendererContainer c;

    public agee() {
        this.Z.c(new agaf(2));
    }

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.renderer_root, viewGroup, false);
    }

    public final void a(agem agemVar, agdq agdqVar) {
        da G = G();
        G.getClass();
        afzv.r(agdqVar, G, false, new afho(G, agemVar, 15));
    }

    @Override // defpackage.cg
    public final void ag(View view, Bundle bundle) {
        view.getClass();
        this.c = (RendererContainer) view;
        if (bundle != null && bundle.getBoolean("is_hidden")) {
            bd bdVar = new bd(H());
            bdVar.k(this);
            bdVar.i();
        }
        Integer num = this.b;
        if (num != null) {
            int intValue = num.intValue();
            RendererContainer rendererContainer = this.c;
            if (rendererContainer == null) {
                arro.b("root");
                rendererContainer = null;
            }
            rendererContainer.b(intValue, false);
        }
    }

    @Override // defpackage.cg
    public final void j(Bundle bundle) {
        bundle.putBoolean("is_hidden", ax());
    }
}
