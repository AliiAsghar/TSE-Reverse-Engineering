package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxp implements yxn, yxh {
    public static final xze a = xze.g("BugleDataModel", "XmsSenderProxy");
    private final alor b;
    private final alor c;
    private final anen d;
    private final armf e;
    private final yxe f;

    public yxp(Map map, Map map2, anen anenVar, armf armfVar, yxe yxeVar) {
        this.b = alor.j(map);
        this.c = alor.j(map2);
        this.d = anenVar;
        this.e = armfVar;
        this.f = yxeVar;
    }

    @Override // defpackage.yxh
    public final akul a(yxj yxjVar) {
        yxe yxeVar = this.f;
        yxq yxqVar = yxq.TELEPHONY_UNSPECIFIED;
        yxjVar.a.bO((tqu) yxeVar.fu(yxqVar));
        ((mho) this.e.b()).K(yxjVar.a, yxjVar.c);
        armf armfVar = (armf) this.c.get(yxqVar);
        if (armfVar != null) {
            return ((yxh) armfVar.b()).a(yxjVar).h(new yts(15), this.d);
        }
        throw new IllegalStateException("Do not have an MmsSender implementation registered for XmsTransportType: ".concat(String.valueOf(yxqVar.name())));
    }

    @Override // defpackage.yxn
    public final akul b(yxl yxlVar) {
        yxe yxeVar = this.f;
        yxq yxqVar = yxq.TELEPHONY_UNSPECIFIED;
        yxlVar.a.bO((tqu) yxeVar.fu(yxqVar));
        ((mho) this.e.b()).K(yxlVar.a, yxlVar.c);
        armf armfVar = (armf) this.b.get(yxqVar);
        if (armfVar != null) {
            return ((yxn) armfVar.b()).b(yxlVar).h(new yts(14), this.d);
        }
        throw new IllegalStateException("Do not have an SmsSender implementation registered for XmsTransportType: ".concat(String.valueOf(yxqVar.name())));
    }
}
