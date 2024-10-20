package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class rar extends arrp implements arqg {
    final /* synthetic */ rat a;
    final /* synthetic */ Action b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ amgj f;
    final /* synthetic */ Instant g;
    final /* synthetic */ arsb h;
    final /* synthetic */ arsb i;
    final /* synthetic */ arsb j;
    final /* synthetic */ boolean k;
    final /* synthetic */ boolean l;
    final /* synthetic */ ConversationIdType m;
    final /* synthetic */ amwh n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rar(rat ratVar, Action action, boolean z, boolean z2, boolean z3, amgj amgjVar, Instant instant, arsb arsbVar, arsb arsbVar2, arsb arsbVar3, boolean z4, boolean z5, ConversationIdType conversationIdType, amwh amwhVar) {
        super(0);
        this.a = ratVar;
        this.b = action;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = amgjVar;
        this.g = instant;
        this.h = arsbVar;
        this.i = arsbVar2;
        this.j = arsbVar3;
        this.k = z4;
        this.l = z5;
        this.m = conversationIdType;
        this.n = amwhVar;
    }

    @Override // defpackage.arqg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final arnb a() {
        final Instant instant = this.g;
        instant.getClass();
        final MessageCoreData messageCoreData = (MessageCoreData) this.h.a;
        final List list = (List) this.i.a;
        final int intValue = ((Number) this.j.a).intValue();
        final amwh amwhVar = this.n;
        amwhVar.getClass();
        final ConversationIdType conversationIdType = this.m;
        final boolean z = this.c;
        final rat ratVar = this.a;
        final boolean z2 = this.d;
        final Action action = this.b;
        final boolean z3 = this.e;
        final boolean z4 = this.l;
        final amgj amgjVar = this.f;
        final boolean z5 = this.k;
        return arnb.a;
    }
}
