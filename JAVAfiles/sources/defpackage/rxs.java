package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rxs implements xzh {
    public static final /* synthetic */ int a = 0;
    private static final alwo b;
    private static final List c;
    private static final Set d;
    private final armf e;
    private final armf f;

    static {
        uuh.w("enable_participant_destination_mutation_logger").getClass();
        b = alwo.o("BugleParticipantData");
        c = aqjn.B(rya.c, rya.j, rya.f, rya.h, rya.d);
        d = new LinkedHashSet();
    }

    public rxs(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        this.e = armfVar;
        this.f = armfVar2;
    }

    private static final boolean c(rya ryaVar, String str) {
        if (str == null || ryaVar != rya.i || !d.contains(str)) {
            return true;
        }
        return false;
    }

    public final int a(tba tbaVar) {
        alog<ParticipantsTable.BindData> b2 = tbaVar.b();
        for (ParticipantsTable.BindData bindData : b2) {
            Object b3 = this.e.b();
            b3.getClass();
            uqg.i((uqg) b3, bindData.O(), bindData.P(), tbaVar.c(), tbaVar.d(), false, false, null, 1008);
        }
        return b2.size();
    }

    public final int b(tbb tbbVar, rya ryaVar) {
        boolean z;
        boolean z2;
        boolean z3;
        ryaVar.getClass();
        akrh e = aktp.e("validateDestinationsThenExecuteUpdate");
        try {
            arrz arrzVar = new arrz();
            arsb arsbVar = new arsb();
            arsbVar.a = arnv.a;
            tba a2 = tbbVar.a();
            boolean z4 = true;
            if (!c.contains(ryaVar)) {
                if (c(ryaVar, tbbVar.a.getAsString("send_destination"))) {
                    tbbVar.ad(ParticipantsTable.c.g);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c(ryaVar, tbbVar.a.getAsString("normalized_destination"))) {
                    tbbVar.ad(ParticipantsTable.c.f);
                    z = z3;
                    z2 = true;
                } else {
                    z = z3;
                    z2 = false;
                }
            } else {
                z = false;
                z2 = false;
            }
            ((agnq) this.f.b()).e("validateDestinationsThenExecuteUpdate", new rvz((Object) tbbVar, (Object) arsbVar, (Object) arrzVar, 4, (short[]) null));
            for (ParticipantsTable.BindData bindData : (Iterable) arsbVar.a) {
                Object b2 = this.e.b();
                b2.getClass();
                uqg.i((uqg) b2, bindData.O(), bindData.P(), a2.c(), a2.d(), z, z2, ryaVar.name(), 112);
            }
            if (!z) {
                if (z2) {
                }
                int i = arrzVar.a;
                armd.i(e, null);
                return i;
            }
            z4 = z2;
            alwl alwlVar = (alwl) b.g();
            alwlVar.V(5, TimeUnit.SECONDS);
            Iterable iterable = (Iterable) arsbVar.a;
            ArrayList arrayList = new ArrayList(aqjn.J(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((ParticipantsTable.BindData) it.next()).M());
            }
            alwlVar.J("Blocked participant destination update: participantIds [%s], blockedSendDestinationUpdate [%s], blockedNormalizedDestinationUpdate [%s]", arrayList, Boolean.valueOf(z), Boolean.valueOf(z4));
            int i2 = arrzVar.a;
            armd.i(e, null);
            return i2;
        } finally {
        }
    }

    @Override // defpackage.xzh
    public final void l(int i) {
        if (i == 80) {
            d.clear();
        }
    }
}
