package defpackage;

import com.google.android.ims.provisioning.config.InstantMessageConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class actb implements actk {
    private final armf a;
    private final armf b;
    private final armf c;

    public actb(armf armfVar, armf armfVar2, armf armfVar3) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
    }

    @Override // defpackage.actk
    public final /* synthetic */ actj a(InstantMessageConfiguration instantMessageConfiguration, acnv acnvVar) {
        actf actfVar = (actf) this.a.b();
        actfVar.getClass();
        anen anenVar = (anen) this.b.b();
        instantMessageConfiguration.getClass();
        return new acta(actfVar, anenVar, this.c, instantMessageConfiguration, acnvVar);
    }
}
