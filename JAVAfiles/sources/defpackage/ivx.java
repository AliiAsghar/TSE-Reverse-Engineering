package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ivx extends ijy<Optional<yxz>> {
    final /* synthetic */ ixd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivx(ixd ixdVar) {
        super("Signature Data Loader");
        this.a = ixdVar;
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void c(Object obj) {
        Optional optional = (Optional) obj;
        if (((Boolean) ixq.a.e()).booleanValue()) {
            ixd ixdVar = this.a;
            Optional empty = Optional.empty();
            if (optional.isPresent()) {
                empty = Optional.of(((yxz) optional.get()).a);
            }
            ixdVar.Q(null, new ivh(empty, 13));
        }
    }
}
