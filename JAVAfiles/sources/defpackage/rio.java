package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.GetOrCreateConversationAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rio implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;

    public rio() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Action a(Optional optional, List list, boolean z, String str, qgr qgrVar) {
        xnv xnvVar = (xnv) this.a.b();
        xnvVar.getClass();
        anen anenVar = (anen) this.d.b();
        anenVar.getClass();
        optional.getClass();
        return new GetOrCreateConversationAction(xnvVar, this.b, this.c, anenVar, optional, list, z, str, qgrVar);
    }

    public final rhj b(List list, Object obj, rin rinVar, Optional optional) {
        Action a = a(optional, list, false, null, null);
        rhj rhjVar = new rhj(new rit(rinVar, 1), a, obj);
        a.E(rhjVar);
        return rhjVar;
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        xnv xnvVar = (xnv) this.a.b();
        xnvVar.getClass();
        anen anenVar = (anen) this.d.b();
        anenVar.getClass();
        parcel.getClass();
        return new GetOrCreateConversationAction(xnvVar, this.b, this.c, anenVar, parcel);
    }

    public rio(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
    }
}
