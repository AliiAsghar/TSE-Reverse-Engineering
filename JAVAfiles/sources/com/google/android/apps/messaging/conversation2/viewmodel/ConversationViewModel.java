package com.google.android.apps.messaging.conversation2.viewmodel;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.armf;
import defpackage.arpe;
import defpackage.arsd;
import defpackage.arwe;
import defpackage.arxm;
import defpackage.asai;
import defpackage.eor;
import defpackage.hmk;
import defpackage.kbl;
import defpackage.kda;
import defpackage.khu;
import defpackage.khw;
import defpackage.kkk;
import defpackage.lfl;
import defpackage.lga;
import defpackage.ljt;
import defpackage.lkd;
import defpackage.odl;
import defpackage.ofn;
import defpackage.opj;
import defpackage.ork;
import defpackage.qjh;
import defpackage.ruy;
import defpackage.utz;
import defpackage.wpm;
import defpackage.wpn;
import defpackage.yig;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationViewModel extends eor {
    public static final long a = TimeUnit.SECONDS.toMillis(8);
    public final ConversationId b;
    public final arwe c;
    public final khw d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final ork l;
    public arxm m;
    public final hmk n;
    public final lga o;
    private final armf p;

    /* JADX WARN: Type inference failed for: r3v15, types: [arwe, java.lang.Object] */
    public ConversationViewModel(ConversationId conversationId, arwe arweVar, armf armfVar, khw khwVar, armf armfVar2, hmk hmkVar, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, ork orkVar, Optional optional, asai asaiVar, lkd lkdVar, Optional optional2, Optional optional3, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12) {
        conversationId.getClass();
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        asaiVar.getClass();
        lkdVar.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        armfVar11.getClass();
        armfVar12.getClass();
        this.b = conversationId;
        this.c = arweVar;
        this.p = armfVar;
        this.d = khwVar;
        this.e = armfVar2;
        this.n = hmkVar;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
        this.j = armfVar7;
        this.k = armfVar8;
        this.l = orkVar;
        lga lgaVar = (lga) arsd.k(optional);
        this.o = lgaVar == null ? new lga() : lgaVar;
        qjh.l(arweVar, null, new kda(asaiVar, lkdVar, (arpe) null, 11), 3);
        kkk kkkVar = (kkk) armfVar10.b();
        qjh.l(kkkVar.b, null, new kbl(kkkVar, (arpe) null, 14), 3);
        if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue()) {
            optional2.isPresent();
        }
        if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && ((opj) armfVar.b()).a()) {
            optional3.isPresent();
        }
        if (((odl) armfVar11.b()).a()) {
            khu khuVar = (khu) armfVar12.b();
            ConversationIdType b = ruy.b(khuVar.f.b());
            if (!b.equals(ruy.a)) {
                khuVar.a((wpn) ((wpm) khuVar.b.b()).b.c(), b, true);
                qjh.l(khuVar.c, null, new kda(khuVar, b, (arpe) null, 9), 3);
            }
        }
        if (ofn.a()) {
            lfl lflVar = (lfl) armfVar9.b();
            qjh.l(lflVar.d, null, new kbl(lflVar, (arpe) null, 20), 3);
        }
        k(new ljt(this, 1));
    }
}
