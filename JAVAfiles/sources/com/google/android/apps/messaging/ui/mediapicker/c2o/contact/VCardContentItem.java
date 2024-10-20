package com.google.android.apps.messaging.ui.mediapicker.c2o.contact;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import defpackage.aant;
import defpackage.aapv;
import defpackage.ameb;
import defpackage.rtb;
import defpackage.rtc;
import defpackage.rtd;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class VCardContentItem extends MediaContentItem {
    public static final Parcelable.Creator<VCardContentItem> CREATOR = new aapv(1);
    private final rtb a;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface a {
        aant PC();
    }

    public VCardContentItem(rtb rtbVar, Uri uri, ameb amebVar) {
        super(uri, "text/x-vCard", amebVar);
        this.a = rtbVar;
    }

    public final MessagePartCoreData b() {
        rtc a2 = rtd.a();
        a2.c = this.c;
        Uri uri = this.b;
        a2.d = uri;
        a2.e = uri;
        a2.m(-1);
        a2.e(-1);
        a2.k(this.d);
        return this.a.e(a2.a());
    }

    public VCardContentItem(rtb rtbVar, Parcel parcel) {
        super(parcel);
        this.a = rtbVar;
    }
}
