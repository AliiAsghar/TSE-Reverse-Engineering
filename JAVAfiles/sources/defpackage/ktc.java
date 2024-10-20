package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktc implements akfb {
    public final xnv a;
    public final armf b;
    public final AtomicReference c = new AtomicReference(akfa.a);
    public final armf d;
    public final kta e;
    public final armf f;
    public final Context g;
    private final anen h;
    private final anen i;

    public ktc(Context context, anen anenVar, anen anenVar2, xnv xnvVar, armf armfVar, armf armfVar2, armf armfVar3, kta ktaVar) {
        this.g = context;
        this.h = anenVar;
        this.i = anenVar2;
        this.a = xnvVar;
        this.b = armfVar;
        this.f = armfVar2;
        this.d = armfVar3;
        this.e = ktaVar;
    }

    @Override // defpackage.akfb
    public final andc a() {
        akrh e = aktp.e("MessageDataSource#ProblematicConversationDataSource#LoadData");
        try {
            andc andcVar = new andc(albo.bI((akfa) this.c.get()));
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
        akrh e = aktp.e("MessageDataSource#ProblematicConversationDataSource#FetchAndStoreData");
        try {
            kta ktaVar = this.e;
            akul h = aktp.ai(new ktb(this, ktaVar.d, ktaVar.c, 0), this.i).h(new its(14), this.h).h(new itk(this, 9), this.h);
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
        return "PROBLEMATIC_CONVERSATIONS_DATA";
    }
}
