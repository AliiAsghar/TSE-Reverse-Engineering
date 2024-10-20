package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class beh implements PointerInputEventHandler {
    final /* synthetic */ arqg a;

    /* compiled from: PG */
    /* renamed from: beh$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cjn, arnb> {
        final /* synthetic */ arqg a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqg arqgVar) {
            super(1);
            this.a = arqgVar;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            long j = ((cjn) obj).a;
            this.a.a();
            return arnb.a;
        }
    }

    public beh(arqg arqgVar) {
        this.a = arqgVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(crk crkVar, arpe<? super arnb> arpeVar) {
        Object b = ahm.b(crkVar, new bdz(new AnonymousClass1(this.a), null), arpeVar);
        arpl arplVar = arpl.a;
        if (b != arplVar) {
            b = arnb.a;
        }
        if (b == arplVar) {
            return b;
        }
        return arnb.a;
    }
}
