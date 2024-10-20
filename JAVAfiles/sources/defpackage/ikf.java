package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikf implements akfb, puj {
    public static final xze a = xze.g("Bugle", "RcsCapabilitiesDataSourceV2");
    public final anen b;
    public final anen c;
    public final anen d;
    public final wfe e;
    public final nct f;
    public final psz g;
    public final msk h;
    public final yxx i;
    public final ConversationIdType j;
    public final armf m;
    public final armf n;
    public final AtomicInteger o;
    public final lgg q;
    public final ahiy r;
    private final xnv s;
    private final enh t;
    private final armf v;
    public final Object k = new Object();
    private boolean u = false;
    private akfa w = akfa.a;
    public Optional p = Optional.empty();
    public final wfd l = new rgx(this, 1);

    public ikf(anen anenVar, anen anenVar2, anen anenVar3, wfe wfeVar, nct nctVar, psz pszVar, xnv xnvVar, ahiy ahiyVar, msk mskVar, yxx yxxVar, lgg lggVar, armf armfVar, armf armfVar2, armf armfVar3, enh enhVar, ConversationIdType conversationIdType, int i) {
        this.b = anenVar;
        this.c = anenVar2;
        this.d = anenVar3;
        this.e = wfeVar;
        this.f = nctVar;
        this.g = pszVar;
        this.h = mskVar;
        this.s = xnvVar;
        this.r = ahiyVar;
        this.i = yxxVar;
        this.j = conversationIdType;
        this.t = enhVar;
        this.q = lggVar;
        this.o = new AtomicInteger(i);
        this.v = armfVar2;
        this.m = armfVar;
        this.n = armfVar3;
        enhVar.c(new ike(this, this));
    }

    private final akul h() {
        int i = 9;
        return aktp.ai(new gvk(this, i), this.b).i(new ici(this, i), this.d);
    }

    @Override // defpackage.akfb
    public final andc a() {
        andc andcVar;
        akrh e = aktp.e("MessageDataSource#RcsCapabilitiesDataSourceV2#LoadData");
        try {
            synchronized (this.k) {
                andcVar = new andc(albo.bI(this.w));
                e.a(andcVar);
            }
            e.close();
            return andcVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akfb
    public final ListenableFuture b() {
        akrh e = aktp.e("MessageDataSource#RcsCapabilitiesDataSourceV2#FetchAndStoreData");
        try {
            this.u = true;
            akul h = h();
            e.b(h);
            e.close();
            return h;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akfb
    public final /* synthetic */ Object c() {
        return "rcs_capabilities";
    }

    public final int d() {
        int i = this.o.get();
        if (i < 0 && ((omb) this.m.b()).a()) {
            return ((yjy) this.v.b()).f();
        }
        return i;
    }

    public final void e() {
        if (!this.u) {
            return;
        }
        qiu.h(h().i(new ici(this, 11), this.c));
    }

    @Override // defpackage.puj
    public final void f(msh mshVar, psv psvVar) {
        boolean z;
        synchronized (this.k) {
            z = false;
            if (this.p.isPresent() && this.p.get().equals(mshVar)) {
                z = true;
            }
        }
        if (z) {
            xyo a2 = a.a();
            a2.H("Received RcsCapabilities update");
            a2.q();
            g(Optional.of(this.f.b(Optional.of(psvVar), d())));
            this.r.q(aktp.ag(null), "rcs_capabilities");
            return;
        }
        xyo a3 = a.a();
        a3.H("Dropped RcsCapabilities update for different remote participant");
        a3.q();
    }

    public final void g(Optional optional) {
        if (optional.isEmpty()) {
            xyo a2 = a.a();
            a2.b(this.j);
            a2.H("updateCache RcsOneOnOneConditions not present");
            a2.q();
        } else {
            Object obj = optional.get();
            xyo a3 = a.a();
            a3.b(this.j);
            a3.H("updateCache");
            ammc ammcVar = (ammc) obj;
            a3.A("self_rcs_available", ammcVar.c);
            a3.A("other_participant_rcs_available", ammcVar.d);
            a3.A("connectivity_disregarded", ammcVar.e);
            a3.A("ready_to_send_receive_rcs", ammcVar.f);
            a3.A("data_enabled", ammcVar.g);
            a3.A("video_call_enabled", ammcVar.i);
            a3.q();
        }
        synchronized (this.k) {
            this.w = akfa.a(optional, this.s.f());
        }
    }
}
