package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alqb extends aloq {
    private static final long serialVersionUID = 0;
    private final Comparator a;

    public alqb(alqc alqcVar) {
        super(alqcVar);
        this.a = alqcVar.comparator();
    }

    @Override // defpackage.aloq
    public final /* bridge */ /* synthetic */ alok a(int i) {
        return new alqa(this.a);
    }
}
