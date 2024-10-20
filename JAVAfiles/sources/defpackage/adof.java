package defpackage;

import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcs.engine.impl.RcsEngineImpl;
import com.google.android.ims.rcsservice.group.UserInfo;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adof implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ adof(int i) {
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
        String str;
        Optional of;
        Optional of2;
        Optional empty;
        switch (this.a) {
            case 0:
                return RcsEngineImpl.lambda$createImsProviders$0((Configuration) obj);
            case 1:
                return albo.af((String) obj);
            case 2:
                return RcsEngineImpl.lambda$createImsProviders$1((InstantMessageConfiguration) obj);
            case 3:
                return (adpe) ((Optional) obj).get();
            case 4:
                int i = adov.b;
                return Collection.EL.stream(((adou) obj).c.a);
            case 5:
                adou adouVar = (adou) obj;
                adqg adqgVar = adouVar.f;
                int i2 = adov.b;
                return Collection.EL.stream(adqgVar.c(adouVar));
            case 6:
                return Collection.EL.stream(((adou) obj).b);
            case 7:
                return (adpe) obj;
            case 8:
                return ((adum) obj).c;
            case 9:
                return new aijg("file-selector", "size:" + ((aifc) obj).a());
            case 10:
                return ((UserInfo) obj).a;
            case 11:
                return (adsi) ((Map.Entry) obj).getValue();
            case 12:
                String str2 = (String) obj;
                int i3 = adui.e;
                try {
                    advp advpVar = adwf.a;
                    return ahji.h(str2).b;
                } catch (ailb unused) {
                    return null;
                }
            case 13:
                aiks aiksVar = (aiks) obj;
                advp advpVar2 = adwf.a;
                if (aiksVar instanceof aikp) {
                    return ((aikp) aiksVar).e();
                }
                if (!(aiksVar instanceof aikq)) {
                    return null;
                }
                return ((aikq) aiksVar).b();
            case 14:
                advq advqVar = advq.UNKNOWN;
                boolean z = obj instanceof InetSocketAddress;
                if (z) {
                    obj2 = ((InetSocketAddress) obj).getAddress();
                } else {
                    obj2 = obj;
                }
                if (obj2 instanceof Inet4Address) {
                    of = Optional.of("ipv4");
                } else {
                    if (true != (obj2 instanceof Inet6Address)) {
                        str = "unknown";
                    } else {
                        str = "ipv6";
                    }
                    of = Optional.of(str);
                }
                if (!z) {
                    of2 = Optional.empty();
                } else {
                    of2 = Optional.of(String.valueOf(((InetSocketAddress) obj).getPort()));
                }
                return alor.m("ip_version", of, "port", of2);
            case 15:
                return alor.l("last2", advq.a(obj, 2));
            case 16:
                return alor.l("last3", advq.a(obj, 3));
            case 17:
                String valueOf = String.valueOf(obj);
                int indexOf = valueOf.indexOf(":");
                if (indexOf > 0 && indexOf < valueOf.length()) {
                    empty = Optional.of(valueOf.substring(0, indexOf));
                } else {
                    empty = Optional.empty();
                }
                return alor.m("scheme", empty, "last2", advq.a(obj, 2));
            case 18:
                return alor.l("last2", advq.a(obj, 2));
            case 19:
                Map.Entry entry = (Map.Entry) obj;
                advq advqVar2 = advq.UNKNOWN;
                return String.format("%s:%s", entry.getKey(), ((Optional) entry.getValue()).get());
            default:
                return altc.a;
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
