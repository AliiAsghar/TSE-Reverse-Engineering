package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abuo implements abrh {
    final /* synthetic */ abri a;
    final /* synthetic */ acit b;
    final /* synthetic */ abuq c;

    public abuo(abri abriVar, acit acitVar, abuq abuqVar) {
        this.a = abriVar;
        this.b = acitVar;
        this.c = abuqVar;
    }

    @Override // defpackage.abrh
    public final void a(Status status) {
        if (status.c()) {
            this.b.b(this.c.a(this.a.e(TimeUnit.MILLISECONDS)));
        } else {
            this.b.a(abhb.b(status));
        }
    }
}
