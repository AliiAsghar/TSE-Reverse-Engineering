package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class sal implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ sal(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.a) {
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
        Object apply;
        agnw d;
        switch (this.a) {
            case 0:
                String str = sam.a;
                return ((ifq) obj).c;
            case 1:
                slc slcVar = (slc) obj;
                String str2 = sam.a;
                slcVar.c(ParticipantsTable.c.a);
                return slcVar;
            case 2:
                return a.aZ(obj);
            case 3:
                return Integer.valueOf(((tqc) obj).h);
            case 4:
                return Integer.valueOf(((tqc) obj).h);
            case 5:
                suy suyVar = (suy) obj;
                int i = say.a;
                suyVar.b(MessagesTable.c.a);
                return suyVar;
            case 6:
                suy suyVar2 = (suy) obj;
                int i2 = say.a;
                suyVar2.b(MessagesTable.c.a);
                return suyVar2;
            case 7:
                return a.aZ(obj);
            case 8:
                return String.valueOf(rvc.a((MessageIdType) obj));
            case 9:
                return Integer.valueOf(((qfe) obj).e);
            case 10:
                return Integer.valueOf(((qfe) obj).e);
            case 11:
                sdb sdbVar = (sdb) obj;
                sdbVar.W(scq.c(">"));
                return sdbVar;
            case 12:
                scv scvVar = (scv) obj;
                String str3 = scq.a;
                scvVar.W(new agpk("b.$R=$R AND ($R $R b.$R OR ($R = b.$R AND $R $R b.$R))", new Object[]{"_id", "%ROOT_MESSAGE_ID%", "%TIMESTAMP_COLUMN_VAL%", "%TIMESTAMP_COMPARATOR%", "received_timestamp", "%TIMESTAMP_COLUMN_VAL%", "received_timestamp", "messages._id", "%ID_COMPARATOR%", "_id"}));
                return scvVar;
            case 13:
                sdb sdbVar2 = (sdb) obj;
                sdbVar2.W(scq.c("<"));
                return sdbVar2;
            case 14:
                sdh sdhVar = (sdh) obj;
                String str4 = scq.a;
                Function[] functionArr = {new sal(15), new sal(16)};
                sdh[] sdhVarArr = new sdh[2];
                for (int i3 = 0; i3 < 2; i3++) {
                    apply = functionArr[i3].apply(new sdh());
                    sdhVarArr[i3] = (sdh) apply;
                }
                sdhVar.V(sdhVarArr);
                return sdhVar;
            case 15:
                sdh sdhVar2 = (sdh) obj;
                String str5 = scq.a;
                d = agnc.d("$primary");
                int c = d.W().c();
                Integer.valueOf(c).getClass();
                if (c < 30010) {
                    agnc.t("is_hidden", c);
                }
                sdhVar2.U(new agoi("messages.is_hidden", 1, 0));
                return sdhVar2;
            case 16:
                sdh sdhVar3 = (sdh) obj;
                String str6 = scq.a;
                sdhVar3.W(new agpk("b.$R NOTNULL", new Object[]{"reacted_message_id"}));
                return sdhVar3;
            case 17:
                return a.aZ(obj);
            case 18:
                return a.aZ(obj);
            case 19:
                return ((usk) obj).a;
            default:
                return ((qxr) obj).a;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
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
