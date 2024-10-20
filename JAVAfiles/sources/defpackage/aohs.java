package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Supplier;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aohs {
    public Object a;
    public final Object b;

    public aohs(aihc aihcVar) {
        this.b = new aihb(aihcVar);
    }

    public static aohs I(String str, Supplier supplier) {
        aohs J = J(str);
        akya akyaVar = new akya(19);
        int i = akxy.a;
        J.o("identifier", akyaVar);
        J.o("name", new akya(20));
        return J;
    }

    public static aohs J(String str) {
        aohs aohsVar = new aohs();
        akyh akyhVar = new akyh(str, 7);
        int i = akxy.a;
        aohsVar.o("@type", akyhVar);
        aohsVar.a = new albo();
        return aohsVar;
    }

    private final File K() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = new File(((aodi) this.b).a().getFilesDir(), "PersistedInstallation." + ((aodi) this.b).f() + ".json");
                }
            }
        }
        return (File) this.a;
    }

    private final akrl L() {
        if (akqj.u()) {
            return akrl.d(aktp.k((Context) this.b));
        }
        return akrk.a;
    }

    private final String M(String str) {
        return str + " " + this.b.getClass().getSimpleName();
    }

    private final synchronized Context N() {
        Object createDeviceProtectedStorageContext;
        if (this.a == null) {
            createDeviceProtectedStorageContext = ((Context) this.b).createDeviceProtectedStorageContext();
            if (createDeviceProtectedStorageContext == null) {
                createDeviceProtectedStorageContext = this.b;
            }
            this.a = createDeviceProtectedStorageContext;
        }
        return (Context) this.a;
    }

    private final File O(int i, int i2) {
        Object obj;
        if (i2 == 1) {
            obj = N();
        } else {
            obj = this.b;
        }
        if (i - 1 != 0) {
            return ((Context) obj).getCacheDir();
        }
        return ((Context) obj).getFilesDir();
    }

    private final boolean P() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public static apde f(String str) {
        aozy createBuilder = apde.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apde apdeVar = (apde) createBuilder.b;
        str.getClass();
        apdeVar.b = 3;
        apdeVar.c = str;
        return (apde) createBuilder.s();
    }

    public static apde g(apcr apcrVar) {
        aozy createBuilder = apde.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apde apdeVar = (apde) createBuilder.b;
        apcrVar.getClass();
        apdeVar.c = apcrVar;
        apdeVar.b = 5;
        return (apde) createBuilder.s();
    }

    public static final String u(String str, View view) {
        String str2 = (String) view.getTag(R.id.tiktok_event_internal_trace);
        if (str2 == null) {
            str2 = view.getClass().getSimpleName();
        }
        return a.co(str2, str, " ");
    }

    public static final void v(View view, String str) {
        view.setTag(R.id.tiktok_event_internal_trace, str);
    }

    public final File A(aknr aknrVar) {
        return O(aknrVar.a, aknrVar.b);
    }

    public final Uri B(aknr aknrVar, String str) {
        String str2;
        String concat;
        int i = aknrVar.a - 1;
        if (aknrVar.b == 1) {
            str2 = "directboot-";
        } else {
            str2 = "";
        }
        if (i != 0) {
            concat = str2.concat("cache");
        } else {
            concat = str2.concat("files");
        }
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return new Uri.Builder().scheme("android").authority(((Context) this.b).getPackageName()).path(a.cg(str, concat, "/", "/")).build();
    }

    public final void C(akfb akfbVar, akgh akghVar) {
        aiut.c();
        albo.U(!(akghVar instanceof akey), "Callbacks that implement BackgroundCallbacks must be registered with subscribeWithBackground().");
        ((akbl) this.b).execute(new adub(this, akfbVar, akghVar, 13));
    }

    public final void D(akfb akfbVar, akgd akgdVar, akgh akghVar) {
        aiut.c();
        albo.U(!(akghVar instanceof akey), "Callbacks that implement BackgroundCallbacks must be registered with subscribeWithBackground().");
        ((akbl) this.b).execute(new uju(this, akfbVar, akgdVar, akghVar, 11));
    }

    public final InputStream E() {
        if (P() && !((Socket) this.a).isClosed()) {
            return ((Socket) this.a).getInputStream();
        }
        throw new IOException("Connection not opened");
    }

    public final OutputStream F() {
        if (P() && !((Socket) this.a).isClosed()) {
            return ((Socket) this.a).getOutputStream();
        }
        throw new IOException("Connection not opened");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [aihe, java.lang.Object] */
    public final void G() {
        if (P() && !((Socket) this.a).isClosed()) {
            ((Socket) this.a).close();
            this.b.a().ifPresent(new aavc(20));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aihe, java.lang.Object] */
    public final void H() {
        this.a = this.b.b();
    }

    public final aohu a() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(K());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        aoht a = aohu.a();
        a.a = optString;
        a.c(new int[]{1, 2, 3, 4, 5}[optInt]);
        a.b = optString2;
        a.c = optString3;
        a.d(optLong);
        a.b(optLong2);
        a.d = optString4;
        return a.a();
    }

    public final void b(aohu aohuVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aohuVar.a);
            int i = aohuVar.g;
            int i2 = i - 1;
            if (i != 0) {
                jSONObject.put("Status", i2);
                jSONObject.put("AuthToken", aohuVar.b);
                jSONObject.put("RefreshToken", aohuVar.c);
                jSONObject.put("TokenCreationEpochInSecs", aohuVar.e);
                jSONObject.put("ExpiresInSecs", aohuVar.d);
                jSONObject.put("FisError", aohuVar.f);
                File createTempFile = File.createTempFile("PersistedInstallation", "tmp", ((aodi) this.b).a().getFilesDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
                fileOutputStream.close();
                if (createTempFile.renameTo(K())) {
                    return;
                } else {
                    throw new IOException("unable to rename the tmpfile to PersistedInstallation");
                }
            }
            throw null;
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final aofz c() {
        Map unmodifiableMap;
        ?? r1 = this.a;
        if (r1 == 0) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap((Map) r1));
        }
        return new aofz((String) this.b, unmodifiableMap);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    public final void d(Annotation annotation) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(aogh.class, annotation);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    public final akye e() {
        Optional.ofNullable(this.a);
        return new akyj(this.b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    public final void h(String str, Function function, akxu akxuVar) {
        this.b.add(new akxv(str, function, akxuVar));
    }

    public final void i(Function function) {
        h("duration", new akyh(function, 6), new akyf());
    }

    public final void j(String str, Function function) {
        h(str, new akyh(function, 8), new akyf());
    }

    public final void k(String str, Function function) {
        h(str, new akyh(function, 4), new akyf());
    }

    public final void l(String str, Function function) {
        h(str, new agoq(function, 17), new akyf());
    }

    public final void m(String str, Function function, Function function2) {
        h(str, new agpp(function, function2, 3, null), new akyf());
    }

    public final void n(String str, Function function, akye akyeVar) {
        h(str, new agpp(function, akyeVar, 4), new akyf());
    }

    public final void o(String str, Function function) {
        h(str, new agoq(function, 20), new akyf());
    }

    public final void p(String str, Function function) {
        h(str, new akyh(function, 0), new akyf());
    }

    public final void q(String str, Function function, akye akyeVar) {
        m(str, function, new agoq(akyeVar, 18));
    }

    @Deprecated
    public final void r(View view, View.OnClickListener onClickListener) {
        view.setOnClickListener(new akwb(this, new akdg(13), onClickListener, 0));
    }

    public final void s(View view, akvv akvvVar) {
        r(view, new ajeg(akvvVar, 6));
    }

    public final void t(View view, alhr alhrVar) {
        r(view, new ajeg(alhrVar, 7));
    }

    public final aksa w(Intent intent) {
        akrl akrlVar;
        aksa akqhVar;
        if (intent != null && aktp.p(intent) != null) {
            akrlVar = akrl.d(aktp.k((Context) this.b));
            akrlVar.getClass();
        } else {
            akrlVar = akrk.a;
            akrlVar.getClass();
        }
        Object obj = this.b;
        akry c = akqj.c();
        String concat = String.valueOf(obj.getClass().getName()).concat(".onBind");
        if (intent == null) {
            akqhVar = aktp.q((Service) obj, concat);
        } else {
            akry p = aktp.p(intent);
            if (p == null) {
                akqhVar = aktp.q((Service) obj, concat);
            } else {
                akqj.g(p);
                akqhVar = new akqh(5);
            }
        }
        return new akrd(aktp.f(M("onBind"), akrlVar), akqhVar, c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aksa x() {
        final akrc akrcVar;
        akrl L = L();
        final akry c = akqj.c();
        if (!akqj.u()) {
            akry f = akqj.f();
            if (f != null) {
                akpp akppVar = new akpp(2);
                akqj.g(f);
                akrj b = akrl.b();
                b.a(akrt.c, akppVar);
                this.a = aktp.f("Creating ".concat(String.valueOf(this.b.getClass().getSimpleName())), ((akrl) b).f());
                akrcVar = f;
            } else {
                Object obj = this.b;
                akrcVar = aktp.j((Context) obj).c("Creating ".concat(String.valueOf(obj.getClass().getSimpleName())), akrt.a);
            }
        } else {
            akrcVar = null;
        }
        final akrh f2 = aktp.f(M("onCreate"), L);
        return new aksa() { // from class: akre
            /* JADX WARN: Type inference failed for: r0v2, types: [aksa, java.lang.Object] */
            @Override // defpackage.aksa, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                f2.close();
                ?? r0 = aohs.this.a;
                if (r0 != 0) {
                    r0.close();
                }
                aksa aksaVar = akrcVar;
                if (aksaVar != null) {
                    aksaVar.close();
                }
                akqj.g(c);
            }
        };
    }

    public final aksa y() {
        akrc akrcVar;
        akrl L = L();
        akry c = akqj.c();
        if (!akqj.u()) {
            Object obj = this.b;
            akrcVar = aktp.j((Context) obj).c("Destroying ".concat(String.valueOf(obj.getClass().getSimpleName())), akrt.a);
        } else {
            akrcVar = null;
        }
        return new akrd(aktp.f(M("onDestroy"), L), akrcVar, c);
    }

    public final alpt z() {
        return alpt.t(O(1, 2), O(1, 1), O(2, 2), O(2, 1));
    }

    public aohs(aihf aihfVar, aihd aihdVar, String str, int i, Optional optional) {
        this.b = new aiha(aihfVar, aihdVar, str, i, optional);
    }

    public aohs(Object obj) {
        this.b = obj;
    }

    public aohs(Object obj, byte[] bArr) {
        this.b = obj;
    }

    public aohs(String str) {
        this.a = null;
        this.b = str;
    }

    private aohs() {
        this.b = new ArrayList();
    }

    public aohs(Context context, byte[] bArr) {
        this.a = new aivk();
        ahmc.af(context != null, "Context cannot be null", new Object[0]);
        this.b = context.getApplicationContext();
    }

    public aohs(cg cgVar, Executor executor) {
        akbl akblVar = new akbl(executor, true, false);
        this.b = akblVar;
        akblVar.c();
        cgVar.N().c(new akuj(new akgk(this, cgVar)));
    }
}
