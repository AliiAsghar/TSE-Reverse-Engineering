package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ilm extends ijy<rsa> {
    final /* synthetic */ ilw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilm(ilw ilwVar) {
        super("Conversation participants");
        this.a = ilwVar;
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ilw ilwVar = this.a;
        rsa rsaVar = (rsa) obj;
        ilwVar.A = rsaVar;
        ily ilyVar = ilwVar.M;
        ilyVar.e = rsaVar;
        if (((Boolean) ((utz) ilz.a.get()).e()).booleanValue()) {
            ilyVar.a();
        }
        this.a.y.E().D(rsaVar.e);
        if (((Boolean) ((utz) ilz.a.get()).e()).booleanValue()) {
            this.a.w("onConversationParticipantsDataUpdated");
        }
    }
}
