package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lci {
    private final Boolean a;
    private final Boolean b;
    private final Boolean c;
    private final Boolean d;
    private final Boolean e;
    private final Boolean f;

    public lci() {
        throw null;
    }

    public static void f(lcx lcxVar, lcq lcqVar, xnv xnvVar) {
        if (lcqVar.d) {
            lcxVar.f(new kza(lcqVar, 18));
        } else if (yig.d()) {
            lcxVar.f(new kzr(lcqVar, lga.y(lcqVar, ">", xnvVar), lga.y(lcqVar, "=", xnvVar), 6));
        } else {
            lcxVar.f(new kza(lcqVar, 19));
        }
    }

    private static lca g(lcv lcvVar, yiy yiyVar, boolean z, xnv xnvVar) {
        String str;
        lcc lccVar = new lcc();
        lccVar.U(new agme("conversations._id", 3, lcvVar));
        lcb a = lcd.a();
        a.w("makeBuilder");
        a.n(sam.f, "conversation_contains_vsms_participant");
        a.n(sam.g, "earliest_reminder_trigger_time");
        a.n(wsv.a, "scheduled_messages_count");
        a.n(ugz.b, "unread_message_count");
        wtb b = ScheduledSendTable.b().b();
        Object obj = ScheduledSendTable.d.d;
        Object obj2 = lcd.b.e;
        wte wteVar = new wte();
        wteVar.W(wam.M((agmh) lcd.b.e));
        agog q = b.q((agmh) obj, (agmh) obj2, new agpw(wteVar));
        q.f = "scheduled_send_nudge";
        a.D(q.a());
        if (ofn.a()) {
            taa taaVar = new taa(tac.a);
            taaVar.c((szw) tac.d.a);
            agog b2 = agoh.b(taaVar.b(), (agmh) tac.d.a, (agmh) lcd.b.e);
            b2.f = "parental_approval_join_tag";
            a.D(b2.a());
        }
        if (abal.c()) {
            tgm b3 = tgr.a().b();
            Object obj3 = tgr.d.b;
            Object obj4 = lcd.b.e;
            tgq tgqVar = new tgq();
            nei neiVar = lcd.b;
            tgqVar.W(wam.L((agmh) neiVar.e, (agmh) neiVar.a, xnvVar));
            agog q2 = b3.q((agmh) obj3, (agmh) obj4, new agpw(tgqVar));
            q2.f = "reminder_nudge";
            a.D(q2.a());
        }
        sty b4 = sub.a().b();
        Object obj5 = sub.d.c;
        Object obj6 = lcd.b.c;
        sua suaVar = new sua();
        suaVar.b(aqaz.NUDGE_CLASSIFICATION);
        nei neiVar2 = lcd.b;
        suaVar.W(wam.J((agmh) neiVar2.a, (agmh) neiVar2.d, yiyVar, xnvVar));
        agog q3 = b4.q((agmh) obj5, (agmh) obj6, new agpw(suaVar));
        q3.f = "nudge_classification";
        a.D(q3.a());
        sjr b5 = sjv.a().b();
        Object obj7 = sjv.d.e;
        Object obj8 = lcd.b.e;
        sju sjuVar = new sju();
        sjuVar.c(qhy.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY);
        sjuVar.b(qhx.CONVERSATION_CLASSIFICATION_STATE_DISMISSED);
        sjuVar.W(wam.K((agmh) lcd.b.e, xnvVar, yiyVar));
        agog q4 = b5.q((agmh) obj7, (agmh) obj8, new agpw(sjuVar));
        q4.f = "conversation_classification_type";
        a.D(q4.a());
        if (uyh.a()) {
            a.a.m = true;
        }
        a.o(sam.e, sam.d);
        String str2 = sam.c;
        if (((Boolean) ((utz) ier.i.get()).e()).booleanValue()) {
            str = sam.b;
        } else {
            str = "0";
        }
        a.o(str2, str);
        if (uzz.d()) {
            a.n(uze.a, "conversation_contains_matrix_participant");
        }
        a.k(new agpw(lccVar));
        if (z) {
            a.c(new atkn((agmh) lcd.b.b), new atkn((agmh) lcd.b.e));
        } else if (yig.d()) {
            Object obj9 = lcd.b.b;
            nei neiVar3 = lcd.b;
            agmh agmhVar = (agmh) obj9;
            wam.H(a, false, yiyVar, xnvVar, agmhVar, (agmh) neiVar3.d, (agmh) neiVar3.e, (agmh) lcz.c.d);
        } else {
            nei neiVar4 = lcd.b;
            a.c(new atkn((agmh) lcd.b.f), new atkn((agmh) neiVar4.b), new atkn((agmh) neiVar4.e));
        }
        a.w("Bugle.D26R.Query.SuperSortQueryPaged.Duration");
        return a.b();
    }

    private final lcx h(lcq lcqVar, xnv xnvVar) {
        lcx i = i(lcqVar, 1, xnvVar);
        f(i, lcqVar, xnvVar);
        return i;
    }

    private final lcx i(lcq lcqVar, int i, xnv xnvVar) {
        lcx e = e();
        e.u(lcqVar.e);
        if (i == 1) {
            return lga.w(e, lcqVar.f, lcqVar.d, xnvVar);
        }
        return lga.x(e, lcqVar.f, lcqVar.d, xnvVar);
    }

    public final lca a(lcq lcqVar, xnv xnvVar) {
        return g(i(lcqVar, 2, xnvVar).b(), lcqVar.f, lcqVar.d, xnvVar);
    }

    public final lca b(lcq lcqVar, xnv xnvVar) {
        long j = lcqVar.a;
        lcx i = i(lcqVar, 2, xnvVar);
        ConversationIdType conversationIdType = lcqVar.b;
        if (lcqVar.d) {
            i.f(new lce(j, conversationIdType, 0));
        } else {
            boolean z = lcqVar.c;
            if (yig.d()) {
                i.f(new ldj(z, lga.y(lcqVar, "<", xnvVar), lga.y(lcqVar, "=", xnvVar), conversationIdType, 1));
            } else {
                i.f(new lcf(z, j, conversationIdType, 1));
            }
        }
        return g(i.b(), lcqVar.f, lcqVar.d, xnvVar);
    }

    public final lca c(lcq lcqVar, xnv xnvVar) {
        lcx i;
        lcp lcpVar = new lcp(lcqVar);
        int i2 = lcqVar.e;
        int i3 = i2 / 2;
        lcpVar.e(i3);
        lcx h = h(lcpVar.a(), xnvVar);
        lcp lcpVar2 = new lcp(lcqVar);
        lcpVar2.e(i2 - i3);
        lcq a = lcpVar2.a();
        if (a.d) {
            i = i(a, 2, xnvVar);
            i.f(new kza(a, 6));
        } else if (yig.d()) {
            agpj y = lga.y(a, "<=", xnvVar);
            lcx i4 = i(a, 2, xnvVar);
            lcy lcyVar = new lcy();
            int i5 = 7;
            lcyVar.b(new kza(a, i5), new ivj(a, y, i5));
            i4.e(lcyVar);
            i = i4;
        } else {
            i = i(a, 2, xnvVar);
            i.f(new kza(a, 9));
        }
        h.p(i.b());
        return g(h.b(), lcqVar.f, lcqVar.d, xnvVar);
    }

    public final lca d(lcq lcqVar, xnv xnvVar) {
        return g(h(lcqVar, xnvVar).b(), lcqVar.f, lcqVar.d, xnvVar);
    }

    public final lcx e() {
        lcx lcxVar = new lcx(lcz.a);
        lcxVar.w("newInnerQueryBuilderNoLimitNoOrder");
        int i = 1;
        lcxVar.c((lcu) lcz.c.c);
        lcy lcyVar = new lcy();
        lcyVar.f();
        if (d.af(this.a)) {
            lcyVar.e(tqc.ARCHIVED, tqc.KEEP_ARCHIVED);
        }
        if (d.af(this.b)) {
            lcyVar.c(tqc.UNARCHIVED);
        }
        if (d.af(this.c)) {
            if (yqt.a().booleanValue()) {
                lcyVar.d(tqc.g);
            } else {
                lcyVar.e(tqc.SPAM_FOLDER, tqc.BLOCKED_FOLDER);
            }
        }
        if (d.af(this.d)) {
            lcyVar.g();
        }
        if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && d.af(this.e)) {
            lcyVar.b(new koa(20), new lcw(i));
        }
        if (oec.a() && d.af(this.f)) {
            lcyVar.b(new koa(18), new koa(19));
        }
        lcxVar.e(lcyVar);
        if (uyh.a()) {
            lcxVar.d();
        }
        lcxVar.t((agmh) lcz.c.c);
        return lcxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lci) {
            lci lciVar = (lci) obj;
            Boolean bool = this.a;
            if (bool != null ? bool.equals(lciVar.a) : lciVar.a == null) {
                Boolean bool2 = this.b;
                if (bool2 != null ? bool2.equals(lciVar.b) : lciVar.b == null) {
                    Boolean bool3 = this.c;
                    if (bool3 != null ? bool3.equals(lciVar.c) : lciVar.c == null) {
                        Boolean bool4 = this.d;
                        if (bool4 != null ? bool4.equals(lciVar.d) : lciVar.d == null) {
                            Boolean bool5 = this.e;
                            if (bool5 != null ? bool5.equals(lciVar.e) : lciVar.e == null) {
                                Boolean bool6 = this.f;
                                Boolean bool7 = lciVar.f;
                                if (bool6 != null ? bool6.equals(bool7) : bool7 == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        Boolean bool = this.a;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        Boolean bool2 = this.b;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        Boolean bool3 = this.c;
        if (bool3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool3.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        Boolean bool4 = this.d;
        if (bool4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool4.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        Boolean bool5 = this.e;
        if (bool5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool5.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        Boolean bool6 = this.f;
        if (bool6 != null) {
            i = bool6.hashCode();
        }
        return i5 ^ i;
    }

    public final String toString() {
        return "HomeScreenQueryBuilder{whereArchived=" + this.a + ", whereNotArchived=" + this.b + ", whereSpam=" + this.c + ", whereNotRbm=" + this.d + ", whereNotPenpal=" + this.e + ", whereNotEmergencySos=" + this.f + "}";
    }

    public lci(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = bool4;
        this.e = bool5;
        this.f = bool6;
    }
}
