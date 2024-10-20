package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rsa implements Iterable<ParticipantsTable.BindData> {
    public final apwt a;
    public final apwt b;
    public final apwt c;
    public final alog d;
    public final int e;
    private final alor f;
    private final alor g;

    public rsa(apwt apwtVar, apwt apwtVar2, apwt apwtVar3, alog alogVar, alog alogVar2, alog alogVar3) {
        this.a = apwtVar;
        this.b = apwtVar2;
        this.c = apwtVar3;
        this.d = alogVar;
        int i = 17;
        this.e = (int) Collection.EL.stream(alogVar).filter(new qxi(i)).count();
        this.f = (alor) Collection.EL.stream(alogVar).collect(alls.b(new rrv(i), new rrv(18), new mcb(6)));
        int i2 = 14;
        this.g = (alor) Collection.EL.stream(alogVar).filter(new qxi(i2)).collect(alls.b(new rrv(11), new rrv(12), new mcb(7)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ParticipantsTable.BindData a() {
        if (this.e == 1) {
            alog alogVar = this.d;
            int size = alogVar.size();
            int i = 0;
            while (i < size) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) alogVar.get(i);
                i++;
                if (!ryg.l(bindData)) {
                    return bindData;
                }
            }
            xyl.c("Couldn't find other participant");
            return null;
        }
        return null;
    }

    public final ParticipantsTable.BindData b(String str) {
        return (ParticipantsTable.BindData) this.f.get(str);
    }

    public final ParticipantsTable.BindData c(String str, qei qeiVar) {
        if (qeiVar != null) {
            str = qeiVar.d;
        }
        return (ParticipantsTable.BindData) this.g.get(str);
    }

    public final Optional d() {
        ParticipantsTable.BindData a = a();
        if (a != null && ((xca) this.b.b()).l(a.P())) {
            return Optional.of(((msk) this.c.b()).s(a));
        }
        return Optional.empty();
    }

    public final Stream e() {
        return Collection.EL.stream(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return alzz.at(this.d, ((rsa) obj).d);
        }
        return false;
    }

    public final ArrayList f() {
        return (ArrayList) Collection.EL.stream(this.d).filter(new qxi(16)).collect(Collectors.toCollection(new roi(6)));
    }

    public final boolean g() {
        return vcp.i(this.d);
    }

    public final boolean h() {
        return Collection.EL.stream(this.d).anyMatch(new qxi(15));
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i() {
        if (this.e == 1) {
            alog alogVar = this.d;
            int size = alogVar.size();
            int i = 0;
            while (i < size) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) alogVar.get(i);
                i++;
                if (!ryg.l(bindData)) {
                    return rxn.p(bindData);
                }
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<ParticipantsTable.BindData> iterator() {
        return this.d.iterator();
    }
}
