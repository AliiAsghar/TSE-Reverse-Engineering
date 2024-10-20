package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arpu extends arpq {
    public arpu(arpe arpeVar) {
        super(arpeVar);
        if (arpeVar != null && arpeVar.u() != arpj.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.arpe
    public final arpi u() {
        return arpj.a;
    }
}
