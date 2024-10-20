package defpackage;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mfk implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ mfk(int i) {
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
        switch (this.a) {
            case 0:
                xze xzeVar = mfo.a;
                String h = ((qwo) obj).h();
                if (TextUtils.isEmpty(h)) {
                    return "";
                }
                int intValue = ((Integer) mfo.d.e()).intValue();
                if (h.length() > intValue) {
                    return h.substring(h.length() - intValue);
                }
                return h;
            case 1:
                xze xzeVar2 = mfo.a;
                return ((usk) obj).a;
            case 2:
                xze xzeVar3 = mfo.a;
                return (amis) mic.bh().getOrDefault((yua) obj, amis.UNKNOWN_TYPE);
            case 3:
                tbd tbdVar = (tbd) obj;
                tbdVar.r(-1);
                return tbdVar;
            case 4:
                syc sycVar = (syc) obj;
                sycVar.M(100);
                return sycVar;
            case 5:
                syc sycVar2 = (syc) obj;
                sycVar2.y(0);
                return sycVar2;
            case 6:
                return (amix) alor.n(uyz.PHONE_NUMBER, amix.PHONE_NUMBER, uyz.EMAIL_ADDRESS, amix.EMAIL_ADDRESS, uyz.WEB_URL, amix.WEB_URL).getOrDefault((uyz) obj, amix.UNKNOWN);
            case 7:
                alhr alhrVar = mic.h;
                return Integer.valueOf(((PackageInfo) obj).versionCode);
            case 8:
                alhr alhrVar2 = mic.h;
                return ((PackageInfo) obj).versionName;
            case 9:
                int i = mie.d;
                return ((PackageInfo) obj).versionName;
            case 10:
                return ((tby) obj).o;
            case 11:
                tby tbyVar = (tby) obj;
                return new sjf[]{(sjf) tbyVar.o, (sjf) tbyVar.h, (sjf) tbyVar.b, (sjf) tbyVar.n, (sjf) tbyVar.g};
            case 12:
                return ((tby) obj).b;
            case 13:
                syc sycVar3 = (syc) obj;
                alwo alwoVar = mkt.a;
                sycVar3.s();
                return sycVar3;
            case 14:
                return rvc.b((String) obj);
            case 15:
                syc sycVar4 = (syc) obj;
                alwo alwoVar2 = mkt.a;
                sycVar4.A(false);
                return sycVar4;
            case 16:
                return a.aC(obj);
            case 17:
                syc sycVar5 = (syc) obj;
                sycVar5.P(5, 6, 10, 20);
                return sycVar5;
            case 18:
                return a.aC(obj);
            case 19:
                return ((mld) obj).j();
            default:
                return Collection.EL.stream((alog) obj);
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
