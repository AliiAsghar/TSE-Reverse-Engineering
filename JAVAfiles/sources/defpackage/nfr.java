package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nfr implements ngo {
    final /* synthetic */ nfu a;
    private final /* synthetic */ int b;

    public nfr(nfu nfuVar, int i) {
        this.b = i;
        this.a = nfuVar;
    }

    @Override // defpackage.ngo
    public final akul c() {
        akul c;
        if (this.b != 0) {
            nfu nfuVar = this.a;
            c = qjh.c(nfuVar.a, arpj.a, arwf.a, new mwv(nfuVar, (arpe) null, 5));
            return c;
        }
        akul s = this.a.d.s();
        s.getClass();
        return s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ngo
    public final /* synthetic */ Object d() {
        if (this.b != 0) {
            if (!this.a.c.a()) {
                alog t = this.a.d.t();
                t.getClass();
                nfu nfuVar = this.a;
                ArrayList arrayList = new ArrayList(aqjn.J(t, 10));
                alur it = t.iterator();
                while (it.hasNext()) {
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                    lig ligVar = nfuVar.e;
                    Optional.empty();
                    arrayList.add(ligVar.h(bindData));
                }
                return alzz.aZ(arrayList);
            }
            throw new UnsupportedOperationException("Blocking API is not supported.");
        }
        if (!this.a.c.a()) {
            alog t2 = this.a.d.t();
            t2.getClass();
            return t2;
        }
        throw new UnsupportedOperationException("Blocking API is not supported.");
    }
}
