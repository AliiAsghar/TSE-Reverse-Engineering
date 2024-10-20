package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.agxw;
import defpackage.ajwt;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.amdy;
import defpackage.anen;
import defpackage.armf;
import defpackage.ods;
import defpackage.qiu;
import defpackage.rfw;
import defpackage.rgt;
import defpackage.rhl;
import defpackage.rjo;
import defpackage.trs;
import defpackage.vby;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UploadAttachmentsToBlobstoreAction extends Action<Void> {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(20);
    public final trs a;
    public final vby b;
    public final armf c;
    public final Optional d;
    private final anen e;
    private final armf f;
    private final agxw g;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rjo de();
    }

    public UploadAttachmentsToBlobstoreAction(trs trsVar, vby vbyVar, armf armfVar, anen anenVar, Optional optional, agxw agxwVar, ArrayList arrayList, armf armfVar2) {
        super(amdy.UPLOAD_ATTACHMENTS_TO_BLOBSTORE_ACTION);
        this.a = trsVar;
        this.b = vbyVar;
        this.c = armfVar;
        this.e = anenVar;
        this.d = optional;
        this.g = agxwVar;
        if (!arrayList.isEmpty()) {
            this.u.u("parts_key", arrayList);
        }
        this.u.p("is_batch_pre_upload_key", false);
        if (!TextUtils.isEmpty(null)) {
            this.u.v("part_id_key", null);
        }
        this.f = armfVar2;
    }

    private final akul h() {
        if (this.d.isEmpty()) {
            return aktp.ag("");
        }
        return akul.g(this.g.m((ajwt) this.d.get()));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("UploadAttachmentsToBlobstoreAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        if (((ods) this.f.b()).a()) {
            v();
            return null;
        }
        rhl rhlVar = this.u;
        ArrayList m = rhlVar.m("parts_key");
        boolean y = rhlVar.y("is_batch_pre_upload_key");
        String l = rhlVar.l("part_id_key");
        if (m != null && !m.isEmpty()) {
            qiu.f(h().i(new rgt(this, m, y, l, 0), this.e), "Error uploading blobs");
            return null;
        }
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UploadAttachmentsToBlobstore.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        rhl rhlVar = this.u;
        ArrayList m = this.u.m("parts_key");
        boolean y = rhlVar.y("is_batch_pre_upload_key");
        String l = rhlVar.l("part_id_key");
        if (m != null && !m.isEmpty()) {
            qiu.f(h().i(new rgt(this, m, y, l, 2), this.e), "Error uploading blobs");
            return null;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public UploadAttachmentsToBlobstoreAction(trs trsVar, vby vbyVar, armf armfVar, anen anenVar, Optional optional, agxw agxwVar, armf armfVar2, Parcel parcel) {
        super(parcel, amdy.UPLOAD_ATTACHMENTS_TO_BLOBSTORE_ACTION);
        this.a = trsVar;
        this.b = vbyVar;
        this.c = armfVar;
        this.e = anenVar;
        this.d = optional;
        this.g = agxwVar;
        this.f = armfVar2;
    }
}
