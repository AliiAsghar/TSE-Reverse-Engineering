package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.ray;
import defpackage.rct;
import defpackage.xnv;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ProcessExpressiveStickerAttachmentAction extends Action<Void> implements Parcelable {
    private final Context b;
    private final armf c;
    private final xnv d;
    private final MessagePartCoreData e;
    private static final xze a = xze.g("Bugle", "ProcessExpressiveStickerAttachmentAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ray(10);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rct Ny();
    }

    public ProcessExpressiveStickerAttachmentAction(Context context, armf armfVar, xnv xnvVar, Parcel parcel) {
        super(parcel, amdy.PROCESS_EXPRESSIVE_STICKER_ATTACHMENT_ACTION);
        this.b = context;
        this.c = armfVar;
        this.d = xnvVar;
        this.e = (MessagePartCoreData) this.u.h("part_key");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ProcessExpressiveStickerAttachmentAction");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0089  */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ProcessExpressiveStickerAttachmentAction.b():java.lang.Object");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessExpressiveStickerAttachmentAction.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessExpressiveStickerAttachmentAction(Context context, armf armfVar, xnv xnvVar, MessagePartCoreData messagePartCoreData) {
        super(amdy.PROCESS_EXPRESSIVE_STICKER_ATTACHMENT_ACTION);
        this.b = context;
        this.c = armfVar;
        this.d = xnvVar;
        this.e = messagePartCoreData;
        this.u.t("part_key", messagePartCoreData);
    }
}
