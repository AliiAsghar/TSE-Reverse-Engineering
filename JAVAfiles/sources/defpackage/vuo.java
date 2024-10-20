package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vuo {
    public static final xze a = xze.g("BugleGroupManagement", "GroupManagementAnalyticsImpl");
    public final armf b;
    public final vur c;
    public final aneo d;
    public final aneo e;
    public final zap f;
    private final vqu g;

    public vuo(zap zapVar, vqu vquVar, armf armfVar, vur vurVar, aneo aneoVar, aneo aneoVar2) {
        this.f = zapVar;
        this.g = vquVar;
        this.b = armfVar;
        this.c = vurVar;
        this.d = aneoVar;
        this.e = aneoVar2;
    }

    public final akul a(ConversationIdType conversationIdType) {
        vqu vquVar = this.g;
        akul ag = aktp.ag(conversationIdType);
        vquVar.getClass();
        return ag.h(new vgd(vquVar, 17), this.d);
    }
}
