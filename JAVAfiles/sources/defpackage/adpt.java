package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adpt implements adqa {
    private static final acyz a = aczd.a(202254264);
    private final Context b;
    private final Configuration c;
    private final adpu d;

    public adpt(Context context, Configuration configuration, adpu adpuVar) {
        this.b = context;
        this.c = configuration;
        this.d = adpuVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:8|(3:9|10|(1:23))|(3:25|26|(1:35))|(3:37|38|(1:49))|(2:51|52)|(4:58|59|103|104)|63|64|(2:66|(2:68|(4:70|71|(2:73|(1:75)(1:(1:80)))(1:81)|76)))|82|83|(2:92|76)|93|94|95|(2:101|76)|102|103|104) */
    /* JADX WARN: Can't wrap try/catch for region: R(23:8|9|10|(1:23)|(3:25|26|(1:35))|37|38|(1:49)|(2:51|52)|(4:58|59|103|104)|63|64|(2:66|(2:68|(4:70|71|(2:73|(1:75)(1:(1:80)))(1:81)|76)))|82|83|(2:92|76)|93|94|95|(2:101|76)|102|103|104) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:8|9|10|(1:23)|(3:25|26|(1:35))|37|38|(1:49)|51|52|(4:58|59|103|104)|63|64|(2:66|(2:68|(4:70|71|(2:73|(1:75)(1:(1:80)))(1:81)|76)))|82|83|(2:92|76)|93|94|95|(2:101|76)|102|103|104) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d9, code lost:
    
        defpackage.advr.s(r0, "Failed due to missing permission.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01b3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01b4, code lost:
    
        defpackage.advr.s(r0, "Failed due to missing permission.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x017c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x017d, code lost:
    
        defpackage.advr.s(r0, "Failed due to missing permission.", new java.lang.Object[0]);
        r5 = r5;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x0109. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x01d0 -> B:76:0x01e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x01a5 -> B:76:0x01e6). Please report as a decompilation issue!!! */
    @Override // defpackage.adqa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.adpo a() {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpt.a():adpo");
    }

    @Override // defpackage.adqa
    public final adpo b() {
        boolean z;
        adpo adpoVar = new adpo(this.d.a);
        boolean z2 = this.c.mServicesConfiguration.mChatAuth;
        adpoVar.e(z2);
        adpoVar.q(z2);
        adpoVar.n(true);
        InstantMessageConfiguration instantMessageConfiguration = this.c.mInstantMessageConfiguration;
        adpoVar.f(instantMessageConfiguration.mFtThumbnailSupported);
        adpoVar.k(this.c.mServicesConfiguration.mGeoLocPushAuth);
        if (this.c.mServicesConfiguration.mGeoLocPullAuth != 0) {
            z = true;
        } else {
            z = false;
        }
        adpoVar.j(z);
        adpoVar.i(true ^ TextUtils.isEmpty(instantMessageConfiguration.mFtHttpContentServerUri));
        adpoVar.g(adab.o());
        adpoVar.l(adab.p());
        adpoVar.n(false);
        return adpoVar;
    }
}
