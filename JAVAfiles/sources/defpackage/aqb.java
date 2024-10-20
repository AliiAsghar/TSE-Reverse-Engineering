package defpackage;

import defpackage.cvc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqb extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ byn a;
    final /* synthetic */ List b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqb(byn bynVar, List list, List list2) {
        super(1);
        this.a = bynVar;
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ((cvc.a) obj).j(new aqa(this.b, this.c));
        ate.a(this.a);
        return arnb.a;
    }
}
