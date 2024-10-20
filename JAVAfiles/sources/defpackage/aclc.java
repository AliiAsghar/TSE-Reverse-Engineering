package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclc implements abrm {
    public final ackc a;
    private final Status b;

    public aclc(Status status, ackc ackcVar) {
        this.b = status;
        this.a = ackcVar;
    }

    @Override // defpackage.abrm
    public final Status a() {
        return this.b;
    }
}
