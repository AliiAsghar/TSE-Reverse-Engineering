package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvn implements AutoCloseable, ujz {
    public final arwe a;
    public yga c;
    private final uqg e;
    private final lgg f;
    public final Map b = new LinkedHashMap();
    private final Map d = new LinkedHashMap();

    public mvn(arwe arweVar, uqg uqgVar, lgg lggVar) {
        this.a = arweVar;
        this.e = uqgVar;
        this.f = lggVar;
        lggVar.h(this);
    }

    @Override // defpackage.ujz
    public final void a(MessageIdType messageIdType, rve rveVar) {
        List list;
        mix c;
        messageIdType.getClass();
        rveVar.getClass();
        if (((Boolean) muv.e.e()).booleanValue()) {
            synchronized (this.d) {
                list = (List) this.d.get(rveVar);
            }
            if (list == null || list.isEmpty()) {
                synchronized (this.b) {
                    list = (List) this.b.get(messageIdType);
                }
            }
            if (list != null && !list.isEmpty() && (c = c(messageIdType, rveVar)) != null) {
                if (c != mix.SENT && c != mix.DELIVERED) {
                    c = null;
                }
                if (c != null) {
                    synchronized (list) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((mum) it.next()).e(c);
                        }
                    }
                }
            }
        }
    }

    public final mix c(MessageIdType messageIdType, rve rveVar) {
        Integer num;
        messageIdType.getClass();
        rveVar.getClass();
        if (rveVar.k()) {
            num = this.e.d(rveVar);
        } else if (lgc.x(messageIdType)) {
            num = this.e.c(messageIdType);
        } else {
            num = null;
        }
        if (num == null) {
            return null;
        }
        return lga.ax(num.intValue());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f.i(this);
        d();
        yga ygaVar = this.c;
        if (ygaVar != null) {
            yyb.aJ(ygaVar);
        }
        this.c = null;
    }

    public final void d() {
        synchronized (this.b) {
            this.b.clear();
        }
        synchronized (this.d) {
            this.d.clear();
        }
    }

    public final mjl e(MessageIdType messageIdType, rve rveVar, nfw nfwVar, mix mixVar, mjp mjpVar, long j) {
        messageIdType.getClass();
        rveVar.getClass();
        mixVar.getClass();
        Instant.ofEpochMilli(j).getClass();
        mum mumVar = new mum(nfwVar, mixVar, mjpVar);
        if (lgc.x(messageIdType)) {
            synchronized (this.b) {
                Map map = this.b;
                Object obj = map.get(messageIdType);
                if (obj == null) {
                    obj = DesugarCollections.synchronizedList(new ArrayList());
                    obj.getClass();
                    map.put(messageIdType, obj);
                }
                ((List) obj).add(mumVar);
            }
        }
        if (rveVar.k()) {
            synchronized (this.d) {
                Map map2 = this.d;
                Object obj2 = map2.get(rveVar);
                if (obj2 == null) {
                    obj2 = DesugarCollections.synchronizedList(new ArrayList());
                    obj2.getClass();
                    map2.put(rveVar, obj2);
                }
                ((List) obj2).add(mumVar);
            }
        }
        return mumVar;
    }

    @Override // defpackage.ujz
    public final /* synthetic */ void b(MessageCoreData messageCoreData) {
    }
}
