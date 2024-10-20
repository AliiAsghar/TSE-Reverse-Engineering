package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqrk {
    private static aqrk c;
    public Object a;
    public Object b;

    private aqrk() {
        this.a = null;
        this.b = null;
    }

    public static synchronized aqrk g() {
        aqrk aqrkVar;
        synchronized (aqrk.class) {
            if (c == null) {
                c = new aqrk();
            }
            aqrkVar = c;
        }
        return aqrkVar;
    }

    public final aqrm a() {
        if (this.b != null) {
            Object obj = this.a;
            aqrm aqrmVar = aqrm.a;
            for (Map.Entry entry : ((aqrm) obj).b.entrySet()) {
                if (!((IdentityHashMap) this.b).containsKey(entry.getKey())) {
                    ((IdentityHashMap) this.b).put((aqrl) entry.getKey(), entry.getValue());
                }
            }
            this.a = new aqrm((IdentityHashMap) this.b);
            this.b = null;
        }
        return (aqrm) this.a;
    }

    public final void b(aqrl aqrlVar, Object obj) {
        if (this.b == null) {
            this.b = new IdentityHashMap(1);
        }
        ((IdentityHashMap) this.b).put(aqrlVar, obj);
    }

    public final void c(SurfaceTexture surfaceTexture, int i, int i2) {
        if (surfaceTexture != null && (i == 0 || i2 == 0)) {
            throw new RuntimeException("ExternalTextureConverter: setSurfaceTexture dimensions cannot be zero");
        }
        ((aoxr) this.b).q.post(new uym(this, surfaceTexture, i, i2, 5));
    }

    public final boolean d(Context context) {
        boolean z;
        if (this.a == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.a = Boolean.valueOf(z);
        }
        if (!((Boolean) this.a).booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.a).booleanValue();
    }

    public final anqm e() {
        Object obj = this.a;
        if (obj != null) {
            if (this.b != null) {
                return new anqm(((Integer) obj).intValue(), (anql) this.b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public final void f(int i) {
        if (i != 32 && i != 48 && i != 64) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public final anoi h() {
        Object obj = this.a;
        if (obj != null) {
            if (this.b != null) {
                return new anoi(((Integer) obj).intValue(), (anoh) this.b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public final void i(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void j(anjk anjkVar) {
        if (anjkVar != null) {
            this.b = anjkVar;
            return;
        }
        throw new NullPointerException("Null role");
    }

    public final anja k() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 != null && (obj = this.a) != null) {
            return new anja((aozb) obj2, (anip) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" content");
        }
        if (this.a == null) {
            sb.append(" contentType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void l(aozb aozbVar) {
        if (aozbVar != null) {
            this.b = aozbVar;
            return;
        }
        throw new NullPointerException("Null content");
    }

    public final void m(anip anipVar) {
        if (anipVar != null) {
            this.a = anipVar;
            return;
        }
        throw new NullPointerException("Null contentType");
    }

    public aqrk(aqrm aqrmVar) {
        this.a = aqrmVar;
    }

    public aqrk(byte[] bArr) {
    }

    public aqrk(byte[] bArr, byte[] bArr2) {
        this.a = null;
        this.b = anql.c;
    }

    public aqrk(char[] cArr) {
        this.a = null;
        this.b = anoh.c;
    }

    public aqrk(EGLContext eGLContext) {
        this.a = null;
        aoxj aoxjVar = new aoxj(eGLContext);
        this.b = aoxjVar;
        aoxjVar.setName("ExternalTextureConverter");
        Object obj = new Object();
        ((aoxj) this.b).setUncaughtExceptionHandler(new aoxh(this, obj, 0));
        ((aoxj) this.b).start();
        try {
            Object obj2 = this.b;
            synchronized (((aoxr) obj2).o) {
                while (!((aoxr) obj2).m) {
                    ((aoxr) obj2).o.wait();
                }
            }
            if (!((aoxr) obj2).n) {
                synchronized (obj) {
                    while (this.a == null) {
                        obj.wait();
                    }
                }
            }
            ((aoxj) this.b).setUncaughtExceptionHandler(null);
            if (this.a != null) {
                Looper looper = ((aoxr) this.b).r;
                if (looper != null) {
                    looper.quitSafely();
                }
                throw new RuntimeException((Throwable) this.a);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.e("ExternalTextureConv", "thread was unexpectedly interrupted: ".concat(String.valueOf(e.getMessage())));
            throw new RuntimeException(e);
        }
    }
}
