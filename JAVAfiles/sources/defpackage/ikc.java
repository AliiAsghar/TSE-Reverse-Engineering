package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.rcs.client.contacts.ContactsService;
import com.google.android.rcs.client.events.EventService;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikc implements akfb {
    private final agcp A;
    public final xyt c;
    public final ConversationIdType d;
    public final ContactsService e;
    public final msk f;
    public final AtomicInteger g;
    public final adjc h;
    public EventService l;
    public final ahiy n;
    private final anen p;
    private final anen q;
    private final aneo r;
    private final nct s;
    private final xnv t;
    private final Context u;
    private final enh v;
    private ajoe x;
    private vrl y;
    private ajoa z;
    private static final alhr o = uuh.x(209983749, "enable_refresh_with_timeout_on_blocking_executor");
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSource");
    public final xze b = xze.g("Bugle", "RcsCapabilitiesDataSource");
    public volatile boolean i = false;
    private akfa w = akfa.a;
    public Optional j = Optional.empty();
    public final Object k = new Object();
    public final AtomicBoolean m = new AtomicBoolean();

    public ikc(anen anenVar, anen anenVar2, aneo aneoVar, nct nctVar, xyt xytVar, xnv xnvVar, ahiy ahiyVar, agcp agcpVar, ContactsService contactsService, msk mskVar, adjc adjcVar, Context context, enh enhVar, ConversationIdType conversationIdType, int i) {
        this.p = anenVar;
        this.q = anenVar2;
        this.r = aneoVar;
        this.s = nctVar;
        this.c = xytVar;
        this.t = xnvVar;
        this.n = ahiyVar;
        this.A = agcpVar;
        this.d = conversationIdType;
        this.v = enhVar;
        this.u = context;
        this.e = contactsService;
        this.f = mskVar;
        this.h = adjcVar;
        this.g = new AtomicInteger(i);
    }

    private final synchronized vrl j() {
        vrl vrlVar = this.y;
        if (vrlVar == null) {
            vro vroVar = new vro(this, 1);
            this.y = vroVar;
            return vroVar;
        }
        return vrlVar;
    }

    private final synchronized ajoa k() {
        ajoa ajoaVar = this.z;
        if (ajoaVar == null) {
            ika ikaVar = new ika(this);
            this.z = ikaVar;
            return ikaVar;
        }
        return ajoaVar;
    }

    @Override // defpackage.akfb
    public final andc a() {
        akrh e = aktp.e("MessageDataSource#RcsCapabilitiesDataSource#LoadData");
        try {
            andc andcVar = new andc(albo.bI(this.w));
            e.a(andcVar);
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
        akrh e = aktp.e("MessageDataSource#RcsCapabilitiesDataSource#FetchAndStoreData");
        try {
            vrl j = j();
            ((vrn) this.c.a()).h(j);
            this.v.c(new ijz(this, j));
            akul h = aktp.ai(new gvk(this, 8), this.p).h(new icj(this, 14), this.p);
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

    public final synchronized ajoe d() {
        ajoe ajoeVar = this.x;
        if (ajoeVar == null) {
            ikb ikbVar = new ikb(this);
            this.x = ikbVar;
            return ikbVar;
        }
        return ajoeVar;
    }

    public final void e() {
        gtq gtqVar = new gtq(this, 12);
        if (((Boolean) ((utz) o.get()).e()).booleanValue()) {
            if (this.m.compareAndSet(false, true)) {
                aktp.ah(gtqVar, this.q).j(10L, TimeUnit.SECONDS, this.r).e(TimeoutException.class, new icj(this, 13), this.r).k(qiu.c(new ibo(this, 7)), this.r);
                return;
            }
            this.b.p("Skipping redundant refreshCapabilities");
            return;
        }
        qjb.a(gtqVar, this.p);
    }

    public final void f() {
        synchronized (this.k) {
            if (this.l == null && !this.i) {
                EventService p = this.A.p(this.u, k());
                this.l = p;
                p.connect();
            }
        }
    }

    public final void g() {
        ajoe d = d();
        try {
            synchronized (this.k) {
                EventService eventService = this.l;
                if (eventService != null) {
                    if (eventService.isSubscribed(d)) {
                        this.l.unsubscribeAllCategories(d);
                    }
                    this.l.disconnect();
                    this.l = null;
                }
            }
        } catch (ajny e) {
            this.b.r("stopServices failed", e);
        }
    }

    public final void h() {
        if (!i(this.j)) {
            this.w = akfa.a(Optional.empty(), this.t.f());
            return;
        }
        ammc c = this.s.c(this.g.get(), this.j);
        if (this.b.s(3)) {
            xyo a2 = this.b.a();
            a2.H("updateCache");
            a2.A("self_rcs_available", c.c);
            a2.A("other_participant_rcs_available", c.d);
            a2.A("connectivity_disregarded", c.e);
            a2.A("ready_to_send_receive_rcs", c.f);
            a2.A("data_enabled", c.g);
            a2.A("support_video_call", c.i);
            a2.q();
        }
        this.w = akfa.a(Optional.of(c), this.t.f());
    }

    public final boolean i(Optional optional) {
        if (!optional.isPresent()) {
            return false;
        }
        if (((msh) optional.get()).e().isEmpty()) {
            xze xzeVar = this.b;
            ConversationIdType conversationIdType = this.d;
            xyo e = xzeVar.e();
            e.b(conversationIdType);
            e.H("RCS identifier not present");
            e.q();
            return false;
        }
        return true;
    }
}
