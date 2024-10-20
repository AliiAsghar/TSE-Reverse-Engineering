package defpackage;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akjb {
    public final int a;
    public final anen b;
    public final aegu c;
    public final Set d;
    public final String e;
    public final arqv f;
    public final armf g;
    public final Executor h;
    public final alhr i;
    public final armf j;
    public final ancr k;
    public final arqg l;
    public final akbj m;
    public final String n;
    public final arml o;
    public final aiwu p;
    public final aazm q;
    public final atqq r;
    public final ahlp s;

    public akjb(int i, anen anenVar, aegu aeguVar, Set set, armf armfVar, armf armfVar2, atqq atqqVar, ahta ahtaVar, armf armfVar3, ahlp ahlpVar, String str, aazm aazmVar, arqv arqvVar, armf armfVar4, Executor executor, alhr alhrVar, aiwu aiwuVar, armf armfVar5, ancr ancrVar, arqg arqgVar) {
        anenVar.getClass();
        aeguVar.getClass();
        set.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        atqqVar.getClass();
        ahtaVar.getClass();
        armfVar3.getClass();
        ahlpVar.getClass();
        str.getClass();
        this.a = i;
        this.b = anenVar;
        this.c = aeguVar;
        this.d = set;
        this.r = atqqVar;
        this.s = ahlpVar;
        this.e = str;
        this.q = aazmVar;
        this.f = arqvVar;
        this.g = armfVar4;
        this.h = executor;
        this.i = alhrVar;
        this.p = aiwuVar;
        this.j = armfVar5;
        this.k = ancrVar;
        this.l = arqgVar;
        Boolean bool = true;
        bool.getClass();
        this.m = new akbj(new akdj(this, 8), new fcv(aazmVar, 9));
        String b = ahsy.b(str);
        b.getClass();
        this.n = b;
        this.o = armd.a(new agef(this, 19));
    }

    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, apbt] */
    public final alor a(akie akieVar) {
        String str;
        long j;
        apuv G;
        boolean z;
        double d;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object b = this.g.b();
        b.getClass();
        akij akijVar = (akij) b;
        for (akif akifVar : akieVar.f) {
            apuv b2 = akijVar.b(akifVar.e);
            if (b2 != null) {
                int i = akifVar.c;
                if (akec.j(i) == b2.a) {
                    String str3 = akifVar.e;
                    akifVar.getClass();
                    int j2 = akec.j(i);
                    if (j2 != 0) {
                        switch (j2 - 1) {
                            case 0:
                                if (i == 1) {
                                    j = ((Long) akifVar.d).longValue();
                                } else {
                                    j = 0;
                                }
                                G = akec.G(j);
                                break;
                            case 1:
                                if (i == 2) {
                                    z = ((Boolean) akifVar.d).booleanValue();
                                } else {
                                    z = false;
                                }
                                G = akec.E(z);
                                break;
                            case 2:
                                if (i == 3) {
                                    d = ((Double) akifVar.d).doubleValue();
                                } else {
                                    d = 0.0d;
                                }
                                G = akec.F(d);
                                break;
                            case 3:
                                if (i == 4) {
                                    str2 = (String) akifVar.d;
                                } else {
                                    str2 = "";
                                }
                                str2.getClass();
                                G = akec.I(str2);
                                break;
                            case 4:
                                G = new apuv(new agef(akifVar, 20), 5);
                                break;
                            case 5:
                                afzu afzuVar = new afzu(b2, akifVar, 11);
                                ?? r2 = b2.c;
                                r2.getClass();
                                G = akec.H(afzuVar, r2);
                                break;
                            case 6:
                                throw new IllegalStateException("No known flag type");
                            default:
                                throw new armm();
                        }
                        linkedHashMap.put(str3, G);
                    } else {
                        throw null;
                    }
                } else {
                    int j3 = akec.j(i);
                    StringBuilder sb = new StringBuilder("Attempting to set a ");
                    sb.append(b2);
                    sb.append(" type flag with a ");
                    switch (j3) {
                        case 1:
                            str = "LONG_VALUE";
                            break;
                        case 2:
                            str = "BOOLEAN_VALUE";
                            break;
                        case 3:
                            str = "DOUBLE_VALUE";
                            break;
                        case 4:
                            str = "STRING_VALUE";
                            break;
                        case 5:
                            str = "BYTES_VALUE";
                            break;
                        case 6:
                            str = "PROTO_VALUE";
                            break;
                        case 7:
                            str = "FLAGVALUE_NOT_SET";
                            break;
                        default:
                            str = "null";
                            break;
                    }
                    sb.append((Object) str);
                    sb.append(" value");
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        aluq listIterator = akijVar.a().listIterator();
        listIterator.getClass();
        while (listIterator.hasNext()) {
            String str4 = (String) listIterator.next();
            if (!linkedHashMap.containsKey(str4)) {
                apuv b3 = akijVar.b(str4);
                b3.getClass();
                linkedHashMap.put(str4, b3);
            }
        }
        return alzz.bc(linkedHashMap);
    }

    public final boolean b() {
        try {
            if (!this.m.e()) {
                return false;
            }
            if (!((akix) albo.bQ(this.m.c())).c()) {
                return false;
            }
            return true;
        } catch (ExecutionException unused) {
            return false;
        }
    }

    public final void c(aozy aozyVar) {
        if (this.r.h(this.e).b) {
            String str = this.e;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            ahtt ahttVar = (ahtt) aozyVar.b;
            ahtt ahttVar2 = ahtt.a;
            ahttVar.b |= 4;
            ahttVar.e = str;
        }
    }
}
