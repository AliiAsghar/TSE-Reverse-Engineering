package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mmc implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ mmc(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v79, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r3v15, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v43, types: [xpz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        String str;
        akrh e;
        qgr qgrVar;
        akul c;
        boolean z;
        int i = 9;
        int i2 = 5;
        int i3 = 17;
        int i4 = 12;
        int i5 = 13;
        int i6 = 2;
        int i7 = 7;
        int i8 = 16;
        boolean z2 = false;
        byte[] bArr = null;
        int i9 = 1;
        switch (this.e) {
            case 0:
                mll mllVar = (mll) obj;
                boolean q = mllVar.q();
                ?? r3 = this.b;
                if (q) {
                    ((alwl) ((alwl) mmg.a.i()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "renameConversation", 643, "DefaultConversationRepository.java")).t("conversation no longer exists, skipping rename on conversation id = %s.", r3.b());
                    return aktp.ag(true);
                }
                Object obj2 = this.c;
                if (Objects.equals(mllVar.h(), obj2)) {
                    ((alwl) ((alwl) mmg.a.g()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "renameConversation", 649, "DefaultConversationRepository.java")).t("Same name, skipping rename on conversation id = %s.", r3.b());
                    return aktp.ag(true);
                }
                Object obj3 = this.d;
                Object obj4 = this.a;
                if (!tvu.e(mllVar.r())) {
                    return ((mmg) obj4).E((BugleConversationId) obj3, (String) obj2, false);
                }
                nfw f = mllVar.f();
                f.getClass();
                qei qeiVar = (qei) f.i().flatMap(new mlm(i7)).orElseThrow();
                mmg mmgVar = (mmg) obj4;
                vuv a = ((vut) mmgVar.e.b()).a(qeiVar);
                ConversationIdType conversationIdType = ((BugleConversationId) obj3).a;
                return aktp.ai(new vmb(a, conversationIdType, 10, bArr), a.f).i(new ukk((Object) a, (Object) conversationIdType, obj2, 20, (byte[]) null), a.g).e(IllegalArgumentException.class, new vuu(conversationIdType, 3), a.e).i(new vwx(a, conversationIdType, a.c.f(), i9), a.e).h(new mds(r3, i4), mmgVar.j).i(new mhv(obj4, obj3, obj2, 5, (byte[]) null), mmgVar.j);
            case 1:
                String str2 = (String) obj;
                if (ActivityManager.isUserAMonkey()) {
                    return aktp.ag(null);
                }
                Object obj5 = this.c;
                Object obj6 = this.b;
                kso ksoVar = (kso) this.d;
                yfu yfuVar = ksoVar.c;
                Uri parse = Uri.parse("https://support.google.com/nexus/topic/6089061/?hl=%locale%");
                Intent k = kso.k(yfuVar.a());
                Intent k2 = kso.k(ksoVar.c.b());
                Context context = (Context) obj6;
                Intent intent = new Intent(context, (Class<?>) LicenseMenuActivity.class);
                Resources resources = context.getResources();
                ThemeSettings themeSettings = new ThemeSettings();
                themeSettings.a = 3;
                GoogleHelp googleHelp = new GoogleHelp((String) obj5);
                googleHelp.q = parse;
                googleHelp.b(0, resources.getString(R.string.menu_privacy_policy), k);
                googleHelp.b(1, resources.getString(R.string.menu_terms_of_service), k2);
                googleHelp.b(2, resources.getString(R.string.menu_license), intent);
                googleHelp.s = themeSettings;
                abym abymVar = new abym(context);
                aqws aqwsVar = new aqws((char[]) null);
                aqwsVar.d();
                abymVar.f = aqwsVar.c();
                Bitmap l = kso.l(context);
                if (l != null) {
                    abymVar.a = l;
                }
                if (str2 != null) {
                    abymVar.b = str2;
                }
                Object obj7 = this.a;
                if (obj7 != null) {
                    if (true != ksoVar.e.a()) {
                        str = "one-off-psd";
                    } else {
                        str = "ConversationPsd";
                    }
                    ksoVar.d.c(alor.l(str, obj7));
                }
                abymVar.d(ksoVar.d, true);
                googleHelp.c(abymVar.a(), context.getCacheDir());
                Intent a2 = googleHelp.a();
                Activity g = abbu.g(context);
                if (g == null) {
                    kso.a.q("Supplied context was not an Activity, cannot launch help");
                    return aktp.ag(null);
                }
                lga.aJ(g, a2);
                return aktp.ag(null);
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj8 = this.b;
                Object obj9 = this.a;
                ?? r5 = this.d;
                Object obj10 = this.c;
                e = aktp.e("ConversationRepository#getOrCreateConversationInternal");
                try {
                    ((alwl) ((alwl) mmg.a.g()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "getOrCreateConversationInternal", 426, "DefaultConversationRepository.java")).q("Starting getOrCreateConversationForService.");
                    if (((pfr) ((mmg) obj8).m.b()).a() && booleanValue) {
                        vti vtiVar = (vti) ((mmg) obj8).l.b();
                        qgr a3 = vtiVar.a();
                        vti.n(vtiVar, 2, 0, null, a3, null, null, 54);
                        qgrVar = a3;
                    } else {
                        qgrVar = null;
                    }
                    rio rioVar = (rio) ((mmg) obj8).b.b();
                    Stream map = Collection.EL.stream(r5).map(new rhr(i));
                    int i10 = alog.d;
                    akul g2 = akul.g(rioVar.a((Optional) obj9, (List) map.collect(alls.a), booleanValue, (String) obj10, qgrVar).s());
                    uac uacVar = (uac) ((mmg) obj8).f.b();
                    isd isdVar = new isd(i2);
                    Duration ofMillis = Duration.ofMillis(((Long) ((utz) qkx.a.get()).e()).longValue());
                    mmf mmfVar = new mmf();
                    g2.getClass();
                    ofMillis.getClass();
                    c = qjh.c(uacVar.a, arpj.a, arwf.a, new icz(uacVar, g2, isdVar, ofMillis, mmfVar, (arpe) null, 9));
                    qiu.h(c);
                    akul i11 = g2.i(new lso(obj8, i5), ((mmg) obj8).j);
                    e.close();
                    return i11;
                } finally {
                }
            case 3:
                ConversationIdType conversationIdType2 = (ConversationIdType) obj;
                if (conversationIdType2 != null) {
                    return aktp.ag(conversationIdType2);
                }
                Object obj11 = this.d;
                Object obj12 = this.c;
                Object obj13 = this.a;
                Object obj14 = this.b;
                qcb qcbVar = (qcb) obj14;
                return qcbVar.d((qez) obj13, (alog) obj12, (qei) obj11).h(new mmq(obj14, obj13, i5), qcbVar.c);
            case 4:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                Object obj15 = this.d;
                Object obj16 = this.b;
                if (booleanValue2) {
                    Object obj17 = this.a;
                    Object obj18 = this.c;
                    alvw i12 = qdc.b.i();
                    i12.X(alwp.a, "BugleDataModel");
                    alvg alvgVar = (alvg) i12;
                    alvgVar.X(ydl.f, obj18);
                    qfo qfoVar = (qfo) obj15;
                    alvgVar.X(ydl.p, ruy.b(qfoVar.h));
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/MultiPartIncomingChatMessageProcessor", "validateAndProcess", 136, "MultiPartIncomingChatMessageProcessor.java")).q("Received group message but the group conversation is missing. Retrying.");
                    if (((qfp) obj17).d) {
                        qya qyaVar = (qya) ((qdc) obj16).g.b();
                        aozy createBuilder = amxb.a.createBuilder();
                        aozy createBuilder2 = amxc.a.createBuilder();
                        amwy amwyVar = amwy.CHAT_API_FAILED_TRANSIENTLY;
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        apag apagVar = createBuilder2.b;
                        amxc amxcVar = (amxc) apagVar;
                        amxcVar.f = amwyVar.f;
                        amxcVar.b |= 16;
                        if (!apagVar.isMutable()) {
                            createBuilder2.u();
                        }
                        amxc amxcVar2 = (amxc) createBuilder2.b;
                        amxcVar2.g = 7;
                        amxcVar2.b |= 32;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amxb amxbVar = (amxb) createBuilder.b;
                        amxc amxcVar3 = (amxc) createBuilder2.s();
                        amxcVar3.getClass();
                        amxbVar.c = amxcVar3;
                        amxbVar.b |= 1;
                        qyaVar.q(qfoVar, (amxb) createBuilder.s());
                    } else {
                        qya qyaVar2 = (qya) ((qdc) obj16).g.b();
                        aozy createBuilder3 = amxb.a.createBuilder();
                        aozy createBuilder4 = amxc.a.createBuilder();
                        amwy amwyVar2 = amwy.CHAT_API_FAILED_PERMANENTLY;
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        apag apagVar2 = createBuilder4.b;
                        amxc amxcVar4 = (amxc) apagVar2;
                        amxcVar4.f = amwyVar2.f;
                        amxcVar4.b |= 16;
                        if (!apagVar2.isMutable()) {
                            createBuilder4.u();
                        }
                        amxc amxcVar5 = (amxc) createBuilder4.b;
                        amxcVar5.g = 7;
                        amxcVar5.b |= 32;
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        amxb amxbVar2 = (amxb) createBuilder3.b;
                        amxc amxcVar6 = (amxc) createBuilder4.s();
                        amxcVar6.getClass();
                        amxbVar2.c = amxcVar6;
                        amxbVar2.b |= 1;
                        qyaVar2.q(qfoVar, (amxb) createBuilder3.s());
                    }
                    return aktp.ag(pwh.FAIL_RETRY);
                }
                qdc qdcVar = (qdc) obj16;
                qdj qdjVar = qdcVar.c;
                akia b = qdk.b();
                b.n((qfo) obj15);
                b.m(0);
                return qdjVar.a(b.l()).i(new qdl(obj16, obj15, i9), qdcVar.e);
            case 5:
                xyo e2 = qdr.a.e();
                e2.H("Deserialization of the incoming message failed");
                e2.g(rve.a((String) this.c));
                e2.z("contentType", this.a);
                e2.r((ajsh) obj);
                qya qyaVar3 = (qya) ((qdr) this.d).d.b();
                aozy createBuilder5 = amxb.a.createBuilder();
                aozy createBuilder6 = amxc.a.createBuilder();
                amwy amwyVar3 = amwy.CHAT_API_FAILED_PERMANENTLY;
                if (!createBuilder6.b.isMutable()) {
                    createBuilder6.u();
                }
                apag apagVar3 = createBuilder6.b;
                amxc amxcVar7 = (amxc) apagVar3;
                amxcVar7.f = amwyVar3.f;
                amxcVar7.b |= 16;
                if (!apagVar3.isMutable()) {
                    createBuilder6.u();
                }
                amxc amxcVar8 = (amxc) createBuilder6.b;
                amxcVar8.g = 9;
                amxcVar8.b |= 32;
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                Object obj19 = this.b;
                amxb amxbVar3 = (amxb) createBuilder5.b;
                amxc amxcVar9 = (amxc) createBuilder6.s();
                amxcVar9.getClass();
                amxbVar3.c = amxcVar9;
                amxbVar3.b |= 1;
                qyaVar3.q(((qdk) obj19).a, (amxb) createBuilder5.s());
                return aktp.ag(pwh.FAIL_NO_RETRY);
            case 6:
                return this.d.a(this.b.B(), (FileInformation) this.c, ((aoyj) this.a).toByteString());
            case 7:
                if (new gsu().equals((gvf) obj)) {
                    tsp.b.q("Failure when downloading fresh remote instance data, using existing instead");
                }
                Object obj20 = this.b;
                return ((tsp) this.a).b((ConversationIdType) this.d, (String) this.c, (qei) obj20);
            case 8:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                Object obj21 = this.b;
                Object obj22 = this.d;
                if (booleanValue3) {
                    return ((tsp) obj22).d((ConversationIdType) obj21, (alpx) this.a, (alpx) this.c);
                }
                alvw g3 = tsp.a.g();
                g3.X(alwp.a, "BugleEtouffee");
                ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationEncryptionStatus", "setupSessionsWithParticipants", 647, "ConversationEncryptionStatus.java")).t("etouffee configs not in sync, skipping etouffee setup for conversation: {%s}", obj21);
                ((mbl) ((tsp) obj22).k.b()).e("Bugle.Etouffee.Conversation.Encryption.Update", uax.SKIP_UPGRADE_FLAG_AND_BACKEND_NOT_SYNCED.t);
                return aktp.ag(null);
            case 9:
                Optional optional = (Optional) obj;
                Object obj23 = this.d;
                Object obj24 = this.a;
                if (optional != null && !optional.isEmpty()) {
                    return ((tsp) obj24).c((ConversationIdType) obj23, (String) this.c, (qei) this.b, (sec) optional.get());
                }
                tsp.b.o("No remote registrations, taking down encryption");
                ((tsp) obj24).j((ConversationIdType) obj23, uax.DOWNGRADE_REMOTE_REGISTRATION_MISSING);
                return aktp.ag(null);
            case 10:
                typ typVar = typ.PROVISIONED;
                if (typVar != this.a) {
                    z = false;
                } else {
                    z = true;
                }
                if (typVar == this.d) {
                    z2 = true;
                }
                if (z == z2) {
                    return aktp.ag(null);
                }
                Object obj25 = this.b;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Set) ((ttj) obj25).o.b()).iterator();
                while (it.hasNext()) {
                    arrayList.add(((Ctry) it.next()).c((String) this.c, z2));
                }
                return aktp.am(arrayList).h(new kli(i8), andi.a);
            case 11:
                vqh vqhVar = (vqh) obj;
                if (vqhVar.b != 0) {
                    return aktp.ag(vqhVar);
                }
                Object obj26 = this.d;
                Object obj27 = this.b;
                ?? r7 = this.a;
                tuh tuhVar = (tuh) this.c;
                return tuhVar.c.i(r7, (aoia) obj27, tuhVar.b, new ttu(i4), (qft) obj26);
            case 12:
                Object obj28 = this.d;
                Object obj29 = this.c;
                Object obj30 = this.b;
                tum tumVar = (tum) this.a;
                return aktp.ai(new imh(tumVar, (qdk) obj30, (ajrt) obj29, (qei) obj28, 6), tumVar.g);
            case 13:
                qdk qdkVar = (qdk) this.b;
                apwl G = wcm.G(qdkVar.a().d.D());
                Object obj31 = this.a;
                Object obj32 = this.c;
                tvg tvgVar = (tvg) this.d;
                tvx a4 = tvgVar.o.a((String) obj, G, (vqy) obj31, (NativeMessageEncryptorV2) obj32);
                tvgVar.h(a4, rve.a(qdkVar.a.g));
                return aktp.ag(a4);
            case 14:
                NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) obj;
                apwl apwlVar = (apwl) apag.parseFrom(apwl.a, (aozb) this.c, aozs.a());
                Object obj33 = this.b;
                if (tte.h() && apwlVar.e) {
                    xyo e3 = tvg.a.e();
                    e3.H("Unexpected FTD is received.");
                    e3.g(rve.a(((qdk) obj33).a.g));
                    e3.q();
                    return aktp.ag(tvx.b(ttf.INVALID_FTD_RECEIPT));
                }
                ?? r2 = this.a;
                qdk qdkVar2 = (qdk) obj33;
                tvg tvgVar2 = (tvg) this.d;
                return tvgVar2.p.j((String) albo.bQ(r2)).i(new qcf(tvgVar2, apwlVar, qdkVar2, nativeMessageEncryptorV2, rve.a(qdkVar2.a.g), 4), tvgVar2.i);
            case 15:
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                Object obj34 = this.d;
                if (booleanValue4) {
                    Object obj35 = this.b;
                    ukj ukjVar = (ukj) this.a;
                    alog a5 = ukjVar.g.a((gsi) obj35);
                    long b2 = ((gsi) obj34).b("vsms_verification_chain_start_time_key", 0L);
                    ytp ytpVar = (ytp) ukjVar.l.b();
                    aozy createBuilder7 = anmo.a.createBuilder();
                    if (!createBuilder7.b.isMutable()) {
                        createBuilder7.u();
                    }
                    Object obj36 = this.c;
                    ((anmo) createBuilder7.b).q = a.am(3);
                    akul d = ytpVar.c.d();
                    akul c2 = ytpVar.c.c();
                    yuu yuuVar = ytpVar.c;
                    yuuVar.getClass();
                    return aktp.ah(new rak(ytpVar, createBuilder7, a5, b2, (anlx) obj36, 6), ytpVar.g).i(new qcf(ytpVar, d, c2, d.i(new xfn(yuuVar, i8), ytpVar.g), createBuilder7, 13), ytpVar.h).i(new xfn(ytpVar.i, i3), ytpVar.g).h(new uht(obj34, 20), ukjVar.k).e(Throwable.class, new ult(obj34, i9), ukjVar.k);
                }
                return aktp.ag(new gsw((gsi) obj34));
            case 16:
                if (((EnumSet) this.a).contains(uny.DUMP_WM)) {
                    Object obj37 = this.c;
                    Object obj38 = this.b;
                    Object obj39 = this.d;
                    uny.DUMP_WM.toString();
                    uoo uooVar = (uoo) obj39;
                    gtm ar = gvf.ar(uooVar.b);
                    ((arjs) obj38).g("PWQ WM State:");
                    gvd gvdVar = (gvd) ar;
                    WorkDatabase workDatabase = gvdVar.e;
                    gpx gpxVar = gvdVar.l;
                    workDatabase.getClass();
                    gpxVar.getClass();
                    return akul.g(gvf.aj(workDatabase, gpxVar, new gvj(3))).h(new raw(obj38, obj37, 18), uooVar.c);
                }
                return aktp.ag(null);
            case 17:
                vew vewVar = (vew) this.d;
                aqfn n = vewVar.n();
                Object obj40 = this.b;
                vdd vddVar = vew.a;
                vco b3 = ((veo) obj40).b(n);
                Object obj41 = b3.b;
                aquo aquoVar = vcx.a;
                aqut aqutVar = new aqut();
                aqutVar.f((aqut) obj41);
                aquj aqujVar = new aquj("X-Goog-Api-Key", aqut.c);
                if (aqutVar.j(aqujVar)) {
                    String str3 = (String) aqutVar.b(aqujVar);
                    str3.getClass();
                    int i13 = 0;
                    while (true) {
                        if (i13 < aqutVar.f) {
                            int i14 = i13 + 1;
                            if (!Arrays.equals(aqujVar.b, aqutVar.l(i13)) || !str3.equals(aqutVar.d(i13, aqujVar))) {
                                i13 = i14;
                            } else {
                                int i15 = i14 + i14;
                                int a6 = aqutVar.a() - i15;
                                Object[] objArr = aqutVar.e;
                                System.arraycopy(objArr, i15, objArr, i13 + i13, a6);
                                int i16 = aqutVar.f - 1;
                                aqutVar.f = i16;
                                aqutVar.g(i16, null);
                                aqutVar.i(aqutVar.f, null);
                            }
                        }
                    }
                }
                wpp wppVar = vewVar.e;
                Object obj42 = this.a;
                Object obj43 = this.c;
                aoki aokiVar = (aoki) obj42;
                aqutVar.h(vcx.a, "Bearer ".concat(String.valueOf(aokiVar.a)));
                aqutVar.h(vcx.b, Long.toString(aokiVar.b));
                return wppVar.Q(vddVar, akul.g(((aqar) vdi.b(aqas.a((aqrs) b3.a), aqutVar, false)).b((aqeq) obj43)));
            case 18:
                aqfg aqfgVar = (aqfg) obj;
                if (aqdq.EPHEMERAL.equals(this.d)) {
                    return aktp.ag(null);
                }
                aozy createBuilder8 = aqfy.a.createBuilder();
                if (!createBuilder8.b.isMutable()) {
                    createBuilder8.u();
                }
                Object obj44 = this.c;
                apag apagVar4 = createBuilder8.b;
                obj44.getClass();
                ((aqfy) apagVar4).c = (String) obj44;
                if (!apagVar4.isMutable()) {
                    createBuilder8.u();
                }
                Object obj45 = this.a;
                Object obj46 = this.b;
                aqfy aqfyVar = (aqfy) createBuilder8.b;
                obj45.getClass();
                aqfyVar.d = (aqfn) obj45;
                aqfyVar.b |= 1;
                aqfy aqfyVar2 = (aqfy) createBuilder8.s();
                alvw f2 = vgt.a.f();
                f2.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) f2).h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl", "ackRequest", 314, "InboxMessageDispatcherImpl.java")).t("InboxMessageDispatcherImpl: acking message messageId: %s", obj44);
                aozy createBuilder9 = aqdj.a.createBuilder();
                if (!createBuilder9.b.isMutable()) {
                    createBuilder9.u();
                }
                aqdj aqdjVar = (aqdj) createBuilder9.b;
                aqfyVar2.getClass();
                apax apaxVar = aqdjVar.d;
                if (!apaxVar.c()) {
                    aqdjVar.d = apag.mutableCopy(apaxVar);
                }
                vgt vgtVar = (vgt) obj46;
                vba vbaVar = vgtVar.c;
                aqdjVar.d.add(aqfyVar2);
                aozy S = vgtVar.i.S(vbaVar.j());
                aozb aozbVar = aqfgVar.b;
                if (!S.b.isMutable()) {
                    S.u();
                }
                aqgb aqgbVar = (aqgb) S.b;
                aqgb aqgbVar2 = aqgb.a;
                aozbVar.getClass();
                aqgbVar.e = aozbVar;
                if (!createBuilder9.b.isMutable()) {
                    createBuilder9.u();
                }
                vcy vcyVar = vgtVar.b;
                aqdj aqdjVar2 = (aqdj) createBuilder9.b;
                aqgb aqgbVar3 = (aqgb) S.s();
                aqgbVar3.getClass();
                aqdjVar2.c = aqgbVar3;
                aqdjVar2.b |= 1;
                return vcyVar.a((aqdj) createBuilder9.s()).h(new vgd(obj44, i6), andi.a);
            case 19:
                vhe a7 = ((vhi) this.b).a((String) this.c, (vbq) obj);
                Optional optional2 = (Optional) this.a;
                boolean isPresent = optional2.isPresent();
                Object obj47 = this.d;
                if (isPresent) {
                    Object obj48 = optional2.get();
                    a7.f = true;
                    vgk vgkVar = (vgk) a7.e.get();
                    e = aktp.e("PullHandlerImpl::pullMessages");
                    try {
                        akul i17 = vgkVar.e.l((vaz) obj48).i(new vek(vgkVar, 6), vgkVar.c);
                        e.b(i17);
                        e.close();
                        return a7.a((aqfn) obj47, i17);
                    } finally {
                    }
                } else {
                    a7.f = true;
                    return a7.a((aqfn) obj47, ((vgk) a7.e.get()).a());
                }
            default:
                boolean booleanValue5 = ((Boolean) obj).booleanValue();
                Object obj49 = this.c;
                if (!booleanValue5) {
                    alwl alwlVar = (alwl) vka.a.g();
                    alwlVar.X(vjh.n, obj49);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "createNotificationFromInputData", 295, "CreateNotificationHandler.java")).q("shouldShow=false, so not creating notification");
                    return aktp.ag(upm.d());
                }
                Object obj50 = this.a;
                Object obj51 = this.d;
                final vka vkaVar = (vka) this.b;
                final vkh vkhVar = (vkh) obj51;
                vla vlaVar = (vla) obj50;
                akul a8 = vkhVar.a((List) Collection.EL.stream((List) Collection.EL.stream(vkaVar.f.c((vlm) obj49)).filter(new uzr(i3)).collect(Collectors.toCollection(new uzg(11)))).map(new vil(i2)).collect(Collectors.toCollection(new uzg(11))), vkhVar.c().c(vlaVar));
                final boolean z3 = vlaVar.f;
                return a8.i(new ancs() { // from class: vjz
                    /* JADX WARN: Code restructure failed: missing block: B:50:0x02ad, code lost:
                    
                        if (r3.contains(r0.get()) == false) goto L49;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:61:0x030a, code lost:
                    
                        if (r6 != 4) goto L62;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x00f7  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x012c  */
                    @Override // defpackage.ancs
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r31) {
                        /*
                            Method dump skipped, instructions count: 931
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.vjz.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                    }
                }, vkaVar.d);
        }
    }

    public /* synthetic */ mmc(Object obj, Object obj2, Object obj3, Object obj4, int i, byte[] bArr) {
        this.e = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.a = obj4;
    }

    public /* synthetic */ mmc(Object obj, Object obj2, Object obj3, Object obj4, int i, char[] cArr) {
        this.e = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.a = obj4;
    }

    public /* synthetic */ mmc(Object obj, Object obj2, Object obj3, Object obj4, int i, short[] sArr) {
        this.e = i;
        this.d = obj;
        this.b = obj2;
        this.a = obj3;
        this.c = obj4;
    }

    public /* synthetic */ mmc(Object obj, String str, Object obj2, Object obj3, int i) {
        this.e = i;
        this.b = obj;
        this.c = str;
        this.a = obj2;
        this.d = obj3;
    }

    public /* synthetic */ mmc(mmg mmgVar, Optional optional, alog alogVar, String str, int i) {
        this.e = i;
        this.b = mmgVar;
        this.a = optional;
        this.d = alogVar;
        this.c = str;
    }

    public /* synthetic */ mmc(qcb qcbVar, qez qezVar, alog alogVar, qei qeiVar, int i) {
        this.e = i;
        this.b = qcbVar;
        this.a = qezVar;
        this.c = alogVar;
        this.d = qeiVar;
    }

    public /* synthetic */ mmc(qdr qdrVar, String str, ContentType contentType, qdk qdkVar, int i) {
        this.e = i;
        this.d = qdrVar;
        this.c = str;
        this.a = contentType;
        this.b = qdkVar;
    }

    public /* synthetic */ mmc(tsp tspVar, ConversationIdType conversationIdType, String str, qei qeiVar, int i) {
        this.e = i;
        this.a = tspVar;
        this.d = conversationIdType;
        this.c = str;
        this.b = qeiVar;
    }

    public /* synthetic */ mmc(tuh tuhVar, MessageCoreData messageCoreData, aoia aoiaVar, qft qftVar, int i) {
        this.e = i;
        this.c = tuhVar;
        this.a = messageCoreData;
        this.b = aoiaVar;
        this.d = qftVar;
    }

    public /* synthetic */ mmc(tvg tvgVar, aozb aozbVar, qdk qdkVar, akul akulVar, int i) {
        this.e = i;
        this.d = tvgVar;
        this.c = aozbVar;
        this.b = qdkVar;
        this.a = akulVar;
    }

    public /* synthetic */ mmc(ukj ukjVar, gsi gsiVar, gsi gsiVar2, anlx anlxVar, int i) {
        this.e = i;
        this.a = ukjVar;
        this.b = gsiVar;
        this.d = gsiVar2;
        this.c = anlxVar;
    }

    public /* synthetic */ mmc(uoo uooVar, EnumSet enumSet, arjs arjsVar, Pattern pattern, int i) {
        this.e = i;
        this.d = uooVar;
        this.a = enumSet;
        this.b = arjsVar;
        this.c = pattern;
    }
}
