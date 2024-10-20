package defpackage;

import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ilq extends ijy<Optional<san>> {
    final /* synthetic */ Bundle a;
    final /* synthetic */ ilw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilq(ilw ilwVar, Bundle bundle) {
        super("Conversation metadata");
        this.a = bundle;
        this.b = ilwVar;
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void c(Object obj) {
        Optional optional = (Optional) obj;
        if (!this.b.U.c(this.a) && !optional.isEmpty()) {
            ilw ilwVar = this.b;
            ilwVar.h.O((san) optional.get());
            this.b.u(lga.W(((san) optional.get()).n()));
        }
    }
}
