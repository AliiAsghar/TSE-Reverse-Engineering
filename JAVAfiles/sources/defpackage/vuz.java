package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vuz {
    public static final alwo a = alwo.o("BugleGroupManagement");
    public final anen b;
    public final wzs c;
    public final armf d;
    public final armf e;
    public final armf f;
    private final Context g;
    private final armf h;
    private final vbu i;
    private final armf j;
    private final uhj k;
    private final rrz l;
    private final vsh m;
    private final vxp n;
    private final armf o;

    public vuz(Context context, anen anenVar, armf armfVar, wzs wzsVar, vbu vbuVar, armf armfVar2, uhj uhjVar, rrz rrzVar, vsh vshVar, vxp vxpVar, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        this.g = context;
        this.b = anenVar;
        this.h = armfVar;
        this.c = wzsVar;
        this.i = vbuVar;
        this.j = armfVar2;
        this.k = uhjVar;
        this.l = rrzVar;
        this.m = vshVar;
        this.n = vxpVar;
        this.d = armfVar3;
        this.e = armfVar4;
        this.o = armfVar5;
        this.f = armfVar6;
    }

    public static boolean g(vvb vvbVar) {
        if (vvbVar.h.isEmpty() && vvbVar.c.isEmpty()) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "areParametersInvalid", 372, "RcsGroupNameUpdater.java")).q("No conversation ID or group ID provided when updating the group name");
            return true;
        }
        apct apctVar = vvbVar.f;
        if (apctVar == null) {
            apctVar = apct.a;
        }
        if (apds.a(apctVar) < 0) {
            alwl alwlVar = (alwl) a.i();
            alwlVar.X(ydl.o, vvbVar.h);
            alwlVar.X(ydl.I, vvbVar.c);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "areParametersInvalid", 383, "RcsGroupNameUpdater.java")).q("Negative timestamp provided when updating the group name");
            return true;
        }
        return false;
    }

    public static boolean h(apct apctVar, long j) {
        if (!apct.a.equals(apctVar) && apds.a(apctVar) < j) {
            return true;
        }
        return false;
    }

    private static ParticipantsTable.BindData i(String str) {
        ParticipantsTable.BindData bindData = null;
        if (albo.ah(str)) {
            return null;
        }
        taz e = ParticipantsTable.e();
        e.w("getOriginatorBindData");
        e.g(new vte(str, 7));
        e.h(new atkn((Object) ParticipantsTable.c.d, false));
        e.u(1);
        tav tavVar = (tav) e.b().n();
        try {
            if (tavVar.moveToFirst()) {
                bindData = (ParticipantsTable.BindData) tavVar.cK();
            }
            tavVar.close();
            ((alwl) a.m().h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "getOriginatorBindData", 634, "RcsGroupNameUpdater.java")).t("Originator MSISDN participant subIds: %s", new ivm(str, 2));
            return bindData;
        } catch (Throwable th) {
            try {
                tavVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ConversationIdType a(vvb vvbVar) {
        if (vvbVar.h.isEmpty()) {
            String str = vvbVar.c;
            long j = vvbVar.e;
            vsi a2 = vsj.a();
            a2.b(false);
            a2.g(false);
            a2.h(true);
            a2.n(amku.GROUP_NOTIFICATION);
            if (!str.isEmpty()) {
                a2.k(str);
            }
            if (j != -1) {
                a2.p(j);
            }
            return this.m.a(a2.a());
        }
        return ruy.b(vvbVar.h);
    }

    public final smr b(ConversationIdType conversationIdType) {
        snf e = sni.e();
        e.w("getProjectedConversationData");
        e.e(new vte(this, 8));
        e.h(new vte(conversationIdType, 9));
        return (smr) ((sna) e.b().n()).cO();
    }

    public final sng c(String str, ConversationIdType conversationIdType) {
        if (str.isEmpty()) {
            List K = ((rtz) this.h.b()).K(conversationIdType);
            if (((okf) this.e.b()).a()) {
                ryt i = ((uie) this.o.b()).i(alog.n(K));
                sng sngVar = new sng();
                sngVar.aj("getUpdateValues-conversations1");
                sngVar.x(this.l.a(i));
                sngVar.y(tqh.NAME_IS_AUTOMATIC);
                return sngVar;
            }
            sng sngVar2 = new sng();
            sngVar2.ag();
            sngVar2.aj("getUpdateValues-conversations1");
            sngVar2.x(this.l.b(K));
            sngVar2.y(tqh.NAME_IS_AUTOMATIC);
            return sngVar2;
        }
        sng sngVar3 = new sng();
        sngVar3.ag();
        sngVar3.aj("getUpdateValues-conversations2");
        sngVar3.x(str);
        sngVar3.y(tqh.NAME_IS_MANUAL);
        return sngVar3;
    }

    public final sng d(String str, long j, ConversationIdType conversationIdType) {
        Integer valueOf;
        Integer valueOf2;
        sng c = c(str, conversationIdType);
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 46050) {
            agnc.t("rcs_subject_change_timestamp_ms", intValue2);
        }
        if (intValue >= 46050) {
            c.a.put("rcs_subject_change_timestamp_ms", Long.valueOf(j));
        }
        return c;
    }

    public final upm e(sng sngVar, String str, vuy vuyVar, qwm qwmVar, String str2) {
        String str3;
        sngVar.c().getClass();
        if (!((okf) this.e.b()).a()) {
            str2 = this.i.k();
        }
        if (TextUtils.isEmpty(str2)) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateState", 554, "RcsGroupNameUpdater.java")).q("Failed to retrieve the local MSISDN");
            return upm.e();
        }
        if (((rtz) this.h.b()).ah(vuyVar.a, sngVar)) {
            String c = sngVar.c();
            c.getClass();
            tqh b = sngVar.b();
            wzs wzsVar = this.c;
            Context context = this.g;
            String str4 = vuyVar.c;
            vxp vxpVar = this.n;
            String str5 = vuyVar.b;
            tqh tqhVar = tqh.NAME_IS_AUTOMATIC;
            ContentResolver contentResolver = context.getContentResolver();
            if (b == tqhVar) {
                str3 = "";
            } else {
                str3 = c;
            }
            ((alwl) a.m().h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "onSuccessfulDatabaseUpdate", 588, "RcsGroupNameUpdater.java")).r("TelephonyManagerInterface updated %s rows when updating the canonical address", wzsVar.c(contentResolver, str4, vxpVar.a(str2, str5, str3)));
            if (b == tqhVar) {
                ujv ujvVar = (ujv) this.j.b();
                ujvVar.h.e("TombstoneInserter#insertRcsGroupNameClearTombstone", new uju(ujvVar, vuyVar.a, qwmVar, i(str), 2));
            } else {
                ((ujv) this.j.b()).j(vuyVar.a, c, i(str), qwmVar);
            }
            this.k.d(vuyVar.a);
            return upm.b();
        }
        ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateState", 560, "RcsGroupNameUpdater.java")).q("updateConversationRowIfExists failed when updating conversation name");
        return upm.d();
    }

    public final akul f(final vvb vvbVar) {
        if (((okf) this.e.b()).a()) {
            return aktp.aj(new ancr() { // from class: vux
                @Override // defpackage.ancr
                public final ListenableFuture a() {
                    long a2;
                    sng d;
                    boolean z;
                    akul c;
                    vvb vvbVar2 = vvbVar;
                    if (vuz.g(vvbVar2)) {
                        return aktp.ag(upm.d());
                    }
                    String str = vvbVar2.d;
                    apct apctVar = vvbVar2.f;
                    if (apctVar == null) {
                        apctVar = apct.a;
                    }
                    vuz vuzVar = vuz.this;
                    ConversationIdType a3 = vuzVar.a(vvbVar2);
                    if (a3.b()) {
                        alwl alwlVar = (alwl) vuz.a.i();
                        alwlVar.X(ydl.p, a3);
                        alwlVar.X(ydl.I, vvbVar2.c);
                        alwlVar.X(ydl.G, Long.valueOf(vvbVar2.e));
                        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateInternal", 165, "RcsGroupNameUpdater.java")).q("Failed to retrieve conversation and thread id");
                        return aktp.ag(upm.d());
                    }
                    smr b = vuzVar.b(a3);
                    if (b == null) {
                        alwl alwlVar2 = (alwl) vuz.a.i();
                        alwlVar2.X(ydl.p, a3);
                        ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateInternal", 175, "RcsGroupNameUpdater.java")).q("Failed to retrieve conversation data");
                        return aktp.ag(upm.d());
                    }
                    String V = b.V();
                    if (V == null) {
                        alwl alwlVar3 = (alwl) vuz.a.i();
                        alwlVar3.X(ydl.p, a3);
                        ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateInternal", 183, "RcsGroupNameUpdater.java")).q("Conversation has null group ID");
                        return aktp.ag(upm.d());
                    }
                    if (wam.s(str, b.P(), b.B()) && !vuz.h(apctVar, b.t())) {
                        if (apct.a.equals(apctVar)) {
                            d = vuzVar.c(str, a3);
                            a2 = -1;
                        } else {
                            a2 = apds.a(apctVar);
                            d = vuzVar.d(str, a2, a3);
                        }
                        long j = a2;
                        sng sngVar = d;
                        xhv F = b.F();
                        String G = vuzVar.c.G(F);
                        if (G == null) {
                            alwl alwlVar4 = (alwl) vuz.a.i();
                            alwlVar4.X(ydl.r, F);
                            ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateInternal", 217, "RcsGroupNameUpdater.java")).q("Failed to retrieve recipient id for thread id");
                            return aktp.ag(upm.d());
                        }
                        if (vvbVar2.i > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        d.t(z, "Invalid subscription Id while attempting group rename.");
                        qwm f = ((ryg) vuzVar.d.b()).f(vvbVar2.i);
                        alvw m = vuz.a.m();
                        m.X(ydl.p, a3);
                        m.X(ydl.r, F);
                        m.X(ydl.I, V);
                        m.X(vvc.a, G);
                        alvz alvzVar = vvc.b;
                        String c2 = sngVar.c();
                        c2.getClass();
                        m.X(alvzVar, c2);
                        m.X(vvc.c, sngVar.b());
                        m.X(vvc.d, Long.valueOf(j));
                        m.X(vvc.e, vvbVar2.g);
                        ((alwl) m.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateInternal", 237, "RcsGroupNameUpdater.java")).q("Updating conversation name");
                        SelfIdentityId W = lga.W(b.K());
                        if (W == null) {
                            c = aktp.ag(Optional.empty());
                        } else {
                            vpk vpkVar = (vpk) vuzVar.f.b();
                            c = ((pce) vpkVar.d.b()).a() ? qjh.c(vpkVar.h, arpj.a, arwf.a, new uwn(vpkVar, W, (arpe) null, 13)) : qjh.c(vpkVar.g, arpj.a, arwf.a, new uwn(vpkVar, W, (arpe) null, 14, (byte[]) null));
                        }
                        return c.h(new tty(vuzVar, sngVar, vvbVar2, a3, V, G, f, 2), vuzVar.b);
                    }
                    alvw m2 = vuz.a.m();
                    m2.X(ydl.p, a3);
                    m2.X(vvc.b, str);
                    m2.X(vvc.c, b.B());
                    m2.X(vvc.d, Long.valueOf(apds.a(apctVar)));
                    m2.X(vvc.d, Long.valueOf(b.t()));
                    ((alwl) m2.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateInternal", 197, "RcsGroupNameUpdater.java")).q("No name update applicable");
                    return aktp.ag(upm.b());
                }
            }, this.b);
        }
        return aktp.ai(new Callable() { // from class: vuw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                long a2;
                sng d;
                boolean z;
                vvb vvbVar2 = vvbVar;
                if (vuz.g(vvbVar2)) {
                    return upm.d();
                }
                String str = vvbVar2.d;
                apct apctVar = vvbVar2.f;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                vuz vuzVar = vuz.this;
                ConversationIdType a3 = vuzVar.a(vvbVar2);
                if (a3.b()) {
                    alwl alwlVar = (alwl) vuz.a.i();
                    alwlVar.X(ydl.o, vvbVar2.h);
                    alwlVar.X(ydl.I, vvbVar2.c);
                    alwlVar.X(ydl.G, Long.valueOf(vvbVar2.e));
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateBlocking", 284, "RcsGroupNameUpdater.java")).q("Failed to retrieve conversation and thread id");
                    return upm.d();
                }
                smr b = vuzVar.b(a3);
                if (b == null) {
                    alwl alwlVar2 = (alwl) vuz.a.i();
                    alwlVar2.X(ydl.o, a3.toString());
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateBlocking", 293, "RcsGroupNameUpdater.java")).q("Failed to retrieve conversation data");
                    return upm.d();
                }
                String V = b.V();
                if (V == null) {
                    alwl alwlVar3 = (alwl) vuz.a.i();
                    alwlVar3.X(ydl.o, a3.toString());
                    ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateBlocking", 301, "RcsGroupNameUpdater.java")).q("Conversation has null group ID");
                    return upm.d();
                }
                if (wam.s(str, b.P(), b.B()) && !vuz.h(apctVar, b.t())) {
                    if (apct.a.equals(apctVar)) {
                        d = vuzVar.c(str, a3);
                        a2 = -1;
                    } else {
                        a2 = apds.a(apctVar);
                        d = vuzVar.d(str, a2, a3);
                    }
                    xhv F = b.F();
                    String G = vuzVar.c.G(F);
                    if (G == null) {
                        alwl alwlVar4 = (alwl) vuz.a.i();
                        alwlVar4.X(ydl.r, F);
                        ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateBlocking", 334, "RcsGroupNameUpdater.java")).q("Failed to retrieve recipient id for thread id");
                        return upm.d();
                    }
                    ((ryg) vuzVar.d.b()).d();
                    if (vvbVar2.i > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    d.t(z, "Invalid subscription Id while attempting group rename.");
                    qwm f = ((ryg) vuzVar.d.b()).f(vvbVar2.i);
                    alvw m = vuz.a.m();
                    m.X(ydl.o, a3.toString());
                    m.X(ydl.r, F);
                    m.X(ydl.I, V);
                    m.X(vvc.a, G);
                    alvz alvzVar = vvc.b;
                    String c = d.c();
                    c.getClass();
                    m.X(alvzVar, c);
                    m.X(vvc.c, d.b());
                    m.X(vvc.d, Long.valueOf(a2));
                    m.X(vvc.e, vvbVar2.g);
                    ((alwl) m.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateBlocking", 355, "RcsGroupNameUpdater.java")).q("Updating conversation name");
                    return vuzVar.e(d, vvbVar2.g, new vuy(a3, V, G), f, null);
                }
                alvw m2 = vuz.a.m();
                m2.X(ydl.o, a3.toString());
                m2.X(vvc.b, str);
                m2.X(vvc.c, b.B());
                m2.X(vvc.d, Long.valueOf(apds.a(apctVar)));
                m2.X(vvc.d, Long.valueOf(b.t()));
                ((alwl) m2.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateBlocking", 315, "RcsGroupNameUpdater.java")).q("No name update applicable");
                return upm.b();
            }
        }, this.b);
    }
}
