package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class admw {
    public Optional a;
    public Optional b;
    public int c;
    private apkn d;
    private String e;
    private String f;
    private String g;
    private apig h;
    private aozy i;

    public admw() {
        throw null;
    }

    public final admx a() {
        int i;
        String str;
        String str2;
        String str3;
        if (((Boolean) aczv.s().a.j.a()).booleanValue()) {
            String str4 = this.f;
            if (str4 != null) {
                b("rcs_engine_session_id", str4);
            } else {
                throw new IllegalStateException("Property \"provisioningSessionId\" has not been set");
            }
        }
        Uri.Builder buildUpon = Uri.parse(((apig) i().b).d).buildUpon();
        Optional optional = this.a;
        buildUpon.getClass();
        optional.ifPresent(new adlr(buildUpon, 8));
        Map.EL.forEach(DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((apig) i().b).e)), new lui(buildUpon, 13));
        String uri = buildUpon.build().toString();
        URL url = new URL(uri);
        if (!url.getProtocol().equals("https")) {
            if (url.getProtocol().equals("http")) {
                if (!((Boolean) acqa.e.a()).booleanValue()) {
                    apkn apknVar = this.d;
                    if (apknVar != null) {
                        if (!apknVar.equals(apkn.RCS_PROVISIONING_REQUEST_WITH_HE_STATE)) {
                            uri = uri.replace("http://", "https://");
                        }
                    } else {
                        throw new IllegalStateException("Property \"requestState\" has not been set");
                    }
                }
            } else {
                advr.g("Error converting url to secure link when building ProvisioningHttpRequest", new Object[0]);
                throw new MalformedURLException("Only HTTPS or HTTP protocols are allowed in the URL");
            }
        }
        d(uri);
        aozy aozyVar = this.i;
        if (aozyVar != null) {
            this.h = (apig) aozyVar.s();
        } else if (this.h == null) {
            this.h = (apig) apig.a.createBuilder().s();
        }
        apkn apknVar2 = this.d;
        if (apknVar2 != null && (i = this.c) != 0 && (str = this.e) != null && (str2 = this.f) != null && (str3 = this.g) != null) {
            return new admx(apknVar2, i, str, str2, str3, this.a, this.h, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" requestState");
        }
        if (this.c == 0) {
            sb.append(" provisioningEngineWorker");
        }
        if (this.e == null) {
            sb.append(" requestId");
        }
        if (this.f == null) {
            sb.append(" provisioningSessionId");
        }
        if (this.g == null) {
            sb.append(" constructedServerUrl");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            aozy i = i();
            apic apicVar = apic.a;
            java.util.Map unmodifiableMap = DesugarCollections.unmodifiableMap(((apig) i.b).f);
            if (unmodifiableMap.containsKey(str)) {
                apicVar = (apic) unmodifiableMap.get(str);
            }
            aozy builder = apicVar.toBuilder();
            if (!builder.b.isMutable()) {
                builder.u();
            }
            apic apicVar2 = (apic) builder.b;
            str2.getClass();
            apax apaxVar = apicVar2.b;
            if (!apaxVar.c()) {
                apicVar2.b = apag.mutableCopy(apaxVar);
            }
            apicVar2.b.add(str2);
            apic apicVar3 = (apic) builder.s();
            aozy i2 = i();
            apicVar3.getClass();
            if (!i2.b.isMutable()) {
                i2.u();
            }
            ((apig) i2.b).a().put(str, apicVar3);
        }
    }

    public final void c(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            aozy i = i();
            apie apieVar = apie.a;
            java.util.Map unmodifiableMap = DesugarCollections.unmodifiableMap(((apig) i.b).e);
            if (unmodifiableMap.containsKey(str)) {
                apieVar = (apie) unmodifiableMap.get(str);
            }
            aozy builder = apieVar.toBuilder();
            builder.bd(str2);
            i().bc(str, (apie) builder.s());
        }
    }

    public final void d(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null constructedServerUrl");
    }

    public final void e(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null provisioningSessionId");
    }

    public final void f(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null requestId");
    }

    public final void g(apkn apknVar) {
        if (apknVar != null) {
            this.d = apknVar;
            return;
        }
        throw new NullPointerException("Null requestState");
    }

    public final void h(int i) {
        aozy i2 = i();
        if (!i2.b.isMutable()) {
            i2.u();
        }
        apig apigVar = (apig) i2.b;
        apig apigVar2 = apig.a;
        apigVar.c = i - 1;
        apigVar.b |= 1;
    }

    public final aozy i() {
        if (this.i == null) {
            this.i = apig.a.createBuilder();
        }
        return this.i;
    }

    public admw(byte[] bArr) {
        this.a = Optional.empty();
        this.b = Optional.empty();
    }
}
