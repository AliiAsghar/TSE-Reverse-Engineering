package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agov extends agpm {
    public agov(agpj agpjVar) {
        super(agpjVar);
    }

    @Override // defpackage.agpj
    public final String ad(agpo agpoVar) {
        return "(SELECT EXISTS " + this.b.ad(agpoVar) + ")";
    }

    @Override // defpackage.agpj
    public final String ae(agpo agpoVar, List list) {
        return "(SELECT EXISTS " + this.b.ae(null, list) + ")";
    }
}
