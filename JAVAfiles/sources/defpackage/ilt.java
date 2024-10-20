package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ilt extends ijy<Optional<yxz>> {
    final /* synthetic */ ilw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilt(ilw ilwVar) {
        super("Draft Signature Data Loader");
        this.a = ilwVar;
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void c(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            this.a.G.O(Optional.empty());
            return;
        }
        this.a.G.O(Optional.of(((yxz) optional.get()).a));
    }
}
