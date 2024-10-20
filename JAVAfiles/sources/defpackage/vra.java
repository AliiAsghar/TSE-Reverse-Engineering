package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.group.GroupInfo;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vra implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vra(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v55, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v41, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.util.List, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                aozb aozbVar = (aozb) obj;
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                vqa vqaVar = (vqa) aozyVar.b;
                vqa vqaVar2 = vqa.a;
                aozbVar.getClass();
                vqaVar.b |= 1;
                vqaVar.e = aozbVar;
                return;
            case 1:
                ((Bundle) this.a).putString("extra_notification_tag", (String) obj);
                return;
            case 2:
                Object obj2 = this.a;
                vrj vrjVar = (vrj) obj2;
                vrm vrmVar = (vrm) obj;
                if (((okj) vrjVar.m.b()).a()) {
                    vrjVar.k.ifPresent(new rge(obj2, vrmVar, 19));
                } else {
                    vrjVar.k.ifPresent(new vra(vrmVar, 3));
                }
                aktp.ah(new ung(obj2, vrmVar, 13), vrjVar.g).k(qiu.b(), vrjVar.g);
                return;
            case 3:
                Object obj3 = this.a;
                vrl vrlVar = (vrl) obj;
                akrh e = aktp.e("onRcsAvailabilityUpdate_notifyListener");
                try {
                    vrlVar.am((vrm) obj3);
                    e.close();
                    return;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 4:
                Object obj4 = this.a;
                vrl vrlVar2 = (vrl) obj;
                akrh e2 = aktp.e("onRcsAvailabilityUpdate_updateRcsAvailability");
                try {
                    vrlVar2.am((vrm) obj4);
                    e2.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        e2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 5:
                xyo a = vrt.b.a();
                a.H("[SR]: completed future for RcsAvailabilityUpdate");
                a.z("execId", ((vrs) this.a).c);
                a.q();
                return;
            case 6:
                aozy aozyVar2 = (aozy) this.a;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                amkv amkvVar = (amkv) aozyVar2.b;
                amkv amkvVar2 = amkv.a;
                amkvVar.b |= 2;
                amkvVar.d = true;
                return;
            case 7:
                aozy aozyVar3 = (aozy) this.a;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                amkv amkvVar3 = (amkv) aozyVar3.b;
                amkv amkvVar4 = amkv.a;
                amkvVar3.b |= 8;
                amkvVar3.f = true;
                return;
            case 8:
                aozy aozyVar4 = (aozy) this.a;
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                amkv amkvVar5 = (amkv) aozyVar4.b;
                amkv amkvVar6 = amkv.a;
                amkvVar5.b |= 16;
                amkvVar5.g = true;
                return;
            case 9:
                aozy aozyVar5 = (aozy) this.a;
                if (!aozyVar5.b.isMutable()) {
                    aozyVar5.u();
                }
                amkv amkvVar7 = (amkv) aozyVar5.b;
                amkv amkvVar8 = amkv.a;
                amkvVar7.b |= 4;
                amkvVar7.e = true;
                return;
            case 10:
                ((snh) this.a).w(((Long) obj).longValue());
                return;
            case 11:
                ((snh) this.a).u((String) obj);
                return;
            case 12:
                ((snh) this.a).s((String) obj);
                return;
            case 13:
                snh snhVar = new snh();
                snhVar.w(((Long) obj).longValue());
                snhVar.e(2);
                this.a.add(snhVar);
                return;
            case 14:
                snh snhVar2 = new snh();
                snhVar2.u((String) obj);
                this.a.add(snhVar2);
                return;
            case 15:
                snh snhVar3 = new snh();
                snhVar3.s((String) obj);
                this.a.add(snhVar3);
                return;
            case 16:
                alvw m = vsg.a.m();
                m.X(ydl.o, ((ConversationIdType) obj).toString());
                m.X(ydl.r, this.a);
                ((alwl) m.h("com/google/android/apps/messaging/shared/rcs/conversation/RcsConversationAndThreadIdCreatorLegacy", "conversationExistsByThreadId", 246, "RcsConversationAndThreadIdCreatorLegacy.java")).q("Existing conversation found for thread ID.");
                return;
            case 17:
                ((GroupInfo) this.a).d = (String) obj;
                return;
            case 18:
                uvm uvmVar = (uvm) obj;
                String str = uvmVar.a;
                StringBuilder sb = (StringBuilder) this.a;
                sb.append(str);
                sb.append(": ");
                sb.append(uvmVar.b);
                sb.append("\n");
                return;
            case 19:
                xou xouVar = new xou((short[]) null);
                xouVar.j("CsApkVersion");
                xouVar.k((String) obj);
                this.a.add(xouVar.i());
                return;
            default:
                aozy createBuilder = vtu.a.createBuilder();
                boolean a2 = ((ajpk) obj).a();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj5 = this.a;
                ((vtu) createBuilder.b).b = a2;
                vtu vtuVar = (vtu) createBuilder.s();
                aozy aozyVar6 = (aozy) obj5;
                if (!aozyVar6.b.isMutable()) {
                    aozyVar6.u();
                }
                vty vtyVar = (vty) aozyVar6.b;
                vty vtyVar2 = vty.a;
                vtuVar.getClass();
                vtyVar.g = vtuVar;
                vtyVar.b |= 1;
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
