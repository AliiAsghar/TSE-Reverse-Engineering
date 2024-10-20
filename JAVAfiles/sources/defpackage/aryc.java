package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aryc extends arpa implements arxm {
    public static final aryc a = new aryc();

    private aryc() {
        super(arxm.c);
    }

    @Override // defpackage.arxm
    @armg
    public final boolean A() {
        return false;
    }

    @Override // defpackage.arxm
    @armg
    public final arvt ho(arxw arxwVar) {
        return aryd.a;
    }

    @Override // defpackage.arxm
    @armg
    public final Object q(arpe arpeVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.arxm
    @armg
    public final CancellationException r() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.arxm
    @armg
    public final arwu s(arqr arqrVar) {
        return aryd.a;
    }

    @Override // defpackage.arxm
    @armg
    public final arwu t(boolean z, boolean z2, arqr arqrVar) {
        return aryd.a;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.arxm
    public final boolean x() {
        return true;
    }

    @Override // defpackage.arxm
    public final boolean y() {
        return false;
    }

    @Override // defpackage.arxm
    public final boolean z() {
        return false;
    }

    @Override // defpackage.arxm
    @armg
    public final void v(CancellationException cancellationException) {
    }
}
