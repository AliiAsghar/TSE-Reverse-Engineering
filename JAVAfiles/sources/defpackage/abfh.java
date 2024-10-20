package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.welcome.WelcomeFlowActivityWithoutConfigChanges;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfh {
    public static final akfc a = new akgc("WELCOME_FLOW_DATA");
    public static final alwo b = alwo.o("BugleWelcome");
    public final arwe c;
    public final arwe d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    private final armf i;
    private final armf j;
    private final armf k;

    public abfh(arwe arweVar, arwe arweVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        arweVar.getClass();
        arweVar2.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        this.c = arweVar;
        this.d = arweVar2;
        this.e = armfVar;
        this.i = armfVar2;
        this.f = armfVar3;
        this.j = armfVar4;
        this.g = armfVar5;
        this.k = armfVar6;
        this.h = armfVar7;
    }

    public static final void c(cg cgVar, Optional optional) {
        Intent a2 = lqn.f(cgVar.y(), WelcomeFlowActivityWithoutConfigChanges.class, "android.intent.action.VIEW").a();
        a2.getClass();
        if (optional.isPresent()) {
            aowt.h(a2, "extra_gaia_account_info", (apbt) optional.get());
        }
        cj F = cgVar.F();
        Intent intent = new Intent(a2);
        akti r = akto.r(intent);
        try {
            F.startActivityForResult(intent, 101);
            armd.i(r, null);
        } finally {
        }
    }

    public static final abfg d(abff abffVar) {
        return new abfg(abffVar, Optional.empty());
    }

    public final aaxz a() {
        return ((aaya) this.j.b()).a(amlx.PROVISIONING_UI_TYPE_WELCOME_CHAT_FEATURES, 3);
    }

    public final void b(cg cgVar, Callable callable) {
        akgr wjfVar;
        ((akgu) this.i.b()).a(R.id.welcome_flow_launch_local_subscription, new wiq(this, 3), new zhq(new aaop(callable, cgVar, 4), 5));
        kqc kqcVar = (kqc) arsd.k((Optional) ((apxx) this.k).a);
        akgu akguVar = (akgu) this.i.b();
        abgg abggVar = (abgg) this.e.b();
        if (kqcVar != null) {
            wjfVar = new wiq(abggVar, 4);
        } else {
            wjfVar = new wjf(2);
        }
        akguVar.a(R.id.welcome_flow_post_launch_local_subscription, wjfVar, new zhq(new aaji(kqcVar, 5), 6));
    }
}
