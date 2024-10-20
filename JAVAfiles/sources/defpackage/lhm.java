package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.util.DesugarDate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhm {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public lhm(gvl gvlVar) {
        gys gysVar = gvlVar.d;
        this.f = gysVar;
        this.k = gvlVar.f;
        String str = gysVar.c;
        this.m = str;
        this.l = gvlVar.h;
        this.b = gvlVar.g;
        this.i = gvlVar.a;
        this.e = gvlVar.b;
        WorkDatabase workDatabase = gvlVar.c;
        this.g = workDatabase;
        this.d = workDatabase.A();
        this.h = workDatabase.u();
        List list = gvlVar.e;
        this.j = list;
        this.c = "Work [ id=" + str + ", tags={ " + aqjn.aK(list, ",", null, null, null, 62) + " } ]";
        this.a = new arxo(null);
    }

    public static final MessageIdType c(MessageId messageId) {
        if (messageId instanceof mvb) {
            MessageIdType c = ((mvb) messageId).c();
            c.getClass();
            return c;
        }
        throw new IllegalStateException("Unsupported message id type.");
    }

    public static final String d(mtb mtbVar, boolean z) {
        alog alogVar = mtbVar.e;
        if (alogVar.size() == 1) {
            if (z) {
                String m = ((ResolvedRecipient) alogVar.get(0)).f().m();
                if (m == null) {
                    return ((ResolvedRecipient) alogVar.get(0)).f().G(true).toString();
                }
                return m;
            }
            return ((ResolvedRecipient) alogVar.get(0)).f().G(true).toString();
        }
        StringBuilder sb = new StringBuilder("[");
        alur it = alogVar.iterator();
        it.getClass();
        while (it.hasNext()) {
            ResolvedRecipient resolvedRecipient = (ResolvedRecipient) it.next();
            sb.append(" ");
            if (z) {
                sb.append(resolvedRecipient.f().m());
            } else {
                sb.append(resolvedRecipient.f().G(true));
            }
        }
        sb.append(" ]");
        return sb.toString();
    }

    public final alog a(alor alorVar, long[] jArr, long[] jArr2) {
        if (jArr2 != null) {
            ArrayList arrayList = new ArrayList(jArr2.length);
            int i = 0;
            int i2 = 0;
            while (i < jArr2.length) {
                long j = jArr2[i];
                int i3 = i2 + 1;
                ResolvedRecipient resolvedRecipient = (ResolvedRecipient) alorVar.get(Long.valueOf(jArr[i2]));
                mte mteVar = null;
                if (resolvedRecipient != null && j > 0) {
                    Instant ofEpochMilli = Instant.ofEpochMilli(j);
                    ofEpochMilli.getClass();
                    mteVar = new mte(this, resolvedRecipient, ofEpochMilli);
                }
                arrayList.add(mteVar);
                i++;
                i2 = i3;
            }
            return alzz.aZ(aqjn.au(aqjn.an(arrayList), new lvh(6)));
        }
        int i4 = alog.d;
        alog alogVar = alsx.a;
        alogVar.getClass();
        return alogVar;
    }

    public final String b(Instant instant) {
        String format = new SimpleDateFormat("MM/d/yy h:mm a", yhx.b((Context) this.k)).format(DesugarDate.from(instant.atZone(ZoneId.systemDefault()).L().p(ZoneId.systemDefault()).truncatedTo(ChronoUnit.MINUTES).toInstant()));
        format.getClass();
        return format;
    }

    public final gyg e() {
        return gvf.J((gys) this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, gxn] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.concurrent.Executor, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.arpe r26) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhm.f(arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gyt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [gyt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [gyt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [gyt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [gyt, java.lang.Object] */
    public final void g(int i) {
        this.d.m(gtk.ENQUEUED, (String) this.m);
        this.d.h((String) this.m, System.currentTimeMillis());
        this.d.g((String) this.m, ((gys) this.f).x);
        this.d.l((String) this.m, -1L);
        this.d.j((String) this.m, i);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [gyt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [gyt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [gyt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [gyt, java.lang.Object] */
    public final void h() {
        this.d.h((String) this.m, System.currentTimeMillis());
        this.d.m(gtk.ENQUEUED, (String) this.m);
        Object obj = this.d;
        gzn gznVar = (gzn) obj;
        gznVar.a.k();
        gkp d = gznVar.g.d();
        d.g(1, (String) this.m);
        try {
            ((gzn) obj).a.l();
            try {
                d.a();
                ((gzn) obj).a.o();
                gznVar.g.f(d);
                this.d.g((String) this.m, ((gys) this.f).x);
                obj = this.d;
                Object obj2 = this.m;
                gzn gznVar2 = (gzn) obj;
                gznVar2.a.k();
                gkp d2 = gznVar2.e.d();
                d2.g(1, (String) obj2);
                try {
                    ((gzn) obj).a.l();
                    try {
                        d2.a();
                        ((gzn) obj).a.o();
                        gznVar2.e.f(d2);
                        this.d.l((String) this.m, -1L);
                    } finally {
                    }
                } catch (Throwable th) {
                    gznVar2.e.f(d2);
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            gznVar.g.f(d);
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [gyt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [gyt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [gyt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [gxq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [gyt, java.lang.Object] */
    public final void i(gvf gvfVar) {
        List D = aqjn.D((String) this.m);
        while (!D.isEmpty()) {
            String str = (String) aqjn.N(D);
            if (this.d.a(str) != gtk.CANCELLED) {
                this.d.m(gtk.FAILED, str);
            }
            D.addAll(this.h.a(str));
        }
        gsi gsiVar = ((gsu) gvfVar).a;
        gsiVar.getClass();
        this.d.g((String) this.m, ((gys) this.f).x);
        this.d.i((String) this.m, gsiVar);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [asai, java.lang.Object] */
    public lhm(arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3, amwf amwfVar, armf armfVar4, znj znjVar, lfl lflVar, mlt mltVar, lxe lxeVar, lim limVar, lie lieVar, lgd lgdVar) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        amwfVar.getClass();
        armfVar4.getClass();
        lflVar.getClass();
        mltVar.getClass();
        lxeVar.getClass();
        limVar.getClass();
        lieVar.getClass();
        lgdVar.getClass();
        this.a = arweVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = amwfVar;
        this.f = armfVar4;
        this.j = znjVar;
        this.k = lflVar;
        this.l = mltVar;
        this.g = lxeVar;
        this.m = limVar;
        this.h = lieVar;
        this.i = new jdn(dyg.f(new ghw(new gcn((int) ((Number) armfVar.b()).longValue(), (int) ((Number) armfVar3.b()).longValue(), false, (int) ((Number) armfVar2.b()).longValue(), 0, 0, 52), new lhb(this, 2)).a, arweVar), lgdVar.c, new igb(this, (arpe) null, 12), 17, null);
    }

    public lhm(Context context, arwe arweVar, yck yckVar, ibi ibiVar, wzs wzsVar, say sayVar, rwj rwjVar, yjy yjyVar, armf armfVar, znj znjVar, osa osaVar, oev oevVar) {
        context.getClass();
        arweVar.getClass();
        yckVar.getClass();
        ibiVar.getClass();
        wzsVar.getClass();
        sayVar.getClass();
        rwjVar.getClass();
        yjyVar.getClass();
        armfVar.getClass();
        this.k = context;
        this.i = arweVar;
        this.f = yckVar;
        this.h = ibiVar;
        this.e = wzsVar;
        this.j = sayVar;
        this.m = rwjVar;
        this.d = yjyVar;
        this.a = armfVar;
        this.b = znjVar;
        this.g = osaVar;
        this.l = oevVar;
        String string = context.getString(R.string.unknown);
        string.getClass();
        this.c = string;
    }
}
