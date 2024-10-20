package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class idc implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ idc(int i) {
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
        switch (this.a) {
            case 0:
                tbu tbuVar = (tbu) obj;
                tbuVar.U(new agmd("parts.content_type", 2, "text/plain"));
                return tbuVar;
            case 1:
                tbu tbuVar2 = (tbu) obj;
                tbuVar2.getClass();
                tbuVar2.p();
                tbuVar2.U(new agmd("parts.uri", 2, Uri.parse("")));
                return tbuVar2;
            case 2:
                return ((sxo) obj).b;
            case 3:
                obj2 = ((sxo) obj).a;
                return obj2;
            case 4:
                tbd tbdVar = (tbd) obj;
                tbdVar.c();
                return tbdVar;
            case 5:
                return ((iit) ((Map.Entry) obj).getKey()).h;
            case 6:
                return (iiq) ((Map.Entry) obj).getValue();
            case 7:
                return new aoia((qei) obj);
            case 8:
                obj3 = ((sxo) obj).a;
                return obj3;
            case 9:
                obj4 = ((sxo) obj).a;
                return obj4;
            case 10:
                return ((jat) obj).c;
            case 11:
                return ((ifq) obj).c;
            case 12:
                return ((tar) obj).f;
            case 13:
                return ((jat) obj).e;
            case 14:
                tar tarVar = (tar) obj;
                return new tas[]{tarVar.f, tarVar.g, tarVar.z};
            case 15:
                return alog.r((msh) obj);
            case 16:
                tbd tbdVar2 = (tbd) obj;
                tbdVar2.r(-2);
                return tbdVar2;
            case 17:
                alwo alwoVar = imk.a;
                Uri t = ((MessagePartCoreData) obj).t();
                t.getClass();
                return t.toString();
            case 18:
                alwo alwoVar2 = imk.a;
                return ((ltw) obj).b();
            case 19:
                return ((lyh) obj).a();
            default:
                return ((rry) obj).u();
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
