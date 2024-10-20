package com.google.android.apps.messaging.wearable.action;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.aapv;
import defpackage.abhb;
import defpackage.abhg;
import defpackage.abrc;
import defpackage.abrg;
import defpackage.ackz;
import defpackage.acle;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alwo;
import defpackage.amdy;
import defpackage.d;
import defpackage.kos;
import defpackage.yyb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CheckWearableAppVersionAction extends Action<Void> {
    public Context c;
    private abrc d;
    public static final alwo a = alwo.o("BugleWearable");
    static final Uri b = new Uri.Builder().scheme("wear").path("/bugle/watch_version/").build();
    public static final Parcelable.Creator<CheckWearableAppVersionAction> CREATOR = new aapv(19);

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface a {
        Context C();

        abrc OX();
    }

    public CheckWearableAppVersionAction() {
        super(amdy.CHECK_WEARABLE_APP_VERSION_ACTION);
        j();
    }

    public static void h() {
        new CheckWearableAppVersionAction().z();
    }

    private final void j() {
        a aVar = (a) yyb.aL(a.class);
        this.c = aVar.C();
        this.d = aVar.OX();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("CheckWearableAppVersionAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.CheckWearableAppVersion.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        abrc abrcVar = this.d;
        Uri uri = b;
        abhb.a(uri, "uri must not be null");
        d.t(true, "invalid filter type");
        abrg abrgVar = abrcVar.i;
        ackz ackzVar = new ackz(abrgVar, uri);
        abrgVar.b(ackzVar);
        abhg.n(ackzVar, new acle(0)).s(new kos(this, 6));
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public CheckWearableAppVersionAction(Parcel parcel) {
        super(parcel, amdy.CHECK_WEARABLE_APP_VERSION_ACTION);
        j();
    }
}
