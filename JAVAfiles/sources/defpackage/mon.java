package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mon extends arps {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ moq c;
    int d;
    moq e;
    ConversationIdType f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mon(moq moqVar, arpe arpeVar) {
        super(arpeVar);
        this.c = moqVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, null, null, this);
    }
}
