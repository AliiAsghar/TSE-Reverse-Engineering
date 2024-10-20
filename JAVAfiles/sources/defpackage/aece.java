package defpackage;

import android.util.StatsEvent;
import android.util.StatsLog;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aece implements aecd {
    private static final alvi a = alvi.m("com/google/android/libraries/abuse/hades/moirai/logging/WestworldTelemetryLogger");

    public static final int e(iak iakVar) {
        if ((iakVar.b & 4) != 0) {
            iae iaeVar = iakVar.e;
            if (iaeVar == null) {
                iaeVar = iae.a;
            }
            if (!iaeVar.c) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static final long f(aecj aecjVar) {
        int compare;
        int compare2;
        int compare3;
        long j = 0;
        if (d.F(aecjVar.b, "")) {
            return 0L;
        }
        try {
            String str = aecjVar.b;
            arro.i(10);
            int length = str.length();
            armw armwVar = null;
            if (length != 0) {
                int i = 0;
                char charAt = str.charAt(0);
                if (arro.a(charAt, 48) < 0) {
                    i = 1;
                    if (length != 1) {
                        if (charAt != '+') {
                        }
                    }
                }
                long j2 = 512409557603043100L;
                while (true) {
                    if (i < length) {
                        int j3 = arro.j(str.charAt(i));
                        if (j3 < 0) {
                            break;
                        }
                        compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
                        if (compare > 0) {
                            if (j2 != 512409557603043100L) {
                                break;
                            }
                            j2 = 1844674407370955161L;
                            compare3 = Long.compare(j ^ Long.MIN_VALUE, 1844674407370955161L ^ Long.MIN_VALUE);
                            if (compare3 > 0) {
                                break;
                            }
                        }
                        long j4 = j * 10;
                        long j5 = j3 + j4;
                        compare2 = Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE);
                        if (compare2 < 0) {
                            break;
                        }
                        i++;
                        j = j5;
                    } else {
                        armwVar = new armw(j);
                        break;
                    }
                }
            }
            if (armwVar != null) {
                return armwVar.a;
            }
            throw new NumberFormatException(a.bW(str, "Invalid number format: '", "'"));
        } catch (NumberFormatException e) {
            ((alvg) ((alvg) a.i()).g(e).h("com/google/android/libraries/abuse/hades/moirai/logging/WestworldTelemetryLogger", "clientRoleForLogging", 164, "WestworldTelemetryLogger.kt")).q("ClientId.role is not a number.");
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x004f, code lost:
    
        if (r0 != 8) goto L34;
     */
    @Override // defpackage.aecd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.aecj r13, defpackage.aozb r14, defpackage.iak r15) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aece.a(aecj, aozb, iak):void");
    }

    @Override // defpackage.aecd
    public final void b(aecj aecjVar, aozb aozbVar, ial ialVar) {
        aecjVar.getClass();
    }

    @Override // defpackage.aecd
    public final void c(aecj aecjVar, long j, aozb aozbVar, int i) {
        int i2;
        if (i != 0) {
            if (i == 1) {
                String str = aecjVar.a;
                long f = f(aecjVar);
                byte[] H = aozbVar.H();
                StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
                newBuilder.setAtomId(211401);
                newBuilder.writeString(str);
                newBuilder.writeLong(f);
                if (H == null) {
                    H = new byte[0];
                }
                newBuilder.writeByteArray(H);
                newBuilder.writeLong(j);
                newBuilder.usePooledBuffer();
                StatsLog.write(newBuilder.build());
                return;
            }
            String str2 = aecjVar.a;
            long f2 = f(aecjVar);
            int i3 = i - 1;
            if (i3 != 13) {
                if (i3 != 14) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
            } else {
                i2 = 3;
            }
            StatsEvent.Builder newBuilder2 = StatsEvent.newBuilder();
            newBuilder2.setAtomId(211402);
            newBuilder2.writeString(str2);
            newBuilder2.writeLong(f2);
            newBuilder2.writeInt(i2 - 1);
            newBuilder2.writeLong(j);
            newBuilder2.usePooledBuffer();
            StatsLog.write(newBuilder2.build());
            return;
        }
        throw null;
    }

    @Override // defpackage.aecd
    public final void d(aecj aecjVar, aedm aedmVar) {
        Object obj;
        long j;
        int i;
        String str;
        aedmVar.getClass();
        Iterator it = aedmVar.c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((aede) obj).d != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        aede aedeVar = (aede) obj;
        long f = f(aecjVar);
        aozb aozbVar = aedmVar.e;
        long j2 = aedmVar.b;
        byte[] H = aozbVar.H();
        long g = arut.g(j2);
        if (aedeVar != null) {
            j = arut.g(aedeVar.b);
        } else {
            j = 0;
        }
        int i2 = 4;
        switch (adcx.Q(aedmVar.a.a) - 1) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 8;
                break;
        }
        int P = adcx.P(aedmVar.a.b) - 1;
        if (P != 0) {
            if (P != 1) {
                if (P != 2) {
                    if (P != 3) {
                        if (P != 4) {
                            i2 = 6;
                        } else {
                            i2 = 5;
                        }
                    }
                } else {
                    i2 = 3;
                }
            } else {
                i2 = 2;
            }
        } else {
            i2 = 7;
        }
        if (aedeVar == null || (str = aedeVar.d) == null) {
            str = "";
        }
        String str2 = aecjVar.a;
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(211400);
        newBuilder.writeString(str2);
        newBuilder.writeLong(f);
        if (H == null) {
            H = new byte[0];
        }
        newBuilder.writeByteArray(H);
        newBuilder.writeLong(g);
        newBuilder.writeLong(j);
        newBuilder.writeInt(i - 1);
        newBuilder.writeInt(i2 - 1);
        newBuilder.writeString(str);
        newBuilder.writeInt(1);
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }
}
