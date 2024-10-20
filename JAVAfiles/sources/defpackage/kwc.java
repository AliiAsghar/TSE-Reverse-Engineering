package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class kwc implements akgh<Boolean> {
    final /* synthetic */ kvw a;

    public kwc(kvw kvwVar) {
        this.a = kvwVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        kuy.a.n("SyncStatusDataService failed", th);
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        boolean z;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        this.a.aT = z;
        xyo a = kuy.a.a();
        a.H("SyncStatus SubscriptionCallback");
        a.z("inFullSync", bool);
        a.q();
        kvw kvwVar = this.a;
        kye kyeVar = kvwVar.r;
        boolean z2 = kvwVar.aT;
        if (kyeVar.c != z2) {
            kyeVar.c = z2;
            if (z2) {
                kyeVar.s(0);
            } else {
                kyeVar.y(0);
            }
        }
        kvwVar.k().N(z2);
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }
}
