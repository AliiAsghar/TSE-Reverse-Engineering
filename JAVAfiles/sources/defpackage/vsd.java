package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vsd implements vsh {
    public final vsb a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final anen e;

    public vsd(vsb vsbVar, armf armfVar, armf armfVar2, armf armfVar3, anen anenVar) {
        this.a = vsbVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = anenVar;
    }

    @Override // defpackage.vsh
    public final ConversationIdType a(vsj vsjVar) {
        xwa c = c(vsjVar);
        if (c == null) {
            return ruy.a;
        }
        return c.a;
    }

    @Override // defpackage.vsh
    public final xwa c(vsj vsjVar) {
        Optional empty;
        Optional empty2;
        Optional i = wam.i((apwq) vsjVar.r.orElse(null), vxt.RCS_PENPAL_NAMESPACE, "BUGLE-CONVERSATION-ID");
        if (i.isPresent()) {
            empty = Optional.of(ruy.b((String) i.get()));
        } else {
            empty = Optional.empty();
        }
        if (!empty.isPresent()) {
            Optional i2 = wam.i((apwq) vsjVar.r.orElse(null), vxt.RCS_PENPAL_NAMESPACE, "PENPAL-COUNTERPARTY-NUMBER");
            if (i2.isPresent()) {
                empty2 = Optional.of(((nds) this.d.b()).a(((msk) this.c.b()).b(((psq) this.b.b()).a((String) i2.get(), false))));
            } else {
                empty2 = Optional.empty();
            }
            if (empty2.isPresent()) {
                vsb vsbVar = this.a;
                vsi vsiVar = new vsi(vsjVar);
                vsiVar.i(alog.r(empty2.get()));
                return vsbVar.c(vsiVar.a());
            }
            return this.a.c(vsjVar);
        }
        return new xwa((ConversationIdType) empty.get(), new vsc(this, empty, 0));
    }

    @Override // defpackage.vsh
    public final akul d(vsj vsjVar) {
        return aktp.ai(new vmb(this, vsjVar, 4), this.e);
    }
}
