package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ased implements arpe, arpt {
    private final arpe a;
    private final arpi b;

    public ased(arpe arpeVar, arpi arpiVar) {
        this.a = arpeVar;
        this.b = arpiVar;
    }

    @Override // defpackage.arpt
    public final arpt dJ() {
        arpe arpeVar = this.a;
        if (arpeVar instanceof arpt) {
            return (arpt) arpeVar;
        }
        return null;
    }

    @Override // defpackage.arpe
    public final arpi u() {
        return this.b;
    }

    @Override // defpackage.arpe
    public final void w(Object obj) {
        this.a.w(obj);
    }

    @Override // defpackage.arpt
    public final void dK() {
    }
}
