package defpackage;

import android.util.Base64;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pxk implements pxo {
    private final adje a;
    private int b = 0;
    private final hgj c;

    public pxk(adje adjeVar, hgj hgjVar) {
        this.a = adjeVar;
        this.c = hgjVar;
    }

    @Override // defpackage.pxo
    public final akul a() {
        if (this.b < 2) {
            alpc alpcVar = new alpc();
            alpcVar.g("User-Agent", this.c.l());
            if (this.b > 0) {
                InstantMessageConfiguration instantMessageConfiguration = ((Configuration) this.a.l().orElseThrow()).mInstantMessageConfiguration;
                alpcVar.g("Authorization", "Basic ".concat(String.valueOf(Base64.encodeToString((instantMessageConfiguration.mFtHttpContentServerUser + ":" + instantMessageConfiguration.mFtHttpContentServerPassword).getBytes(), 2))));
            }
            this.b++;
            return aktp.ag(new pxi(alpcVar.e()));
        }
        throw new pxq();
    }

    @Override // defpackage.pxo
    public final boolean b(UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (this.b < 2) {
            if (httpStatusCode == 401) {
                return true;
            }
            return false;
        }
        if (httpStatusCode != 200) {
            return true;
        }
        return false;
    }
}
