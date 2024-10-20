package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class stx implements agnn {
    private final /* synthetic */ int a;

    public stx(int i) {
        this.a = i;
    }

    @Override // defpackage.agnn
    public final String a() {
        switch (this.a) {
            case 0:
                return "message_classifications_table";
            case 1:
                return "message_captions";
            case 2:
                return "message_destinations";
            case 3:
                return "message_edits";
            case 4:
                return "message_labels";
            case 5:
                return "message_photos_sharing";
            case 6:
                return "message_reactions";
            case 7:
                return "message_replies";
            case 8:
                return "message_send_receive_attempt";
            case 9:
                return "message_spam";
            case 10:
                return "message_star";
            case 11:
                return "message_status";
            case 12:
                return "modified_by";
            case 13:
                return "smarts_personalization_decayed_feature_values";
            case 14:
                return "smarts_personalization_features";
            case 15:
                return "smarts_personalization_normalized_feature_values";
            case 16:
                return "p2p_conversation_suggestion_event";
            case 17:
                return "p2p_suggestions";
            case 18:
                return "parent_disallowed_conversations";
            case 19:
                return "participants_audit_log";
            default:
                return "participants";
        }
    }

    @Override // defpackage.agnn
    public final void b(agnw agnwVar) {
        int i = 0;
        switch (this.a) {
            case 0:
                sub.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 1:
                stt.a(agnwVar);
                return;
            case 2:
                sui.a(agnwVar);
                return;
            case 3:
                sur.a(agnwVar);
                return;
            case 4:
                suz.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 5:
                svi.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 6:
                svq.c(agnwVar, Integer.MAX_VALUE);
                return;
            case 7:
                svz.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 8:
                swk.a(agnwVar);
                return;
            case 9:
                sww.c(agnwVar, Integer.MAX_VALUE);
                return;
            case 10:
                sxc.a(agnwVar);
                return;
            case 11:
                sxl.b(agnwVar);
                return;
            case 12:
                agnwVar.z(syj.a("modified_by"));
                String[] b = syj.b();
                int length = b.length;
                while (i < length) {
                    agnwVar.z(b[i]);
                    i++;
                }
                return;
            case 13:
                syr.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 14:
                syx.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 15:
                szd.a(agnwVar);
                return;
            case 16:
                szl.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 17:
                szu.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 18:
                tac.a(agnwVar);
                return;
            case 19:
                agnwVar.z(tan.b(Integer.MAX_VALUE, "participants_audit_log"));
                String[] c = tan.c(Integer.MAX_VALUE);
                int length2 = c.length;
                while (i < length2) {
                    agnwVar.z(c[i]);
                    i++;
                }
                return;
            default:
                agnwVar.z(ParticipantsTable.i(Integer.MAX_VALUE, "participants"));
                String[] k = ParticipantsTable.k(Integer.MAX_VALUE);
                int length3 = k.length;
                while (i < length3) {
                    agnwVar.z(k[i]);
                    i++;
                }
                return;
        }
    }
}
