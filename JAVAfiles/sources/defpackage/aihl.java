package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.security.KeyStore;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aihl implements aihm {
    public final /* synthetic */ KeyStore a;
    public final /* synthetic */ String b;

    public /* synthetic */ aihl(KeyStore keyStore, String str) {
        this.a = keyStore;
        this.b = str;
    }

    @Override // defpackage.aihm
    public final SSLContext a() {
        KeyManager[] keyManagerArr;
        char[] cArr = aihj.a;
        KeyStore keyStore = this.a;
        try {
            String defaultAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(defaultAlgorithm);
            keyManagerFactory.init(keyStore, aihj.a);
            advr.c("Returning key managers for %s", defaultAlgorithm);
            keyManagerArr = keyManagerFactory.getKeyManagers();
        } catch (Exception e) {
            advr.i(e, "Error while creating key managers: %s", e.getMessage());
            keyManagerArr = null;
        }
        if (keyManagerArr != null) {
            String str = this.b;
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            if (TextUtils.isEmpty(str)) {
                advr.q("No fingerprint, using default trust manager", new Object[0]);
                sSLContext.init(keyManagerArr, null, null);
            } else {
                sSLContext.init(keyManagerArr, new TrustManager[]{new aihh(str)}, null);
            }
            return sSLContext;
        }
        throw new IOException("Key managers could not be created!");
    }
}
