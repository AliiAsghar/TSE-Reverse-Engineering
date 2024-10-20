package defpackage;

import android.app.Notification;
import android.content.ContentValues;
import android.service.notification.StatusBarNotification;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vil implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ vil(int i) {
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
        String id;
        switch (this.a) {
            case 0:
                vii viiVar = (vii) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("conv_id", viiVar.a.toString());
                contentValues.put("message_id", viiVar.b.a());
                return contentValues;
            case 1:
                int i = vhs.e;
                return ((vin) obj).a();
            case 2:
                int i2 = vit.n;
                return ((sqf) obj).h();
            case 3:
                int i3 = vjd.q;
                return ((sqf) obj).h();
            case 4:
                return ((rtn) obj).t();
            case 5:
                alwo alwoVar = vka.a;
                return ((StatusBarNotification) obj).getNotification().extras;
            case 6:
                alwo alwoVar2 = vka.a;
                vkf b = vkf.b(((Notification.Action) obj).getExtras().getInt("extra_notification_action_type", vkf.NAT_UNKNOWN.o));
                b.getClass();
                return b.name();
            case 7:
                return ((StatusBarNotification) obj).getTag();
            case 8:
                return Boolean.valueOf(((msh) obj).A());
            case 9:
                id = bl$$ExternalSyntheticApiModelOutline0.m(obj).getId();
                return id;
            case 10:
                return ((vkr) obj).a;
            case 11:
                uuf uufVar = vlk.a;
                return ((vjy) obj).b.a();
            case 12:
                return ((StatusBarNotification) obj).getNotification().extras;
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                alwo alwoVar3 = vlu.a;
                return ((String) entry.getKey()) + ":" + ((vmn) entry.getValue()).c;
            case 14:
                return ((rry) obj).u();
            case 15:
                alwo alwoVar4 = vlw.a;
                return ((woj) obj).f();
            case 16:
                return vls.a((msh) obj);
            case 17:
                return vls.a((msh) obj);
            case 18:
                return (Integer) Map.EL.getOrDefault(vlw.b, ((vke) obj).a, Integer.MAX_VALUE);
            case 19:
                alwo alwoVar5 = vmf.a;
                return ((vls) obj).c.L();
            default:
                alwo alwoVar6 = vmf.a;
                return ((rry) obj).u().toString();
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
