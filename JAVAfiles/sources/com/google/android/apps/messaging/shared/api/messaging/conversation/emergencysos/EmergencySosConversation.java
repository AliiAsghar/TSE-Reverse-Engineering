package com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import defpackage.armf;
import defpackage.arwe;
import defpackage.kor;
import defpackage.kzp;
import defpackage.lfx;
import defpackage.lpg;
import defpackage.lrf;
import defpackage.ltv;
import defpackage.mja;
import defpackage.mjg;
import defpackage.mlu;
import defpackage.ncq;
import defpackage.qiu;
import defpackage.uvn;
import defpackage.wsl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EmergencySosConversation implements Conversation {
    public static final Parcelable.Creator<Conversation> CREATOR = new ltv(5);
    private final EmergencySosConversationId a;
    private final BugleConversation b;
    private final ncq c;
    private final armf d;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        lrf Qs();

        mlu ai();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    public EmergencySosConversation(kor korVar, lpg lpgVar, armf armfVar, BugleConversation bugleConversation) {
        EmergencySosConversationId emergencySosConversationId = new EmergencySosConversationId(bugleConversation.j().a);
        this.a = emergencySosConversationId;
        this.b = bugleConversation;
        ncq l = bugleConversation.l();
        arwe arweVar = (arwe) lpgVar.a.b();
        arweVar.getClass();
        l.getClass();
        this.c = korVar.u(new kzp(arweVar, emergencySosConversationId, l, 3));
        this.d = armfVar;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final mja a() {
        return this.b.a();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final mjg b() {
        return this.b.k();
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
        return this.c;
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
        qiu.f(((wsl) this.d.b()).a(), "Failed to retrieve current session status on emergency sos conversation displayed.");
        this.b.h();
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
