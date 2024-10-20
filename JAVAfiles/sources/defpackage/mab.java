package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mab extends agmc {
    final /* synthetic */ mac a;

    public mab(mac macVar) {
        this.a = macVar;
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ void b(agoz agozVar, aglo agloVar) {
        smr smrVar = (smr) agloVar.p();
        if (smrVar != null) {
            mac macVar = this.a;
            ConversationIdType x = smrVar.x();
            if (!x.b()) {
                macVar.e(mej.CONVERSATION_CREATED_EVENT, Optional.of(x.toString()));
                return;
            }
            return;
        }
        agpr r = agloVar.r();
        if (r != null) {
            r.k(new mai(this.a, r, 1));
        }
        agpw s = agloVar.s();
        if (s != null) {
            s.d(new maj(this.a, 1));
        }
    }
}
