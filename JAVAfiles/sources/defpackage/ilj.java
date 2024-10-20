package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ilj extends ijy<alog<ParticipantsTable.BindData>> {
    final /* synthetic */ ilw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilj(ilw ilwVar) {
        super("Subscription");
        this.a = ilwVar;
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.p.i((alog) obj);
        ilw ilwVar = this.a;
        ilwVar.O = ((uie) ilwVar.o.b()).o(this.a.p.g());
        this.a.y.E().P(this.a.O);
    }
}
