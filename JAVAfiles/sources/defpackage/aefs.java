package defpackage;

import android.text.TextUtils;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aefs {
    public static final alpt a = alpt.r(abjp.STARTUP, abjp.TELEDOCTOR);
    public final String b;
    public final abjr c;
    public final algw d;
    public final aefp e;
    public boolean f;
    private final alpt g;
    private final Random h;
    private String i;
    private final aegu j = new aegx();

    public aefs(String str, abjr abjrVar, abke abkeVar, aefp aefpVar, alpt alptVar) {
        this.f = true;
        albo.U(!TextUtils.isEmpty(str), "Given String is empty or null");
        albo.U(true, "Sampling rate should not exceed 1.0");
        this.b = str;
        abjrVar.getClass();
        this.c = abjrVar;
        this.d = algw.h(abkeVar);
        this.e = aefpVar;
        alptVar.getClass();
        this.g = alptVar;
        this.f = false;
        this.h = new Random();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(aefu aefuVar) {
        aegh aeghVar;
        long j;
        aeft aeftVar = new aeft(aefuVar);
        aeftVar.g = this;
        aefu a2 = aeftVar.a();
        if (this.g.contains(a2.a)) {
            String str = this.b;
            int i = 0;
            while (true) {
                if (i < a2.b().size()) {
                    aeghVar = (aegh) a2.b().get(i);
                    if (aeghVar.d.equals(str)) {
                        break;
                    }
                    i++;
                } else {
                    aeghVar = null;
                    break;
                }
            }
            if (aeghVar == null) {
                j = 0;
            } else {
                aegi aegiVar = aeghVar.e;
                if (aegiVar == null) {
                    aegiVar = aegi.a;
                }
                j = aegiVar.d;
            }
            if (j <= this.j.f().toEpochMilli()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:26|27|28|29|30|(3:31|32|(1:34))|36|37|38|39|40|41|(12:43|(3:45|46|(1:(2:49|(2:51|(1:53))(1:54))))(1:77)|55|(1:74)(1:57)|58|(1:60)|61|(2:69|70)|63|(1:65)|66|67)|78|55|(0)(0)|58|(0)|61|(0)|63|(0)|66|67) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:26|27|28|(2:29|30)|(15:(3:31|32|(1:34))|40|41|(12:43|(3:45|46|(1:(2:49|(2:51|(1:53))(1:54))))(1:77)|55|(1:74)(1:57)|58|(1:60)|61|(2:69|70)|63|(1:65)|66|67)|78|55|(0)(0)|58|(0)|61|(0)|63|(0)|66|67)|36|37|38|39) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016d, code lost:
    
        if (r0 == 4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d0, code lost:
    
        if (r3 == 4) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0115, code lost:
    
        r0 = new defpackage.aeft(r2);
        r0.d(r19, 6);
        r0 = defpackage.algw.i(r0.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0125, code lost:
    
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01be, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01bf, code lost:
    
        r10 = 6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012d A[Catch: all -> 0x01bb, TryCatch #5 {all -> 0x01bb, blocks: (B:41:0x0126, B:43:0x012d, B:45:0x0143), top: B:40:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0177 A[Catch: all -> 0x01ee, TryCatch #7 {all -> 0x01ee, blocks: (B:24:0x00a6, B:55:0x015f, B:58:0x016f, B:60:0x0177, B:61:0x017a, B:81:0x01c2, B:84:0x01d2, B:86:0x01da, B:87:0x01dd, B:88:0x01ed), top: B:23:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01da A[Catch: all -> 0x01ee, TryCatch #7 {all -> 0x01ee, blocks: (B:24:0x00a6, B:55:0x015f, B:58:0x016f, B:60:0x0177, B:61:0x017a, B:81:0x01c2, B:84:0x01d2, B:86:0x01da, B:87:0x01dd, B:88:0x01ed), top: B:23:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aefr b(defpackage.aefu r17, defpackage.aday r18, defpackage.aefp r19) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aefs.b(aefu, aday, aefp):aefr");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final aefu c(aefu aefuVar, aefp aefpVar, aday adayVar) {
        long j;
        long epochMilli = this.j.f().toEpochMilli();
        int i = aefuVar.a(aefpVar.a).b;
        if (i == 5) {
            j = TimeUnit.SECONDS.toMillis(aefpVar.b);
        } else {
            j = 3600000;
        }
        long j2 = j + epochMilli;
        aozy createBuilder = aegh.a.createBuilder();
        String str = this.b;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        str.getClass();
        ((aegh) apagVar).d = str;
        abjr abjrVar = aefpVar.a;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((aegh) createBuilder.b).c = abjrVar.a();
        aozy createBuilder2 = aegi.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aegi aegiVar = (aegi) createBuilder2.b;
        aegiVar.e = a.ao(i);
        aegiVar.b |= 4;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        aegi aegiVar2 = (aegi) apagVar2;
        aegiVar2.b |= 1;
        aegiVar2.c = epochMilli;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        aegi aegiVar3 = (aegi) createBuilder2.b;
        aegiVar3.b |= 2;
        aegiVar3.d = j2;
        aegi aegiVar4 = (aegi) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aegh aeghVar = (aegh) createBuilder.b;
        aegiVar4.getClass();
        aeghVar.e = aegiVar4;
        aeghVar.b |= 1;
        aegh aeghVar2 = (aegh) createBuilder.s();
        try {
            ((aiwu) adayVar.a).b(new adhe(aeghVar2, 15), adayVar.b).get();
            aeft aeftVar = new aeft(aefuVar);
            alob alobVar = new alob();
            alobVar.j(aeftVar.e);
            alobVar.h(aeghVar2);
            aeftVar.e = alobVar.g();
            return aeftVar.a();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalArgumentException("Update of recent fix data failed", e);
        }
    }
}
