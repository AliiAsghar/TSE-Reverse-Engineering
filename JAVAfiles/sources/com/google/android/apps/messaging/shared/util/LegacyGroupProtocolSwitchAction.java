package com.google.android.apps.messaging.shared.util;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alog;
import defpackage.alur;
import defpackage.amdy;
import defpackage.armf;
import defpackage.qwm;
import defpackage.rhl;
import defpackage.rtz;
import defpackage.ruy;
import defpackage.ryg;
import defpackage.sdr;
import defpackage.ujv;
import defpackage.ujx;
import defpackage.xnv;
import defpackage.xwe;
import defpackage.xyl;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LegacyGroupProtocolSwitchAction extends Action<Void> {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new sdr(14);
    private final armf a;
    private final ujv b;
    private final ryg c;
    private final xnv d;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        xwe Nr();
    }

    public LegacyGroupProtocolSwitchAction(armf<rtz> armfVar, ujv ujvVar, ryg rygVar, xnv xnvVar, Parcel parcel) {
        super(parcel, amdy.LEGACY_GROUP_PROTOCOL_SWITCH_ACTION);
        this.a = armfVar;
        this.b = ujvVar;
        this.c = rygVar;
        this.d = xnvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List h(ConversationIdType conversationIdType, String str) {
        ArrayList arrayList = new ArrayList();
        alur it = ((alog) ((rtz) this.a.b()).K(conversationIdType)).iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            if (!str.equals(bindData.M())) {
                arrayList.add(bindData);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("LegacyGroupProtocolSwitchAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.LegacyGroupProtocolSwitch.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        long j;
        long j2;
        ConversationIdType b = ruy.b(this.u.l("conversation_id"));
        rhl rhlVar = this.u;
        ujv ujvVar = this.b;
        int a2 = rhlVar.a("sub_id");
        int a3 = rhlVar.a("recipient_count");
        boolean y = rhlVar.y("is_rcs");
        String l = rhlVar.l("self_id");
        int e = ujvVar.e(false, b, y, false, a3, a2);
        if (ujx.e(e)) {
            qwm f = this.c.f(a2);
            ujv ujvVar2 = this.b;
            List h = h(b, l);
            xyl.k(ujx.e(e));
            long g = ((rtz) ujvVar2.c.b()).g(b);
            Optional empty = Optional.empty();
            ParticipantsTable.BindData a4 = f.a();
            if (g == 0) {
                j2 = ujvVar2.e.f().toEpochMilli();
            } else {
                j2 = g + 1;
            }
            ujvVar2.h(empty, b, f, a4, h, e, j2, -1L);
            return null;
        }
        if (e != 204) {
            if (e == 205) {
                e = 205;
            } else {
                return null;
            }
        }
        long g2 = ((rtz) this.a.b()).g(b);
        ujv ujvVar3 = this.b;
        Optional empty2 = Optional.empty();
        List h2 = h(b, l);
        if (g2 == 0) {
            j = this.d.f().toEpochMilli();
        } else {
            j = g2 + 1;
        }
        ujvVar3.k(empty2, b, h2, e, j);
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public LegacyGroupProtocolSwitchAction(armf<rtz> armfVar, ujv ujvVar, ryg rygVar, xnv xnvVar, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, int i, int i2, boolean z) {
        super(amdy.LEGACY_GROUP_PROTOCOL_SWITCH_ACTION);
        this.u.v("conversation_id", conversationIdType.a());
        if (selfIdentityId != null) {
            this.u.v("self_id", selfIdentityId.a());
        }
        this.u.r("sub_id", i);
        this.u.r("recipient_count", i2);
        this.u.p("is_rcs", z);
        this.a = armfVar;
        this.b = ujvVar;
        this.c = rygVar;
        this.d = xnvVar;
    }
}
