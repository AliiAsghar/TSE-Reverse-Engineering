package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.CheckActiveDesktopIsAliveAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.GetOrCreateConversationAction;
import com.google.android.apps.messaging.shared.datamodel.action.InsertRcsMessageInTelephonyAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDownloadedMmsAction;
import com.google.android.apps.messaging.shared.datamodel.action.RebuildShortcutsAction;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qdm implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qdm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, andy] */
    /* JADX WARN: Type inference failed for: r0v29, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v52, types: [rhl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.Map, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                alwl alwlVar = (alwl) qdn.a.g();
                qdn qdnVar = (qdn) this.a;
                alwlVar.X(ydl.f, rve.a(qdnVar.b.a.g));
                alwlVar.X(ydl.p, ruy.b(qdnVar.b.a.h));
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "processDeliveryOrDisplayReceipt", 462, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for Message Receipt from Persistent Work Queue.");
                qdnVar.i.a(pwh.SUCCESS);
                return;
            case 1:
                alwl alwlVar2 = (alwl) qdn.a.g();
                qdn qdnVar2 = (qdn) this.a;
                alwlVar2.X(ydl.e, qdnVar2.b.a.g);
                alwlVar2.X(ydl.p, ruy.b(qdnVar2.b.a.h));
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 362, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for FileTransferInformation from Persistent Work Queue.");
                qdnVar2.i.a((pwh) obj);
                return;
            case 2:
                alwl alwlVar3 = (alwl) qdn.a.g();
                qdn qdnVar3 = (qdn) this.a;
                alwlVar3.X(ydl.f, rve.a(qdnVar3.b.a.g));
                alwlVar3.X(ydl.p, ruy.b(qdnVar3.b.a.h));
                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visitUnsupportedEncryptedMessage", 670, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for Unknown Encrypted message from Persistent Work Queue.");
                qdnVar3.i.a(pwh.SUCCESS);
                return;
            case 3:
                this.a.b(obj);
                return;
            case 4:
                xbz xbzVar = (xbz) obj;
                alwo alwoVar = qot.a;
                smr smrVar = (smr) this.a;
                if (tvu.e(smrVar.h())) {
                    xbzVar.e();
                    return;
                } else if (smrVar.o() > 1) {
                    xbzVar.b();
                    return;
                } else {
                    xbzVar.d();
                    return;
                }
            case 5:
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    Object obj2 = this.a;
                    ((qpp) obj2).a = l.longValue();
                    ((aglz) obj2).fE(0);
                    return;
                }
                return;
            case 6:
                ((alob) this.a).h((smr) obj);
                return;
            case 7:
                String str = (String) obj;
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amrh amrhVar = (amrh) aozyVar.b;
                amrh amrhVar2 = amrh.a;
                str.getClass();
                amrhVar.b |= 1;
                amrhVar.c = str;
                return;
            case 8:
                qvo qvoVar = (qvo) obj;
                ((alok) this.a).h(qvoVar.c, qvoVar);
                return;
            case 9:
                String str2 = qxq.a;
                ((agnn) obj).b(this.a);
                return;
            case 10:
                Object obj3 = this.a;
                aagk aagkVar = (aagk) obj3;
                long epochMilli = ((xnv) aagkVar.f).f().toEpochMilli();
                ArrayList arrayList = new ArrayList();
                aagkVar.c = false;
                ((ReentrantLock) aagkVar.g).lock();
                try {
                    for (xyw xywVar : ((aagk) obj3).d.values()) {
                        if (xywVar.b == 1) {
                            if (epochMilli - xywVar.a > 300) {
                                xywVar.b = 2;
                                arrayList.add(xywVar);
                            } else {
                                ((aagk) obj3).c = true;
                            }
                        }
                    }
                    ((ReentrantLock) aagkVar.g).unlock();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        aoee e = aagk.e((xyw) it.next());
                        if (e != null) {
                            aagkVar.b.b();
                            aodz aodzVar = (aodz) aagkVar.a.b();
                            if (aodzVar != null) {
                                aodzVar.b(1, e);
                            }
                        }
                    }
                    if (aagkVar.c) {
                        aagkVar.d();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    ((ReentrantLock) aagkVar.g).unlock();
                    throw th;
                }
            case 11:
                ((CheckActiveDesktopIsAliveAsyncAction) this.a).e.e("Bugle.Ditto.BrowserChallenge.Outcome", 2);
                CheckActiveDesktopIsAliveAsyncAction.a.r("Error sending a browser challenge.", (Throwable) obj);
                return;
            case 12:
                ((GetOrCreateConversationAction) this.a).u.v("self_identity", ((SelfIdentityId) obj).b());
                return;
            case 13:
                ujz ujzVar = (ujz) obj;
                alwo alwoVar2 = rat.a;
                ujzVar.getClass();
                ujzVar.b(this.a);
                return;
            case 14:
                ((InsertRcsMessageInTelephonyAction) this.a).u.v("rcsConferenceUri", (String) obj);
                return;
            case 15:
                ((ProcessDownloadedMmsAction) this.a).u.v("sub_phone_number", (String) obj);
                return;
            case 16:
                this.a.a(obj);
                return;
            case 17:
                this.a.a(obj);
                return;
            case 18:
                d.au(this.a, (vae) obj);
                return;
            case 19:
                rve.h(this.a.f(), "rcs_message_id", (rve) obj);
                return;
            default:
                akul l2 = ((xzu) obj).l();
                Object obj4 = this.a;
                rau rauVar = new rau(obj4, 9);
                RebuildShortcutsAction rebuildShortcutsAction = (RebuildShortcutsAction) obj4;
                aktp.aa(l2.h(rauVar, rebuildShortcutsAction.d), new pum(2), rebuildShortcutsAction.c);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
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
}
