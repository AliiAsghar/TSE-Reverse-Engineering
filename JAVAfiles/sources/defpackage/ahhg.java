package defpackage;

import defpackage.cga;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahhg extends arrp implements arqw {
    final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahhg(int i) {
        super(3);
        this.a = i;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        list.getClass();
        int i = this.a;
        ahhf ahhfVar = ahhf.a;
        cga.a aVar = cga.e;
        brj brjVar = (brj) list.get(i);
        aVar.getClass();
        brjVar.getClass();
        ahhfVar.a(cfv.g(aVar, new brl(brjVar)), brg.a, 0L, bwjVar, 3072);
        return arnb.a;
    }
}
