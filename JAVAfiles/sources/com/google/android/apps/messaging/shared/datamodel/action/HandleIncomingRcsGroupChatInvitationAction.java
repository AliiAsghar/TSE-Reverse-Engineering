package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.qyy;
import defpackage.qzo;
import defpackage.ryg;
import defpackage.tqx;
import defpackage.uhg;
import defpackage.ujv;
import defpackage.vsh;
import defpackage.xnv;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class HandleIncomingRcsGroupChatInvitationAction extends Action<ConversationIdType> {
    public final uhg b;
    public final ujv c;
    public final ryg d;
    public final armf e;
    public final armf f;
    public final xnv g;
    public final tqx h;
    public final armf i;
    private final Context j;
    private final armf k;
    private final armf l;
    private final agnq m;
    private final vsh n;
    private final armf o;
    public static final xze a = xze.g("BugleDataModel", "HandleIncomingRcsGroupChatInvitationAction");
    public static final Parcelable.Creator<Action<ConversationIdType>> CREATOR = new qyy(16);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        qzo Nm();
    }

    public HandleIncomingRcsGroupChatInvitationAction(Context context, uhg uhgVar, ujv ujvVar, ryg rygVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, xnv xnvVar, tqx tqxVar, agnq agnqVar, vsh vshVar, armf armfVar5, armf armfVar6, Parcel parcel) {
        super(parcel, amdy.HANDLE_INCOMING_RCS_GROUP_CHAT_INVITATION_ACTION);
        this.j = context;
        this.b = uhgVar;
        this.c = ujvVar;
        this.d = rygVar;
        this.e = armfVar;
        this.k = armfVar2;
        this.l = armfVar3;
        this.f = armfVar4;
        this.g = xnvVar;
        this.h = tqxVar;
        this.m = agnqVar;
        this.n = vshVar;
        this.o = armfVar5;
        this.i = armfVar6;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("HandleIncomingRcsGroupChatInvitationAction");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0138 A[Catch: all -> 0x0208, TryCatch #0 {all -> 0x0208, blocks: (B:3:0x0008, B:5:0x0010, B:9:0x0014, B:11:0x005f, B:12:0x008b, B:14:0x0091, B:17:0x009b, B:22:0x00a1, B:26:0x0134, B:28:0x0138, B:29:0x0150, B:30:0x0168, B:32:0x016e, B:35:0x0178, B:40:0x0182, B:41:0x0192, B:43:0x0198, B:50:0x01a8, B:46:0x01ac, B:53:0x01b0, B:54:0x01bd, B:56:0x01c3, B:58:0x01db, B:61:0x00d1, B:63:0x00f4, B:64:0x010a, B:66:0x0111), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016e A[Catch: all -> 0x0208, TryCatch #0 {all -> 0x0208, blocks: (B:3:0x0008, B:5:0x0010, B:9:0x0014, B:11:0x005f, B:12:0x008b, B:14:0x0091, B:17:0x009b, B:22:0x00a1, B:26:0x0134, B:28:0x0138, B:29:0x0150, B:30:0x0168, B:32:0x016e, B:35:0x0178, B:40:0x0182, B:41:0x0192, B:43:0x0198, B:50:0x01a8, B:46:0x01ac, B:53:0x01b0, B:54:0x01bd, B:56:0x01c3, B:58:0x01db, B:61:0x00d1, B:63:0x00f4, B:64:0x010a, B:66:0x0111), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0198 A[Catch: all -> 0x0208, TryCatch #0 {all -> 0x0208, blocks: (B:3:0x0008, B:5:0x0010, B:9:0x0014, B:11:0x005f, B:12:0x008b, B:14:0x0091, B:17:0x009b, B:22:0x00a1, B:26:0x0134, B:28:0x0138, B:29:0x0150, B:30:0x0168, B:32:0x016e, B:35:0x0178, B:40:0x0182, B:41:0x0192, B:43:0x0198, B:50:0x01a8, B:46:0x01ac, B:53:0x01b0, B:54:0x01bd, B:56:0x01c3, B:58:0x01db, B:61:0x00d1, B:63:0x00f4, B:64:0x010a, B:66:0x0111), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c3 A[Catch: all -> 0x0208, LOOP:3: B:54:0x01bd->B:56:0x01c3, LOOP_END, TryCatch #0 {all -> 0x0208, blocks: (B:3:0x0008, B:5:0x0010, B:9:0x0014, B:11:0x005f, B:12:0x008b, B:14:0x0091, B:17:0x009b, B:22:0x00a1, B:26:0x0134, B:28:0x0138, B:29:0x0150, B:30:0x0168, B:32:0x016e, B:35:0x0178, B:40:0x0182, B:41:0x0192, B:43:0x0198, B:50:0x01a8, B:46:0x01ac, B:53:0x01b0, B:54:0x01bd, B:56:0x01c3, B:58:0x01db, B:61:0x00d1, B:63:0x00f4, B:64:0x010a, B:66:0x0111), top: B:2:0x0008 }] */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.HandleIncomingRcsGroupChatInvitationAction.b():java.lang.Object");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.HandleIncomingRcsGroupChatInvitation.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
