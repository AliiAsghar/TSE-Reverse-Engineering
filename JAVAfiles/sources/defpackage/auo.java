package defpackage;

import defpackage.cvc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class auo extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ byn a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auo(byn bynVar, List list) {
        super(1);
        this.a = bynVar;
        this.b = list;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ((cvc.a) obj).j(new aun(this.b));
        ate.a(this.a);
        return arnb.a;
    }
}
