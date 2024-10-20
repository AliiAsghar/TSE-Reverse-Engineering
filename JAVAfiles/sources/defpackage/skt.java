package defpackage;

import android.content.ContentValues;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class skt implements Function {
    public final /* synthetic */ agnw a;
    private final /* synthetic */ int b;

    public /* synthetic */ skt(agnw agnwVar, int i) {
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
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return Long.valueOf(this.a.P("conversation_participants", (ContentValues) obj));
            case 1:
                return Long.valueOf(this.a.O("conversation_classifications_table", (ContentValues) obj));
            case 2:
                return Long.valueOf(this.a.O("conversation_participants", (ContentValues) obj));
            case 3:
                return Long.valueOf(this.a.O("conversation_suggestions", (ContentValues) obj));
            case 4:
                return Long.valueOf(this.a.O("conversation_to_participants", (ContentValues) obj));
            case 5:
                return Long.valueOf(this.a.P("conversation_to_participants", (ContentValues) obj));
            case 6:
                return Long.valueOf(this.a.P("conversations", (ContentValues) obj));
            case 7:
                return Long.valueOf(this.a.O("conversations", (ContentValues) obj));
            case 8:
                return Long.valueOf(this.a.P("data_upgrade_workers", (ContentValues) obj));
            default:
                return Long.valueOf(this.a.O("disambiguations", (ContentValues) obj));
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
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
