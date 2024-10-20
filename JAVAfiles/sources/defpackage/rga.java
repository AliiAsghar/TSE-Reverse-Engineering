package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageToConversationOrParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rga implements ancs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ rga(Context context, int i, agxe agxeVar, agsw agswVar, String str, anen anenVar, int i2) {
        this.g = i2;
        this.f = context;
        this.a = i;
        this.c = agxeVar;
        this.b = agswVar;
        this.e = str;
        this.d = anenVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, anen] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                int i2 = 2;
                if (i != 2) {
                    alog alogVar = (alog) obj;
                    Object obj2 = this.f;
                    int i3 = this.a;
                    Object obj3 = this.c;
                    Object obj4 = this.b;
                    Object obj5 = this.e;
                    ?? r6 = this.d;
                    alvi alviVar = aguf.a;
                    if (alogVar != null && !alogVar.isEmpty()) {
                        ((alvg) ((alvg) aguf.a.f()).h("com/google/android/libraries/inputmethod/emoji/data/BundledEmojiListLoader", "loadFromFile", 231, "BundledEmojiListLoader.java")).q("Using emoji list from renderability cache");
                        return albo.bI(alogVar);
                    }
                    ((alvg) ((alvg) aguf.a.f()).h("com/google/android/libraries/inputmethod/emoji/data/BundledEmojiListLoader", "loadFromFile", 234, "BundledEmojiListLoader.java")).q("Did not find emoji list in renderability cache");
                    try {
                        alog a = aguf.a(((Context) obj2).getResources().openRawResource(i3));
                        agxl.a();
                        alob alobVar = new alob();
                        alur it = a.iterator();
                        while (it.hasNext()) {
                            agun agunVar = (agun) it.next();
                            alog d = agxl.d(agunVar.b, (agxe) obj3);
                            if (agxl.c(agunVar.a, (agxe) obj3)) {
                                String str = agunVar.a;
                                if (((alsx) d).c == 1) {
                                    d = alsx.a;
                                }
                                alobVar.h(new agun(str, d));
                            } else if (((alsx) d).c > 0) {
                                String str2 = (String) d.get(0);
                                if (((alsx) d).c == 1) {
                                    d = alsx.a;
                                }
                                alobVar.h(new agun(str2, d));
                            }
                        }
                        alog g = alobVar.g();
                        ((agsw) obj4).d((String) obj5, g, r6);
                        return albo.bI(g);
                    } catch (IOException e) {
                        ((alvg) ((alvg) ((alvg) aguf.a.h()).g(e)).h("com/google/android/libraries/inputmethod/emoji/data/BundledEmojiListLoader", "loadFromFile", 242, "BundledEmojiListLoader.java")).t("error save to emoji cache file: %s", obj5);
                        int i4 = alog.d;
                        return albo.bI(alsx.a);
                    }
                }
                typ typVar = (typ) obj;
                xyo c = ttj.a.c();
                c.H("E2EE provisioning state update");
                c.z("Previous Etouffee status", typVar.name());
                Object obj6 = this.b;
                typ typVar2 = (typ) obj6;
                c.z("New Etouffee status", typVar2.name());
                c.q();
                if (typVar == obj6) {
                    return aktp.ag(typVar);
                }
                Object obj7 = this.f;
                if (obj6 == typ.PROVISIONED) {
                    ((ttj) obj7).e.c("Bugle.etouffee.provision.success");
                }
                amkj d2 = ttj.d(typVar);
                amkj d3 = ttj.d(typVar2);
                if (d2 != d3) {
                    amfq amfqVar = (amfq) amfr.a.createBuilder();
                    amfp amfpVar = amfp.BUGLE_E2EE_STATE_TRANSITION;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar = (amfr) amfqVar.b;
                    amfrVar.i = amfpVar.dg;
                    amfrVar.b |= 1;
                    aozy createBuilder = amki.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    amki amkiVar = (amki) apagVar;
                    amkiVar.c = d2.f;
                    amkiVar.b = 1 | amkiVar.b;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    Object obj8 = this.c;
                    amki amkiVar2 = (amki) createBuilder.b;
                    amkiVar2.d = d3.f;
                    amkiVar2.b |= 2;
                    amkl m = vel.m((ved) obj8);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    Object obj9 = this.d;
                    amki amkiVar3 = (amki) createBuilder.b;
                    amkiVar3.f = m.e;
                    amkiVar3.b |= 8;
                    amkl m2 = vel.m((ved) obj9);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar2 = createBuilder.b;
                    amki amkiVar4 = (amki) apagVar2;
                    amkiVar4.g = m2.e;
                    amkiVar4.b |= 16;
                    if (!apagVar2.isMutable()) {
                        createBuilder.u();
                    }
                    int i5 = this.a;
                    amki amkiVar5 = (amki) createBuilder.b;
                    amkiVar5.e = i5 - 1;
                    amkiVar5.b |= 4;
                    amki amkiVar6 = (amki) createBuilder.s();
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar2 = (amfr) amfqVar.b;
                    amkiVar6.getClass();
                    amfrVar2.P = amkiVar6;
                    amfrVar2.c |= 524288;
                    ((maq) ((ttj) obj7).f.b()).j(amfqVar);
                }
                tyt a2 = ((ttj) obj7).a((String) this.e);
                xyo c2 = tyt.a.c();
                c2.H("Setting Etouffee provisioning status set");
                c2.z("state", typVar2.name());
                c2.q();
                return a2.b.j(new ttg(obj6, 14)).h(new tvd(17), andi.a).h(new ttg(typVar, i2), andi.a);
            }
            qef qefVar = qef.FAILED_PERMANENTLY;
            qef b = qef.b(((qeg) obj).c);
            if (b == null) {
                b = qef.UNKNOWN_STATUS;
            }
            Object obj10 = this.f;
            Object obj11 = this.e;
            int i6 = this.a;
            qdi qdiVar = (qdi) obj10;
            rve rveVar = (rve) this.c;
            qdiVar.e.a(rveVar, i6, qefVar.equals(b));
            mho mhoVar = (mho) qdiVar.b.b();
            if (obj11 == null) {
                obj11 = vqs.a();
            }
            amxo b2 = amxo.b(((amgu) this.d).aa);
            if (b2 == null) {
                b2 = amxo.UNKNOWN_RCS_TYPE;
            }
            mhoVar.C(rveVar, this.b, i6, (amxb) obj11, b2);
            return aktp.ag(pwh.SUCCESS);
        }
        alog alogVar2 = (alog) obj;
        int i7 = this.a;
        ?? r11 = this.e;
        Object obj12 = this.d;
        Object obj13 = this.c;
        SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction = (SendMessageToConversationOrParticipantsAction) this.b;
        ConversationIdType conversationIdType = (ConversationIdType) obj13;
        return sendMessageToConversationOrParticipantsAction.l.c(conversationIdType, alogVar2, null, (String) obj12, r11, i7, false, false).h(new mhr(sendMessageToConversationOrParticipantsAction, conversationIdType, (SelfIdentityId) this.f, (List) r11, 3), sendMessageToConversationOrParticipantsAction.o);
    }

    public /* synthetic */ rga(SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction, ConversationIdType conversationIdType, String str, List list, int i, SelfIdentityId selfIdentityId, int i2) {
        this.g = i2;
        this.b = sendMessageToConversationOrParticipantsAction;
        this.c = conversationIdType;
        this.d = str;
        this.e = list;
        this.a = i;
        this.f = selfIdentityId;
    }

    public /* synthetic */ rga(qdi qdiVar, rve rveVar, MessageCoreData messageCoreData, int i, amgu amguVar, amxb amxbVar, int i2) {
        this.g = i2;
        this.f = qdiVar;
        this.c = rveVar;
        this.b = messageCoreData;
        this.a = i;
        this.d = amguVar;
        this.e = amxbVar;
    }

    public /* synthetic */ rga(ttj ttjVar, typ typVar, ved vedVar, ved vedVar2, int i, String str, int i2) {
        this.g = i2;
        this.f = ttjVar;
        this.b = typVar;
        this.c = vedVar;
        this.d = vedVar2;
        this.a = i;
        this.e = str;
    }
}
