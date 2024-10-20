package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.SendReportAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rjm implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;

    public rjm() {
        throw null;
    }

    public final Action a() {
        return e(rvc.a, ruy.a, -1);
    }

    public final Action b(MessageIdType messageIdType) {
        return e(messageIdType, ruy.a, 1);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        vqu vquVar = (vqu) this.a.b();
        vquVar.getClass();
        rjm rjmVar = (rjm) this.b.b();
        rjmVar.getClass();
        wfe wfeVar = (wfe) this.c.b();
        wfeVar.getClass();
        wen wenVar = (wen) this.e.b();
        wenVar.getClass();
        parcel.getClass();
        return new SendReportAction(vquVar, rjmVar, wfeVar, this.d, wenVar, parcel);
    }

    public final Action d() {
        return e(rvc.a, ruy.a, 4);
    }

    public final /* bridge */ /* synthetic */ Action e(MessageIdType messageIdType, ConversationIdType conversationIdType, int i) {
        vqu vquVar = (vqu) this.a.b();
        vquVar.getClass();
        rjm rjmVar = (rjm) this.b.b();
        rjmVar.getClass();
        wfe wfeVar = (wfe) this.c.b();
        wfeVar.getClass();
        wen wenVar = (wen) this.e.b();
        wenVar.getClass();
        messageIdType.getClass();
        conversationIdType.getClass();
        return new SendReportAction(vquVar, rjmVar, wfeVar, this.d, wenVar, messageIdType, conversationIdType, i);
    }

    public rjm(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
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
    }
}
