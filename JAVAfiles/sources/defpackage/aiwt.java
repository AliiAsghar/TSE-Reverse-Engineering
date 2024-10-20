package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiwt implements ancr {
    public List a;
    public final /* synthetic */ aiwu b;

    public aiwt(aiwu aiwuVar) {
        this.b = aiwuVar;
    }

    @Override // defpackage.ancr
    public final ListenableFuture a() {
        aiwu aiwuVar = this.b;
        akrh b = aiwuVar.d.b("Initialize ".concat(String.valueOf(aiwuVar.a)));
        try {
            synchronized (this.b.c) {
                if (this.a == null) {
                    aiwu aiwuVar2 = this.b;
                    this.a = aiwuVar2.e;
                    aiwuVar2.e = Collections.emptyList();
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            asqc asqcVar = new asqc(this.b, null);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((ancs) it.next()).a(asqcVar));
                } catch (Exception e) {
                    arrayList.add(albo.bH(e));
                }
            }
            ListenableFuture a = albo.bX(arrayList).a(new aidu(this, 8), andi.a);
            b.b(a);
            b.close();
            return a;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
