package defpackage;

import android.app.Notification;
import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vco {
    public final Object a;
    public final Object b;

    public vco(amwt amwtVar, amwt amwtVar2) {
        this.b = new adjl(amwtVar);
        this.a = new adjl(amwtVar2);
    }

    public static amfq m() {
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.RCS_PROVISIONING;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        return amfqVar;
    }

    public static uta t(vlm vlmVar) {
        return new uta(vlmVar.name(), null, null, null, null, null);
    }

    public final aqar a() {
        return (aqar) vdi.b(aqas.a((aqrs) this.a), (aqut) this.b, false);
    }

    public final arlb b(vcq vcqVar, aqut aqutVar) {
        String e;
        aqut d = ((vcv) this.a).d();
        if (aqutVar != null) {
            d.f(aqutVar);
        }
        Object obj = this.b;
        if (vcqVar != null) {
            e = vcqVar.b;
        } else {
            e = ((vcv) this.a).e();
            e.getClass();
        }
        int i = vdi.b;
        return vdi.a(((arlb) obj).i(new arll(d, 0)).j(aojz.a, e), false);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, wul] */
    public final akul c() {
        ((ykw) this.a).n("tachyon_registration_token");
        return this.b.j(new vdx(8)).h(new vdx(9), andi.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wul] */
    public final akul d() {
        return this.b.h().h(new vdx(10), andi.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, wul] */
    public final akul e(long j) {
        ((ykw) this.a).k("tachyon_registration_expiration", j);
        return this.b.j(new mdq(j, 9)).h(new vdx(0), andi.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    public final void f(apmm apmmVar) {
        if (((Boolean) aczv.s().a.X.a()).booleanValue()) {
            akrc b = ((aksr) this.b).b("BugleMobileConfigurationLogger#logMobileConfigurationEvent");
            try {
                maq maqVar = (maq) this.a.b();
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.BUGLE_MOBILE_CONFIGURATION_CLIENT_EVENT;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b |= 1;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                apmmVar.getClass();
                amfrVar2.bg = apmmVar;
                amfrVar2.g |= 4;
                maqVar.j(amfqVar);
                b.close();
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul g() {
        return this.b.h().h(new uyi(7), this.a);
    }

    public final Object h(arpe arpeVar) {
        if (((lpg) this.b).t()) {
            return Boolean.valueOf(((lpg) this.b).v());
        }
        return ((uac) this.a).g(arpeVar);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, wul] */
    public final boolean i() {
        if (((lpg) this.b).t()) {
            return ((lpg) this.b).v();
        }
        uxo uxoVar = (uxo) ((uac) this.a).b.l();
        if ((uxoVar.b & 1) != 0) {
            uxk uxkVar = uxoVar.c;
            if (uxkVar == null) {
                uxkVar = uxk.a;
            }
            uxkVar.getClass();
            return uac.h(uxkVar);
        }
        return false;
    }

    public final void j(amst amstVar) {
        mar a = ((mbb) this.b).a();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfqVar.getClass();
        alzz.n(amfp.MMS_GROUP_UPGRADE_EVENT, amfqVar);
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.bD = amstVar;
        amfrVar.h |= 131072;
        a.b((amfq) alzz.h(amfqVar).toBuilder(), mbt.LOG_SPEC_MMS_GROUP_UPGRADE_EVENTS);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final void k(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        aozy createBuilder = amst.b.createBuilder();
        createBuilder.getClass();
        aktp.bm(((lzz) this.a.b()).a(conversationIdType), createBuilder);
        aktp.bn(3, createBuilder);
        aktp.bp(3, createBuilder);
        aktp.bo(3, createBuilder);
        j(aktp.bl(createBuilder));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final void l(ConversationIdType conversationIdType, int i, int i2, int i3) {
        aozy createBuilder = amst.b.createBuilder();
        createBuilder.getClass();
        aktp.bm(((lzz) this.a.b()).a(conversationIdType), createBuilder);
        aktp.bn(8, createBuilder);
        aktp.br(createBuilder);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amst amstVar = (amst) createBuilder.b;
        amstVar.m = i - 1;
        amstVar.c |= 256;
        aozy createBuilder2 = amsr.a.createBuilder();
        createBuilder2.getClass();
        int cG = yyb.cG(i2);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amsr amsrVar = (amsr) createBuilder2.b;
        amsrVar.c = cG - 1;
        amsrVar.b |= 1;
        int cG2 = yyb.cG(i2 - i3);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amsr amsrVar2 = (amsr) createBuilder2.b;
        amsrVar2.d = cG2 - 1;
        amsrVar2.b |= 4;
        apag s = createBuilder2.s();
        s.getClass();
        amsr amsrVar3 = (amsr) s;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amst amstVar2 = (amst) createBuilder.b;
        amstVar2.l = amsrVar3;
        amstVar2.c |= 128;
        j(aktp.bl(createBuilder));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void n(amjf amjfVar) {
        maq maqVar = (maq) this.a.b();
        amfq m = m();
        if (!m.b.isMutable()) {
            m.u();
        }
        amfr amfrVar = (amfr) m.b;
        amfr amfrVar2 = amfr.a;
        amfrVar.au = amjfVar;
        amfrVar.e |= 8;
        maqVar.j(m);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void o(amww amwwVar) {
        maq maqVar = (maq) this.a.b();
        amfq m = m();
        if (!m.b.isMutable()) {
            m.u();
        }
        amfr amfrVar = (amfr) m.b;
        amfr amfrVar2 = amfr.a;
        amfrVar.ar = amwwVar.aa;
        amfrVar.e |= 1;
        maqVar.j(m);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void p(amxa amxaVar) {
        maq maqVar = (maq) this.a.b();
        amfq m = m();
        if (!m.b.isMutable()) {
            m.u();
        }
        amfr amfrVar = (amfr) m.b;
        amfr amfrVar2 = amfr.a;
        amxaVar.getClass();
        amfrVar.as = amxaVar;
        amfrVar.e |= 2;
        maqVar.j(m);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void q(amxe amxeVar) {
        maq maqVar = (maq) this.a.b();
        amfq m = m();
        if (!m.b.isMutable()) {
            m.u();
        }
        amfr amfrVar = (amfr) m.b;
        amfr amfrVar2 = amfr.a;
        amxeVar.getClass();
        amfrVar.aY = amxeVar;
        amfrVar.f |= 262144;
        maqVar.j(m);
    }

    public final void r(BugleConversationId bugleConversationId) {
        aozy createBuilder = vnd.a.createBuilder();
        aozb w = aozb.w(bugleConversationId.c());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        Object obj = this.a;
        Object obj2 = this.b;
        vnd vndVar = (vnd) createBuilder.b;
        vndVar.b |= 1;
        vndVar.c = w;
        ((vco) obj2).v((vkh) obj, createBuilder.s(), false);
    }

    public final void s() {
        ((vco) this.b).v((vkh) this.a, null, false);
    }

    public final void u(vlm vlmVar, String str) {
        aozy createBuilder = vkq.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        vkq vkqVar = (vkq) apagVar;
        vkqVar.c = vlmVar.i;
        vkqVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        Object obj = this.b;
        vkq vkqVar2 = (vkq) createBuilder.b;
        vkqVar2.b |= 2;
        vkqVar2.d = str;
        ((vjs) obj).w((vkq) createBuilder.s(), t(vlmVar));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [armf, java.lang.Object] */
    public final void v(vkh vkhVar, Object obj, boolean z) {
        aozy builder = vkhVar.c().a(obj).toBuilder();
        vlm d = vkhVar.d();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        apag apagVar = builder.b;
        vla vlaVar = (vla) apagVar;
        vlaVar.e = d.i;
        vlaVar.b |= 1;
        if (!apagVar.isMutable()) {
            builder.u();
        }
        Object obj2 = this.a;
        vla vlaVar2 = (vla) builder.b;
        vlaVar2.b |= 2;
        vlaVar2.f = z;
        ((uof) ((vjs) obj2).a.b()).b(upk.b("create_notification", (vla) builder.s(), t(vkhVar.d())));
    }

    public final Notification w() {
        String id;
        id = ((vkt) this.b).f().getId();
        dyu dyuVar = new dyu((Context) this.a, id);
        String string = ((Context) this.a).getString(R.string.notification2o_foreground_service_notification_generic_text);
        dyuVar.h(string);
        dyuVar.v(string);
        dyo dyoVar = new dyo(dyuVar);
        dyoVar.d(string);
        dyuVar.t(dyoVar);
        dyuVar.C = ((Context) this.a).getColor(R.color.primary_brand_icon_color);
        dyuVar.q(R.drawable.quantum_gm_ic_sms_white_24);
        return dyuVar.a();
    }

    public vco(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public vco(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public vco(Object obj, Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public vco(lpg lpgVar, uac uacVar) {
        lpgVar.getClass();
        uacVar.getClass();
        this.b = lpgVar;
        this.a = uacVar;
    }

    public vco(mbb mbbVar, armf armfVar) {
        mbbVar.getClass();
        armfVar.getClass();
        this.b = mbbVar;
        this.a = armfVar;
    }

    public vco(vco vcoVar, vmz vmzVar) {
        vcoVar.getClass();
        this.b = vcoVar;
        this.a = vmzVar;
    }

    public vco(vcv vcvVar, arlb arlbVar) {
        vcvVar.getClass();
        this.a = vcvVar;
        this.b = arlbVar;
    }

    public vco(aksr aksrVar, armf armfVar) {
        aksrVar.getClass();
        armfVar.getClass();
        this.b = aksrVar;
        this.a = armfVar;
    }

    public vco(vco vcoVar, arpi arpiVar) {
        arpiVar.getClass();
        this.b = vcoVar;
        this.a = arpiVar;
    }

    public vco(vco vcoVar, vnh vnhVar) {
        vcoVar.getClass();
        this.b = vcoVar;
        this.a = vnhVar;
    }

    public vco(Context context, xnv xnvVar) {
        context.getClass();
        xnvVar.getClass();
        this.b = context;
        this.a = xnvVar;
    }

    public vco(znj znjVar, ykw ykwVar, mbl mblVar, anen anenVar) {
        this.a = ykwVar;
        aiwl a = wus.a();
        a.i(wuk.TACHYON_ANONYMOUS);
        a.k(vdv.a);
        a.j(new vdz(ykwVar, anenVar, mblVar, 1));
        a.h(new uzg(4));
        this.b = znjVar.ab(a.f());
    }

    public vco(armf armfVar, adae adaeVar) {
        armfVar.getClass();
        adaeVar.getClass();
        this.a = armfVar;
        this.b = adaeVar;
    }

    public vco(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public vco(armf armfVar, armf armfVar2, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }
}
