package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arps extends arpq {
    public transient arpe B;
    private final arpi a;

    public arps(arpe arpeVar) {
        this(arpeVar, arpeVar != null ? arpeVar.u() : null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arpq
    public void g() {
        arpe arpeVar = this.B;
        if (arpeVar != null && arpeVar != this) {
            arpg arpgVar = u().get(arpf.k);
            arpgVar.getClass();
            ((arpf) arpgVar).f(arpeVar);
        }
        this.B = arpr.a;
    }

    @Override // defpackage.arpe
    public arpi u() {
        arpi arpiVar = this.a;
        arpiVar.getClass();
        return arpiVar;
    }

    public arps(arpe arpeVar, arpi arpiVar) {
        super(arpeVar);
        this.a = arpiVar;
    }
}
