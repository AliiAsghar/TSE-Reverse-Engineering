package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.app.UncaughtExceptionReceiver;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ikd implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ikd(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r0v119, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v126, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v137, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, anen] */
    /* JADX WARN: Type inference failed for: r3v25, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v71, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v48, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        akul e;
        akul a;
        Optional map;
        akul c;
        akul i;
        int i2 = 5;
        int i3 = 4;
        int i4 = 15;
        int i5 = 2;
        boolean z = true;
        boolean z2 = true;
        byte[] bArr = null;
        int i6 = 0;
        Boolean bool = false;
        switch (this.c) {
            case 0:
                boolean f = ((psv) obj).f();
                Object obj2 = this.a;
                if (!f) {
                    e = aktp.ag(bool);
                } else {
                    ikf ikfVar = (ikf) obj2;
                    e = ikfVar.i.a(ikfVar.j).i(new ikd(obj2, this.b, i5), ikfVar.c).e(psx.class, new ezr(i4), ikfVar.c);
                }
                return e.i(new ici(obj2, 10), ((ikf) obj2).b);
            case 1:
                Object obj3 = this.b;
                igw igwVar = (igw) this.a;
                Integer num = (Integer) obj;
                if (igwVar.f) {
                    uyp uypVar = (uyp) ((Optional) ((apxx) ((BlockAndReportSpamCallbacks) obj3).c).a).get();
                    igwVar.k.getClass();
                    a = uypVar.b();
                } else {
                    uyp uypVar2 = (uyp) ((Optional) ((apxx) ((BlockAndReportSpamCallbacks) obj3).c).a).get();
                    igwVar.k.getClass();
                    a = uypVar2.a();
                }
                return aktp.ap(a).h(new gvk(num, i2), ((BlockAndReportSpamCallbacks) obj3).i);
            case 2:
                if (!((yxw) obj).equals(yxw.LATCHED)) {
                    return aktp.ag(bool);
                }
                ?? r0 = this.b;
                Object obj4 = this.a;
                ikf.a.o("Querying online status to see if xMS latched conversation should be unlatched.");
                ikf ikfVar2 = (ikf) obj4;
                akul c2 = ikfVar2.g.c(r0);
                psy psyVar = psy.ONLINE;
                psyVar.getClass();
                return c2.h(new icj(psyVar, i4), ikfVar2.c);
            case 3:
                Optional optional = (Optional) obj;
                if (optional.isPresent() && ((psv) optional.get()).f()) {
                    return aktp.ag((psv) optional.get());
                }
                return ((ikf) this.a).g.b(this.b);
            case 4:
                Object obj5 = this.a;
                Object obj6 = this.b;
                Optional optional2 = (Optional) obj;
                akrh e2 = aktp.e("DraftDataService#extractRepliedToData");
                try {
                    ((alwl) imk.a.m().h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "extractRepliedToData", 376, "DraftDataService.java")).q("Executing extractRepliedToData");
                    akul i7 = ((akul) optional2.map(new ijs(obj5, i4)).orElse(aktp.ag(Optional.empty()))).i(new ikd(obj5, obj6, i2), ((imk) obj5).f);
                    e2.b(i7);
                    e2.close();
                    return i7;
                } finally {
                }
            case 5:
                Optional optional3 = (Optional) obj;
                if (optional3.isPresent()) {
                    return aktp.ag(optional3);
                }
                ?? r02 = this.b;
                Object obj7 = this.a;
                if (r02 == 0) {
                    map = Optional.empty();
                } else if (r02.u() == null) {
                    map = Optional.empty();
                } else {
                    map = ((imk) obj7).k.map(new idc(18));
                }
                return ((imk) obj7).b(map);
            case 6:
                ArrayList f2 = ((rsa) obj).f();
                Object obj8 = this.b;
                Object obj9 = this.a;
                return ((tby) obj9).l.submit(akto.k(new hbd(obj9, obj8, f2, i3)));
            case 7:
                akul s = ((agoz) this.b).s();
                Object obj10 = this.a;
                return s.h(new ijq(obj10, (alog) obj, 7), ((tby) obj10).d);
            case 8:
                return ((uof) ((vyv) ((ifs) this.a).e).a.b()).b(upk.b("remove_members_from_rcs_conversation", (vwz) obj, new uta(((ConversationIdType) this.b).a(), null, null, null, null, null)));
            case 9:
                Object obj11 = this.a;
                anew anewVar = new anew(((klj) obj11).e);
                alob alobVar = new alob();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    alobVar.h(aktp.aj(new imi(obj11, (apku) it.next(), i5), anewVar));
                }
                return aktp.ao(alobVar.g()).h(new kli(i6), andi.a);
            case 10:
                if (!((Boolean) obj).booleanValue()) {
                    kpa.a.q("Skip Phone bind because the MSISDN is not registered for Tachyon");
                    return aktp.ag(null);
                }
                Object obj12 = this.b;
                Object obj13 = this.a;
                kpa.a.o("Bind to Tachyon for phone on foregrounding");
                return ((vhi) ((kpa) obj13).c.b()).e((String) obj12);
            case 11:
                Object obj14 = this.a;
                lsr lsrVar = (lsr) obj14;
                vrn vrnVar = (vrn) ((xyt) lsrVar.d.b()).a();
                lss lssVar = (lss) this.b;
                vrnVar.p(new adiw(lssVar.b), vrk.SINGLE_REGISTRATION_PROVISIONING_EVENT);
                advr.k("[SR]: Triggered RcsAvailability update.", new Object[0]);
                adnk adnkVar = (adnk) lsrVar.c.b();
                String str = lssVar.b;
                ((admu) lsrVar.b.b()).s(str, adnkVar.i(str));
                advr.k("[SR]: Notified Provisioning API about configuration change.", new Object[0]);
                if (!lssVar.d) {
                    return aktp.ag(null);
                }
                advr.k("[SR]: Triggering setupVendorIms in RCS process with %d ms delay.", lsr.a.e());
                return akul.g(lsrVar.f.schedule(new kva(obj14, 9), ((Integer) lsr.a.e()).intValue(), TimeUnit.MILLISECONDS));
            case 12:
                if (!((Instant) obj).equals(aotl.l(apct.a))) {
                    return aktp.ag(bool);
                }
                Object obj15 = this.b;
                mdt mdtVar = (mdt) this.a;
                return akul.g(mdtVar.c.b(akto.a(new itk(obj15, 17)), mdtVar.b)).h(new mdr(true ? 1 : 0), mdtVar.a);
            case 13:
                if (!((Instant) obj).equals(Instant.EPOCH)) {
                    return aktp.ag(bool);
                }
                Object obj16 = this.b;
                mdt mdtVar2 = (mdt) this.a;
                return akul.g(mdtVar2.c.b(akto.a(new mds(obj16, i6)), mdtVar2.b)).h(new mdr(8), mdtVar2.a);
            case 14:
                if (((Boolean) obj).booleanValue()) {
                    ?? r03 = this.a;
                    Object obj17 = this.b;
                    alwl alwlVar = (alwl) mlv.a.g();
                    alwlVar.X(ydl.q, r03);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatch", 207, "BugleConversationUnlatcher.java")).q("Unlatcher: Unlatching conversation. Recipient is ONLINE.");
                    return ((mlu) ((mlv) obj17).c.b()).B(r03, amjj.SEND_MODE_AUTO).h(new mmq(obj17, r03, true ? 1 : 0, bArr), andi.a);
                }
                return aktp.ag(null);
            case 15:
                alog alogVar = (alog) obj;
                if (alogVar.size() != 1) {
                    z = false;
                }
                albo.T(z);
                ResolvedRecipient resolvedRecipient = (ResolvedRecipient) alogVar.get(0);
                return resolvedRecipient.x(2).b().i(new mhv(this.b, this.a, resolvedRecipient, 3, (byte[]) null), andi.a);
            case 16:
                String str2 = (String) obj;
                nej nejVar = (nej) ((mui) this.a).e.b();
                Object obj18 = this.b;
                obj18.getClass();
                str2.getClass();
                ((rzc) nejVar.c.b()).b((MessageIdType) obj18);
                c = qjh.c(nejVar.a, arpj.a, arwf.a, new naw(nejVar, str2, (arpe) null, 0));
                return c;
            case 17:
                miz mizVar = (miz) obj;
                Object obj19 = this.b;
                ?? r3 = this.a;
                if (mizVar != null) {
                    mui muiVar = (mui) obj19;
                    if (((Optional) ((apxx) muiVar.n).a).isPresent()) {
                        mym e3 = mizVar.e();
                        if (e3 instanceof mxf) {
                            myz fl = ((mxf) e3).fl();
                            if (fl instanceof myz) {
                                if (!fl.g || fl.b) {
                                    z2 = false;
                                }
                                bool = Boolean.valueOf(z2);
                            }
                        }
                        if (bool.booleanValue()) {
                            ulg ulgVar = (ulg) ((Optional) ((apxx) muiVar.n).a).get();
                            ConversationIdType conversationIdType = muiVar.j.a;
                            mui.B(r3);
                            mui.F(r3);
                            ulgVar.a();
                            return aktp.ag(null);
                        }
                    }
                }
                if (mizVar != null && mizVar.c().d() == 2) {
                    ((rja) ((lru) ((mui) obj19).k.b()).b.b()).a(mui.B(r3), null);
                    return aktp.ag(null);
                }
                return akul.g(((riz) ((lru) ((mui) obj19).k.b()).a.b()).b(mui.B(r3)).t());
            case 18:
                RuntimeException runtimeException = (RuntimeException) obj;
                Object obj20 = this.b;
                if (obj20 instanceof CancellationException) {
                    return aktp.af((Throwable) obj20);
                }
                Object obj21 = this.a;
                alvw i8 = UncaughtExceptionReceiver.c.i();
                i8.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) i8).g(runtimeException)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 140, "UncaughtExceptionReceiver.java")).t("UncaughtExceptionReceiver: Exception while processing %s in uncaught exception handler. Processing that instead.", obj20);
                return ((UncaughtExceptionReceiver) obj21).e.b(runtimeException);
            case 19:
                alog alogVar2 = (alog) obj;
                alpt alptVar = (alpt) Collection.EL.stream(alogVar2).map(new prj(i6)).collect(alls.b);
                int size = alogVar2.size();
                ?? r9 = this.b;
                Object obj22 = this.a;
                if (size > 1) {
                    alvw i9 = prk.b.i();
                    i9.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i9).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "checkIfBusinessInfoDownloadIsNeededForShortCode", 246, "RbmBusinessInfoDownloadHelper.java")).D("Many bots for short code %s: %s", yyb.bh(r9), alptVar);
                } else if (alogVar2.isEmpty()) {
                    alvw g = prk.b.g();
                    g.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "checkIfBusinessInfoDownloadIsNeededForShortCode", 250, "RbmBusinessInfoDownloadHelper.java")).t("No bots for short code: %s", yyb.bh(r9));
                } else {
                    tdx tdxVar = (tdx) Collection.EL.stream(alogVar2).findFirst().get();
                    String k = tdxVar.k();
                    long h = tdxVar.h();
                    if (h < ((prk) obj22).n.f().toEpochMilli()) {
                        alvw g2 = prk.b.g();
                        g2.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "checkIfBusinessInfoDownloadIsNeededForShortCode", 257, "RbmBusinessInfoDownloadHelper.java")).C("Bot %s expired: %s", k, h);
                    } else {
                        alvw g3 = prk.b.g();
                        g3.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "checkIfBusinessInfoDownloadIsNeededForShortCode", 260, "RbmBusinessInfoDownloadHelper.java")).J("Bot %s (code: %s) is not expired: %s", k, yyb.bh(r9), Long.valueOf(h));
                        return aktp.ag(upm.b());
                    }
                }
                Optional findFirst = Collection.EL.stream(alogVar2).findFirst();
                alvw g4 = prk.b.g();
                g4.X(alwp.a, "Bugle");
                ((alvg) ((alvg) g4).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "retrieveAndStoreBusinessInfoByShortCode", 266, "RbmBusinessInfoDownloadHelper.java")).t("Downloading bot by short code: %s", yyb.bh(r9));
                String str3 = (String) r9;
                prl prlVar = new prl("", 4, null, "tel:".concat(String.valueOf(prb.a(str3))));
                prk prkVar = (prk) obj22;
                prkVar.p.b("Bugle.Rbm.ChatbotDirectory.BotInfoDownloadLatency");
                prq prqVar = prkVar.f;
                String a2 = prb.a(str3);
                if (TextUtils.isEmpty(a2)) {
                    i = aktp.af(new prr("Invalid Short Code: ".concat(String.valueOf(a2)), 2));
                } else {
                    i = aktp.ai(new mig(a2, 12), prqVar.i).i(new pri(prqVar, a2, 3), prqVar.i);
                }
                return prkVar.e(i, prlVar, findFirst);
            default:
                prk.a.r("Download failed for a business info media", (xpt) obj);
                return ((prk) this.a).f(new prr("Could not download business info media", 16), (prl) this.b);
        }
    }

    public /* synthetic */ ikd(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
