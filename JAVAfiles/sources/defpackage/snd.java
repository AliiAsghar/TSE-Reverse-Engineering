package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class snd implements agnn {
    private final /* synthetic */ int a;

    public snd(int i) {
        this.a = i;
    }

    @Override // defpackage.agnn
    public final String a() {
        switch (this.a) {
            case 0:
                return "conversations";
            case 1:
                return "conversation_to_participants";
            case 2:
                return "custodian_rcs_group_ids";
            case 3:
                return "data_upgrade_workers";
            case 4:
                return "data_usage";
            case 5:
                return "desktop";
            case 6:
                return "disambiguations";
            case 7:
                return "drafts";
            case 8:
                return "etouffee_rcs_metadata";
            case 9:
                return "events";
            case 10:
                return "flagged_messages";
            case 11:
                return "gemini_conversation_id_mappings";
            case 12:
                return "gemini";
            case 13:
                return "generic_worker_queue";
            case 14:
                return "group_conversation_participants_audit_log";
            case 15:
                return "group_conversation_participants";
            case 16:
                return "lighter_conversations_table";
            case 17:
                return "link_preview_participants_table";
            case 18:
                return "link_preview";
            case 19:
                return "linked_account";
            default:
                return "messages_annotations";
        }
    }

    @Override // defpackage.agnn
    public final void b(agnw agnwVar) {
        int i = 0;
        switch (this.a) {
            case 0:
                agnwVar.z(sni.i(Integer.MAX_VALUE, "conversations"));
                String[] k = sni.k(Integer.MAX_VALUE);
                int length = k.length;
                while (i < length) {
                    agnwVar.z(k[i]);
                    i++;
                }
                return;
            case 1:
                smp.b(agnwVar);
                return;
            case 2:
                snp.b(agnwVar);
                return;
            case 3:
                snz.b(agnwVar);
                return;
            case 4:
                sof.a(agnwVar);
                return;
            case 5:
                sor.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 6:
                soz.b(agnwVar);
                return;
            case 7:
                spj.c(agnwVar, Integer.MAX_VALUE);
                return;
            case 8:
                spv.c(agnwVar, Integer.MAX_VALUE);
                return;
            case 9:
                sqd.a(agnwVar);
                return;
            case 10:
                sqp.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 11:
                sqv.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 12:
                src.a(agnwVar);
                return;
            case 13:
                srm.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 14:
                srn.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 15:
                sro.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 16:
                srz.c(agnwVar, Integer.MAX_VALUE);
                return;
            case 17:
                ssh.a(agnwVar);
                return;
            case 18:
                agnwVar.z(sss.d(Integer.MAX_VALUE, "link_preview"));
                String[] at = d.at();
                int length2 = at.length;
                while (i < length2) {
                    agnwVar.z(at[i]);
                    i++;
                }
                return;
            case 19:
                stb.a(agnwVar);
                return;
            default:
                stl.c(agnwVar, Integer.MAX_VALUE);
                return;
        }
    }
}
