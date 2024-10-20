package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixr implements akfb {
    public final xnv a;
    public final anen b;
    public final miw c;
    public final armf d;
    public final armf e;
    public final alog f;
    public final AtomicReference g = new AtomicReference(akfa.a);
    private final anen h;
    private final armf i;
    private final Optional j;

    public ixr(xnv xnvVar, anen anenVar, anen anenVar2, miw miwVar, armf armfVar, armf armfVar2, armf armfVar3, alog alogVar, Optional optional) {
        this.a = xnvVar;
        this.b = anenVar;
        this.h = anenVar2;
        this.c = miwVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.i = armfVar3;
        this.f = alogVar;
        this.j = optional;
        d.t(!alogVar.isEmpty(), "Unable to create a conversation with empty Recipients.");
    }

    @Override // defpackage.akfb
    public final andc a() {
        akrh e = aktp.e("MessageDataSource#CreateConversationDatasource#LoadData");
        try {
            andc andcVar = new andc(albo.bI((akfa) this.g.get()));
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
        akul h;
        akrh e = aktp.e("MessageDataSource#CreateConversationDatasource#FetchAndStoreData");
        try {
            if (((pdm) this.i.b()).a()) {
                h = ((akul) this.j.map(new ivi(this, 7)).map(new ivi(this, 8)).orElse(aktp.ag(Optional.empty()))).i(new ici(this, 14), this.h);
            } else {
                h = this.c.k(this.f, null).h(new itk(this, 2), this.b);
            }
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
        return "create_conversation_data_source";
    }
}
