package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ues implements rtt {
    final /* synthetic */ arzu a;

    public ues(arzu arzuVar) {
        this.a = arzuVar;
    }

    @Override // defpackage.rtt
    public final void a(rtu rtuVar) {
        ((alvg) uet.a.h().h("com/google/android/apps/messaging/shared/datamodel/media/VCardCallbackFlow$get$1$1", "onPersonDataFailed", 28, "VCardCallbackFlow.kt")).q("Failed to parse vcard");
        this.a.c(null);
    }

    @Override // defpackage.rtt
    public final void b(rtu rtuVar) {
        ((alvg) uet.a.d().h("com/google/android/apps/messaging/shared/datamodel/media/VCardCallbackFlow$get$1$1", "onPersonDataUpdated", 23, "VCardCallbackFlow.kt")).q("Parsed vcard successfully");
        this.a.c(new ueu(rtuVar.m(), rtuVar.d()));
    }
}
