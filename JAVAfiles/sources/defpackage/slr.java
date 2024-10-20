package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class slr implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ slr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "received_timestamp:".concat(String.valueOf(((sls) this.a).getString(9)));
            case 1:
                return "read:".concat(String.valueOf(((sls) this.a).getString(8)));
            case 2:
                return "_id:".concat(String.valueOf(((smc) this.a).getString(0)));
            case 3:
                return "operation_datetime:".concat(String.valueOf(((smc) this.a).getString(1)));
            case 4:
                return "operation_type:".concat(String.valueOf(((smc) this.a).getString(2)));
            case 5:
                return "conversation_id:".concat(String.valueOf(((smc) this.a).getString(3)));
            case 6:
                return "participant_id:".concat(String.valueOf(((smc) this.a).getString(4)));
            case 7:
                return "rcs_group_join_status:".concat(String.valueOf(((smc) this.a).getString(5)));
            case 8:
                return "last_modified_by_key:".concat(String.valueOf(((smc) this.a).getString(6)));
            case 9:
                smm smmVar = new smm(smp.a);
                agpw agpwVar = (agpw) this.a;
                smmVar.k(agpwVar);
                smmVar.w("conversation_to_participants-deleteAndReturnDeletedRows-query");
                alog t = smmVar.b().t();
                smk smkVar = new smk();
                smkVar.a = agpwVar;
                smkVar.f("conversation_to_participants-deleteAndReturnDeletedRows-delete");
                smkVar.a().V();
                return t;
            case 10:
                return "conversation_id:".concat(String.valueOf(((smj) this.a).getString(0)));
            case 11:
                return "participant_id:".concat(String.valueOf(((smj) this.a).getString(1)));
            case 12:
                return "rcs_group_join_status:".concat(String.valueOf(((smj) this.a).getString(2)));
            case 13:
                return "last_modified_by_key:".concat(String.valueOf(((smj) this.a).getString(3)));
            case 14:
                return "_id:".concat(String.valueOf(((sna) this.a).getString(0)));
            case 15:
                return "icon:".concat(String.valueOf(((sna) this.a).getString(19)));
            case 16:
                return "sms_thread_id:".concat(String.valueOf(((sna) this.a).getString(1)));
            case 17:
                return "participant_contact_id:".concat(String.valueOf(((sna) this.a).getString(20)));
            case 18:
                return "normalized_participant_contact_id:".concat(String.valueOf(((sna) this.a).getString(21)));
            case 19:
                return "participant_lookup_key:".concat(String.valueOf(((sna) this.a).getString(22)));
            default:
                return "normalized_participant_lookup_key:".concat(String.valueOf(((sna) this.a).getString(23)));
        }
    }
}
