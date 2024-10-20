package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atg extends arrp implements arqr<czp, czo> {
    final /* synthetic */ arsb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atg(arsb arsbVar) {
        super(1);
        this.a = arsbVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        czp czpVar = (czp) obj;
        czpVar.getClass();
        asm asmVar = ((atn) czpVar).a;
        arsb arsbVar = this.a;
        List list = (List) arsbVar.a;
        if (list != null) {
            list.add(asmVar);
        } else {
            list = aqjn.D(asmVar);
        }
        arsbVar.a = list;
        return czo.b;
    }
}
