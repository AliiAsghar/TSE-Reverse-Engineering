package defpackage;

import android.content.ContentValues;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class spl implements Function {
    public final /* synthetic */ agnw a;
    private final /* synthetic */ int b;

    public /* synthetic */ spl(agnw agnwVar, int i) {
        this.b = i;
        this.a = agnwVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.b) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return Long.valueOf(this.a.O("etouffee_rcs_metadata", (ContentValues) obj));
            case 1:
                return Long.valueOf(this.a.P("drafts", (ContentValues) obj));
            case 2:
                return Long.valueOf(this.a.O("events", (ContentValues) obj));
            case 3:
                return Long.valueOf(this.a.O("flagged_messages", (ContentValues) obj));
            case 4:
                return Long.valueOf(this.a.P("lighter_conversations_table", (ContentValues) obj));
            case 5:
                return Long.valueOf(this.a.O("link_preview_participants_table", (ContentValues) obj));
            case 6:
                return Long.valueOf(this.a.P("link_preview", (ContentValues) obj));
            case 7:
                return Long.valueOf(this.a.O("link_preview", (ContentValues) obj));
            case 8:
                return Long.valueOf(this.a.P("linked_account", (ContentValues) obj));
            case 9:
                return Long.valueOf(this.a.O("messages_annotations", (ContentValues) obj));
            case 10:
                return Long.valueOf(this.a.P("message_captions", (ContentValues) obj));
            case 11:
                return Long.valueOf(this.a.P("message_destinations", (ContentValues) obj));
            case 12:
                return Long.valueOf(this.a.P("message_reactions", (ContentValues) obj));
            case 13:
                return Long.valueOf(this.a.P("message_replies", (ContentValues) obj));
            case 14:
                return Long.valueOf(this.a.P("message_send_receive_attempt", (ContentValues) obj));
            case 15:
                return Long.valueOf(this.a.P("message_spam", (ContentValues) obj));
            case 16:
                return Long.valueOf(this.a.O("message_status", (ContentValues) obj));
            case 17:
                return Long.valueOf(this.a.P("messages", (ContentValues) obj));
            case 18:
                return Long.valueOf(this.a.P("p2p_suggestions", (ContentValues) obj));
            case 19:
                return Long.valueOf(this.a.Q("parent_disallowed_conversations", (ContentValues) obj, 4));
            default:
                return Long.valueOf(this.a.P("participants", (ContentValues) obj));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
