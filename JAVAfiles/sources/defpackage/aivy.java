package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aivy implements aiuw {
    public boolean a = false;

    static {
        new AtomicInteger();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [aiwd, java.lang.Object] */
    @Override // defpackage.aiuw
    public final /* bridge */ /* synthetic */ Object a(aogy aogyVar) {
        if (this.a) {
            if (!aogyVar.z()) {
                return aogyVar.a.c((Uri) aogyVar.f);
            }
            throw new aivn("Short circuit would skip transforms.");
        }
        aivm aivmVar = new aivm(aivw.b(aogyVar));
        try {
            Closeable closeable = aivmVar.a;
            if (closeable instanceof aivd) {
                File b = ((aivd) closeable).b();
                aivmVar.close();
                return b;
            }
            throw new IOException("Not convertible and fallback to pipe is disabled.");
        } catch (Throwable th) {
            try {
                aivmVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
