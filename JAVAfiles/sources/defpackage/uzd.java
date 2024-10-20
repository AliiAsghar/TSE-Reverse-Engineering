package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uzd implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ uzd(int i) {
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
        Object obj2;
        Object obj3;
        Object obj4;
        Integer valueOf;
        Object obj5;
        switch (this.a) {
            case 0:
                agpj agpjVar = uze.a;
                return ((ifq) obj).c;
            case 1:
                slc slcVar = (slc) obj;
                agpj agpjVar2 = uze.a;
                slcVar.c(sni.c.a);
                return slcVar;
            case 2:
                smo smoVar = (smo) obj;
                agpj agpjVar3 = uze.a;
                smoVar.c(sni.c.a);
                return smoVar;
            case 3:
                Uri y = ((MessagesTable.BindData) obj).y();
                if (y == null) {
                    return Uri.EMPTY;
                }
                return y;
            case 4:
                obj2 = ((sxo) obj).a;
                return obj2;
            case 5:
                syc sycVar = (syc) obj;
                sycVar.R();
                return sycVar;
            case 6:
                syc sycVar2 = (syc) obj;
                sycVar2.N();
                return sycVar2;
            case 7:
                obj3 = ((sxo) obj).a;
                return obj3;
            case 8:
                obj4 = ((sxo) obj).a;
                return obj4;
            case 9:
                snh snhVar = (snh) obj;
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 29020) {
                    agnc.t("delete_timestamp", intValue);
                }
                snhVar.U(new agoi("conversations.delete_timestamp", 7, 0L));
                return snhVar;
            case 10:
                obj5 = ((sxo) obj).a;
                return obj5;
            case 11:
                return ((MessageCoreData) obj).ad();
            case 12:
                return ((MessageCoreData) obj).B();
            case 13:
                return ((sxo) obj).R;
            case 14:
                return ((MessageIdType) obj).a();
            case 15:
                return ((vaf) obj).b();
            case 16:
                return ((vaf) obj).c();
            case 17:
                return ((vaf) obj).a();
            case 18:
                return new gi((String) obj);
            case 19:
                aotw aotwVar = (aotw) obj;
                if (aotwVar.c == 3) {
                    return (aouh) aotwVar.d;
                }
                return aouh.c;
            default:
                aotw aotwVar2 = (aotw) obj;
                if (aotwVar2.c == 5) {
                    return (aoui) aotwVar2.d;
                }
                return aoui.a;
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
