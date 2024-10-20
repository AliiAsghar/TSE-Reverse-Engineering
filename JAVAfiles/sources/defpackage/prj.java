package defpackage;

import com.google.android.ims.provisioning.config.Configuration;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class prj implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ prj(int i) {
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
        switch (this.a) {
            case 0:
                return ((tdx) obj).k();
            case 1:
                return true;
            case 2:
                return ((tdx) obj).k();
            case 3:
                return ((tdx) obj).l();
            case 4:
                alvi alviVar = prq.a;
                String[] strArr = teh.a;
                return (tdx) ((tdo) obj).al("rbm_business_info", tdx.class);
            case 5:
                return d.ar((smu) obj);
            case 6:
                return ((Configuration) obj).mChatbotConfiguration.botInfoDomain;
            case 7:
                return ((jat) obj).f;
            case 8:
                return ((adit) obj).a;
            case 9:
                pua puaVar = (pua) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(puaVar.c);
                if (!puaVar.d.isEmpty()) {
                    sb.append("=");
                    sb.append(puaVar.d);
                }
                return sb.toString();
            case 10:
                return (qei) ((Map.Entry) obj).getKey();
            case 11:
                return qrz.a(((pto) ((Map.Entry) obj).getValue()).a());
            case 12:
                obj2 = ((qei) obj).d;
                return obj2;
            case 13:
                return (qei) obj;
            case 14:
                pua puaVar2 = (pua) obj;
                utz utzVar = pto.a;
                return puaVar2.c + "=" + puaVar2.d;
            case 15:
                return aktp.ag((pto) obj);
            case 16:
                return (qei) ((Map.Entry) obj).getKey();
            case 17:
                return (pto) ((Map.Entry) obj).getValue();
            case 18:
                return ((CronetException) obj).getMessage();
            case 19:
                return ((Throwable) obj).getMessage();
            default:
                qei qeiVar = ((qff) obj).c;
                if (qeiVar == null) {
                    return qei.a;
                }
                return qeiVar;
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
