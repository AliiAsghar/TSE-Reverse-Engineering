package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveMmsMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rdo implements rhp {
    private final armf a;
    private final armf b;

    public rdo(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public final /* bridge */ /* synthetic */ Action a(int i, byte[] bArr, long j, int i2, int i3) {
        rec recVar = (rec) this.a.b();
        recVar.getClass();
        return new ReceiveMmsMessageAction(i, bArr, j, i2, i3, recVar);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        parcel.getClass();
        rec recVar = (rec) this.b.b();
        recVar.getClass();
        return new ReceiveMmsMessageAction(parcel, recVar);
    }
}
