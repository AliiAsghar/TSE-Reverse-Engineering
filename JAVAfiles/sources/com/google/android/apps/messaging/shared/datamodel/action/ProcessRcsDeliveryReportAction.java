package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.amdy;
import defpackage.amgu;
import defpackage.ray;
import defpackage.rdc;
import defpackage.rdd;
import defpackage.rhl;
import defpackage.rve;
import defpackage.vxz;
import defpackage.xct;
import defpackage.xze;
import defpackage.yle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ProcessRcsDeliveryReportAction extends Action<Void> {
    private final rdc b;
    private static final xze a = xze.g("BugleDataModel", "ProcessRcsDeliveryReportAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ray(16);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rdd ND();
    }

    public ProcessRcsDeliveryReportAction(rdc rdcVar, Parcel parcel) {
        super(parcel, amdy.PROCESS_RCS_DELIVERY_REPORT_ACTION);
        this.b = rdcVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ProcessRcsDeliveryReportAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessRcsDeliveryReport.ExecuteAction.Latency";
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [armf, java.lang.Object] */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        a.o("Executing ProcessRcsDeliveryReportAction");
        ChatSessionMessageEvent chatSessionMessageEvent = (ChatSessionMessageEvent) this.u.h("chat_message_event");
        rhl rhlVar = this.u;
        return ((vxz) this.b.a.b()).a(chatSessionMessageEvent, rhlVar.y("etouffee_report"), rve.a(rhlVar.l("imdn_rcs_message_id")), yle.a(this.u.A("chat.extra.logData")));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ProcessRcsDeliveryReportAction(defpackage.rdc r8, com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent r9, java.lang.String r10) {
        /*
            r7 = this;
            amgu r0 = defpackage.amgu.a
            aozy r0 = r0.createBuilder()
            amgl r0 = (defpackage.amgl) r0
            amxo r1 = defpackage.amxo.RCS_LEGACY
            apag r2 = r0.b
            boolean r2 = r2.isMutable()
            if (r2 != 0) goto L15
            r0.u()
        L15:
            apag r2 = r0.b
            amgu r2 = (defpackage.amgu) r2
            int r1 = r1.h
            r2.aa = r1
            int r1 = r2.c
            r3 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r3
            r2.c = r1
            apag r0 = r0.s()
            r6 = r0
            amgu r6 = (defpackage.amgu) r6
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ProcessRcsDeliveryReportAction.<init>(rdc, com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent, java.lang.String):void");
    }

    public ProcessRcsDeliveryReportAction(rdc rdcVar, ChatSessionMessageEvent chatSessionMessageEvent, String str, amgu amguVar) {
        this(rdcVar, chatSessionMessageEvent, false, str, amguVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ProcessRcsDeliveryReportAction(defpackage.rdc r8, com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent r9, boolean r10, java.lang.String r11) {
        /*
            r7 = this;
            amgu r0 = defpackage.amgu.a
            aozy r0 = r0.createBuilder()
            amgl r0 = (defpackage.amgl) r0
            amxo r1 = defpackage.amxo.RCS_LEGACY
            apag r2 = r0.b
            boolean r2 = r2.isMutable()
            if (r2 != 0) goto L15
            r0.u()
        L15:
            apag r2 = r0.b
            amgu r2 = (defpackage.amgu) r2
            int r1 = r1.h
            r2.aa = r1
            int r1 = r2.c
            r3 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r3
            r2.c = r1
            apag r0 = r0.s()
            r6 = r0
            amgu r6 = (defpackage.amgu) r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ProcessRcsDeliveryReportAction.<init>(rdc, com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent, boolean, java.lang.String):void");
    }

    public ProcessRcsDeliveryReportAction(rdc rdcVar, ChatSessionMessageEvent chatSessionMessageEvent, boolean z, String str, amgu amguVar) {
        super(amdy.PROCESS_RCS_DELIVERY_REPORT_ACTION);
        this.b = rdcVar;
        this.u.t("chat_message_event", chatSessionMessageEvent);
        this.u.p("etouffee_report", z);
        this.u.q("chat.extra.logData", amguVar.toByteArray());
        if (((Boolean) xct.d.e()).booleanValue()) {
            this.u.v("imdn_rcs_message_id", str);
        }
    }
}
