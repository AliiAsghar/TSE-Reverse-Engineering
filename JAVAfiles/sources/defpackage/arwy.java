package defpackage;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arwy extends arxa {
    final /* synthetic */ arxc a;
    private final arvo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arwy(arxc arxcVar, long j, arvo arvoVar) {
        super(j);
        this.a = arxcVar;
        this.c = arvoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.g(this.a, arnb.a);
    }

    @Override // defpackage.arxa
    public final String toString() {
        String arxaVar = super.toString();
        arvo arvoVar = this.c;
        Objects.toString(arvoVar);
        return arxaVar.concat(arvoVar.toString());
    }
}
