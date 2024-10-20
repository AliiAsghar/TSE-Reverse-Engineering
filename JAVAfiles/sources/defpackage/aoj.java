package defpackage;

import defpackage.cvc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aoj extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ byn a;
    final /* synthetic */ List b;
    final /* synthetic */ List c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoj(byn bynVar, List list, List list2, boolean z) {
        super(1);
        this.a = bynVar;
        this.b = list;
        this.c = list2;
        this.d = z;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ((cvc.a) obj).j(new aoi(this.b, this.c, this.d));
        ate.a(this.a);
        return arnb.a;
    }
}
