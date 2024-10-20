package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahya implements apxw {
    private final armf a;
    private final armf b;
    private final /* synthetic */ int c;

    public ahya(armf armfVar, armf armfVar2, int i) {
        this.c = i;
        this.a = armfVar;
        this.b = armfVar2;
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        if (this.c != 0) {
            armf armfVar = this.a;
            armf armfVar2 = this.b;
            Object b = armfVar.b();
            return new adze((ahxe) b);
        }
        armf armfVar3 = this.a;
        armf armfVar4 = this.b;
        return new ahof();
    }
}
