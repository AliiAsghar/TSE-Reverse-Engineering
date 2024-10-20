package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rqd extends arrp implements arqg {
    final /* synthetic */ rqg a;
    final /* synthetic */ lrf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqd(lrf lrfVar, rqg rqgVar) {
        super(0);
        this.b = lrfVar;
        this.a = rqgVar;
    }

    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        String str;
        lrf lrfVar = this.b;
        ((rph) lrfVar.a).b();
        if (!((rpl) lrfVar.b).a) {
            str = "BatchedMessageRestoreTableWriter.kt";
        } else {
            int i = aruw.a;
            long b = aruw.b();
            umx.f();
            agof agofVar = new agof("restore_workflow_scratch_timestamps", "$primary");
            ifq ifqVar = tjz.c;
            agofVar.b((agmh) ifqVar.a, (agmh) ifqVar.d, (agmh) ifqVar.b, (agmh) ifqVar.c);
            rnk a = rnm.a();
            a.c(rnm.c.a);
            a.n(new agpk("$V", new Object[]{Integer.valueOf(tpz.b.ordinal())}), "which_database");
            a.n(new agpk("$V/1000", new Object[]{rnm.c.m}), "timestamp_in_seconds");
            a.n(new agpk("$V % 1000", new Object[]{rnm.c.m}), "timestamp_mod_1000");
            agofVar.c = a.b();
            agofVar.a().a();
            agof agofVar2 = new agof("restore_workflow_scratch_timestamps", "$primary");
            agofVar2.d = 5;
            ifq ifqVar2 = tjz.c;
            agofVar2.b((agmh) ifqVar2.a, (agmh) ifqVar2.d, (agmh) ifqVar2.b, (agmh) ifqVar2.c);
            sxy d = MessagesTable.d();
            d.c(MessagesTable.c.a);
            d.n(new agpk("$V", new Object[]{Integer.valueOf(tpz.a.ordinal())}), "which_database");
            d.n(new agpk("$V/1000", new Object[]{MessagesTable.c.i}), "timestamp_in_seconds");
            d.n(new agpk("$V % 1000", new Object[]{MessagesTable.c.i}), "timestamp_mod_1000");
            agofVar2.c = d.b();
            agofVar2.a().a();
            agof agofVar3 = new agof("restore_workflow_scratch_suffix", "$primary");
            agofVar3.d = 5;
            uqg uqgVar = tjr.c;
            agofVar3.b((agmh) uqgVar.c, (agmh) uqgVar.d, (agmh) uqgVar.b);
            roz a2 = rpb.a();
            a2.c((rou) rpb.e.j);
            a2.n(new agpk("$V", new Object[]{Integer.valueOf(tpz.b.ordinal())}), "which_database");
            tby tbyVar = rpb.e;
            Object obj = tbyVar.h;
            Object obj2 = tbyVar.g;
            a2.n(new agpk("CASE WHEN $V <> 0 THEN 'self' WHEN $V LIKE '%@%' THEN $V ELSE substr($V, -7) END", new Object[]{obj, obj2, obj2, obj2}), "destination_suffix");
            agofVar3.c = a2.b();
            agofVar3.a().a();
            agof agofVar4 = new agof("restore_workflow_scratch_suffix", "$primary");
            uqg uqgVar2 = tjr.c;
            agofVar4.b((agmh) uqgVar2.c, (agmh) uqgVar2.d, (agmh) uqgVar2.b);
            taz e = ParticipantsTable.e();
            e.c(ParticipantsTable.c.a);
            e.n(new agpk("$V", new Object[]{Integer.valueOf(tpz.a.ordinal())}), "which_database");
            tas tasVar = ParticipantsTable.c.d;
            tas tasVar2 = ParticipantsTable.c.f;
            e.n(new agpk("CASE WHEN $V <> $V THEN 'self'  WHEN $V LIKE '%@%' THEN $V ELSE substr($V, -7) END", new Object[]{tasVar, -2, tasVar2, tasVar2, tasVar2}), "destination_suffix");
            agofVar4.c = e.b();
            agofVar4.a().a();
            agof agofVar5 = new agof("restore_workflow_scratch_duplicates", "$primary");
            uqg uqgVar3 = tji.c;
            agofVar5.b((agmh) uqgVar3.d, (agmh) uqgVar3.b, (agmh) uqgVar3.c);
            tjx tjxVar = new tjx(tjz.a);
            tjxVar.s();
            tjxVar.n(new agpk("$V", new Object[]{Integer.valueOf(tjj.a.ordinal())}), "key");
            tjxVar.n(new agpk("$V", new Object[]{tjz.c.a}), "backup_id");
            tjxVar.n(new agpk("$V{bugle_scratch}", new Object[]{tjz.c.a}), "bugle_id");
            tjxVar.c(new rqr(7));
            tjx tjxVar2 = new tjx(tjz.a);
            tjxVar2.s();
            tjxVar2.c(new rqr(8));
            tjw b2 = tjxVar2.b();
            agmh agmhVar = (agmh) tjz.c.b;
            agog b3 = agoh.b(b2, agmhVar, agmhVar);
            b3.f = "bugle_scratch";
            agofVar5.c = ((tjx) tjxVar.j(b3)).b();
            agofVar5.a().a();
            agof agofVar6 = new agof("restore_workflow_scratch_duplicates", "$primary");
            uqg uqgVar4 = tji.c;
            agofVar6.b((agmh) uqgVar4.d, (agmh) uqgVar4.b, (agmh) uqgVar4.c);
            tjg tjgVar = new tjg(tji.a);
            tjgVar.c(new rqr(0));
            tjgVar.s();
            tjgVar.n(new agpk("$V", new Object[]{Integer.valueOf(tjj.b.ordinal())}), "key");
            tjgVar.n(new agpk("$V", new Object[]{tji.c.b}), "backup_id");
            tjgVar.n(new agpk("$V", new Object[]{tji.c.c}), "bugle_id");
            tbs d2 = PartsTable.d();
            d2.s();
            d2.g(new rqr(4));
            agog b4 = agoh.b(d2.b(), PartsTable.d.b, (agmh) tji.c.c);
            b4.f = "bugle_parts";
            tjg tjgVar2 = (tjg) tjgVar.j(b4);
            rnv a3 = rnx.a();
            a3.s();
            a3.c(new rqr(5));
            agog b5 = agoh.b(a3.b(), (agmh) rnx.e.e, (agmh) tji.c.b);
            b5.f = "backup_parts";
            tjg tjgVar3 = (tjg) tjgVar2.j(b5);
            tjgVar3.c(new rqr(6));
            agofVar6.c = tjgVar3.b();
            agofVar6.a().a();
            agof agofVar7 = new agof("restore_workflow_scratch_duplicates", "$primary");
            uqg uqgVar5 = tji.c;
            agofVar7.b((agmh) uqgVar5.d, (agmh) uqgVar5.b, (agmh) uqgVar5.c);
            tjg tjgVar4 = new tjg(tji.a);
            tjgVar4.c(new rqr(9));
            tjgVar4.s();
            tjgVar4.n(new agpk("$V", new Object[]{Integer.valueOf(tjj.c.ordinal())}), "key");
            tjgVar4.n(new agpk("$V", new Object[]{tji.c.b}), "backup_id");
            tjgVar4.n(new agpk("$V", new Object[]{tji.c.c}), "bugle_id");
            sxy d3 = MessagesTable.d();
            d3.s();
            tjp tjpVar = new tjp(tjr.a);
            tjpVar.s();
            tjpVar.c(new rqr(10));
            agog b6 = agoh.b(tjpVar.b(), (agmh) tjr.c.c, MessagesTable.c.c);
            b6.f = "bugle_destination_suffix";
            agog b7 = agoh.b(((sxy) d3.j(b6)).b(), MessagesTable.c.a, (agmh) tji.c.c);
            b7.f = "bugle_messages";
            tjg tjgVar5 = (tjg) tjgVar4.j(b7);
            rnk a4 = rnm.a();
            a4.s();
            tjp tjpVar2 = new tjp(tjr.a);
            tjpVar2.s();
            tjpVar2.c(new rqr(11));
            agog b8 = agoh.b(tjpVar2.b(), (agmh) tjr.c.c, rnm.c.h);
            b8.f = "backup_destination_suffix";
            agog b9 = agoh.b(((rnk) a4.j(b8)).b(), rnm.c.a, (agmh) tji.c.b);
            b9.f = "backup_messages";
            tjg tjgVar6 = (tjg) tjgVar5.j(b9);
            tjgVar6.c(new rqr(12));
            agofVar7.c = tjgVar6.b();
            agofVar7.a().a();
            long b10 = arux.b(b);
            alvw e2 = ((aluw) lrfVar.c).e();
            e2.X(alwp.a, "BugleBackup");
            str = "BatchedMessageRestoreTableWriter.kt";
            ((alvg) e2.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/messages/BatchedMessageRestoreTableWriter", "preRestore", 71, str)).C("[%s] precompute work [%s]ms", rpk.b.a, arut.g(b10));
        }
        lrf lrfVar2 = this.b;
        rqg rqgVar = this.a;
        alvi alviVar = rqg.a;
        ((rph) lrfVar2.a).c((int) ((Number) rqgVar.e.b()).longValue());
        lrf lrfVar3 = this.b;
        if (((rpl) lrfVar3.b).a) {
            alvw g = ((aluw) lrfVar3.c).g();
            g.X(alwp.a, "BugleBackup");
            ((alvg) g.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/messages/BatchedMessageRestoreTableWriter", "postRestore", 87, str)).q("Clearing Messages restore scratch data");
            umx.f();
        }
        return arnb.a;
    }
}
