package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiwk implements ancs {
    public final List a;
    public final Executor b;

    public aiwk(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ancs
    public final /* synthetic */ ListenableFuture a(Object obj) {
        int i = ((alsx) this.a).c;
        asqc asqcVar = (asqc) obj;
        ArrayList arrayList = new ArrayList(i);
        alur it = ((alog) this.a).iterator();
        while (it.hasNext()) {
            aiwp aiwpVar = (aiwp) it.next();
            arrayList.add(albo.bM(new aidu(aiwpVar, 7), aiwpVar.b));
        }
        ancs d = akto.d(new vei(this, arrayList, i, 5));
        akqr akqrVar = ((aiwu) asqcVar.a).d;
        andi andiVar = andi.a;
        akqrVar.a();
        return ancj.g(ahmc.ad(ancj.g(albo.bJ(((aiwu) asqcVar.a).b.c()), akto.d(new xrd(asqcVar, d, andiVar, 16, (short[]) null)), andi.a)), akto.d(new vei(this, i, arrayList, 6)), andi.a);
    }
}
