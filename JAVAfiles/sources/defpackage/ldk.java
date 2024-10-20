package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public abstract class ldk {
    public static void l(lcx lcxVar, lcq lcqVar, xnv xnvVar) {
        if (lcqVar.d) {
            lcxVar.f(new kza(lcqVar, 20));
        } else if (yig.d()) {
            lcxVar.f(new kzr(lcqVar, lga.y(lcqVar, ">", xnvVar), lga.y(lcqVar, "=", xnvVar), 7));
        } else {
            lcxVar.f(new ldg(lcqVar, 1));
        }
    }

    private final lcx m(lcq lcqVar, xnv xnvVar) {
        lcx o = o(lcqVar, 1, xnvVar);
        l(o, lcqVar, xnvVar);
        return o;
    }

    private static ldc n(lcv lcvVar, yiy yiyVar, boolean z, xnv xnvVar) {
        String str;
        lde ldeVar = new lde();
        ldeVar.U(new agme("conversations._id", 3, lcvVar));
        ldd a = ldf.a();
        a.w("makeBuilder");
        a.n(sam.f, "conversation_contains_vsms_participant");
        a.n(sam.g, "earliest_reminder_trigger_time");
        a.n(wsv.a, "scheduled_messages_count");
        a.n(ugz.b, "unread_message_count");
        wtb b = ScheduledSendTable.b().b();
        Object obj = ScheduledSendTable.d.d;
        Object obj2 = ldf.b.g;
        wte wteVar = new wte();
        wteVar.W(wam.M((agmh) ldf.b.g));
        agog q = b.q((agmh) obj, (agmh) obj2, new agpw(wteVar));
        q.f = "scheduled_send_nudge";
        a.D(q.a());
        if (ody.a()) {
            sml b2 = new smm(smp.a).b();
            Object obj3 = smp.d.a;
            Object obj4 = ldf.b.g;
            smo smoVar = new smo();
            smoVar.W(new agpk("$V = 0 AND $V = $V{J:one_on_one_to}", new Object[]{sni.c.O, sni.c.a, smp.d.a}));
            agog q2 = b2.q((agmh) obj3, (agmh) obj4, new agpw(smoVar));
            q2.f = "one_on_one_to";
            agoh a2 = q2.a();
            agog b3 = agoh.b(ParticipantsTable.e().b(), ParticipantsTable.c.a, (agmh) ldf.b.d);
            tbd tbdVar = new tbd();
            tbdVar.U(new agme("participants._id", 1, new agpk("$V{J:one_on_one_to}", new Object[]{smp.d.c})));
            b3.e = new tbc(tbdVar);
            b3.c();
            b3.f = "one_on_one_to_participant";
            agoh a3 = b3.a();
            agog b4 = agoh.b(ProfilesTable.a().b(), (agmh) ProfilesTable.c.a, (agmh) ldf.b.d);
            tdm tdmVar = new tdm();
            tdmVar.U(new agme("profiles_table.participant_id", 1, new agpk("$V{J:one_on_one_to}", new Object[]{smp.d.c})));
            b4.e = new tdl(tdmVar);
            b4.c();
            b4.f = "one_on_one_to_profile";
            agoh a4 = b4.a();
            a.D(a2);
            a.D(a3);
            a.D(a4);
        }
        if (ofn.a()) {
            taa taaVar = new taa(tac.a);
            taaVar.c((szw) tac.d.a);
            agog b5 = agoh.b(taaVar.b(), (agmh) tac.d.a, (agmh) ldf.b.g);
            b5.f = "parental_approval_join_tag";
            a.D(b5.a());
        }
        if (abal.c()) {
            tgm b6 = tgr.a().b();
            Object obj5 = tgr.d.b;
            Object obj6 = ldf.b.g;
            tgq tgqVar = new tgq();
            jat jatVar = ldf.b;
            tgqVar.W(wam.L((agmh) jatVar.g, (agmh) jatVar.f, xnvVar));
            agog q3 = b6.q((agmh) obj5, (agmh) obj6, new agpw(tgqVar));
            q3.f = "reminder_nudge";
            a.D(q3.a());
        }
        sty b7 = sub.a().b();
        Object obj7 = sub.d.c;
        Object obj8 = ldf.b.c;
        sua suaVar = new sua();
        suaVar.b(aqaz.NUDGE_CLASSIFICATION);
        jat jatVar2 = ldf.b;
        suaVar.W(wam.J((agmh) jatVar2.f, (agmh) jatVar2.a, yiyVar, xnvVar));
        agog q4 = b7.q((agmh) obj7, (agmh) obj8, new agpw(suaVar));
        q4.f = "nudge_classification";
        a.D(q4.a());
        sjr b8 = sjv.a().b();
        Object obj9 = sjv.d.e;
        Object obj10 = ldf.b.g;
        sju sjuVar = new sju();
        sjuVar.c(qhy.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY);
        sjuVar.b(qhx.CONVERSATION_CLASSIFICATION_STATE_DISMISSED);
        sjuVar.W(wam.K((agmh) ldf.b.g, xnvVar, yiyVar));
        agog q5 = b8.q((agmh) obj9, (agmh) obj10, new agpw(sjuVar));
        q5.f = "conversation_classification_type";
        a.D(q5.a());
        if (uyh.a()) {
            a.a.m = true;
        }
        a.o(sam.e, sam.d);
        String str2 = sam.c;
        if (((Boolean) ((utz) ier.i.get()).e()).booleanValue()) {
            str = sam.a;
        } else {
            str = "0";
        }
        a.o(str2, str);
        if (uzz.d()) {
            a.n(uze.a, "conversation_contains_matrix_participant");
        }
        a.k(new agpw(ldeVar));
        if (z) {
            a.c(new atkn((agmh) ldf.b.b), new atkn((agmh) ldf.b.g));
        } else if (yig.d()) {
            Object obj11 = ldf.b.b;
            jat jatVar3 = ldf.b;
            Object obj12 = jatVar3.a;
            agmh agmhVar = (agmh) obj12;
            agmh agmhVar2 = (agmh) obj11;
            wam.H(a, false, yiyVar, xnvVar, agmhVar2, agmhVar, (agmh) jatVar3.g, (agmh) lcz.c.d);
        } else {
            jat jatVar4 = ldf.b;
            a.c(new atkn((agmh) ldf.b.e), new atkn((agmh) jatVar4.b), new atkn((agmh) jatVar4.g));
        }
        a.w("Bugle.D26R.Query.SuperSortQueryPaged.Duration");
        return a.b();
    }

    private final lcx o(lcq lcqVar, int i, xnv xnvVar) {
        lcx g = g();
        g.u(lcqVar.e);
        if (i == 1) {
            return lga.w(g, lcqVar.f, lcqVar.d, xnvVar);
        }
        return lga.x(g, lcqVar.f, lcqVar.d, xnvVar);
    }

    public abstract Boolean a();

    public abstract Boolean b();

    public abstract Boolean c();

    public abstract Boolean d();

    public abstract Boolean e();

    public abstract Boolean f();

    public final lcx g() {
        lcx lcxVar = new lcx(lcz.a);
        lcxVar.w("newInnerQueryBuilderNoLimitNoOrder");
        lcxVar.c((lcu) lcz.c.c);
        lcy lcyVar = new lcy();
        lcyVar.f();
        if (d.af(a())) {
            lcyVar.e(tqc.ARCHIVED, tqc.KEEP_ARCHIVED);
        }
        if (d.af(b())) {
            lcyVar.c(tqc.UNARCHIVED);
        }
        if (d.af(f())) {
            if (yqt.a().booleanValue()) {
                lcyVar.d(tqc.g);
            } else {
                lcyVar.e(tqc.SPAM_FOLDER, tqc.BLOCKED_FOLDER);
            }
        }
        if (d.af(e())) {
            lcyVar.g();
        }
        if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && d.af(d())) {
            lcyVar.b(new lcw(5), new lcw(6));
        }
        if (oec.a() && d.af(c())) {
            lcyVar.b(new lcw(7), new lcw(8));
        }
        lcxVar.e(lcyVar);
        if (uyh.a()) {
            lcxVar.d();
        }
        lcxVar.t((agmh) lcz.c.c);
        return lcxVar;
    }

    public final ldc h(lcq lcqVar, xnv xnvVar) {
        return n(o(lcqVar, 2, xnvVar).b(), lcqVar.f, lcqVar.d, xnvVar);
    }

    public final ldc i(lcq lcqVar, xnv xnvVar) {
        long j = lcqVar.a;
        lcx o = o(lcqVar, 2, xnvVar);
        ConversationIdType conversationIdType = lcqVar.b;
        if (lcqVar.d) {
            o.f(new lce(j, conversationIdType, 4));
        } else {
            boolean z = lcqVar.c;
            if (yig.d()) {
                o.f(new ldj(z, lga.y(lcqVar, "<", xnvVar), lga.y(lcqVar, "=", xnvVar), conversationIdType, 0));
            } else {
                o.f(new lcf(z, j, conversationIdType, 3));
            }
        }
        return n(o.b(), lcqVar.f, lcqVar.d, xnvVar);
    }

    public final ldc j(lcq lcqVar, xnv xnvVar) {
        lcx o;
        lcp lcpVar = new lcp(lcqVar);
        int i = lcqVar.e;
        int i2 = i / 2;
        lcpVar.e(i2);
        lcx m = m(lcpVar.a(), xnvVar);
        lcp lcpVar2 = new lcp(lcqVar);
        lcpVar2.e(i - i2);
        lcq a = lcpVar2.a();
        if (a.d) {
            o = o(a, 2, xnvVar);
            o.f(new ldg(a, 11));
        } else if (yig.d()) {
            agpj y = lga.y(a, "<=", xnvVar);
            lcx o2 = o(a, 2, xnvVar);
            lcy lcyVar = new lcy();
            int i3 = 12;
            lcyVar.b(new ldg(a, i3), new ivj(a, y, i3));
            o2.e(lcyVar);
            o = o2;
        } else {
            o = o(a, 2, xnvVar);
            o.f(new ldg(a, 13));
        }
        m.p(o.b());
        return n(m.b(), lcqVar.f, lcqVar.d, xnvVar);
    }

    public final ldc k(lcq lcqVar, xnv xnvVar) {
        return n(m(lcqVar, xnvVar).b(), lcqVar.f, lcqVar.d, xnvVar);
    }
}
