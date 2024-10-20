package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxn implements akfb {
    final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public aaxn(zhn zhnVar, ajwt ajwtVar, int i) {
        this.c = i;
        this.a = zhnVar;
        this.b = ajwtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.akfb
    public final andc a() {
        if (this.c != 0) {
            zhn zhnVar = (zhn) this.a;
            return qjh.k(zhnVar.f, new uxs(zhnVar, (arpe) null, 17));
        }
        akrh e = aktp.e("MessageDataSource#MediaViewerDataServiceImpl#LoadData");
        try {
            Object obj = ((zrs) this.b).c;
            atsg atsgVar = (atsg) obj;
            andc h = atsgVar.h((Uri) this.a, rze.a, "", null, null);
            aaky aakyVar = new aaky(this.b, 13);
            andc d = new andc(h.d(akto.g(new lpx(aakyVar, 9)), ((zrs) this.b).d).l()).d(akto.g(new lpx(this, 10)), andi.a);
            e.a(d);
            e.close();
            return d;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akfb
    public final ListenableFuture b() {
        akul c;
        if (this.c != 0) {
            Object obj = this.b;
            zhn zhnVar = (zhn) this.a;
            c = qjh.c(zhnVar.g, arpj.a, arwf.a, new qnm(zhnVar, (ajwt) obj, (arpe) null, 3));
            return c;
        }
        akrh e = aktp.e("MessageDataSource#MediaViewerDataServiceImpl#FetchAndStoreData");
        try {
            akul ag = aktp.ag(null);
            e.close();
            return ag;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akfb
    public final /* synthetic */ Object c() {
        if (this.c != 0) {
            int i = zhl.a;
            return zhj.a;
        }
        return "chat_media_viewer_content_key";
    }

    public aaxn(zrs zrsVar, Uri uri, int i) {
        this.c = i;
        this.a = uri;
        this.b = zrsVar;
    }
}
