package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agow extends agpm {
    public agow(agpj agpjVar) {
        super(agpjVar);
    }

    @Override // defpackage.agpj
    public final String ad(agpo agpoVar) {
        return "(SELECT NOT EXISTS " + this.b.ad(agpoVar) + ")";
    }

    @Override // defpackage.agpj
    public final String ae(agpo agpoVar, List list) {
        return "(SELECT NOT EXISTS " + this.b.ae(null, list) + ")";
    }
}
