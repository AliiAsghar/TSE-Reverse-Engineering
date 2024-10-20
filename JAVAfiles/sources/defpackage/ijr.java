package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijr implements akfb {
    public final anen a;
    public final xnv b;
    public final prd c;
    public final lpg f;
    public final wfh g;
    private final anen h;
    private final ConversationIdType i;
    public akfa e = akfa.a;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public ijr(anen anenVar, anen anenVar2, xnv xnvVar, prd prdVar, wfh wfhVar, lpg lpgVar, ConversationIdType conversationIdType) {
        this.a = anenVar;
        this.h = anenVar2;
        this.b = xnvVar;
        this.c = prdVar;
        this.g = wfhVar;
        this.f = lpgVar;
        this.i = conversationIdType;
    }

    @Override // defpackage.akfb
    public final andc a() {
        akrh e = aktp.e("MessageDataSource#BusinessInfoDataSource#LoadData");
        try {
            andc andcVar = new andc(albo.bI(this.e));
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
        akrh e = aktp.e("MessageDataSource#BusinessInfoDataSource#FetchAndStoreData");
        try {
            akul h = aktp.ai(new gvk(hwr.s(this.i), 6), this.a).i(new ici(this, 8), this.h).h(new icj(this, 12), this.h);
            e.b(h);
            e.close();
            return h;
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
        return BusinessInfoDatabaseConstants.BusinessInfoTableConstants.TABLE_NAME;
    }
}
