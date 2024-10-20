package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ateu implements atff {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ateu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.atff
    public final void a() {
        List<String> list;
        int i = this.b;
        boolean z = false;
        if (i != 0) {
            int i2 = 17;
            Network network = 0;
            ReadableByteChannel readableByteChannel = null;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            atfc atfcVar = (atfc) this.a;
                            if (atfcVar.d.g.compareAndSet(1, 4)) {
                                atfo atfoVar = atfcVar.a;
                                atfe atfeVar = atfcVar.d;
                                atfoVar.onResponseStarted(atfeVar, atfeVar.o);
                                return;
                            }
                            return;
                        }
                        String str = atfe.a;
                        ((UploadDataProvider) this.a).close();
                        return;
                    }
                    Object obj = this.a;
                    atfe atfeVar2 = (atfe) obj;
                    if (atfeVar2.q == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    String str2 = "http/1.1";
                    int i3 = 0;
                    while (true) {
                        String headerFieldKey = atfeVar2.q.getHeaderFieldKey(i3);
                        if (headerFieldKey == null) {
                            break;
                        }
                        if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                            str2 = atfeVar2.q.getHeaderField(i3);
                        }
                        if (!headerFieldKey.startsWith("X-Android")) {
                            arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, atfeVar2.q.getHeaderField(i3)));
                        }
                        i3++;
                    }
                    int responseCode = atfeVar2.q.getResponseCode();
                    atfl atflVar = new atfl(new ArrayList(atfeVar2.f), responseCode, atfeVar2.q.getResponseMessage(), DesugarCollections.unmodifiableList(arrayList), str2);
                    if (responseCode >= 300 && responseCode < 400 && (list = atflVar.getAllHeaders().get("location")) != null) {
                        atfeVar2.i(1, 2, new aofo(obj, list.get(0), atflVar, i2));
                        return;
                    }
                    atfeVar2.o = atflVar;
                    atfeVar2.d();
                    if (responseCode >= 400) {
                        InputStream errorStream = atfeVar2.q.getErrorStream();
                        if (errorStream != null) {
                            readableByteChannel = ateo.a(errorStream);
                        }
                        atfeVar2.n = readableByteChannel;
                        atfeVar2.b.c();
                        return;
                    }
                    atfeVar2.n = ateo.a(atfeVar2.q.getInputStream());
                    atfeVar2.b.c();
                    return;
                }
                atfe atfeVar3 = (atfe) this.a;
                if (atfeVar3.g.get() == 8) {
                    return;
                }
                URL url = new URL(atfeVar3.m);
                HttpURLConnection httpURLConnection = atfeVar3.q;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    atfeVar3.q = null;
                }
                long j = atfeVar3.u;
                if (j != -1) {
                    Network[] allNetworks = ((ConnectivityManager) atfeVar3.r.d.getSystemService("connectivity")).getAllNetworks();
                    int length = allNetworks.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        Network network2 = allNetworks[i4];
                        if (network2.getNetworkHandle() == j) {
                            network = network2;
                            break;
                        }
                        i4++;
                    }
                    if (network != 0) {
                        atfeVar3.q = (HttpURLConnection) network.openConnection(url);
                    } else {
                        throw new atfh();
                    }
                } else {
                    atfeVar3.q = (HttpURLConnection) url.openConnection();
                }
                atfeVar3.q.setInstanceFollowRedirects(false);
                if (!atfeVar3.e.containsKey("User-Agent")) {
                    atfeVar3.e.put("User-Agent", atfeVar3.d);
                }
                for (Map.Entry entry : atfeVar3.e.entrySet()) {
                    atfeVar3.q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                atfeVar3.q.setRequestMethod(atfeVar3.i);
                atfn atfnVar = atfeVar3.j;
                if (atfnVar != null) {
                    atfeVar3.y = new atew(atfeVar3, atfeVar3.k, atfeVar3.c, atfeVar3.q, atfnVar);
                    atew atewVar = atfeVar3.y;
                    if (atfeVar3.f.size() == 1) {
                        z = true;
                    }
                    atewVar.a(new atev(atewVar, z, 1));
                    return;
                }
                atfeVar3.l = 10;
                atfeVar3.q.connect();
                atfeVar3.f();
                return;
            }
            Object obj2 = this.a;
            atew atewVar2 = (atew) obj2;
            atewVar2.c.read((UploadDataSink) obj2, atewVar2.d);
            atewVar2.b.execute(new arer(obj2, i2, network));
            return;
        }
        atew atewVar3 = (atew) this.a;
        if (atewVar3.i == null) {
            atewVar3.k.l = 10;
            atewVar3.h.setDoOutput(true);
            atewVar3.h.connect();
            atewVar3.k.l = 12;
            atewVar3.j = atewVar3.h.getOutputStream();
            atewVar3.i = Channels.newChannel(atewVar3.j);
        }
        atewVar3.a.set(0);
        atewVar3.b();
    }
}
