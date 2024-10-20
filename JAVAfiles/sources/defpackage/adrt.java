package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrt extends adrv {
    public final boolean Z;

    public adrt(Context context, adrh adrhVar, armf armfVar, aion aionVar, aiim aiimVar, aduo aduoVar, adpu adpuVar, acqj acqjVar, adwe adweVar, InstantMessageConfiguration instantMessageConfiguration, adqw adqwVar, acof acofVar) {
        super(context, adrhVar, armfVar, aionVar, aiimVar, aduoVar, adpuVar, acqjVar, adweVar, instantMessageConfiguration, acofVar);
        String j = aionVar.j("Referred-By");
        if (j != null) {
            ag(j, ((aikc) armfVar).a);
        }
        aiks b = adwf.b(aionVar, this.m);
        b.getClass();
        String aiksVar = b.toString();
        boolean z = false;
        if (!TextUtils.isEmpty(aiksVar)) {
            String k = adwf.k(aiksVar, this.m);
            if (!TextUtils.isEmpty(k)) {
                advr.c("Remote Uri: %s, user ID: %s", advr.a(aiksVar), advr.a(k));
                z = k.equalsIgnoreCase("rcse-standfw");
            }
        }
        this.Z = z;
        aiok c = aionVar.c("application/sdp");
        if (!Objects.isNull(c)) {
            String b2 = c.b();
            if (!Objects.isNull(b2)) {
                this.w = b2.contains("TCP/TLS/MSRP");
                return;
            }
            throw new aild("Invalid request: SDP missing");
        }
        throw new aild("Invalid request: SDP missing");
    }

    @Override // defpackage.adrv, defpackage.adoz
    protected final String A() {
        return "StoreAndForwardSession";
    }

    @Override // defpackage.adrv, defpackage.adoz
    protected final aiok[] am() {
        String str;
        aijg aijgVar;
        aijj aijjVar;
        aiok g = this.l.g();
        if (!Objects.isNull(g)) {
            String b = g.b();
            if (!Objects.isNull(b)) {
                try {
                    aijr n = ahji.n(b);
                    aiji aijiVar = (aiji) n.c.get(0);
                    aijg a = aijiVar.a("fingerprint");
                    if (a != null) {
                        this.ab = a.b;
                    }
                    aijg a2 = aijiVar.a("path");
                    if (!Objects.isNull(a2)) {
                        String str2 = a2.b;
                        if (!Objects.isNull(str2)) {
                            this.aa = str2;
                            if (n.d()) {
                                str = n.h.a;
                            } else {
                                str = aijiVar.c.a;
                            }
                            this.ac = str;
                            this.ad = aijiVar.a;
                            this.ae = aiit.f(aijiVar);
                            List list = aijiVar.e;
                            aijj aijjVar2 = aijj.UNKNOWN;
                            aijj aijjVar3 = null;
                            if (list.size() > 0) {
                                int i = 0;
                                while (true) {
                                    if (i >= list.size()) {
                                        break;
                                    }
                                    String str3 = ((aijg) list.get(i)).a;
                                    if (!TextUtils.isEmpty(str3)) {
                                        aijj[] values = aijj.values();
                                        for (int i2 = 0; i2 < values.length; i2++) {
                                            if (values[i2].f.equals(str3)) {
                                                aijjVar = values[i2];
                                                break;
                                            }
                                        }
                                    }
                                    aijjVar = null;
                                    if (aijjVar != null) {
                                        aijjVar3 = aijjVar;
                                        break;
                                    }
                                    i++;
                                }
                            }
                            if (!Objects.isNull(aijjVar3)) {
                                if (aijjVar3.ordinal() != 2) {
                                    aijgVar = aijj.SEND_RECEIVE.g;
                                } else {
                                    aijgVar = aijj.RECEIVE_ONLY.g;
                                }
                                if (this.ae.equals("passive")) {
                                    this.ag = bd(this.aa, this);
                                }
                                try {
                                    boolean equals = "active".equals(this.ae);
                                    aijr aijrVar = new aijr();
                                    aijrVar.c(aiju.a);
                                    aiji aA = aA(equals);
                                    aA.e(new aijg("accept-types", aD()));
                                    aA.e(new aijg("accept-wrapped-types", aE()));
                                    aA.e(new aijg("connection", "new"));
                                    aA.e(new aijg("setup", this.ae));
                                    aA.e(aijgVar);
                                    aijrVar.a(aA);
                                    return new aiok[]{new aiok(aijrVar.f(), "application/sdp")};
                                } catch (IllegalStateException e) {
                                    throw new adpj("SIP body parts cannot be build", e);
                                }
                            }
                            throw new adpj("Remote SDP missing media direction attribute");
                        }
                        throw new adpj("Remote SDP missing path attribute");
                    }
                    throw new adpj("Remote SDP missing path attribute");
                } catch (aijn e2) {
                    throw new adpj(e2);
                }
            }
            throw new adpj("Remote SDP missing");
        }
        throw new adpj("Remote SDP missing");
    }

    @Override // defpackage.adrv, defpackage.adoz
    public final String[] an() {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (ak()) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session");
            arrayList2 = arrayList3;
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.add("+g.oma.sip-im");
            arrayList2 = null;
        }
        return adwf.D(arrayList, null, arrayList2);
    }

    @Override // defpackage.adrc
    public final boolean bb() {
        if (this.Z) {
            return false;
        }
        return super.bb();
    }
}
