package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qag implements agnn {
    private final /* synthetic */ int a;

    public qag(int i) {
        this.a = i;
    }

    @Override // defpackage.agnn
    public final String a() {
        switch (this.a) {
            case 0:
                return "file_processing";
            case 1:
                return "rcs_remote_capabilities_cache";
            case 2:
                return "conversation_matcher_cache";
            case 3:
                return "destinations";
            case 4:
                return "group_members";
            case 5:
                return "groups";
            case 6:
                return "active_sims";
            case 7:
                return "my_identities";
            case 8:
                return "subscriptions";
            case 9:
                return "conversation_participants_backup";
            case 10:
                return "conversation_pins_backup";
            case 11:
                return "conversations_backup";
            case 12:
                return "link_preview_backup";
            case 13:
                return "message_reactions_backup";
            case 14:
                return "message_replies_backup";
            case 15:
                return "message_star_backup";
            case 16:
                return "messages_backup";
            case 17:
                return "parts_backup";
            case 18:
                return "backup_metadata";
            case 19:
                return "my_identities_backup";
            default:
                return "participants_backup";
        }
    }

    @Override // defpackage.agnn
    public final void b(agnw agnwVar) {
        int i = 0;
        switch (this.a) {
            case 0:
                qal.a(agnwVar);
                return;
            case 1:
                pty.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 2:
                qpw.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 3:
                qsz.a(agnwVar);
                return;
            case 4:
                qty.a(agnwVar);
                return;
            case 5:
                qug.c(agnwVar);
                return;
            case 6:
                qun.b(agnwVar);
                return;
            case 7:
                qvk.c(agnwVar, Integer.MAX_VALUE);
                return;
            case 8:
                qww.c(agnwVar, Integer.MAX_VALUE);
                return;
            case 9:
                agnwVar.z(rkq.c("conversation_participants_backup"));
                String[] d = rkq.d();
                int length = d.length;
                while (i < length) {
                    agnwVar.z(d[i]);
                    i++;
                }
                return;
            case 10:
                rkz.c(agnwVar);
                return;
            case 11:
                agnwVar.z(rlk.c("conversations_backup"));
                String[] d2 = rlk.d();
                int length2 = d2.length;
                while (i < length2) {
                    agnwVar.z(d2[i]);
                    i++;
                }
                return;
            case 12:
                rlv.a(agnwVar);
                return;
            case 13:
                rmh.c(agnwVar);
                return;
            case 14:
                rmq.c(agnwVar);
                return;
            case 15:
                rmz.c(agnwVar);
                return;
            case 16:
                agnwVar.z(rnm.c(Integer.MAX_VALUE, "messages_backup"));
                String[] e = rnm.e(Integer.MAX_VALUE);
                int length3 = e.length;
                while (i < length3) {
                    agnwVar.z(e[i]);
                    i++;
                }
                return;
            case 17:
                agnwVar.z(rnx.c(Integer.MAX_VALUE, "parts_backup"));
                String[] d3 = rnx.d();
                int length4 = d3.length;
                while (i < length4) {
                    agnwVar.z(d3[i]);
                    i++;
                }
                return;
            case 18:
                StringBuilder sb = new StringBuilder();
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("created_timestamp INT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("schema_version INT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("backup_id TEXT");
                sb.insert(0, "CREATE TABLE backup_metadata (");
                sb.append(");");
                agnwVar.z(sb.toString());
                String[] at = d.at();
                int length5 = at.length;
                while (i < length5) {
                    agnwVar.z(at[i]);
                    i++;
                }
                return;
            case 19:
                roq.a(agnwVar);
                return;
            default:
                agnwVar.z(rpb.c("participants_backup"));
                String[] d4 = rpb.d();
                int length6 = d4.length;
                while (i < length6) {
                    agnwVar.z(d4[i]);
                    i++;
                }
                return;
        }
    }
}
