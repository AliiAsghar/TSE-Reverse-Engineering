package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatj implements akfb {
    public final /* synthetic */ aatk a;

    public aatj(aatk aatkVar) {
        this.a = aatkVar;
    }

    @Override // defpackage.akfb
    public final andc a() {
        andc andcVar;
        akrh e = aktp.e("MessageDataSource#GalleryDataServiceImpl#LoadData");
        try {
            if (this.a.d.n()) {
                andc h = this.a.i.h(rvt.a(), this.a.c.d(), this.a.c.c(), null, "date_modified DESC");
                aatk aatkVar = this.a;
                Function function = aatkVar.h;
                andcVar = new andc(h.d(akto.g(new lpx(function, 6)), aatkVar.b).l());
            } else {
                int i = alog.d;
                andcVar = new andc(albo.bI(alsx.a));
            }
            andc d = andcVar.d(akto.g(new lpx(this, 7)), this.a.b).d(akto.g(new lpx(this, 8)), andi.a);
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
        akrh e = aktp.e("MessageDataSource#GalleryDataServiceImpl#FetchAndStoreData");
        try {
            ListenableFuture bI = albo.bI(null);
            e.close();
            return bI;
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
        return "gallery_content_key";
    }
}
