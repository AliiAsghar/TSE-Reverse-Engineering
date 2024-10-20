package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tpd implements agne {
    private final /* synthetic */ int a;

    @Override // defpackage.agne
    public final void a(int i, agnw agnwVar) {
        switch (this.a) {
            case 0:
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = tpi.a;
                valueOf.getClass();
                if (i != 29120) {
                    return;
                }
                tpi.b(agnwVar);
                return;
            case 1:
                Integer valueOf2 = Integer.valueOf(i);
                String[] strArr2 = tow.a;
                valueOf2.getClass();
                if (i != 33080) {
                    return;
                }
                tow.a(agnwVar);
                return;
            case 2:
                Integer valueOf3 = Integer.valueOf(i);
                String[] strArr3 = tps.a;
                valueOf3.getClass();
                if (i != 29110) {
                    return;
                }
                tps.c(agnwVar);
                return;
            case 3:
                Integer valueOf4 = Integer.valueOf(i);
                String[] strArr4 = VmtTable.a;
                valueOf4.getClass();
                if (i != 58990) {
                    return;
                }
                VmtTable.b(agnwVar);
                return;
            case 4:
                Integer valueOf5 = Integer.valueOf(i);
                String[] strArr5 = uqb.a;
                valueOf5.getClass();
                switch (i) {
                    case 39060:
                        uqb.b(agnwVar, 39060);
                        return;
                    case 41030:
                        agnwVar.z("ALTER TABLE work_queue ADD COLUMN queue TEXT;");
                        agnwVar.z("CREATE INDEX index_work_queue_queue ON work_queue(queue);");
                        return;
                    case 42050:
                        agnwVar.z("ALTER TABLE work_queue ADD COLUMN deduplication_tag TEXT;");
                        agnwVar.z("CREATE INDEX index_work_queue_deduplication_tag ON work_queue(deduplication_tag);");
                        return;
                    case 45030:
                        agnwVar.z("ALTER TABLE work_queue ADD COLUMN scheduled_in_workmanager INT;");
                        return;
                    case 46060:
                        agnwVar.z("ALTER TABLE work_queue ADD COLUMN workmanager_id TEXT;");
                        return;
                    case 46070:
                        agnwVar.z("ALTER TABLE work_queue ADD COLUMN minimum_start_time INT;");
                        return;
                    case 48020:
                        agnwVar.z("ALTER TABLE work_queue ADD COLUMN cancellation_tag TEXT;");
                        return;
                    case 58270:
                        agnwVar.z("DROP INDEX IF EXISTS index_work_queue_type");
                        agnwVar.z("CREATE INDEX index_work_queue_type ON work_queue(type);");
                        agnwVar.z("DROP INDEX IF EXISTS index_work_queue_scheduled_in_workmanager");
                        agnwVar.z("CREATE INDEX index_work_queue_scheduled_in_workmanager ON work_queue(scheduled_in_workmanager);");
                        agnwVar.z("DROP INDEX IF EXISTS queue_time");
                        agnwVar.z("CREATE INDEX queue_time ON work_queue(queue, minimum_start_time);");
                        return;
                    default:
                        return;
                }
            case 5:
                Integer valueOf6 = Integer.valueOf(i);
                String[] strArr6 = urd.a;
                valueOf6.getClass();
                if (i != 59390) {
                    return;
                }
                agnc.F(agnwVar, "work_queue_work_manager_ids", urd.c("TEMP___work_queue_work_manager_ids"), urd.a, urd.b(59390));
                return;
            case 6:
                Integer valueOf7 = Integer.valueOf(i);
                String[] strArr7 = urd.a;
                valueOf7.getClass();
                if (i != 59330) {
                    if (i != 59400) {
                        return;
                    }
                    agnwVar.z("DROP INDEX IF EXISTS index_work_queue_work_manager_ids_workmanager_id");
                    agnwVar.z("CREATE INDEX index_work_queue_work_manager_ids_workmanager_id ON work_queue_work_manager_ids(workmanager_id) WHERE workmanager_id IS NULL;");
                    return;
                }
                urd.a(agnwVar, 59330);
                return;
            case 7:
                Integer valueOf8 = Integer.valueOf(i);
                String[] strArr8 = ScheduledSendTable.a;
                valueOf8.getClass();
                switch (i) {
                    case 52040:
                        ScheduledSendTable.c(agnwVar, 52040);
                        return;
                    case 58020:
                        agnwVar.z("ALTER TABLE scheduled_send ADD COLUMN creation_time INTEGER DEFAULT(0) NOT NULL;");
                        return;
                    case 58170:
                        agnwVar.z("DROP INDEX IF EXISTS index_scheduled_send_conversation_id");
                        agnwVar.z("CREATE INDEX index_scheduled_send_conversation_id ON scheduled_send(conversation_id);");
                        return;
                    case 58290:
                        agnwVar.z("DROP INDEX IF EXISTS index_status_time");
                        agnwVar.z("CREATE INDEX index_status_time ON scheduled_send(status, scheduled_time);");
                        return;
                    default:
                        return;
                }
            case 8:
                Integer valueOf9 = Integer.valueOf(i);
                String[] strArr9 = xpf.a;
                valueOf9.getClass();
                switch (i) {
                    case 52060:
                        xpf.e(agnwVar, 52060);
                        return;
                    case 55030:
                        agnwVar.z("ALTER TABLE file_transfer ADD COLUMN file_information BLOB;");
                        agnwVar.z("ALTER TABLE file_transfer ADD COLUMN transfer_handle TEXT;");
                        return;
                    case 56040:
                        agnwVar.z("ALTER TABLE file_transfer ADD COLUMN opaque_data BLOB;");
                        return;
                    case 58450:
                        agnwVar.z("DROP INDEX IF EXISTS index_file_transfer_transfer_id");
                        agnwVar.z("CREATE INDEX index_file_transfer_transfer_id ON file_transfer(transfer_id);");
                        return;
                    case 59910:
                        agnwVar.z("ALTER TABLE file_transfer ADD COLUMN thumbnail_information BLOB;");
                        return;
                    default:
                        return;
                }
            default:
                Integer valueOf10 = Integer.valueOf(i);
                String[] strArr10 = yoc.a;
                valueOf10.getClass();
                if (i != 59460) {
                    return;
                }
                yoc.a(agnwVar);
                return;
        }
    }
}
