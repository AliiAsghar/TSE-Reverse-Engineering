package defpackage;

import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hul implements hnl {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public hul(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [hqa, java.lang.Object] */
    @Override // defpackage.hnl
    public final /* synthetic */ hpt a(Object obj, int i, int i2, hnj hnjVar) {
        boolean z;
        huj hujVar;
        hyl hylVar;
        if (this.a != 0) {
            hpt c = ((hvb) this.b).c((Uri) obj, hnjVar);
            if (c == null) {
                return null;
            }
            return htx.a(this.c, ((huy) c).c(), i, i2);
        }
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof huj) {
            hujVar = (huj) inputStream;
            z = false;
        } else {
            z = true;
            hujVar = new huj(inputStream, (hqh) this.c);
        }
        synchronized (hyl.a) {
            hylVar = (hyl) hyl.a.poll();
        }
        if (hylVar == null) {
            hylVar = new hyl();
        }
        hylVar.b = hujVar;
        hys hysVar = new hys(hylVar);
        huk hukVar = new huk(hujVar, hylVar);
        try {
            Object obj2 = this.b;
            hpt a = ((htv) obj2).a(new huf(hysVar, ((htv) obj2).f, ((htv) obj2).g, 0), i, i2, hnjVar, hukVar);
            hylVar.a();
            if (z) {
                hujVar.b();
            }
            return a;
        } catch (Throwable th) {
            hylVar.a();
            if (z) {
                hujVar.b();
            }
            throw th;
        }
    }

    @Override // defpackage.hnl
    public final /* synthetic */ boolean b(Object obj, hnj hnjVar) {
        if (this.a != 0) {
            return "android.resource".equals(((Uri) obj).getScheme());
        }
        return true;
    }
}
