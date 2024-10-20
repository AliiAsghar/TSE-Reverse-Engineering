package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessExpressiveStickerAttachmentAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rct implements rhp {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;

    public rct(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
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
    public final ProcessExpressiveStickerAttachmentAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        ((ydh) this.c.b()).getClass();
        xnv xnvVar = (xnv) this.d.b();
        xnvVar.getClass();
        parcel.getClass();
        return new ProcessExpressiveStickerAttachmentAction(context, this.b, xnvVar, parcel);
    }
}
