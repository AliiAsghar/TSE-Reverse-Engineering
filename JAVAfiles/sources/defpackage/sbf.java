package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sbf extends agpc {
    public sbf(String[] strArr) {
        super("messages LEFT JOIN parts ON (parts.message_id=messages._id AND %PARTS_JOIN_TIMESTAMP_CHECK%) LEFT JOIN participants ON (participants._id=messages.sender_id) LEFT JOIN reports_concat_view ON (reports_concat_view.message_id_read_reports=messages._id AND %REPORTS_JOIN_TIMESTAMP_CHECK%) LEFT JOIN user_refs_concat_view ON (user_refs_concat_view.message_id_user_references=messages._id) LEFT JOIN link_preview ON (link_preview.message_id=messages._id) LEFT JOIN verified_sms_senders ON (verified_sms_senders.sender_id=participants.normalized_destination) LEFT JOIN verified_sms_brands ON (verified_sms_brands.brand_id=verified_sms_senders.brand_id) LEFT JOIN conversations ON (conversations._id=messages.conversation_id) LEFT JOIN message_reactions ON (message_reactions.message_id=messages._id) LEFT JOIN file_transfer ON (file_transfer.message_id=messages._id) LEFT JOIN message_star ON (message_star.message_id=messages._id) LEFT JOIN message_photos_sharing ON (message_photos_sharing.message_id=messages._id) LEFT JOIN vmt ON (vmt.part_id=parts._id) LEFT JOIN message_replies_view ON (%REPLIES_VIEW_JOIN%) LEFT JOIN profiles_table ON (profiles_table.participant_id=participants._id) LEFT JOIN message_captions ON (message_captions.message_id=messages._id)", strArr, "messages._id", "messages.received_timestamp DESC, messages._id DESC", null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sbe b() {
        l();
        return new sbe(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        Integer valueOf;
        apply = function.apply(sbi.c);
        sbc[] sbcVarArr = (sbc[]) apply;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        for (sbc sbcVar : sbcVarArr) {
            if (((Integer) sbi.b.getOrDefault(sbcVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(sbcVarArr);
    }

    public final void d(sbh sbhVar) {
        k(new agpw(sbhVar));
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(new sbh());
        k(new agpw((sbh) apply));
    }

    public final void f(atkn... atknVarArr) {
        z((String) DesugarArrays.stream(atknVarArr).map(new sal(7)).collect(Collectors.joining(", ")));
    }
}
