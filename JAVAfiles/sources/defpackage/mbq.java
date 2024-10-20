package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mbq extends mbr {
    final /* synthetic */ mbs a;
    private final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbq(mbs mbsVar, int i, String str, long j) {
        super(mbsVar, "Bugle.DataModel.Action.UpdateConversationEncryptionStatusAction.ExecuteAction.DownloadAndProcessRemoteInstanceData.Latency", str, j);
        this.a = mbsVar;
        this.d = i;
    }

    @Override // defpackage.mbr
    protected final void e(long j) {
        ((mbl) this.a.d.b()).f(this.b, this.d, j);
    }
}
