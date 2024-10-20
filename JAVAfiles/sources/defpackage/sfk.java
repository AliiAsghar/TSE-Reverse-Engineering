package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sfk implements agnn {
    private final /* synthetic */ int a;

    public sfk(int i) {
        this.a = i;
    }

    @Override // defpackage.agnn
    public final String a() {
        switch (this.a) {
            case 0:
                return "add_contact_banner";
            case 1:
                return "a2p_conversation_subscriptions";
            case 2:
                return "backup_id_map";
            case 3:
                return "business_conversations_metadata";
            case 4:
                return "cms_backup_dependency_cache_table";
            case 5:
                return "cms_blobs_pending_delete";
            case 6:
                return "cms_dead_letter_queue";
            case 7:
                return "cms_deleted_messages_buffer";
            case 8:
                return "cms_media_notifications";
            case 9:
                return "cms_notifications";
            case 10:
                return "cms_restore_dependency_cache_table";
            case 11:
                return "cms_status";
            case 12:
                return "cms";
            case 13:
                return "contacts";
            case 14:
                return "conversation_classifications_table";
            case 15:
                return "conversation_labels";
            case 16:
                return "conversation_participants_audit_log";
            case 17:
                return "conversation_participants";
            case 18:
                return "conversation_pin";
            case 19:
                return "conversation_suggestions";
            default:
                return "conversation_to_participants_audit_log";
        }
    }

    @Override // defpackage.agnn
    public final void b(agnw agnwVar) {
        int i = 0;
        switch (this.a) {
            case 0:
                sfp.b(agnwVar);
                return;
            case 1:
                sfe.a(agnwVar);
                return;
            case 2:
                sfz.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 3:
                sgh.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 4:
                sgo.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 5:
                sgv.a(agnwVar);
                return;
            case 6:
                shd.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 7:
                shr.a(agnwVar);
                return;
            case 8:
                shy.a(agnwVar);
                return;
            case 9:
                sig.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 10:
                sim.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 11:
                siu.a(agnwVar);
                return;
            case 12:
                sjc.a(agnwVar, Integer.MAX_VALUE);
                return;
            case 13:
                sjm.c(agnwVar, Integer.MAX_VALUE);
                return;
            case 14:
                sjv.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 15:
                skk.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 16:
                sks.b(agnwVar, Integer.MAX_VALUE);
                return;
            case 17:
                agnwVar.z(sld.c(Integer.MAX_VALUE, "conversation_participants"));
                String[] d = sld.d();
                int length = d.length;
                while (i < length) {
                    agnwVar.z(d[i]);
                    i++;
                }
                return;
            case 18:
                slm.a(agnwVar);
                return;
            case 19:
                agnwVar.z(sly.b("conversation_suggestions"));
                String[] c = sly.c();
                int length2 = c.length;
                while (i < length2) {
                    agnwVar.z(c[i]);
                    i++;
                }
                return;
            default:
                smf.a(agnwVar);
                return;
        }
    }
}
