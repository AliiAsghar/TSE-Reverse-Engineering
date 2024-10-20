package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ClearSessionIdsAction;
import com.google.android.apps.messaging.shared.datamodel.action.FillPartSizeAction;
import com.google.android.apps.messaging.shared.datamodel.action.RequestSmartSuggestionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qzi implements rhp {
    public final armf a;
    public final armf b;
    private final /* synthetic */ int c;

    public qzi(armf armfVar, armf armfVar2, int i, byte[] bArr) {
        this.c = i;
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    @Override // defpackage.rhp
    public final /* synthetic */ Action c(Parcel parcel) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                ((riw) this.a.b()).getClass();
                parcel.getClass();
                return new RequestSmartSuggestionsAction(this.b, parcel);
            }
            uhj uhjVar = (uhj) this.a.b();
            uhjVar.getClass();
            agnq agnqVar = (agnq) this.b.b();
            agnqVar.getClass();
            parcel.getClass();
            return new ClearSessionIdsAction(uhjVar, agnqVar, parcel);
        }
        agnq agnqVar2 = (agnq) this.b.b();
        agnqVar2.getClass();
        parcel.getClass();
        return new FillPartSizeAction(this.a, agnqVar2, parcel);
    }

    public qzi(armf armfVar, armf armfVar2, int i) {
        this.c = i;
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public qzi(armf armfVar, armf armfVar2, int i, char[] cArr) {
        this.c = i;
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }
}
