package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adrv extends adrc {
    public static final /* synthetic */ int ah = 0;
    private boolean Z;
    String aa;
    String ab;
    String ac;
    int ad;
    String ae;
    public final Queue af;
    aijb ag;

    public adrv(Context context, adou adouVar, armf armfVar, aion aionVar, aiim aiimVar, aduo aduoVar, adpu adpuVar, acqj acqjVar, adwe adweVar, InstantMessageConfiguration instantMessageConfiguration, acof acofVar) {
        super(context, adouVar, armfVar, aionVar, aiimVar, aduoVar, adpuVar, acqjVar, adweVar, instantMessageConfiguration, acofVar);
        String b;
        this.af = new ArrayDeque();
        advr.c("Creating new chat session as terminating", new Object[0]);
        aiok c = aionVar.c("application/resource-lists+xml");
        if (c != null) {
            try {
                adza adzaVar = (adza) adzb.a(new InputStreamReader(new ByteArrayInputStream(c.a), "utf-8")).b().get(0);
                if (adzaVar != null && adzaVar.b.size() > 0) {
                    List list = adzaVar.b;
                    String[] strArr = new String[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        strArr[i] = ((adyy) list.get(i)).d;
                    }
                    aV(strArr);
                }
                String j = aionVar.j("Referred-By");
                if (j == null) {
                    advr.h(adrc.C, "Invite missing REFERRED_BY header", new Object[0]);
                } else {
                    ((adrc) this).I = this.Y.e(adwf.l(j, u(), this.m));
                }
            } catch (IOException e) {
                advr.i(e, "Error while reading resource lists: %s", e.getMessage());
            }
        }
        aiok c2 = aionVar.c("application/sdp");
        if (c2 != null && (b = c2.b()) != null) {
            this.w = b.contains("TCP/TLS/MSRP");
            return;
        }
        throw new aild("Can't create a session for an INVITE with no SDP");
    }

    @Override // defpackage.adoz
    protected String A() {
        return "TerminatingChatSession";
    }

    @Override // defpackage.adrc
    public final Optional aC() {
        String str = this.W;
        if (str != null && str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot") && !((adrc) this).K) {
            return Optional.of(adra.INVALID_CHAT_BOT);
        }
        return Optional.empty();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adrc
    public final String aE() {
        if (this.X.d()) {
            return "*";
        }
        String aE = super.aE();
        if (aczr.d() && ba()) {
            return aE.concat(" multipart/related application/conference-info+xml");
        }
        return aE;
    }

    @Override // defpackage.adoz
    protected aiok[] am() {
        String b;
        String str;
        String str2;
        aijj aijjVar;
        aiok g = this.l.g();
        if (g != null && (b = g.b()) != null) {
            try {
                aijr n = ahji.n(b);
                aiji aijiVar = (aiji) n.c.get(0);
                aijg a = aijiVar.a("path");
                aijg a2 = aijiVar.a("fingerprint");
                if (a2 != null) {
                    this.ab = a2.b;
                }
                if (a != null && (str = a.b) != null) {
                    this.aa = str;
                    if (n.d()) {
                        str2 = n.h.a;
                    } else {
                        str2 = aijiVar.c.a;
                    }
                    this.ac = str2;
                    aijg a3 = aijiVar.a("msrp-cema");
                    if (aczl.n()) {
                        if (a3 != null) {
                            this.Z = true;
                        } else {
                            try {
                                if (!this.ac.equals(aiji.d(this.aa))) {
                                    aO(adra.INVALID_PARAMETERS);
                                    throw new adpj("Incoming SDP does not specify CEMA but path does not match C/M lines");
                                }
                            } catch (Exception e) {
                                throw new adpj("MSRP Path is not a valid MSRP URI", e);
                            }
                        }
                    }
                    this.ad = aijiVar.a;
                    String f = aiit.f(aijiVar);
                    this.ae = f;
                    advr.c("Local setup attribute is %s", f);
                    if (!"active".equals(this.ae)) {
                        this.ag = bd(this.aa, this);
                    }
                    boolean equals = "active".equals(this.ae);
                    aijr aijrVar = new aijr();
                    aijrVar.c(aiju.a);
                    aiok aiokVar = null;
                    try {
                        aiji aA = aA(equals);
                        aA.e(new aijg("accept-types", aD()));
                        aA.e(new aijg("accept-wrapped-types", aE()));
                        if (!aczl.q()) {
                            aA.e(new aijg("connection", "new"));
                        }
                        aA.e(new aijg("setup", this.ae));
                        if (this.X.d()) {
                            aijjVar = aijj.RECEIVE_ONLY;
                        } else {
                            aijjVar = aijj.SEND_RECEIVE;
                        }
                        aA.e(aijjVar.g);
                        if (this.Z) {
                            aA.e(new aijg("msrp-cema", null));
                        }
                        aijrVar.a(aA);
                        aiokVar = new aiok(aijrVar.f(), "application/sdp");
                    } catch (IllegalStateException unused) {
                    }
                    if (!Objects.isNull(aiokVar)) {
                        return new aiok[]{aiokVar};
                    }
                    throw new adpj("SIP body parts cannot be build");
                }
                throw new adpj("Can't prepare a prepare a session for an SDP without a PATH");
            } catch (aijn e2) {
                throw new adpj(e2);
            }
        }
        throw new adpj("Can't prepare a session without a sip dialog path");
    }

    @Override // defpackage.adoz
    public String[] an() {
        Optional empty;
        alob alobVar = new alob();
        alob alobVar2 = new alob();
        alob alobVar3 = new alob();
        if (ak()) {
            alobVar3.h("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session");
        } else {
            alobVar.h("+g.oma.sip-im");
        }
        if (((adrc) this).K) {
            alobVar2.h("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot");
            try {
                empty = Collection.EL.stream(((adfq) this.T).b().h).filter(new adru(0)).findFirst();
            } catch (IllegalStateException unused) {
                advr.c("RegistrationContext is not available.", new Object[0]);
                empty = Optional.empty();
            }
            empty.ifPresent(new adoj(alobVar, 7));
        }
        if (this.F) {
            alobVar2.h("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
            if (this.Q) {
                alobVar2.h("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush");
            }
        }
        return adwf.D(alobVar.g(), alobVar2.g(), alobVar3.g());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        throw new defpackage.aiip("Can't generate msrp message: outgoing message is null");
     */
    @Override // defpackage.adon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adrv.b():void");
    }
}
