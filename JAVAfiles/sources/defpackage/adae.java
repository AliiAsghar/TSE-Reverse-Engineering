package defpackage;

import android.net.Network;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.IWearableService;
import com.google.android.gms.wearable.internal.WearableListenerStubImpl;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import j$.util.Map;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adae {
    public final Object a;

    public adae(Object obj) {
        this.a = obj;
    }

    public static adae h(ackc ackcVar) {
        abhb.a(ackcVar, "dataItem must not be null");
        return new adae(ackcVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    public final byte[] a(String str, LocationInformation locationInformation) {
        ?? r0 = ((adta) this.a).a;
        String str2 = locationInformation.a;
        double d = locationInformation.d;
        double d2 = locationInformation.c;
        double d3 = locationInformation.e;
        long j = locationInformation.f;
        adsz adszVar = (adsz) r0.b();
        adszVar.b = str;
        adszVar.a().a().a().a().add(new adxy(new adyn(Double.valueOf(d), Double.valueOf(d2)), Double.valueOf(d3)));
        adszVar.a().a().a.d = new Date(j);
        if (!agkx.ae(str2)) {
            adszVar.a().b = str2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        adta.b(adszVar, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public final HttpURLConnection b(admx admxVar) {
        return c(null, admxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.net.HttpURLConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [javax.net.ssl.HttpsURLConnection] */
    public final HttpURLConnection c(Network network, admx admxVar) {
        ?? r7;
        URL url = new URL(admxVar.d);
        int i = 1;
        if (url.getProtocol().equals("https")) {
            if (network != null) {
                r7 = (HttpsURLConnection) network.openConnection(url);
            } else {
                r7 = (HttpsURLConnection) url.openConnection();
            }
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                URL url2 = r7.getURL();
                if (url2 == null) {
                    advr.q("URL is null. Cannot set security for provisioning server connection.", new Object[0]);
                } else {
                    advr.o("Creating a RCS provisioning connection for host: %s", url2.getHost());
                    sSLContext.init(null, null, null);
                    r7.setSSLSocketFactory(sSLContext.getSocketFactory());
                }
            } catch (Exception e) {
                advr.i(e, "Unable to set security for provisioning server connection", new Object[0]);
            }
        } else if (network != null) {
            r7 = (HttpURLConnection) network.openConnection(url);
        } else {
            r7 = (HttpURLConnection) url.openConnection();
        }
        r7.setReadTimeout(adnh.a);
        r7.setConnectTimeout(adnh.b);
        if (((Boolean) aczv.s().a.o.a()).booleanValue()) {
            r7.setRequestProperty("client_channel", (String) aczv.s().a.n.a());
        }
        r7.setRequestProperty("User-Agent", ((aduu) this.a).A());
        r7.setRequestProperty("Accept-Language", Locale.getDefault().toLanguageTag());
        int X = a.X(admxVar.e.c);
        if (X != 0) {
            i = X;
        }
        String str = "GET";
        switch (i - 1) {
            case 2:
                str = "POST";
                break;
            case 3:
                str = "PUT";
                break;
            case 4:
                str = "HEAD";
                break;
            case 5:
                str = "DELETE";
                break;
            case 6:
                str = "PATCH";
                break;
            case 7:
                str = "OPTIONS";
                break;
        }
        r7.setRequestMethod(str);
        Map.EL.forEach(admxVar.b(), new lui(r7, 11));
        return r7;
    }

    public final adit d(String str) {
        str.getClass();
        if (str.length() > 0) {
            if (((yjr) this.a).A(str)) {
                return new adit(str);
            }
            throw new IllegalArgumentException("Input is not in E164 number format.");
        }
        throw new IllegalArgumentException("Input is an empty String.");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    public final void e(IBinder iBinder) {
        synchronized (this.a) {
            IWearableService asInterface = IWearableService.Stub.asInterface(iBinder);
            aclt acltVar = new aclt();
            for (Map.Entry entry : this.a.entrySet()) {
                WearableListenerStubImpl wearableListenerStubImpl = (WearableListenerStubImpl) entry.getValue();
                try {
                    asInterface.addListener(acltVar, new AddListenerRequest(wearableListenerStubImpl));
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "onPostInitHandler: added: " + String.valueOf(entry.getKey()) + "/" + String.valueOf(wearableListenerStubImpl));
                    }
                } catch (RemoteException unused) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/" + String.valueOf(wearableListenerStubImpl));
                }
            }
        }
    }

    public final void f() {
        ((aciv) this.a).v(null);
    }

    public final void g(acio acioVar) {
        ((aciv) this.a).s(new acif(acioVar));
    }

    public adae(byte[] bArr, byte[] bArr2) {
        this.a = new aciv();
    }

    private adae(ackc ackcVar) {
        ackf w;
        ackcVar.a();
        ackc ackcVar2 = (ackc) ackcVar.d();
        byte[] c = ackcVar2.c();
        if (c == null && !ackcVar2.b().isEmpty()) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        }
        if (c == null) {
            w = new ackf();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                int size = ackcVar2.b().size();
                for (int i = 0; i < size; i++) {
                    ackd ackdVar = (ackd) ackcVar2.b().get(Integer.toString(i));
                    if (ackdVar != null) {
                        String f = ackdVar.f();
                        abhg.m(f);
                        arrayList.add(new Asset(null, f, null, null));
                    } else {
                        throw new IllegalStateException("Cannot find DataItemAsset referenced in data at " + i + " for " + ackcVar2.toString());
                    }
                }
                aozs aozsVar = aozs.a;
                apcc apccVar = apcc.a;
                w = actx.w(new acak((acmc) apag.parseFrom(acmc.a, c, aozs.a), arrayList));
            } catch (apba | NullPointerException e) {
                Log.w("DataItem", "Unable to parse datamap from dataItem. uri=" + String.valueOf(ackcVar2.a()) + ", data=" + Base64.encodeToString(c, 0));
                throw new IllegalStateException("Unable to parse datamap from dataItem.  uri=".concat(String.valueOf(String.valueOf(ackcVar2.a()))), e);
            }
        }
        this.a = w;
    }

    public adae(IObjectWrapper iObjectWrapper) {
        abhg.m(iObjectWrapper);
        this.a = iObjectWrapper;
    }

    public adae(yjr yjrVar) {
        yjrVar.getClass();
        this.a = yjrVar;
    }

    public adae() {
        this.a = new HashMap();
    }
}
