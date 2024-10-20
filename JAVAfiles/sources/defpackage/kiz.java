package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kiz implements PointerInputEventHandler {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kiz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqr] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(crk crkVar, arpe arpeVar) {
        Object bn;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        bn = adom.bn(crkVar, new aeql(this.a, 7), false, arpeVar);
                        if (bn == arpl.a) {
                            return bn;
                        }
                        return arnb.a;
                    }
                    Object g = aik.g(crkVar, null, null, null, new aeql(this.a, 17), arpeVar, 7);
                    if (g == arpl.a) {
                        return g;
                    }
                    return arnb.a;
                }
                Object bn2 = adom.bn(crkVar, new aeql(this.a, 3), true, arpeVar);
                if (bn2 == arpl.a) {
                    return bn2;
                }
                return arnb.a;
            }
            Object g2 = aik.g(crkVar, null, null, null, new jsv(this.a, 13), arpeVar, 7);
            if (g2 == arpl.a) {
                return g2;
            }
            return arnb.a;
        }
        Object b = ahm.b(crkVar, new kiy(this.a, null), arpeVar);
        if (b == arpl.a) {
            return b;
        }
        return arnb.a;
    }
}
