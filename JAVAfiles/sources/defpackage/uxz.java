package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uxz implements qcd {
    public final miw a;
    public final osr b;
    public final ndi c;
    public final ahiy d;
    private final arwe e;
    private final vco f;

    public uxz(vco vcoVar, arwe arweVar, ndi ndiVar, miw miwVar, osr osrVar, ahiy ahiyVar) {
        vcoVar.getClass();
        arweVar.getClass();
        ndiVar.getClass();
        miwVar.getClass();
        osrVar.getClass();
        ahiyVar.getClass();
        this.f = vcoVar;
        this.e = arweVar;
        this.c = ndiVar;
        this.a = miwVar;
        this.b = osrVar;
        this.d = ahiyVar;
    }

    @Override // defpackage.qcd
    public final akul a(qei qeiVar, ConversationIdType conversationIdType, qfg qfgVar) {
        akul c;
        qeiVar.getClass();
        conversationIdType.getClass();
        qfgVar.getClass();
        if (uzz.g() && this.f.i() && qfgVar.b.size() + qfgVar.c.size() > 0) {
            c = qjh.c(this.e, arpj.a, arwf.a, new whw(this, conversationIdType, (arpe) null, 1));
            return c;
        }
        akul ag = aktp.ag(null);
        ag.getClass();
        return ag;
    }
}
