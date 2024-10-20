package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qyn {
    public static final xze a = xze.g("Bugle", "VerifiedSmsEntityManager");
    public final agnq b;
    private final armf c;
    private final xvc d;

    public qyn(xvc xvcVar, armf armfVar, agnq agnqVar) {
        this.d = xvcVar;
        this.c = armfVar;
        this.b = agnqVar;
    }

    public static final tqr c(String str) {
        Object obj;
        xyo a2 = a.a();
        a2.H("requesting participant verified sms status");
        a2.e(str);
        a2.q();
        qxo qxoVar = new qxo(19);
        int i = qxs.a;
        ParticipantsTable.BindData a3 = ParticipantsTable.a(str);
        if (a3 != null) {
            obj = qxoVar.apply(a3);
        } else {
            obj = tqr.VERIFICATION_NA;
        }
        return (tqr) obj;
    }

    public final sep a(String str) {
        Object apply;
        xyo a2 = a.a();
        a2.H("Fetching sender and associated brand");
        a2.L("senderId", str);
        a2.q();
        ser serVar = new ser(set.a);
        serVar.w("getSenderWithBrandBySenderId");
        apply = new qwz(str, 6).apply(new ses());
        serVar.k(new agpw((ses) apply));
        return (sep) ((sea) serVar.b().n()).cO();
    }

    public final void b(String str) {
        xze xzeVar = a;
        xyo c = xzeVar.c();
        c.H("marking participant as unverified");
        c.e(str);
        c.q();
        tbb f = ParticipantsTable.f();
        f.aj("updateParticipantForUnverifiedSms");
        f.M(new qwz(str, 7));
        f.D(this.d.b(null, tqr.VERIFICATION_UNVERIFIED));
        f.p();
        f.r();
        f.v(tqr.VERIFICATION_UNVERIFIED);
        if (f.a().e() > 0) {
            xyo c2 = xzeVar.c();
            c2.H("participant was updated. Refreshing conversations");
            c2.q();
            ((rtz) this.c.b()).P(str);
        }
    }
}
