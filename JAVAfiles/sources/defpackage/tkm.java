package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tkm implements agnn {
    private final /* synthetic */ int a;

    public tkm(int i) {
        this.a = i;
    }

    @Override // defpackage.agnn
    public final String a() {
        switch (this.a) {
            case 0:
                return "self_participants";
            case 1:
                return "satellite_emergency_details";
            case 2:
                return "self_profiles";
            case 3:
                return "settings";
            case 4:
                return "supersort_labels";
            case 5:
                return "trigger_flags";
            case 6:
                return "user_references";
            case 7:
                return "verified_sms_blacklisted_senders";
            case 8:
                return "verified_sms_brands";
            case 9:
                return "verified_sms_senders";
            case 10:
                return "vmt";
            case 11:
                return "work_queue";
            case 12:
                return "work_queue_work_manager_ids";
            case 13:
                return "scheduled_send";
            case 14:
                return "file_transfer";
            default:
                return "spam_logging_ids_table";
        }
    }

    @Override // defpackage.agnn
    public final void b(agnw agnwVar) {
        switch (this.a) {
            case 0:
                tkr.c(agnwVar, Integer.MAX_VALUE);
                return;
            case 1:
                tkf.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 2:
                tky.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 3:
                tlj.a(agnwVar);
                return;
            case 4:
                tnl.b(agnwVar);
                return;
            case 5:
                tnt.a(agnwVar);
                return;
            case 6:
                tom.c(agnwVar);
                return;
            case 7:
                tow.a(agnwVar);
                return;
            case 8:
                tpi.b(agnwVar);
                return;
            case 9:
                tps.c(agnwVar);
                return;
            case 10:
                VmtTable.b(agnwVar);
                return;
            case 11:
                uqb.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 12:
                urd.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 13:
                ScheduledSendTable.c(agnwVar, Integer.MAX_VALUE);
                return;
            case 14:
                xpf.e(agnwVar, Integer.MAX_VALUE);
                return;
            default:
                yoc.a(agnwVar);
                return;
        }
    }
}
