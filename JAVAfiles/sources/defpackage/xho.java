package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xho {
    static final alhr a = uuh.w("log_rcs_message_id_with_duplicate_rcs_message_id_event");
    public final armf b;

    public xho(armf armfVar) {
        this.b = armfVar;
    }

    public static aozy a(MessageCoreData messageCoreData, MessageCoreData messageCoreData2) {
        Duration ofMillis = Duration.ofMillis(messageCoreData2.n() - messageCoreData.n());
        aozy createBuilder = amuz.a.createBuilder();
        aozn i = aotl.i(ofMillis);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amuz amuzVar = (amuz) createBuilder.b;
        i.getClass();
        amuzVar.c = i;
        amuzVar.b |= 1;
        aozy createBuilder2 = amuy.a.createBuilder();
        int j = messageCoreData.j();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amuy amuyVar = (amuy) createBuilder2.b;
        amuyVar.b |= 1;
        amuyVar.c = j;
        int i2 = ihq.a;
        int a2 = ihq.a(messageCoreData.P());
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amuy amuyVar2 = (amuy) createBuilder2.b;
        amuyVar2.d = a2 - 1;
        amuyVar2.b |= 2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amuz amuzVar2 = (amuz) createBuilder.b;
        amuy amuyVar3 = (amuy) createBuilder2.s();
        amuyVar3.getClass();
        amuzVar2.d = amuyVar3;
        amuzVar2.b |= 2;
        aozy createBuilder3 = amuy.a.createBuilder();
        int j2 = messageCoreData2.j();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        amuy amuyVar4 = (amuy) createBuilder3.b;
        amuyVar4.b |= 1;
        amuyVar4.c = j2;
        int a3 = ihq.a(messageCoreData2.P());
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        amuy amuyVar5 = (amuy) createBuilder3.b;
        amuyVar5.d = a3 - 1;
        amuyVar5.b |= 2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amuz amuzVar3 = (amuz) createBuilder.b;
        amuy amuyVar6 = (amuy) createBuilder3.s();
        amuyVar6.getClass();
        amuzVar3.e = amuyVar6;
        amuzVar3.b |= 4;
        if (((Boolean) ((utz) a.get()).e()).booleanValue()) {
            aozb z = aozb.z(messageCoreData.E().f());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amuz amuzVar4 = (amuz) createBuilder.b;
            amuzVar4.b |= 8;
            amuzVar4.f = z;
        }
        return createBuilder;
    }
}
