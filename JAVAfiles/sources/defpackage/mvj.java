package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class mvj extends arrm implements arqr {
    final /* synthetic */ mvl a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvj(mvl mvlVar, int i) {
        super(1, arrn.class, "getLatestMessagesSuspend", "getLatestMessages$getLatestMessagesSuspend(Lcom/google/android/apps/messaging/shared/api/messaging/message/OptimisticBugleMessageRepository;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = mvlVar;
        this.b = i;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return mvl.C(this.a, this.b, (arpe) obj);
    }
}
