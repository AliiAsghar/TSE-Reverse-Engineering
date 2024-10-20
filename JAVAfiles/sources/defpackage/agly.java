package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agly extends agpm {
    public final String a;

    public agly(agpj agpjVar, String str) {
        super(agpjVar);
        this.a = str;
    }

    @Override // defpackage.agpj
    public final String ad(agpo agpoVar) {
        return "(" + this.b.ad(agpoVar) + ") AS " + this.a;
    }

    @Override // defpackage.agpj
    public final String ae(agpo agpoVar, List list) {
        return "(" + this.b.ae(agpoVar, list) + ") AS " + this.a;
    }
}
