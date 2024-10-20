package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emy implements enk {
    private final emx a;
    private final enk b;

    public emy(emx emxVar, enk enkVar) {
        this.a = emxVar;
        this.b = enkVar;
    }

    @Override // defpackage.enk
    public final void dH(enm enmVar, enf enfVar) {
        switch (enfVar) {
            case ON_CREATE:
                this.a.d(enmVar);
                break;
            case ON_START:
                this.a.h(enmVar);
                break;
            case ON_RESUME:
                this.a.gG(enmVar);
                break;
            case ON_PAUSE:
                this.a.f(enmVar);
                break;
            case ON_STOP:
                this.a.i(enmVar);
                break;
            case ON_DESTROY:
                this.a.gF(enmVar);
                break;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        enk enkVar = this.b;
        if (enkVar != null) {
            enkVar.dH(enmVar, enfVar);
        }
    }
}
