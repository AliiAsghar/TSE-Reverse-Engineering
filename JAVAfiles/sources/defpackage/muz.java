package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class muz implements ncq {
    public final MessageId a;
    private final mjg b;

    public muz(mjg mjgVar, MessageId messageId) {
        this.b = mjgVar;
        this.a = messageId;
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.b.g(new mzo(this, ncpVar, 1));
    }

    @Override // defpackage.ncq
    public final akul b() {
        return this.b.j(this.a);
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException("Blocking API is not supported.");
    }
}
