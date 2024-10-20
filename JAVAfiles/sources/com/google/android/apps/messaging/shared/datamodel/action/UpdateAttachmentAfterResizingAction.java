package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.rfv;
import defpackage.rfw;
import defpackage.rgm;
import defpackage.rww;
import defpackage.tql;
import defpackage.xyo;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateAttachmentAfterResizingAction extends Action<Void> implements Parcelable {
    public final Context b;
    public final rww c;
    public final agnq d;
    public static final xze a = xze.g("Bugle", "UpdateAttachmentAfterResizingAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(9);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rgm Oa();
    }

    public UpdateAttachmentAfterResizingAction(Context context, rww rwwVar, agnq agnqVar, Parcel parcel) {
        super(parcel, amdy.UPDATE_ATTACHMENT_AFTER_RESIZING_ACTION);
        this.b = context;
        this.c = rwwVar;
        this.d = agnqVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("UpdateAttachmentAfterResizingAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        xyo c = a.c();
        c.H("UpdateAttachmentAfterResizingAction executeInScope");
        c.q();
        return (Void) this.d.b(new rfv(this, 2));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateAttachmentAfterResizing.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public UpdateAttachmentAfterResizingAction(Context context, rww rwwVar, agnq agnqVar, String str, String str2, String str3, tql tqlVar) {
        super(amdy.UPDATE_ATTACHMENT_AFTER_RESIZING_ACTION);
        this.b = context;
        this.c = rwwVar;
        this.d = agnqVar;
        this.u.v("content_uri", str);
        this.u.v("output_uri", str2);
        if (str3 != null) {
            this.u.v("content_type", str3);
        }
        this.u.r("processing_status", tqlVar.e);
    }
}
