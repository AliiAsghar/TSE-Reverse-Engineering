package defpackage;

import android.net.LinkAddress;
import android.net.RouteInfo;
import android.telephony.ims.FeatureTagState;
import android.telephony.ims.SipDelegateConfiguration;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.function.Function$CC;
import java.net.InetAddress;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class addg implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ addg(int i) {
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
        boolean z = true;
        int i = 0;
        switch (this.a) {
            case 0:
                return ((ajqb) obj).c;
            case 1:
                String str = (String) obj;
                ContentType contentType = addi.e;
                if (aiff.DELIVERED.p.equals(str)) {
                    return ajqo.POSITIVE_DELIVERY;
                }
                if (aiff.DISPLAYED.p.equals(str)) {
                    return ajqo.DISPLAY;
                }
                advr.r(addi.g, "DispositionNotification %s is not supported.", str);
                return null;
            case 2:
                return ((Configuration) obj).mInstantMessageConfiguration;
            case 3:
                return Integer.valueOf(((InstantMessageConfiguration) obj).mMaxConcurrentSession);
            case 4:
                return Long.valueOf(((adrc) ((Map.Entry) obj).getValue()).M);
            case 5:
                Configuration configuration = (Configuration) obj;
                acyz acyzVar = adeq.a;
                if (!configuration.m() || configuration.mConfigState != 1 || configuration.b() <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                acyz acyzVar2 = adeq.a;
                return Boolean.valueOf(adsw.REGISTRATION_DISABLED_BY_BUGLE.equals(((acoh) obj).getRegistrationState().a));
            case 7:
                return ((InetAddress) obj).getHostAddress();
            case 8:
                return ((LinkAddress) obj).getAddress();
            case 9:
                adey adeyVar = (adey) obj;
                return adex.a(adeyVar.e.a, adeyVar.g, false);
            case 10:
                return ((FeatureTagState) obj).getFeatureTag();
            case 11:
                List c = anna.h("\\s*:\\s").c((String) obj);
                if (c.size() >= 2) {
                    i = Integer.parseInt((String) c.get(1));
                }
                return Integer.valueOf(i);
            case 12:
                String i2 = adcx.i((String) obj);
                advr.c("Boundary - %s", i2);
                return a.bW(i2, "\r\n--", "--\r\n");
            case 13:
                return ((SipDelegateConfiguration.IpSecConfiguration) obj).getSipSecurityVerifyHeader();
            case 14:
                int i3 = adgp.L;
                return Long.valueOf(((SipDelegateConfiguration) obj).getVersion());
            case 15:
                return ((SipDelegateConfiguration.IpSecConfiguration) obj).getSipSecurityVerifyHeader();
            case 16:
                Map.Entry entry = (Map.Entry) obj;
                int i4 = adfz.a;
                return String.format("%s: %s", entry.getKey(), String.valueOf(entry.getValue()));
            case 17:
                String str2 = (String) obj;
                advp advpVar = adwf.a;
                try {
                    return ahji.h(str2).b.toString();
                } catch (ailb e) {
                    advr.i(e, "Error while parsing %s", advq.GENERIC.c(str2));
                    return null;
                }
            case 18:
                RouteInfo routeInfo = (RouteInfo) obj;
                int i5 = adgw.b;
                return String.format("ip_prefix:[%s], is_default:[%s]", routeInfo.getDestination(), Boolean.valueOf(routeInfo.isDefaultRoute()));
            case 19:
                return ((LinkAddress) obj).getAddress();
            default:
                return ((InetAddress) obj).getHostAddress();
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
