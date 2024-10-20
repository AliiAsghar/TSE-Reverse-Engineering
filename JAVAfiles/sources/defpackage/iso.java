package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class iso implements akgh<List<wok>> {
    final /* synthetic */ itb a;

    public iso(itb itbVar) {
        this.a = itbVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        xzb.p("Bugle", th, "Error: getting reminders within conversation. ".concat(String.valueOf(String.valueOf(this.a.af))));
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        boolean z;
        Long l;
        List<wok> list = (List) obj;
        to toVar = new to();
        itb itbVar = this.a;
        itbVar.av = toVar;
        Iterator it = itbVar.O.iterator();
        while (it.hasNext()) {
            ((ListenableFuture) it.next()).cancel(false);
        }
        itbVar.O.clear();
        vl vlVar = new vl();
        for (wok wokVar : list) {
            MessageIdType b = rvc.b(wokVar.b);
            long j = wokVar.c;
            if (itbVar.au.containsKey(b)) {
                ece eceVar = (ece) itbVar.au.get(b);
                if (eceVar != null && (l = (Long) eceVar.a) != null) {
                    z = itbVar.C(l.longValue());
                } else {
                    z = false;
                }
                boolean C = itbVar.C(j);
                boolean contains = itbVar.av.contains(b);
                if (!C && z && !contains) {
                    itbVar.av.add(b);
                    xzb.c("ReminderAnimation", "Snoozed reminder ".concat(String.valueOf(b.a())));
                }
            }
            vlVar.put(b, new ece(Long.valueOf(j), false));
            if (!itbVar.C(j)) {
                anem schedule = itbVar.B.schedule(anet.a, itbVar.b(j), TimeUnit.MILLISECONDS);
                itbVar.C.j(ahlp.l(schedule), new ahlp(b), itbVar.X);
                itbVar.O.add(schedule);
            }
        }
        itbVar.au = vlVar;
        ird irdVar = itbVar.aq;
        irr irrVar = irdVar.c;
        if (!irrVar.h.isEmpty() || !list.isEmpty()) {
            alok alokVar = new alok();
            for (wok wokVar2 : list) {
                alokVar.h(rvc.b(wokVar2.b), Long.valueOf(wokVar2.c));
            }
            irrVar.h = alokVar.b();
            irrVar.p();
        }
        irdVar.b.F();
    }

    @Override // defpackage.akgh
    public final void b() {
    }
}
