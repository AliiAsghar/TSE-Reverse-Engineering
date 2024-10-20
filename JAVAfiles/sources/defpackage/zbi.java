package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbi extends arps {
    public /* synthetic */ Object a;
    public int b;
    public zem c;
    public DefaultRecipient d;
    final /* synthetic */ zbz e;
    public zbz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbi(zbz zbzVar, arpe arpeVar) {
        super(arpeVar);
        this.e = zbzVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
