package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sat extends agpc<sar, sas, sat, san, saq> {
    public sat(String[] strArr) {
        super("conversations LEFT JOIN messages ON (%MESSAGES_JOIN%) LEFT JOIN participants ON (participants._id=messages.sender_id) LEFT JOIN conversation_participants ON (%ONE_ON_ONE_JOIN%) LEFT JOIN participants AS one_on_one_participant ON (one_on_one_participant._id=conversation_participants.participant_id) LEFT JOIN profiles_table ON (profiles_table.participant_id=conversation_participants.participant_id) LEFT JOIN parts ON (parts.message_id=messages._id) LEFT JOIN vmt ON (vmt.part_id=parts._id) LEFT JOIN reminders ON (reminders.message_id=conversations.latest_message_id) LEFT JOIN messages_annotations ON (conversations.latest_message_id = messages_annotations.message_id and annotation_type = 1) LEFT JOIN message_star ON (message_star.message_id=messages._id) LEFT JOIN parent_disallowed_conversations ON (parent_disallowed_conversations.conversation_id=conversations._id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sas b() {
        l();
        return new sas(this.a.b());
    }

    public final void c(sau sauVar) {
        k(new agpw(sauVar));
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(new sau());
        k(new agpw((sau) apply));
    }

    public final void e(atkn... atknVarArr) {
        z((String) DesugarArrays.stream(atknVarArr).map(new sal(2)).collect(Collectors.joining(", ")));
    }
}
