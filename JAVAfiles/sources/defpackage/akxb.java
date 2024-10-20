package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akxb extends akxd {
    private Optional a = Optional.empty();

    @Override // defpackage.akxd, defpackage.akxo
    public final /* bridge */ /* synthetic */ Object a() {
        return new akxe(this.a);
    }

    @Override // defpackage.akxd
    public final void b(alaq alaqVar) {
        this.a = Optional.of(alaqVar);
    }
}
