package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fho implements fgu {
    public final eec a;
    private final evf b;
    private final lxs c;
    private final qdq d;

    public fho(evf evfVar, flx flxVar) {
        qdq qdqVar = new qdq(flxVar);
        lxs lxsVar = new lxs((byte[]) null);
        eec eecVar = new eec(null);
        this.b = evfVar;
        this.d = qdqVar;
        this.c = lxsVar;
        this.a = eecVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v8, types: [fdu] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.fgu
    public final /* bridge */ /* synthetic */ fgx b(ere ereVar) {
        byte[] bArr;
        ?? r1;
        dzg.g(ereVar.b);
        dzg.g(ereVar.b);
        eqy eqyVar = ereVar.b.c;
        if (eqyVar == null) {
            r1 = fdu.m;
        } else {
            lxs lxsVar = this.c;
            synchronized (lxsVar.c) {
                if (!Objects.equals(eqyVar, lxsVar.b)) {
                    lxsVar.b = eqyVar;
                    fvq fvqVar = new fvq(new evo());
                    aluq listIterator = eqyVar.c.entrySet().listIterator();
                    while (listIterator.hasNext()) {
                        Map.Entry entry = (Map.Entry) listIterator.next();
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        dzg.g(str);
                        dzg.g(str2);
                        synchronized (fvqVar.b) {
                            fvqVar.b.put(str, str2);
                        }
                    }
                    HashMap hashMap = new HashMap();
                    UUID uuid = eqc.a;
                    UUID uuid2 = eqyVar.a;
                    int[] cy = albo.cy(eqyVar.g);
                    for (int i : cy) {
                        boolean z = true;
                        if (i != 2 && i != 1) {
                            z = false;
                        }
                        d.s(z);
                    }
                    fdn fdnVar = new fdn(uuid2, fvqVar, hashMap, (int[]) cy.clone());
                    byte[] bArr2 = eqyVar.h;
                    if (bArr2 != null) {
                        bArr = Arrays.copyOf(bArr2, bArr2.length);
                    } else {
                        bArr = null;
                    }
                    dzg.d(fdnVar.b.isEmpty());
                    fdnVar.j = bArr;
                    lxsVar.a = fdnVar;
                }
                Object obj = lxsVar.a;
                dzg.g(obj);
                r1 = obj;
            }
        }
        return new fhp(ereVar, this.b, this.d, r1);
    }

    @Override // defpackage.fgu
    public final /* synthetic */ void c(boolean z) {
    }

    @Override // defpackage.fgu
    public final /* synthetic */ void d(frj frjVar) {
    }
}
