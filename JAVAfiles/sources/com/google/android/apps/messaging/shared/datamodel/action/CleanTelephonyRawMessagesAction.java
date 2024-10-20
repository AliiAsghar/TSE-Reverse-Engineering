package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Telephony;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.qyx;
import defpackage.qyy;
import defpackage.utw;
import defpackage.xnv;
import defpackage.xyo;
import defpackage.xze;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class CleanTelephonyRawMessagesAction extends Action<Void> {
    private final Context b;
    private final xnv c;
    private static final xze a = xze.g("Bugle", "CleanTelephonyRawMessagesAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new qyy(1);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        qyx Nd();
    }

    public CleanTelephonyRawMessagesAction(Context context, xnv xnvVar, Parcel parcel) {
        super(parcel, amdy.CLEAN_TELEPHONY_RAW_MESSAGES_ACTION);
        this.b = context;
        this.c = xnvVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("CleanTelephonyRawMessagesAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        long longValue = ((Long) utw.F.e()).longValue();
        if (longValue != 0) {
            try {
                int delete = this.b.getContentResolver().delete(Telephony.Sms.CONTENT_URI.buildUpon().appendPath("raw").build(), defpackage.a.ck(this.c.f().toEpochMilli() - longValue, "deleted = 0 AND date < "), null);
                xyo c = a.c();
                c.F(delete);
                c.H("raw messages are deleted from Telephony");
                c.q();
            } catch (Exception e) {
                xyo b = a.b();
                b.H("cannot remove raw messages");
                b.r(e);
            }
        }
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "CLEAN_TELEPHONY_RAW_MESSAGES_ACTION_LATENCY";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
