package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.CheckActiveDesktopIsAliveAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import j$.util.Map;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ksn implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ksn(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r13v63, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r13v80, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        Object apply;
        switch (this.c) {
            case 0:
                Context context = ((kso) this.a).b;
                abym abymVar = (abym) this.b;
                abymVar.c = context.getString(R.string.report_issue_description);
                abymVar.c((String) obj);
                return;
            case 1:
                String o = ((agxw) obj).o();
                String o2 = ((agxw) this.b).o();
                if ("google".equals(o) && "pseudonymous".equals(o2)) {
                    Activity activity = ((kpx) this.a).e;
                    lga.E(activity, activity.getString(R.string.lighter_account_sign_out_snackbar_text));
                    return;
                }
                return;
            case 2:
                String path = ((File) obj).getPath();
                Intent intent = (Intent) this.b;
                intent.putExtra("advanced_feedback_screenshot_key", path);
                ((Context) this.a).startActivity(intent);
                return;
            case 3:
                Long l = (Long) obj;
                int i = kxm.d;
                if (l.longValue() > ((kzd) this.b).L) {
                    ((Bundle) this.a).putLong("adapterState_nudgeAdjustedTimestamp", l.longValue());
                    return;
                }
                return;
            case 4:
                aluq listIterator = ((alor) ((Pair) obj).second).values().listIterator();
                while (listIterator.hasNext()) {
                    if (((uyz) listIterator.next()) == uyz.WEB_URL) {
                        aozy createBuilder = amem.a.createBuilder();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        ?? r1 = this.b;
                        Object obj2 = this.a;
                        amem amemVar = (amem) createBuilder.b;
                        amemVar.c = aqas.f(4);
                        amemVar.b |= 1;
                        ((ldy) obj2).c.E(r1, (amem) createBuilder.s());
                    }
                }
                return;
            case 5:
                ((lse) this.a).c.a(this.b, (psv) obj);
                return;
            case 6:
                msh mshVar = (msh) obj;
                ((alob) this.b).h(((lfl) this.a).p(mshVar, mshVar.A(), true));
                return;
            case 7:
                xyo a = ((xze) obj).a();
                a.H(this.b);
                a.r((Throwable) this.a);
                return;
            case 8:
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                ndq ndqVar = new ndq(bindData.M());
                bindData.getClass();
                ((alok) this.b).h(ndqVar, ((ndi) this.a).f(bindData));
                return;
            case 9:
                Object obj3 = this.a;
                prt prtVar = (prt) obj3;
                armf armfVar = prtVar.f;
                String str = (String) obj;
                BusinessInfoData businessInfoData = (BusinessInfoData) this.b;
                String rbmBotId = businessInfoData.getRbmBotId();
                String a2 = ((vqq) armfVar.b()).a(rbmBotId, businessInfoData.getName(), businessInfoData.getColor());
                try {
                    List I = ((wzs) ((prt) obj3).j.b()).I(str);
                    if (I.size() == 1) {
                        int i2 = 0;
                        String o3 = ((msh) I.get(0)).o(((Boolean) new msn(18).get()).booleanValue());
                        if (o3 != null && !o3.endsWith("@bot.rcs.google.com")) {
                            ((prt) obj3).a(rbmBotId, I, "Bot suffix did not match canonical address");
                            return;
                        }
                        int c = ((wzs) ((prt) obj3).j.b()).c(((prt) obj3).c, str, a2);
                        if (c == 0) {
                            ((mho) ((prt) obj3).e.b()).aM(14, rbmBotId);
                            xyo c2 = prt.a.c();
                            c2.H("No entries updated in telephony");
                            c2.z("botId", rbmBotId);
                            c2.L("recipientId", str);
                            c2.q();
                        } else {
                            i2 = c;
                        }
                        xyo c3 = prt.a.c();
                        c3.H("updated telephony rows for rbm bot");
                        c3.x("number of rows", i2);
                        c3.q();
                        return;
                    }
                    ((prt) obj3).a(rbmBotId, I, "No canonical address for specified recipient id");
                    return;
                } catch (Throwable th) {
                    ((mho) prtVar.e.b()).aM(15, rbmBotId);
                    xyo b = prt.a.b();
                    b.H("Error updating canonical address in Telephony");
                    b.z("botId", rbmBotId);
                    b.z("exception", th.getMessage());
                    b.q();
                    return;
                }
            case 10:
                Object obj4 = this.a;
                qrw qrwVar = qrw.RCS;
                qrz.a(((pto) obj4).a());
                ((qru) obj).b(qrwVar, (qei) this.b);
                return;
            case 11:
                this.b.put((qei) obj, this.a);
                return;
            case 12:
                alwo alwoVar = pxb.a;
                ((UrlRequest.Builder) this.b).setUploadDataProvider((UploadDataProvider) obj, this.a);
                return;
            case 13:
                alwl alwlVar = (alwl) qdn.a.g();
                qdn qdnVar = (qdn) this.a;
                alwlVar.X(ydl.e, qdnVar.b.a.g);
                alwlVar.X(ydl.I, qdnVar.b.a.h);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 421, "UnencryptedIncomingChatMessageVisitor.java")).t("Completed processing IsComposing message with state: %s", ((IsComposingMessage) this.b).a());
                qdnVar.i.a(pwh.SUCCESS);
                return;
            case 14:
                qdn qdnVar2 = (qdn) this.a;
                ((mbl) qdnVar2.c.b()).g((String) this.b, 0L);
                alwl alwlVar2 = (alwl) qdn.a.g();
                alwlVar2.X(ydl.f, rve.a(qdnVar2.b.a.g));
                alwlVar2.X(ydl.p, ruy.b(qdnVar2.b.a.h));
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "processInterworkingReceipt", 557, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for Message Receipt from Persistent Work Queue.");
                qdnVar2.i.a(pwh.SUCCESS);
                return;
            case 15:
                CheckActiveDesktopIsAliveAsyncAction checkActiveDesktopIsAliveAsyncAction = (CheckActiveDesktopIsAliveAsyncAction) this.a;
                checkActiveDesktopIsAliveAsyncAction.e.e("Bugle.Ditto.BrowserChallenge.Outcome", 1);
                sop sopVar = new sop();
                sopVar.aj("updateDesktopChallengeTime");
                sopVar.a.put("last_wakeup_time", Long.valueOf(checkActiveDesktopIsAliveAsyncAction.d.b.f().toEpochMilli()));
                apply = new tkg(this.b, 11).apply(new soq());
                sopVar.Z(new agpw((soq) apply));
                sopVar.a().e();
                return;
            case 16:
                if (((Boolean) obj).booleanValue()) {
                    ?? r13 = this.b;
                    rbk rbkVar = (rbk) this.a;
                    xcu xcuVar = rbkVar.d;
                    Map map = xcuVar.b;
                    MessageIdType B = r13.B();
                    int a3 = rbkVar.a(r13);
                    int j = r13.j();
                    if (!map.containsKey(B)) {
                        xcuVar.b.put(B, Long.valueOf(xcuVar.d.f().toEpochMilli()));
                    }
                    aozy createBuilder2 = ammo.a.createBuilder();
                    long epochMilli = xcuVar.d.f().toEpochMilli() - ((Long) xcuVar.b.get(B)).longValue();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ammo ammoVar = (ammo) createBuilder2.b;
                    ammoVar.b = 1 | ammoVar.b;
                    ammoVar.c = epochMilli;
                    amee t = ((lfl) xcuVar.e.b()).t(a3);
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar = createBuilder2.b;
                    ammo ammoVar2 = (ammo) apagVar;
                    t.getClass();
                    ammoVar2.d = t;
                    ammoVar2.b |= 2;
                    if (!apagVar.isMutable()) {
                        createBuilder2.u();
                    }
                    String str2 = rbkVar.g;
                    apag apagVar2 = createBuilder2.b;
                    ammo ammoVar3 = (ammo) apagVar2;
                    str2.getClass();
                    ammoVar3.b = 4 | ammoVar3.b;
                    ammoVar3.e = str2;
                    if (!apagVar2.isMutable()) {
                        createBuilder2.u();
                    }
                    ammo ammoVar4 = (ammo) createBuilder2.b;
                    ammoVar4.b |= 8;
                    ammoVar4.f = j;
                    ammo ammoVar5 = (ammo) createBuilder2.s();
                    aozy aozyVar = (aozy) Map.EL.getOrDefault(xcuVar.c, B, ammx.a.createBuilder());
                    if (!aozyVar.b.isMutable()) {
                        aozyVar.u();
                    }
                    ammx ammxVar = (ammx) aozyVar.b;
                    ammoVar5.getClass();
                    apax apaxVar = ammxVar.c;
                    if (!apaxVar.c()) {
                        ammxVar.c = apag.mutableCopy(apaxVar);
                    }
                    ammxVar.c.add(ammoVar5);
                    xyo a4 = xcu.a.a();
                    a4.H("the sending queue state size is");
                    a4.F(((ammx) aozyVar.b).c.size());
                    a4.H("for messageId:");
                    a4.G(B.a);
                    a4.q();
                    xcuVar.c.put(B, aozyVar);
                    return;
                }
                return;
            case 17:
                ?? r0 = this.b;
                akul a5 = ((zey) obj).a(r0.B());
                Object obj5 = this.a;
                a5.k(qiu.c(new ksn(obj5, r0, 16)), ((rbk) obj5).e);
                return;
            case 18:
                alhr alhrVar = rfa.a;
                ((mag) obj).a(this.a, (ParticipantsTable.BindData) this.b);
                return;
            case 19:
                armf armfVar2 = ((SendMessageAction) this.a).b;
                ConversationIdType z = this.b.z();
                psi psiVar = (psi) armfVar2.b();
                aktp.ah(new itl(psiVar, z, albo.ag(((msh) obj).o(((Boolean) new mst(4).get()).booleanValue())), 12), psiVar.c).k(qiu.b(), andi.a);
                return;
            default:
                if (((Boolean) obj).booleanValue()) {
                    ?? r132 = this.b;
                    Object obj6 = this.a;
                    MessageIdType B2 = r132.B();
                    rgf rgfVar = (rgf) obj6;
                    int b2 = rgfVar.b(r132);
                    xcu xcuVar2 = rgfVar.f;
                    if (!xcuVar2.b.containsKey(B2)) {
                        xcuVar2.b.put(B2, Long.valueOf(xcuVar2.d.f().toEpochMilli()));
                    }
                    aozy createBuilder3 = amne.a.createBuilder();
                    long epochMilli2 = xcuVar2.d.f().toEpochMilli() - ((Long) xcuVar2.b.get(B2)).longValue();
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    amne amneVar = (amne) createBuilder3.b;
                    amneVar.b = 1 | amneVar.b;
                    amneVar.c = epochMilli2;
                    amee t2 = ((lfl) xcuVar2.e.b()).t(b2);
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    amne amneVar2 = (amne) createBuilder3.b;
                    t2.getClass();
                    amneVar2.d = t2;
                    amneVar2.b |= 2;
                    amne amneVar3 = (amne) createBuilder3.s();
                    aozy aozyVar2 = (aozy) Map.EL.getOrDefault(xcuVar2.c, B2, ammx.a.createBuilder());
                    if (!aozyVar2.b.isMutable()) {
                        aozyVar2.u();
                    }
                    ammx ammxVar2 = (ammx) aozyVar2.b;
                    amneVar3.getClass();
                    apax apaxVar2 = ammxVar2.d;
                    if (!apaxVar2.c()) {
                        ammxVar2.d = apag.mutableCopy(apaxVar2);
                    }
                    ammxVar2.d.add(amneVar3);
                    xyo a6 = xcu.a.a();
                    a6.H("the telephony state size is");
                    a6.F(((ammx) aozyVar2.b).d.size());
                    a6.H("for messageId:");
                    a6.G(B2.a);
                    a6.q();
                    xcuVar2.c.put(B2, aozyVar2);
                    return;
                }
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.c) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public /* synthetic */ ksn(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
