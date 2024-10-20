package defpackage;

import defpackage.aozy;
import defpackage.apag;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aozy<MessageType extends apag<MessageType, BuilderType>, BuilderType extends aozy<MessageType, BuilderType>> extends aoyi<MessageType, BuilderType> implements apbu, aggq, apdw, apea, aqfw, apvx, aqbz, aqfq, aqgx {
    public final apag a;
    public apag b;

    public aozy() {
        throw null;
    }

    private static void a(Object obj, Object obj2) {
        apcc.a.b(obj).h(obj, obj2);
    }

    public final void A(Map map) {
        if (!this.b.isMutable()) {
            u();
        }
        qel qelVar = (qel) this.b;
        qel qelVar2 = qel.a;
        apbo apboVar = qelVar.e;
        if (!apboVar.b) {
            qelVar.e = apboVar.a();
        }
        qelVar.e.putAll(map);
    }

    public final void B(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        qen qenVar = (qen) this.b;
        qen qenVar2 = qen.a;
        apax apaxVar = qenVar.g;
        if (!apaxVar.c()) {
            qenVar.g = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, qenVar.g);
    }

    public final void C(qei qeiVar) {
        if (!this.b.isMutable()) {
            u();
        }
        qey qeyVar = (qey) this.b;
        apap apapVar = qey.a;
        qeiVar.getClass();
        qeyVar.a();
        qeyVar.f.add(qeiVar);
    }

    public final void D(qei qeiVar) {
        if (!this.b.isMutable()) {
            u();
        }
        qey qeyVar = (qey) this.b;
        apap apapVar = qey.a;
        qeiVar.getClass();
        qeyVar.b();
        qeyVar.g.add(qeiVar);
    }

    public final void E(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        qez qezVar = (qez) this.b;
        apap apapVar = qez.a;
        qezVar.a();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            qezVar.f.g(((qes) it.next()).f);
        }
    }

    public final void F(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        qez qezVar = (qez) this.b;
        apap apapVar = qez.a;
        apax apaxVar = qezVar.g;
        if (!apaxVar.c()) {
            qezVar.g = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, qezVar.g);
    }

    public final void G(qes qesVar) {
        if (!this.b.isMutable()) {
            u();
        }
        qez qezVar = (qez) this.b;
        apap apapVar = qez.a;
        qesVar.getClass();
        qezVar.a();
        qezVar.f.g(qesVar.f);
    }

    public final void H(qfw qfwVar) {
        if (!this.b.isMutable()) {
            u();
        }
        qfg qfgVar = (qfg) this.b;
        qfg qfgVar2 = qfg.a;
        qfwVar.getClass();
        qfgVar.a();
        qfgVar.c.add(qfwVar);
    }

    public final void I(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        qfo qfoVar = (qfo) this.b;
        apap apapVar = qfo.a;
        qfoVar.b();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            qfoVar.n.g(((qfn) it.next()).d);
        }
    }

    public final void J(qej qejVar) {
        if (!this.b.isMutable()) {
            u();
        }
        qfo qfoVar = (qfo) this.b;
        apap apapVar = qfo.a;
        qejVar.getClass();
        qfoVar.a();
        qfoVar.j.add(qejVar);
    }

    public final void K(qfn qfnVar) {
        if (!this.b.isMutable()) {
            u();
        }
        qfo qfoVar = (qfo) this.b;
        apap apapVar = qfo.a;
        qfnVar.getClass();
        qfoVar.b();
        qfoVar.n.g(qfnVar.d);
    }

    public final void L(qei qeiVar) {
        if (!this.b.isMutable()) {
            u();
        }
        qfy qfyVar = (qfy) this.b;
        qfy qfyVar2 = qfy.a;
        qeiVar.getClass();
        apax apaxVar = qfyVar.d;
        if (!apaxVar.c()) {
            qfyVar.d = apag.mutableCopy(apaxVar);
        }
        qfyVar.d.add(qeiVar);
    }

    public final void M(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        qog qogVar = (qog) this.b;
        qog qogVar2 = qog.a;
        apax apaxVar = qogVar.c;
        if (!apaxVar.c()) {
            qogVar.c = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, qogVar.c);
    }

    public final void N(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        qoj qojVar = (qoj) this.b;
        qoj qojVar2 = qoj.a;
        apax apaxVar = qojVar.d;
        if (!apaxVar.c()) {
            qojVar.d = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, qojVar.d);
    }

    public final void O(String str) {
        if (!this.b.isMutable()) {
            u();
        }
        trv trvVar = (trv) this.b;
        trv trvVar2 = trv.a;
        str.getClass();
        apax apaxVar = trvVar.b;
        if (!apaxVar.c()) {
            trvVar.b = apag.mutableCopy(apaxVar);
        }
        trvVar.b.add(str);
    }

    public final void P(String str) {
        if (!this.b.isMutable()) {
            u();
        }
        ulz ulzVar = (ulz) this.b;
        ulz ulzVar2 = ulz.a;
        str.getClass();
        apax apaxVar = ulzVar.c;
        if (!apaxVar.c()) {
            ulzVar.c = apag.mutableCopy(apaxVar);
        }
        ulzVar.c.add(str);
    }

    public final void Q(String str) {
        if (!this.b.isMutable()) {
            u();
        }
        ulz ulzVar = (ulz) this.b;
        ulz ulzVar2 = ulz.a;
        str.getClass();
        apax apaxVar = ulzVar.b;
        if (!apaxVar.c()) {
            ulzVar.b = apag.mutableCopy(apaxVar);
        }
        ulzVar.b.add(str);
    }

    public final void R(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        uzw uzwVar = (uzw) this.b;
        uzw uzwVar2 = uzw.a;
        uzwVar.a();
        aoyj.addAll(iterable, uzwVar.c);
    }

    public final void S(String str) {
        if (!this.b.isMutable()) {
            u();
        }
        uzw uzwVar = (uzw) this.b;
        uzw uzwVar2 = uzw.a;
        str.getClass();
        uzwVar.a();
        uzwVar.c.add(str);
    }

    public final void T(String str) {
        if (!this.b.isMutable()) {
            u();
        }
        uzy uzyVar = (uzy) this.b;
        uzy uzyVar2 = uzy.a;
        str.getClass();
        apax apaxVar = uzyVar.b;
        if (!apaxVar.c()) {
            uzyVar.b = apag.mutableCopy(apaxVar);
        }
        uzyVar.b.add(str);
    }

    public final void U(Map map) {
        if (!this.b.isMutable()) {
            u();
        }
        vmq vmqVar = (vmq) this.b;
        vmq vmqVar2 = vmq.a;
        vmqVar.a().putAll(map);
    }

    public final void V(String str, vmn vmnVar) {
        str.getClass();
        vmnVar.getClass();
        if (!this.b.isMutable()) {
            u();
        }
        vmq vmqVar = (vmq) this.b;
        vmq vmqVar2 = vmq.a;
        vmqVar.a().put(str, vmnVar);
    }

    public final void W(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        vwp vwpVar = (vwp) this.b;
        vwp vwpVar2 = vwp.a;
        apax apaxVar = vwpVar.f;
        if (!apaxVar.c()) {
            vwpVar.f = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, vwpVar.f);
    }

    public final void X(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        wbi wbiVar = (wbi) this.b;
        wbi wbiVar2 = wbi.a;
        apax apaxVar = wbiVar.e;
        if (!apaxVar.c()) {
            wbiVar.e = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, wbiVar.e);
    }

    public final void Y(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        wfg wfgVar = (wfg) this.b;
        wfg wfgVar2 = wfg.a;
        apax apaxVar = wfgVar.b;
        if (!apaxVar.c()) {
            wfgVar.b = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, wfgVar.b);
    }

    public final void Z(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        wgi wgiVar = (wgi) this.b;
        wgi wgiVar2 = wgi.a;
        wgiVar.a();
        aoyj.addAll(iterable, wgiVar.d);
    }

    public final void aA(akpj akpjVar) {
        if (!this.b.isMutable()) {
            u();
        }
        akpk akpkVar = (akpk) this.b;
        akpk akpkVar2 = akpk.a;
        akpjVar.getClass();
        apax apaxVar = akpkVar.d;
        if (!apaxVar.c()) {
            akpkVar.d = apag.mutableCopy(apaxVar);
        }
        akpkVar.d.add(akpjVar);
    }

    public final void aB(akrg akrgVar) {
        if (!this.b.isMutable()) {
            u();
        }
        aktq aktqVar = (aktq) this.b;
        aktq aktqVar2 = aktq.a;
        akrgVar.getClass();
        apax apaxVar = aktqVar.e;
        if (!apaxVar.c()) {
            aktqVar.e = apag.mutableCopy(apaxVar);
        }
        aktqVar.e.add(akrgVar);
    }

    public final void aC(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        aldb aldbVar = (aldb) this.b;
        aldb aldbVar2 = aldb.a;
        aldbVar.a();
        aoyj.addAll(iterable, aldbVar.b);
    }

    public final void aD(alda aldaVar) {
        if (!this.b.isMutable()) {
            u();
        }
        aldb aldbVar = (aldb) this.b;
        aldb aldbVar2 = aldb.a;
        aldaVar.getClass();
        aldbVar.a();
        aldbVar.b.add(aldaVar);
    }

    public final void aE(aqbc aqbcVar) {
        if (!this.b.isMutable()) {
            u();
        }
        aldf aldfVar = (aldf) this.b;
        aldf aldfVar2 = aldf.a;
        aqbcVar.getClass();
        apao apaoVar = aldfVar.e;
        if (!apaoVar.c()) {
            aldfVar.e = apag.mutableCopy(apaoVar);
        }
        aldfVar.e.g(aqbcVar.a());
    }

    public final void aF(aled aledVar) {
        if (!this.b.isMutable()) {
            u();
        }
        alee aleeVar = (alee) this.b;
        alee aleeVar2 = alee.a;
        aledVar.getClass();
        apax apaxVar = aleeVar.b;
        if (!apaxVar.c()) {
            aleeVar.b = apag.mutableCopy(apaxVar);
        }
        aleeVar.b.add(aledVar);
    }

    public final void aG(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        aled aledVar = (aled) this.b;
        aled aledVar2 = aled.a;
        apao apaoVar = aledVar.b;
        if (!apaoVar.c()) {
            aledVar.b = apag.mutableCopy(apaoVar);
        }
        aoyj.addAll(iterable, aledVar.b);
    }

    public final void aH(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        amfh amfhVar = (amfh) this.b;
        amfh amfhVar2 = amfh.a;
        apao apaoVar = amfhVar.E;
        if (!apaoVar.c()) {
            amfhVar.E = apag.mutableCopy(apaoVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            amfhVar.E.g(((amgg) it.next()).u);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final amec aI() {
        return (amec) ((amgw) this.b).b.get(0);
    }

    public final void aJ(amlz amlzVar) {
        if (!this.b.isMutable()) {
            u();
        }
        ammb ammbVar = (ammb) this.b;
        ammb ammbVar2 = ammb.a;
        amlzVar.getClass();
        apao apaoVar = ammbVar.f;
        if (!apaoVar.c()) {
            ammbVar.f = apag.mutableCopy(apaoVar);
        }
        ammbVar.f.g(amlzVar.e);
    }

    public final void aK(amlz amlzVar) {
        if (!this.b.isMutable()) {
            u();
        }
        ammb ammbVar = (ammb) this.b;
        ammb ammbVar2 = ammb.a;
        amlzVar.getClass();
        apao apaoVar = ammbVar.e;
        if (!apaoVar.c()) {
            ammbVar.e = apag.mutableCopy(apaoVar);
        }
        ammbVar.e.g(amlzVar.e);
    }

    public final void aL(amny amnyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        amnz amnzVar = (amnz) this.b;
        amnz amnzVar2 = amnz.a;
        amnyVar.getClass();
        amnzVar.a();
        amnzVar.b.add(amnyVar);
    }

    public final void aM(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        amvq amvqVar = (amvq) this.b;
        amvq amvqVar2 = amvq.a;
        apao apaoVar = amvqVar.f;
        if (!apaoVar.c()) {
            amvqVar.f = apag.mutableCopy(apaoVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            amvqVar.f.g(((amvl) it.next()).x);
        }
    }

    public final void aN(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        amze amzeVar = (amze) this.b;
        amze amzeVar2 = amze.a;
        apao apaoVar = amzeVar.h;
        if (!apaoVar.c()) {
            amzeVar.h = apag.mutableCopy(apaoVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            amzeVar.h.g(((amzn) it.next()).a());
        }
    }

    public final void aO(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        anam anamVar = (anam) this.b;
        anam anamVar2 = anam.a;
        apax apaxVar = anamVar.b;
        if (!apaxVar.c()) {
            anamVar.b = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, anamVar.b);
    }

    public final void aP(String str) {
        if (!this.b.isMutable()) {
            u();
        }
        anfr anfrVar = (anfr) this.b;
        anfr anfrVar2 = anfr.a;
        str.getClass();
        apax apaxVar = anfrVar.s;
        if (!apaxVar.c()) {
            anfrVar.s = apag.mutableCopy(apaxVar);
        }
        anfrVar.s.add(str);
    }

    public final void aQ(ango angoVar) {
        if (!this.b.isMutable()) {
            u();
        }
        anfr anfrVar = (anfr) this.b;
        anfr anfrVar2 = anfr.a;
        angoVar.getClass();
        anfrVar.a();
        anfrVar.r.add(angoVar);
    }

    public final void aR(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        anfs anfsVar = (anfs) this.b;
        anfs anfsVar2 = anfs.a;
        apax apaxVar = anfsVar.c;
        if (!apaxVar.c()) {
            anfsVar.c = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, anfsVar.c);
    }

    public final void aS(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        anfu anfuVar = (anfu) this.b;
        anfu anfuVar2 = anfu.a;
        anfuVar.a();
        aoyj.addAll(iterable, anfuVar.b);
    }

    public final void aT(anfr anfrVar) {
        if (!this.b.isMutable()) {
            u();
        }
        anfu anfuVar = (anfu) this.b;
        anfu anfuVar2 = anfu.a;
        anfrVar.getClass();
        anfuVar.a();
        anfuVar.b.add(anfrVar);
    }

    public final void aU(anxh anxhVar) {
        if (!this.b.isMutable()) {
            u();
        }
        anxi anxiVar = (anxi) this.b;
        anxi anxiVar2 = anxi.a;
        anxhVar.getClass();
        apax apaxVar = anxiVar.c;
        if (!apaxVar.c()) {
            anxiVar.c = apag.mutableCopy(apaxVar);
        }
        anxiVar.c.add(anxhVar);
    }

    public final void aV(String str) {
        if (!this.b.isMutable()) {
            u();
        }
        aocn aocnVar = (aocn) this.b;
        aocn aocnVar2 = aocn.a;
        str.getClass();
        apax apaxVar = aocnVar.c;
        if (!apaxVar.c()) {
            aocnVar.c = apag.mutableCopy(apaxVar);
        }
        aocnVar.c.add(str);
    }

    public final void aW(aocm aocmVar) {
        if (!this.b.isMutable()) {
            u();
        }
        aoco aocoVar = (aoco) this.b;
        aoco aocoVar2 = aoco.a;
        aocmVar.getClass();
        aocoVar.a();
        aocoVar.g.add(aocmVar);
    }

    public final void aX(String str) {
        if (!this.b.isMutable()) {
            u();
        }
        aors aorsVar = (aors) this.b;
        aors aorsVar2 = aors.a;
        str.getClass();
        apax apaxVar = aorsVar.d;
        if (!apaxVar.c()) {
            aorsVar.d = apag.mutableCopy(apaxVar);
        }
        aorsVar.d.add(str);
    }

    public final void aY(aotv aotvVar) {
        if (!this.b.isMutable()) {
            u();
        }
        aotx aotxVar = (aotx) this.b;
        aotx aotxVar2 = aotx.a;
        aotvVar.getClass();
        apax apaxVar = aotxVar.g;
        if (!apaxVar.c()) {
            aotxVar.g = apag.mutableCopy(apaxVar);
        }
        aotxVar.g.add(aotvVar);
    }

    public final void aZ(String str) {
        if (!this.b.isMutable()) {
            u();
        }
        aoup aoupVar = (aoup) this.b;
        aoup aoupVar2 = aoup.a;
        apax apaxVar = aoupVar.b;
        if (!apaxVar.c()) {
            aoupVar.b = apag.mutableCopy(apaxVar);
        }
        aoupVar.b.add(str);
    }

    public final void aa(wgh wghVar) {
        if (!this.b.isMutable()) {
            u();
        }
        wgi wgiVar = (wgi) this.b;
        wgi wgiVar2 = wgi.a;
        wghVar.getClass();
        wgiVar.a();
        wgiVar.d.add(wghVar);
    }

    public final void ab(String str, whl whlVar) {
        str.getClass();
        whlVar.getClass();
        if (!this.b.isMutable()) {
            u();
        }
        whc whcVar = (whc) this.b;
        whc whcVar2 = whc.a;
        apbo apboVar = whcVar.n;
        if (!apboVar.b) {
            whcVar.n = apboVar.a();
        }
        whcVar.n.put(str, whlVar);
    }

    public final void ac(wfy wfyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        wgr wgrVar = (wgr) this.b;
        wgr wgrVar2 = wgr.a;
        wfyVar.getClass();
        wgrVar.a();
        wgrVar.b.add(wfyVar);
    }

    public final void ad(String str, acun acunVar) {
        if (!this.b.isMutable()) {
            u();
        }
        wie wieVar = (wie) this.b;
        wie wieVar2 = wie.a;
        apbo apboVar = wieVar.b;
        if (!apboVar.b) {
            wieVar.b = apboVar.a();
        }
        wieVar.b.put(str, acunVar);
    }

    public final void ae(String str, boolean z) {
        if (!this.b.isMutable()) {
            u();
        }
        wie wieVar = (wie) this.b;
        wie wieVar2 = wie.a;
        apbo apboVar = wieVar.c;
        if (!apboVar.b) {
            wieVar.c = apboVar.a();
        }
        wieVar.c.put(str, Boolean.valueOf(z));
    }

    public final void af(String str, wja wjaVar) {
        wjaVar.getClass();
        if (!this.b.isMutable()) {
            u();
        }
        wjc wjcVar = (wjc) this.b;
        wjc wjcVar2 = wjc.a;
        apbo apboVar = wjcVar.c;
        if (!apboVar.b) {
            wjcVar.c = apboVar.a();
        }
        new apaw(wjcVar.c, wjc.f).put(str, wjaVar);
    }

    public final void ag(xgx xgxVar) {
        xgx xgxVar2;
        if (!this.b.isMutable()) {
            u();
        }
        xgy xgyVar = (xgy) this.b;
        xgy xgyVar2 = xgy.a;
        xgxVar.getClass();
        MessageType messagetype = xgyVar.c;
        if (messagetype != null && messagetype != (xgxVar2 = xgx.a)) {
            aozy createBuilder = xgxVar2.createBuilder(messagetype);
            createBuilder.w(xgxVar);
            xgxVar = (xgx) createBuilder.t();
        }
        xgyVar.c = xgxVar;
        xgyVar.b |= 1;
    }

    public final void ah(ysx ysxVar) {
        if (!this.b.isMutable()) {
            u();
        }
        ysy ysyVar = (ysy) this.b;
        ysy ysyVar2 = ysy.a;
        ysxVar.getClass();
        ysyVar.a();
        ysyVar.b.add(ysxVar);
    }

    public final void ai(yum yumVar) {
        if (!this.b.isMutable()) {
            u();
        }
        yub yubVar = (yub) this.b;
        yub yubVar2 = yub.a;
        yumVar.getClass();
        yubVar.a();
        yubVar.b.add(yumVar);
    }

    public final yub aj(String str, yub yubVar) {
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(((yuf) this.b).e);
        if (unmodifiableMap.containsKey(str)) {
            return (yub) unmodifiableMap.get(str);
        }
        return yubVar;
    }

    public final boolean ak(String str) {
        str.getClass();
        return DesugarCollections.unmodifiableMap(((yuf) this.b).d).containsKey(str);
    }

    public final void al(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (!this.b.isMutable()) {
            u();
        }
        yuf yufVar = (yuf) this.b;
        yuf yufVar2 = yuf.a;
        apbo apboVar = yufVar.d;
        if (!apboVar.b) {
            yufVar.d = apboVar.a();
        }
        yufVar.d.put(str, str2);
    }

    public final void am(String str, yub yubVar) {
        yubVar.getClass();
        if (!this.b.isMutable()) {
            u();
        }
        yuf yufVar = (yuf) this.b;
        yuf yufVar2 = yuf.a;
        apbo apboVar = yufVar.e;
        if (!apboVar.b) {
            yufVar.e = apboVar.a();
        }
        yufVar.e.put(str, yubVar);
    }

    public final void an(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        yvv yvvVar = (yvv) this.b;
        yvv yvvVar2 = yvv.a;
        apax apaxVar = yvvVar.x;
        if (!apaxVar.c()) {
            yvvVar.x = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, yvvVar.x);
    }

    public final void ao(abmp abmpVar) {
        if (!this.b.isMutable()) {
            u();
        }
        abmx abmxVar = (abmx) this.b;
        abmx abmxVar2 = abmx.a;
        apax apaxVar = abmxVar.d;
        if (!apaxVar.c()) {
            abmxVar.d = apag.mutableCopy(apaxVar);
        }
        abmxVar.d.add(abmpVar);
    }

    public final void ap(Map map) {
        if (!this.b.isMutable()) {
            u();
        }
        agut agutVar = (agut) this.b;
        agut agutVar2 = agut.a;
        apbo apboVar = agutVar.b;
        if (!apboVar.b) {
            agutVar.b = apboVar.a();
        }
        agutVar.b.putAll(map);
    }

    public final void aq(Map map) {
        if (!this.b.isMutable()) {
            u();
        }
        aguw aguwVar = (aguw) this.b;
        aguw aguwVar2 = aguw.a;
        apbo apboVar = aguwVar.d;
        if (!apboVar.b) {
            aguwVar.d = apboVar.a();
        }
        aguwVar.d.putAll(map);
    }

    public final void ar(agvd agvdVar) {
        if (!this.b.isMutable()) {
            u();
        }
        agve agveVar = (agve) this.b;
        agve agveVar2 = agve.a;
        agvdVar.getClass();
        agveVar.a();
        agveVar.b.add(agvdVar);
    }

    public final void as(aozb aozbVar) {
        if (!this.b.isMutable()) {
            u();
        }
        ahtv ahtvVar = (ahtv) this.b;
        ahtv ahtvVar2 = ahtv.a;
        apax apaxVar = ahtvVar.d;
        if (!apaxVar.c()) {
            ahtvVar.d = apag.mutableCopy(apaxVar);
        }
        ahtvVar.d.add(aozbVar);
    }

    public final void at(String str) {
        if (!this.b.isMutable()) {
            u();
        }
        ahun ahunVar = (ahun) this.b;
        ahun ahunVar2 = ahun.a;
        str.getClass();
        apax apaxVar = ahunVar.c;
        if (!apaxVar.c()) {
            ahunVar.c = apag.mutableCopy(apaxVar);
        }
        ahunVar.c.add(str);
    }

    public final void au(String str, ahun ahunVar) {
        str.getClass();
        ahunVar.getClass();
        if (!this.b.isMutable()) {
            u();
        }
        ahup ahupVar = (ahup) this.b;
        ahup ahupVar2 = ahup.a;
        apbo apboVar = ahupVar.b;
        if (!apboVar.b) {
            ahupVar.b = apboVar.a();
        }
        ahupVar.b.put(str, ahunVar);
    }

    public final void av(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        aiei aieiVar = (aiei) this.b;
        aiei aieiVar2 = aiei.a;
        aieiVar.a();
        aoyj.addAll(iterable, aieiVar.d);
    }

    public final void aw(aieh aiehVar) {
        if (!this.b.isMutable()) {
            u();
        }
        aiei aieiVar = (aiei) this.b;
        aiei aieiVar2 = aiei.a;
        aiehVar.getClass();
        aieiVar.a();
        aieiVar.d.add(aiehVar);
    }

    public final void ax(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        ajxl ajxlVar = (ajxl) this.b;
        ajxl ajxlVar2 = ajxl.a;
        apax apaxVar = ajxlVar.f;
        if (!apaxVar.c()) {
            ajxlVar.f = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, ajxlVar.f);
    }

    public final void ay(int i, ajzz ajzzVar) {
        ajzzVar.getClass();
        if (!this.b.isMutable()) {
            u();
        }
        ajzw ajzwVar = (ajzw) this.b;
        ajzw ajzwVar2 = ajzw.a;
        ajzwVar.a().put(Integer.valueOf(i), ajzzVar);
    }

    public final void az(String str) {
        str.getClass();
        if (!this.b.isMutable()) {
            u();
        }
        akai akaiVar = (akai) this.b;
        akai akaiVar2 = akai.a;
        akaiVar.a().remove(str);
    }

    public final void bA(int i) {
        if (!this.b.isMutable()) {
            u();
        }
        apog apogVar = (apog) this.b;
        apog apogVar2 = apog.a;
        apao apaoVar = apogVar.d;
        if (!apaoVar.c()) {
            apogVar.d = apag.mutableCopy(apaoVar);
        }
        apogVar.d.g(a.au(i));
    }

    public final void bB(String str) {
        if (!this.b.isMutable()) {
            u();
        }
        apqf apqfVar = (apqf) this.b;
        apqf apqfVar2 = apqf.a;
        apax apaxVar = apqfVar.f;
        if (!apaxVar.c()) {
            apqfVar.f = apag.mutableCopy(apaxVar);
        }
        apqfVar.f.add(str);
    }

    public final void bC(apqx apqxVar) {
        if (!this.b.isMutable()) {
            u();
        }
        apqu apquVar = (apqu) this.b;
        apqu apquVar2 = apqu.a;
        apqxVar.getClass();
        apax apaxVar = apquVar.b;
        if (!apaxVar.c()) {
            apquVar.b = apag.mutableCopy(apaxVar);
        }
        apquVar.b.add(apqxVar);
    }

    @Override // defpackage.apvx
    public final int bD() {
        return ((apvw) this.b).c.size();
    }

    @Override // defpackage.apvx
    public final String bE() {
        return ((apvw) this.b).b;
    }

    @Override // defpackage.apvx
    public final List bF() {
        return DesugarCollections.unmodifiableList(((apvw) this.b).d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.apvx
    public final String bG() {
        return (String) ((apvw) this.b).c.get(0);
    }

    public final void bH(String str, apws apwsVar) {
        str.getClass();
        apwsVar.getClass();
        if (!this.b.isMutable()) {
            u();
        }
        apwq apwqVar = (apwq) this.b;
        apwq apwqVar2 = apwq.a;
        apwqVar.a().put(str, apwsVar);
    }

    public final void bI(Map map) {
        if (!this.b.isMutable()) {
            u();
        }
        apws apwsVar = (apws) this.b;
        apws apwsVar2 = apws.a;
        apwsVar.a().putAll(map);
    }

    public final void bJ(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (!this.b.isMutable()) {
            u();
        }
        apws apwsVar = (apws) this.b;
        apws apwsVar2 = apws.a;
        apwsVar.a().put(str, str2);
    }

    public final void bK(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        aqdv aqdvVar = (aqdv) this.b;
        aqdv aqdvVar2 = aqdv.a;
        apax apaxVar = aqdvVar.d;
        if (!apaxVar.c()) {
            aqdvVar.d = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, aqdvVar.d);
    }

    public final void bL(aqhz aqhzVar) {
        aqhz aqhzVar2;
        if (!this.b.isMutable()) {
            u();
        }
        aqep aqepVar = (aqep) this.b;
        aqep aqepVar2 = aqep.a;
        MessageType messagetype = aqepVar.l;
        if (messagetype != null && messagetype != (aqhzVar2 = aqhz.a)) {
            aozy createBuilder = aqhzVar2.createBuilder(messagetype);
            createBuilder.w(aqhzVar);
            aqhzVar = (aqhz) createBuilder.t();
        }
        aqepVar.l = aqhzVar;
        aqepVar.b |= 8;
    }

    public final void bM(aqfh aqfhVar) {
        if (!this.b.isMutable()) {
            u();
        }
        aqfj aqfjVar = (aqfj) this.b;
        aqfj aqfjVar2 = aqfj.a;
        aqfhVar.getClass();
        aqfjVar.a();
        aqfjVar.b.add(aqfhVar);
    }

    public final void bN(askr askrVar) {
        if (!this.b.isMutable()) {
            u();
        }
        aqfk aqfkVar = (aqfk) this.b;
        apap apapVar = aqfk.a;
        askrVar.getClass();
        apao apaoVar = aqfkVar.c;
        if (!apaoVar.c()) {
            aqfkVar.c = apag.mutableCopy(apaoVar);
        }
        aqfkVar.c.g(askrVar.a());
    }

    public final void bO(int i) {
        if (!this.b.isMutable()) {
            u();
        }
        aqhz aqhzVar = (aqhz) this.b;
        aqhz aqhzVar2 = aqhz.a;
        apao apaoVar = aqhzVar.b;
        if (!apaoVar.c()) {
            aqhzVar.b = apag.mutableCopy(apaoVar);
        }
        aqhzVar.b.g(i);
    }

    public final void bP(String str) {
        if (!this.b.isMutable()) {
            u();
        }
        asgv asgvVar = (asgv) this.b;
        asgv asgvVar2 = asgv.a;
        str.getClass();
        apax apaxVar = asgvVar.c;
        if (!apaxVar.c()) {
            asgvVar.c = apag.mutableCopy(apaxVar);
        }
        asgvVar.c.add(str);
    }

    public final void bQ(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        ashi ashiVar = (ashi) this.b;
        ashi ashiVar2 = ashi.a;
        apax apaxVar = ashiVar.c;
        if (!apaxVar.c()) {
            ashiVar.c = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, ashiVar.c);
    }

    public final void bR(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        ashi ashiVar = (ashi) this.b;
        ashi ashiVar2 = ashi.a;
        apax apaxVar = ashiVar.d;
        if (!apaxVar.c()) {
            ashiVar.d = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, ashiVar.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ashm bS(int i) {
        return (ashm) ((ashn) this.b).m.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ashm bT(int i) {
        return (ashm) ((ashn) this.b).o.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ashm bU(int i) {
        return (ashm) ((ashn) this.b).l.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ashm bV(int i) {
        return (ashm) ((ashn) this.b).k.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ashm bW(int i) {
        return (ashm) ((ashn) this.b).h.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ashm bX(int i) {
        return (ashm) ((ashn) this.b).i.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ashm bY(int i) {
        return (ashm) ((ashn) this.b).j.get(i);
    }

    public final void bZ(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        ashn ashnVar = (ashn) this.b;
        ashn ashnVar2 = ashn.a;
        ashnVar.a();
        aoyj.addAll(iterable, ashnVar.m);
    }

    public final void ba(String str, apde apdeVar) {
        apdeVar.getClass();
        if (!this.b.isMutable()) {
            u();
        }
        apcr apcrVar = (apcr) this.b;
        apcr apcrVar2 = apcr.a;
        apbo apboVar = apcrVar.b;
        if (!apboVar.b) {
            apcrVar.b = apboVar.a();
        }
        apcrVar.b.put(str, apdeVar);
    }

    public final void bb(String str) {
        if (!this.b.isMutable()) {
            u();
        }
        apgq apgqVar = (apgq) this.b;
        apgq apgqVar2 = apgq.a;
        apax apaxVar = apgqVar.h;
        if (!apaxVar.c()) {
            apgqVar.h = apag.mutableCopy(apaxVar);
        }
        apgqVar.h.add(str);
    }

    public final void bc(String str, apie apieVar) {
        str.getClass();
        apieVar.getClass();
        if (!this.b.isMutable()) {
            u();
        }
        apig apigVar = (apig) this.b;
        apig apigVar2 = apig.a;
        apigVar.b().put(str, apieVar);
    }

    public final void bd(String str) {
        if (!this.b.isMutable()) {
            u();
        }
        apie apieVar = (apie) this.b;
        apie apieVar2 = apie.a;
        str.getClass();
        apax apaxVar = apieVar.b;
        if (!apaxVar.c()) {
            apieVar.b = apag.mutableCopy(apaxVar);
        }
        apieVar.b.add(str);
    }

    public final void be(apjy apjyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        apjn apjnVar = (apjn) this.b;
        apjn apjnVar2 = apjn.a;
        apjyVar.getClass();
        apjnVar.a();
        apjnVar.c.add(apjyVar);
    }

    public final void bf(int i) {
        if (!this.b.isMutable()) {
            u();
        }
        aplf aplfVar = (aplf) this.b;
        aplf aplfVar2 = aplf.a;
        apao apaoVar = aplfVar.b;
        if (!apaoVar.c()) {
            aplfVar.b = apag.mutableCopy(apaoVar);
        }
        aplfVar.b.g(i);
    }

    public final void bg(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        qer qerVar = (qer) this.b;
        qdz qdzVar = (qdz) aozyVar.s();
        qer qerVar2 = qer.a;
        qdzVar.getClass();
        apax apaxVar = qerVar.b;
        if (!apaxVar.c()) {
            qerVar.b = apag.mutableCopy(apaxVar);
        }
        qerVar.b.add(qdzVar);
    }

    public final void bh(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        qer qerVar = (qer) this.b;
        qfv qfvVar = (qfv) aozyVar.s();
        qer qerVar2 = qer.a;
        qfvVar.getClass();
        apax apaxVar = qerVar.c;
        if (!apaxVar.c()) {
            qerVar.c = apag.mutableCopy(apaxVar);
        }
        qerVar.c.add(qfvVar);
    }

    public final void bi(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        qfg qfgVar = (qfg) this.b;
        qea qeaVar = (qea) aozyVar.s();
        qfg qfgVar2 = qfg.a;
        qeaVar.getClass();
        apax apaxVar = qfgVar.b;
        if (!apaxVar.c()) {
            qfgVar.b = apag.mutableCopy(apaxVar);
        }
        qfgVar.b.add(qeaVar);
    }

    public final void bj(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        qfg qfgVar = (qfg) this.b;
        qfw qfwVar = (qfw) aozyVar.s();
        qfg qfgVar2 = qfg.a;
        qfwVar.getClass();
        qfgVar.a();
        qfgVar.c.add(qfwVar);
    }

    public final void bk(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        qfo qfoVar = (qfo) this.b;
        qej qejVar = (qej) aozyVar.s();
        apap apapVar = qfo.a;
        qejVar.getClass();
        qfoVar.a();
        qfoVar.j.add(qejVar);
    }

    public final void bl(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        wca wcaVar = (wca) this.b;
        wce wceVar = (wce) aozyVar.s();
        apap apapVar = wca.a;
        wceVar.getClass();
        wcaVar.a();
        wcaVar.g.add(wceVar);
    }

    public final void bm(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        agve agveVar = (agve) this.b;
        agvd agvdVar = (agvd) aozyVar.s();
        agve agveVar2 = agve.a;
        agvdVar.getClass();
        agveVar.a();
        agveVar.b.add(agvdVar);
    }

    public final void bn(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        alco alcoVar = (alco) this.b;
        alcp alcpVar = (alcp) aozyVar.s();
        alco alcoVar2 = alco.a;
        alcpVar.getClass();
        apax apaxVar = alcoVar.b;
        if (!apaxVar.c()) {
            alcoVar.b = apag.mutableCopy(apaxVar);
        }
        alcoVar.b.add(alcpVar);
    }

    public final void bo(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        alcq alcqVar = (alcq) this.b;
        alcr alcrVar = (alcr) aozyVar.s();
        alcq alcqVar2 = alcq.a;
        alcrVar.getClass();
        apax apaxVar = alcqVar.b;
        if (!apaxVar.c()) {
            alcqVar.b = apag.mutableCopy(apaxVar);
        }
        alcqVar.b.add(alcrVar);
    }

    public final void bp(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        alcy alcyVar = (alcy) this.b;
        alcw alcwVar = (alcw) aozyVar.s();
        alcy alcyVar2 = alcy.a;
        alcwVar.getClass();
        apax apaxVar = alcyVar.d;
        if (!apaxVar.c()) {
            alcyVar.d = apag.mutableCopy(apaxVar);
        }
        alcyVar.d.add(alcwVar);
    }

    public final void bq(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        alcy alcyVar = (alcy) this.b;
        alcx alcxVar = (alcx) aozyVar.s();
        alcy alcyVar2 = alcy.a;
        alcxVar.getClass();
        apax apaxVar = alcyVar.e;
        if (!apaxVar.c()) {
            alcyVar.e = apag.mutableCopy(apaxVar);
        }
        alcyVar.e.add(alcxVar);
    }

    public final void br(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        alda aldaVar = (alda) this.b;
        aldc aldcVar = (aldc) aozyVar.s();
        alda aldaVar2 = alda.a;
        aldcVar.getClass();
        apax apaxVar = aldaVar.b;
        if (!apaxVar.c()) {
            aldaVar.b = apag.mutableCopy(apaxVar);
        }
        aldaVar.b.add(aldcVar);
    }

    public final void bs(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        amgw amgwVar = (amgw) this.b;
        amec amecVar = (amec) aozyVar.s();
        amgw amgwVar2 = amgw.a;
        amecVar.getClass();
        amgwVar.a();
        amgwVar.b.add(amecVar);
    }

    public final void bt(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        amgw amgwVar = (amgw) this.b;
        amec amecVar = (amec) aozyVar.s();
        amgw amgwVar2 = amgw.a;
        amecVar.getClass();
        amgwVar.a();
        amgwVar.b.set(0, amecVar);
    }

    public final void bu(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        amng amngVar = (amng) this.b;
        amni amniVar = (amni) aozyVar.s();
        amng amngVar2 = amng.a;
        amniVar.getClass();
        apax apaxVar = amngVar.f;
        if (!apaxVar.c()) {
            amngVar.f = apag.mutableCopy(apaxVar);
        }
        amngVar.f.add(amniVar);
    }

    public final void bv(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        amqz amqzVar = (amqz) this.b;
        amre amreVar = (amre) aozyVar.s();
        amqz amqzVar2 = amqz.a;
        amreVar.getClass();
        apax apaxVar = amqzVar.g;
        if (!apaxVar.c()) {
            amqzVar.g = apag.mutableCopy(apaxVar);
        }
        amqzVar.g.add(amreVar);
    }

    public final void bw(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        angj angjVar = (angj) this.b;
        angh anghVar = (angh) aozyVar.s();
        angj angjVar2 = angj.a;
        anghVar.getClass();
        angjVar.a();
        angjVar.j.add(anghVar);
    }

    public final void bx(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        aouk aoukVar = (aouk) this.b;
        aouj aoujVar = (aouj) aozyVar.s();
        aouk aoukVar2 = aouk.a;
        aoujVar.getClass();
        apax apaxVar = aoukVar.b;
        if (!apaxVar.c()) {
            aoukVar.b = apag.mutableCopy(apaxVar);
        }
        aoukVar.b.add(aoujVar);
    }

    public final void by(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        aplg aplgVar = (aplg) this.b;
        aplg aplgVar2 = aplg.a;
        aplgVar.a();
        aoyj.addAll(iterable, aplgVar.b);
    }

    public final void bz(String str) {
        if (!this.b.isMutable()) {
            u();
        }
        aplg aplgVar = (aplg) this.b;
        aplg aplgVar2 = aplg.a;
        aplgVar.a();
        aplgVar.b.add(str);
    }

    @Override // defpackage.aoyi
    protected final /* synthetic */ aoyi c(aoyj aoyjVar) {
        w((apag) aoyjVar);
        return this;
    }

    public final void ca(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        ashn ashnVar = (ashn) this.b;
        ashn ashnVar2 = ashn.a;
        ashnVar.b();
        aoyj.addAll(iterable, ashnVar.o);
    }

    public final void cb(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        ashn ashnVar = (ashn) this.b;
        ashn ashnVar2 = ashn.a;
        apax apaxVar = ashnVar.r;
        if (!apaxVar.c()) {
            ashnVar.r = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, ashnVar.r);
    }

    public final void cc(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        ashn ashnVar = (ashn) this.b;
        ashn ashnVar2 = ashn.a;
        apax apaxVar = ashnVar.q;
        if (!apaxVar.c()) {
            ashnVar.q = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, ashnVar.q);
    }

    public final void cd(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        ashn ashnVar = (ashn) this.b;
        ashn ashnVar2 = ashn.a;
        ashnVar.c();
        aoyj.addAll(iterable, ashnVar.l);
    }

    public final void ce(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        ashn ashnVar = (ashn) this.b;
        ashn ashnVar2 = ashn.a;
        ashnVar.d();
        aoyj.addAll(iterable, ashnVar.k);
    }

    public final void cf(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        ashn ashnVar = (ashn) this.b;
        ashn ashnVar2 = ashn.a;
        ashnVar.e();
        aoyj.addAll(iterable, ashnVar.h);
    }

    public final void cg(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        ashn ashnVar = (ashn) this.b;
        ashn ashnVar2 = ashn.a;
        ashnVar.f();
        aoyj.addAll(iterable, ashnVar.i);
    }

    public final void ch(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        ashn ashnVar = (ashn) this.b;
        ashn ashnVar2 = ashn.a;
        ashnVar.g();
        aoyj.addAll(iterable, ashnVar.j);
    }

    public final void ci(int i, ashm ashmVar) {
        if (!this.b.isMutable()) {
            u();
        }
        ashn ashnVar = (ashn) this.b;
        ashn ashnVar2 = ashn.a;
        ashmVar.getClass();
        ashnVar.a();
        ashnVar.m.set(i, ashmVar);
    }

    public final void cj(int i, ashm ashmVar) {
        if (!this.b.isMutable()) {
            u();
        }
        ashn ashnVar = (ashn) this.b;
        ashn ashnVar2 = ashn.a;
        ashmVar.getClass();
        ashnVar.b();
        ashnVar.o.set(i, ashmVar);
    }

    public final void ck(int i, ashm ashmVar) {
        if (!this.b.isMutable()) {
            u();
        }
        ashn ashnVar = (ashn) this.b;
        ashn ashnVar2 = ashn.a;
        ashmVar.getClass();
        ashnVar.c();
        ashnVar.l.set(i, ashmVar);
    }

    public final void cl(int i, ashm ashmVar) {
        if (!this.b.isMutable()) {
            u();
        }
        ashn ashnVar = (ashn) this.b;
        ashn ashnVar2 = ashn.a;
        ashmVar.getClass();
        ashnVar.d();
        ashnVar.k.set(i, ashmVar);
    }

    public final void cm(int i, ashm ashmVar) {
        if (!this.b.isMutable()) {
            u();
        }
        ashn ashnVar = (ashn) this.b;
        ashn ashnVar2 = ashn.a;
        ashmVar.getClass();
        ashnVar.e();
        ashnVar.h.set(i, ashmVar);
    }

    public final void cn(int i, ashm ashmVar) {
        if (!this.b.isMutable()) {
            u();
        }
        ashn ashnVar = (ashn) this.b;
        ashn ashnVar2 = ashn.a;
        ashmVar.getClass();
        ashnVar.f();
        ashnVar.i.set(i, ashmVar);
    }

    public final void co(int i, ashm ashmVar) {
        if (!this.b.isMutable()) {
            u();
        }
        ashn ashnVar = (ashn) this.b;
        ashn ashnVar2 = ashn.a;
        ashmVar.getClass();
        ashnVar.g();
        ashnVar.j.set(i, ashmVar);
    }

    public final void cp(aozy aozyVar) {
        if (!this.b.isMutable()) {
            u();
        }
        asis asisVar = (asis) this.b;
        asix asixVar = (asix) aozyVar.s();
        asis asisVar2 = asis.a;
        asixVar.getClass();
        apax apaxVar = asisVar.k;
        if (!apaxVar.c()) {
            asisVar.k = apag.mutableCopy(apaxVar);
        }
        asisVar.k.add(asixVar);
    }

    public final void cq(int i) {
        if (!this.b.isMutable()) {
            u();
        }
        asjp asjpVar = (asjp) this.b;
        asjp asjpVar2 = asjp.a;
        apao apaoVar = asjpVar.c;
        if (!apaoVar.c()) {
            asjpVar.c = apag.mutableCopy(apaoVar);
        }
        asjpVar.c.g(i);
    }

    public final void cr(int i) {
        if (!this.b.isMutable()) {
            u();
        }
        asjp asjpVar = (asjp) this.b;
        asjp asjpVar2 = asjp.a;
        apao apaoVar = asjpVar.b;
        if (!apaoVar.c()) {
            asjpVar.b = apag.mutableCopy(apaoVar);
        }
        asjpVar.b.g(i);
    }

    @Override // defpackage.apbu
    public final /* synthetic */ apbt getDefaultInstanceForType() {
        return this.a;
    }

    @Override // defpackage.apbu
    public final boolean isInitialized() {
        return apag.isInitialized(this.b, false);
    }

    @Override // defpackage.aoyi
    public final /* bridge */ /* synthetic */ aoyi l(byte[] bArr, int i) {
        aozs aozsVar = aozs.a;
        apcc apccVar = apcc.a;
        x(bArr, i, aozs.a);
        return this;
    }

    @Override // defpackage.aoyi
    public final /* bridge */ /* synthetic */ aoyi m(byte[] bArr, int i, aozs aozsVar) {
        x(bArr, i, aozsVar);
        return this;
    }

    @Override // defpackage.aoyi
    /* renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final aozy clone() {
        aozy newBuilderForType = this.a.newBuilderForType();
        newBuilderForType.b = t();
        return newBuilderForType;
    }

    @Override // defpackage.apbs
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final MessageType s() {
        MessageType t = t();
        if (t.isInitialized()) {
            return t;
        }
        throw new apcu();
    }

    @Override // defpackage.apbs
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public MessageType t() {
        if (!this.b.isMutable()) {
            return (MessageType) this.b;
        }
        this.b.makeImmutable();
        return (MessageType) this.b;
    }

    public final apag r() {
        return this.a.newMutableInstance();
    }

    public void u() {
        apag r = r();
        a(r, this.b);
        this.b = r;
    }

    @Override // defpackage.aoyi
    /* renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void n(aozg aozgVar, aozs aozsVar) {
        if (!this.b.isMutable()) {
            u();
        }
        try {
            apcc.a.b(this.b).l(this.b, aozh.p(aozgVar), aozsVar);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public final void w(apag apagVar) {
        if (!this.a.equals(apagVar)) {
            if (!this.b.isMutable()) {
                u();
            }
            a(this.b, apagVar);
        }
    }

    public final void x(byte[] bArr, int i, aozs aozsVar) {
        if (!this.b.isMutable()) {
            u();
        }
        try {
            apcc.a.b(this.b).i(this.b, bArr, 0, i, new aoyp(aozsVar));
        } catch (apba e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Deprecated
    public final void y(int i, mgg mggVar) {
        mggVar.getClass();
        if (!this.b.isMutable()) {
            u();
        }
        mga mgaVar = (mga) this.b;
        mga mgaVar2 = mga.a;
        apbo apboVar = mgaVar.b;
        if (!apboVar.b) {
            mgaVar.b = apboVar.a();
        }
        mgaVar.b.put(Integer.valueOf(i), mggVar);
    }

    public final void z(pua puaVar) {
        if (!this.b.isMutable()) {
            u();
        }
        ptz ptzVar = (ptz) this.b;
        ptz ptzVar2 = ptz.a;
        puaVar.getClass();
        apax apaxVar = ptzVar.b;
        if (!apaxVar.c()) {
            ptzVar.b = apag.mutableCopy(apaxVar);
        }
        ptzVar.b.add(puaVar);
    }

    public aozy(MessageType messagetype) {
        this.a = messagetype;
        if (!messagetype.isMutable()) {
            this.b = r();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public aozy(byte[][][] bArr) {
        this(apdx.a);
    }

    public aozy(boolean[][] zArr) {
        this(apee.a);
    }

    public aozy(short[][][] sArr) {
        this(aplg.a);
    }

    public aozy(short[][] sArr) {
        this(apog.a);
    }

    public aozy(boolean[][][] zArr) {
        this(apqf.a);
    }

    public aozy(byte[] bArr, byte[] bArr2) {
        this(apqu.a);
    }

    public aozy(float[] fArr, byte[] bArr) {
        this(apvw.a);
    }

    public aozy(int[] iArr, byte[] bArr) {
        this(apwq.a);
    }

    public aozy(char[][] cArr, byte[] bArr) {
        this(apws.a);
    }

    public aozy(short[] sArr, byte[] bArr) {
        this(aqby.a);
    }

    public aozy(byte[] bArr) {
        this(aqcz.a);
    }

    public aozy(char[] cArr) {
        this(aqdv.a);
    }

    public aozy(boolean[] zArr) {
        this(aqep.a);
    }

    public aozy(int[] iArr) {
        this(aqfh.a);
    }

    public aozy(float[] fArr) {
        this(aqfj.a);
    }

    public aozy(short[] sArr) {
        this(aqfk.b);
    }

    public aozy(byte[][] bArr) {
        this(aqfp.a);
    }

    public aozy(char[][] cArr) {
        this(aqgw.a);
    }

    public aozy(char[][][] cArr) {
        this(aqhz.a);
    }

    public aozy(float[][] fArr) {
        this(asgv.a);
    }

    public aozy(int[][][] iArr) {
        this(ashi.a);
    }

    public aozy(int[][] iArr) {
        this(ashn.a);
    }

    public aozy(float[][][] fArr) {
        this(asie.a);
    }

    public aozy(char[] cArr, byte[] bArr) {
        this(asii.a);
    }

    public aozy(byte[][] bArr, byte[] bArr2) {
        this(asis.a);
    }

    public aozy(boolean[] zArr, byte[] bArr) {
        this(asjo.a);
    }

    public aozy(short[][] sArr, byte[] bArr) {
        this(asjp.a);
    }
}
