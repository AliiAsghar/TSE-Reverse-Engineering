package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.ims.chatsession.ChatSessionEngine;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.group.UserInfo;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acno implements acnj, acub, adjr {
    static final acyz a = aczd.a(153260444);
    static final acyz b;
    static final acyz c;
    public static final advp d;
    private final aiim A;
    private final acqj B;
    private final adwe C;
    private final adqw D;
    private final acua E;
    private final acua F;
    private final adqy G;
    private final adaw H;
    protected final ConcurrentHashMap e = new ConcurrentHashMap();
    public final Map f = new HashMap();
    public final acrm g;
    public final Context h;
    public final adqs i;
    public final aduo j;
    public final adrm k;
    public final adps l;
    public final acqy m;
    public final yjr n;
    final acua o;
    public final adjw p;
    public final actz q;
    final acua r;
    final acua s;
    final ahjj t;
    private final armf u;
    private final ChatSessionEngine v;
    private final adrh w;
    private final adpu x;
    private final aegu y;
    private final acof z;

    static {
        aczd.a(141314033);
        b = aczd.a(157085528);
        c = aczd.a(179153382);
        aczd.a(162601747);
        d = new advp("ImsChatSessionProvider");
    }

    public acno(Context context, armf armfVar, adrh adrhVar, adqs adqsVar, aduo aduoVar, ChatSessionEngine chatSessionEngine, adps adpsVar, adpu adpuVar, acrm acrmVar, acqy acqyVar, yjr yjrVar, aiim aiimVar, adjw adjwVar, acqj acqjVar, adwe adweVar, aegu aeguVar, acof acofVar) {
        acnl acnlVar = new acnl(this, 1);
        this.o = acnlVar;
        actz actzVar = new actz();
        this.q = actzVar;
        acnl acnlVar2 = new acnl(this, 0);
        this.r = acnlVar2;
        acnl acnlVar3 = new acnl(this, 2);
        this.s = acnlVar3;
        acnl acnlVar4 = new acnl(this, 3);
        this.E = acnlVar4;
        acnl acnlVar5 = new acnl(this, 4);
        this.F = acnlVar5;
        ahjj ahjjVar = new ahjj(this, (byte[]) null);
        this.t = ahjjVar;
        acnm acnmVar = new acnm();
        this.G = acnmVar;
        this.v = chatSessionEngine;
        this.h = context;
        this.u = armfVar;
        this.w = adrhVar;
        this.i = adqsVar;
        this.j = aduoVar;
        this.g = acrmVar;
        adrm adrmVar = new adrm();
        this.k = adrmVar;
        adrmVar.b = ahjjVar;
        adrhVar.t(acnmVar);
        this.l = adpsVar;
        this.x = adpuVar;
        this.m = acqyVar;
        this.n = yjrVar;
        this.H = new adaw(yjrVar);
        this.A = aiimVar;
        this.p = adjwVar;
        this.B = acqjVar;
        this.C = adweVar;
        this.D = adrhVar.t;
        this.y = aeguVar;
        this.z = acofVar;
        actzVar.w("text/plain", acnlVar);
        actzVar.w(RbmSpecificMessage.CONTENT_TYPE, acnlVar2);
        actzVar.w("application/im-iscomposing+xml", acnlVar5);
        actzVar.w("application/vnd.gsma.botsuggestion.v1.0+json", acnlVar3);
        actzVar.w("video/aliasing", acnlVar4);
        actzVar.w(adah.c, acnlVar4);
        actzVar.w("video/key-frame-request", acnlVar4);
        actzVar.w(adah.e, acnlVar4);
        actzVar.w(GroupManagementContentType.CONTENT_TYPE, new acty(acrmVar));
    }

    private final Optional A() {
        return this.p.a().map(new aand(16));
    }

    private final List B(String str) {
        ArrayList arrayList = new ArrayList(1);
        for (adrc adrcVar : this.e.values()) {
            if (!adrcVar.F && adwf.A(adrcVar.y(), str)) {
                arrayList.add(adrcVar);
            }
        }
        return arrayList;
    }

    private final Map.Entry C(String str) {
        ArrayList<Map.Entry> arrayList = new ArrayList(1);
        for (Map.Entry entry : this.e.entrySet()) {
            adrc adrcVar = (adrc) entry.getValue();
            if (!adrcVar.F && adrcVar.z().equals(str)) {
                arrayList.add(entry);
            }
        }
        for (Map.Entry entry2 : arrayList) {
            adrc adrcVar2 = (adrc) entry2.getValue();
            if ((adrcVar2 instanceof adrv) || (adrcVar2 instanceof adrq)) {
                return entry2;
            }
        }
        return null;
    }

    private static void D(adrc adrcVar) {
        adrcVar.j();
        adrcVar.aO(adra.USER_BLOCKED);
    }

    private final void E(adrc adrcVar, adrv adrvVar) {
        advr.c("Follow up session one2one chat session, declining previous session: %s", adrcVar.k);
        long m = m(adrcVar);
        this.e.put(Long.valueOf(m), adrvVar);
        if (adrcVar instanceof adrv) {
            adrvVar.af.addAll(((adrv) adrcVar).af);
        }
        adrvVar.aG(new acnn(this, adrvVar, m));
        adrcVar.ah(2, 57);
        if (!((Boolean) b.a()).booleanValue()) {
            String z = adrvVar.z();
            if (acqp.a(this.h, z)) {
                advr.c("Follow up One2One chat session will be rejected because contact is blocked. UserId: %s", z);
                D(adrvVar);
                return;
            }
        }
        F(adrvVar, m(adrvVar));
        adrvVar.j();
        if (J(adrvVar)) {
            advr.c("Automatically accepting chat session %s", adrvVar.k);
            adrvVar.C();
        }
    }

    private final void F(adrv adrvVar, long j) {
        String str;
        adqu adquVar = adrvVar.N;
        if (adquVar == null) {
            str = "null";
        } else {
            str = adquVar.k;
        }
        advr.c("Notifying message filters of initial message: %s", str);
        try {
            this.q.a(adquVar, j, adrvVar.z());
        } catch (IOException e) {
            advr.i(e, "Unable to notify message filters: %s", e.getMessage());
        }
    }

    private final void G(adrv adrvVar) {
        advr.c("Initial chat session...", new Object[0]);
        if (L(adrvVar)) {
            advr.q("Received invalid group chat invitation, will decline session: %s", adrvVar.toString());
            adrvVar.j();
            adrvVar.ap();
            return;
        }
        long registerSession = this.v.registerSession((acnj) this);
        if (!((Boolean) b.a()).booleanValue()) {
            String z = adrvVar.z();
            if (!adrvVar.F && acqp.a(this.h, z)) {
                advr.c("New One2One chat session will be rejected because contact is blocked. %s", advq.USER_ID.c(z));
                D(adrvVar);
                return;
            }
        }
        ConcurrentHashMap concurrentHashMap = this.e;
        Long valueOf = Long.valueOf(registerSession);
        concurrentHashMap.put(valueOf, adrvVar);
        adrvVar.aG(new acnn(this, adrvVar, registerSession));
        if (adrvVar.F) {
            advr.c("Register group session: %d", valueOf);
            Optional a2 = this.j.a(registerSession);
            if (a2.isPresent()) {
                advr.q("Group session with ID %d, already exists! Cannot register.", valueOf);
            } else {
                String w = adrvVar.w();
                aduo aduoVar = this.j;
                String str = adrvVar.q;
                String str2 = ((adrc) adrvVar).J;
                advr.c("Registering group session %d, group ID %s, subject %s, conference URI %s", valueOf, w, advq.MESSAGE_CONTENT.c(str), advq.URI_SIP.c(str2));
                if (w == null) {
                    advr.g("Could not register group session. Invalid parameters.", new Object[0]);
                    a2 = Optional.empty();
                } else {
                    synchronized (aduoVar.b) {
                        adum adumVar = (adum) aduoVar.b.get(valueOf);
                        if (adumVar == null) {
                            advr.c("Creating group session data.", new Object[0]);
                            adum adumVar2 = new adum(registerSession, w, str, str2);
                            aduoVar.b.put(valueOf, adumVar2);
                            adumVar = adumVar2;
                        }
                        try {
                            aduoVar.d();
                        } catch (IOException unused) {
                            advr.g("Error while storing group data", new Object[0]);
                        }
                        a2 = Optional.of(adumVar);
                    }
                }
            }
            if (!a2.isPresent()) {
                advr.g("Unable to register group session for an incoming conference invitation", new Object[0]);
            }
        }
        F(adrvVar, registerSession);
        adrvVar.j();
        if (J(adrvVar)) {
            advr.c("Automatically accepting chat session %d", Long.valueOf(registerSession));
            adrvVar.C();
        }
        if (adrvVar.F) {
            Bundle bundle = new Bundle();
            boolean z2 = adrvVar.F;
            String x = adrvVar.x();
            String z3 = adrvVar.z();
            bundle.putString(RcsIntents.EXTRA_USER_ID, z3);
            bundle.putString(RcsIntents.EXTRA_REMOTE_INSTANCE, x);
            bundle.putBoolean(RcsIntents.EXTRA_IS_CONFERENCE, z2);
            bundle.putLong("rcs.intent.extra.sessionid", registerSession);
            bundle.putString(RcsIntents.EXTRA_SUBJECT, adrvVar.q);
            acqv h = this.m.h(z3);
            if (!Objects.isNull(h)) {
                adcx.l(h.a, h.b, bundle);
            }
            List<String> aF = adrvVar.aF();
            GroupInfo groupInfo = new GroupInfo();
            ArrayList arrayList = new ArrayList();
            for (String str3 : aF) {
                int indexOf = str3.indexOf(59);
                if (indexOf >= 0) {
                    str3 = str3.substring(0, indexOf);
                }
                UserInfo p = p(str3);
                if (!arrayList.contains(p)) {
                    arrayList.add(p);
                }
            }
            groupInfo.b = arrayList;
            groupInfo.a = adrvVar.q;
            groupInfo.a(adrvVar.w());
            groupInfo.d = ((adrc) adrvVar).J;
            bundle.putParcelable(RcsIntents.EXTRA_GROUP_INFO, groupInfo);
            String str4 = ((adrc) adrvVar).I;
            if (str4 != null) {
                bundle.putString(RcsIntents.EXTRA_REFERRER, str4);
            }
            advz.c(this.h, RcsIntents.ACTION_INCOMING_GROUP_CHAT, bundle, advy.IMS_CHAT_SESSION_PROVIDER);
        }
    }

    private final void H(adrc adrcVar) {
        adrcVar.Q = ((Boolean) this.p.a().map(new acnk(4)).orElse(false)).booleanValue();
    }

    private static void I(adqu adquVar, String str, String str2, byte[] bArr) {
        Object valueOf;
        if (bArr == null) {
            valueOf = "0";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        adquVar.n = "Type: " + str2 + "\r\nRCS message ID: " + str + "\r\nContent length: " + valueOf.toString();
    }

    private final boolean J(adrc adrcVar) {
        Optional map = this.p.a().map(new aand(16));
        if (((Boolean) c.a()).booleanValue() && map.isEmpty()) {
            advr.q("Unable to check if auto accept is required from Configuration", new Object[0]);
            return true;
        }
        if (adrcVar.F) {
            return ((InstantMessageConfiguration) map.get()).mAutoAcceptGroupChat;
        }
        return ((InstantMessageConfiguration) map.get()).mAutoAccept;
    }

    private final boolean K() {
        return ((Boolean) this.p.a().map(new aand(19)).orElse(false)).booleanValue();
    }

    private final boolean L(adrv adrvVar) {
        String str;
        if (!adrvVar.F) {
            return false;
        }
        if (TextUtils.isEmpty(adrvVar.w())) {
            if (true != K()) {
                str = "Contribution-ID";
            } else {
                str = "Conversation-ID";
            }
            advr.g("Group invitation does not contain a %s", str);
            return true;
        }
        return adrvVar.aF().isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String[] M(adum adumVar) {
        if (adumVar.b.isPresent()) {
            advr.c("Creating participant list from GroupSessionData", new Object[0]);
            Object obj = adumVar.b.get();
            ArrayList arrayList = new ArrayList();
            acpl acplVar = ((acop) obj).d;
            if (acplVar != null) {
                int size = acplVar.size();
                for (int i = 0; i < size; i++) {
                    acpk acpkVar = (acpk) acplVar.get(i);
                    if (!acpkVar.i && acpkVar.g()) {
                        arrayList.add(acpkVar.g);
                    }
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        advr.q("No ConferenceInfo available for session %d", Long.valueOf(adumVar.a));
        return new String[0];
    }

    public static String r(adqu adquVar) {
        String str = adquVar.k;
        if (str == null) {
            advr.c("Message ID was null, generating a new one!", new Object[0]);
            return agkx.ag().f();
        }
        return str;
    }

    private final ChatSessionServiceResult z(long j, String str, adqu adquVar) {
        int i;
        String c2;
        long j2 = j;
        advr.c("startSession with instant message %s", adquVar);
        if (!this.w.l()) {
            advr.c("Not registered!", new Object[0]);
            return new ChatSessionServiceResult(j2, 4, "Not registered to RCS");
        }
        Optional A = A();
        if (A.isEmpty()) {
            advr.k("instantMessageConfiguration is not present", new Object[0]);
            return new ChatSessionServiceResult(j2, 2, "Not configured");
        }
        try {
            try {
            } catch (aiip e) {
                e = e;
            }
            try {
                adrq adrqVar = new adrq(this.h, this.w, this.u, str, this.A, this.j, this.x, this.B, this.C, (InstantMessageConfiguration) A.get(), 1, this.z);
                H(adrqVar);
                String str2 = adquVar.k;
                adrqVar.N = adquVar;
                boolean ad = agkx.ad(str);
                if (ad) {
                    c2 = advq.USER_ID_BOT.c(str);
                } else {
                    c2 = advq.USER_ID.c(str);
                }
                advr.k("Starting session for: %s", c2);
                if (ad) {
                    adrqVar.bn();
                }
                adrqVar.aG(new acnn(this, adrqVar, j));
                this.e.put(Long.valueOf(j), adrqVar);
                adrqVar.j();
                return new ChatSessionServiceResult(j, str2, 0);
            } catch (aiip e2) {
                e = e2;
                j2 = j;
                i = 0;
                advr.i(e, "MsrpException while creating OriginatingChatSession", new Object[i]);
                return new ChatSessionServiceResult(j2, 17, e.getMessage());
            }
        } catch (aiip e3) {
            e = e3;
            i = 0;
        }
    }

    @Override // defpackage.acnj
    public final long a(String str) {
        if (C(str) == null) {
            return this.v.registerSession((acnj) this);
        }
        return -1L;
    }

    @Override // defpackage.acnj
    public final ChatSessionServiceResult b(long j) {
        boolean containsKey;
        ConcurrentHashMap concurrentHashMap = this.e;
        Long valueOf = Long.valueOf(j);
        adrc adrcVar = (adrc) concurrentHashMap.get(valueOf);
        int i = 0;
        advr.c("Ending chat session ...", new Object[0]);
        if (adrcVar == null) {
            aduo aduoVar = this.j;
            synchronized (aduoVar.b) {
                containsKey = aduoVar.b.containsKey(valueOf);
            }
            if (!containsKey) {
                i = 9;
            }
        } else {
            if (adrcVar.F) {
                adrcVar.aW(adpi.DISCONNECT);
            } else {
                adrcVar.aW(adpi.LEAVE);
            }
            if (adrcVar.p) {
                adrcVar.l();
            } else {
                adrcVar.ah(5, 29);
            }
        }
        return new ChatSessionServiceResult(j, i);
    }

    @Override // defpackage.acnj
    public final ChatSessionServiceResult c(long j) {
        if (!this.w.l()) {
            advr.c("Not registered!", new Object[0]);
            return new ChatSessionServiceResult(j, 4, "Not registered to RCS");
        }
        ConcurrentHashMap concurrentHashMap = this.e;
        Long valueOf = Long.valueOf(j);
        adrc adrcVar = (adrc) concurrentHashMap.get(valueOf);
        if (adrcVar == null) {
            Optional a2 = this.j.a(j);
            if (a2.isEmpty()) {
                advr.c("Session %d not found!", valueOf);
                return new ChatSessionServiceResult(j, 9);
            }
            return (ChatSessionServiceResult) n(adqq.CONFERENCE_URI, (adum) a2.get()).first;
        }
        adrcVar.C();
        return new ChatSessionServiceResult(j, 0);
    }

    @Override // defpackage.acnj
    public final ChatSessionServiceResult d(long j, String str, String str2, byte[] bArr) {
        ChatSessionServiceResult chatSessionServiceResult;
        apwq apwqVar = apwq.a;
        Long valueOf = Long.valueOf(j);
        advr.c("sendMessage {Session: %d, Message Id: %s", valueOf, str);
        if (!this.w.l()) {
            advr.c("Not registered!", new Object[0]);
            return new ChatSessionServiceResult(j, 4, "Not registered to RCS");
        }
        adrc adrcVar = (adrc) this.e.get(valueOf);
        if (adrcVar == null) {
            advr.c("session is not found. Reconnecting... Session: %d, Message Id: %s", valueOf, str);
            return y(j, str, str2, bArr, apwqVar);
        }
        if (adrcVar.bb() && !(adrcVar instanceof adrt)) {
            advr.c("Sending message along existing session: %d [Session ID: %s]", valueOf, adrcVar.k);
            try {
                adqu a2 = acnq.a(adrcVar, str, str2, bArr, apwqVar);
                I(a2, str, str2, bArr);
                adrcVar.aQ(a2);
                advr.c("Successfully queued message!", new Object[0]);
                chatSessionServiceResult = new ChatSessionServiceResult(j, str, 0);
            } catch (adqx e) {
                advr.i(e, "Error while sending message: %s", e.getMessage());
                chatSessionServiceResult = new ChatSessionServiceResult(j, str, 1);
            }
            return chatSessionServiceResult;
        }
        if (adrcVar.a == adpk.STOPPED) {
            advr.q("Cleaning up unexpected stale session %d in state STOPPED:\n%s", valueOf, adrcVar.B());
            this.w.i(adrcVar);
        }
        if (adrcVar.F) {
            return y(j, str, str2, bArr, apwqVar);
        }
        advr.c("Sending message along new created session - session not established: %d", valueOf);
        String z = adrcVar.z();
        this.w.a();
        adqu c2 = acnq.c(str, str2, bArr, apwqVar, K());
        I(c2, str, str2, bArr);
        return z(j, z, c2);
    }

    @Override // defpackage.acnj
    public final ChatSessionServiceResult e(String str, byte[] bArr, String str2, String str3) {
        return f(str, -1L, bArr, str2, str3);
    }

    @Override // defpackage.acnj
    public final ChatSessionServiceResult f(String str, long j, byte[] bArr, String str2, String str3) {
        apwq apwqVar = apwq.a;
        advr.c("Send message with content type %s to %s, message ID is %s", str2, advq.USER_ID.c(str), str3);
        Map.Entry C = C(str);
        if (C != null) {
            advr.c("Sending message via session %s", ((Long) C.getKey()).toString());
            return d(((Long) C.getKey()).longValue(), str3, str2, bArr);
        }
        advr.c("Creating new session to send message", new Object[0]);
        this.w.s(str);
        if (j == -1) {
            j = this.v.registerSession((acnj) this);
        }
        this.w.a();
        adqu c2 = acnq.c(str3, str2, bArr, apwqVar, K());
        I(c2, str3, str2, bArr);
        return z(j, str, c2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.acnj
    public final GroupInfo g(long j) {
        acpl acplVar;
        Optional q = q(j);
        if (q.isEmpty()) {
            return null;
        }
        advr.c("Creating group info from group session data for session %d", Long.valueOf(((adum) q.get()).a));
        adum adumVar = (adum) q.get();
        GroupInfo groupInfo = new GroupInfo();
        groupInfo.a = (String) adumVar.f.orElse(null);
        groupInfo.a(adumVar.d);
        adumVar.e.ifPresent(new aauv(groupInfo, 13));
        Optional optional = adumVar.b;
        if (!optional.isEmpty() && (acplVar = ((acop) optional.get()).d) != null && acplVar.size() != 0) {
            int size = acplVar.size();
            for (int i = 0; i < size; i++) {
                acpk acpkVar = (acpk) acplVar.get(i);
                if (acpkVar.g()) {
                    UserInfo o = o(acpkVar);
                    int indexOf = groupInfo.b.indexOf(o);
                    if (indexOf < 0) {
                        groupInfo.b.add(o);
                    } else {
                        advr.c("Replacing user in group info: %s", o.a);
                        groupInfo.b.set(indexOf, o);
                    }
                }
            }
        }
        return groupInfo;
    }

    @Override // defpackage.acnj
    public final String h(long j) {
        adrc adrcVar = (adrc) this.e.get(Long.valueOf(j));
        if (adrcVar != null && !adrcVar.F) {
            return adrcVar.o;
        }
        String str = (String) this.j.a(j).map(new acnk(5)).map(new aand(17)).orElse(null);
        if (Objects.isNull(str)) {
            return null;
        }
        return this.H.e(str);
    }

    @Override // defpackage.acnj
    public final boolean i() {
        return this.w.l();
    }

    @Override // defpackage.acnj
    public final long[] j() {
        return adom.p(this.e.keySet());
    }

    @Override // defpackage.acnj
    public final String[] k(long j) {
        adrc adrcVar = (adrc) this.e.get(Long.valueOf(j));
        if (adrcVar != null && adrcVar.F) {
            adaw adawVar = this.H;
            List aF = adrcVar.aF();
            alob alobVar = new alob();
            Iterator it = aF.iterator();
            while (it.hasNext()) {
                alobVar.h(adawVar.e((String) it.next()));
            }
            return (String[]) alobVar.g().toArray(new String[0]);
        }
        return new String[0];
    }

    @Override // defpackage.acnj
    public final ChatSessionServiceResult l(long j) {
        if (!this.w.l()) {
            advr.c("Not registered!", new Object[0]);
            return new ChatSessionServiceResult(j, 4, "Not registered to RCS");
        }
        return new ChatSessionServiceResult(j, 1, "Not implemented");
    }

    public final long m(adrc adrcVar) {
        for (Map.Entry entry : this.e.entrySet()) {
            if (entry.getValue() == adrcVar) {
                return ((Long) entry.getKey()).longValue();
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair n(adqq adqqVar, adum adumVar) {
        int i;
        long j;
        String[] M;
        long j2;
        adrq adrqVar;
        advr.c("Reconnecting with method %s to %s", adqqVar, adumVar);
        if (adqqVar == adqq.CONFERENCE_FACTORY_URI) {
            advr.q("Unable to reconnect using method %s", adqqVar.toString());
            return Pair.create(new ChatSessionServiceResult(12), null);
        }
        Optional A = A();
        if (!A.isEmpty()) {
            try {
                j = adumVar.a;
                M = M(adumVar);
            } catch (Exception e) {
                e = e;
                i = 0;
            }
            try {
                if (adqqVar == adqq.CONFERENCE_URI) {
                    Context context = this.h;
                    adrh adrhVar = this.w;
                    armf armfVar = this.u;
                    aiim aiimVar = this.A;
                    aduo aduoVar = this.j;
                    adpu adpuVar = this.x;
                    acqj acqjVar = this.B;
                    adwe adweVar = this.C;
                    InstantMessageConfiguration instantMessageConfiguration = (InstantMessageConfiguration) A.get();
                    acof acofVar = this.z;
                    int i2 = adrq.aa;
                    advr.c("Creating a chat conference session as originating, reconnecting via conference URI", new Object[0]);
                    String str = (String) adumVar.e.orElse(null);
                    if (!albo.ah(str)) {
                        adrq adrqVar2 = new adrq(context, adrhVar, armfVar, str, aiimVar, aduoVar, adpuVar, acqjVar, adweVar, instantMessageConfiguration, 1, acofVar);
                        adrqVar2.bp(adumVar, M);
                        ((adrc) adrqVar2).J = str;
                        adrqVar2.Z = true;
                        adrqVar2.O = adqq.CONFERENCE_URI;
                        H(adrqVar2);
                        adrqVar = adrqVar2;
                        j2 = j;
                    } else {
                        throw new aild("ConferenceUri is empty.");
                    }
                } else if (adqqVar == adqq.GROUP_ID) {
                    if (M.length == 0) {
                        advr.q("No participants in group.", new Object[0]);
                        return Pair.create(new ChatSessionServiceResult(107), null);
                    }
                    Context context2 = this.h;
                    adrh adrhVar2 = this.w;
                    armf armfVar2 = this.u;
                    aiim aiimVar2 = this.A;
                    aduo aduoVar2 = this.j;
                    adpu adpuVar2 = this.x;
                    acqj acqjVar2 = this.B;
                    adwe adweVar2 = this.C;
                    InstantMessageConfiguration instantMessageConfiguration2 = (InstantMessageConfiguration) A.get();
                    acof acofVar2 = this.z;
                    int i3 = adrq.aa;
                    j2 = j;
                    advr.c("Creating a chat conference session as originating, reconnecting via Group-ID: %s", adumVar.d);
                    advr.c("Creating a new chat conference session as originating", new Object[0]);
                    adrq adrqVar3 = new adrq(context2, adrhVar2, armfVar2, adrhVar2.a.d().mConferenceFactoryUri, aiimVar2, aduoVar2, adpuVar2, acqjVar2, adweVar2, instantMessageConfiguration2, 1, acofVar2);
                    adrqVar3.bo();
                    adrqVar3.aV(M);
                    adrqVar3.O = adqq.CONFERENCE_FACTORY_URI;
                    adrqVar3.bp(adumVar, M);
                    adrqVar3.O = adqq.GROUP_ID;
                    H(adrqVar3);
                    adrqVar = adrqVar3;
                } else {
                    advr.g("Unknown reconnect method %s", adqqVar.toString());
                    return Pair.create(new ChatSessionServiceResult(j, 1), null);
                }
                long j3 = j2;
                adrqVar.aG(new acnn(this, adrqVar, j3));
                this.e.put(Long.valueOf(j3), adrqVar);
                adrqVar.j();
                advr.k("Successfully reconnected to conference.", new Object[0]);
                return Pair.create(new ChatSessionServiceResult(j3, 0), adrqVar);
            } catch (Exception e2) {
                e = e2;
                i = 0;
                advr.i(e, "Unable to reconnect to conference!", new Object[i]);
                return Pair.create(new ChatSessionServiceResult(1), null);
            }
        }
        advr.k("instantMessageConfiguration is not present", new Object[0]);
        return Pair.create(new ChatSessionServiceResult(2), null);
    }

    public final UserInfo o(acpk acpkVar) {
        UserInfo userInfo = new UserInfo(this.H.e(acpkVar.g));
        userInfo.b = acpkVar.a;
        userInfo.a(acpkVar.g);
        userInfo.d = acpkVar.i;
        userInfo.e = acpkVar.j;
        userInfo.c = acpkVar.a().l;
        return userInfo;
    }

    public final UserInfo p(String str) {
        String e = this.H.e(str);
        UserInfo userInfo = new UserInfo(e);
        userInfo.b = null;
        userInfo.a(str);
        String e2 = this.H.e(this.w.r());
        if (!TextUtils.isEmpty(e2) && !TextUtils.isEmpty(e) && e.equals(e2)) {
            userInfo.d = true;
        }
        return userInfo;
    }

    public final Optional q(long j) {
        ConcurrentHashMap concurrentHashMap = this.e;
        Long valueOf = Long.valueOf(j);
        adrc adrcVar = (adrc) concurrentHashMap.get(valueOf);
        if (adrcVar != null && !adrcVar.F) {
            advr.k("Session %d is a one-to-one session, not a group session.", valueOf);
            return Optional.empty();
        }
        Optional a2 = this.j.a(j);
        if (a2.isEmpty()) {
            advr.q("Session %d not registered in ImsChatSessionProvider or ConferenceInformationStorage. It may not be a group session.", valueOf);
            return Optional.empty();
        }
        return a2;
    }

    public final void s(adqu adquVar, long j, String str, adrc adrcVar) {
        GroupInfo g;
        advr.k("Broadcasting new incoming chat message - remoteUserId:%s messageId:%s session:%d", advq.USER_ID.c(str), adquVar.k, Long.valueOf(j));
        boolean z = adquVar.p;
        boolean z2 = adrcVar.F;
        String str2 = adquVar.h;
        byte[] bArr = adquVar.f;
        String r = r(adquVar);
        String x = adrcVar.x();
        String a2 = adquVar.a();
        long j2 = adquVar.j;
        Bundle bundle = new Bundle();
        bundle.putString(RcsIntents.EXTRA_USER_ID, str);
        bundle.putString(RcsIntents.EXTRA_REMOTE_INSTANCE, x);
        bundle.putBoolean(RcsIntents.EXTRA_IS_SYSTEM_MESSAGE, z);
        bundle.putBoolean(RcsIntents.EXTRA_IS_CONFERENCE, z2);
        bundle.putString("rcs.intent.extra.contentType", str2);
        bundle.putByteArray(RcsIntents.EXTRA_CONTENT, bArr);
        bundle.putString(RcsIntents.EXTRA_TEXT, a2);
        bundle.putLong(RcsIntents.EXTRA_TIMESTAMP, j2);
        bundle.putLong("rcs.intent.extra.sessionid", j);
        rve.h(bundle, RcsIntents.EXTRA_MESSAGE_ID, rve.a(r));
        bundle.putBoolean(RcsIntents.EXTRA_IS_BOT, adrcVar.K);
        if (adquVar.l > 0) {
            bundle.putInt(RcsIntents.EXTRA_SPAM_VERDICT, 1);
        }
        if (z2 && (g = g(j)) != null && !g.b()) {
            bundle.putParcelable(RcsIntents.EXTRA_GROUP_INFO, g);
        }
        String str3 = adquVar.d;
        TextUtils.isEmpty(null);
        bundle.putString(RcsIntents.EXTRA_SIP_ALIAS, null);
        apwq apwqVar = adquVar.i;
        if (apwqVar != null) {
            bundle.putByteArray(RcsIntents.EXTRA_CUSTOM_HEADERS, apwqVar.toByteArray());
        }
        acqv h = this.m.h(str);
        if (!Objects.isNull(h)) {
            adcx.l(h.a, h.b, bundle);
        }
        String str4 = adquVar.b;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString(RcsIntents.EXTRA_SELF_USER_ID, str4);
        }
        advz.c(this.h, RcsIntents.ACTION_INCOMING_CHAT_MESSAGE, bundle, advy.IMS_CHAT_SESSION_PROVIDER);
        if (adrcVar instanceof adrt) {
            advh.d("Bugle.RcsEngine.Chat.IncomingDeferredMessage");
        }
    }

    public final void t(adrt adrtVar) {
        String y = adrtVar.y();
        advr.c("Incoming deferred messaging session for %s", y);
        for (adrc adrcVar : B(y)) {
            if (adrcVar instanceof adrt) {
                adrt adrtVar2 = (adrt) adrcVar;
                advr.c("Follow up deferred messaging session, declining previous session: %s", adrtVar2.k);
                long m = m(adrtVar2);
                this.e.put(Long.valueOf(m), adrtVar);
                adrtVar.aG(new acnn(this, adrtVar, m));
                adrtVar2.ah(2, 57);
                String z = adrtVar.z();
                if (!((Boolean) b.a()).booleanValue() && acqp.a(this.h, z)) {
                    advr.c("Follow up deferred One2One chat session will be rejected because contact is blocked. %s", advq.USER_ID.c(z));
                    D(adrtVar);
                    adrtVar.j();
                    adrtVar.aO(adra.USER_BLOCKED);
                    return;
                }
                F(adrtVar, m(adrtVar));
                adrtVar.j();
                if (adrtVar.Z || J(adrtVar)) {
                    adrtVar.C();
                    return;
                }
                return;
            }
        }
        advr.c("Initial deferred messaging session...", new Object[0]);
        long registerSession = this.v.registerSession((acnj) this);
        if (!((Boolean) b.a()).booleanValue()) {
            String z2 = adrtVar.z();
            if (acqp.a(this.h, z2)) {
                advr.c("New deferred chat session will be rejected because contact is blocked. UserId: %s", z2);
                D(adrtVar);
                return;
            }
        }
        this.e.put(Long.valueOf(registerSession), adrtVar);
        F(adrtVar, registerSession);
        adrtVar.j();
        adrtVar.aG(new acnn(this, adrtVar, registerSession));
        if (!adrtVar.Z && !J(adrtVar)) {
            return;
        }
        adrtVar.C();
    }

    public final void v(adrv adrvVar) {
        Optional empty;
        H(adrvVar);
        if (adrvVar.F) {
            advr.c("Incoming conference invitation with Group-ID: %s", adrvVar.w());
            if (!((Boolean) this.p.a().map(new acnk(3)).orElse(false)).booleanValue()) {
                advr.q("Group chat disabled. Rejecting session.", new Object[0]);
                adrvVar.j();
                adrvVar.aO(adra.SERVICE_DISABLED);
                return;
            }
            aduo aduoVar = this.j;
            String w = adrvVar.w();
            synchronized (aduoVar.b) {
                Iterator it = aduoVar.b.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        adum adumVar = (adum) it.next();
                        if (adumVar.d.equals(w)) {
                            empty = Optional.of(adumVar);
                            break;
                        }
                    } else {
                        empty = Optional.empty();
                        break;
                    }
                }
            }
            if (empty.isPresent()) {
                adum adumVar2 = (adum) empty.get();
                advr.c("Incoming conference reconnect for: %s", adumVar2.toString());
                long j = adumVar2.a;
                if (L(adrvVar)) {
                    advr.q("Received invalid group chat reconnect, will send 488 NOT ACCEPTABLE for session ID %d: %s", Long.valueOf(j), adrvVar.toString());
                    adrvVar.j();
                    adrvVar.aO(adra.INVALID_PARAMETERS);
                    return;
                }
                ConcurrentHashMap concurrentHashMap = this.e;
                Long valueOf = Long.valueOf(j);
                adrc adrcVar = (adrc) concurrentHashMap.remove(valueOf);
                if (adrcVar != null) {
                    adrcVar.aq();
                }
                acnn acnnVar = new acnn(this, adrvVar, j);
                this.e.put(valueOf, adrvVar);
                F(adrvVar, j);
                adrvVar.j();
                adrvVar.aG(acnnVar);
                adrvVar.C();
                return;
            }
            G(adrvVar);
            return;
        }
        String y = adrvVar.y();
        advr.c("Incoming 1-1 invitation from %s", advq.USER_ID.c(y));
        for (adrc adrcVar2 : B(y)) {
            if (adrcVar2 instanceof adrv) {
                E(adrcVar2, adrvVar);
                return;
            }
            if (adrcVar2 instanceof adrq) {
                if (adrcVar2.l.m) {
                    E(adrcVar2, adrvVar);
                    return;
                }
                advr.c("Parallel incoming session, rejecting", new Object[0]);
                F(adrvVar, m((adrq) adrcVar2));
                adrvVar.j();
                adrvVar.ah(2, 57);
                return;
            }
        }
        G(adrvVar);
    }

    @Override // defpackage.acub
    public final void w(String str, acua acuaVar) {
        this.q.w(str, acuaVar);
    }

    public final void x(long j, adrc adrcVar, adqu adquVar) {
        advr.c("Sending message to group, session ID %d, message ID %s", Long.valueOf(j), adquVar.k);
        try {
            adrcVar.aQ(adquVar);
        } catch (adqx e) {
            advr.i(e, "Unable to send message to group: %s", e.getMessage());
            String str = adquVar.k;
            advr.c("Firing group message failed event for sessiond ID %d, message ID %s", Long.valueOf(j), str);
            if (TextUtils.isEmpty(str)) {
                advr.q("Unable to fire group message failed event, no message ID", new Object[0]);
            } else {
                this.g.c(new ChatSessionMessageEvent(j, 53L, str, this.y.f().toEpochMilli(), 50031, null, true), advy.IMS_CHAT_SESSION_PROVIDER);
            }
        }
    }

    final ChatSessionServiceResult y(long j, String str, String str2, byte[] bArr, apwq apwqVar) {
        Optional a2 = this.j.a(j);
        if (a2.isEmpty()) {
            advr.g("Could not find data for group %d", Long.valueOf(j));
            return new ChatSessionServiceResult(j, String.valueOf(str), 9);
        }
        advr.c("Reconnecting to chat conference id: %d, %s", Long.valueOf(j), a2);
        if (M((adum) a2.get()).length == 0) {
            advr.q("No participants in group - will not send any message!", new Object[0]);
            return new ChatSessionServiceResult(j, 107);
        }
        Pair n = n((adqq) ((adum) a2.get()).e.map(new aand(18)).orElseGet(new zhh(17)), (adum) a2.get());
        ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) n.first;
        adrc adrcVar = (adrc) n.second;
        if (Objects.isNull(adrcVar)) {
            advr.q("Failed to reconnect to conference", new Object[0]);
            return new ChatSessionServiceResult(j, 1);
        }
        if (chatSessionServiceResult.succeeded()) {
            adqu a3 = acnq.a(adrcVar, str, str2, bArr, apwqVar);
            I(a3, str, str2, bArr);
            x(j, adrcVar, a3);
        }
        return chatSessionServiceResult;
    }

    @Override // defpackage.adjr
    public final /* synthetic */ void u(Configuration configuration) {
    }
}
