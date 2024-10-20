package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vaw implements vgf {
    private static final alwo a = alwo.o("BugleAlphaverse");
    private final armf b;

    public vaw(armf armfVar) {
        armfVar.getClass();
        this.b = armfVar;
    }

    @Override // defpackage.vgf
    public final akul a(aozy aozyVar, msh mshVar, int i) {
        aozyVar.getClass();
        if (((nib) this.b.b()).a()) {
            ((alwl) a.g()).q("Advertising multi-device.");
            aozy createBuilder = aqhz.a.createBuilder();
            createBuilder.getClass();
            DesugarCollections.unmodifiableList(((aqhz) createBuilder.b).b).getClass();
            createBuilder.bO(vbe.MULTI_DEVICE.g);
            aozyVar.bL(aqae.f(createBuilder));
        }
        akul ag = aktp.ag(aozyVar);
        ag.getClass();
        return ag;
    }
}
