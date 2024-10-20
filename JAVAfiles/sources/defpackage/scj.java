package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchQuery;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class scj extends agpc<lbz, sci, scj, MediaSearchQuery.BindData, Object> {
    public scj(String[] strArr) {
        super("parts INNER JOIN messages ON (messages._id=parts.message_id) INNER JOIN participants ON (participants._id=messages.sender_id) LEFT JOIN message_star ON (message_star.message_id=messages._id) LEFT JOIN parent_disallowed_conversations ON (parent_disallowed_conversations.conversation_id=parts.conversation_id) LEFT JOIN conversations ON (conversations._id=parts.conversation_id)", strArr, null, null, "image_display_state IN (0, 1, 3)", "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sci b() {
        l();
        return new sci(this.a.b());
    }
}
