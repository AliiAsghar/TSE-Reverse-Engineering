package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.agi;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aga implements PointerInputEventHandler {
    final /* synthetic */ agi a;

    /* compiled from: PG */
    /* renamed from: aga$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cjn, arnb> {
        final /* synthetic */ agi a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(agi agiVar) {
            super(1);
            this.a = agiVar;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            this.a.b(new agi.a.b(((cjn) obj).a));
            return arnb.a;
        }
    }

    public aga(agi agiVar) {
        this.a = agiVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(crk crkVar, arpe<? super arnb> arpeVar) {
        Object b = ahm.b(crkVar, new agb(new AnonymousClass1(this.a), null), arpeVar);
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
