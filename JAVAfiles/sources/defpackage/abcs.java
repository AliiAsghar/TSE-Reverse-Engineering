package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abcs implements ancs {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ abcs(abcu abcuVar, ConversationId conversationId, String str, msh mshVar, String str2, boolean z, int i) {
        this.g = i;
        this.c = abcuVar;
        this.d = conversationId;
        this.a = str;
        this.e = mshVar;
        this.f = str2;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r4v0, types: [msh, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        if (this.g != 0) {
            akul a = ((vgh) this.f.b()).a((aqds) this.c);
            uam uamVar = new uam(this.b, 3);
            Object obj2 = this.d;
            return a.h(uamVar, ((vgt) obj2).g).e(Throwable.class, new tul(obj2, this.a, this.e, 11, (byte[]) null), andi.a);
        }
        String str = (String) obj;
        boolean z = this.b;
        Object obj3 = this.f;
        ?? r4 = this.e;
        String str2 = this.a;
        ?? r2 = this.d;
        Object obj4 = this.c;
        abcu abcuVar = (abcu) obj4;
        return abcuVar.n(abcuVar.d, r2, str2, r4, str, mmy.b, -1, (String) obj3, 2147483646, z);
    }

    public /* synthetic */ abcs(vgt vgtVar, armf armfVar, aqds aqdsVar, boolean z, String str, aqdr aqdrVar, int i) {
        this.g = i;
        this.d = vgtVar;
        this.f = armfVar;
        this.c = aqdsVar;
        this.b = z;
        this.a = str;
        this.e = aqdrVar;
    }
}
