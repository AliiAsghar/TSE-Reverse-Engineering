package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcb extends agpc {
    public lcb(String[] strArr) {
        super("conversations LEFT JOIN messages ON (%MESSAGES_JOIN%) LEFT JOIN participants ON (participants._id=messages.sender_id) LEFT JOIN conversation_to_participants ON (%ONE_ON_ONE_JOIN%) LEFT JOIN participants AS one_on_one_participant ON (one_on_one_participant._id=conversation_to_participants.participant_id) LEFT JOIN profiles_table ON (profiles_table.participant_id=conversation_to_participants.participant_id) LEFT JOIN parts ON (parts.message_id=messages._id) LEFT JOIN reminders ON (reminders.message_id=messages._id) LEFT JOIN conversation_pin ON (conversation_pin.conversation_id=conversations._id) LEFT JOIN lighter_conversations_table ON (lighter_conversations_table.conversation_id=conversations._id)", strArr, "conversations._id", null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lca b() {
        l();
        return new lca(this.a.b());
    }

    public final void c(atkn... atknVarArr) {
        z((String) DesugarArrays.stream(atknVarArr).map(new koa(17)).collect(Collectors.joining(", ")));
    }
}
