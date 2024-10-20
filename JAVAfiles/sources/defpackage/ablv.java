package defpackage;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablv implements Runnable {
    private static final apuv c = new apuv("RevokeAccessOperation", new String[0]);
    public final abti a;
    private final String b;

    public ablv(String str) {
        abhg.k(str);
        this.b = str;
        this.a = new abti(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.c;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.b).openConnection();
            httpURLConnection.setRequestProperty(assi.a, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.a;
            } else {
                c.l("Unable to revoke access!", new Object[0]);
            }
            c.k(a.bV(responseCode, "Response Code: "), new Object[0]);
        } catch (IOException e) {
            c.l("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (Exception e2) {
            c.l("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        }
        this.a.j(status);
    }
}
