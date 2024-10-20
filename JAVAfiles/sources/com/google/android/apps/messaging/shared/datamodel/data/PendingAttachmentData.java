package com.google.android.apps.messaging.shared.datamodel.data;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import defpackage.ameb;
import defpackage.anen;
import defpackage.apxx;
import defpackage.armf;
import defpackage.d;
import defpackage.gh;
import defpackage.rha;
import defpackage.rtb;
import defpackage.rtg;
import defpackage.uff;
import defpackage.wfh;
import defpackage.xav;
import defpackage.xbf;
import defpackage.xnv;
import defpackage.xze;
import defpackage.xzs;
import defpackage.ydf;
import defpackage.ydk;
import defpackage.ydy;
import defpackage.yfo;
import defpackage.zxy;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PendingAttachmentData extends MessagePartData {
    public int i;
    public xzs j;
    public Uri k;
    public final Context l;
    public final ydf m;
    public final xbf n;
    public final ydk o;
    public final rtb p;
    public final wfh q;
    private final rtg r;
    public static final xze g = xze.g("Bugle", "PendingAttachmentData");
    public static final int h = (int) TimeUnit.SECONDS.toMillis(60);
    public static final Parcelable.Creator<PendingAttachmentData> CREATOR = new rha(7);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rtg di();
    }

    public PendingAttachmentData(uff uffVar, armf armfVar, xav xavVar, rtg rtgVar, yfo yfoVar, xnv xnvVar, zxy zxyVar, ydy ydyVar, Optional optional, wfh wfhVar, anen anenVar, PendingAttachmentData pendingAttachmentData) {
        super(uffVar, armfVar, xavVar, pendingAttachmentData.p, yfoVar, xnvVar, zxyVar, pendingAttachmentData.l, pendingAttachmentData.o, ydyVar, optional, wfhVar, anenVar, pendingAttachmentData);
        this.r = rtgVar;
        this.i = pendingAttachmentData.i;
        this.q = pendingAttachmentData.q;
        this.l = pendingAttachmentData.l;
        this.m = pendingAttachmentData.m;
        this.n = pendingAttachmentData.n;
        this.o = pendingAttachmentData.o;
        this.p = pendingAttachmentData.p;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.MessagePartData, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final /* synthetic */ MessagePartCoreData C() {
        rtg rtgVar = this.r;
        uff uffVar = (uff) rtgVar.g.b();
        uffVar.getClass();
        xav xavVar = (xav) rtgVar.i.b();
        xavVar.getClass();
        rtg rtgVar2 = (rtg) rtgVar.s.b();
        rtgVar2.getClass();
        yfo yfoVar = (yfo) rtgVar.j.b();
        yfoVar.getClass();
        xnv xnvVar = (xnv) rtgVar.k.b();
        xnvVar.getClass();
        zxy zxyVar = (zxy) rtgVar.l.b();
        zxyVar.getClass();
        ydy ydyVar = (ydy) rtgVar.m.b();
        ydyVar.getClass();
        Optional optional = (Optional) ((apxx) rtgVar.n).a;
        wfh wfhVar = (wfh) rtgVar.o.b();
        wfhVar.getClass();
        anen anenVar = (anen) rtgVar.p.b();
        anenVar.getClass();
        return new PendingAttachmentData(uffVar, rtgVar.h, xavVar, rtgVar2, yfoVar, xnvVar, zxyVar, ydyVar, optional, wfhVar, anenVar, this);
    }

    public final void bL() {
        xzs xzsVar = this.j;
        if (xzsVar != null) {
            this.j = null;
            xzsVar.cancel(false);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.MessagePartData, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final Uri v() {
        Uri v = super.v();
        if (v != null) {
            return v;
        }
        return this.k;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.MessagePartData, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.messaging.shared.datamodel.data.MessagePartData
    public final Uri y() {
        bL();
        return super.y();
    }

    public PendingAttachmentData(wfh wfhVar, Context context, ydf ydfVar, xbf xbfVar, ydk ydkVar, rtb rtbVar, uff uffVar, armf armfVar, xav xavVar, rtg rtgVar, yfo yfoVar, xnv xnvVar, zxy zxyVar, ydy ydyVar, Optional optional, wfh wfhVar2, anen anenVar, Parcel parcel) {
        super(uffVar, armfVar, xavVar, rtbVar, yfoVar, xnvVar, zxyVar, context, ydkVar, ydyVar, optional, wfhVar2, anenVar, parcel);
        this.r = rtgVar;
        this.i = parcel.readInt();
        this.q = wfhVar;
        this.l = context;
        this.m = ydfVar;
        this.n = xbfVar;
        this.o = ydkVar;
        this.p = rtbVar;
    }

    public PendingAttachmentData(wfh wfhVar, Context context, ydf ydfVar, xbf xbfVar, ydk ydkVar, rtb rtbVar, uff uffVar, armf armfVar, xav xavVar, rtg rtgVar, yfo yfoVar, xnv xnvVar, zxy zxyVar, ydy ydyVar, Optional optional, wfh wfhVar2, anen anenVar, MessagePartData messagePartData) {
        super(uffVar, armfVar, xavVar, rtbVar, yfoVar, xnvVar, zxyVar, context, ydkVar, ydyVar, optional, wfhVar2, anenVar, messagePartData);
        this.r = rtgVar;
        this.i = 0;
        this.q = wfhVar;
        this.l = context;
        this.m = ydfVar;
        this.n = xbfVar;
        this.o = ydkVar;
        this.p = rtbVar;
    }

    public PendingAttachmentData(wfh wfhVar, Context context, ydf ydfVar, xbf xbfVar, ydk ydkVar, rtb rtbVar, uff uffVar, armf armfVar, xav xavVar, rtg rtgVar, yfo yfoVar, xnv xnvVar, zxy zxyVar, ydy ydyVar, Optional optional, wfh wfhVar2, anen anenVar, String str, Uri uri, ameb amebVar, LocationInformation locationInformation) {
        this(wfhVar, context, ydfVar, xbfVar, ydkVar, rtbVar, uffVar, armfVar, xavVar, rtgVar, yfoVar, xnvVar, zxyVar, ydyVar, optional, wfhVar2, anenVar, str, "application/vnd.gsma.rcspushlocation+xml", uri, null, 800, 400, null, null, -1L, amebVar, -1L, locationInformation, null, null);
        d.s(gh.p("application/vnd.gsma.rcspushlocation+xml"));
    }

    public PendingAttachmentData(wfh wfhVar, Context context, ydf ydfVar, xbf xbfVar, ydk ydkVar, rtb rtbVar, uff uffVar, armf armfVar, xav xavVar, rtg rtgVar, yfo yfoVar, xnv xnvVar, zxy zxyVar, ydy ydyVar, Optional optional, wfh wfhVar2, anen anenVar, String str, Uri uri, Uri uri2, int i, int i2, long j, ameb amebVar, String str2, String str3, long j2, String str4, String str5) {
        this(wfhVar, context, ydfVar, xbfVar, ydkVar, rtbVar, uffVar, armfVar, xavVar, rtgVar, yfoVar, xnvVar, zxyVar, ydyVar, optional, wfhVar2, anenVar, null, str, uri, uri2, i, i2, str2, str3, j, amebVar, j2, null, str4, str5);
        d.s(gh.p(str));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PendingAttachmentData(defpackage.wfh r5, android.content.Context r6, defpackage.ydf r7, defpackage.xbf r8, defpackage.ydk r9, defpackage.rtb r10, defpackage.uff r11, defpackage.armf r12, defpackage.xav r13, defpackage.rtg r14, defpackage.yfo r15, defpackage.xnv r16, defpackage.zxy r17, defpackage.ydy r18, j$.util.Optional r19, defpackage.wfh r20, defpackage.anen r21, java.lang.String r22, java.lang.String r23, android.net.Uri r24, android.net.Uri r25, int r26, int r27, java.lang.String r28, java.lang.String r29, long r30, defpackage.ameb r32, long r33, com.google.android.ims.rcsservice.locationsharing.LocationInformation r35, java.lang.String r36, java.lang.String r37) {
        /*
            r4 = this;
            r0 = r4
            rtc r1 = defpackage.rtd.a()
            r2 = r22
            r1.b = r2
            r2 = r23
            r1.c = r2
            r2 = r24
            r1.d = r2
            r2 = r25
            r1.e = r2
            r2 = r26
            r1.m(r2)
            r2 = r27
            r1.e(r2)
            r2 = -1
            r1.c(r2)
            r2 = r28
            r1.g = r2
            r2 = r29
            r1.h = r2
            r2 = r30
            r1.l(r2)
            r2 = r32
            r1.k(r2)
            r2 = r33
            r1.f(r2)
            r2 = r35
            r1.i = r2
            r2 = r36
            r1.j = r2
            r2 = r37
            r1.k = r2
            rtd r1 = r1.a()
            r22 = r4
            r23 = r11
            r24 = r12
            r25 = r13
            r26 = r10
            r27 = r15
            r28 = r16
            r29 = r17
            r30 = r6
            r31 = r9
            r32 = r18
            r33 = r19
            r34 = r20
            r35 = r21
            r36 = r1
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r1 = r14
            r0.r = r1
            r1 = 0
            r0.i = r1
            r1 = r5
            r0.q = r1
            r1 = r6
            r0.l = r1
            r1 = r7
            r0.m = r1
            r1 = r8
            r0.n = r1
            r1 = r9
            r0.o = r1
            r1 = r10
            r0.p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData.<init>(wfh, android.content.Context, ydf, xbf, ydk, rtb, uff, armf, xav, rtg, yfo, xnv, zxy, ydy, j$.util.Optional, wfh, anen, java.lang.String, java.lang.String, android.net.Uri, android.net.Uri, int, int, java.lang.String, java.lang.String, long, ameb, long, com.google.android.ims.rcsservice.locationsharing.LocationInformation, java.lang.String, java.lang.String):void");
    }
}
