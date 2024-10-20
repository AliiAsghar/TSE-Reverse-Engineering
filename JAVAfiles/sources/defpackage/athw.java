package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class athw extends athq {
    private final atgd a;
    final long b;

    public athw(atfy atfyVar, long j) {
        super(atfyVar);
        this.b = j;
        this.a = new athv(this, ((atfx) atfyVar).a);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final atgd q() {
        return this.a;
    }

    public abstract long x(long j, long j2);
}
