package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfu extends arpw implements arqx {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    /* synthetic */ Object d;
    final /* synthetic */ armf e;
    final /* synthetic */ arpi f;
    final /* synthetic */ miw g;
    final /* synthetic */ ConversationId h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfu(armf armfVar, arpi arpiVar, miw miwVar, ConversationId conversationId, arpe arpeVar) {
        super(4, arpeVar);
        this.e = armfVar;
        this.f = arpiVar;
        this.g = miwVar;
        this.h = conversationId;
    }

    @Override // defpackage.arqx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        jfu jfuVar = new jfu(this.e, this.f, this.g, this.h, (arpe) obj4);
        jfuVar.b = (alog) obj;
        jfuVar.c = booleanValue;
        jfuVar.d = (miu) obj3;
        return jfuVar.b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [miu, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            Object obj2 = this.b;
            boolean z = this.c;
            ?? r4 = this.d;
            if (z) {
                arpi arpiVar = this.f;
                hak hakVar = new hak((alog) obj2, (miu) r4, this.g, this.h, (arpe) null, 4);
                this.b = null;
                this.a = 1;
                obj = arro.q(arpiVar, hakVar, this);
                if (obj == arplVar) {
                    return arplVar;
                }
            } else {
                return obj2;
            }
        }
        return (alog) obj;
    }
}
