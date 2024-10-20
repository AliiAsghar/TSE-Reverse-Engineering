package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arlv extends aqtz {
    public static final Logger f = Logger.getLogger(arlv.class.getName());
    public final aqtr h;
    protected boolean i;
    protected aqsd k;
    public List g = new ArrayList(0);
    protected final aqua j = new arfe();

    /* JADX INFO: Access modifiers changed from: protected */
    public arlv(aqtr aqtrVar) {
        this.h = aqtrVar;
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "<init>", "Created");
    }

    @Override // defpackage.aqtz
    public final Status a(aqtv aqtvVar) {
        ArrayList arrayList;
        Status status;
        try {
            this.i = true;
            f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "acceptResolvedAddressesInternal", "Received resolution result: {0}", aqtvVar);
            LinkedHashMap ak = alzz.ak(aqtvVar.a.size());
            Iterator it = aqtvVar.a.iterator();
            while (true) {
                arrayList = null;
                if (!it.hasNext()) {
                    break;
                }
                aqsq aqsqVar = (aqsq) it.next();
                aqrm aqrmVar = aqrm.a;
                List list = aqtvVar.a;
                aqrm aqrmVar2 = aqtvVar.b;
                Object obj = aqtvVar.c;
                List singletonList = Collections.singletonList(aqsqVar);
                aqrk aqrkVar = new aqrk(aqrm.a);
                aqrkVar.b(e, true);
                ak.put(new arlu(aqsqVar), new aqtv(singletonList, aqrkVar.a(), null));
            }
            if (ak.isEmpty()) {
                status = Status.n.withDescription("NameResolver returned no usable address. ".concat(String.valueOf(String.valueOf(aqtvVar))));
                b(status);
            } else {
                LinkedHashMap ak2 = alzz.ak(this.g.size());
                for (arlt arltVar : this.g) {
                    ak2.put(arltVar.a, arltVar);
                }
                ArrayList arrayList2 = new ArrayList(ak.size());
                for (Map.Entry entry : ak.entrySet()) {
                    arlt arltVar2 = (arlt) ak2.remove(entry.getKey());
                    if (arltVar2 == null) {
                        arltVar2 = f(entry.getKey());
                    }
                    arrayList2.add(arltVar2);
                    if (entry.getValue() != null) {
                        ((aqtv) entry.getValue()).getClass();
                        arltVar2.b.c((aqtv) entry.getValue());
                    }
                }
                this.g = arrayList2;
                arrayList = new ArrayList(ak2.values());
                status = Status.b;
            }
            if (status.f()) {
                g();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((arlt) it2.next()).b();
                }
            }
            return status;
        } finally {
            this.i = false;
        }
    }

    @Override // defpackage.aqtz
    public final void b(Status status) {
        if (this.k != aqsd.READY) {
            this.h.f(aqsd.TRANSIENT_FAILURE, new aqtq(aqtt.a(status)));
        }
    }

    @Override // defpackage.aqtz
    public final void e() {
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "shutdown", "Shutdown");
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((arlt) it.next()).b();
        }
        this.g.clear();
    }

    protected arlt f(Object obj) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void g();
}
