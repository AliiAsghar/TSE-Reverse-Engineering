package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiws {
    public final String a;
    public final ListenableFuture b;
    public final Executor c;
    public final algw d;
    public final agcp g;
    private final akqr h;
    private final aiwy j;
    public final Object e = new Object();
    private final andr i = new andr();
    public ListenableFuture f = null;

    public aiws(String str, ListenableFuture listenableFuture, aiwy aiwyVar, Executor executor, agcp agcpVar, algw algwVar, akqr akqrVar) {
        this.a = str;
        this.b = albo.bJ(listenableFuture);
        this.j = aiwyVar;
        this.c = new anew(executor);
        this.g = agcpVar;
        this.d = algwVar;
        this.h = akqrVar;
    }

    public final ListenableFuture a() {
        ListenableFuture listenableFuture;
        synchronized (this.e) {
            ListenableFuture listenableFuture2 = this.f;
            if (listenableFuture2 != null && listenableFuture2.isDone()) {
                try {
                    albo.bQ(this.f);
                } catch (ExecutionException unused) {
                    this.f = null;
                }
            }
            if (this.f == null) {
                this.f = albo.bJ(this.i.b(akto.c(new aarj(this, 13)), this.c));
            }
            listenableFuture = this.f;
        }
        return listenableFuture;
    }

    public final Object b(Uri uri) {
        try {
            try {
                akrh b = this.h.b("Read " + this.a);
                try {
                    InputStream inputStream = (InputStream) this.g.s(uri, new aivw(4));
                    try {
                        aiwy aiwyVar = this.j;
                        Object g = aiwyVar.a.getParserForType().g(inputStream, aiwyVar.b);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        b.close();
                        return g;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                if (!this.g.u(uri)) {
                    return this.j.a;
                }
                throw e;
            }
        } catch (IOException e2) {
            throw ahmc.an(this.g, uri, e2, this.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aiwd, java.lang.Object] */
    public final void c(Uri uri, Object obj) {
        Uri ac = ahmc.ac(uri, ".tmp");
        try {
            akrh b = this.h.b("Write " + this.a);
            try {
                ajur ajurVar = new ajur(null);
                try {
                    agcp agcpVar = this.g;
                    aiwc aiwcVar = new aiwc();
                    aiwcVar.a = new ajur[]{ajurVar};
                    OutputStream outputStream = (OutputStream) agcpVar.s(ac, aiwcVar);
                    try {
                        ((apbt) obj).writeTo(outputStream);
                        ajurVar.z();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        b.close();
                        this.g.t(ac, uri);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw ahmc.an(this.g, uri, e, this.a);
                }
            } finally {
            }
        } catch (IOException e2) {
            if (this.g.u(ac)) {
                try {
                    aogy B = this.g.B(ac);
                    B.a.i((Uri) B.f);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    public final ListenableFuture d(ancs ancsVar, Executor executor) {
        return this.i.b(akto.c(new mtz((Object) this, a(), ancsVar, executor, 8)), andi.a);
    }
}
