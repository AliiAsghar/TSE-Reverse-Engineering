package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abch extends xcf {
    public static final Object a = new Object();
    public static final xze b = xze.g("Bugle", "VerifiedSmsStartupTask");
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final anen h;
    public final armf i;
    public final Context k;
    private final anen l;

    public abch(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, anen anenVar, anen anenVar2, armf armfVar6) {
        this.k = context;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
        this.g = armfVar5;
        this.l = anenVar;
        this.h = anenVar2;
        this.i = armfVar6;
    }

    @Override // defpackage.xny
    public final akrh a() {
        return aktp.e("VerifiedSmsStartupTask");
    }

    @Override // defpackage.xcf
    public final akul b() {
        final boolean e = ((ytk) this.c.b()).e();
        final boolean d = ((ytk) this.c.b()).d();
        return ((ytk) this.c.b()).b().i(new ancs() { // from class: abcg
            @Override // defpackage.ancs
            public final ListenableFuture a(Object obj) {
                Boolean bool = (Boolean) obj;
                xyo c = abch.b.c();
                c.H("Checking if Verified SMS tasks should be enqueued.");
                boolean z = e;
                c.A("feature supported", z);
                boolean z2 = d;
                c.A("feature enabled", z2);
                c.z("eligible / has registered key", bool);
                abch abchVar = abch.this;
                c.A("C11N", ((ytk) abchVar.c.b()).c());
                c.q();
                if (z2 && z && Boolean.TRUE.equals(bool)) {
                    ((zxy) abchVar.d.b()).k(true);
                    gvf.ar(abchVar.k).a("verified_sms_request_verified_senders_work_tag");
                    if (!((Boolean) utw.W.e()).booleanValue()) {
                        return ((ukh) abchVar.f.b()).a();
                    }
                    return ((yul) abchVar.e.b()).d().h(new tti(abchVar, ((Long) utw.V.e()).longValue(), 5), abchVar.h);
                }
                abch.b.o("Not enqueuing VSMS periodic task, VSMS is disabled or not supported.");
                if (((ykw) ((zxy) abchVar.d.b()).b).q("app_contains_verified_sms_data", false)) {
                    abch.b.q("VSMS is disabled, but preferences shows data exists on the device.");
                    ((ukh) abchVar.f.b()).b();
                }
                return aktp.ag(null);
            }
        }, this.l).i(new aang(this, 16), this.h);
    }

    @Override // defpackage.xck
    public final boolean fI() {
        return true;
    }
}
