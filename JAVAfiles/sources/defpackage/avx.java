package defpackage;

import androidx.compose.foundation.selection.TriStateToggleableElement;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avx extends arrp implements arqw<cga, bwj, Integer, cga> {
    final /* synthetic */ aev a;
    final /* synthetic */ dhs b;
    final /* synthetic */ boolean c;
    final /* synthetic */ dgv d;
    final /* synthetic */ arqg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avx(aev aevVar, dhs dhsVar, boolean z, dgv dgvVar, arqg arqgVar) {
        super(3);
        this.a = aevVar;
        this.b = dhsVar;
        this.c = z;
        this.d = dgvVar;
        this.e = arqgVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        bwjVar.y(-1525724089);
        Object h = bwjVar.h();
        if (h == bwj.a.a) {
            h = new ajs();
            bwjVar.B(h);
        }
        ajr ajrVar = (ajr) h;
        cga a = aex.a(cga.e, ajrVar, this.a).a(new TriStateToggleableElement(this.b, ajrVar, null, this.c, this.d, this.e));
        bwjVar.q();
        return a;
    }
}
