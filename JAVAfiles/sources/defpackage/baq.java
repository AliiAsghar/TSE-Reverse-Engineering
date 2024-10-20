package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public class baq extends cwr implements czi, cid {
    public arqg a;
    public boolean b;
    private final crw c;

    public baq(arqg arqgVar) {
        this.a = arqgVar;
        crx crxVar = new crx(null, null, null, new PointerInputEventHandler() { // from class: baq.1

            /* compiled from: PG */
            /* renamed from: baq$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            static final class C00261 extends arpv implements arqv<cqg, arpe<? super arnb>, Object> {
                Object a;
                Object b;
                int c;
                final /* synthetic */ baq d;
                private /* synthetic */ Object e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00261(baq baqVar, arpe arpeVar) {
                    super(arpeVar);
                    this.d = baqVar;
                }

                @Override // defpackage.arqv
                public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                    return ((C00261) c((cqg) obj, (arpe) obj2)).b(arnb.a);
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0193  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x015f A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:28:0x018d A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
                /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:61:0x00fa A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x016b  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x015d -> B:6:0x0160). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c9 -> B:26:0x00cb). Please report as a decompilation issue!!! */
                @Override // defpackage.arpq
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object b(java.lang.Object r19) {
                    /*
                        Method dump skipped, instructions count: 410
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.baq.AnonymousClass1.C00261.b(java.lang.Object):java.lang.Object");
                }

                @Override // defpackage.arpq
                public final arpe c(Object obj, arpe arpeVar) {
                    C00261 c00261 = new C00261(this.d, arpeVar);
                    c00261.e = obj;
                    return c00261;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(crk crkVar, arpe<? super arnb> arpeVar) {
                Object b = ahm.b(crkVar, new C00261(baq.this, null), arpeVar);
                if (b == arpl.a) {
                    return b;
                }
                return arnb.a;
            }
        });
        K(crxVar);
        this.c = crxVar;
    }

    @Override // defpackage.cid
    public final void a(ciy ciyVar) {
        this.b = ciyVar.b();
    }

    @Override // defpackage.czi
    public final void dR() {
        this.c.dR();
    }

    @Override // defpackage.czi
    public final /* synthetic */ void dS() {
        czh.a(this);
    }

    @Override // defpackage.czi
    public final void dT(cqq cqqVar, cqs cqsVar, long j) {
        this.c.dT(cqqVar, cqsVar, j);
    }

    @Override // defpackage.czi
    public final /* synthetic */ void dU() {
        czh.b(this);
    }

    @Override // defpackage.czi
    public /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.czi
    public final /* synthetic */ void x() {
    }
}
