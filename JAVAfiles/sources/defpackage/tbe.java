package defpackage;

import android.content.ContentValues;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tbe implements Function {
    public final /* synthetic */ agnw a;
    private final /* synthetic */ int b;

    public /* synthetic */ tbe(agnw agnwVar, int i) {
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
                return Long.valueOf(this.a.O("parts", (ContentValues) obj));
            case 1:
                return Long.valueOf(this.a.O("participants", (ContentValues) obj));
            case 2:
                return Long.valueOf(this.a.P("parts", (ContentValues) obj));
            case 3:
                return Long.valueOf(this.a.O("pending_incoming_message_rcs_table", (ContentValues) obj));
            case 4:
                return Long.valueOf(this.a.P("pending_incoming_message_rcs_table", (ContentValues) obj));
            case 5:
                return Long.valueOf(this.a.P("phone_number_min_match_guesser", (ContentValues) obj));
            case 6:
                return Long.valueOf(this.a.O("pii_hash", (ContentValues) obj));
            case 7:
                return Long.valueOf(this.a.O("rbm_business_info_properties", (ContentValues) obj));
            case 8:
                return Long.valueOf(this.a.O("rbm_business_info", (ContentValues) obj));
            case 9:
                return Long.valueOf(this.a.O("rbm_business_verifier_info", (ContentValues) obj));
            case 10:
                return Long.valueOf(this.a.O("read_reports", (ContentValues) obj));
            case 11:
                return Long.valueOf(this.a.P("read_reports", (ContentValues) obj));
            case 12:
                return Long.valueOf(this.a.Q("read_reports", (ContentValues) obj, 5));
            case 13:
                return Long.valueOf(this.a.Q("recent_expressive_stickers", (ContentValues) obj, 5));
            case 14:
                return Long.valueOf(this.a.Q("recent_gifs", (ContentValues) obj, 4));
            case 15:
                return Long.valueOf(this.a.O("remote_registrations_table", (ContentValues) obj));
            case 16:
                return Long.valueOf(this.a.Q("remote_registrations_table", (ContentValues) obj, 5));
            case 17:
                return Long.valueOf(this.a.Q("remote_user_id_info_table", (ContentValues) obj, 5));
            case 18:
                return Long.valueOf(this.a.O("remote_user_id_to_registration_id", (ContentValues) obj));
            case 19:
                return Long.valueOf(this.a.Q("remote_user_id_to_registration_id", (ContentValues) obj, 5));
            default:
                return Long.valueOf(this.a.P("restore_workflow_executions", (ContentValues) obj));
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
