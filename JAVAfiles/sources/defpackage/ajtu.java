package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajtu extends ajta {
    static final algf a = new ajtc();
    static final algf b = new ajtn();
    static final algf c = new ajtk();

    @Override // defpackage.ajta
    public final void b(wdn wdnVar, aoad aoadVar) {
        aoyo aoyoVar = wdnVar.c;
        if (aoyoVar == null) {
            aoyoVar = aoyo.a;
        }
        aozb aozbVar = aoyoVar.b;
        if (aozbVar != null) {
            aoadVar.c = aozbVar;
            return;
        }
        throw new NullPointerException("Null opaqueData");
    }
}
