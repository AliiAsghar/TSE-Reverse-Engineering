package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvh implements zsr {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final /* synthetic */ int h;

    public zvh(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, int i, byte[] bArr) {
        this.h = i;
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.g = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.a = armfVar6;
        this.f = armfVar7;
    }

    @Override // defpackage.zsr
    public final /* synthetic */ zsq a(zsl zslVar, ConversationIdType conversationIdType, zsx zsxVar) {
        if (this.h != 0) {
            Context context = (Context) this.b.b();
            context.getClass();
            enh enhVar = (enh) this.c.b();
            enhVar.getClass();
            aohs aohsVar = (aohs) this.d.b();
            aohsVar.getClass();
            akbo akboVar = (akbo) this.g.b();
            akboVar.getClass();
            zlc zlcVar = (zlc) this.a.b();
            zkm zkmVar = (zkm) this.f.b();
            zkmVar.getClass();
            conversationIdType.getClass();
            zsxVar.getClass();
            return new zut(context, enhVar, aohsVar, akboVar, this.e, zlcVar, zkmVar, zslVar, conversationIdType, zsxVar);
        }
        Context context2 = (Context) this.a.b();
        context2.getClass();
        enh enhVar2 = (enh) this.b.b();
        enhVar2.getClass();
        aohs aohsVar2 = (aohs) this.c.b();
        aohsVar2.getClass();
        zlc zlcVar2 = (zlc) this.f.b();
        aair aairVar = (aair) this.g.b();
        aairVar.getClass();
        conversationIdType.getClass();
        zsxVar.getClass();
        return new zvf(context2, enhVar2, aohsVar2, this.d, this.e, zlcVar2, aairVar, zslVar, conversationIdType);
    }

    public zvh(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, int i) {
        this.h = i;
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        this.g = armfVar7;
    }
}
