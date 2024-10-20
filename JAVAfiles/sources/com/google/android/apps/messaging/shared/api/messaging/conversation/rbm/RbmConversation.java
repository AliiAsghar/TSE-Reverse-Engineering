package com.google.android.apps.messaging.shared.api.messaging.conversation.rbm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import defpackage.albo;
import defpackage.alhr;
import defpackage.anen;
import defpackage.armf;
import defpackage.arwe;
import defpackage.fgh;
import defpackage.iew;
import defpackage.ifs;
import defpackage.jat;
import defpackage.kor;
import defpackage.lfl;
import defpackage.lfx;
import defpackage.ltv;
import defpackage.mds;
import defpackage.mja;
import defpackage.mjg;
import defpackage.mlu;
import defpackage.mpx;
import defpackage.ncq;
import defpackage.qxr;
import defpackage.uvn;
import defpackage.wfh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RbmConversation implements Conversation {
    public static final Parcelable.Creator<Conversation> CREATOR = new ltv(9);
    public final RbmConversationId a;
    public final BugleConversation b;
    public final armf c;
    public final armf d;
    private final anen e;
    private final anen f;
    private final alhr g;
    private final ncq h;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        jat Te();

        mlu ai();
    }

    /* JADX WARN: Type inference failed for: r9v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [armf, java.lang.Object] */
    public RbmConversation(anen anenVar, anen anenVar2, kor korVar, ifs ifsVar, lfl lflVar, armf armfVar, armf armfVar2, BugleConversation bugleConversation) {
        this.e = anenVar;
        this.f = anenVar2;
        this.a = new RbmConversationId(bugleConversation.j().a);
        this.b = bugleConversation;
        arwe arweVar = (arwe) ifsVar.c.b();
        arweVar.getClass();
        arwe arweVar2 = (arwe) ifsVar.b.b();
        arweVar2.getClass();
        wfh wfhVar = (wfh) ifsVar.a.b();
        wfhVar.getClass();
        iew iewVar = (iew) ifsVar.e.b();
        iewVar.getClass();
        qxr qxrVar = (qxr) ifsVar.d.b();
        qxrVar.getClass();
        this.h = korVar.u(new mpx(arweVar, arweVar2, wfhVar, iewVar, qxrVar, bugleConversation));
        this.g = albo.D(new fgh(this, lflVar, 11, null));
        this.c = armfVar;
        this.d = armfVar2;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final mja a() {
        return this.b.a();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final mjg b() {
        return (mjg) this.g.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ConversationId c() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ncq d() {
        return this.b.d();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.b.describeContents();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ncq e() {
        return this.h;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ncq f() {
        return this.b.f();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final uvn g() {
        return this.b.g();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final void h() {
        this.b.h();
        f().b().h(new mds(this, 16), this.e);
        this.h.b().h(new mds(this, 15), this.f);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final lfx i() {
        return this.b.i();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
    }
}
