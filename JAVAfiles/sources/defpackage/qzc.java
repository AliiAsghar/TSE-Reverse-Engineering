package defpackage;

import android.util.Pair;
import com.google.android.apps.messaging.shared.datamodel.action.DeleteConversationAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import io.grpc.Status;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qzc implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public qzc(argc argcVar, Collection collection, arga argaVar, Future future, boolean z, Future future2, int i) {
        this.g = i;
        this.f = collection;
        this.b = argaVar;
        this.c = future;
        this.a = z;
        this.e = future2;
        this.d = argcVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Status status;
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    for (arga argaVar : this.f) {
                        if (argaVar != this.b) {
                            argaVar.a.c(argc.c);
                        }
                    }
                    ?? r0 = this.c;
                    if (r0 != 0) {
                        r0.cancel(false);
                        if (!this.a && ((argc) this.d).t.decrementAndGet() == Integer.MIN_VALUE) {
                            Object obj = this.d;
                            ((argc) obj).g.execute(new arer(this, 7));
                        }
                    }
                    ?? r02 = this.e;
                    if (r02 != 0) {
                        r02.cancel(false);
                    }
                    Object obj2 = this.d;
                    ardq ardqVar = ((argc) obj2).D.b.A;
                    synchronized (ardqVar.a) {
                        ardqVar.b.remove(obj2);
                        if (ardqVar.b.isEmpty()) {
                            status = ardqVar.c;
                            ardqVar.b = new HashSet();
                        } else {
                            status = null;
                        }
                    }
                    if (status != null) {
                        ardqVar.d.z.o(status);
                        return;
                    }
                    return;
                }
                mho mhoVar = (mho) ((ulw) this.f).q.b();
                Object obj3 = this.d;
                boolean z = this.a;
                Object obj4 = this.e;
                mhoVar.u((amfh) this.c, (ConversationIdType) this.b, (amfe) obj4, z, (tqc) obj3);
                return;
            }
            Pair pair = (Pair) this.b;
            int intValue = ((Integer) pair.first).intValue();
            fgv fgvVar = (fgv) pair.second;
            fax faxVar = ((fau) this.d).a;
            boolean z2 = this.a;
            Object obj5 = this.c;
            Object obj6 = this.e;
            faxVar.j.i(intValue, fgvVar, (fgm) this.f, (fgr) obj6, (IOException) obj5, z2);
            return;
        }
        Object obj7 = this.f;
        boolean z3 = this.a;
        Object obj8 = this.e;
        Object obj9 = this.d;
        ((DeleteConversationAction) this.b).a.u((amfh) this.c, (ConversationIdType) obj9, (amfe) obj8, z3, (tqc) obj7);
    }

    public /* synthetic */ qzc(DeleteConversationAction deleteConversationAction, amfh amfhVar, ConversationIdType conversationIdType, amfe amfeVar, boolean z, tqc tqcVar, int i) {
        this.g = i;
        this.b = deleteConversationAction;
        this.c = amfhVar;
        this.d = conversationIdType;
        this.e = amfeVar;
        this.a = z;
        this.f = tqcVar;
    }

    public /* synthetic */ qzc(fau fauVar, Pair pair, fgm fgmVar, fgr fgrVar, IOException iOException, boolean z, int i) {
        this.g = i;
        this.d = fauVar;
        this.b = pair;
        this.f = fgmVar;
        this.e = fgrVar;
        this.c = iOException;
        this.a = z;
    }

    public /* synthetic */ qzc(ulw ulwVar, amfh amfhVar, ConversationIdType conversationIdType, amfe amfeVar, boolean z, tqc tqcVar, int i) {
        this.g = i;
        this.f = ulwVar;
        this.c = amfhVar;
        this.b = conversationIdType;
        this.e = amfeVar;
        this.a = z;
        this.d = tqcVar;
    }
}
