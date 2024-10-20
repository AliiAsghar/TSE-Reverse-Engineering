package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jsa implements jrv {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl");
    public static final long b;
    public final Context c;
    public final arpi d;
    public final arwe e;
    public final arwe f;
    public final aksr g;
    public final Optional h;
    public final armf i;
    public final armf j;
    public final jgk k;
    public final ovv l;
    public final arml m;
    public final AtomicBoolean n;
    public final aeoi o;
    public final joz p;
    public final jxv q;
    public final akip r;
    private final ascg s;
    private final Optional t;
    private final pms u;
    private final asai v;
    private final asai w;
    private final ascv x;
    private final ascv y;

    static {
        long j = arut.a;
        b = arsd.o(BasePaymentResult.ERROR_REQUEST_FAILED, aruv.c);
    }

    public jsa(Context context, arpi arpiVar, arwe arweVar, arwe arweVar2, aksr aksrVar, akip akipVar, jxv jxvVar, joz jozVar, ascg ascgVar, Optional optional, Optional optional2, @oqd armf armfVar, armf armfVar2, asai asaiVar, jgk jgkVar, ovv ovvVar, pms pmsVar, armf armfVar3) {
        context.getClass();
        arpiVar.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        aksrVar.getClass();
        jxvVar.getClass();
        jozVar.getClass();
        ascgVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        asaiVar.getClass();
        this.c = context;
        this.d = arpiVar;
        this.e = arweVar;
        this.f = arweVar2;
        this.g = aksrVar;
        this.r = akipVar;
        this.q = jxvVar;
        this.p = jozVar;
        this.s = ascgVar;
        this.h = optional;
        this.t = optional2;
        this.i = armfVar;
        this.j = armfVar2;
        this.k = jgkVar;
        this.l = ovvVar;
        this.u = pmsVar;
        this.m = armd.a(new jmy(armfVar3, 9));
        this.n = new AtomicBoolean(false);
        aeoi aeoiVar = new aeoi(aerb.cJ, (arqg) new rl(this, 11, (boolean[][]) null), (arqg) new rl(this, 12, (float[][]) null), (String) null, false, new aeoh(true, ((ansy) ((pmr) pmsVar).a.b()).e("bugle.enable_fix_for_mirrored_checkmark"), 2), 56);
        this.o = aeoiVar;
        asai a2 = asar.a(new jjv(new jjv(ascgVar, 16), 17));
        this.v = a2;
        asai b2 = asbm.b(asar.a(new jjv(a2, 18)), new jcx((arpe) null, 3, (short[]) null));
        this.w = b2;
        new jrw(null, 0);
        if (((Boolean) armfVar.b()).booleanValue() && ((oqb) armfVar2.b()).a()) {
            optional2.isPresent();
        }
        ascd a3 = ascy.a(null);
        this.x = a3;
        asai P = arrn.P(a2, b2, a3, new kgf(this, (arpe) null, 1));
        int i = ascp.a;
        this.y = arrn.T(P, arweVar2, asco.b, aeoiVar);
    }

    @Override // defpackage.jrv
    public final ascv a() {
        return this.y;
    }

    public final void b() {
        akrc b2 = this.g.b("ComposeRowSendButton.onScheduledSendDisabled");
        try {
            alvw i = a.i();
            i.X(alwp.a, "BugleComposeRow2");
            ((alvg) i.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl", "onScheduledSendDisabled", 217, "SendButtonUiAdapterImpl.kt")).q("Skipping onScheduledSend as sending is disabled.");
            armd.i(b2, null);
        } finally {
        }
    }

    public final void c() {
        akrc b2 = this.g.b("ComposeRowSendButton.onSendDisabled");
        try {
            alvw i = a.i();
            i.X(alwp.a, "BugleComposeRow2");
            ((alvg) i.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl", "onSendDisabled", 211, "SendButtonUiAdapterImpl.kt")).q("Skipping onSend as sending is disabled.");
            armd.i(b2, null);
        } finally {
        }
    }
}
