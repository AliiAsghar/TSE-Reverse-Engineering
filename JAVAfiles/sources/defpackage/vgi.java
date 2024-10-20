package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vgi implements vgh {
    private static final xze a = xze.g("BugleNetwork", "UserDataInboxMessageHandler");
    private final Map b;

    public vgi(Map map) {
        this.b = map;
        for (askz askzVar : ((alor) map).keySet()) {
            xyo d = a.d();
            d.H("Registered UserData InboxMessageHandler");
            d.z(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, askzVar.name());
            d.q();
        }
    }

    @Override // defpackage.vgh
    public final akul a(aqds aqdsVar) {
        aqdr b = aqdr.b(aqdsVar.d);
        if (b == null) {
            b = aqdr.UNRECOGNIZED;
        }
        if (b.equals(aqdr.USERDATA)) {
            try {
                aqfd aqfdVar = (aqfd) apag.parseFrom(aqfd.a, aqdsVar.e, aozs.a());
                Map map = this.b;
                askz b2 = askz.b(aqfdVar.b);
                if (b2 == null) {
                    b2 = askz.UNRECOGNIZED;
                }
                vgh vghVar = (vgh) map.get(b2);
                if (vghVar == null) {
                    xyo e = a.e();
                    e.H("Got UserData InboxMessage with unhandled type ");
                    askz b3 = askz.b(aqfdVar.b);
                    if (b3 == null) {
                        b3 = askz.UNRECOGNIZED;
                    }
                    e.H(b3.name());
                    e.z("messageId", aqdsVar.c);
                    e.q();
                    return aktp.ag(true);
                }
                return vghVar.a(aqdsVar);
            } catch (apba e2) {
                xyo e3 = a.e();
                e3.H("Failed to parse UserDataMessage");
                e3.z("messageId", aqdsVar.c);
                e3.r(e2);
            }
        }
        xyo e4 = a.e();
        e4.H("Ignoring non UserData InboxMessage or invalid UserData InboxMessage");
        aqdr b4 = aqdr.b(aqdsVar.d);
        if (b4 == null) {
            b4 = aqdr.UNRECOGNIZED;
        }
        e4.z("messageType", b4);
        e4.z("messageId", aqdsVar.c);
        e4.q();
        return aktp.ag(true);
    }
}
