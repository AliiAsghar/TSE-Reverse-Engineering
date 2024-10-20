package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aodm implements abth {
    private final /* synthetic */ int a;

    public aodm(int i) {
        this.a = i;
    }

    @Override // defpackage.abth
    public final Exception a(Status status) {
        if (this.a != 0) {
            return abhb.b(status);
        }
        if (status.f == 8) {
            return new aodl(status.b());
        }
        return new aodf(status.b());
    }
}
