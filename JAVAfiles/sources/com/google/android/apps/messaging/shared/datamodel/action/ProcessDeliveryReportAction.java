package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.ContentUris;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.mho;
import defpackage.ray;
import defpackage.rbq;
import defpackage.rbr;
import defpackage.wzs;
import defpackage.xnv;
import defpackage.xyo;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ProcessDeliveryReportAction extends Action<Void> implements Parcelable {
    public final armf a;
    public final xnv b;
    public final mho c;
    private final wzs e;
    private final agnq f;
    private static final xze d = xze.g("BugleDataModel", "ProcessDeliveryReportAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ray(8);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rbr Nw();
    }

    public ProcessDeliveryReportAction(armf armfVar, xnv xnvVar, wzs wzsVar, mho mhoVar, agnq agnqVar, Uri uri, int i) {
        super(amdy.PROCESS_DELIVERY_REPORT_ACTION);
        this.a = armfVar;
        this.b = xnvVar;
        this.e = wzsVar;
        this.c = mhoVar;
        this.f = agnqVar;
        this.u.t(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        this.u.r("status", i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ProcessDeliveryReportAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        akrh e = aktp.e("ProcessDeliveryReportAction.executeAction");
        try {
            Uri uri = (Uri) this.u.h(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            int a2 = this.u.a("status");
            if (ContentUris.parseId(uri) < 0) {
                xyo b = d.b();
                b.H("can't find message.");
                b.z("smsMessageUri", uri);
                b.q();
            } else {
                long epochMilli = this.b.f().toEpochMilli();
                this.e.P(uri, a2, epochMilli);
                this.f.d(new rbq(this, a2, uri, epochMilli, 0));
            }
            e.close();
            return null;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessDeliveryReport.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessDeliveryReportAction(armf armfVar, xnv xnvVar, wzs wzsVar, mho mhoVar, agnq agnqVar, Parcel parcel) {
        super(parcel, amdy.PROCESS_DELIVERY_REPORT_ACTION);
        this.a = armfVar;
        this.b = xnvVar;
        this.e = wzsVar;
        this.c = mhoVar;
        this.f = agnqVar;
    }
}
