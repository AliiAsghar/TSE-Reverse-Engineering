package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ainc extends aimi {
    public ainc() {
        super("Via");
    }

    @Override // defpackage.aimi, defpackage.aimh, defpackage.aiku
    public final Object clone() {
        ainc aincVar = new ainc();
        for (int i = 0; i < this.a.size(); i++) {
            aincVar.g((aimh) ((ainb) this.a.get(i)).clone());
        }
        return aincVar;
    }

    public ainc(ainb... ainbVarArr) {
        super(ainbVarArr);
    }
}
