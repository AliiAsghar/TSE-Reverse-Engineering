package defpackage;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kku implements akfb {
    public final anen a;
    public final xnv b;
    public final Map c;
    public final Bundle d;
    public final AtomicReference e = new AtomicReference(akfa.a);
    private final anen f;

    public kku(anen anenVar, anen anenVar2, xnv xnvVar, Map map, Bundle bundle) {
        this.a = anenVar;
        this.f = anenVar2;
        this.b = xnvVar;
        this.c = map;
        this.d = bundle;
    }

    @Override // defpackage.akfb
    public final andc a() {
        akrh e = aktp.e("MessageDataSource#DonationDataSource#LoadData");
        try {
            andc andcVar = new andc(aktp.ag((akfa) this.e.get()));
            e.a(andcVar);
            e.close();
            return andcVar;
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
        akrh e = aktp.e("MessageDataSource#DonationDataSource#FetchAndStoreData");
        try {
            akrh e2 = aktp.e("DataDonationSource#getDonatableMessages");
            try {
                akul aj = aktp.aj(new ikm(this, 4), this.a);
                e2.b(aj);
                e2.close();
                akul h = aj.h(new itk(this, 5), this.f);
                e.b(h);
                e.close();
                return h;
            } finally {
            }
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
        return "DD_DATASOURCE_KEY";
    }
}
