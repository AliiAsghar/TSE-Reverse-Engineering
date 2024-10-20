package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfg extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ dfi a;
    final /* synthetic */ arqv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfg(dfi dfiVar, arqv arqvVar) {
        super(2);
        this.a = dfiVar;
        this.b = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            dfi dfiVar = this.a;
            AndroidCompositionLocals_androidKt.a(dfiVar.a, this.b, bwjVar, 0);
        }
        return arnb.a;
    }
}
