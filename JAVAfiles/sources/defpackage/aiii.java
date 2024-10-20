package defpackage;

import android.net.Uri;
import j$.util.Objects;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.params.HttpParams;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiii {
    static final acyz a = acyy.b("file_transfer_http_socket_timeout");
    private static final DefaultHttpRequestRetryHandler b = new DefaultHttpRequestRetryHandler(0, false);

    public static final DefaultHttpClient a(String str) {
        DefaultHttpClient defaultHttpClient;
        Uri parse = Uri.parse(str);
        if (Objects.toString(parse.getScheme(), "").equals("http")) {
            defaultHttpClient = new DefaultHttpClient();
        } else {
            int port = parse.getPort();
            if (port <= 0) {
                port = 443;
            }
            try {
                advr.o("Creating a HTTPS client for host: %s on port: %d", parse.getHost(), Integer.valueOf(port));
                Scheme scheme = new Scheme("https", SSLSocketFactory.getSocketFactory(), port);
                defaultHttpClient = new DefaultHttpClient();
                defaultHttpClient.getConnectionManager().getSchemeRegistry().register(scheme);
            } catch (Exception e) {
                advr.s(e, "Unable to create custom secure http client", new Object[0]);
                defaultHttpClient = new DefaultHttpClient();
            }
        }
        defaultHttpClient.setHttpRequestRetryHandler(b);
        HttpParams params = defaultHttpClient.getParams();
        params.setIntParameter("http.connection.timeout", 15000);
        if (((Boolean) a.a()).booleanValue()) {
            params.setIntParameter("http.socket.timeout", 30000);
        }
        return defaultHttpClient;
    }
}
