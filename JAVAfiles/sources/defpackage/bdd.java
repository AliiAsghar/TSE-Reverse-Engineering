package defpackage;

import defpackage.bcy;
import defpackage.bdd;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface bdd {
    public static final /* synthetic */ int a = 0;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final bdd a = new bdd() { // from class: bcz
            @Override // defpackage.bdd
            public final bcy a(bdq bdqVar) {
                boolean z;
                bcy.a c2 = bdqVar.j().c(bdqVar.j().c);
                bcy.a c3 = bdqVar.g().c(bdqVar.g().d);
                if (bdqVar.e() == bcn.a) {
                    z = true;
                } else {
                    z = false;
                }
                return new bcy(c2, c3, z);
            }
        };
        public static final bdd b = new bdd() { // from class: bda
            @Override // defpackage.bdd
            public final bcy a(bdq bdqVar) {
                return bdd.a.a(bdqVar);
            }
        };
        public static final bdd c = new bdd() { // from class: bdb
            @Override // defpackage.bdd
            public final bcy a(bdq bdqVar) {
                return bde.d(bdqVar, new bcl() { // from class: bdd.a.1
                    @Override // defpackage.bcl
                    public final long a(bcx bcxVar, int i) {
                        String e = bcxVar.e();
                        long a2 = djd.a(aym.b(e, i), aym.a(e, i));
                        long j = djc.a;
                        return a2;
                    }
                });
            }
        };
        public static final bdd d = new bdd() { // from class: bdc
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
            
                if (r3.b == r0.b) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
            
                r0 = r11.f().e();
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
            
                if (r11.b() > 1) goto L72;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
            
                if (r11.k() == null) goto L72;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
            
                if (r0.length() != 0) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00bb, code lost:
            
                r0 = r11.f();
                r3 = r0.e();
                r4 = r0.c;
                r6 = r3.length();
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00cb, code lost:
            
                if (r4 != 0) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
            
                r3 = defpackage.ayn.a(r3, 0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00d5, code lost:
            
                if (r11.m() == false) goto L53;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
            
                return defpackage.bcy.a(r1, defpackage.bde.b(r1.a, r0, r3), null, true, 2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
            
                return defpackage.bcy.a(r1, null, defpackage.bde.b(r1.b, r0, r3), false, 1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00ed, code lost:
            
                if (r4 != r6) goto L59;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
            
                r3 = defpackage.ayn.b(r3, r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00f7, code lost:
            
                if (r11.m() == false) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
            
                return defpackage.bcy.a(r1, defpackage.bde.b(r1.a, r0, r3), null, false, 2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
            
                return defpackage.bcy.a(r1, null, defpackage.bde.b(r1.b, r0, r3), true, 1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x010f, code lost:
            
                r6 = r11.k();
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0113, code lost:
            
                if (r6 == null) goto L64;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0117, code lost:
            
                if (r6.c != true) goto L64;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0119, code lost:
            
                r2 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x011f, code lost:
            
                if ((r11.m() ^ r2) == false) goto L67;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0121, code lost:
            
                r3 = defpackage.ayn.b(r3, r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x012e, code lost:
            
                if (r11.m() == false) goto L71;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
            
                return defpackage.bcy.a(r1, defpackage.bde.b(r1.a, r0, r3), null, r2, 2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
            
                return defpackage.bcy.a(r1, null, defpackage.bde.b(r1.b, r0, r3), r2, 1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x0126, code lost:
            
                r3 = defpackage.ayn.a(r3, r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x009b, code lost:
            
                if (r0.a == false) goto L72;
             */
            @Override // defpackage.bdd
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.bcy a(defpackage.bdq r11) {
                /*
                    Method dump skipped, instructions count: 328
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bdc.a(bdq):bcy");
            }
        };

        public static final bcy a(bdq bdqVar) {
            return bde.d(bdqVar, new bcl() { // from class: bdd.a.2
                @Override // defpackage.bcl
                public final long a(bcx bcxVar, int i) {
                    return bcxVar.f.k(i);
                }
            });
        }
    }

    static {
        bdd bddVar = a.a;
    }

    bcy a(bdq bdqVar);
}
