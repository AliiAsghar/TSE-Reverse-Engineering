package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ExpireWapPushSiMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.GetFrecentConversationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class riu implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final /* synthetic */ int d;

    public riu(armf armfVar, armf armfVar2, armf armfVar3, int i, byte[] bArr) {
        this.d = i;
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
    }

    public final /* synthetic */ Action a() {
        if (this.d != 0) {
            xnv xnvVar = (xnv) this.b.b();
            xnvVar.getClass();
            riu riuVar = (riu) this.c.b();
            riuVar.getClass();
            usk uskVar = (usk) this.a.b();
            uskVar.getClass();
            return new ExpireWapPushSiMessageAction(xnvVar, riuVar, uskVar);
        }
        xwx xwxVar = (xwx) this.b.b();
        xwxVar.getClass();
        qxe qxeVar = (qxe) this.c.b();
        qxeVar.getClass();
        return new GetFrecentConversationsAction(this.a, xwxVar, qxeVar);
    }

    @Override // defpackage.rhp
    public final /* synthetic */ Action c(Parcel parcel) {
        if (this.d != 0) {
            xnv xnvVar = (xnv) this.b.b();
            xnvVar.getClass();
            riu riuVar = (riu) this.c.b();
            riuVar.getClass();
            usk uskVar = (usk) this.a.b();
            uskVar.getClass();
            parcel.getClass();
            return new ExpireWapPushSiMessageAction(xnvVar, riuVar, uskVar, parcel);
        }
        xwx xwxVar = (xwx) this.b.b();
        xwxVar.getClass();
        qxe qxeVar = (qxe) this.c.b();
        qxeVar.getClass();
        parcel.getClass();
        return new GetFrecentConversationsAction(this.a, xwxVar, qxeVar, parcel);
    }

    public riu(armf armfVar, armf armfVar2, armf armfVar3, int i) {
        this.d = i;
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }
}
