package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rhh implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ rhh(rhj rhjVar, boolean z, Action action, Object obj, int i) {
        this.e = i;
        this.c = rhjVar;
        this.a = z;
        this.d = action;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v30, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.lang.Runnable
    public final void run() {
        rhi rhiVar;
        Integer valueOf;
        Integer valueOf2;
        long j;
        String str;
        long j2;
        amen amenVar;
        int i = this.e;
        Uri uri = null;
        if (i != 0) {
            if (i != 1) {
                long j3 = 0;
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                zas zasVar = (zas) this.b;
                                mho mhoVar = (mho) zasVar.a.b();
                                Intent intent = (Intent) this.c;
                                if (intent.hasExtra("FOCUS_ON_FIELD") && (intent.getBooleanExtra("should_launch_home_on_back", false) || intent.getBooleanExtra("via_share_intent", false))) {
                                    amenVar = amen.VIA_ASSISTANT_APP_CONTROL;
                                } else {
                                    if (intent.getCategories() != null) {
                                        Iterator<String> it = intent.getCategories().iterator();
                                        while (it.hasNext()) {
                                            if (TextUtils.equals(it.next(), "android.intent.category.LAUNCHER")) {
                                                break;
                                            }
                                        }
                                    }
                                    if (!intent.getBooleanExtra("via_home_activity", false)) {
                                        if (intent.getBooleanExtra("via_notification", false)) {
                                            amenVar = amen.VIA_NOTIFICATION;
                                        } else if (intent.getBooleanExtra("via_share_intent", false)) {
                                            amenVar = amen.VIA_SHARING_INTENT;
                                        } else if (intent.getBooleanExtra("via_widget", false)) {
                                            amenVar = amen.VIA_WIDGET;
                                        } else if (intent.getBooleanExtra("via_shortcut", false)) {
                                            amenVar = amen.VIA_SHORTCUT;
                                        } else if (intent.getBooleanExtra("launch_from_trampoline", false)) {
                                            amenVar = amen.VIA_TRAMPOLINE;
                                        } else {
                                            amenVar = amen.VIA_DEFAULT;
                                        }
                                    }
                                    amenVar = amen.VIA_LAUNCH_ICON;
                                }
                                boolean z = this.a;
                                Object obj = this.d;
                                mhoVar.m(amenVar);
                                mbl mblVar = (mbl) zasVar.h.b();
                                if (true == lga.q((Activity) obj, z)) {
                                    j3 = 1;
                                }
                                mblVar.g("Bugle.MainActivity.OnCreate.Count", j3);
                                return;
                            }
                            this.b.run();
                            if (this.a) {
                                Object obj2 = this.c;
                                Object obj3 = this.d;
                                ((ruq) obj3).d.h(new mla(19), "notifyConversationPushAfterCommit".concat(String.valueOf(String.valueOf(obj2))), new rah(obj3, obj2, 16));
                                return;
                            }
                            return;
                        }
                        xyl.h();
                        ((ruq) this.d).b((ConversationIdType) this.c, this.a, (tqc) this.b);
                        return;
                    }
                    ((ruq) this.d).b((ConversationIdType) this.c, this.a, (tqc) this.b);
                    return;
                }
                Object obj4 = this.b;
                boolean z2 = this.a;
                if (z2) {
                    sxt sxtVar = (sxt) rul.au((ConversationIdType) obj4).n();
                    try {
                        if (sxtVar.moveToFirst()) {
                            j2 = sxtVar.s();
                        } else {
                            j2 = 0;
                        }
                        if (sxtVar.getCount() > 1) {
                            if (sxtVar.n() == 3) {
                                sxtVar.moveToNext();
                            }
                            j3 = sxtVar.s();
                        }
                        sxtVar.close();
                        long j4 = j3;
                        j3 = j2;
                        j = j4;
                    } finally {
                    }
                } else {
                    j = 0;
                }
                ?? r5 = this.d;
                sng sngVar = new sng();
                sngVar.ag();
                sngVar.aj("updateConversationDraftSnippetAndPreview");
                if (r5 != 0 && r5.cb()) {
                    String am = r5.am();
                    String ap = r5.ap();
                    Iterator it2 = r5.W().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it2.next();
                            if (messagePartCoreData.aV() && gh.p(messagePartCoreData.U())) {
                                uri = messagePartCoreData.t();
                                str = messagePartCoreData.U();
                                break;
                            }
                        } else {
                            str = null;
                            break;
                        }
                    }
                    if (r5.u() != null && albo.ah(am) && albo.ah(ap) && uri == null) {
                        rul.aA(sngVar);
                        j3 = j;
                    } else {
                        j3 = Math.max(j3, r5.n());
                        sngVar.Q(true);
                        sngVar.q(am);
                        sngVar.r(ap);
                        sngVar.n(str);
                        sngVar.o(uri);
                    }
                } else {
                    rul.aA(sngVar);
                }
                if (z2) {
                    sngVar.T(j3);
                }
                ((rul) this.c).U((ConversationIdType) obj4, sngVar);
                return;
            }
            boolean z3 = this.a;
            Object obj5 = this.d;
            Object obj6 = this.b;
            if (z3 && obj5 == psk.HIDE) {
                qxr qxrVar = (qxr) this.c;
                long epochMilli = ((xnv) qxrVar.a.b()).f().toEpochMilli();
                sgf sgfVar = new sgf();
                sgfVar.aj("persistUserInitiatedToolstoneDismissal");
                sgfVar.d(psk.HIDE);
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 59050) {
                    agnc.t("conversation_toolstone_timestamp_ms", intValue2);
                }
                if (intValue >= 59050) {
                    sgfVar.a.put("conversation_toolstone_timestamp_ms", Long.valueOf(epochMilli));
                }
                ConversationIdType conversationIdType = (ConversationIdType) obj6;
                if (!sgfVar.b(conversationIdType)) {
                    sxe c = sgh.c();
                    c.j(conversationIdType);
                    c.k(psk.HIDE);
                    c.l(epochMilli);
                    c.h().k();
                }
                psi psiVar = (psi) qxrVar.f.b();
                aozy createBuilder = amtn.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amtn amtnVar = (amtn) createBuilder.b;
                amtnVar.c = 1;
                amtnVar.b = 1 | amtnVar.b;
                psiVar.h((amtn) createBuilder.s());
                return;
            }
            sgf sgfVar2 = new sgf();
            sgfVar2.aj("persistAutomatedToolstoneStateChange");
            psk pskVar = (psk) obj5;
            sgfVar2.d(pskVar);
            ConversationIdType conversationIdType2 = (ConversationIdType) obj6;
            if (!sgfVar2.b(conversationIdType2)) {
                sxe c2 = sgh.c();
                c2.j(conversationIdType2);
                c2.k(pskVar);
                c2.h().k();
                return;
            }
            return;
        }
        Object obj7 = this.c;
        rhj rhjVar = (rhj) obj7;
        synchronized (rhjVar.b) {
            rhiVar = ((rhj) obj7).d;
            if (rhiVar == null) {
                rhiVar = null;
            }
            ((rhj) obj7).d = null;
        }
        if (rhiVar != null) {
            Object obj8 = this.b;
            Object obj9 = this.d;
            if (this.a) {
                rhiVar.a(rhjVar, (Action) obj9, rhjVar.e, obj8);
            } else {
                rhiVar.b(rhjVar, rhjVar.e, obj8);
            }
        }
    }

    public /* synthetic */ rhh(rul rulVar, boolean z, ConversationIdType conversationIdType, MessageCoreData messageCoreData, int i) {
        this.e = i;
        this.c = rulVar;
        this.a = z;
        this.b = conversationIdType;
        this.d = messageCoreData;
    }

    public /* synthetic */ rhh(ruq ruqVar, ConversationIdType conversationIdType, boolean z, tqc tqcVar, int i) {
        this.e = i;
        this.d = ruqVar;
        this.c = conversationIdType;
        this.a = z;
        this.b = tqcVar;
    }

    public /* synthetic */ rhh(ruq ruqVar, Runnable runnable, boolean z, ConversationIdType conversationIdType, int i) {
        this.e = i;
        this.d = ruqVar;
        this.b = runnable;
        this.a = z;
        this.c = conversationIdType;
    }

    public /* synthetic */ rhh(zas zasVar, Intent intent, Activity activity, boolean z, int i) {
        this.e = i;
        this.b = zasVar;
        this.c = intent;
        this.d = activity;
        this.a = z;
    }

    public /* synthetic */ rhh(boolean z, psk pskVar, qxr qxrVar, ConversationIdType conversationIdType, int i) {
        this.e = i;
        this.a = z;
        this.d = pskVar;
        this.c = qxrVar;
        this.b = conversationIdType;
    }
}
