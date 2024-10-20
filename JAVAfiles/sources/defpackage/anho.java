package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anho implements anhn {
    private final anhm a;
    private final alor b;
    private final ahmn c = new ahmn(alpt.r("DE", "TW"));

    public anho(anhm anhmVar) {
        this.a = anhmVar;
        this.b = alor.m(52, new anhv(anhmVar, 0), 54, new anhv(anhmVar, 1));
        alor.l("AR", new albo());
    }

    @Override // defpackage.anhm
    public final int a(String str) {
        String str2;
        aosf aosfVar = ((anhr) this.a).a;
        aorv n = anhr.n(str);
        if (!aosfVar.o(n)) {
            Logger logger = aosf.a;
            Level level = Level.WARNING;
            if (n == null) {
                str2 = "null";
            } else {
                str2 = n.eW;
            }
            logger.logp(level, "com.google.i18n.phonenumbers.PhoneNumberUtil", "getCountryCodeForRegion", a.bW(str2, "Invalid or missing region code (", ") provided."));
            return 0;
        }
        return aosfVar.a(n);
    }

    @Override // defpackage.anhm
    public final String b(int i) {
        return ((anhr) this.a).a.b(i).eW;
    }

    @Override // defpackage.anhm
    public final boolean c(String str, String str2) {
        aosf aosfVar = ((anhr) this.a).a;
        try {
            return aosfVar.n(aosfVar.h(str, anhr.n(str2)));
        } catch (aosb unused) {
            return false;
        }
    }

    @Override // defpackage.anhm
    public final int d(String str, String str2) {
        int q;
        aosf aosfVar = ((anhr) this.a).a;
        try {
            q = aosfVar.r(aosfVar.h(str, aorv.ZZ), str2);
        } catch (aosb e) {
            if (e.a == 1) {
                try {
                    q = aosfVar.r(aosfVar.h(str2, aorv.ZZ), str);
                } catch (aosb e2) {
                    if (e2.a == 1) {
                        try {
                            aozy createBuilder = aosw.a.createBuilder();
                            aozy createBuilder2 = aosw.a.createBuilder();
                            aosfVar.D(str, null, false, false, createBuilder);
                            aosfVar.D(str2, null, false, false, createBuilder2);
                            q = aosfVar.q((aosw) createBuilder.s(), (aosw) createBuilder2.s());
                        } catch (aosb unused) {
                            q = 1;
                            return anhr.o(q);
                        }
                    }
                    q = 1;
                }
            }
            q = 1;
        }
        return anhr.o(q);
    }

    @Override // defpackage.anhm
    public final String e(aodz aodzVar, anhl anhlVar) {
        anhu anhuVar = (anhu) this.b.get(Integer.valueOf(aodzVar.c()));
        if (anhuVar != null && this.a.i(aodzVar)) {
            return anhuVar.a(aodzVar, anhlVar);
        }
        return this.a.e(aodzVar, anhlVar);
    }

    @Override // defpackage.anhm
    public final String f(aodz aodzVar, String str) {
        int indexOf;
        Object obj = aodzVar.a;
        aorv n = anhr.n(str);
        aosw aoswVar = (aosw) obj;
        String str2 = aoswVar.h;
        int length = str2.length();
        aosf aosfVar = ((anhr) this.a).a;
        String str3 = "";
        if (length == 0) {
            if (!aosfVar.o(n)) {
                aosf.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.PhoneNumberUtil", "formatOutOfCountryCallingNumber", hht.b(n, "Trying to format number from invalid region ", ". International formatting applied."));
                return aosfVar.u(aoswVar, 2);
            }
            int i = aoswVar.c;
            String i2 = aosfVar.i(aoswVar);
            if (!aosfVar.l(i)) {
                return i2;
            }
            if (i == 1) {
                if (aosfVar.m(n)) {
                    return "1 ".concat(String.valueOf(aosfVar.u(aoswVar, 3)));
                }
            } else if (i == aosfVar.a(n)) {
                return aosfVar.u(aoswVar, 3);
            }
            aosc e = aosfVar.e(n);
            String str4 = e.p;
            if ((e.b & 1048576) != 0) {
                str3 = e.q;
            } else if (aosf.c.matcher(str4).matches()) {
                str3 = str4;
            }
            aosc f = aosfVar.f(i, aosfVar.b(i));
            StringBuilder sb = new StringBuilder(aosfVar.v(i2, f, 2));
            aosfVar.w(aoswVar, f, 2, sb);
            if (str3.length() > 0) {
                sb.insert(0, " ").insert(0, i).insert(0, " ").insert(0, str3);
            } else {
                aosfVar.x(i, 2, sb);
            }
            return sb.toString();
        }
        int i3 = aoswVar.c;
        if (aosfVar.l(i3)) {
            String B = aosf.B(str2, aosf.b);
            String i4 = aosfVar.i(aoswVar);
            if (i4.length() > 3 && (indexOf = B.indexOf(i4.substring(0, 3))) != -1) {
                B = B.substring(indexOf);
            }
            aosc e2 = aosfVar.e(n);
            if (i3 == 1) {
                if (aosfVar.m(n)) {
                    return "1 ".concat(String.valueOf(B));
                }
            } else if (e2 != null && i3 == aosfVar.a(n)) {
                aosa d = aosfVar.d(e2.v, i4);
                if (d != null) {
                    aozy createBuilder = aosa.a.createBuilder();
                    createBuilder.w(d);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    aosa aosaVar = (aosa) apagVar;
                    aosaVar.b |= 1;
                    aosaVar.c = "(\\d+)(.*)";
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    aosa aosaVar2 = (aosa) createBuilder.b;
                    aosaVar2.b |= 2;
                    aosaVar2.d = "$1$2";
                    return aosfVar.y(B, (aosa) createBuilder.s(), 3);
                }
                return B;
            }
            if (e2 != null) {
                str3 = e2.p;
                if (!aosf.c.matcher(str3).matches()) {
                    str3 = e2.q;
                }
            }
            StringBuilder sb2 = new StringBuilder(B);
            aosfVar.w(aoswVar, aosfVar.f(i3, aosfVar.b(i3)), 2, sb2);
            if (str3.length() > 0) {
                sb2.insert(0, " ").insert(0, i3).insert(0, " ").insert(0, str3);
            } else {
                if (!aosfVar.o(n)) {
                    aosf.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.PhoneNumberUtil", "formatOutOfCountryKeepingAlphaChars", hht.b(n, "Trying to format number from invalid region ", ". International formatting applied."));
                }
                aosfVar.x(i3, 2, sb2);
            }
            return sb2.toString();
        }
        return str2;
    }

    @Override // defpackage.anhm
    public final String g(aodz aodzVar) {
        return ((anhr) this.a).a.i((aosw) aodzVar.a);
    }

    @Override // defpackage.anhm
    public final String h(aodz aodzVar) {
        aorv c = ((anhr) this.a).a.c((aosw) aodzVar.a);
        if (c == null) {
            return null;
        }
        return c.eW;
    }

    @Override // defpackage.anhm
    public final boolean i(aodz aodzVar) {
        return this.a.i(aodzVar);
    }

    @Override // defpackage.anhm
    public final boolean j(aodz aodzVar) {
        aosw aoswVar = (aosw) aodzVar.a;
        Integer valueOf = Integer.valueOf(aoswVar.c);
        aosg aosgVar = ((anhr) this.a).b;
        List<aorv> list = (List) aosgVar.c.get(valueOf);
        if (list == null) {
            list = Collections.emptyList();
        }
        StringBuilder sb = new StringBuilder();
        if (aoswVar.f) {
            char[] cArr = new char[aoswVar.g];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(aoswVar.d);
        int length = sb.toString().length();
        for (aorv aorvVar : list) {
            aosc aoscVar = null;
            if (aorvVar != null) {
                try {
                    aosu aosuVar = aosgVar.b;
                    d.s(aosh.a(aorvVar));
                    aoscVar = ((aoss) ((aosv) aosuVar).b.d(((aosv) aosuVar).a.b(aorvVar))).b(aorvVar);
                } catch (IllegalArgumentException unused) {
                }
            }
            if (aoscVar != null) {
                aose aoseVar = aoscVar.c;
                if (aoseVar == null) {
                    aoseVar = aose.a;
                }
                if (aoseVar.d.contains(Integer.valueOf(length))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.anhm
    public final boolean k(aodz aodzVar) {
        return this.a.k(aodzVar);
    }

    @Override // defpackage.anhm
    public final int l(aodz aodzVar, aodz aodzVar2) {
        anhm anhmVar = this.a;
        Object obj = aodzVar.a;
        return anhr.o(((anhr) anhmVar).a.q((aosw) obj, (aosw) aodzVar2.a));
    }

    @Override // defpackage.anhm
    public final int m(aodz aodzVar) {
        int t = ((anhr) this.a).a.t((aosw) aodzVar.a) - 1;
        if (t == 0) {
            return 1;
        }
        if (t == 1) {
            return 2;
        }
        if (t == 2) {
            return 3;
        }
        if (t == 3) {
            return 4;
        }
        if (t != 4) {
            return 6;
        }
        return 5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r8 = r8;
        r8 = r8;
     */
    @Override // defpackage.anhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aodz o(java.lang.CharSequence r8, java.lang.String r9) {
        /*
            r7 = this;
            if (r9 == 0) goto L37
            if (r8 == 0) goto L37
            ahmn r0 = r7.c
            java.lang.String r1 = defpackage.albo.aq(r9)
            java.lang.Object r0 = r0.a
            alpt r0 = (defpackage.alpt) r0
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L37
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "011"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L37
            int r0 = r8.length()
            r1 = 8
            if (r0 < r1) goto L37
            r0 = 3
            java.lang.String r8 = r8.substring(r0)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "+"
            java.lang.String r8 = r0.concat(r8)
        L37:
            r1 = r8
            anhm r8 = r7.a
            aodz r6 = new aodz     // Catch: defpackage.aosb -> L5a
            anhr r8 = (defpackage.anhr) r8     // Catch: defpackage.aosb -> L5a
            aosf r0 = r8.a     // Catch: defpackage.aosb -> L5a
            aorv r2 = defpackage.anhr.n(r9)     // Catch: defpackage.aosb -> L5a
            aosw r8 = defpackage.aosw.a     // Catch: defpackage.aosb -> L5a
            aozy r8 = r8.createBuilder()     // Catch: defpackage.aosb -> L5a
            r3 = 1
            r4 = 1
            r5 = r8
            r0.D(r1, r2, r3, r4, r5)     // Catch: defpackage.aosb -> L5a
            apag r8 = r8.s()     // Catch: defpackage.aosb -> L5a
            aosw r8 = (defpackage.aosw) r8     // Catch: defpackage.aosb -> L5a
            r6.<init>(r8)     // Catch: defpackage.aosb -> L5a
            return r6
        L5a:
            r8 = move-exception
            anhq r9 = new anhq
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anho.o(java.lang.CharSequence, java.lang.String):aodz");
    }

    @Override // defpackage.anhn
    public final String p(aodz aodzVar, anhl anhlVar) {
        return this.a.e(aodzVar, anhlVar);
    }

    @Override // defpackage.anhn
    public final /* synthetic */ void n() {
    }
}
