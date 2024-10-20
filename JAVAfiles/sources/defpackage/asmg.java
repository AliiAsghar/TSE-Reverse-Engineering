package defpackage;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.util.Log;
import com.google.android.rcs.client.messaging.AutoValue_CreateGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.data.AutoValue_MessageReceipt;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asmg {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public asmg(ajpz ajpzVar) {
        this.d = ajpzVar.a;
        this.b = ajpzVar.b;
        this.a = ajpzVar.c;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [javax.microedition.khronos.egl.EGL10, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [javax.microedition.khronos.egl.EGL10, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [javax.microedition.khronos.egl.EGL10, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [javax.microedition.khronos.egl.EGL10, java.lang.Object] */
    private final void L(EGLContext eGLContext, int i) {
        int i2;
        EGLConfig eGLConfig;
        String str;
        if (i == 3) {
            i2 = 64;
        } else {
            i2 = 4;
        }
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12352, i2, 12339, 5, 12344};
        int[] iArr2 = (int[]) this.d;
        if (this.b.eglChooseConfig((EGLDisplay) this.a, iArr, null, 0, iArr2)) {
            int i3 = iArr2[0];
            if (i3 > 0) {
                EGLConfig[] eGLConfigArr = new EGLConfig[i3];
                if (this.b.eglChooseConfig((EGLDisplay) this.a, iArr, eGLConfigArr, i3, iArr2)) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < i3) {
                            eGLConfig = eGLConfigArr[i4];
                            int M = M(eGLConfig, 12324);
                            int M2 = M(eGLConfig, 12323);
                            int M3 = M(eGLConfig, 12322);
                            int M4 = M(eGLConfig, 12321);
                            if (M == 8 && M2 == 8 && M3 == 8 && M4 == 8) {
                                break;
                            } else {
                                i4++;
                            }
                        } else {
                            eGLConfig = null;
                            break;
                        }
                    }
                    if (eGLConfig == null) {
                        eGLConfig = eGLConfigArr[0];
                    }
                    this.e = eGLConfig;
                    if (eGLConfig != null) {
                        EGLContext eglCreateContext = this.b.eglCreateContext((EGLDisplay) this.a, eGLConfig, eGLContext, new int[]{12440, i, 12344});
                        this.c = eglCreateContext;
                        if (eglCreateContext != null && eglCreateContext != EGL10.EGL_NO_CONTEXT) {
                            return;
                        }
                        int eglGetError = this.b.eglGetError();
                        String hexString = Integer.toHexString(eglGetError);
                        StringBuilder sb = new StringBuilder("Could not create GL context: EGL error: 0x");
                        sb.append(hexString);
                        if (eglGetError == 12294) {
                            str = ": parent context uses a different version of OpenGL";
                        } else {
                            str = "";
                        }
                        sb.append(str);
                        throw new RuntimeException(sb.toString());
                    }
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            throw new IllegalArgumentException("No configs match requested attributes");
        }
        throw new IllegalArgumentException("eglChooseConfig failed");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [javax.microedition.khronos.egl.EGL10, java.lang.Object] */
    private final int M(EGLConfig eGLConfig, int i) {
        if (!this.b.eglGetConfigAttrib((EGLDisplay) this.a, eGLConfig, i, (int[]) this.d)) {
            return 0;
        }
        return ((int[]) this.d)[0];
    }

    public final CreateGroupRequest A() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4 = this.c;
        if (obj4 != null && (obj = this.d) != null && (obj2 = this.a) != null && (obj3 = this.b) != null) {
            return new AutoValue_CreateGroupRequest((PendingIntent) obj4, (String) obj, (String) obj2, (alog) obj3, (Optional) this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" intent");
        }
        if (this.d == null) {
            sb.append(" id");
        }
        if (this.a == null) {
            sb.append(" subject");
        }
        if (this.b == null) {
            sb.append(" member");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void B(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void C(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.c = pendingIntent;
            return;
        }
        throw new NullPointerException("Null intent");
    }

    public final void D(List list) {
        this.b = alog.n(list);
    }

    public final void E(aozb aozbVar) {
        this.e = Optional.of(aozbVar);
    }

    public final void F(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null subject");
    }

    public final ContentValues G() {
        Object obj = this.c;
        if (obj != null) {
            return (ContentValues) obj;
        }
        throw new IllegalStateException("Property \"values\" has not been set");
    }

    public final void H(List list) {
        this.e = alog.n(list);
    }

    public final void I(List list) {
        this.d = alog.n(list);
    }

    public final accw J(int i) {
        this.b = algw.i(Integer.valueOf(i));
        return K();
    }

    public final accw K() {
        Object obj = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.a;
        algw algwVar = (algw) obj4;
        algw algwVar2 = (algw) obj3;
        return new accw((algw) obj, (algw) obj2, algwVar2, algwVar, (algw) this.e);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    public final asmh a() {
        Map unmodifiableMap;
        Object obj = this.a;
        if (obj != null) {
            Object obj2 = this.b;
            aslv h = ((asuo) this.c).h();
            Object obj3 = this.d;
            ?? r3 = this.e;
            byte[] bArr = asmt.a;
            r3.getClass();
            if (r3.isEmpty()) {
                unmodifiableMap = arnw.a;
            } else {
                unmodifiableMap = DesugarCollections.unmodifiableMap(new LinkedHashMap((Map) r3));
                unmodifiableMap.getClass();
            }
            return new asmh((aslx) obj, (String) obj2, h, (asmk) obj3, unmodifiableMap);
        }
        throw new IllegalStateException("url == null");
    }

    public final void b(String str) {
        ((asuo) this.c).l(str);
    }

    public final void c(String str, String str2) {
        str2.getClass();
        ((asuo) this.c).k(str, str2);
    }

    public final void d(String str, asmk asmkVar) {
        str.getClass();
        if (str.length() > 0) {
            if (asmkVar == null) {
                if (d.F(str, "POST") || d.F(str, "PUT") || d.F(str, "PATCH") || d.F(str, "PROPPATCH") || d.F(str, "REPORT")) {
                    throw new IllegalArgumentException(a.bW(str, "method ", " must have a request body."));
                }
            } else if (!aotl.ag(str)) {
                throw new IllegalArgumentException(a.bW(str, "method ", " must not have a request body."));
            }
            this.b = str;
            this.d = asmkVar;
            return;
        }
        throw new IllegalArgumentException("method.isEmpty() == true");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map, java.lang.Object] */
    public final void e(Class cls, Object obj) {
        cls.getClass();
        if (obj == null) {
            this.e.remove(cls);
            return;
        }
        if (this.e.isEmpty()) {
            this.e = new LinkedHashMap();
        }
        ?? r0 = this.e;
        Object cast = cls.cast(obj);
        cast.getClass();
        r0.put(cls, cast);
    }

    public final void f(aslx aslxVar) {
        aslxVar.getClass();
        this.a = aslxVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [javax.microedition.khronos.egl.EGL10, java.lang.Object] */
    public final void g(String str) {
        int eglGetError = this.b.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [javax.microedition.khronos.egl.EGL10, java.lang.Object] */
    public final void h(EGLSurface eGLSurface, EGLSurface eGLSurface2) {
        if (this.b.eglMakeCurrent((EGLDisplay) this.a, eGLSurface, eGLSurface2, (EGLContext) this.c)) {
        } else {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [javax.microedition.khronos.egl.EGL10, java.lang.Object] */
    public final void i() {
        if (this.b.eglMakeCurrent((EGLDisplay) this.a, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT)) {
        } else {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [javax.microedition.khronos.egl.EGL10, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [javax.microedition.khronos.egl.EGL10, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [javax.microedition.khronos.egl.EGL10, java.lang.Object] */
    public final void j() {
        if (this.a != EGL10.EGL_NO_DISPLAY) {
            this.b.eglMakeCurrent((EGLDisplay) this.a, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            this.b.eglDestroyContext((EGLDisplay) this.a, (EGLContext) this.c);
            this.b.eglTerminate((EGLDisplay) this.a);
        }
        this.a = EGL10.EGL_NO_DISPLAY;
        this.c = EGL10.EGL_NO_CONTEXT;
        this.e = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [javax.microedition.khronos.egl.EGL10, java.lang.Object] */
    public final void k(EGLSurface eGLSurface) {
        this.b.eglDestroySurface((EGLDisplay) this.a, eGLSurface);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [javax.microedition.khronos.egl.EGL10, java.lang.Object] */
    public final EGLSurface l() {
        ?? r1 = this.b;
        Object obj = this.a;
        EGLDisplay eGLDisplay = (EGLDisplay) obj;
        EGLSurface eglCreatePbufferSurface = r1.eglCreatePbufferSurface(eGLDisplay, (EGLConfig) this.e, new int[]{12375, 1, 12374, 1, 12344});
        g("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }

    public final MessageReceipt m() {
        Object obj;
        Object obj2;
        Object obj3;
        if (o().isPresent()) {
            if (!n().g.contains(o().get())) {
                t(ajqu.UNKNOWN);
                r(n().f);
            }
        } else {
            r(n().f);
        }
        if (((Optional) this.d).isPresent() && ((aozb) ((Optional) this.d).get()).G()) {
            this.d = Optional.empty();
        }
        Object obj4 = this.a;
        if (obj4 != null && (obj = this.c) != null && (obj2 = this.e) != null && (obj3 = this.b) != null) {
            return new AutoValue_MessageReceipt((ajqu) obj4, (String) obj, (Instant) obj2, (String) obj3, (Optional) this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" messageId");
        }
        if (this.e == null) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final ajqu n() {
        Object obj = this.a;
        if (obj != null) {
            return (ajqu) obj;
        }
        throw new IllegalStateException("Property \"type\" has not been set");
    }

    public final Optional o() {
        Object obj = this.b;
        if (obj == null) {
            return Optional.empty();
        }
        return Optional.of(obj);
    }

    public final void p(aozb aozbVar) {
        this.d = Optional.of(aozbVar);
    }

    public final void q(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null messageId");
    }

    public final void r(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final void s(Instant instant) {
        if (instant != null) {
            this.e = instant;
            return;
        }
        throw new NullPointerException("Null timestamp");
    }

    public final void t(ajqu ajquVar) {
        if (ajquVar != null) {
            this.a = ajquVar;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final ajpz u() {
        Object obj = this.e;
        if (obj != null) {
            this.d = ((alnp) obj).b();
        } else if (this.d == null) {
            this.d = alsw.a;
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            this.b = ((alob) obj2).g();
        } else if (this.b == null) {
            int i = alog.d;
            this.b = alsx.a;
        }
        Object obj3 = this.a;
        if (obj3 != null) {
            return new ajpz((alnr) this.d, (alog) this.b, (ajqa) obj3);
        }
        throw new IllegalStateException("Missing required properties: content");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final alnp v() {
        if (this.e == null) {
            if (this.d == null) {
                this.e = new alnp();
            } else {
                alnp alnpVar = new alnp();
                this.e = alnpVar;
                alnpVar.e(this.d);
                this.d = null;
            }
        }
        return (alnp) this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Iterable] */
    public final void w(ajqb ajqbVar) {
        if (this.c == null) {
            if (this.b == null) {
                this.c = new alob();
            } else {
                alob alobVar = new alob();
                this.c = alobVar;
                alobVar.j(this.b);
                this.b = null;
            }
        }
        ((alob) this.c).h(ajqbVar);
    }

    public final void x(String str, String str2) {
        arbj a = ajqb.a();
        a.I("urn:ietf:params:cpim-headers:");
        a.H(str);
        a.J(str2);
        w(a.G());
    }

    public final void y(String str, String str2, String str3) {
        arbj a = ajqb.a();
        a.I(str);
        a.H(str2);
        a.J(str3);
        w(a.G());
    }

    public final void z(String str, String str2) {
        v().c(str, str2);
    }

    public asmg(byte[] bArr, char[] cArr) {
        alfd alfdVar = alfd.a;
        this.b = alfdVar;
        this.d = alfdVar;
        this.c = alfdVar;
        this.a = alfdVar;
        this.e = alfdVar;
    }

    public asmg(char[] cArr) {
    }

    public asmg(byte[] bArr, byte[] bArr2) {
        this.d = Optional.empty();
    }

    public asmg(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.e = Optional.empty();
    }

    public asmg(Object obj) {
        this(obj, (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [javax.microedition.khronos.egl.EGL10, java.lang.Object] */
    public asmg(Object obj, byte[] bArr) {
        this.a = EGL10.EGL_NO_DISPLAY;
        this.e = null;
        this.c = EGL10.EGL_NO_CONTEXT;
        this.d = new int[1];
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.a = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (this.b.eglInitialize((EGLDisplay) this.a, new int[2])) {
                obj = obj == null ? EGL10.EGL_NO_CONTEXT : obj;
                try {
                    L((EGLContext) obj, 3);
                    return;
                } catch (RuntimeException e) {
                    Log.w("EglManager", "could not create GLES 3 context: ".concat(e.toString()));
                    L((EGLContext) obj, 2);
                    return;
                }
            }
            throw new RuntimeException("eglInitialize failed");
        }
        throw new RuntimeException("eglGetDisplay failed");
    }

    public asmg() {
        this.e = new LinkedHashMap();
        this.b = "GET";
        this.c = new asuo((char[]) null);
    }

    public asmg(asmh asmhVar) {
        Object s;
        this.e = new LinkedHashMap();
        this.a = asmhVar.a;
        this.b = asmhVar.b;
        this.d = asmhVar.d;
        if (asmhVar.e.isEmpty()) {
            s = new LinkedHashMap();
        } else {
            s = aqjn.s(asmhVar.e);
        }
        this.e = s;
        this.c = asmhVar.c.e();
    }
}
