package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.ContentValues;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alvi;
import defpackage.amdy;
import defpackage.armf;
import defpackage.mce;
import defpackage.mho;
import defpackage.rdk;
import defpackage.rei;
import defpackage.rfl;
import defpackage.ryg;
import defpackage.rys;
import defpackage.tqx;
import defpackage.wyt;
import defpackage.xze;
import defpackage.zai;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReplaceSmsMessageAction extends Action<MessageCoreData> implements Parcelable {
    private final ryg A;
    private final mho B;
    private final armf C;
    private final armf D;
    private final armf E;
    private final armf F;
    private final armf G;
    private final armf H;
    private final rei I;
    private final zai J;
    public final armf a;
    public final armf b;
    public final armf c;
    public final rys d;
    public final tqx e;
    public final agnq f;
    public final armf g;
    public final armf h;
    public final armf i;
    private final Context l;
    private final armf m;
    private final armf n;
    private final armf o;
    private final armf p;
    private final mce q;
    private final wyt z;
    private static final alvi j = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/ReplaceSmsMessageAction");
    private static final xze k = xze.g("BugleDataModel", "ReplaceSmsMessageAction");
    public static final Parcelable.Creator<Action<MessageCoreData>> CREATOR = new rdk(15);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rfl NR();
    }

    public ReplaceSmsMessageAction(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, zai zaiVar, mce mceVar, wyt wytVar, ryg rygVar, mho mhoVar, rys rysVar, rei reiVar, tqx tqxVar, agnq agnqVar, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, Parcel parcel) {
        super(parcel, amdy.REPLACE_SMS_MESSAGE_ACTION);
        this.l = context;
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.m = armfVar4;
        this.n = armfVar5;
        this.o = armfVar6;
        this.p = armfVar7;
        this.J = zaiVar;
        this.q = mceVar;
        this.z = wytVar;
        this.A = rygVar;
        this.B = mhoVar;
        this.d = rysVar;
        this.I = reiVar;
        this.e = tqxVar;
        this.f = agnqVar;
        this.C = armfVar8;
        this.D = armfVar9;
        this.g = armfVar10;
        this.E = armfVar11;
        this.h = armfVar12;
        this.F = armfVar13;
        this.G = armfVar14;
        this.H = armfVar15;
        this.i = armfVar16;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ReplaceSmsMessageAction");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0263 A[Catch: all -> 0x03fe, TryCatch #6 {all -> 0x03fe, blocks: (B:3:0x000f, B:6:0x003a, B:8:0x0052, B:11:0x0077, B:14:0x009b, B:24:0x0105, B:29:0x0112, B:32:0x0139, B:36:0x01c0, B:42:0x01e6, B:45:0x0206, B:60:0x0239, B:63:0x0249, B:66:0x0269, B:73:0x0290, B:120:0x0263, B:121:0x0245, B:122:0x0235, B:128:0x018b, B:129:0x0134, B:144:0x0036), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0245 A[Catch: all -> 0x03fe, TRY_ENTER, TryCatch #6 {all -> 0x03fe, blocks: (B:3:0x000f, B:6:0x003a, B:8:0x0052, B:11:0x0077, B:14:0x009b, B:24:0x0105, B:29:0x0112, B:32:0x0139, B:36:0x01c0, B:42:0x01e6, B:45:0x0206, B:60:0x0239, B:63:0x0249, B:66:0x0269, B:73:0x0290, B:120:0x0263, B:121:0x0245, B:122:0x0235, B:128:0x018b, B:129:0x0134, B:144:0x0036), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0235 A[Catch: all -> 0x03fe, TRY_ENTER, TryCatch #6 {all -> 0x03fe, blocks: (B:3:0x000f, B:6:0x003a, B:8:0x0052, B:11:0x0077, B:14:0x009b, B:24:0x0105, B:29:0x0112, B:32:0x0139, B:36:0x01c0, B:42:0x01e6, B:45:0x0206, B:60:0x0239, B:63:0x0249, B:66:0x0269, B:73:0x0290, B:120:0x0263, B:121:0x0245, B:122:0x0235, B:128:0x018b, B:129:0x0134, B:144:0x0036), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0230 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #5 {all -> 0x004d, blocks: (B:143:0x0047, B:10:0x0069, B:13:0x0098, B:134:0x00ea, B:19:0x00f7, B:27:0x010c, B:34:0x0162, B:38:0x01c6, B:40:0x01d4, B:41:0x01dd, B:47:0x020c, B:54:0x0220, B:59:0x0230, B:62:0x0240, B:68:0x0281, B:70:0x0287, B:138:0x00f0, B:139:0x00f3, B:131:0x00ca, B:133:0x00d0), top: B:142:0x0047, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0240 A[Catch: all -> 0x004d, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x004d, blocks: (B:143:0x0047, B:10:0x0069, B:13:0x0098, B:134:0x00ea, B:19:0x00f7, B:27:0x010c, B:34:0x0162, B:38:0x01c6, B:40:0x01d4, B:41:0x01dd, B:47:0x020c, B:54:0x0220, B:59:0x0230, B:62:0x0240, B:68:0x0281, B:70:0x0287, B:138:0x00f0, B:139:0x00f3, B:131:0x00ca, B:133:0x00d0), top: B:142:0x0047, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0281 A[Catch: all -> 0x004d, TRY_ENTER, TryCatch #5 {all -> 0x004d, blocks: (B:143:0x0047, B:10:0x0069, B:13:0x0098, B:134:0x00ea, B:19:0x00f7, B:27:0x010c, B:34:0x0162, B:38:0x01c6, B:40:0x01d4, B:41:0x01dd, B:47:0x020c, B:54:0x0220, B:59:0x0230, B:62:0x0240, B:68:0x0281, B:70:0x0287, B:138:0x00f0, B:139:0x00f3, B:131:0x00ca, B:133:0x00d0), top: B:142:0x0047, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0365 A[Catch: all -> 0x03fc, TryCatch #3 {all -> 0x03fc, blocks: (B:78:0x02e6, B:82:0x030c, B:83:0x034f, B:85:0x0365, B:86:0x0368, B:89:0x0380, B:91:0x03eb, B:92:0x03b3, B:106:0x03db, B:105:0x03d8, B:126:0x03e0, B:80:0x0306, B:93:0x0310, B:95:0x031f, B:96:0x0337, B:100:0x03d2), top: B:43:0x0204, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0380 A[Catch: all -> 0x03fc, TRY_ENTER, TryCatch #3 {all -> 0x03fc, blocks: (B:78:0x02e6, B:82:0x030c, B:83:0x034f, B:85:0x0365, B:86:0x0368, B:89:0x0380, B:91:0x03eb, B:92:0x03b3, B:106:0x03db, B:105:0x03d8, B:126:0x03e0, B:80:0x0306, B:93:0x0310, B:95:0x031f, B:96:0x0337, B:100:0x03d2), top: B:43:0x0204, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03b3 A[Catch: all -> 0x03fc, TRY_LEAVE, TryCatch #3 {all -> 0x03fc, blocks: (B:78:0x02e6, B:82:0x030c, B:83:0x034f, B:85:0x0365, B:86:0x0368, B:89:0x0380, B:91:0x03eb, B:92:0x03b3, B:106:0x03db, B:105:0x03d8, B:126:0x03e0, B:80:0x0306, B:93:0x0310, B:95:0x031f, B:96:0x0337, B:100:0x03d2), top: B:43:0x0204, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0310 A[Catch: all -> 0x03d0, TRY_ENTER, TryCatch #0 {all -> 0x03d0, blocks: (B:80:0x0306, B:93:0x0310, B:95:0x031f, B:96:0x0337), top: B:79:0x0306, outer: #3 }] */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ReplaceSmsMessageAction.b():java.lang.Object");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReplaceSmsMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ReplaceSmsMessageAction(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, zai zaiVar, mce mceVar, wyt wytVar, ryg rygVar, mho mhoVar, rys rysVar, rei reiVar, tqx tqxVar, agnq agnqVar, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, String str, ContentValues contentValues, long j2) {
        super(amdy.REPLACE_SMS_MESSAGE_ACTION);
        this.l = context;
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.m = armfVar4;
        this.n = armfVar5;
        this.o = armfVar6;
        this.p = armfVar7;
        this.J = zaiVar;
        this.q = mceVar;
        this.z = wytVar;
        this.A = rygVar;
        this.B = mhoVar;
        this.d = rysVar;
        this.I = reiVar;
        this.e = tqxVar;
        this.f = agnqVar;
        this.C = armfVar8;
        this.D = armfVar9;
        this.g = armfVar10;
        this.E = armfVar11;
        this.h = armfVar12;
        this.F = armfVar13;
        this.G = armfVar14;
        this.H = armfVar15;
        this.i = armfVar16;
        this.u.t("message_values", contentValues);
        this.u.v("originating_address", str);
        this.u.s("message_logging_id", j2);
    }
}
