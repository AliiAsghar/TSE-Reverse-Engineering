package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ira {
    public static final xze a = xze.g("Bugle", "BaseMessageListManager");
    protected final Context b;
    protected final ConversationIdType c;
    public final ContentObserver d;
    protected final hk f;
    public final lgg k;
    public final BlockingQueue e = new LinkedBlockingQueue();
    protected final Map g = new tm();
    public final Map h = new tm();
    public final AtomicBoolean i = new AtomicBoolean(false);
    public final iqz j = new iqz(this);
    private final AtomicBoolean l = new AtomicBoolean(false);

    public ira(aksr aksrVar, Context context, ConversationIdType conversationIdType, hk hkVar, lgg lggVar) {
        iqy iqyVar = new iqy(this, aksrVar);
        this.d = iqyVar;
        this.b = context;
        this.c = conversationIdType;
        this.f = hkVar;
        this.k = lggVar;
        context.getContentResolver().registerContentObserver(upb.i(context, conversationIdType), true, iqyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i, rry rryVar) {
        rry rryVar2;
        hk hkVar = this.f;
        rry rryVar3 = null;
        if (i == hkVar.g - 1) {
            rryVar2 = null;
        } else {
            rryVar2 = (rry) hkVar.d(i + 1);
        }
        if (i != 0) {
            rryVar3 = (rry) this.f.d(i - 1);
        }
        rryVar.aY(rryVar2);
        rryVar.aX(rryVar3);
        if (rryVar2 != null && (rryVar2.aX(rryVar) || i == 0)) {
            this.f.i(i + 1, rryVar2);
        }
        if (rryVar3 != null && rryVar3.aY(rryVar)) {
            this.f.i(i - 1, rryVar3);
        }
    }

    public final void b(int i) {
        rry rryVar;
        rry rryVar2 = null;
        if (i <= 0) {
            rryVar = null;
        } else {
            rryVar = (rry) this.f.d(i - 1);
        }
        hk hkVar = this.f;
        if (i <= hkVar.g - 1) {
            rryVar2 = (rry) hkVar.d(i);
        }
        if (rryVar != null && rryVar.aY(rryVar2)) {
            this.f.i(i - 1, rryVar);
        }
        if (rryVar2 != null && rryVar2.aX(rryVar)) {
            this.f.i(i, rryVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        if (!this.i.get() && !this.l.getAndSet(true)) {
            this.k.h(this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void d();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(rry rryVar) {
        c();
        if (!rryVar.u().b() && rryVar.u().a != -1) {
            this.g.put(rryVar.u(), rryVar);
        }
        if (rryVar.v().k()) {
            this.h.put(rryVar.v(), rryVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void f(MessageIdType messageIdType, rve rveVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void g(MessageCoreData messageCoreData);
}
