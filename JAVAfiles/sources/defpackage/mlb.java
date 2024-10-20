package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mlb {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/control/status/control/MessageStatusControllerImpl");
    public final armf b;
    public final anen c;
    public final oqs d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final orj i;

    public mlb(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, anen anenVar, armf armfVar5, oqs oqsVar, orj orjVar) {
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.b = armfVar4;
        this.h = armfVar5;
        this.c = anenVar;
        this.d = oqsVar;
        this.i = orjVar;
    }

    public static void d(sya syaVar, mkz mkzVar) {
        i(syaVar, mkzVar.i);
        mkzVar.k.ifPresent(new mht(syaVar, 20));
    }

    public static boolean e(int i) {
        if (!rvx.r(i) && !rvx.u(i) && !rvx.s(i) && !rvx.t(i)) {
            return false;
        }
        return true;
    }

    private static void i(sya syaVar, int i) {
        if (e(i)) {
            syaVar.P(new mfk(18));
        } else {
            syaVar.P(new mfk(16));
        }
        syaVar.L(i);
    }

    private final boolean j(mkz mkzVar, BiFunction biFunction) {
        MessageCoreData u;
        Object apply;
        Object apply2;
        MessageIdType messageIdType = mkzVar.a;
        if (this.i.a()) {
            u = ((rwd) this.e.b()).q(messageIdType);
        } else {
            u = ((rwd) this.e.b()).u(messageIdType);
        }
        if (u == null) {
            alvw i = a.i();
            i.X(alwp.a, "BugleDataModel");
            alvg alvgVar = (alvg) i;
            alvgVar.X(ydl.b, messageIdType);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/control/status/control/MessageStatusControllerImpl", "handleSendOrDeliveryFailureForSingleMessage", 161, "MessageStatusControllerImpl.java")).q("failed in finding message from Messages Table");
            return false;
        }
        if (!u.cI()) {
            apply = biFunction.apply(u, mkzVar);
            return ((Boolean) apply).booleanValue();
        }
        byte[] bArr = null;
        if (mkzVar.o != 0) {
            apply2 = biFunction.apply(u, mkzVar);
            boolean booleanValue = ((Boolean) apply2).booleanValue();
            ((agnq) this.h.b()).h(new mla(1), null, new irs(this, u, 19, bArr));
            return booleanValue;
        }
        throw null;
    }

    public final int a(sya syaVar, int i, amlg amlgVar, boolean z) {
        i(syaVar, i);
        rwd rwdVar = (rwd) this.e.b();
        akrh e = aktp.e("MessageDatabaseOperations#updateAndReturnUpdatedMessages");
        try {
            sxy d = MessagesTable.d();
            d.w("updateAndReturnUpdatedMessages#query");
            d.g(new rwb(syaVar, 3));
            int i2 = 4;
            Stream map = Collection.EL.stream(d.b().t()).map(new rwb(rwdVar, i2));
            int i3 = alog.d;
            alog alogVar = (alog) map.collect(alls.a);
            if (!alogVar.isEmpty()) {
                Map.EL.forEach((HashMap) Collection.EL.stream(alogVar).collect(Collectors.groupingBy(new rvy(19), new roi(13), Collectors.mapping(new rwc(1), alls.a))), new lui(rwdVar, i2));
            }
            e.close();
            ((agnq) this.h.b()).h(new mla(0), null, new ruk(this, alogVar, i, amlgVar, z, 1));
            return alogVar.size();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(MessageCoreData messageCoreData, amlg amlgVar) {
        mho mhoVar = (mho) this.f.b();
        mzr mzrVar = new mzr();
        mzrVar.e(messageCoreData);
        mzrVar.f(amlgVar);
        mhoVar.V(mzrVar.d());
    }

    public final void c(MessageCoreData messageCoreData, mkz mkzVar) {
        int i;
        amgs amgsVar;
        mkx mkxVar = (mkx) mkzVar.n.orElse(mkx.a());
        mgm mgmVar = new mgm(null);
        mgmVar.e(messageCoreData);
        qwm c = ((ryg) this.g.b()).c(messageCoreData.v());
        if (c == null) {
            c = ((ryg) this.g.b()).b();
        }
        if (c != null) {
            i = c.e();
        } else {
            i = -1;
        }
        mgmVar.h(i);
        mgmVar.f(((Integer) mkzVar.d.orElse(-2)).intValue());
        mgmVar.c(mkxVar.a);
        mgmVar.b(((Integer) mkzVar.e.orElse(-1)).intValue());
        mgmVar.d = mkxVar.e;
        mgmVar.d(mkxVar.c);
        mgmVar.c = Optional.of(mkzVar.h);
        if (this.i.a() && messageCoreData.cL()) {
            if (messageCoreData.co()) {
                amgsVar = amgs.END_OF_EMERGENCY;
            } else {
                amgsVar = amgs.SOS_MESSAGE;
            }
            mgmVar.g(amgsVar);
        }
        mkxVar.b.ifPresent(new mht(mgmVar, 10));
        mkxVar.d.ifPresent(new mht(mgmVar, 11));
        ((mho) this.f.b()).I(mgmVar.a());
    }

    public final boolean f(mkz mkzVar) {
        d.t(e(mkzVar.i), "terminal status is not a delivery failure");
        return j(mkzVar, new jgl(this, 3));
    }

    public final boolean g(mkz mkzVar) {
        d.t(!e(mkzVar.i), "terminal status is not a send failure");
        return j(mkzVar, new jgl(this, 2));
    }

    public final boolean h(MessageCoreData messageCoreData, sya syaVar) {
        boolean O = ((rwd) this.e.b()).O(messageCoreData.z(), messageCoreData.B(), syaVar);
        if (!O) {
            alvw i = a.i();
            i.X(alwp.a, "BugleDataModel");
            alvg alvgVar = (alvg) i;
            alvgVar.X(ydl.b, messageCoreData.B());
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/control/status/control/MessageStatusControllerImpl", "updateMessageStorage", 414, "MessageStatusControllerImpl.java")).t("failed in updating message in Message Table. Message might be deleted. SnapshotStatus=%s", messageCoreData.ay());
        }
        return O;
    }
}
