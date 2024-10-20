package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class pta implements ancr {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ pta(ptb ptbVar, ConversationIdType conversationIdType, boolean z, msh mshVar, int i) {
        this.e = i;
        this.b = ptbVar;
        this.c = conversationIdType;
        this.a = z;
        this.d = mshVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        int i = this.e;
        boolean z = true;
        byte[] bArr = null;
        if (i != 0) {
            if (i != 1) {
                String str = (String) albo.bQ(this.b);
                vib vibVar = new vib(new vup(((Boolean) albo.bQ(this.c)).booleanValue(), this.a), 13);
                zap zapVar = ((vuo) this.d).f;
                return aktp.ai(vibVar, zapVar.a).i(new vfj(zapVar, str, 6, bArr), zapVar.a).i(new vek(zapVar, 12), zapVar.a);
            }
            ConversationIdType conversationIdType = (ConversationIdType) this.c;
            if (!conversationIdType.b()) {
                boolean z2 = this.a;
                ptb ptbVar = (ptb) this.b;
                if (ptbVar.c(conversationIdType, z2)) {
                    ?? r0 = this.d;
                    if (z2) {
                        return ptbVar.e.b(r0);
                    }
                    return ptbVar.d.b(r0);
                }
            }
            return aktp.ag(qry.b());
        }
        ConversationIdType conversationIdType2 = (ConversationIdType) this.c;
        if (!conversationIdType2.b()) {
            boolean z3 = this.a;
            Object obj = this.b;
            ptb ptbVar2 = (ptb) obj;
            if (ptbVar2.c(conversationIdType2, z3)) {
                ?? r02 = this.d;
                Optional f = ptbVar2.b.f(r02);
                if (!f.isPresent() || !((psv) f.get()).f()) {
                    z = false;
                }
                if (z3 != z) {
                    ((alwl) ((alwl) ptb.a.g()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/RcsContactsCacheRefresher", "forceCacheBustingCapabilitiesExchange", 167, "RcsContactsCacheRefresher.java")).q("Found message protocol and cache mismatch, forcing cache-busting RCS capabilities exchange");
                    return ptbVar2.b.c(r02).i(new pri(obj, r02, 5, bArr), ptbVar2.c);
                }
                return aktp.ag(null);
            }
        }
        return aktp.ag(null);
    }

    public /* synthetic */ pta(vuo vuoVar, akul akulVar, akul akulVar2, boolean z, int i) {
        this.e = i;
        this.d = vuoVar;
        this.b = akulVar;
        this.c = akulVar2;
        this.a = z;
    }
}
