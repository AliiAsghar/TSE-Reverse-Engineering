package defpackage;

import io.grpc.Status;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vqv implements algk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ vqv(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, arlq] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        int i = 15;
        int i2 = 18;
        int i3 = 6;
        int i4 = 8;
        int i5 = 19;
        int i6 = 5;
        byte[] bArr = null;
        boolean z = true;
        switch (this.c) {
            case 0:
                qeg qegVar = ((qgc) obj).c;
                if (qegVar == null) {
                    qegVar = qeg.a;
                }
                qef b = qef.b(qegVar.c);
                if (b == null) {
                    b = qef.UNKNOWN_STATUS;
                }
                if (!qef.OK.equals(b) && !qef.PENDING.equals(b)) {
                    Object obj2 = this.b;
                    ((mbl) ((vqw) this.a).f.b()).g("Bugle.Rcs.Chat.Message.Revoke.Send.Failed.Counts", 0L);
                    xzb.o("BugleAction", "Failed to revoke rcsMessageId:%s status:%s", ((rvf) obj2).f(), b.name());
                    return false;
                }
                return true;
            case 1:
                alog n = alog.n((List) Collection.EL.stream(((vmv) this.a).d.c((vlm) this.b)).filter(new uzr(i5)).map(new vil(12)).collect(Collectors.toCollection(new uzg(13))));
                aozy createBuilder = vmx.a.createBuilder();
                Map map = (Map) Collection.EL.stream(n).filter(new vmc(i4)).map(new vmd(4)).collect(Collectors.toMap(new vmd(i6), new vmd(i3), new mcb(11), new uzg(18)));
                aozy createBuilder2 = vmq.a.createBuilder();
                createBuilder2.U(map);
                vmq vmqVar = (vmq) createBuilder2.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                vmx vmxVar = (vmx) createBuilder.b;
                vmqVar.getClass();
                vmxVar.c = vmqVar;
                vmxVar.b |= 1;
                return (vmx) createBuilder.s();
            case 2:
                ((vrj) this.b).e((vrk) this.a, ((Boolean) obj).booleanValue());
                return null;
            case 3:
                ((vrj) this.b).h((vrk) this.a, ((Boolean) obj).booleanValue());
                return null;
            case 4:
                smr smrVar = (smr) obj;
                sng sngVar = new sng();
                sngVar.aj("updateGroupMetadata");
                Object obj3 = this.a;
                sngVar.X(new vte(obj3, i));
                sngVar.v(0);
                sngVar.s(qpd.NONE);
                sngVar.a().e();
                vwo vwoVar = (vwo) this.b;
                vwoVar.h.d(((xwa) obj3).a);
                if (smrVar != null) {
                    if (smrVar.l() == 4) {
                        vwoVar.i.c("Bugle.Rcs.Groups.Recovery.ConversationRecoveredFromTelephony.Enabled.Counts");
                    } else if (smrVar.l() == 7) {
                        vwoVar.i.c("Bugle.Rcs.Groups.Recovery.ConversationDowngradedFromChatApiToVanillaRcs.Enabled.Counts");
                    }
                }
                return null;
            case 5:
                IllegalArgumentException illegalArgumentException = (IllegalArgumentException) obj;
                ((alwl) ((alwl) ((alwl) vyu.a.i()).g(illegalArgumentException)).h("com/google/android/apps/messaging/shared/rcs/messaging/MessagingEngineNotificationServerImpl", "processRequestAsync", 280, "MessagingEngineNotificationServerImpl.java")).t("[%s] Ignoring invalid data", this.a);
                this.b.b(vyu.b(illegalArgumentException));
                return Status.Code.INVALID_ARGUMENT;
            case 6:
                Throwable th = (Throwable) obj;
                ((alwl) ((alwl) ((alwl) vyu.a.i()).g(th)).h("com/google/android/apps/messaging/shared/rcs/messaging/MessagingEngineNotificationServerImpl", "processRequestAsync", 288, "MessagingEngineNotificationServerImpl.java")).t("[%s] Error while processing request", this.a);
                this.b.b(th);
                return Status.Code.UNKNOWN;
            case 7:
                return ((vyy) this.b).b.i(obj, (aozb) this.a);
            case 8:
                upm upmVar = (upm) obj;
                if (((Boolean) ((utz) vzh.f.get()).e()).booleanValue()) {
                    ((wba) this.a).g.f((rve) this.b, 5, 20);
                }
                return upmVar;
            case 9:
                upm upmVar2 = (upm) obj;
                if (upmVar2.a) {
                    wbd wbdVar = (wbd) this.a;
                    if (wbdVar.d) {
                        ((wba) this.b).j.c(wbdVar, new uta(null, "perform_catch_up_work_item_dedup_tag", null, null, null, null));
                    }
                }
                return upmVar2;
            case 10:
                return ((wej) this.b).b.g(this.a);
            case 11:
                xyo e = wej.a.e();
                e.H("Call to Messaging service failed");
                wej wejVar = (wej) this.b;
                e.z("methodName", wejVar.b.i());
                wei weiVar = wejVar.b;
                Object obj4 = this.a;
                e.H(weiVar.h(obj4));
                e.r((Throwable) obj);
                return wejVar.b.j(obj4);
            case 12:
                if (((Boolean) ((utz) vzh.d.get()).e()).booleanValue()) {
                    Object obj5 = this.b;
                    Object obj6 = this.a;
                    aozy createBuilder3 = qgr.a.createBuilder();
                    wdp wdpVar = (wdp) obj5;
                    wdu wduVar = wdpVar.d;
                    if (wduVar == null) {
                        wduVar = wdu.a;
                    }
                    String str = wduVar.c;
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    qgr qgrVar = (qgr) createBuilder3.b;
                    str.getClass();
                    qgrVar.b |= 1;
                    qgrVar.c = str;
                    qgr qgrVar2 = (qgr) createBuilder3.s();
                    wda wdaVar = wdpVar.f;
                    if (wdaVar == null) {
                        wdaVar = wda.a;
                    }
                    ((vzh) ((wpp) obj6).a).a(qgrVar2, rve.a(wdaVar.c));
                }
                return wdq.a;
            case 13:
                ((Optional) obj).ifPresentOrElse(new vxb(this.a, this.b, i6), new eyg(i));
                return null;
            case 14:
                ((Optional) obj).ifPresentOrElse(new vxb(this.b, this.a, i3, bArr), new eyg(16));
                return null;
            case 15:
                alog alogVar = (alog) obj;
                xze xzeVar = wft.a;
                return new wfs(wft.b(alogVar, ((Integer) this.a).intValue()), wft.a(alogVar, new rhq(this.b, alogVar, i4)));
            case 16:
                wgd wgdVar = (wgd) this.b;
                alog alogVar2 = (alog) obj;
                if (wgdVar.g.q("is_manual_msisdn_shown_or_dismissed", false) && wgd.a(alogVar2) == 0) {
                    wgd.b.l("Not prompting PhoneNumberInputUI: User has already seen the legacy UI.");
                } else if (alogVar2.isEmpty()) {
                    wgd.b.l(String.format("shouldPromptPhoneNumberInputUI: Returning defaultValue of %b, because there are no PhoneNumberInputUIEvents", false));
                } else {
                    Optional g = wgd.g(alogVar2);
                    Optional f = wgd.f(alogVar2, new vmc(i2));
                    if (f.isEmpty()) {
                        wgd.b.l("Not prompting PhoneNumberInputUI: PE has never requested it.");
                    } else if (g.isPresent() && ((Long) g.get()).longValue() > ((Long) f.get()).longValue()) {
                        wgd.b.l("Not prompting PhoneNumberInputUI: Already prompted for most recent request from PE.");
                    } else if (g.isPresent() && wgdVar.c.f().toEpochMilli() - ((Long) g.get()).longValue() <= Duration.ofSeconds(((Long) aczv.s().a.M.a()).longValue()).toMillis()) {
                        wgd.b.l("Not prompting PhoneNumberInputUI: Not enough duration since last prompt.");
                    } else if (wgd.b(alogVar2, new vmc(i5)) >= ((vau) wgdVar.j.b()).c((String) this.a).y) {
                        wgd.b.l("Not prompting PhoneNumberInputUI: Max number of remprompts.");
                    } else {
                        if ("phone_number_ui_variant_promo_banner".equals(aczv.u()) && aczv.c() > 0) {
                            wfx wfxVar = wfx.PROMO_BANNER;
                            int co = albo.co(wgd.b(alogVar2, new rhq(wfxVar, alogVar2, 9)));
                            wgd.b.l(String.format("countImpressions: Counted %s impressions of %s UiVariant.", String.valueOf(co), wfxVar));
                            if (co >= aczv.c()) {
                                wgd.b.l("Not prompting PhoneNumberInputUI: Max number of banner impressions.");
                            }
                        }
                        wgd.b.l("Prompting PhoneNumberInputUI");
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 17:
                xze xzeVar2 = whj.a;
                aozy builder = ((whc) obj).toBuilder();
                Object obj7 = this.b;
                obj7.getClass();
                Object obj8 = this.a;
                obj8.getClass();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                whc whcVar = (whc) builder.b;
                apbo apboVar = whcVar.r;
                if (!apboVar.b) {
                    whcVar.r = apboVar.a();
                }
                whcVar.r.put(obj7, obj8);
                return (whc) builder.s();
            case 18:
                xze xzeVar3 = whj.a;
                aozy builder2 = ((whc) obj).toBuilder();
                Object obj9 = this.a;
                obj9.getClass();
                Object obj10 = this.b;
                obj10.getClass();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                whc whcVar2 = (whc) builder2.b;
                apbo apboVar2 = whcVar2.l;
                if (!apboVar2.b) {
                    whcVar2.l = apboVar2.a();
                }
                whcVar2.l.put(obj9, obj10);
                return (whc) builder2.s();
            case 19:
                xze xzeVar4 = whj.a;
                aozy builder3 = ((whc) obj).toBuilder();
                String whiVar = ((whi) this.a).toString();
                Object obj11 = this.b;
                obj11.getClass();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                whc whcVar3 = (whc) builder3.b;
                apbo apboVar3 = whcVar3.i;
                if (!apboVar3.b) {
                    whcVar3.i = apboVar3.a();
                }
                whcVar3.i.put(whiVar, obj11);
                return (whc) builder3.s();
            default:
                xze xzeVar5 = whj.a;
                aozy builder4 = ((whc) obj).toBuilder();
                Object obj12 = this.a;
                obj12.getClass();
                Object obj13 = this.b;
                obj13.getClass();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                whc whcVar4 = (whc) builder4.b;
                apbo apboVar4 = whcVar4.s;
                if (!apboVar4.b) {
                    whcVar4.s = apboVar4.a();
                }
                new apaw(whcVar4.s, whc.u).put(obj12, obj13);
                return (whc) builder4.s();
        }
    }

    public /* synthetic */ vqv(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
