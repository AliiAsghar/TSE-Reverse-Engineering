package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.CountryCodeDetectorAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qzb implements rhp {
    private final armf a;

    public qzb(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CountryCodeDetectorAction c(Parcel parcel) {
        yju yjuVar = (yju) this.a.b();
        yjuVar.getClass();
        parcel.getClass();
        return new CountryCodeDetectorAction(yjuVar, parcel);
    }

    public final /* bridge */ /* synthetic */ ThrottledAction b() {
        yju yjuVar = (yju) this.a.b();
        yjuVar.getClass();
        return new CountryCodeDetectorAction(yjuVar);
    }
}
