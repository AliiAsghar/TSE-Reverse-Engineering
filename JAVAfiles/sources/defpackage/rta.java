package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rta implements tqx {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final armf l;

    public rta(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.g = armfVar7;
        armfVar8.getClass();
        this.h = armfVar8;
        armfVar9.getClass();
        this.i = armfVar9;
        armfVar10.getClass();
        this.j = armfVar10;
        armfVar11.getClass();
        this.k = armfVar11;
        armfVar12.getClass();
        this.l = armfVar12;
    }

    @Override // defpackage.tqx
    public final /* bridge */ /* synthetic */ MessageCoreData a() {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        ((vyv) this.f.b()).getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, this.g, this.h, this.i, this.j, ibiVar);
    }

    @Override // defpackage.tqx
    public final /* bridge */ /* synthetic */ MessageCoreData b(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        vyv vyvVar = (vyv) this.f.b();
        vyvVar.getClass();
        parcel.getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        armf armfVar = this.h;
        armf armfVar2 = this.i;
        armf armfVar3 = this.j;
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, vyvVar, this.g, parcel, armfVar, armfVar2, armfVar3, ibiVar);
    }

    @Override // defpackage.tqx
    public final /* synthetic */ MessageCoreData c(String str, ConversationIdType conversationIdType, String str2, SelfIdentityId selfIdentityId, String str3, String str4, long j, long j2, boolean z, boolean z2, int i, String str5) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        vyv vyvVar = (vyv) this.f.b();
        vyvVar.getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        conversationIdType.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, vyvVar, this.g, this.h, this.i, this.j, ibiVar, str, conversationIdType, str2, selfIdentityId, str3, str4, j, j2, z, z2, i, str5);
    }

    @Override // defpackage.tqx
    public final /* synthetic */ MessageCoreData d(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str, qei qeiVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        vyv vyvVar = (vyv) this.f.b();
        vyvVar.getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, vyvVar, this.g, this.h, this.i, this.j, ibiVar, conversationIdType, selfIdentityId, str, qeiVar);
    }

    @Override // defpackage.tqx
    public final /* synthetic */ MessageCoreData e(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, MessageCoreData messageCoreData) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        vyv vyvVar = (vyv) this.f.b();
        vyvVar.getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        selfIdentityId.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, vyvVar, this.g, this.h, this.i, this.j, ibiVar, conversationIdType, selfIdentityId, messageCoreData);
    }

    @Override // defpackage.tqx
    public final /* synthetic */ MessageCoreData f(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str, String str2, boolean z) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        vyv vyvVar = (vyv) this.f.b();
        vyvVar.getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, vyvVar, this.g, this.h, this.i, this.j, ibiVar, conversationIdType, selfIdentityId, str, str2, z);
    }

    @Override // defpackage.tqx
    public final /* synthetic */ MessageCoreData g(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        ((vyv) this.f.b()).getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, this.g, this.h, this.i, this.j, ibiVar, conversationIdType, lga.Y(selfIdentityId), selfIdentityId, 3, 0, MessageData.aC(rtbVar, str));
    }

    @Override // defpackage.tqx
    public final /* synthetic */ MessageCoreData h(int i, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        vyv vyvVar = (vyv) this.f.b();
        vyvVar.getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, vyvVar, this.g, this.h, this.i, this.j, ibiVar, i, conversationIdType, selfIdentityId, (String) null);
    }

    @Override // defpackage.tqx
    public final /* synthetic */ MessageCoreData i(String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, boolean z, int i, String str3, String str4, int i2, String str5, boolean z2, boolean z3, long j, int i3, long j2, long j3, long j4, String str6, tqr tqrVar, long j5) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        vyv vyvVar = (vyv) this.f.b();
        vyvVar.getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        selfIdentityId.getClass();
        conversationIdType.getClass();
        tqrVar.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, vyvVar, this.g, this.h, this.i, this.j, ibiVar, str, str2, selfIdentityId, conversationIdType, z, i, str3, str4, i2, str5, z2, z3, j, i3, j2, j3, j4, str6, tqrVar, j5);
    }

    @Override // defpackage.tqx
    public final /* synthetic */ MessageCoreData j(Uri uri, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, String str2, String str3, long j, long j2, boolean z, boolean z2, long j3) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        vyv vyvVar = (vyv) this.f.b();
        vyvVar.getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        conversationIdType.getClass();
        str.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, vyvVar, this.g, this.h, this.i, this.j, ibiVar, uri, conversationIdType, str, selfIdentityId, str2, str3, j, j2, z, z2, j3);
    }

    @Override // defpackage.tqx
    public final /* synthetic */ MessageCoreData k(String str) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        ((vyv) this.f.b()).getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, this.g, this.h, this.i, this.j, ibiVar, str);
    }

    @Override // defpackage.tqx
    public final /* synthetic */ MessageCoreData l(String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, boolean z2, long j, long j2, String str3) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        vyv vyvVar = (vyv) this.f.b();
        vyvVar.getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        conversationIdType.getClass();
        str3.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, vyvVar, this.g, this.h, this.i, this.j, ibiVar, str, str2, selfIdentityId, conversationIdType, i, z, z2, j, j2, str3);
    }

    @Override // defpackage.tqx
    public final /* synthetic */ MessageCoreData m(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, long j, String str2) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        vyv vyvVar = (vyv) this.f.b();
        vyvVar.getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        str.getClass();
        selfIdentityId.getClass();
        conversationIdType.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, vyvVar, this.g, this.h, this.i, this.j, ibiVar, str, selfIdentityId, conversationIdType, i, j, str2);
    }

    @Override // defpackage.tqx
    public final /* synthetic */ MessageCoreData n(ConversationIdType conversationIdType, int i, long j) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        vyv vyvVar = (vyv) this.f.b();
        vyvVar.getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, vyvVar, this.g, this.l, this.h, this.i, this.j, ibiVar, conversationIdType, i, j);
    }

    @Override // defpackage.tqx
    public final /* bridge */ /* synthetic */ MessageCoreData o(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, qei qeiVar, String str, String str2) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        vyv vyvVar = (vyv) this.f.b();
        vyvVar.getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        conversationIdType.getClass();
        str2.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, vyvVar, this.g, this.h, this.i, this.j, ibiVar, conversationIdType, selfIdentityId, qeiVar, str, str2);
    }

    @Override // defpackage.tqx
    public final /* synthetic */ MessageCoreData p(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, long j, long j2, String str2, ruz ruzVar) {
        return s(str, selfIdentityId, conversationIdType, 100, false, false, j, j2, str2, ruzVar);
    }

    @Override // defpackage.tqx
    public final /* bridge */ /* synthetic */ MessageCoreData q(String str, Uri uri, long j, long j2, rve rveVar, long j3, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, String str3, int i, boolean z, long j4, long j5, String str4, String str5) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        vyv vyvVar = (vyv) this.f.b();
        vyvVar.getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        str.getClass();
        rveVar.getClass();
        str2.getClass();
        conversationIdType.getClass();
        str4.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, vyvVar, this.g, this.h, this.i, this.j, ibiVar, str, uri, j, j2, rveVar, j3, str2, selfIdentityId, conversationIdType, str3, i, z, j4, j5, str4, str5);
    }

    @Override // defpackage.tqx
    public final /* bridge */ /* synthetic */ MessageCoreData r(rve rveVar, String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, String str2, int i, int i2, String str3, boolean z, boolean z2, long j, long j2) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        vyv vyvVar = (vyv) this.f.b();
        vyvVar.getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        rveVar.getClass();
        str.getClass();
        conversationIdType.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, vyvVar, this.g, this.h, this.i, this.j, ibiVar, rveVar, str, selfIdentityId, conversationIdType, str2, i, i2, str3, 0L, z, z2, j, j2);
    }

    public final MessageData s(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, boolean z2, long j, long j2, String str2, ruz ruzVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        vyv vyvVar = (vyv) this.f.b();
        vyvVar.getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, vyvVar, this.g, this.h, this.i, this.j, ibiVar, str, selfIdentityId, conversationIdType, i, z, z2, j, j2, str2, ruzVar);
    }

    @Override // defpackage.tqx
    public final /* synthetic */ MessageCoreData t(SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, long j, wrj wrjVar, ruz ruzVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        vyv vyvVar = (vyv) this.f.b();
        vyvVar.getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        String str = ((SelfIdentityIdImpl) selfIdentityId).a;
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, vyvVar, this.g, this.h, this.i, this.j, ibiVar, str, selfIdentityId, conversationIdType, i, j, j, wrjVar, ruzVar);
    }

    @Override // defpackage.tqx
    public final /* synthetic */ MessageCoreData u(SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, long j, String str, ruz ruzVar) {
        return s(((SelfIdentityIdImpl) selfIdentityId).a, selfIdentityId, conversationIdType, 1, true, true, j, j, str, ruzVar);
    }

    @Override // defpackage.tqx
    public final /* synthetic */ MessageCoreData v(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) this.c.b();
        rtbVar.getClass();
        tqx tqxVar = (tqx) this.d.b();
        tqxVar.getClass();
        vyv vyvVar = (vyv) this.f.b();
        vyvVar.getClass();
        ibi ibiVar = (ibi) this.k.b();
        ibiVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, xnvVar, rtbVar, tqxVar, this.e, vyvVar, this.g, this.h, this.i, this.j, ibiVar, 7, conversationIdType, selfIdentityId, str);
    }
}
