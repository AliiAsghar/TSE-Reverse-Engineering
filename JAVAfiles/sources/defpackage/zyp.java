package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/ui/conversation/details/encryption/e2eestatus/E2eeStatusUiAdapterImpl");
    public final asai b;
    public final asai c;
    public final arwe d;
    public final asai e;
    public final Conversation f;
    public final asai g;
    public final arwe h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final ansy o;
    private final Context p;
    private final String q;

    public zyp(Context context, asai asaiVar, asai asaiVar2, arwe arweVar, asai asaiVar3, Conversation conversation, asai asaiVar4, arwe arweVar2, armf armfVar, ansy ansyVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        context.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        arweVar.getClass();
        asaiVar3.getClass();
        conversation.getClass();
        arweVar2.getClass();
        armfVar.getClass();
        ansyVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        this.p = context;
        this.b = asaiVar;
        this.c = asaiVar2;
        this.d = arweVar;
        this.e = asaiVar3;
        this.f = conversation;
        this.g = asaiVar4;
        this.h = arweVar2;
        this.i = armfVar;
        this.o = ansyVar;
        this.j = armfVar2;
        this.k = armfVar3;
        this.l = armfVar4;
        this.m = armfVar5;
        this.n = armfVar6;
        String string = context.getString(R.string.more_about_rcs_chats);
        string.getClass();
        this.q = string;
    }

    public final zyq a() {
        return new zyq(2, this.p.getString(R.string.encryption_status_details_off, this.q));
    }
}
