package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alwb extends alwe {
    final /* synthetic */ alwe a;
    final /* synthetic */ alwe b;

    public alwb(alwe alweVar, alwe alweVar2) {
        this.a = alweVar;
        this.b = alweVar2;
    }

    @Override // defpackage.alwe
    public final void a() {
        try {
            this.a.a();
        } finally {
            this.b.a();
        }
    }
}
