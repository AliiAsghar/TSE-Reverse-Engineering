package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ysr extends arpw implements arqv {
    int a;
    final /* synthetic */ yss b;
    final /* synthetic */ ParticipantsTable.BindData c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ boolean e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysr(yss yssVar, ParticipantsTable.BindData bindData, ConversationIdType conversationIdType, boolean z, int i, int i2, arpe arpeVar) {
        super(2, arpeVar);
        this.b = yssVar;
        this.c = bindData;
        this.d = conversationIdType;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ysr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            yss yssVar = this.b;
            ParticipantsTable.BindData bindData = this.c;
            ConversationIdType conversationIdType = this.d;
            rwd rwdVar = (rwd) yssVar.c.b();
            Object e = ymd.e.e();
            e.getClass();
            alog B = rwdVar.B(conversationIdType, ((Number) e).intValue());
            B.getClass();
            boolean z = this.e;
            int i2 = this.f;
            int i3 = this.g;
            this.a = 1;
            if (yssVar.b(bindData, conversationIdType, B, z, 3, i2, i3, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new ysr(this.b, this.c, this.d, this.e, this.f, this.g, arpeVar);
    }
}
