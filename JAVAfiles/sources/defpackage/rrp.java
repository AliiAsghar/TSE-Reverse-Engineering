package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rrp extends arps {
    /* synthetic */ Object a;
    final /* synthetic */ rrq b;
    int c;
    rrq d;
    ConversationIdType e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrp(rrq rrqVar, arpe arpeVar) {
        super(arpeVar);
        this.b = rrqVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
