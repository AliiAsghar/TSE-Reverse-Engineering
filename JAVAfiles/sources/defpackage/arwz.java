package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arwz extends arxa {
    private final Runnable a;

    public arwz(long j, Runnable runnable) {
        super(j);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    @Override // defpackage.arxa
    public final String toString() {
        String arxaVar = super.toString();
        Runnable runnable = this.a;
        Objects.toString(runnable);
        return arxaVar.concat(runnable.toString());
    }
}
