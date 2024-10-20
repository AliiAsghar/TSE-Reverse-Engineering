package defpackage;

import android.text.TextUtils;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class psj implements adjd {
    public static final xze a = xze.g("Bugle", "BusinessRcsConfigurationListener");
    private final ytw b;
    private final adtl c;
    private final hgj d;
    private final znj e;

    public psj(ytw ytwVar, znj znjVar, adtl adtlVar, hgj hgjVar) {
        this.b = ytwVar;
        this.e = znjVar;
        this.c = adtlVar;
        this.d = hgjVar;
    }

    @Override // defpackage.adjd
    public final void fQ(String str, Optional optional) {
        if (optional.isEmpty()) {
            a.o("config update received, but no configuration");
            return;
        }
        Configuration configuration = (Configuration) optional.get();
        String G = this.e.G(configuration);
        String e = this.c.e();
        String str2 = configuration.mVerifiedSmsToken;
        xze xzeVar = a;
        xyo c = xzeVar.c();
        c.H("Attempting to add vsmsToken");
        c.A("token available", !TextUtils.isEmpty(str2));
        c.A("imsi available", !TextUtils.isEmpty(e));
        c.A("msisdn available", !TextUtils.isEmpty(G));
        c.q();
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(e) && !TextUtils.isEmpty(G)) {
            this.b.c(e, G, str2).e(Throwable.class, new psf(3), andi.a).k(qiu.b(), andi.a);
        } else {
            xzeVar.o("Skipping storage of Verified SMS token");
        }
        if (((Boolean) psh.b.e()).booleanValue()) {
            String str3 = ((Configuration) optional.get()).mChatbotConfiguration.chatbotDirectoryUrl;
            xyo c2 = xzeVar.c();
            c2.H("Attempting to add Chatbot Directory Url");
            c2.A("url available", !TextUtils.isEmpty(str3));
            c2.q();
            xyo c3 = xzeVar.c();
            c3.H("Received ChatbotDirectoryUrl");
            c3.z("url", str3);
            c3.q();
            this.d.r(str3).k(qiu.b(), andi.a);
        }
    }
}
