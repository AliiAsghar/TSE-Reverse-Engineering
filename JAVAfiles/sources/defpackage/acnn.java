package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.ims.rcsservice.chatsession.ChatSessionEvent;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult;
import com.google.android.ims.rcsservice.chatsession.GroupChatSessionEvent;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.rcs.client.messaging.GroupMember;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acnn implements adrd, adpb {
    public final long a;
    public final adrc b;
    public final /* synthetic */ acno c;

    public acnn(acno acnoVar, adrc adrcVar, long j) {
        this.c = acnoVar;
        this.b = adrcVar;
        this.a = j;
    }

    private final void r(long j) {
        adrc adrcVar = (adrc) this.c.e.get(Long.valueOf(this.a));
        if (adrcVar == this.b) {
            u();
            if (adrcVar.F) {
                if (adrcVar.ay() != adpi.DISCONNECT) {
                    this.c.g.c(new GroupChatSessionEvent(new adsh(50005, this.a, 0L)), advy.IMS_CHAT_SESSION_PROVIDER);
                    return;
                }
                return;
            }
            this.c.g.c(new ChatSessionEvent(50005, this.a, j), advy.IMS_CHAT_SESSION_PROVIDER);
            v();
        }
    }

    private final void s() {
        advr.c("Group chat has been terminated by the server and is no longer available! \n  Session ID: %d,\n  Group-ID: %s", Long.valueOf(this.a), this.b.w());
        u();
        w();
        this.c.f.remove(Long.valueOf(this.a));
        this.c.g.c(new GroupChatSessionEvent(new adsh(50005, this.a, 6L)), advy.IMS_CHAT_SESSION_PROVIDER);
    }

    private final void t(long j) {
        Event chatSessionEvent;
        if (this.b.F) {
            chatSessionEvent = x(this.a, j);
        } else {
            chatSessionEvent = new ChatSessionEvent(50003, this.a, j);
        }
        this.c.g.c(chatSessionEvent, advy.IMS_CHAT_SESSION_PROVIDER);
    }

    private final void u() {
        advr.c("Releasing session %d", Long.valueOf(this.a));
        this.c.e.remove(Long.valueOf(this.a));
        this.b.aR(this.a, null);
    }

    private final void v() {
        adps adpsVar;
        adrc adrcVar = this.b;
        if (!adrcVar.F && (adpsVar = this.c.l) != null) {
            adpsVar.a(adrcVar.z());
        }
    }

    private final void w() {
        if (!this.b.F) {
            return;
        }
        advr.c("Unregistering group session %d", Long.valueOf(this.a));
        this.c.j.c(this.a);
    }

    private final GroupChatSessionEvent x(long j, long j2) {
        adsh adshVar = new adsh(50003, j, j2);
        GroupInfo g = this.c.g(this.a);
        if (g == null) {
            advr.q("Null GroupInfo for group session. RCS session id: %s", Long.valueOf(this.a));
        } else {
            adshVar.a(g);
        }
        return new GroupChatSessionEvent(adshVar);
    }

    private static final int y(int i) {
        if (i != 4) {
            if (i != 5) {
                if (i != 51) {
                    if (i != 408) {
                        if (i != 477 && i != 480) {
                            if (i == 486) {
                                return 4;
                            }
                            if (i != 603) {
                                if (i != 403) {
                                    if (i != 404) {
                                        switch (i) {
                                            case 7:
                                                return 16;
                                            case 8:
                                                return 14;
                                            case 9:
                                                return 17;
                                            case 10:
                                                return 18;
                                            case 11:
                                                return 13;
                                            default:
                                                return i;
                                        }
                                    }
                                    return 1;
                                }
                                return 9;
                            }
                            return 3;
                        }
                        return 2;
                    }
                    return 3;
                }
                return 56;
            }
            return 52;
        }
        return 12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [int] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    @Override // defpackage.adqy
    public final void a(adqu adquVar, int i) {
        String k;
        boolean z;
        Duration duration;
        ChatSessionMessageEvent chatSessionMessageEvent;
        ChatSessionMessageEvent chatSessionMessageEvent2;
        ?? r4;
        if (adquVar != null) {
            advr.g("message transfer failed for message %s, type %s", adquVar.k, adquVar.a.toString());
            adqt adqtVar = adquVar.a;
            if (adqtVar != adqt.IS_COMPOSING_INDICATOR && adquVar.k != null) {
                if (adqtVar != adqt.DISPOSITION_NOTIFICATION) {
                    long j = i;
                    adqv adqvVar = this.b.S;
                    String str = adquVar.c;
                    if (str == null) {
                        k = this.c.h(this.a);
                    } else {
                        k = adwf.k(str, this.c.n);
                    }
                    String str2 = k;
                    adrc adrcVar = this.b;
                    boolean z2 = adrcVar.F;
                    if (z2 && adwf.A(str, adrcVar.J)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    adrc adrcVar2 = this.b;
                    int i2 = acnq.a;
                    String x = adrcVar2.x();
                    String str3 = adquVar.k;
                    if (str3 == null) {
                        str3 = agkx.ag().f();
                    }
                    String str4 = str3;
                    Duration duration2 = Duration.ZERO;
                    if (aczx.s()) {
                        duration = adqvVar.h;
                    } else {
                        duration = duration2;
                    }
                    if ("message/cpim".equalsIgnoreCase(adquVar.h)) {
                        try {
                            aifd b = aifd.b(adquVar.f);
                            chatSessionMessageEvent2 = new ChatSessionMessageEvent(50031, j, this.a, str4, z, adquVar.j, str2, x, b.e(), b.c, z2, duration);
                            String g = b.g("urn:ietf:params:imdn", "Disposition-Notification");
                            if (g == null) {
                                r4 = 0;
                            } else {
                                boolean contains = g.contains("positive-delivery");
                                boolean z3 = contains;
                                if (g.contains("negative-delivery")) {
                                    z3 = (contains ? 1 : 0) | 2;
                                }
                                boolean z4 = z3;
                                if (g.contains("display")) {
                                    z4 = (z3 ? 1 : 0) | '\b';
                                }
                                r4 = z4;
                                if (g.contains("processing")) {
                                    r4 = (z4 ? 1 : 0) | 4;
                                }
                            }
                            advr.c("Requested reports: %d", Integer.valueOf((int) r4));
                            chatSessionMessageEvent2.e = r4;
                        } catch (Exception e) {
                            advr.i(e, "Error while reading message: %s", e.getMessage());
                            chatSessionMessageEvent = new ChatSessionMessageEvent(50031, j, this.a, str4, z, adquVar.j, str2, x, null, null, z2, duration);
                        }
                    } else {
                        chatSessionMessageEvent2 = new ChatSessionMessageEvent(50031, j, this.a, str4, z, adquVar.j, str2, x, adquVar.h, adquVar.f, z2, duration);
                    }
                    chatSessionMessageEvent2.b = adquVar.j;
                    chatSessionMessageEvent = chatSessionMessageEvent2;
                    this.c.g.c(chatSessionMessageEvent, advy.IMS_CHAT_SESSION_PROVIDER);
                    return;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.adqy
    public final void b(adqu adquVar) {
        String str;
        advr.c("Message transferred successfully, ID %s, type %s", adquVar.k, adquVar.a.toString());
        adrc adrcVar = this.b;
        boolean z = adrcVar.F;
        adqt adqtVar = adquVar.a;
        if (adqtVar == adqt.IS_COMPOSING_INDICATOR) {
            return;
        }
        if (adqtVar != adqt.DISPOSITION_NOTIFICATION) {
            if (z) {
                str = adrcVar.J;
            } else {
                str = adrcVar.o;
            }
            this.c.g.c(new ChatSessionMessageEvent(this.a, adquVar.k, adquVar.j, 50030, str, z), advy.IMS_CHAT_SESSION_PROVIDER);
            return;
        }
        throw null;
    }

    @Override // defpackage.adqy
    public final void c(adqu adquVar) {
        String str;
        acno acnoVar = this.c;
        adrc adrcVar = this.b;
        String str2 = adquVar.c;
        if (str2 == null) {
            if (adrcVar.F) {
                str = adwf.k(adrcVar.J, acnoVar.n);
            } else {
                str = adrcVar.o;
            }
        } else if (adrcVar.F) {
            str = adwf.k(str2, acnoVar.n);
        } else {
            str = adrcVar.o;
        }
        long j = this.a;
        if (str == null) {
            advr.g("Unable to retrieve sender userId for message %s, session %d", adquVar.toString(), Long.valueOf(j));
            return;
        }
        try {
            acnoVar.q.a(adquVar, j, str);
        } catch (Exception e) {
            advr.i(e, "Error while processing message: %s", adquVar);
        }
    }

    @Override // defpackage.adpb
    public final void d() {
        adrc adrcVar = (adrc) this.c.e.get(Long.valueOf(this.a));
        if (adrcVar != this.b) {
            return;
        }
        u();
        if (adrcVar.p) {
            t(5L);
        } else {
            t(4L);
        }
    }

    @Override // defpackage.adpb
    public final void e() {
        adrc adrcVar = (adrc) this.c.e.get(Long.valueOf(this.a));
        if (adrcVar != this.b) {
            return;
        }
        u();
        if (adrcVar.p) {
            t(4L);
        } else {
            t(5L);
        }
    }

    @Override // defpackage.adpb
    public final void f(adug adugVar) {
        advr.k("Session start failed with exception: %d for session %d", Integer.valueOf(adugVar.a), Long.valueOf(this.a));
        u();
        t(y(adugVar.a));
    }

    @Override // defpackage.adpb
    public final void g(int i, String str) {
        advr.k("Session start failed: %d %s for session %d", Integer.valueOf(i), str, Long.valueOf(this.a));
        adrc adrcVar = (adrc) this.c.e.get(Long.valueOf(this.a));
        if (adrcVar != this.b) {
            return;
        }
        u();
        if (adrcVar.F) {
            adqq adqqVar = this.b.O;
            advr.g("Group session start failed with connecting method %s", adqqVar.toString());
            if (i == 488) {
                s();
                return;
            }
            if (adqqVar == adqq.CONFERENCE_FACTORY_URI) {
                w();
            }
            if (i == 404) {
                if (adqqVar == adqq.CONFERENCE_URI) {
                    Optional a = this.c.j.a(this.a);
                    if (a.isEmpty()) {
                        advr.q("Unable to reconnect to conference without valid group session data!", new Object[0]);
                        return;
                    }
                    Pair n = this.c.n(adqq.GROUP_ID, (adum) a.get());
                    adrc adrcVar2 = (adrc) n.second;
                    if (((ChatSessionServiceResult) n.first).succeeded() && !Objects.isNull(adrcVar2)) {
                        acno acnoVar = this.c;
                        long j = this.a;
                        advr.c("Transferring queued messages from %s to %s", adrcVar.toString(), adrcVar2.toString());
                        if (!adrcVar.L.isEmpty()) {
                            ArrayList arrayList = new ArrayList(adrcVar.L.size());
                            adrcVar.L.drainTo(arrayList);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                acnoVar.x(j, adrcVar2, (adqu) it.next());
                            }
                        }
                    }
                }
                i = 404;
            }
            this.c.f.remove(Long.valueOf(this.a));
            this.c.g.c(x(this.a, y(i)), advy.IMS_CHAT_SESSION_PROVIDER);
            return;
        }
        int y = y(i);
        v();
        this.c.g.c(new ChatSessionEvent(50003, this.a, y), advy.IMS_CHAT_SESSION_PROVIDER);
    }

    @Override // defpackage.adpb
    public final void h() {
        Event chatSessionEvent;
        if (this.b.F) {
            Optional a = this.c.j.a(this.a);
            if (a.isPresent()) {
                advr.c("Subscribe to group session: %d", Long.valueOf(this.a));
                String str = this.b.J;
                if (str == null) {
                    advr.g("No conference uri. Cannot subscribe.", new Object[0]);
                } else {
                    acno acnoVar = this.c;
                    long j = this.a;
                    aduo aduoVar = acnoVar.j;
                    synchronized (aduoVar.b) {
                        Long valueOf = Long.valueOf(j);
                        advr.c("Updating conference URI for session %d to %s", valueOf, str);
                        adum adumVar = (adum) aduoVar.b.get(valueOf);
                        if (adumVar == null) {
                            advr.g("No group found for ID %d. Cannot update conference URI.", valueOf);
                        } else {
                            adumVar.e = Optional.of(str);
                            try {
                                aduoVar.d();
                            } catch (IOException e) {
                                advr.i(e, "Error while saving groups: %s", e.getMessage());
                            }
                        }
                    }
                    this.c.i.p(this.a);
                    this.b.aR(this.a, (adpe) ((adum) a.get()).c.orElse(null));
                }
            } else {
                advr.g("Group not known. Cannot subscribe to session: %s", Long.valueOf(this.a));
            }
        }
        if (this.b.F) {
            chatSessionEvent = p(50002, this.a);
        } else {
            chatSessionEvent = new ChatSessionEvent(50002, this.a, 0L);
        }
        this.c.g.c(chatSessionEvent, advy.IMS_CHAT_SESSION_PROVIDER);
        acnp acnpVar = (acnp) this.c.f.remove(Long.valueOf(this.a));
        if (acnpVar != null) {
            advr.c("Performing session started action: %s", acnpVar.toString());
            try {
                acnpVar.a();
            } catch (Exception e2) {
                advr.s(e2, "Unable to execute session started action %s", acnpVar.toString());
            }
        }
    }

    @Override // defpackage.adpb
    public final void i() {
        advr.c("Session %d starting", Long.valueOf(this.a));
    }

    @Override // defpackage.adpb
    public final void j() {
        r(0L);
    }

    @Override // defpackage.adpb
    public final void k(adug adugVar) {
        r(adugVar.a);
    }

    @Override // defpackage.adpb
    public final void l() {
        if (((adrc) this.c.e.get(Long.valueOf(this.a))) == this.b) {
            u();
            adrc adrcVar = this.b;
            if (adrcVar.F) {
                if (adrcVar.ay() == adpi.GONE) {
                    s();
                }
            } else {
                this.c.g.c(new ChatSessionEvent(50005, this.a, 0L), advy.IMS_CHAT_SESSION_PROVIDER);
                v();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.lang.Iterable] */
    public final GroupChatSessionEvent p(int i, long j) {
        Optional of;
        String str;
        adsh adshVar = new adsh(i, j, 0L);
        GroupInfo g = this.c.g(this.a);
        if (g == null) {
            advr.q("Null GroupInfo for group session. RCS session id: %s", Long.valueOf(this.a));
        } else {
            adshVar.a(g);
        }
        if (((Boolean) acno.a.a()).booleanValue()) {
            long j2 = this.a;
            Optional q = this.c.q(j2);
            if (q.isEmpty()) {
                of = Optional.empty();
            } else {
                advr.c("Creating group information from group session data for session %d", Long.valueOf(j2));
                adum adumVar = (adum) q.get();
                anzh anzhVar = new anzh(null, null, null);
                anzhVar.f = adumVar.d;
                anzhVar.s((String) adumVar.f.orElse(this.b.q));
                anzhVar.r((String) adumVar.e.orElse(this.b.J));
                alpt aB = this.b.aB();
                ajpj ajpjVar = new ajpj();
                ajpjVar.b(aB.contains(GroupManagementContentType.CONTENT_TYPE));
                anzhVar.d = Optional.of(ajpjVar.a());
                Optional optional = adumVar.b;
                if (optional.isEmpty()) {
                    of = Optional.of(anzhVar.q());
                } else {
                    ((acop) optional.get()).a.ifPresent(new aauv(anzhVar, 15));
                    acpl acplVar = ((acop) optional.get()).d;
                    if (acplVar != null && !acplVar.isEmpty()) {
                        int size = acplVar.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            acpk acpkVar = (acpk) acplVar.get(i2);
                            if (acpkVar.g()) {
                                ajyt e = GroupMember.e();
                                e.c = ajpu.c(acpkVar.g);
                                if (TextUtils.isEmpty(acpkVar.a)) {
                                    str = acpkVar.g;
                                } else {
                                    str = acpkVar.a;
                                }
                                e.j(str);
                                e.k(acpkVar.i);
                                Optional flatMap = acpkVar.b().flatMap(new acnk(2));
                                if (flatMap.isPresent()) {
                                    String str2 = ((acoz) flatMap.get()).d;
                                    if (!TextUtils.isEmpty(str2)) {
                                        e.e = Optional.of(ajpu.c(str2));
                                    }
                                }
                                GroupMember i3 = e.i();
                                if (anzhVar.a == null) {
                                    if (anzhVar.g == null) {
                                        anzhVar.a = new alob();
                                    } else {
                                        anzhVar.a = new alob();
                                        ((alob) anzhVar.a).j(anzhVar.g);
                                        anzhVar.g = null;
                                    }
                                }
                                ((alob) anzhVar.a).h(i3);
                            }
                        }
                        of = Optional.of(anzhVar.q());
                    } else {
                        of = Optional.of(anzhVar.q());
                    }
                }
            }
            if (of.isEmpty()) {
                advr.q("Null GroupInformation for group session. RCS session id: %s", Long.valueOf(this.a));
            } else {
                adshVar.i = Optional.of(of.get());
            }
        }
        return new GroupChatSessionEvent(adshVar);
    }

    @Override // defpackage.adpb
    public final void m() {
    }

    @Override // defpackage.adpb
    public final void n() {
    }

    @Override // defpackage.adpb
    public final void o() {
    }

    @Override // defpackage.adpb
    public final void q() {
    }
}
