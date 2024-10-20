package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ush {
    public ush() {
    }

    public static /* synthetic */ String a(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "WORKER_ABANDONED";
                }
                return "INTERRUPTED";
            }
            return "SCHEDULED_FUTURE_WORK";
        }
        return "ALL_WORK_COMPLETE";
    }

    public static final int c() {
        ura uraVar = new ura(urd.a);
        uraVar.w("WorkQueueWorkManagerScheduler#getRowCount");
        return uraVar.b().i();
    }

    public static sla d(ConversationIdType conversationIdType) {
        sla a = sld.a();
        a.w("createParticipantIdQueryBuilder");
        a.f(new rpf(conversationIdType, 16));
        return a;
    }

    public static smm e(ConversationIdType conversationIdType) {
        smm smmVar = new smm(smp.a);
        smmVar.w("createParticipantIdFromConversationToParticipantsTableQueryBuilder");
        smmVar.e(new rpf(conversationIdType, 18));
        return smmVar;
    }

    public static tay f(sml smlVar) {
        taz e = ParticipantsTable.e();
        e.w("createParticipantsTableQuery");
        e.g(new rpf(smlVar, 19));
        e.z(p());
        return e.b();
    }

    public static tay g(ConversationIdType conversationIdType) {
        return l(conversationIdType, false);
    }

    public static tay h(ConversationIdType conversationIdType) {
        if (ody.a()) {
            tay m = m();
            smm e = e(conversationIdType);
            e.e(new rpf(m, 17));
            e.d(new rrv(19));
            return f(e.b());
        }
        sla d = d(conversationIdType);
        d.d(new rrv(20));
        return k(d.b());
    }

    public static tay i(ConversationIdType conversationIdType) {
        return l(conversationIdType, true);
    }

    public static agmh[] j() {
        return (agmh[]) rmz.e.c;
    }

    private static tay k(skz skzVar) {
        taz e = ParticipantsTable.e();
        e.w("createParticipantsTableQuery");
        e.g(new rsc(skzVar, 0));
        e.z(p());
        return e.b();
    }

    private static tay l(ConversationIdType conversationIdType, boolean z) {
        tay m = m();
        if (ody.a()) {
            smm e = e(conversationIdType);
            e.d(new rsb(5));
            e.p(m);
            sml b = e.b();
            if (oez.a()) {
                taz e2 = ParticipantsTable.e();
                e2.w("createParticipantsTableQuery");
                e2.g(new rsc(b, 1));
                if (oez.a() && z) {
                    tdj a = ProfilesTable.a();
                    a.c(new rsb(4));
                    agog b2 = agoh.b(a.b(), (agmh) ProfilesTable.c.b, ParticipantsTable.c.a);
                    b2.f = "profiles_table_join_tag";
                    e2.D(b2.a());
                    e2.y(n());
                } else {
                    e2.z(p());
                }
                return e2.b();
            }
            return f(b);
        }
        sla d = d(conversationIdType);
        d.d(new rsb(6));
        d.p(m);
        skz b3 = d.b();
        if (oez.a()) {
            taz e3 = ParticipantsTable.e();
            e3.w("createParticipantsTableQuery");
            e3.g(new rpf(b3, 20));
            if (oez.a() && z) {
                tdj a2 = ProfilesTable.a();
                a2.c(new rsb(3));
                agog b4 = agoh.b(a2.b(), (agmh) ProfilesTable.c.b, ParticipantsTable.c.a);
                b4.f = "profiles_table_join_tag";
                e3.D(b4.a());
                e3.y(n());
            } else {
                e3.z(p());
            }
            return e3.b();
        }
        return k(b3);
    }

    private static tay m() {
        taz e = ParticipantsTable.e();
        e.w("ConversationParticipantsQueryFactory#createQuery");
        e.e(new rsb(0));
        e.g(new rsb(2));
        return e.b();
    }

    private static agpj n() {
        tas tasVar = ParticipantsTable.c.m;
        tas tasVar2 = ParticipantsTable.c.m;
        Object obj = ProfilesTable.c.i;
        Object obj2 = ProfilesTable.c.i;
        tas tasVar3 = ParticipantsTable.c.g;
        return new agpk("(NULLIF($V, '') ISNULL), NULLIF($V, ''),(NULLIF($V{J:profiles_table_join_tag}, '') ISNULL),NULLIF($V{J:profiles_table_join_tag}, ''),(NULLIF($V, '') ISNULL), NULLIF($V, '')", new Object[]{tasVar, tasVar2, obj, obj2, tasVar3, tasVar3});
    }

    private static String o(tas tasVar) {
        return aglo.n(new agpk("(NULLIF($V, '') ISNULL), NULLIF($V, '')", new Object[]{tasVar, tasVar}));
    }

    private static /* synthetic */ String p() {
        return o(ParticipantsTable.c.m) + "," + o(ParticipantsTable.c.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arqr r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ure
            if (r0 == 0) goto L13
            r0 = r8
            ure r0 = (defpackage.ure) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ure r0 = new ure
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.a
            arsb r7 = r0.e
            arsb r0 = r0.d
            defpackage.aqil.P(r8)
            goto L55
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.aqil.P(r8)
            arsb r8 = new arsb
            r8.<init>()
            long r4 = defpackage.arut.a
            long r4 = java.lang.System.nanoTime()
            r0.d = r8
            r0.e = r8
            r0.a = r4
            r0.c = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 == r1) goto L82
            r0 = r8
            r1 = r4
            r8 = r7
            r7 = r0
        L55:
            r7.a = r8
            long r7 = java.lang.System.nanoTime()
            long r7 = r7 - r1
            aruv r1 = defpackage.aruv.a
            long r7 = defpackage.arsd.p(r7, r1)
            urg r1 = new urg
            java.lang.Object r0 = r0.a
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = defpackage.aqjn.aE(r0)
            long r2 = defpackage.arut.h(r7)
            int r7 = defpackage.arut.d(r7)
            long r7 = (long) r7
            j$.time.Duration r7 = j$.time.Duration.ofSeconds(r2, r7)
            r7.getClass()
            r1.<init>(r0, r7)
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ush.b(arqr, arpe):java.lang.Object");
    }

    public ush(armf armfVar) {
        armfVar.getClass();
    }
}
