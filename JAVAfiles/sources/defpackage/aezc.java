package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aezc extends arrp implements arqv {
    final /* synthetic */ float a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aezc(float f) {
        super(2);
        this.a = f;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            amx.a(dea.a(amv.h(cga.e, this.a), "AnimationPlaceholder"), bwjVar);
        }
        return arnb.a;
    }
}
