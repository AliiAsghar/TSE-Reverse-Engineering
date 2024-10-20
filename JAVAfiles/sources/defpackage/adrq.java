package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrq extends adrc {
    public static final /* synthetic */ int aa = 0;
    public boolean Z;
    private String ab;
    private String ac;
    private String ad;
    private int ae;
    private aijb af;

    public adrq(Context context, adou adouVar, armf armfVar, String str, aiim aiimVar, aduo aduoVar, adpu adpuVar, acqj acqjVar, adwe adweVar, InstantMessageConfiguration instantMessageConfiguration, int i, acof acofVar) {
        super(context, adouVar, armfVar, str, aiimVar, aduoVar, adpuVar, acqjVar, adweVar, instantMessageConfiguration, i, acofVar);
        advr.c("Creating a new chat session as originating to %s", advq.USER_ID.c(str));
    }

    @Override // defpackage.adoz
    protected final String A() {
        return "OriginatingChatSession";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adrc, defpackage.adoz
    public final void R() {
        String str;
        String str2;
        try {
            aiok g = this.l.g();
            if (g != null) {
                String b = g.b();
                if (b != null) {
                    aijr n = ahji.n(b);
                    aiji aijiVar = (aiji) n.c.get(0);
                    aijg a = aijiVar.a("path");
                    if (a != null && a.b != null) {
                        aijg a2 = aijiVar.a("fingerprint");
                        aijg a3 = aijiVar.a("msrp-cema");
                        aijg a4 = aijiVar.a("setup");
                        if (a2 != null && (str2 = a2.b) != null) {
                            this.ac = str2;
                        }
                        if (n.d()) {
                            str = n.h.a;
                        } else {
                            str = aijiVar.c.a;
                        }
                        String str3 = a.b;
                        str3.getClass();
                        int i = aijiVar.a;
                        this.ad = str;
                        this.ab = str3;
                        this.ae = i;
                        if (aczl.n() && a3 == null && a4 != null && Objects.equals(a4.b, "active")) {
                            try {
                                if (!this.ad.equals(aiji.d(this.ab))) {
                                    advr.g("Reached unimplemented CEMA retry case!", new Object[0]);
                                }
                            } catch (Exception e) {
                                throw new aijn("MSRP Path is not a valid MSRP URI", e);
                            }
                        }
                        super.R();
                        return;
                    }
                    throw new aijn("Media path in SDP session description cannot be null");
                }
                throw new aijn("SDB content cannot be null");
            }
            throw new aijn("SDB body part cannot be null");
        } catch (Exception e2) {
            advr.i(e2, "Error while completing session: %s", e2.getMessage());
            throw new adph(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adrc, defpackage.adoz
    public final void V(aion aionVar) {
        String[] C;
        if (!this.Z && aF() != null && aF().size() > 0) {
            aionVar.r("Require: recipient-list-invite");
        }
        if (this.F) {
            advr.c("Overriding accept-contact header for conference invitation.Client must only set IM tag!", new Object[0]);
            if (aczf.F()) {
                C = (String[]) Collection.EL.toArray(this.X.b(), new adak(6));
            } else {
                C = adwf.C(ak());
            }
            try {
                adwf.t(aionVar, C, false, false);
            } catch (ailb e) {
                advr.q("Unable to overwrite accept-contact header: %s", e.getMessage());
            }
        }
        super.V(aionVar);
    }

    @Override // defpackage.adoz
    protected final aiok[] am() {
        aiji a;
        String str;
        String aE;
        aijj aijjVar;
        Optional empty;
        aiok aiokVar;
        adqu adquVar;
        aijr aijrVar = new aijr();
        aijrVar.c(aiju.a);
        if (this.w) {
            a = ((adrc) this).G.c();
        } else {
            a = ((adrc) this).G.a();
        }
        if (!aczl.q()) {
            a.e(new aijg("connection", "new"));
        }
        if (true != ((Boolean) aczl.c().a.e.a()).booleanValue()) {
            str = "active";
        } else {
            str = "actpass";
        }
        a.e(new aijg("setup", str));
        a.e(new aijg("accept-types", aD()));
        if (this.X.d()) {
            aE = "*";
        } else {
            aE = super.aE();
            if (aczr.d()) {
                aE = aE.concat(" multipart/related application/conference-info+xml");
            }
        }
        a.e(new aijg("accept-wrapped-types", aE));
        if (this.X.d()) {
            aijjVar = aijj.SEND_ONLY;
        } else {
            aijjVar = aijj.SEND_RECEIVE;
        }
        a.e(aijjVar.g);
        if (aczl.n()) {
            a.e(new aijg("msrp-cema", null));
        }
        if (this.X.d() && (adquVar = this.N) != null) {
            empty = Optional.ofNullable(adquVar.g).map(new adof(9));
        } else {
            empty = Optional.empty();
        }
        empty.ifPresent(new adoj(a, 6));
        aijrVar.a(a);
        aiok aiokVar2 = new aiok(aijrVar.f(), "application/sdp");
        if (!this.Z) {
            if (aF().size() > 0) {
                adzb adzbVar = new adzb();
                adza adzaVar = new adza();
                adzbVar.b().add(adzaVar);
                for (int i = 0; i < aF().size(); i++) {
                    adyy adyyVar = new adyy((String) aF().get(i));
                    adyyVar.f = adyv.TO;
                    adzaVar.b.add(adyyVar);
                }
                try {
                    return new aiok[]{aiokVar2, new aiok(adzb.e(adzbVar))};
                } catch (IOException e) {
                    advr.i(e, "Error while generating SIP body part: %s", e.getMessage());
                    return new aiok[]{aiokVar2};
                }
            }
            adqu adquVar2 = this.N;
            if (adquVar2 != null) {
                if (ak()) {
                    try {
                        advr.w(10, 3, "Queueing init INVITE to MSRP pipe %s with messageid=%s", adquVar2, adquVar2.k);
                        ((adrc) this).L.addFirst(adquVar2);
                    } catch (adqx e2) {
                        advr.i(e2, "Can't queue the initial message to msrp pipe", new Object[0]);
                    }
                } else {
                    try {
                        aifc aifcVar = adquVar2.g;
                        if (aifcVar != null) {
                            byte[] b = amcp.b(aifcVar.b());
                            if ("message/cpim".equals(adquVar2.h)) {
                                aiokVar = new aiok(b, "message/cpim");
                            } else {
                                aifd aifdVar = new aifd(adquVar2.h, "utf-8");
                                aifdVar.o("imdn", "urn:ietf:params:imdn");
                                aifdVar.l("sip:anonymous@anonymous.invalid");
                                aifdVar.p("sip:anonymous@anonymous.invalid");
                                aifdVar.m("DateTime", advi.a().toString());
                                aifdVar.n("urn:ietf:params:imdn", "Disposition-Notification", E);
                                aifdVar.n("urn:ietf:params:imdn", "Message-ID", adquVar2.k);
                                aifdVar.j(b);
                                aiokVar = new aiok(aifdVar.toString(), "message/cpim");
                            }
                            aiokVar.e = adquVar2.b();
                            return new aiok[]{aiokVar2, aiokVar};
                        }
                        throw new adpj("MessageContent is null");
                    } catch (IOException e3) {
                        throw new adpj("Failed to get messageContent InputStream", e3);
                    }
                }
            } else {
                advr.g("Not capable of CPM or SIMPLE IM", new Object[0]);
                return new aiok[]{aiokVar2};
            }
        }
        return new aiok[]{aiokVar2};
    }

    @Override // defpackage.adoz
    public final String[] an() {
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (ak()) {
            if (true != this.X.d()) {
                str = "urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session";
            } else {
                str = "urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.largemsg";
            }
            arrayList3.add(str);
        } else {
            arrayList.add("+g.oma.sip-im");
        }
        if (this.F) {
            arrayList2.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
            if (this.Q) {
                arrayList2.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush");
            }
        } else if (((adrc) this).K && aczn.d()) {
            arrayList.add(adta.g());
            arrayList2.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot");
        } else {
            adqu adquVar = this.N;
            if (adquVar != null && "application/vnd.gsma.rcs-ft-http+xml".equals(adquVar.h)) {
                arrayList.add("require");
                arrayList.add("explicit");
                arrayList2.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
            }
        }
        if (this.V) {
            arrayList.add("+vnd.google.rcs.encrypted");
        } else if (((Boolean) aczx.a().b.v.a()).booleanValue() || this.U) {
            arrayList.add("+g.gsma.rcs.msgrevoke");
        }
        return adwf.D(arrayList, arrayList2, arrayList3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
    
        throw new defpackage.aiip("Can't generate msrp message: outgoing message is null");
     */
    @Override // defpackage.adon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adrq.b():void");
    }

    public final void bp(adum adumVar, String[] strArr) {
        String str;
        String str2;
        bo();
        aV(strArr);
        if (ak()) {
            str = aikx.b();
        } else {
            str = adumVar.d;
        }
        if (ak()) {
            str2 = adumVar.d;
        } else {
            str2 = null;
        }
        if (Objects.isNull(str)) {
            advr.q("contributionId is empty.", new Object[0]);
        } else {
            this.z = str;
        }
        if (ak()) {
            this.A = str2;
        }
        adumVar.f.ifPresent(new adoj(this, 5));
    }
}
