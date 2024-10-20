package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zls implements akfb {
    public final /* synthetic */ int a;
    public final /* synthetic */ zlt b;

    public zls(zlt zltVar, int i) {
        this.a = i;
        this.b = zltVar;
    }

    @Override // defpackage.akfb
    public final andc a() {
        akrh e = aktp.e("MessageDataSource#SimMessagesDataService#LoadData");
        try {
            andc e2 = new andc(aktp.ai(new ijt(this, this.a, 7), this.b.e)).e(akto.e(new xsj(this, 4)), this.b.e).e(akto.e(new xsj(this, 3)), this.b.e);
            e.a(e2);
            e.close();
            return e2;
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
        akrh e = aktp.e("MessageDataSource#SimMessagesDataService#FetchAndStoreData");
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
    public final Object c() {
        return this.b.g;
    }
}
