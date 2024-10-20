package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abdj {
    final /* synthetic */ Intent a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    public final /* synthetic */ zas f;

    public abdj(zas zasVar, Intent intent, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = intent;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = zasVar;
    }

    public final void a(ConversationIdType conversationIdType) {
        this.f.d(this.a, conversationIdType, this.b, this.c, this.d, this.e);
    }
}
