package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.chatsession.GroupChatSessionEvent;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.ims.rcsservice.group.UserInfo;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.net.ServerSocket;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLServerSocketFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adrc extends adoz implements aiio {
    public static final String E;
    private static final anna aj;
    public boolean F;
    public aiit G;
    protected List H;
    public String I;
    public String J;
    public boolean K;
    public final LinkedBlockingDeque L;
    public long M;
    public adqu N;
    public adqq O;
    public final Object P;
    public boolean Q;
    public final aduo R;
    public adqv S;
    public armf T;
    public boolean U;
    public boolean V;
    public final String W;
    public final adrj X;
    public final adaw Y;
    private adpe ab;
    private adpi ac;
    private final ConcurrentHashMap ad;
    private boolean ae;
    private Optional af;
    private final adpu ag;
    private final InstantMessageConfiguration ah;
    private adrb ai;
    public static final advp C = new advp("InstantMessageSession");
    static final acyz D = acyy.b("enable_reason_header_on_bye_for_all_sessions");
    private static final acyz Z = aczd.a(173039682);
    private static final acyz aa = aczd.a(183695160);

    static {
        acyy.b("enable_revocation_for_encrypted_session");
        E = aiff.DELIVERED.p + ", " + aiff.DISPLAYED.p;
        aj = anna.g(" ").i().d();
    }

    public adrc(Context context, adou adouVar, armf armfVar, aion aionVar, aiim aiimVar, aduo aduoVar, adpu adpuVar, acqj acqjVar, adwe adweVar, InstantMessageConfiguration instantMessageConfiguration, acof acofVar) {
        super(context, adouVar, armfVar, null, aionVar, acqjVar, adweVar);
        this.F = false;
        this.ac = adpi.LEAVE_INVOLUNTARILY;
        this.L = new LinkedBlockingDeque();
        this.ad = new ConcurrentHashMap();
        this.O = adqq.CONFERENCE_FACTORY_URI;
        this.P = new Object();
        this.ae = false;
        this.Q = true;
        this.af = Optional.empty();
        this.S = adqv.c;
        this.R = aduoVar;
        this.ag = adpuVar;
        this.G = bv(context, adouVar.a, aiimVar, bu(1));
        this.F = aZ(aionVar);
        String e = aionVar.e();
        if (e != null) {
            this.K = e.contains("+g.gsma.rcs.isbot");
            this.Y = new adaw(this.m);
            this.ah = instantMessageConfiguration;
            bs();
            advp advpVar = adwf.a;
            ailx b = aionVar.b();
            this.V = b != null && (b.l("vnd.google.rcs.encrypted") || b.l("+vnd.google.rcs.encrypted"));
            this.X = new adrj(instantMessageConfiguration.mMessageTech, 1);
            this.z = aionVar.j("Contribution-ID");
            this.W = aionVar.j("Accept-Contact");
            if (this.z == null && ((Boolean) adaa.p().a.H.a()).booleanValue()) {
                au(aionVar, this.l.d, 5);
                o(new aild("Incoming request has no contributionId"), 2, 62);
                return;
            }
            if (ak()) {
                this.A = aionVar.j("Conversation-ID");
            }
            List<aiok> o = aionVar.o();
            aimg aimgVar = aionVar.a.e;
            for (aiok aiokVar : o) {
                if (!albo.ar(aiokVar.b, "application/resource-lists+xml") && !aiokVar.b.equalsIgnoreCase("application/sdp")) {
                    byte[] bArr = aiokVar.a;
                    String str = aiokVar.b;
                    String str2 = this.l.g;
                    String y = y();
                    String x = x();
                    adqu adquVar = new adqu(str2, bArr, str);
                    boolean z = this.F;
                    adquVar.o = z;
                    adquVar.q = this.K;
                    adquVar.p = z && TextUtils.equals(this.J, y);
                    adquVar.c = y;
                    adquVar.e = x;
                    if (adrf.b(adquVar)) {
                        try {
                            aifd b2 = aifd.b(adquVar.f);
                            adquVar.k = b2.g("urn:ietf:params:imdn", "Message-ID");
                            adquVar.j = b2.a();
                            adquVar.l = adrf.a(b2);
                            adquVar.i = b2.c();
                        } catch (Exception unused) {
                            advr.r(C, "Failed to parse CPIM msg to get IMDN msg ID and profile info!", new Object[0]);
                        }
                    }
                    TextUtils.isEmpty(null);
                    this.N = adquVar;
                    return;
                }
            }
            return;
        }
        throw new aild("Incoming request has no contact header");
    }

    public static boolean aZ(aion aionVar) {
        String e = aionVar.e();
        if (e != null) {
            return e.contains(String.format(";%s", "isfocus"));
        }
        throw new aild("Incoming request has no contact header");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, acyz] */
    public static final aiiu bl(adqu adquVar) {
        aiiu aiiuVar;
        String str = adquVar.b;
        if (str == null) {
            advr.r(C, "Message has no receiver - return null", new Object[0]);
            return null;
        }
        String str2 = adquVar.k;
        if ("message/cpim".equalsIgnoreCase(adquVar.h)) {
            aifc aifcVar = adquVar.g;
            if (aifcVar == null) {
                advr.h(C, "MessageContent is null, return null", new Object[0]);
                return null;
            }
            aiiuVar = new aiiu(aifcVar, "message/cpim");
            if (aczl.p()) {
                str2.getClass();
                aiiuVar.f(str2);
            }
        } else if (str2 == null) {
            aifc aifcVar2 = adquVar.g;
            if (aifcVar2 == null) {
                advr.h(C, "MessageContent is null, return null", new Object[0]);
                return null;
            }
            aiiuVar = new aiiu(aifcVar2, adquVar.h);
        } else {
            aifd aifdVar = new aifd(adquVar.h, "utf-8");
            aifdVar.l(adquVar.c);
            aifdVar.p(str);
            aifdVar.j(adquVar.f);
            aifdVar.o("imdn", "urn:ietf:params:imdn");
            aifdVar.n("urn:ietf:params:imdn", "Message-ID", adquVar.k);
            aifdVar.m("DateTime", advi.a().toString());
            aiiu aiiuVar2 = new aiiu(aifdVar.s());
            aiiuVar2.f(str2);
            aiiuVar = aiiuVar2;
        }
        if (((Boolean) aczr.a().a.b.a()).booleanValue() && !adquVar.r) {
            aiiuVar.e("no");
        } else {
            aiiuVar.e("yes");
        }
        aiiuVar.g();
        aiiuVar.m = adquVar.b();
        return aiiuVar;
    }

    private final String bp() {
        String concat;
        String str = this.z;
        if (str == null) {
            concat = "";
        } else {
            concat = "\r\n contributionId: ".concat(str);
        }
        return " conferenceUri: " + advq.URI.c(this.J) + concat + "\r\n conversationId: " + this.A + "\r\n sessionExitState: " + String.valueOf(this.ac) + "\r\n participants: " + advq.USER_ID.b(aF());
    }

    private final void bq(adqu adquVar, int i) {
        advr.d(C, "Cleaning up %s", adquVar.toString());
        aH(adquVar, i);
    }

    private final void br(int i) {
        if (this.p && ((!((Boolean) aa.a()).booleanValue() || !ak()) && this.N != null && !this.ae)) {
            advr.d(C, "[Session ID: %s] Initial message has failed.", this.k);
            aH(this.N, i);
        }
        advr.d(C, "[Session ID: %s] Need to cleanup %d pending and %d queued messages.", this.k, Integer.valueOf(this.ad.size()), Integer.valueOf(this.L.size()));
        Iterator it = this.ad.values().iterator();
        while (it.hasNext()) {
            bq((adqu) it.next(), i);
        }
        this.ad.clear();
        Iterator it2 = this.L.iterator();
        while (it2.hasNext()) {
            bq((adqu) it2.next(), i);
        }
        this.L.clear();
    }

    private final void bs() {
        if (this.J != null) {
            return;
        }
        this.J = this.l.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bt(defpackage.aiiu r8, int r9, defpackage.aiix r10) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adrc.bt(aiiu, int, aiix):void");
    }

    private static int bu(int i) {
        if (i == 2) {
            return ((Integer) aczl.c().a.i.a()).intValue();
        }
        return ((Integer) aczl.c().a.h.a()).intValue();
    }

    private static aiit bv(Context context, adew adewVar, aiim aiimVar, int i) {
        Optional r = adcx.r(adewVar);
        if (context != null) {
            if (!r.isEmpty()) {
                return new aiit(context, ((adex) r.get()).b, (String) ((adex) r.get()).a.orElseThrow(new addh(11)), ahji.q(), aiimVar, i);
            }
            throw new aiip("Can't create msrp manager: no network interface available");
        }
        throw new aiip("Can't create msrp manager: no application context available");
    }

    @Override // defpackage.adoz
    public final String B() {
        if (!this.F) {
            return super.B();
        }
        return bp() + VCardBuilder.VCARD_END_OF_LINE + super.B();
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x020c A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018e A[FALL_THROUGH] */
    @Override // defpackage.adoz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void M(defpackage.aioo r17) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adrc.M(aioo):void");
    }

    @Override // defpackage.adoz
    protected final void N(aioo aiooVar) {
        String e;
        String str = this.l.h;
        if (str != null && (e = this.Y.e(str)) != null) {
            this.ag.e(e);
        }
        M(aiooVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adoz
    public void R() {
        if (this.F) {
            bs();
        }
    }

    @Override // defpackage.adoz
    public final void S(aion aionVar) {
        adpi adpiVar;
        String[] split;
        String trim;
        if (this.t != null) {
            try {
                advr.l(adoz.f, "Send 200 OK", new Object[0]);
                super.af(this.B.n(aionVar));
            } catch (Exception e) {
                advr.j(e, adoz.f, "Error while processing bye: %s", e.getMessage());
            }
        }
        if (this.F) {
            String j = aionVar.j("Reason");
            String str = null;
            if (!TextUtils.isEmpty(j)) {
                if (!TextUtils.isEmpty(j) && (split = j.split(";")) != null) {
                    for (String str2 : split) {
                        if (!TextUtils.isEmpty(str2) && str2.startsWith("cause")) {
                            trim = str2.trim();
                            break;
                        }
                    }
                }
                trim = null;
                if (!TextUtils.isEmpty(trim)) {
                    List c = anna.e('=').c(trim);
                    if (c.size() >= 2) {
                        String str3 = (String) c.get(1);
                        if (!TextUtils.isEmpty(str3)) {
                            str = str3.trim();
                        }
                    }
                }
            }
            advr.d(C, "Received a BYE, cause value of the reason header is %s", str);
            if (aczt.n() && aionVar.j("Referred-By") != null) {
                String j2 = aionVar.j("Referred-By");
                j2.getClass();
                this.I = adwf.l(j2, u(), this.m);
            }
            if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
                int parseInt = Integer.parseInt(str);
                adpi[] values = adpi.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        adpiVar = values[i];
                        if (adpiVar.e == parseInt) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        adpiVar = adpi.DISCONNECT;
                        break;
                    }
                }
                advr.d(C, "Setting exit state to %s", adpiVar.toString());
                this.ac = adpiVar;
            }
        }
    }

    @Override // defpackage.adoz
    protected final void T(aioo aiooVar) {
        ailw ailwVar = aiooVar.a.j;
        if (ailwVar != null) {
            this.x = ailwVar;
            advr.d(adoz.f, "conference header response: %s", this.x.a);
        }
        aJ(aiooVar);
        try {
            if (this.F) {
                String f = aiooVar.f();
                if (!TextUtils.isEmpty(f)) {
                    this.J = f;
                } else {
                    advr.h(C, "Received empty conference URI from 200 OK", new Object[0]);
                }
            }
        } catch (Exception e) {
            advr.j(e, C, "Conference URI set has failed: %s", e.getMessage());
        }
    }

    @Override // defpackage.adoz
    protected final void U(aion aionVar) {
        if (!this.F && (!ak() || !((Boolean) D.a()).booleanValue())) {
            return;
        }
        try {
            adpi ay = ay();
            aionVar.s("Reason", "SIP;cause=" + ay.e + ";text=\"" + ay.f + "\"");
        } catch (ailb e) {
            advr.j(e, C, "Can't add reason header: %s", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adoz
    public void V(aion aionVar) {
        Optional of;
        if (ak()) {
            advp advpVar = C;
            advr.d(advpVar, "CPM is enabled, adding Conversation-ID", new Object[0]);
            if (this.A == null) {
                advr.h(advpVar, "Conversation-ID not generated yet", new Object[0]);
                return;
            }
            if (aionVar.j("Conversation-ID") != null) {
                advr.r(advpVar, "Conversation-ID was already added to INVITE header", new Object[0]);
                return;
            }
            try {
                String str = this.A;
                str.getClass();
                aionVar.s("Conversation-ID", str);
            } catch (ailb e) {
                advr.j(e, C, "SIP INVITE can't accept Conversation-ID: %s", e.getMessage());
            }
            if (((Boolean) adaa.p().a.o.a()).booleanValue()) {
                try {
                    if (aczf.F()) {
                        adrj adrjVar = this.X;
                        boolean z = this.F;
                        if (!adrjVar.c()) {
                            of = Optional.empty();
                        } else if (adrjVar.d()) {
                            of = Optional.of("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.largemsg");
                        } else if (z) {
                            of = Optional.of("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session.group");
                        } else {
                            of = Optional.of("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session");
                        }
                        if (of.isPresent()) {
                            aionVar.s("P-Preferred-Service", (String) of.get());
                            return;
                        }
                        return;
                    }
                    if (this.F) {
                        aionVar.s("P-Preferred-Service", "urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session.group");
                    } else {
                        aionVar.s("P-Preferred-Service", "urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session");
                    }
                } catch (ailb e2) {
                    advr.j(e2, C, "SIP INVITE can't accept P-Preferred-Service: %s", e2.getMessage());
                }
            }
        }
    }

    @Override // defpackage.adoz
    protected final void W() {
        adpe adpeVar = this.ab;
        if (adpeVar != null) {
            adpeVar.j(this.ai);
            this.ab.n(true);
        }
    }

    @Override // defpackage.adoz
    public final void X(aioo aiooVar) {
        advr.d(adoz.f, "Received session progress/ringing", new Object[0]);
        if (aiooVar.y() == 180) {
            this.r = true;
        }
        O(aiooVar);
        K(aiooVar.z());
        aJ(aiooVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final aiji aA(boolean z) {
        if (this.w) {
            if (z) {
                return this.G.c();
            }
            aiit aiitVar = this.G;
            return aiitVar.d(aiitVar.c, aiitVar.f.a(), aiitVar.a);
        }
        if (z) {
            return this.G.a();
        }
        aiit aiitVar2 = this.G;
        return aiitVar2.b(aiitVar2.a, "TCP/MSRP", "msrp");
    }

    public final alpt aB() {
        String str;
        String str2 = this.k;
        advp advpVar = C;
        advr.d(advpVar, "Retrieving remote accept wrapped types for group session: %s", str2);
        aiok g = this.l.g();
        if (g == null) {
            advr.d(advpVar, "No remote SDP. Cannot retrieve accept wrapped types for session: %s", str2);
            return altg.a;
        }
        String b = g.b();
        if (!albo.ah(b)) {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(b));
            aiji aijiVar = null;
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    if (readLine.startsWith("m=")) {
                        aijiVar = aiji.c(readLine);
                    } else if (readLine.startsWith("c=") && !Objects.isNull(aijiVar)) {
                        aijiVar.c = aijf.a(readLine);
                    } else if (readLine.startsWith("b=") && !Objects.isNull(aijiVar)) {
                        aijiVar.d = aije.a(readLine);
                    } else if (readLine.startsWith("i=") && !Objects.isNull(aijiVar)) {
                        aijiVar.b = aijs.c(readLine);
                    } else if (readLine.startsWith("a=") && !Objects.isNull(aijiVar)) {
                        aijiVar.e(aijg.a(readLine));
                    }
                }
            } catch (IOException unused) {
            }
            if (aijiVar == null) {
                advr.d(C, "No remote SDP media description. Cannot retrieve accept wrapped types for session: %s", str2);
                return altg.a;
            }
            aijg a = aijiVar.a("accept-wrapped-types");
            if (a != null && (str = a.b) != null) {
                return alpt.n(aj.a(str));
            }
            advr.d(C, "No remote accept wrapped types for session: %s", str2);
            return altg.a;
        }
        advr.d(advpVar, "No remote SDP content. Cannot retrieve accept wrapped types for session: %s", str2);
        return altg.a;
    }

    public Optional aC() {
        return Optional.empty();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String aD() {
        if (!this.F && !this.X.d()) {
            return "message/cpim application/im-iscomposing+xml";
        }
        return "message/cpim";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String aE() {
        StringBuilder sb = new StringBuilder("text/plain application/vnd.gsma.rcs-ft-http+xml");
        if (this.F) {
            sb.append(" application/im-iscomposing+xml application/vnd.oma.cpm-groupdata+xml");
        }
        if (this.K) {
            sb.append(" multipart/mixed application/vnd.gsma.botsuggestion.v1.0+json application/vnd.gsma.botmessage.v1.0+json");
        }
        sb.append(" message/imdn+xml");
        if (this.Q) {
            sb.append(" application/vnd.gsma.rcspushlocation+xml");
        }
        return sb.toString();
    }

    public final List aF() {
        List list = this.H;
        if (list == null) {
            return Collections.emptyList();
        }
        return DesugarCollections.unmodifiableList(list);
    }

    public final void aG(adrd adrdVar) {
        ((adoz) this).g.add(adrdVar);
    }

    protected final void aH(adqu adquVar, int i) {
        for (adpb adpbVar : ((adoz) this).g) {
            if (adpbVar instanceof adrd) {
                ((adrd) adpbVar).a(adquVar, i);
            }
        }
    }

    protected final void aI(adqu adquVar) {
        for (adpb adpbVar : ((adoz) this).g) {
            if (adpbVar instanceof adrd) {
                ((adrd) adpbVar).b(adquVar);
            }
        }
    }

    final void aJ(aioo aiooVar) {
        adqu adquVar;
        if (!this.ae) {
            int y = aiooVar.y();
            if ((y == 180 || y == 486 || y == 200) && !this.F && !ak() && (adquVar = this.N) != null) {
                this.ae = true;
                aI(adquVar);
            }
        }
    }

    protected final void aK(adqu adquVar) {
        advr.d(C, "Received message: %s", adquVar.toString());
        for (adpb adpbVar : ((adoz) this).g) {
            if (adpbVar instanceof adrd) {
                ((adrd) adpbVar).c(adquVar);
            }
        }
    }

    public final void aL(String str, adqx adqxVar) {
        for (adpb adpbVar : ((adoz) this).g) {
            if (adpbVar instanceof acnn) {
                acnn acnnVar = (acnn) adpbVar;
                UserInfo p = acnnVar.c.p(str);
                adsh adshVar = new adsh(50072, acnnVar.a, adqxVar.a);
                adshVar.b(p);
                acnnVar.c.g.c(new GroupChatSessionEvent(adshVar), advy.IMS_CHAT_SESSION_PROVIDER);
            }
        }
    }

    @Override // defpackage.aiio
    public final void aM(aiiu aiiuVar) {
        advr.d(C, "Incoming msrp message: message=%s; contentType=%s", aiiuVar.b(), aiiuVar.g);
    }

    @Override // defpackage.aiio
    public final void aN() {
        String str = this.k;
        advp advpVar = C;
        advr.r(advpVar, "Dedicated bearer is lost for session %s", str);
        if (aczf.x()) {
            advr.l(advpVar, "Session %s falling back to a default bearer.", this.k);
        } else {
            n(9, 69);
        }
    }

    public final void aO(adra adraVar) {
        int ordinal = adraVar.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            Z(2, this.d, this.e);
                            return;
                        } else {
                            Z(12, 7, 70);
                            return;
                        }
                    }
                    Z(11, 7, 60);
                    return;
                }
                Z(10, 7, 59);
                return;
            }
            Z(9, 7, 58);
            return;
        }
        Z(4, 7, 24);
    }

    public final void aP(adrd adrdVar) {
        ((adoz) this).g.remove(adrdVar);
    }

    public final void aQ(adqu adquVar) {
        if (bb()) {
            if (adquVar.c == null) {
                adquVar.c = this.l.g;
            }
            if (adquVar.b == null) {
                adquVar.b = y();
            }
            advr.w(13, 3, "Queueing message for sending %s with messageid=%s", adquVar, adquVar.k);
            this.L.add(adquVar);
            return;
        }
        advr.h(C, "Unable to send message: %s, %d", this.a.toString(), Integer.valueOf(this.n));
        throw new adqx();
    }

    public final void aR(long j, adpe adpeVar) {
        adpe adpeVar2 = this.ab;
        if (adpeVar2 != null) {
            adpeVar2.j(this.ai);
        }
        this.ab = adpeVar;
        if (adpeVar != null) {
            adrb adrbVar = new adrb(this, j);
            this.ai = adrbVar;
            adpeVar.d(adrbVar);
        }
    }

    public final void aS(boolean z) {
        albo.T(this.a.equals(adpk.INITIAL));
        this.V = z;
    }

    public final void aT(boolean z) {
        if (!this.p) {
            advr.r(C, "Ignoring disable network fallback signal: terminating session", new Object[0]);
        }
        if (this.a != adpk.INITIAL) {
            advr.r(C, "Ignoring disable network fallback signal: session in state %s", this.a.toString());
        } else {
            this.U = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aU(adqu adquVar, aiiu aiiuVar) {
        this.ad.put(aiiuVar, adquVar);
    }

    public final void aV(String[] strArr) {
        this.H = (List) DesugarArrays.stream(strArr).map(new yuq(this, u(), 14)).collect(Collectors.toList());
    }

    public final void aW(adpi adpiVar) {
        if (!this.F) {
            advr.r(C, "setting session exit state on 1:1 chat will be ignored by getSessionExitState", new Object[0]);
        }
        this.ac = adpiVar;
    }

    public final void aX(boolean z) {
        if (aczx.s() && z) {
            n(3, 61);
        } else {
            L(new adqx(6, "Data transfer error"));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aY() {
        this.M = System.currentTimeMillis();
    }

    @Override // defpackage.adoz
    public final boolean ak() {
        if (aczf.F()) {
            return this.X.c();
        }
        InstantMessageConfiguration instantMessageConfiguration = this.ah;
        advp advpVar = adwf.a;
        return instantMessageConfiguration.a();
    }

    public final acmz aw(acnb acnbVar) {
        Optional empty;
        boolean z;
        if (this.K) {
            empty = Optional.ofNullable(this.o);
        } else {
            empty = Optional.empty();
        }
        if (empty.isEmpty()) {
            advr.h(C, "BotId is missing; cannot wait for business info availability", new Object[0]);
            return acmz.CLIENT_ERROR;
        }
        String str = (String) empty.get();
        if (acnbVar.d(str) == acmz.INFO_LOCALLY_AVAILABLE) {
            advr.l(C, "Business info is already locally available for %s", advq.USER_ID_BOT.c(str));
            return acmz.INFO_LOCALLY_AVAILABLE;
        }
        if (BusinessInfoData.getVerifiedBotPlatform(str) == 0) {
            advr.h(C, "Unknown platform for botId %s", advq.USER_ID_BOT.c(str));
            return acmz.CLIENT_ERROR;
        }
        aoij aoijVar = new aoij(this, str, acnbVar);
        advp advpVar = C;
        advr.l(advpVar, "Starting new business info retrieval for botId %s", advq.USER_ID_BOT.c(str));
        acnbVar.h(str, aoijVar);
        advr.l(advpVar, "Waiting for business info retrieval for botId %s", advq.USER_ID_BOT.c(str));
        synchronized (this.P) {
            long millis = TimeUnit.SECONDS.toMillis(albo.co(((Long) ((acza) acyu.a().b.d).a()).longValue()));
            long millis2 = TimeUnit.SECONDS.toMillis(albo.co(((Long) ((acza) acyu.a().b.l).a()).longValue()));
            long currentTimeMillis = System.currentTimeMillis();
            long j = millis2 + currentTimeMillis;
            if (j > currentTimeMillis) {
                z = true;
            } else {
                z = false;
            }
            albo.T(z);
            long j2 = currentTimeMillis;
            while (currentTimeMillis < j) {
                try {
                    j2 = Math.min(j, j2 + millis);
                    while (currentTimeMillis < j2 && !acnbVar.f(str)) {
                        this.P.wait(j2 - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                    if (acnbVar.f(str)) {
                        advr.l(C, "Business info retrieval completed for botId %s", advq.USER_ID_BOT.c(str));
                        return acnbVar.d(str);
                    }
                    try {
                        aijw aijwVar = this.l;
                        aion aionVar = aijwVar.i;
                        if (aionVar != null) {
                            ab(aionVar, aijwVar.d);
                        } else {
                            throw new aild("No invite found for this session");
                        }
                    } catch (aild e) {
                        advr.h(C, "Could not send 180 ringing while retrieving business information: %s", e);
                        m(e);
                    }
                } catch (InterruptedException unused) {
                    advr.h(C, "Interrupted while waiting for business information for botId %s", advq.USER_ID_BOT.c(str));
                }
            }
            advr.h(C, "Timeout - Business info retrieval period expired for botId %s", advq.USER_ID_BOT.c(str));
            return acmz.SERVER_ERROR;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final InstantMessageConfiguration ax() {
        return t().d();
    }

    public final adpi ay() {
        if (this.F) {
            return this.ac;
        }
        return adpi.LEAVE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final adqu az(int i) {
        advp advpVar = C;
        advr.d(advpVar, "Polling for next sending message", new Object[0]);
        adqu adquVar = (adqu) this.L.poll(i, TimeUnit.MILLISECONDS);
        advr.d(advpVar, "Found sending message %s", adquVar);
        return adquVar;
    }

    public final boolean ba() {
        if (!aczr.d()) {
            return false;
        }
        return aB().contains("application/conference-info+xml");
    }

    public boolean bb() {
        if (this.af.isPresent()) {
            return false;
        }
        if (((((Boolean) Z.a()).booleanValue() || this.F) && this.a == adpk.STARTING) || this.a == adpk.RUNNING) {
            return true;
        }
        if (this.a == adpk.STOPPED || this.n != 1) {
            return false;
        }
        return true;
    }

    public final String[] bc() {
        return (String[]) Collection.EL.toArray(this.X.b(), new adak(4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final aijb bd(String str, aiio aiioVar) {
        aiik aiikVar;
        aohs aohsVar;
        aiit aiitVar = this.G;
        final int i = 0;
        final int i2 = 1;
        if (str.startsWith("msrps")) {
            advr.l(aiitVar.d, "Creating secure MSRP server endpoint at %d", Integer.valueOf(aiitVar.a));
            aiim aiimVar = aiitVar.b;
            final int i3 = aiitVar.a;
            if (((Boolean) aczf.o().a.al.a()).booleanValue()) {
                final aigy e = ((agxw) aiimVar.b).e();
                aohsVar = new aohs(new aihc() { // from class: aigw
                    @Override // defpackage.aihc
                    public final ServerSocket a() {
                        if (i != 0) {
                            return e.c.createServerSocket(i3);
                        }
                        return e.a(i3);
                    }
                });
            } else {
                aohsVar = new aohs(new aihc() { // from class: aiil
                    @Override // defpackage.aihc
                    public final ServerSocket a() {
                        return SSLServerSocketFactory.getDefault().createServerSocket(i3);
                    }
                });
            }
            aiikVar = new aiik((Context) aiimVar.a, aohsVar, 4);
        } else {
            advr.l(aiitVar.d, "Creating MSRP server endpoint at %d", Integer.valueOf(aiitVar.a));
            aiim aiimVar2 = aiitVar.b;
            final int i4 = aiitVar.a;
            Object obj = aiimVar2.a;
            final aigy e2 = ((agxw) aiimVar2.b).e();
            aiikVar = new aiik((Context) obj, new aohs(new aihc() { // from class: aigw
                @Override // defpackage.aihc
                public final ServerSocket a() {
                    if (i2 != 0) {
                        return e2.c.createServerSocket(i4);
                    }
                    return e2.a(i4);
                }
            }), 2);
        }
        aiik aiikVar2 = aiikVar;
        aiitVar.h(aiikVar2, str, this.l.a, aiioVar, Optional.empty());
        new aiir(aiitVar, aiikVar).start();
        aijb aijbVar = aiitVar.e;
        aijbVar.getClass();
        return aijbVar;
    }

    @Override // defpackage.aiio
    public final void be(aijb aijbVar, aiiu aiiuVar) {
        boolean z;
        aY();
        try {
            String str = aiiuVar.g;
            adqu adquVar = new adqu(adqt.UNKNOWN);
            adquVar.d(aiiuVar.g, aiiuVar.b.H());
            adquVar.c = y();
            adquVar.b = this.l.g;
            adquVar.e = x();
            boolean z2 = this.F;
            adquVar.o = z2;
            adquVar.q = this.K;
            if (z2 && TextUtils.equals(this.J, y())) {
                z = true;
            } else {
                z = false;
            }
            adquVar.p = z;
            if (agkx.af(str, "message/cpim")) {
                aifd b = aifd.b(aiiuVar.b.H());
                String f = b.f();
                if (f != null) {
                    adquVar.c = aife.a(f).a;
                    String i = b.i();
                    if (!GroupManagementContentType.CONTENT_TYPE.equals(b.e())) {
                        if (i != null) {
                            adquVar.b = aife.a(i).a;
                        } else {
                            throw new adqx(8, "incoming message has no to header");
                        }
                    }
                    String g = b.g("urn:ietf:params:imdn", "Message-ID");
                    if (g != null) {
                        adquVar.k = g;
                    }
                    String t = b.t();
                    if (t != null) {
                        adquVar.j = advi.c(t).a;
                    }
                    adquVar.l = adrf.a(b);
                    adquVar.i = b.c();
                } else {
                    throw new adqx(8, "incoming message has no from header");
                }
            }
            advr.d(C, "Received MSRP message:\nsender: %s\nreceiver: %s\ncontent-type: %s\nsize: %d\ncontent: %s", advq.USER_ID.c(adquVar.c), advq.USER_ID.c(adquVar.b), adquVar.h, Integer.valueOf(adquVar.f.length), advq.MESSAGE_CONTENT.c(new String(adquVar.f, StandardCharsets.UTF_8)));
            aK(adquVar);
        } catch (Exception e) {
            advr.j(e, C, "Problem while receiving data", new Object[0]);
        }
    }

    @Override // defpackage.aiio
    public final void bf(aijb aijbVar, aiiu aiiuVar) {
        if (aiiuVar.j) {
            return;
        }
        advp advpVar = C;
        advr.d(advpVar, "Data transferred: message[%s]", advq.MSRP_MESSAGE.c(aiiuVar));
        adqu adquVar = (adqu) this.ad.remove(aiiuVar);
        if (adquVar == null) {
            advr.r(advpVar, "No instant message found for msrp message - skipping event", new Object[0]);
        } else {
            aI(adquVar);
        }
    }

    @Override // defpackage.aiio
    public final void bg(aijb aijbVar, aiiu aiiuVar) {
        advr.l(C, "Data transfer aborted: message[%s]", advq.MSRP_MESSAGE.c(aiiuVar));
    }

    @Override // defpackage.aiio
    public final void bh(aijb aijbVar, aiiu aiiuVar, aiix aiixVar) {
        advr.r(C, "MsrpRequestRejected, response: %s, status code %s", aiixVar.b, Integer.valueOf(aiixVar.a));
        bt(aiiuVar, 3, aiixVar);
    }

    @Override // defpackage.aiio
    public final void bk(aijb aijbVar, aiiu aiiuVar, int i) {
        bt(aiiuVar, i, null);
    }

    @Override // defpackage.aiio
    public final void bm(aiiw aiiwVar) {
        boolean z;
        byte[] bArr;
        if (!aczl.p()) {
            return;
        }
        String e = aiiwVar.e("Status");
        String a = aiiwVar.a();
        String e2 = aiiwVar.e("Status");
        if (e2 != null && !e2.startsWith("000 200")) {
            advr.r(C, "[%s] MSRP REPORT received with status: %s ", a, e);
            adqu adquVar = new adqu(adqt.CPIM_MESSAGE);
            String str = this.l.g;
            str.getClass();
            adquVar.c = y();
            adquVar.b = str;
            adquVar.e = x();
            boolean z2 = this.F;
            adquVar.o = z2;
            adquVar.q = this.K;
            adquVar.s = true;
            if (z2 && TextUtils.equals(this.J, y())) {
                z = true;
            } else {
                z = false;
            }
            adquVar.p = z;
            aifg aifgVar = new aifg("local:".concat(String.valueOf(String.valueOf(UUID.randomUUID()))), adquVar.c, str, aiiwVar.d, aiff.DELIVERY_FAILED);
            adquVar.e("message/cpim");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                aifg.u(aifgVar, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                bArr = new byte[0];
            }
            adquVar.f = bArr;
            adquVar.a = adqt.UNKNOWN;
            advr.l(C, "[%s] Received MSRP REPORT - translated into IMDN:\nsender: %s\nreceiver: %s\ncontent-type: %s\nsize: %d\ncontent: %s", a, advq.USER_ID.c(adquVar.c), advq.USER_ID.c(adquVar.b), adquVar.h, Integer.valueOf(adquVar.f.length), advq.MESSAGE_CONTENT.c(new String(adquVar.f, StandardCharsets.UTF_8)));
            aK(adquVar);
            n(3, 61);
            return;
        }
        advr.l(C, "[%s] MSRP REPORT received with status 200", a);
    }

    public final void bn() {
        this.K = true;
    }

    public final void bo() {
        this.F = true;
    }

    @Override // defpackage.adoz, defpackage.adon
    public final void f() {
        int i;
        this.G.g();
        int i2 = this.d;
        int i3 = this.e;
        adqv adqvVar = this.S;
        if (i3 == 21) {
            i = 51;
        } else if (i2 == 2 && i3 == 4) {
            i = 52;
        } else {
            if (aczx.s()) {
                int i4 = adqvVar.f;
                switch (i4) {
                    case 1:
                        i = 59;
                        break;
                    case 2:
                        i = 60;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        i = 61;
                        break;
                    default:
                        advr.r(C, "Invalid error type %s", Integer.valueOf(i4));
                        break;
                }
            }
            i = 50;
        }
        br(i);
        try {
            super.aj(null);
        } catch (Exception e) {
            advr.j(e, adoz.f, "Exception during service termination", new Object[0]);
            J();
            return;
        }
        if (this.u) {
            h(5);
            i(29);
            J();
            return;
        }
        if (this.t != null) {
            h(1);
            i(19);
            super.Q();
            return;
        }
        aijw aijwVar = this.l;
        if (!aijwVar.m && !aijwVar.l) {
            if (this.p) {
                h(5);
                i(29);
                aijw aijwVar2 = this.l;
                if (!aijwVar2.k) {
                    if (!aijwVar2.o) {
                        ae(null);
                        return;
                    }
                    return;
                }
                F();
                return;
            }
            int i5 = this.n;
            if (i5 == 2) {
                advr.d(adoz.f, "Session has been rejected by user", new Object[0]);
                aijw aijwVar3 = this.l;
                aion aionVar = aijwVar3.i;
                aionVar.getClass();
                as(aionVar, aijwVar3.d, 12);
                h(5);
                i(30);
                F();
                return;
            }
            if (i5 == 0) {
                aion aionVar2 = aijwVar.i;
                aionVar2.getClass();
                String str = aijwVar.d;
                try {
                    advr.l(adoz.f, "Send 408 Timeout", new Object[0]);
                    super.af(this.B.p(aionVar2, str, 408, 7));
                } catch (Exception e2) {
                    advr.j(e2, adoz.f, "Can't send 408 Timeout", new Object[0]);
                }
                h(1);
                i(1);
                H(408, "Session has been rejected on timeout");
                return;
            }
            if (i5 == 3) {
                h(1);
                i(66);
                advr.d(adoz.f, "Session has been canceled by remote user", new Object[0]);
                aijw aijwVar4 = this.l;
                aion aionVar3 = aijwVar4.i;
                aionVar3.getClass();
                String str2 = aijwVar4.d;
                try {
                    advr.l(adoz.f, "Send 487 Request terminated", new Object[0]);
                    super.af(this.B.p(aionVar3, str2, 487, 13));
                } catch (Exception e3) {
                    advr.j(e3, adoz.f, "Can't send 487 Request Terminated response", new Object[0]);
                }
                Iterator it = ((adoz) this).g.iterator();
                while (it.hasNext()) {
                    try {
                        ((adpb) it.next()).e();
                    } catch (Exception e4) {
                        advr.j(e4, adoz.f, "handleSessionAbortedByRemote: Call to listener failed with error: ", new Object[0]);
                    }
                }
                return;
            }
            if (i5 == 4) {
                aion aionVar4 = aijwVar.i;
                aionVar4.getClass();
                at(aionVar4, aijwVar.d, 16);
                h(2);
                i(24);
                H(488, "Session invitation was not acceptable");
                return;
            }
            if (i5 == 4) {
                advr.d(adoz.f, "Session invitation was not acceptable", new Object[0]);
                aijw aijwVar5 = this.l;
                aion aionVar5 = aijwVar5.i;
                aionVar5.getClass();
                at(aionVar5, aijwVar5.d, 17);
                h(2);
                i(24);
                H(488, "Not acceptable here");
                return;
            }
            if (i5 == 8) {
                advr.d(adoz.f, "Session has been declined by user", new Object[0]);
                aijw aijwVar6 = this.l;
                aion aionVar6 = aijwVar6.i;
                aionVar6.getClass();
                String str3 = aijwVar6.d;
                try {
                    advr.l(adoz.f, "Send 603 Decline", new Object[0]);
                    super.af(this.B.p(aionVar6, str3, 603, 20));
                } catch (Exception e5) {
                    advr.j(e5, adoz.f, "Can't send 603 Decline response", new Object[0]);
                }
                h(5);
                i(30);
                F();
                return;
            }
            if (i5 == 9) {
                aion aionVar7 = aijwVar.i;
                aionVar7.getClass();
                as(aionVar7, aijwVar.d, 10);
                h(5);
                i(30);
                H(486, "Session from blocked user is declined");
                return;
            }
            if (i5 == 10) {
                advr.d(adoz.f, "Session has been rejected by user; business info retrieval encountered a server error", new Object[0]);
                h(7);
                i(59);
                aijw aijwVar7 = this.l;
                aion aionVar8 = aijwVar7.i;
                aionVar8.getClass();
                String str4 = aijwVar7.d;
                int co = albo.co(((Long) ((acza) acyu.a().b.c).a()).longValue());
                try {
                    advr.l(adoz.f, "Sending 503 Service Unavailable", new Object[0]);
                    aioo p = this.B.p(aionVar8, str4, 503, 19);
                    if (co > 0) {
                        advr.l(adoz.f, "Add Retry-After header: %s", Integer.valueOf(co));
                        p.s("Retry-After", String.valueOf(co));
                    }
                    super.af(p);
                    return;
                } catch (Exception e6) {
                    advr.j(e6, adoz.f, "Can't send 503 Service Unavailable", new Object[0]);
                    return;
                }
            }
            if (i5 == 11) {
                advr.d(adoz.f, "Session has been rejected by user; business info retrieval encountered a client error", new Object[0]);
                h(7);
                i(60);
                aijw aijwVar8 = this.l;
                aion aionVar9 = aijwVar8.i;
                aionVar9.getClass();
                au(aionVar9, aijwVar8.d, 6);
                return;
            }
            if (i5 == 12) {
                advr.d(adoz.f, "Session has been rejected by user; business info retrieval encountered a client error", new Object[0]);
                h(7);
                i(70);
                aijw aijwVar9 = this.l;
                aion aionVar10 = aijwVar9.i;
                aionVar10.getClass();
                String str5 = aijwVar9.d;
                try {
                    advr.l(adoz.f, "Send 606 Not Acceptable", new Object[0]);
                    super.af(this.B.p(aionVar10, str5, 606, 22));
                    return;
                } catch (Exception e7) {
                    advr.j(e7, adoz.f, "Can't send 606 Not Acceptable response", new Object[0]);
                    return;
                }
            }
            return;
            advr.j(e, adoz.f, "Exception during service termination", new Object[0]);
            J();
            return;
        }
        if (this.d != 2) {
            super.ad();
        }
        h(5);
        i(29);
        J();
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.concurrent.ScheduledFuture, java.lang.Object] */
    @Override // defpackage.adoz, defpackage.adon
    public final void g(Throwable th) {
        int i;
        adug adugVar;
        this.G.g();
        if (th instanceof EOFException) {
            i = 52;
        } else if (th instanceof aiip) {
            i = 56;
        } else {
            i = 0;
        }
        br(i);
        int i2 = 4;
        if (i == 0) {
            super.h(0);
            super.i(0);
        } else if (i == 52) {
            super.h(2);
            super.i(4);
        } else {
            super.h(2);
            super.i(61);
        }
        if (this.af.isPresent()) {
            this.af.get().cancel(false);
            this.af = Optional.empty();
        }
        if (th instanceof aiip) {
            th = new adqx(51, th.getMessage(), th);
        }
        try {
            if (th instanceof adug) {
                adugVar = (adug) th;
            } else {
                if (th instanceof aijz) {
                    i2 = 7;
                } else if (th instanceof aild) {
                    if (!(th.getCause() instanceof IOException)) {
                        String message = th.getMessage();
                        if (message != null) {
                            if (!message.contains("SipTransport is null")) {
                                if (message.contains("SIP message to send is null")) {
                                    i2 = 8;
                                }
                            }
                        }
                        i2 = 11;
                    }
                    i2 = 5;
                } else if (th instanceof adpj) {
                    i2 = 9;
                } else if (th instanceof adph) {
                    i2 = 10;
                } else if (th instanceof IOException) {
                    i2 = 5;
                } else {
                    i2 = 0;
                }
                adugVar = new adug(i2, th.getMessage(), th);
            }
            super.aj(adugVar);
            if (this.t != null) {
                h(1);
                i(19);
                super.Q();
                return;
            }
            aijw aijwVar = this.l;
            if (!aijwVar.m && !aijwVar.l) {
                if (this.p) {
                    h(2);
                    i(17);
                    aijw aijwVar2 = this.l;
                    if (!aijwVar2.k) {
                        if (!aijwVar2.o) {
                            ae(adugVar);
                            return;
                        }
                        return;
                    }
                    G(adugVar);
                    return;
                }
                if (this.n != 0) {
                    advr.d(adoz.f, "Session has been rejected by user", new Object[0]);
                    aijw aijwVar3 = this.l;
                    aion aionVar = aijwVar3.i;
                    aionVar.getClass();
                    at(aionVar, aijwVar3.d, 18);
                    h(5);
                    i(30);
                    G(adugVar);
                    return;
                }
                return;
            }
            h(2);
            i(29);
            super.ad();
            if (this.a != adpk.STARTING) {
                Iterator it = ((adoz) this).g.iterator();
                while (it.hasNext()) {
                    try {
                        ((adpb) it.next()).k(adugVar);
                    } catch (Exception e) {
                        advr.j(e, adoz.f, "handleSessionTerminated: Call to listener failed with error", new Object[0]);
                    }
                }
                return;
            }
            G(adugVar);
        } catch (Exception e2) {
            advr.j(e2, adoz.f, "Exception during service termination", new Object[0]);
            J();
        }
    }

    @Override // defpackage.adoz, defpackage.adon
    public final String toString() {
        if (!this.F) {
            return super.toString();
        }
        return bp() + VCardBuilder.VCARD_END_OF_LINE + super.toString();
    }

    public adrc(Context context, adou adouVar, armf armfVar, String str, aiim aiimVar, aduo aduoVar, adpu adpuVar, acqj acqjVar, adwe adweVar, InstantMessageConfiguration instantMessageConfiguration, int i, acof acofVar) {
        super(context, adouVar, armfVar, str, null, acqjVar, adweVar);
        String str2;
        this.F = false;
        this.ac = adpi.LEAVE_INVOLUNTARILY;
        this.L = new LinkedBlockingDeque();
        this.ad = new ConcurrentHashMap();
        this.O = adqq.CONFERENCE_FACTORY_URI;
        this.P = new Object();
        this.ae = false;
        this.Q = true;
        this.af = Optional.empty();
        this.S = adqv.c;
        this.R = aduoVar;
        adet adetVar = (adet) adouVar.a;
        adfa adfaVar = adetVar.b;
        if (adfaVar != null && adfaVar.n()) {
            str2 = adetVar.c().mWifiMediaTransport;
        } else {
            str2 = adetVar.c().mPsMediaTransport;
        }
        this.w = "MSRPoTLS".equals(str2);
        this.G = bv(context, adouVar.a, aiimVar, bu(i));
        this.Y = new adaw(this.m);
        this.ag = adpuVar;
        this.ah = instantMessageConfiguration;
        this.W = null;
        this.X = new adrj(instantMessageConfiguration.mMessageTech, i);
    }

    @Override // defpackage.aiio
    public final /* synthetic */ void bi(aijb aijbVar, aiix aiixVar, aiiu aiiuVar) {
    }

    @Override // defpackage.aiio
    public final /* synthetic */ void bj(aijb aijbVar, aiix aiixVar, aiiw aiiwVar) {
    }
}
