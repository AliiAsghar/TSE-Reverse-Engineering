package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import j$.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiwh implements aiwg {
    private static boolean c = false;
    private final Context e;
    private final aivk f;
    private volatile boolean g = false;
    private annk h = null;
    public static final byte[] a = new byte[0];
    private static final Object d = new Object();
    public static final aivk b = aivk.a();

    public aiwh(Context context, aivk aivkVar) {
        this.e = context;
        this.f = aivkVar;
    }

    private static byte[] g(String str) {
        return Base64.decode(str, 2);
    }

    @Override // defpackage.aiwg
    public final InputStream a(Uri uri, InputStream inputStream) {
        aivg b2 = aivi.b(uri);
        f();
        try {
            if (b2.a().isEmpty()) {
                return this.h.a(inputStream, a);
            }
            aivh aivhVar = (aivh) b2.a().get(0);
            if (Objects.equals(aivhVar.a, "aes_gcm_key")) {
                return new aivu(new ahes(g(aivhVar.b), inputStream, 9, null));
            }
            if (Objects.equals(aivhVar.a, "aes_gcm_hkdf_key")) {
                try {
                    return ((annk) anme.C(ahmn.H(g(aivhVar.b))).h(anue.e, annk.class)).a(inputStream, a);
                } catch (IOException unused) {
                    throw new GeneralSecurityException("Parse keyset failed");
                }
            }
            throw new aivn(a.cp(aivhVar.a, "Unsupported decryption mode: "));
        } catch (GeneralSecurityException e) {
            throw new IOException("Failed to decrypt stream", e);
        }
    }

    @Override // defpackage.aiwg
    public final OutputStream b(Uri uri, OutputStream outputStream) {
        aivg b2 = aivi.b(uri);
        f();
        try {
            if (b2.a().isEmpty()) {
                return this.h.b(outputStream, a);
            }
            throw new aivn(a.cp(((aivh) b2.a().get(0)).a, "Unsupported encryption mode: "));
        } catch (GeneralSecurityException e) {
            throw new IOException("Failed to encrypt stream", e);
        }
    }

    @Override // defpackage.aiwg
    public final String c() {
        return "encrypt";
    }

    @Override // defpackage.aiwg
    public final /* synthetic */ OutputStream d(OutputStream outputStream) {
        if (outputStream != null) {
            outputStream.close();
        }
        throw new aivn("wrapForAppend not supported by encrypt");
    }

    public final void f() {
        if (!this.g) {
            synchronized (d) {
                if (!this.g) {
                    try {
                        Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
                        alob alobVar = new alob();
                        ahmc.ai(ahmc.ak(this.e), path);
                        path.appendPath("mobstore_encrypt");
                        Closeable closeable = (Closeable) new agcp(Arrays.asList(new aivb(this.f))).s(ahmc.ah(path, alobVar), new aivw(3));
                        try {
                            if (!c) {
                                aoai.a();
                                c = true;
                            }
                            Context context = this.e;
                            ansl anslVar = new ansl();
                            anslVar.c(context.getApplicationContext(), "aes128_gcm_hkdf_4kb", "mobstore_encrypt");
                            anslVar.f = (ahmn) anuj.a(new anyr(8));
                            anslVar.b("android-keystore://mobstore_encrypt");
                            this.h = (annk) anslVar.a().a().h(anue.e, annk.class);
                            if (closeable != null) {
                                closeable.close();
                            }
                            this.g = true;
                        } catch (Throwable th) {
                            if (closeable != null) {
                                try {
                                    closeable.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (GeneralSecurityException e) {
                        throw new IOException("Failed to initialize encryption", e);
                    }
                }
            }
        }
    }

    @Override // defpackage.aiwg
    public final /* synthetic */ void e() {
    }
}
