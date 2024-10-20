package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tcm implements agnn {
    private final /* synthetic */ int a;

    public tcm(int i) {
        this.a = i;
    }

    @Override // defpackage.agnn
    public final String a() {
        switch (this.a) {
            case 0:
                return "phone_number_min_match_guesser";
            case 1:
                return "pending_incoming_message_rcs_table";
            case 2:
                return "pii_hash";
            case 3:
                return "profiles_table";
            case 4:
                return "rbm_business_info_properties";
            case 5:
                return "rbm_business_info";
            case 6:
                return "rbm_business_verifier_info";
            case 7:
                return "read_reports";
            case 8:
                return "received_message_phone_numbers";
            case 9:
                return "recent_expressive_stickers";
            case 10:
                return "recent_gifs";
            case 11:
                return "reminders";
            case 12:
                return "remote_instances";
            case 13:
                return "remote_registrations_table";
            case 14:
                return "remote_user_id_info_table";
            case 15:
                return "remote_user_id_to_registration_id";
            case 16:
                return "restore_workflow_executions";
            case 17:
                return "restore_workflow_files";
            case 18:
                return "restore_workflow_scratch_duplicates";
            case 19:
                return "restore_workflow_scratch_suffix";
            default:
                return "restore_workflow_scratch_timestamps";
        }
    }

    @Override // defpackage.agnn
    public final void b(agnw agnwVar) {
        switch (this.a) {
            case 0:
                tcq.a(agnwVar);
                return;
            case 1:
                tcf.c(agnwVar, Integer.MAX_VALUE);
                return;
            case 2:
                tcz.a(agnwVar);
                return;
            case 3:
                ProfilesTable.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 4:
                tdv.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 5:
                teh.e(agnwVar, Integer.MAX_VALUE);
                return;
            case 6:
                teq.b(agnwVar);
                return;
            case 7:
                tfa.c(agnwVar, Integer.MAX_VALUE);
                return;
            case 8:
                tfg.a(agnwVar);
                return;
            case 9:
                tfp.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 10:
                tgb.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 11:
                tgr.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 12:
                thb.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 13:
                thk.c(agnwVar, Integer.MAX_VALUE);
                return;
            case 14:
                thu.b(agnwVar);
                return;
            case 15:
                tid.a(agnwVar);
                return;
            case 16:
                tip.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 17:
                tiy.a(agnwVar);
                return;
            case 18:
                tji.a(agnwVar);
                return;
            case 19:
                tjr.a(agnwVar);
                return;
            default:
                tjz.a(agnwVar);
                return;
        }
    }
}
