package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.NoConfirmationMessageSendAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateRbmBotParticipantAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rgr implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ rgr(abif abifVar, IBinder iBinder, AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2, int i) {
        this.f = i;
        this.e = abifVar;
        this.a = iBinder;
        this.c = atomicReference;
        this.b = countDownLatch;
        this.d = atomicReference2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object, android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r6v29, types: [abif, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Object a;
        alog alogVar;
        Object obj;
        Object obj2;
        int i;
        Integer valueOf;
        Integer valueOf2;
        String str;
        tqc A;
        amzu amzuVar;
        String valueOf3;
        aesp aeskVar;
        String valueOf4;
        String str2;
        int i2 = 2;
        boolean z = false;
        int i3 = 1;
        switch (this.f) {
            case 0:
                Object obj3 = this.c;
                Object obj4 = this.b;
                Object obj5 = this.a;
                raa raaVar = new raa(obj5, obj3, obj4, i2);
                UpdateRbmBotParticipantAction updateRbmBotParticipantAction = (UpdateRbmBotParticipantAction) obj5;
                ((Boolean) updateRbmBotParticipantAction.b.c("UpdateRbmBotParticipantAction#updateParticipantDisplayDestination", raaVar)).booleanValue();
                ((rxq) updateRbmBotParticipantAction.a.b()).n((String) this.d, this.e);
                return;
            case 1:
                Object obj6 = this.d;
                Object obj7 = this.c;
                Object obj8 = this.e;
                if (obj7 != null && obj7 != obj6) {
                    ((inh) obj8).f((ins) obj7);
                }
                inh inhVar = (inh) obj8;
                if (inhVar.u((inr) this.b)) {
                    inhVar.g((Bundle) this.a, (ins) obj6);
                    return;
                }
                return;
            case 2:
                Object obj9 = this.e;
                Object obj10 = this.d;
                Object obj11 = this.a;
                Object obj12 = this.c;
                Object obj13 = this.b;
                if (tte.h()) {
                    Optional optional = (Optional) obj10;
                    if (optional.isEmpty()) {
                        tvy.a.q("Remote instance is not present. Skip fixing.");
                        return;
                    }
                    thc thcVar = (thc) optional.get();
                    boolean m = thcVar.m();
                    vqy vqyVar = (vqy) obj12;
                    if (vqyVar.g) {
                        boolean n = thcVar.n();
                        if (m && n) {
                            ((tvy) obj13).e(vqyVar, uax.ATTEMPT_UPGRADE_NON_E2EE_GROUP_RECEIVE_DECRYPTABLE);
                            return;
                        }
                        xyo e = tvy.a.e();
                        e.H("Received a valid encrypted message in a group from an identity which does not have encryption");
                        e.g((rve) obj11);
                        e.L("remoteUserId", vqyVar.c.d);
                        e.q();
                        tvy tvyVar = (tvy) obj13;
                        tvyVar.b.i(thcVar, true);
                        tvyVar.e(vqyVar, uax.UPGRADE_GROUP_RECEIVE_DECRYPTABLE);
                        return;
                    }
                    if (!m) {
                        xyo e2 = tvy.a.e();
                        e2.H("Received a message from a valid identity which doesn't have 'encryption', enabling it");
                        e2.g((rve) obj11);
                        e2.L("remoteUserId", vqyVar.c.d);
                        e2.q();
                        ((tvy) obj13).b.h(thcVar);
                        return;
                    }
                    if (obj9 != null) {
                        ((tvy) obj13).d((thm) obj9);
                        return;
                    }
                    return;
                }
                Optional optional2 = (Optional) obj10;
                if (!((thc) optional2.get()).m()) {
                    xyo e3 = tvy.a.e();
                    e3.H("Received a message from a valid identity which doesn't have 'encryption', enabling it");
                    e3.g((rve) obj11);
                    e3.L("remoteUserId", ((vqy) obj12).c.d);
                    e3.q();
                    ((tvy) obj13).b.h((thc) optional2.get());
                    return;
                }
                if (obj9 != null) {
                    ((tvy) obj13).d((thm) obj9);
                    return;
                }
                return;
            case 3:
                Object obj14 = this.b;
                Object obj15 = this.a;
                Optional empty = Optional.empty();
                if (obj14 != null) {
                    a = obj14;
                } else {
                    a = ((qwm) obj15).a();
                }
                if (obj14 != null) {
                    alogVar = alog.r(obj14);
                } else {
                    int i4 = alog.d;
                    alogVar = alsx.a;
                }
                alog alogVar2 = alogVar;
                Object obj16 = this.d;
                Object obj17 = this.e;
                ujv ujvVar = (ujv) this.c;
                ujvVar.f(empty, (ConversationIdType) obj17, (qwm) obj15, (ParticipantsTable.BindData) a, alogVar2, 217, ujvVar.e.f().toEpochMilli(), -1L, (String) obj16);
                return;
            case 4:
                Intent intent = new Intent((Context) this.a, (Class<?>) NoConfirmationMessageSendAction.class);
                intent.setAction("android.intent.action.RESPOND_VIA_MESSAGE");
                intent.putExtras((Bundle) this.b);
                intent.setClipData(((Intent) this.e).getClipData());
                ((rjb) this.d.b()).a((wng) this.c, intent);
                return;
            case 5:
                ?? r0 = this.a;
                Object obj18 = this.c;
                Object obj19 = this.b;
                Object obj20 = this.e;
                Object obj21 = this.d;
                if (!r0.cs()) {
                    akrh e4 = aktp.e("ReceiveSmsMessageHelper.extractAndPersistOtp");
                    try {
                        ((xwj) ((vxx) obj21).w.b()).c(r0);
                        e4.close();
                        vqy vqyVar2 = (vqy) obj18;
                        vxx vxxVar = (vxx) obj21;
                        ConversationIdType conversationIdType = (ConversationIdType) obj20;
                        tqc c = vxxVar.c(conversationIdType, ((ParticipantsTable.BindData) obj19).O(), vqyVar2.g);
                        ruq ruqVar = (ruq) vxxVar.g.b();
                        MessageIdType B = r0.B();
                        Long valueOf5 = Long.valueOf(r0.n());
                        long j = vqyVar2.m;
                        xyl.h();
                        obj = obj21;
                        obj2 = obj20;
                        i = 1;
                        ruqVar.h(conversationIdType, B, valueOf5, c, null, true, j, 0, null, true);
                    } finally {
                    }
                } else {
                    obj = obj21;
                    obj2 = obj20;
                    i = 1;
                }
                vxx vxxVar2 = (vxx) obj;
                rxq rxqVar = (rxq) vxxVar2.e.b();
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj19;
                String M = bindData.M();
                String str3 = ((vqy) obj18).n;
                akrh e5 = aktp.e("ParticipantDatabaseOperations#updateParticipantAlias");
                try {
                    xyl.h();
                    if (TextUtils.equals((String) ParticipantsTable.h(M, new rxo(3)), str3)) {
                        xyo d = rxq.b.d();
                        d.H("Not updating alias. Existing alias matches new alias for");
                        d.C("participantId", M);
                        d.q();
                    } else {
                        tbb f = ParticipantsTable.f();
                        f.aj("updateParticipantAlias");
                        valueOf = Integer.valueOf(a.bp().c());
                        int intValue = valueOf.intValue();
                        valueOf2 = Integer.valueOf(a.bp().c());
                        int intValue2 = valueOf2.intValue();
                        if (intValue2 < 20060) {
                            agnc.t("alias", intValue2);
                        }
                        if (intValue >= 20060) {
                            agnc.r(f.a, "alias", str3);
                        }
                        f.M(new rxb(M, 7));
                        int e6 = f.a().e();
                        if (e6 != i) {
                            str = "Failed to update participants' alias.";
                        } else {
                            str = "Successfully updated participants' alias";
                        }
                        rxqVar.m(e6, str);
                        ((uhj) rxqVar.h.b()).b();
                    }
                    e5.close();
                    ConversationIdType conversationIdType2 = (ConversationIdType) obj2;
                    vxxVar2.i.c(conversationIdType2, 11);
                    vxxVar2.r.b(conversationIdType2, ParticipantsTable.a(bindData.M()), r0);
                    return;
                } finally {
                }
            case 6:
                wzw wzwVar = (wzw) this.b;
                rwd rwdVar = (rwd) wzwVar.j.b();
                ?? r3 = this.e;
                ConversationIdType z2 = r3.z();
                MessageIdType B2 = r3.B();
                sya syaVar = new sya();
                syaVar.aj("updateMessageAndPartsUriFromTelephony");
                syaVar.K((Uri) this.a);
                rwdVar.O(z2, B2, syaVar);
                for (Map.Entry entry : this.c.entrySet()) {
                    ?? r4 = this.d;
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) r4.get(entry.getKey());
                    if (messagePartCoreData != null) {
                        ((rxc) wzwVar.i.b()).d(r3, messagePartCoreData, messagePartCoreData.t(), (Uri) entry.getValue());
                    }
                }
                ((ruq) wzwVar.k.b()).a(r3.z(), false, tqc.UNARCHIVED);
                return;
            case 7:
                ?? r02 = this.e;
                xrf xrfVar = (xrf) this.d;
                xrfVar.J.i(r02);
                ((rvw) xrfVar.C.b()).a(r02);
                Iterator it = ((Set) xrfVar.w.b()).iterator();
                while (it.hasNext()) {
                    ((rwo) it.next()).e(r02);
                }
                Object obj22 = this.a;
                Object obj23 = this.c;
                Object obj24 = this.b;
                ruq ruqVar2 = (ruq) xrfVar.h.b();
                MessageIdType B3 = r02.B();
                Long valueOf6 = Long.valueOf(r02.n());
                boolean g = xrf.g((qei) obj22);
                ((alwl) ((alwl) xrf.a.g()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getArchiveStatus", 1660, "IncomingFileTransferProcessor.java")).t("Calculating archive status. isGroup: %b", Boolean.valueOf(g));
                String O = ((ParticipantsTable.BindData) obj23).O();
                if (O == null) {
                    A = tqc.UNARCHIVED;
                } else {
                    A = ((rwd) xrfVar.g.b()).A((ConversationIdType) obj24, O, false, g);
                }
                ruqVar2.e((ConversationIdType) obj24, B3, valueOf6, A, -1L, 0);
                return;
            case 8:
                Object obj25 = this.a;
                obj25.getClass();
                xxc xxcVar = (xxc) this.c;
                if (xxcVar.a) {
                    amzuVar = amzu.BLOCKED;
                } else {
                    amzuVar = amzu.UNBLOCKED;
                }
                amzu amzuVar2 = amzuVar;
                Object obj26 = this.d;
                if (xxcVar.e != null) {
                    ((wpp) ((xxh) obj26).l.b()).o((ConversationIdType) obj25, xxcVar.e, amzuVar2, xxcVar.h, xxcVar.i, xxcVar.j);
                    return;
                } else {
                    ((wpp) ((xxh) obj26).l.b()).p((ConversationIdType) obj25, (ParticipantsTable.BindData) this.e, (tqc) this.b, amzuVar2, xxcVar.h, xxcVar.i, xxcVar.j);
                    return;
                }
            case 9:
                Object obj27 = this.c;
                obj27.getClass();
                zdt.a.l("Creating profile UI response");
                voo vooVar = (voo) this.e;
                msh mshVar = null;
                if (vooVar.g.a == null && (str2 = vooVar.f.e) != null && str2.length() != 0) {
                    xvc xvcVar = (xvc) vooVar.b.b();
                    String str4 = vooVar.f.e;
                    str4.getClass();
                    vooVar.g = new vor(xvcVar.r(str4, vooVar.a(), null), vooVar.f.a, z, 4);
                }
                Object obj28 = this.a;
                if (obj28 != 0) {
                    mshVar = obj28;
                }
                if (mshVar == null) {
                    mshVar = vooVar.a();
                }
                Object obj29 = this.b;
                Uri uri = vooVar.g.a;
                if (uri == null) {
                    uri = xvc.c(((zdt) obj29).b);
                    uri.getClass();
                }
                Uri uri2 = uri;
                zem zemVar = (zem) obj27;
                if (zemVar.d.e()) {
                    aewg aewgVar = new aewg(new aevv(uri2, null, null, null, null, 30), null, 0, null, null, 62);
                    zdt zdtVar = (zdt) obj29;
                    String string = zdtVar.b.getString(R.string.phone_number_suggestion_prefix);
                    voq voqVar = vooVar.f;
                    Object c2 = vom.c(voqVar.c, voqVar.e, vox.PROFILE_PEOPLE_SHARING_SOURCE);
                    if (c2 == null) {
                        c2 = mshVar.G(true);
                        c2.getClass();
                    }
                    String format = String.format("%s %s", Arrays.copyOf(new Object[]{string, c2}, 2));
                    format.getClass();
                    if (((pnz) zdtVar.j.b()).a()) {
                        valueOf4 = String.valueOf(mshVar.l(true));
                    } else {
                        valueOf4 = String.valueOf(mshVar.o(true));
                    }
                    aeskVar = new aesn(aewgVar, format, valueOf4, zemVar.a(mshVar), ((ahmv) zdtVar.e.b()).h(vooVar, mshVar, zemVar));
                } else {
                    aewg aewgVar2 = new aewg(new aevv(uri2, null, null, null, null, 30), 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 62);
                    zdt zdtVar2 = (zdt) obj29;
                    String string2 = zdtVar2.b.getString(R.string.phone_number_suggestion_prefix);
                    voq voqVar2 = vooVar.f;
                    Object c3 = vom.c(voqVar2.c, voqVar2.e, vox.PROFILE_PEOPLE_SHARING_SOURCE);
                    if (c3 == null) {
                        c3 = mshVar.G(true);
                        c3.getClass();
                    }
                    String format2 = String.format("%s %s", Arrays.copyOf(new Object[]{string2, c3}, 2));
                    format2.getClass();
                    if (((pnz) zdtVar2.j.b()).a()) {
                        valueOf3 = String.valueOf(mshVar.l(true));
                    } else {
                        valueOf3 = String.valueOf(mshVar.o(true));
                    }
                    aeskVar = new aesk(aewgVar2, format2, valueOf3, null, ((ahmv) zdtVar2.e.b()).h(vooVar, mshVar, zemVar), 24);
                }
                ((arsb) this.d).a = new zdj("phone_number", aeskVar);
                return;
            default:
                Object obj30 = this.d;
                Object obj31 = this.b;
                try {
                    this.e.a(this.a, new abid(this.c, obj31, i3), new abid(obj30, obj31, 0));
                    return;
                } catch (RemoteException e7) {
                    ((AtomicReference) obj30).set(new abig(e7));
                    ((CountDownLatch) obj31).countDown();
                    return;
                }
        }
    }

    public /* synthetic */ rgr(Context context, Bundle bundle, Intent intent, armf armfVar, wng wngVar, int i) {
        this.f = i;
        this.a = context;
        this.b = bundle;
        this.e = intent;
        this.d = armfVar;
        this.c = wngVar;
    }

    public /* synthetic */ rgr(arsb arsbVar, zdt zdtVar, voo vooVar, zem zemVar, msh mshVar, int i) {
        this.f = i;
        this.d = arsbVar;
        this.b = zdtVar;
        this.e = vooVar;
        this.c = zemVar;
        this.a = mshVar;
    }

    public /* synthetic */ rgr(UpdateRbmBotParticipantAction updateRbmBotParticipantAction, ParticipantsTable.BindData bindData, String str, String str2, ParticipantColor participantColor, int i) {
        this.f = i;
        this.a = updateRbmBotParticipantAction;
        this.b = bindData;
        this.c = str;
        this.d = str2;
        this.e = participantColor;
    }

    public /* synthetic */ rgr(inh inhVar, ins insVar, ins insVar2, inr inrVar, Bundle bundle, int i) {
        this.f = i;
        this.e = inhVar;
        this.c = insVar;
        this.d = insVar2;
        this.b = inrVar;
        this.a = bundle;
    }

    public /* synthetic */ rgr(tvy tvyVar, vqy vqyVar, rve rveVar, Optional optional, thm thmVar, int i) {
        this.f = i;
        this.b = tvyVar;
        this.c = vqyVar;
        this.a = rveVar;
        this.d = optional;
        this.e = thmVar;
    }

    public /* synthetic */ rgr(ujv ujvVar, ConversationIdType conversationIdType, qwm qwmVar, ParticipantsTable.BindData bindData, String str, int i) {
        this.f = i;
        this.c = ujvVar;
        this.e = conversationIdType;
        this.a = qwmVar;
        this.b = bindData;
        this.d = str;
    }

    public /* synthetic */ rgr(vxx vxxVar, MessageCoreData messageCoreData, ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, vqy vqyVar, int i) {
        this.f = i;
        this.d = vxxVar;
        this.a = messageCoreData;
        this.e = conversationIdType;
        this.b = bindData;
        this.c = vqyVar;
    }

    public /* synthetic */ rgr(wzw wzwVar, MessageCoreData messageCoreData, Uri uri, Map map, Map map2, int i) {
        this.f = i;
        this.b = wzwVar;
        this.e = messageCoreData;
        this.a = uri;
        this.c = map;
        this.d = map2;
    }

    public /* synthetic */ rgr(xrf xrfVar, MessageCoreData messageCoreData, ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, qei qeiVar, int i) {
        this.f = i;
        this.d = xrfVar;
        this.e = messageCoreData;
        this.b = conversationIdType;
        this.c = bindData;
        this.a = qeiVar;
    }

    public /* synthetic */ rgr(xxc xxcVar, xxh xxhVar, ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, tqc tqcVar, int i) {
        this.f = i;
        this.c = xxcVar;
        this.d = xxhVar;
        this.a = conversationIdType;
        this.e = bindData;
        this.b = tqcVar;
    }
}
