package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akgm implements akfz {
    public final /* synthetic */ akgn a;

    public akgm(akgn akgnVar) {
        this.a = akgnVar;
    }

    @Override // defpackage.akfz
    public final void a(akfy akfyVar) {
        boolean bC;
        int ordinal = akfyVar.c.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (!a.bC(this.a.e, akfw.LOCAL_STATE_CHANGE, akfw.REMOTE_STATE_CHANGE)) {
                    bC = a.bC(this.a.e, null, akfw.REMOTE_STATE_CHANGE);
                } else {
                    return;
                }
            } else {
                throw new IllegalStateException("Unrecognized CallReason: ".concat(akfyVar.toString()));
            }
        } else {
            bC = a.bC(this.a.e, null, akfw.LOCAL_STATE_CHANGE);
        }
        if (bC) {
            akgn akgnVar = this.a;
            akgnVar.b.execute(new akhg(this, 1));
        }
    }
}
