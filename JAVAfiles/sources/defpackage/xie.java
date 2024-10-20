package defpackage;

import android.net.Uri;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xie {
    public static final xze a = xze.g("BugleDataModel", "ForwardSyncBatchExecutor");
    public final anen b;
    public final ykw c;
    public final xnv d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final xae o;
    public final uhj p;
    public final armf q;
    public final armf r;
    public final armf s;
    private final armf t;
    private final armf u;

    public xie(anen anenVar, ykw ykwVar, xnv xnvVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, xae xaeVar, uhj uhjVar, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15) {
        this.b = anenVar;
        this.c = ykwVar;
        this.d = xnvVar;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.i = armfVar5;
        this.j = armfVar6;
        this.k = armfVar7;
        this.l = armfVar8;
        this.m = armfVar9;
        this.n = armfVar10;
        this.o = xaeVar;
        this.p = uhjVar;
        this.t = armfVar11;
        this.u = armfVar12;
        this.q = armfVar13;
        this.r = armfVar14;
        this.s = armfVar15;
    }

    public static boolean d(boolean z, boolean z2) {
        if (!z2 && !z) {
            return false;
        }
        return true;
    }

    public static void e(wyp wypVar, ArrayList arrayList, ArrayList arrayList2, uj ujVar, long j, long j2) {
        boolean z;
        boolean z2;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= size) {
                break;
            }
            wyh wyhVar = (wyh) arrayList.get(i);
            if (!wyhVar.l) {
                boolean z4 = wyhVar.k;
                if (wyhVar.f >= j) {
                    z3 = false;
                }
                wyhVar.l = d(z4, z3);
            }
            ((ArrayList) wypVar.f).add(wyhVar);
            i++;
        }
        if (j2 > Long.MIN_VALUE) {
            if (arrayList2.size() == ujVar.b()) {
                z = true;
            } else {
                z = false;
            }
            albo.y(z);
            for (int i2 = 0; i2 < ujVar.b(); i2++) {
                wye wyeVar = (wye) arrayList2.get(i2);
                if (!wyeVar.m) {
                    boolean z5 = wyeVar.l;
                    if (wyeVar.g < j) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    wyeVar.m = d(z5, z2);
                }
                if (((Boolean) ((utz) xim.h.get()).e()).booleanValue() && wyeVar.k()) {
                    ((ArrayList) wypVar.d).add(wyeVar);
                } else {
                    ((ArrayList) wypVar.e).add(wyeVar);
                }
            }
        }
    }

    public final Duration a(Instant instant) {
        return Duration.between(instant, this.d.f());
    }

    public final void b(uj ujVar, xae xaeVar) {
        msh mshVar;
        for (int i = 0; i < ujVar.b(); i++) {
            wye wyeVar = (wye) ujVar.e(i);
            if (!wyeVar.j()) {
                xaz a2 = xaeVar.a(wxr.c, wyeVar.i, wyeVar.a);
                xyl.l(a2);
                xyl.k(!a2.b.isEmpty());
                if (a2.b.size() == 1 && ((msh) a2.b.get(0)).D()) {
                    xyo e = a.e();
                    e.H("MMS message has unknown sender from thread data.");
                    e.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, wyeVar.a);
                    e.y("threadId", wyeVar.i);
                    e.q();
                }
                Optional B = ((wzs) this.f.b()).B(a2, wyeVar.a);
                if (!B.isEmpty() && !ytd.h(((msh) B.get()).j(((Boolean) new mst(2).get()).booleanValue()))) {
                    mshVar = (msh) B.get();
                } else {
                    xyo e2 = a.e();
                    e2.H("Could not find sender of incoming MMS, using 'unknown sender'.");
                    e2.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, wyeVar.a);
                    e2.q();
                    mshVar = ((msk) this.u.b()).f();
                    ((mbl) this.t.b()).c("Bugle.Telephony.ForwardSync.NullOrEmptyMmsSender");
                }
            } else {
                mshVar = null;
            }
            wyeVar.r = mshVar;
        }
    }

    public final void c(uj ujVar) {
        akrh e = aktp.e("ForwardSync#setMmsSendersAndEnvelopes");
        for (int i = 0; i < ujVar.b(); i++) {
            try {
                wye wyeVar = (wye) ujVar.e(i);
                if (wyeVar.f() == null) {
                    a.q("MMS message found with null URI: " + wyeVar.a);
                } else {
                    wzs wzsVar = (wzs) this.f.b();
                    Uri f = wyeVar.f();
                    f.getClass();
                    wzr t = wzsVar.t(f);
                    wyeVar.s = t;
                    wyeVar.r = (msh) Collection.EL.stream(t.d).findFirst().orElse(((msk) this.u.b()).f());
                    if (t.d.isEmpty()) {
                        xyo e2 = a.e();
                        e2.H("Could not find sender of incoming MMS, using 'unknown sender'.");
                        e2.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, wyeVar.a);
                        e2.q();
                    }
                }
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        e.close();
    }
}
