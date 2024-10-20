package com.google.android.apps.messaging.shared.api.messaging.conversation.penpal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import defpackage.albo;
import defpackage.alhr;
import defpackage.arwe;
import defpackage.kor;
import defpackage.kzp;
import defpackage.lfx;
import defpackage.lqn;
import defpackage.lrf;
import defpackage.ltv;
import defpackage.miw;
import defpackage.mja;
import defpackage.mjg;
import defpackage.mlu;
import defpackage.mlz;
import defpackage.mpc;
import defpackage.nco;
import defpackage.ncq;
import defpackage.uvn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PenpalBotConversation implements Conversation {
    public static final Parcelable.Creator<Conversation> CREATOR = new ltv(7);
    public final BugleConversation a;
    private final alhr b;
    private final PenpalBotConversationId c;
    private final mpc d;
    private final ncq e;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        lrf Qk();

        mlu ai();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [armf, java.lang.Object] */
    public PenpalBotConversation(kor korVar, lqn lqnVar, lqn lqnVar2, BugleConversation bugleConversation, miw miwVar) {
        PenpalBotConversationId penpalBotConversationId = new PenpalBotConversationId(bugleConversation.j().a);
        this.c = penpalBotConversationId;
        this.a = bugleConversation;
        arwe arweVar = (arwe) lqnVar.a.b();
        arweVar.getClass();
        nco u = korVar.u(new kzp(arweVar, penpalBotConversationId, bugleConversation, 4));
        this.e = u;
        this.b = albo.D(new mlz(this, 3));
        arwe arweVar2 = (arwe) lqnVar2.a.b();
        arweVar2.getClass();
        u.getClass();
        this.d = new mpc(arweVar2, bugleConversation, miwVar, u);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final mja a() {
        return this.a.a();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final mjg b() {
        return (mjg) this.b.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ConversationId c() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ncq d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a.describeContents();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ncq e() {
        return this.e;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ncq f() {
        return this.a.f();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final uvn g() {
        return this.a.g();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final void h() {
        this.a.h();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final lfx i() {
        return this.a.i();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
    }
}
