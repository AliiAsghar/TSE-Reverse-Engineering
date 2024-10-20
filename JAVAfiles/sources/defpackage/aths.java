package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aths extends athq {
    public final atfw b;

    /* JADX INFO: Access modifiers changed from: protected */
    public aths(atfw atfwVar, atfy atfyVar) {
        super(atfyVar);
        if (atfwVar != null) {
            if (atfwVar.u()) {
                this.b = atfwVar;
                return;
            }
            throw new IllegalArgumentException("The field must be supported");
        }
        throw new IllegalArgumentException("The field must not be null");
    }

    @Override // defpackage.athq, defpackage.atfw
    public int a(long j) {
        throw null;
    }

    @Override // defpackage.athq, defpackage.atfw
    public int c() {
        throw null;
    }

    @Override // defpackage.atfw
    public int d() {
        throw null;
    }

    @Override // defpackage.athq, defpackage.atfw
    public long g(long j) {
        throw null;
    }

    @Override // defpackage.athq, defpackage.atfw
    public long h(long j, int i) {
        return this.b.h(j, i);
    }

    @Override // defpackage.athq, defpackage.atfw
    public atgd q() {
        return this.b.q();
    }

    @Override // defpackage.atfw
    public atgd s() {
        return this.b.s();
    }

    @Override // defpackage.atfw
    public final void v() {
    }
}
