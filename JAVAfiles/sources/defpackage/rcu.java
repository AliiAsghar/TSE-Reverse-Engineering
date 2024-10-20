package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessExpressiveStickerFavoriteAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rcu implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;

    public rcu(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
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

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ProcessExpressiveStickerFavoriteAction c(Parcel parcel) {
        vcc vccVar = (vcc) this.b.b();
        vccVar.getClass();
        vcf vcfVar = (vcf) this.c.b();
        vcfVar.getClass();
        wpp wppVar = (wpp) this.d.b();
        wppVar.getClass();
        parcel.getClass();
        return new ProcessExpressiveStickerFavoriteAction(this.a, vccVar, vcfVar, wppVar, this.e, parcel);
    }
}
