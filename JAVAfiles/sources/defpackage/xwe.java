package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.util.LegacyGroupProtocolSwitchAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xwe implements rhp {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;

    public xwe(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final LegacyGroupProtocolSwitchAction c(Parcel parcel) {
        ujv ujvVar = (ujv) this.b.b();
        ujvVar.getClass();
        ryg rygVar = (ryg) this.c.b();
        rygVar.getClass();
        xnv xnvVar = (xnv) this.d.b();
        xnvVar.getClass();
        parcel.getClass();
        return new LegacyGroupProtocolSwitchAction(this.a, ujvVar, rygVar, xnvVar, parcel);
    }
}
