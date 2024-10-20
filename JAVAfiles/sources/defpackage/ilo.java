package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ilo extends ijy<Optional<Boolean>> {
    final /* synthetic */ ilw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilo(ilw ilwVar) {
        super("RCS support status");
        this.a = ilwVar;
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return;
        }
        this.a.M.h = ((Boolean) optional.get()).booleanValue();
    }
}
