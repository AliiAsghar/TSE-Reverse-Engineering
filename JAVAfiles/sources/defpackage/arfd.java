package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arfd extends aqtz {
    public final aqtr f;
    public aqsd g = aqsd.IDLE;
    private aqtw h;

    public arfd(aqtr aqtrVar) {
        this.f = aqtrVar;
    }

    @Override // defpackage.aqtz
    public final Status a(aqtv aqtvVar) {
        arfa arfaVar;
        Boolean bool;
        List list = aqtvVar.a;
        if (!list.isEmpty()) {
            Object obj = aqtvVar.c;
            if ((obj instanceof arfa) && (bool = (arfaVar = (arfa) obj).a) != null && bool.booleanValue()) {
                ArrayList arrayList = new ArrayList(list);
                Long l = arfaVar.b;
                Collections.shuffle(arrayList, new Random());
                list = arrayList;
            }
            aqtw aqtwVar = this.h;
            if (aqtwVar == null) {
                aqtr aqtrVar = this.f;
                aqtm aqtmVar = new aqtm();
                aqtmVar.c(list);
                aqtw b = aqtrVar.b(aqtmVar.a());
                b.c(new arez(this, b, 0));
                this.h = b;
                f(aqsd.CONNECTING, new arfb(aqtt.b(b)));
                b.a();
            } else {
                aqtwVar.d(list);
            }
            return Status.b;
        }
        List list2 = aqtvVar.a;
        Status withDescription = Status.n.withDescription("NameResolver returned no usable address. addrs=" + String.valueOf(list2) + ", attrs=" + aqtvVar.b.toString());
        b(withDescription);
        return withDescription;
    }

    @Override // defpackage.aqtz
    public final void b(Status status) {
        aqtw aqtwVar = this.h;
        if (aqtwVar != null) {
            aqtwVar.b();
            this.h = null;
        }
        f(aqsd.TRANSIENT_FAILURE, new arfb(aqtt.a(status)));
    }

    @Override // defpackage.aqtz
    public final void d() {
        aqtw aqtwVar = this.h;
        if (aqtwVar != null) {
            aqtwVar.a();
        }
    }

    @Override // defpackage.aqtz
    public final void e() {
        aqtw aqtwVar = this.h;
        if (aqtwVar != null) {
            aqtwVar.b();
        }
    }

    public final void f(aqsd aqsdVar, aqtx aqtxVar) {
        this.g = aqsdVar;
        this.f.f(aqsdVar, aqtxVar);
    }
}
