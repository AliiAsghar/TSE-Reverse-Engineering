package defpackage;

import android.telephony.ims.SipDelegateConfiguration;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgu {
    public static final advp a = new advp("SipDelegateConfigurationProcessor");

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alog a(SipDelegateConfiguration sipDelegateConfiguration) {
        String sipAssociatedUriHeader = sipDelegateConfiguration.getSipAssociatedUriHeader();
        if (!TextUtils.isEmpty(sipAssociatedUriHeader)) {
            Stream filter = Collection.EL.stream(anna.e(',').i().c(sipAssociatedUriHeader)).map(new addg(17)).filter(new addf(6));
            int i = alog.d;
            return (alog) filter.collect(alls.a);
        }
        advr.r(a, "Associated URI in configuration is null or empty", new Object[0]);
        int i2 = alog.d;
        return alsx.a;
    }
}
