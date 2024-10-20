package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeii implements PointerInputEventHandler {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public aeii(cas casVar, cpm cpmVar, arqg arqgVar, int i) {
        this.d = i;
        this.c = casVar;
        this.b = cpmVar;
        this.a = arqgVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(crk crkVar, arpe arpeVar) {
        aeql aeqlVar;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    arqr arqrVar = qjl.b(this.c).r;
                    if (arqrVar != null) {
                        aeqlVar = new aeql(arqrVar, 13);
                    } else {
                        aeqlVar = null;
                    }
                    aeql aeqlVar2 = aeqlVar;
                    Object obj = this.b;
                    Object obj2 = this.c;
                    Object g = aik.g(crkVar, aeqlVar2, new aaop(obj, obj2, 15), null, new aaop(this.a, obj2, 16), arpeVar, 4);
                    if (g == arpl.a) {
                        return g;
                    }
                    return arnb.a;
                }
                arrx arrxVar = new arrx();
                Object obj3 = this.a;
                Object b = ahm.b(crkVar, new ahd(new aaop(obj3, arrxVar, 12), new aaho(arrxVar, obj3, this.b, this.c, 4, null), accd.s, new aeot(arrxVar, 2), null), arpeVar);
                arpl arplVar = arpl.a;
                if (b != arplVar) {
                    b = arnb.a;
                }
                if (b == arplVar) {
                    return b;
                }
                return arnb.a;
            }
            Object c = aeim.c(crkVar, aeim.b(this.b), aeim.a(this.c), this.a, true, arpeVar);
            if (c == arpl.a) {
                return c;
            }
            return arnb.a;
        }
        Object c2 = aeim.c(crkVar, aeim.b(this.b), aeim.a(this.c), this.a, false, arpeVar);
        if (c2 == arpl.a) {
            return c2;
        }
        return arnb.a;
    }

    public aeii(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
