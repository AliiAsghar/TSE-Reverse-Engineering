package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ardu extends aqvd {
    final /* synthetic */ ardv a;

    public ardu(ardv ardvVar) {
        this.a = ardvVar;
    }

    @Override // defpackage.aqvd
    public final String a() {
        return this.a.b;
    }

    @Override // defpackage.aqvd
    public final void d(apzj apzjVar) {
        arbj arbjVar = new arbj((byte[]) null);
        arbjVar.c = new aqwa(null, Collections.singletonList(new aqsq(this.a.a)));
        arbjVar.a = aqrm.a;
        apzjVar.k(arbjVar.a());
    }

    @Override // defpackage.aqvd
    public final void c() {
    }
}
