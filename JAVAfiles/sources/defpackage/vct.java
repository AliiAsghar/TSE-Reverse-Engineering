package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vct implements andy {
    private final apwt a;

    public vct(apwt apwtVar) {
        this.a = apwtVar;
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        ((Optional) this.a.b()).ifPresent(new uhb(9));
    }

    @Override // defpackage.andy
    public final void b(Object obj) {
        ((Optional) this.a.b()).ifPresent(new uhb(10));
    }
}
