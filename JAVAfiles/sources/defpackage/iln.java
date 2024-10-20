package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class iln extends ijy<Optional<ammc>> {
    final /* synthetic */ ilw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iln(ilw ilwVar) {
        super("RCS oneOnOne conditions");
        this.a = ilwVar;
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return;
        }
        this.a.N = (ammc) optional.get();
        ilw ilwVar = this.a;
        ily ilyVar = ilwVar.M;
        ilyVar.i = ilwVar.N;
        ilyVar.a();
        this.a.w("onRcsOneOnOneConditionsUpdated");
        this.a.t();
    }
}
