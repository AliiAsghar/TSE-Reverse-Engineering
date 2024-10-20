package defpackage;

import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class algf<A, B> implements algk<A, B> {
    private transient algf a;

    /* JADX INFO: Access modifiers changed from: protected */
    public algf() {
    }

    protected /* bridge */ /* synthetic */ Object a(Object obj) {
        ChatMessage chatMessage = (ChatMessage) obj;
        aozy createBuilder = qej.a.createBuilder();
        aozb b = chatMessage.b();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qej qejVar = (qej) createBuilder.b;
        qejVar.b |= 2;
        qejVar.d = b;
        qel qelVar = (qel) pvy.a.m().fu(chatMessage.a());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qej qejVar2 = (qej) createBuilder.b;
        qelVar.getClass();
        qejVar2.c = qelVar;
        qejVar2.b |= 1;
        return (qej) createBuilder.s();
    }

    @Override // defpackage.algk
    @Deprecated
    public final B apply(A a) {
        return (B) fu(a);
    }

    protected /* synthetic */ Object b(Object obj) {
        qej qejVar = (qej) obj;
        ajur ajurVar = new ajur(null);
        if ((qejVar.b & 1) != 0) {
            algf algfVar = pvy.a;
            qel qelVar = qejVar.c;
            if (qelVar == null) {
                qelVar = qel.a;
            }
            ajurVar.n((ContentType) algfVar.fu(qelVar));
        }
        if ((qejVar.b & 2) != 0) {
            ajurVar.m(qejVar.d);
        }
        return ajurVar.l();
    }

    public Object fq(Object obj) {
        if (obj == null) {
            return null;
        }
        Object a = a(obj);
        a.getClass();
        return a;
    }

    public Object fu(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b = b(obj);
        b.getClass();
        return b;
    }

    public final algf m() {
        algf algfVar = this.a;
        if (algfVar == null) {
            alge algeVar = new alge(this);
            this.a = algeVar;
            return algeVar;
        }
        return algfVar;
    }

    public algf(byte[] bArr) {
        this();
    }
}
