package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ynk extends arpw implements arqv {
    final /* synthetic */ ParticipantsTable.BindData a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ amzu c;
    final /* synthetic */ amzq d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ wpp h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynk(wpp wppVar, ParticipantsTable.BindData bindData, ConversationIdType conversationIdType, amzu amzuVar, int i, int i2, int i3, amzq amzqVar, arpe arpeVar) {
        super(2, arpeVar);
        this.h = wppVar;
        this.a = bindData;
        this.b = conversationIdType;
        this.c = amzuVar;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.d = amzqVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ynk) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        yni n = ((aiqj) this.h.a.b()).n(this.a, null);
        amzu amzuVar = this.c;
        int i = this.e;
        int i2 = this.f;
        this.h.n(this.b, n, amzuVar, i, i2, this.g, this.d);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new ynk(this.h, this.a, this.b, this.c, this.e, this.f, this.g, this.d, arpeVar);
    }
}
