package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arxq extends arvp {
    private final arxw f;

    public arxq(arpe arpeVar, arxw arxwVar) {
        super(arpeVar, 1);
        this.f = arxwVar;
    }

    @Override // defpackage.arvp
    protected final String p() {
        return "AwaitContinuation";
    }

    @Override // defpackage.arvp
    public final Throwable q(arxm arxmVar) {
        Throwable d;
        Object G = this.f.G();
        if ((G instanceof arxs) && (d = ((arxs) G).d()) != null) {
            return d;
        }
        if (G instanceof arvx) {
            return ((arvx) G).b;
        }
        return arxmVar.r();
    }
}
