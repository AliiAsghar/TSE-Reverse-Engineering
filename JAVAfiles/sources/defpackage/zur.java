package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zur implements zsr {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;

    public zur(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
    }

    @Override // defpackage.zsr
    public final /* bridge */ /* synthetic */ zsq a(zsl zslVar, ConversationIdType conversationIdType, zsx zsxVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        zlc zlcVar = (zlc) this.b.b();
        aohs aohsVar = (aohs) this.c.b();
        aohsVar.getClass();
        znp znpVar = (znp) this.d.b();
        conversationIdType.getClass();
        zsxVar.getClass();
        return new zuo(context, zlcVar, aohsVar, znpVar, zslVar);
    }
}
