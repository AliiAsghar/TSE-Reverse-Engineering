package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agoc extends agpy {
    private final agpj a;

    public agoc(agpj agpjVar) {
        this.a = agpjVar;
    }

    @Override // defpackage.agpy
    public final void a(agpo agpoVar, StringBuilder sb, List list) {
        sb.append("(");
        sb.append(this.a.ae(agpoVar, list));
        sb.append(")");
    }

    @Override // defpackage.agpy
    public final void b(agpo agpoVar, StringBuilder sb) {
        sb.append(this.a.ad(agpoVar));
    }

    @Override // defpackage.agpy
    public final void e(adwp adwpVar) {
        this.a.af(adwpVar);
    }
}
