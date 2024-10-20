package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.ims.rcsservice.chatsession.ChatSessionEvent;
import com.google.android.ims.rcsservice.chatsession.GroupChatSessionEvent;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.group.UserInfo;
import com.google.android.libraries.abuse.hades.tartarus.runtime.Data;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahjj {
    public final /* synthetic */ Object a;

    public ahjj() {
        throw null;
    }

    public static final boolean x(qic qicVar) {
        if (!qicVar.equals(qic.UNSPECIFIED_STATUS) && !qicVar.equals(qic.DISABLED)) {
            return true;
        }
        return false;
    }

    public final void a() {
        if (!((ahan) this.a).e) {
            agzt.d(ahan.a);
        }
    }

    public final agdp b() {
        return ((agdo) this.a).b();
    }

    public final void c(boolean z) {
        if (agdo.p((agdo) this.a)) {
            agdo agdoVar = (agdo) this.a;
            agdoVar.f.i(agdoVar.c.a(), z);
        }
    }

    public final void d(agdp agdpVar) {
        agdpVar.getClass();
        if (agdo.p((agdo) this.a)) {
            ((agdo) this.a).o(agdpVar);
        }
    }

    public final arqr e() {
        return new ncd(((afkq) ((agai) this.a).bn().a()).a, 17, (boolean[][][]) null);
    }

    public final void f(String str, int i) {
        ((Data) this.a).putInteger(str, i);
    }

    public final void g(String str, aebp aebpVar) {
        ((Data) this.a).putData(str, adcx.R(aebpVar));
    }

    public final void h(String str, String str2) {
        ((Data) this.a).putString(str, str2);
    }

    public final void i(String str, List list) {
        ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
        for (Object obj : list) {
            if (obj instanceof aebp) {
                obj = adcx.R((aebp) obj);
            }
            arrayList.add(obj);
        }
        ((Data) this.a).putList(str, arrayList);
    }

    public final void j(String str, boolean z) {
        ((Data) this.a).putBoolean(str, z);
    }

    public final void k(int i, String str) {
        Iterator it = ((adrx) this.a).g.iterator();
        while (it.hasNext()) {
            ahjj ahjjVar = (ahjj) it.next();
            int i2 = 0;
            advr.c("Presence information was not published: status: %d error: %s", Integer.valueOf(i), str);
            if (i == 423) {
                long u = ((adqf) ahjjVar.a).u();
                adop adopVar = ((adqf) ahjjVar.a).i.j;
                if (adopVar != null) {
                    i2 = adopVar.f;
                }
                ((adqf) ahjjVar.a).w(Math.max(u, i2));
            } else if (i == 412) {
                ((adqf) ahjjVar.a).o.j();
                adqf adqfVar = (adqf) ahjjVar.a;
                adqfVar.w(adqfVar.u());
            }
        }
    }

    public final void l(apjg apjgVar) {
        ((acnx) this.a).j(apjgVar);
    }

    public final void m(adrc adrcVar, String str, boolean z) {
        long j;
        Event chatSessionEvent;
        int i = 0;
        int i2 = 1;
        if (acqp.a(((acno) this.a).h, str)) {
            advr.c("Discarding is-composing indicator for blocked user: %s", advq.USER_ID.c(str));
            return;
        }
        advr.c("Getting is composing indicator for: %s state: %b", advq.USER_ID.c(str), Boolean.valueOf(z));
        if (true != z) {
            j = 0;
        } else {
            j = 1;
        }
        long j2 = j;
        if (adrcVar == null) {
            chatSessionEvent = new ChatSessionEvent(50050, 0L, 1L, str);
        } else {
            long m = ((acno) this.a).m(adrcVar);
            if (adrcVar.F) {
                Object obj = this.a;
                acno acnoVar = (acno) obj;
                chatSessionEvent = null;
                Optional flatMap = acnoVar.j.a(m).flatMap(new aand(20)).flatMap(new yuq(obj, adwf.m(str, (String) acnoVar.p.a().map(new acnk(i2)).orElse(""), acnoVar.n, ((Boolean) acnoVar.p.a().map(new acnk(i)).orElse(true)).booleanValue()), 11, 0 == true ? 1 : 0));
                if (flatMap.isEmpty()) {
                    advr.c("user is not found with sessionId %d", Long.valueOf(m));
                }
                if (flatMap.isPresent()) {
                    UserInfo o = ((acno) this.a).o((acpk) flatMap.get());
                    adsh adshVar = new adsh(50050, m, j2);
                    adshVar.b(o);
                    chatSessionEvent = new GroupChatSessionEvent(adshVar);
                }
            } else {
                chatSessionEvent = new ChatSessionEvent(50050, m, j2, str);
            }
        }
        if (chatSessionEvent != null) {
            ((acno) this.a).g.c(chatSessionEvent, advy.IMS_CHAT_SESSION_PROVIDER);
        }
    }

    public final void n(abxs abxsVar) {
        abxr abxrVar = (abxr) this.a;
        abxrVar.a = abxsVar;
        Iterator it = abxrVar.c.iterator();
        while (it.hasNext()) {
            ((abxq) it.next()).b();
        }
        ((abxr) this.a).c.clear();
        ((abxr) this.a).b = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, abtc] */
    public final void o(ConnectionResult connectionResult) {
        this.a.onConnectionFailed(connectionResult);
    }

    public final void p(Runnable runnable) {
        aasm aasmVar = ((aasy) this.a).f;
        ((yjl) aasmVar.j.b()).b(new aasl(aasmVar, runnable, aasmVar.i.n()));
    }

    public final void q() {
        ((aasy) this.a).f.t(amqe.MINI_CAMERA);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [mho, java.lang.Object] */
    public final void r() {
        String N;
        Object obj = this.a;
        aacm aacmVar = new aacm(obj, 6);
        wyp wypVar = (wyp) obj;
        ((Optional) wypVar.b).ifPresent(aacmVar);
        int i = 14;
        if (((Boolean) new mst(i).get()).booleanValue()) {
            N = ((rry) wypVar.f).r().o(((Boolean) new mst(i).get()).booleanValue());
        } else {
            N = ((rry) wypVar.f).N();
        }
        if (((xca) wypVar.a).k(N)) {
            ?? r0 = wypVar.d;
            rry rryVar = (rry) wypVar.f;
            r0.am(rryVar.r(), rryVar.z(), rryVar.u().a());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ygn, java.lang.Object] */
    public final void s() {
        this.a.a();
    }

    public final void t() {
        if (((dtq) this.a).b(ygh.a(3))) {
            ((alwl) ygs.a.m().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getOnStopListener", 254, "PlaybackSession.java")).q("Playback interrupted");
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [armf, java.lang.Object] */
    public final agnw u(agna agnaVar) {
        boolean z;
        boolean z2;
        rtb rtbVar = (rtb) this.a;
        Context context = (Context) rtbVar.e.b();
        context.getClass();
        Optional optional = (Optional) rtbVar.k.b();
        optional.getClass();
        xnv xnvVar = (xnv) rtbVar.f.b();
        xnvVar.getClass();
        jat jatVar = (jat) rtbVar.b.b();
        jatVar.getClass();
        Map map = (Map) rtbVar.j.b();
        map.getClass();
        adwp adwpVar = (adwp) rtbVar.h.b();
        adwpVar.getClass();
        ?? r14 = rtbVar.l;
        ?? r11 = rtbVar.g;
        ?? r10 = rtbVar.i;
        ?? r9 = rtbVar.m;
        qxn qxnVar = new qxn(context, rtbVar.a, optional, rtbVar.d, rtbVar.c, r9, r10, r11, xnvVar, jatVar, r14, map, adwpVar, agnaVar);
        synchronized (qxnVar.j) {
            agnw agnwVar = (agnw) qxnVar.i.get();
            if (agnwVar == null) {
                boolean z3 = false;
                if (qxnVar.i.get() == null) {
                    z = true;
                } else {
                    z = false;
                }
                albo.T(z);
                akrh e = aktp.e("DatabaseHelperBasic#getDatabaseWrapperForAnyThread create");
                try {
                    qxnVar.setWriteAheadLoggingEnabled(true);
                    uac uacVar = (uac) qxnVar.g.b();
                    agna agnaVar2 = qxnVar.l;
                    zai zaiVar = (zai) uacVar.a.b();
                    Stream filter = Collection.EL.stream(((Map) uacVar.b.b()).entrySet()).sorted(Comparator.CC.comparingInt(new kmb(7))).map(new tvq(15)).filter(new trt(4));
                    int i = alog.d;
                    alog alogVar = (alog) filter.collect(alls.a);
                    Context context2 = (Context) zaiVar.d.b();
                    context2.getClass();
                    ?? r92 = zaiVar.b;
                    rzx rzxVar = (rzx) zaiVar.c.b();
                    rzxVar.getClass();
                    Object obj = zaiVar.a;
                    xnv xnvVar2 = (xnv) zaiVar.e.b();
                    xnvVar2.getClass();
                    agnaVar2.getClass();
                    alogVar.getClass();
                    uci uciVar = new uci(context2, r92, rzxVar, xnvVar2, agnaVar2, alogVar);
                    final SettableFuture create = SettableFuture.create();
                    ucd ucdVar = uciVar.k;
                    akul g = akul.g(create);
                    g.getClass();
                    if (ucdVar.a.get() == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    albo.T(z2);
                    ucdVar.a.set(g);
                    ((ListenableFuture) ucdVar.a.get()).getClass();
                    int i2 = 20;
                    g.h(new ttg(ucdVar, i2), andi.a);
                    if (qxnVar.i.get() == null) {
                        z3 = true;
                    }
                    albo.T(z3);
                    qxnVar.i.set(uciVar);
                    akul.g(((anen) qxnVar.h.b()).submit(akto.k(new mig(qxnVar, i2)))).h(new algk() { // from class: qxj
                        @Override // defpackage.algk
                        public final Object apply(Object obj2) {
                            AtomicBoolean atomicBoolean = qxn.a;
                            SettableFuture.this.set((SQLiteDatabase) obj2);
                            return null;
                        }
                    }, andi.a).e(Throwable.class, new algk() { // from class: qxk
                        @Override // defpackage.algk
                        public final Object apply(Object obj2) {
                            Throwable th = (Throwable) obj2;
                            qiu.d(th);
                            if (xyp.j()) {
                                SettableFuture.this.setException(th);
                                return null;
                            }
                            return null;
                        }
                    }, andi.a);
                    uci uciVar2 = (uci) qxnVar.i.get();
                    uciVar2.getClass();
                    e.close();
                    return uciVar2;
                } finally {
                }
            } else {
                return agnwVar;
            }
        }
    }

    public final void v() {
        ((dtq) this.a).b(null);
    }

    public final void w(qic qicVar) {
        asho ashoVar;
        int ordinal = qicVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                ashoVar = asho.NOT_ENABLED;
            } else {
                ashoVar = asho.IN_INITIAL_SYNC;
            }
        } else {
            ashoVar = asho.ENABLED;
        }
        ((qif) this.a).d.set(ashoVar);
    }

    public /* synthetic */ ahjj(Object obj) {
        this.a = obj;
    }

    public ahjj(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ahjj(armf armfVar, byte[] bArr) {
        this.a = new rph(rpk.c.a, armfVar, new rpm(rpp.k, rpr.j, rqx.a, rqy.a, rqy.b, arnx.a, 0, 64));
    }

    public ahjj(yav yavVar) {
        this.a = yavVar;
        alvw d = yav.d.d();
        d.X(alwp.a, "BugleConnectivity");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer", "<init>", 973, "ConnectivityUtilImpl.java")).q("Init DefaultDataRegisterer");
        ((ConnectivityManager) yavVar.f.b()).registerDefaultNetworkCallback(new yat(this));
        if (yhx.h) {
            ((yjy) yavVar.l.b()).n(new yas(yavVar, new ahjj(this, (byte[]) null), 0, null));
        }
    }
}
