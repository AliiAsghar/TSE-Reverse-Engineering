package com.google.android.apps.messaging.wearable.action;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aapv;
import defpackage.abrc;
import defpackage.acir;
import defpackage.ackf;
import defpackage.actx;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alwo;
import defpackage.amdy;
import defpackage.anen;
import defpackage.aoyj;
import defpackage.armf;
import defpackage.rhl;
import defpackage.ruy;
import defpackage.vdn;
import defpackage.vdo;
import defpackage.yvx;
import defpackage.yvy;
import defpackage.ywf;
import defpackage.yyb;
import defpackage.znj;
import java.util.ArrayList;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RequestMoreMessagesAction extends Action<Void> {
    public ywf b;
    public armf c;
    private Context d;
    private yvy e;
    private anen f;
    private abrc g;
    private znj h;
    public static final alwo a = alwo.o("BugleWearable");
    public static final Parcelable.Creator<RequestMoreMessagesAction> CREATOR = new aapv(20);

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface a {
        Context C();

        armf LY();

        abrc OM();

        znj Rc();

        yvy gu();

        ywf gv();

        anen l();
    }

    public RequestMoreMessagesAction(Parcel parcel) {
        super(parcel, amdy.REQUEST_MORE_MESSAGES_ACTION);
        h();
    }

    private final void h() {
        a aVar = (a) yyb.aL(a.class);
        this.d = aVar.C();
        this.g = aVar.OM();
        this.e = aVar.gu();
        this.h = aVar.Rc();
        this.b = aVar.gv();
        this.c = aVar.LY();
        this.f = aVar.l();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("RequestMoreMessagesAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RequestMoreMessagesAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        ConversationIdType b = ruy.b(this.u.l("conversationId"));
        rhl rhlVar = this.u;
        int a2 = rhlVar.a("offset");
        String l = rhlVar.l("nodeId");
        znj znjVar = this.h;
        Object obj = znjVar.b;
        Object obj2 = znjVar.a;
        yvx yvxVar = new yvx(new ackf());
        yvxVar.c(b);
        byte[] bArr = null;
        ArrayList c = this.e.c(yvxVar, null, null, a2, this.d);
        ackf ackfVar = new ackf();
        ackfVar.n("1", b.a());
        ackfVar.k("6", c);
        String uuid = UUID.randomUUID().toString();
        ackfVar.n("39", uuid);
        acir p = this.g.p(l, "/bugle/rpc/more_messages/", ((aoyj) actx.x(ackfVar).b).toByteArray());
        int i = 2;
        p.p(this.f, aktp.S(new vdo(this, uuid, i, bArr)));
        p.o(this.f, aktp.R(new vdn(this, uuid, i, bArr)));
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public RequestMoreMessagesAction(String str, ConversationIdType conversationIdType, int i) {
        super(amdy.REQUEST_MORE_MESSAGES_ACTION);
        h();
        rhl rhlVar = this.u;
        if (rhlVar == null) {
            return;
        }
        rhlVar.v("nodeId", str);
        this.u.v("conversationId", conversationIdType.a());
        this.u.r("offset", i);
    }
}
