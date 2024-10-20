package defpackage;

import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdr extends arsm {
    final /* synthetic */ agdu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agdr(Object obj, agdu agduVar) {
        super(obj);
        this.a = agduVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        if (((Boolean) obj2).booleanValue()) {
            agdu agduVar = this.a;
            RendererContainer rendererContainer = agduVar.c;
            rendererContainer.a = agduVar.m;
            rendererContainer.setOnTouchListener(agduVar.n);
            return;
        }
        agdu agduVar2 = this.a;
        agduVar2.g();
        RendererContainer rendererContainer2 = agduVar2.c;
        rendererContainer2.a = null;
        rendererContainer2.setOnTouchListener(null);
        if (agduVar2.q >= brg.a) {
            agduVar2.e();
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
