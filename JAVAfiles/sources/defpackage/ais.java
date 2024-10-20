package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ais extends cwr {
    public ait a;
    public final crw b;

    public ais(ait aitVar) {
        this.a = aitVar;
        arhi.t(Integer.MAX_VALUE, 0, 6);
        crx crxVar = new crx(null, null, null, new PointerInputEventHandler() { // from class: ais.1
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(crk crkVar, arpe<? super arnb> arpeVar) {
                return arnb.a;
            }
        });
        K(crxVar);
        this.b = crxVar;
    }
}
