package defpackage;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aipd implements aipi {
    final /* synthetic */ Map a;
    final /* synthetic */ aipl b;

    public aipd() {
        throw null;
    }

    @Override // defpackage.aipi
    public final void a(aipc aipcVar) {
        aipg aipgVar = aipcVar.a;
        Map map = this.a;
        aipj aipjVar = aipgVar.a;
        if (!map.containsKey(aipjVar)) {
            return;
        }
        aipj aipjVar2 = (aipj) this.a.get(aipjVar);
        if (this.b.c.a(aipjVar2)) {
            this.b.f((Throwable) aipcVar.a.b().orElseGet(new agmr(11)));
        } else {
            this.b.g(aipjVar2);
        }
    }

    public aipd(aipl aiplVar, Map map) {
        this.a = map;
        this.b = aiplVar;
    }
}
