package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxm {
    public static final qel a;
    public static final pwb b;

    static {
        aozy createBuilder = qel.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qel qelVar = (qel) apagVar;
        qelVar.b |= 1;
        qelVar.c = ConversationSuggestion.SUGGESTION_PROPERTY_TEXT;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qel qelVar2 = (qel) createBuilder.b;
        qelVar2.b |= 2;
        qelVar2.d = "plain";
        a = (qel) createBuilder.s();
        b = new pwb();
    }

    public static wxk a(msh mshVar, qei qeiVar, Instant instant, int i, boolean z, MessageCoreData messageCoreData, wxq wxqVar) {
        if (mshVar.p()) {
            qei qeiVar2 = (qei) mshVar.e().orElseThrow(new yaa(18));
            aozy createBuilder = wxj.a.createBuilder();
            String e = rvf.e(messageCoreData.E());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wxj wxjVar = (wxj) createBuilder.b;
            wxjVar.b |= 1;
            wxjVar.c = e;
            long s = messageCoreData.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wxj wxjVar2 = (wxj) createBuilder.b;
            wxjVar2.b |= 8;
            wxjVar2.f = s;
            apct j = aotl.j(instant);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            wxj wxjVar3 = (wxj) apagVar;
            j.getClass();
            wxjVar3.d = j;
            wxjVar3.b |= 2;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            wxj wxjVar4 = (wxj) apagVar2;
            wxjVar4.b |= 16;
            wxjVar4.g = i;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            wxj wxjVar5 = (wxj) createBuilder.b;
            wxjVar5.b |= 32;
            wxjVar5.h = z;
            atok aF = messageCoreData.aF();
            if (aF != null) {
                aozy createBuilder2 = qgr.a.createBuilder();
                String str = aF.b;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qgr qgrVar = (qgr) createBuilder2.b;
                str.getClass();
                qgrVar.b |= 1;
                qgrVar.c = str;
                qgr qgrVar2 = (qgr) createBuilder2.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                wxj wxjVar6 = (wxj) createBuilder.b;
                qgrVar2.getClass();
                wxjVar6.e = qgrVar2;
                wxjVar6.b |= 4;
            }
            aozy createBuilder3 = wxk.a.createBuilder();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            wxk wxkVar = (wxk) createBuilder3.b;
            wxqVar.getClass();
            wxkVar.f = wxqVar;
            wxkVar.b |= 8;
            aozb byteString = ((wxj) createBuilder.s()).toByteString();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apag apagVar3 = createBuilder3.b;
            wxk wxkVar2 = (wxk) apagVar3;
            wxkVar2.b |= 16;
            wxkVar2.g = byteString;
            if (!apagVar3.isMutable()) {
                createBuilder3.u();
            }
            apag apagVar4 = createBuilder3.b;
            wxk wxkVar3 = (wxk) apagVar4;
            qeiVar.getClass();
            wxkVar3.c = qeiVar;
            wxkVar3.b |= 1;
            if (!apagVar4.isMutable()) {
                createBuilder3.u();
            }
            wxk wxkVar4 = (wxk) createBuilder3.b;
            qeiVar2.getClass();
            wxkVar4.d = qeiVar2;
            wxkVar4.b |= 2;
            long s2 = messageCoreData.s();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            wxk wxkVar5 = (wxk) createBuilder3.b;
            wxkVar5.b |= 64;
            wxkVar5.i = s2;
            String e2 = rvf.e(messageCoreData.E());
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            wxk wxkVar6 = (wxk) createBuilder3.b;
            wxkVar6.b |= 4;
            wxkVar6.e = e2;
            if (aF != null) {
                aozy createBuilder4 = qgr.a.createBuilder();
                aozb z2 = aozb.z(aF.b);
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                qgr qgrVar3 = (qgr) createBuilder4.b;
                qgrVar3.c = z2.D();
                qgrVar3.b |= 1;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                wxk wxkVar7 = (wxk) createBuilder3.b;
                qgr qgrVar4 = (qgr) createBuilder4.s();
                qgrVar4.getClass();
                wxkVar7.h = qgrVar4;
                wxkVar7.b |= 32;
            }
            return (wxk) createBuilder3.s();
        }
        throw new IllegalArgumentException("RCS identifier is not a phone number");
    }
}
