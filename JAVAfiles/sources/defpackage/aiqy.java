package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aiqy implements aiql {
    private final /* synthetic */ int a;
    private final no b;

    public aiqy(no noVar, int i) {
        this.a = i;
        this.b = noVar;
    }

    @Override // defpackage.aiql
    public final void a(String str, boolean z) {
        ListenableFuture listenableFuture;
        if (this.a != 0) {
            int i = 0;
            while (true) {
                no noVar = this.b;
                aiqq aiqqVar = (aiqq) noVar;
                if (i < aiqqVar.e.size()) {
                    aova aovaVar = (aova) aiqqVar.e.get(i);
                    int aT = a.aT(aovaVar.c);
                    if (aT != 0 && aT == 3 && aovaVar.b.equals(str)) {
                        noVar.q(i);
                        return;
                    }
                    i++;
                } else {
                    return;
                }
            }
        } else {
            no noVar2 = this.b;
            if (z) {
                aiqu aiquVar = (aiqu) noVar2;
                if (aiquVar.f.containsKey(str)) {
                    listenableFuture = (ListenableFuture) aiquVar.f.get(str);
                } else {
                    ListenableFuture b = aiquVar.h.b(str);
                    aiquVar.f.put(str, b);
                    listenableFuture = b;
                }
                albo.bR(listenableFuture, new adnx(noVar2, 12), aiqk.a);
                return;
            }
            aiqu aiquVar2 = (aiqu) noVar2;
            if (!aiquVar2.d.contains(str)) {
                aiquVar2.m(str);
            }
        }
    }
}
