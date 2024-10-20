package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mdw implements ajnw {
    public final armf a;
    public maq b;
    public final armf c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public mdw(armf armfVar, armf armfVar2) {
        this.c = armfVar;
        this.a = armfVar2;
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, acyz] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, acyz] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, acyz] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, acyz] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object, acyz] */
    /* JADX WARN: Type inference failed for: r4v46, types: [java.lang.Object, acyz] */
    @Override // defpackage.ajnw
    public final void a(apfi apfiVar, int i) {
        int intValue;
        double d;
        aozy createBuilder = apfj.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apfj apfjVar = (apfj) apagVar;
        apfjVar.c = apfiVar.h;
        apfjVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apfj apfjVar2 = (apfj) createBuilder.b;
        apfjVar2.d = i - 1;
        apfjVar2.b |= 2;
        apfj apfjVar3 = (apfj) createBuilder.s();
        if (this.d.get()) {
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            amfp amfpVar = amfp.JIBE_SERVICE_CONNECTION;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amfrVar.i = amfpVar.dg;
            amfrVar.b |= 1;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            apfjVar3.getClass();
            amfrVar2.aw = apfjVar3;
            amfrVar2.e |= 256;
            maq maqVar = this.b;
            apfi b = apfi.b(apfjVar3.c);
            if (b == null) {
                b = apfi.UNKNOWN_SERVICE;
            }
            switch (b.ordinal()) {
                case 1:
                    intValue = ((Integer) aczj.a().a.a.a()).intValue();
                    d = intValue;
                    break;
                case 2:
                    intValue = ((Integer) aczj.a().a.d.a()).intValue();
                    d = intValue;
                    break;
                case 3:
                    intValue = ((Integer) aczj.a().a.b.a()).intValue();
                    d = intValue;
                    break;
                case 4:
                    intValue = ((Integer) aczj.a().a.c.a()).intValue();
                    d = intValue;
                    break;
                case 5:
                    intValue = ((Integer) aczj.a().a.e.a()).intValue();
                    d = intValue;
                    break;
                case 6:
                    intValue = ((Integer) aczj.a().a.f.a()).intValue();
                    d = intValue;
                    break;
                default:
                    d = 0.0d;
                    break;
            }
            maqVar.p(amfqVar, d);
        }
    }
}
